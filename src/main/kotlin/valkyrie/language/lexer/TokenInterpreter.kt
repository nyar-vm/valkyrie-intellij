@file:OptIn(ExperimentalStdlibApi::class)

package valkyrie.language.lexer

import valkyrie.language.lexer.LexerContext.Coding
import valkyrie.language.psi.ValkyrieTypes
import com.intellij.psi.TokenType.BAD_CHARACTER
import com.intellij.psi.TokenType.WHITE_SPACE
import com.intellij.psi.tree.IElementType

/**
 * keywords in any case, except for macros
 */
private val KEYWORDS_SP = """(?x)
      \b(namespace|using|as)\b[*!?]?
    | \b(if)\b
    | \b(for|in)\b | \b(while)\b | \b(loop)\b
    | \b(catch)\b
    | \b(is|not)\b
    | \b(type|class)\b
    | \b(variant|bitflag)\b
    | \b(trait|interface|convention|protocol)\b
    | \b(extend|extends|implements|impl)\b
    | \b(let|def)\b
    # | \b(new|object)\b
    | \b(try|catch)\b
    | \b(raise|break|return|resume|yield)\b
    """.toRegex()
private val PUNCTUATIONS = """(?x)\\
    | [.]{2}[<|=]
    | [.]{1,3}
    | [{}\[\]()]
    | [,;$^]
    | @[*!?@]?
    # start with < >
    | >= | /> | ≥ | ⩾ | >{1,3}
    | <= | </ | ≤ | ⩽ | <: | <! | <{1,3}
    # start with :
    | ∷ | :: | :> | :
    # start with -
    | -= | -> | ⟶ | -{1,2}
    # start with ~
    | ~> | ~
    # start with +
    | [+]= | [+]> | [+]{1,2}
    # start with *
    | [*]=?
    # start with / or % or ÷
    | /=?
    | ÷=?
    | %=?
    # start with &
    | &> | &{1,2} | ≻
    | [|]> | [|]{1,2} | ⊁
    | ⊻=? | ⊼=? | ⊽=?
    # start with !
    | != | ≠ | !
    # start with ?
    | [?]
    # start with =
    | => | ⇒
    | === | == | =
    # unicode
    | [∈∊∉⊑⋢⨳∀∁∂∃∄¬±√∛∜⊹⋗]
    | [⟦⟧⁅⁆⟬⟭]
    #
    """.toRegex()
private val COMMENTS = """(?x)
      (?<s1>\#{3,})(?<t1>[^\00]*?)(?<e1>\k<s1>)
    | (?<s2>\#)(?<t2>[^\n\r]*)
    """.toRegex()
private val STRINGS = """(?x)
      (?<s1>"{3,}|'{3,})(?<t1>[^\00]*?)(?<e1>\k<s1>)
    | (?<s2>')(?<t2>[^']*)(?<e2>')
    | (?<s3>")(?<t3>[^"]*)(?<e3>")
    | (?<s4>«)(?<t4>[^»]*)(?<e4>»)
    | (?<s5>‘)(?<t5>[^’]*)(?<e5>’)
    | (?<s6>“)(?<t6>[^”]*)(?<e6>”)
    """.toRegex()
private val NUMBERS = """(?x)
      (?<s1>[1-9]\d*[.]\d+)
    | (?<s2>0[.]\d+)
    | (?<s3>0|[1-9]\d*)
    | (?<s4>0[a-zA-Z][\da-zA-Z]+)
""".toRegex()

@Suppress("MemberVisibilityCanBePrivate")
class TokenInterpreter(val buffer: CharSequence, var startOffset: Int, val endOffset: Int) {
    var stack: MutableList<StackItem> = mutableListOf()

    var contextStack: MutableList<LexerContext> = mutableListOf()

    val context: LexerContext
        get() = contextStack.lastOrNull() ?: Coding

    fun interpreter(): Array<StackItem> {
        while (startOffset < endOffset) {
            if (matchesWhitespace()) continue
            if (codeComment()) continue
            if (codeString()) continue
            if (codeNumber()) continue
            if (codePunctuations()) continue
            if (codeKeywords()) continue
            if (codeIdentifier()) continue
            break
        }
        checkRest()
        return stack.toTypedArray()
    }

    private fun matchesWhitespace(): Boolean {
        val r = tryMatch("\\s+".toRegex()) ?: return false
        pushToken(WHITE_SPACE, r)
        return true
    }

    private fun codeComment(): Boolean {
        val r = tryMatch(COMMENTS) ?: return false
        pushToken(ValkyrieTypes.COMMENT, r)
        return true
    }

    private fun codeString(): Boolean {
        val r = tryMatch(STRINGS) ?: return false
        val slots = arrayOf(
            arrayOf("s1", "t1", "e1"),
            arrayOf("s2", "t2", "e2"),
            arrayOf("s3", "t3", "e3"),
            arrayOf("s4", "t4", "e4"),
            arrayOf("s5", "t5", "e5"),
            arrayOf("s6", "t6", "e6")
        )
        for (slot in slots) {
            val start = r.groups[slot[0]]
            val text = r.groups[slot[1]]
            val end = r.groups[slot[2]]
            if (text != null) {
                pushToken(ValkyrieTypes.STRING_START, start!!)
                pushToken(ValkyrieTypes.STRING_TEXT, text)
                pushToken(ValkyrieTypes.STRING_END, end!!)
                break
            }

        }
        return true
    }

    private fun codeNumber(): Boolean {
        val r = tryMatch(NUMBERS) ?: return false
        when {
            r.groups["s1"] != null -> {
                pushToken(ValkyrieTypes.DECIMAL, r)
            }

            r.groups["s2"] != null -> {
                pushToken(ValkyrieTypes.DECIMAL, r)
            }

            r.groups["s3"] != null -> {
                pushToken(ValkyrieTypes.INTEGER, r)
            }

            r.groups["s4"] != null -> {
                pushToken(ValkyrieTypes.BYTE, r)
            }
        }
        return true
    }

    private fun codeKeywords(): Boolean {
        val r = tryMatch(KEYWORDS_SP) ?: return false
        when (r.value) {
            "namespace", "namespace!", "namespace*", "namespace?" -> pushToken(ValkyrieTypes.KW_NAMESPACE, r)
            "using", "using!", "using*", "using?" -> pushToken(ValkyrieTypes.KW_IMPORT, r)
            "as", "as?", "as!", "as*" -> pushToken(ValkyrieTypes.OP_AS, r)
            "is" -> pushToken(ValkyrieTypes.OP_IS_A, r)
            "in" -> pushToken(ValkyrieTypes.OP_IN, r)
            "not" -> pushToken(ValkyrieTypes.OP_NOT, r)
            "if" -> pushToken(ValkyrieTypes.KW_IF, r)
            "for" -> pushToken(ValkyrieTypes.KW_FOR, r)
            "let" -> pushToken(ValkyrieTypes.KW_LET, r)
            "def" -> pushToken(ValkyrieTypes.KW_DEF, r)
            "try" -> pushToken(ValkyrieTypes.KW_TRY, r)
            "catch" -> pushToken(ValkyrieTypes.KW_CATCH, r)
            "break", "continue", "yield", "return", "resume", "raise" -> pushToken(ValkyrieTypes.KW_CONTROL, r)
            "type", -> pushToken(ValkyrieTypes.KW_TYPE, r)
            "class", "structure", "struct" -> pushToken(ValkyrieTypes.KW_CLASS, r)
            "trait", "interface", "convention", "protocol" -> pushToken(ValkyrieTypes.KW_TRAIT, r)
            "tagged", "enum", "variant" -> pushToken(ValkyrieTypes.KW_TAGGED, r)
            "bitset", "bitflag" -> pushToken(ValkyrieTypes.KW_BITFLAG, r)
            "extend", "extends", "impl", "implements" -> pushToken(ValkyrieTypes.KW_EXTENDS, r)
            else -> pushToken(BAD_CHARACTER, r)
        }
        return true
    }

    private fun codeIdentifier(): Boolean {
        val xid = """(?x)
        [\p{L}_][\p{L}_\d]*
        | (`)((?:[^`\\]|\\.)*)(\1)
        """.toRegex()
        val r = tryMatch(xid) ?: return false
        when {
            r.value == "not" && lastIs() -> {


            }
        }

        pushToken(ValkyrieTypes.SYMBOL_XID, r)
        return true
    }

    private fun codePunctuations(): Boolean {
        val r = tryMatch(PUNCTUATIONS) ?: return false
        when (r.value) {
            "\\" -> pushToken(ValkyrieTypes.KW_ESCAPING, r)
            // DOT
            ":=", "≔" -> pushToken(ValkyrieTypes.OP_BIND, r)
            "->", "⟶" -> pushToken(ValkyrieTypes.OP_ARROW, r)
            "=>", "⇒" -> pushToken(ValkyrieTypes.OP_ARROW2, r)
            "==", "≡" -> pushToken(ValkyrieTypes.OP_EQ, r)
            "=" -> pushToken(ValkyrieTypes.OP_SET, r)
            "." -> {
                pushToken(ValkyrieTypes.DOT, r)
            }

            ":", "∶" -> {
                pushToken(ValkyrieTypes.COLON, r)
            }

            "::", "∷" -> {
                pushToken(ValkyrieTypes.OP_PROPORTION, r)

            }

            "..<", "..=" -> pushToken(ValkyrieTypes.OP_UNTIL, r)
            "...", ".." -> pushToken(ValkyrieTypes.KW_DOTS, r)

            ";" -> {
                pushToken(ValkyrieTypes.SEMICOLON, r)
            }

            "@", "@@", "@!", "@?" -> pushToken(ValkyrieTypes.KW_MACRO, r)
            "," -> pushToken(ValkyrieTypes.COMMA, r)
            // start with +
            "++" -> pushToken(ValkyrieTypes.OP_INC, r)
            "+=" -> pushToken(ValkyrieTypes.OP_ADD_ASSIGN, r)
            "+" -> pushToken(ValkyrieTypes.OP_ADD, r)
            // start with -
            "--" -> pushToken(ValkyrieTypes.OP_DEC, r)
            "-=" -> pushToken(ValkyrieTypes.OP_SUB_ASSIGN, r)
            "-" -> pushToken(ValkyrieTypes.OP_SUB, r)
            // start with *
            "*=" -> pushToken(ValkyrieTypes.OP_MUL_ASSIGN, r)
            "*" -> pushToken(ValkyrieTypes.OP_MUL, r)
            // start with /
            "/=" -> pushToken(ValkyrieTypes.OP_DIV_ASSIGN, r)
            "/" -> pushToken(ValkyrieTypes.OP_DIV, r)
            // start with &
            "&&=" -> pushToken(ValkyrieTypes.OP_AND_ASSIGN, r)
            "&&" -> pushToken(ValkyrieTypes.OP_AND, r)
            "&=" -> pushToken(ValkyrieTypes.OP_AND_ASSIGN, r)
            "&" -> pushToken(ValkyrieTypes.OP_AND, r)
            //
            // start with !
            "!!" -> pushToken(ValkyrieTypes.OP_NE, r)
            "!=" -> pushToken(ValkyrieTypes.OP_NE, r)
            "!" -> pushToken(ValkyrieTypes.OP_NOT, r)
            "|" -> pushToken(ValkyrieTypes.OP_OR, r)
            "^" -> pushToken(ValkyrieTypes.OP_POW, r)
            // start with =
            "∈", "∊" -> {
                pushToken(ValkyrieTypes.OP_IN, r)
            }

            "∉" -> {
                pushToken(ValkyrieTypes.OP_NOT_IN, r)
            }

            "⟦" -> {
                pushToken(ValkyrieTypes.SLICE_L, r)
            }

            "⟧" -> {
                pushToken(ValkyrieTypes.SLICE_R, r)
            }
            // start with >
            ">>>", "⋙" -> pushToken(ValkyrieTypes.OP_GGG, r)
            ">>", "≫" -> pushToken(ValkyrieTypes.OP_GG, r)
            ">=", "≥", "⩾" -> pushToken(ValkyrieTypes.OP_GEQ, r)
            "/>" -> {
                pushToken(ValkyrieTypes.OP_GS, r)
            }

            ">" -> pushToken(ValkyrieTypes.OP_GT, r)
            // start with <
            "<<<", "⋘" -> pushToken(ValkyrieTypes.OP_LLL, r)
            "<<", "≪" -> pushToken(ValkyrieTypes.OP_LL, r)
            "<=", "≤", "⩽" -> pushToken(ValkyrieTypes.OP_LEQ, r)
            "</" -> {
                pushToken(ValkyrieTypes.OP_LS, r)
            }

            "<:", "⊑" -> {
                pushToken(ValkyrieTypes.OP_IS_A, r)
            }

            "<!", "⋢" -> {
                pushToken(ValkyrieTypes.OP_NOT_A, r)
            }

            "<" -> pushToken(ValkyrieTypes.OP_LT, r)
            // surround with ( )
            "(" -> {
                pushToken(ValkyrieTypes.PARENTHESIS_L, r)
            }

            ")" -> {
                pushToken(ValkyrieTypes.PARENTHESIS_R, r)
            }

            "[" -> {
                pushToken(ValkyrieTypes.BRACKET_L, r)
            }

            "]" -> {
                pushToken(ValkyrieTypes.BRACKET_R, r)
            }

            "{" -> {
                pushToken(ValkyrieTypes.BRACE_L, r)
            }

            "}" -> {
                pushToken(ValkyrieTypes.BRACE_R, r)
            }

            "∅", "⤇", "|=>", "⤃", "!=>" -> {
                pushToken(ValkyrieTypes.OP_EMPTY, r)
            }

            else -> pushToken(BAD_CHARACTER, r)
        }
        return true
    }

    private fun checkRest() {
        if (startOffset < endOffset) {
            pushToken(ValkyrieTypes.COMMENT, startOffset, endOffset)
        }
    }

    private fun tryMatch(pattern: Regex): MatchResult? {
        val r = pattern.matchAt(buffer, startOffset)
        return when {
            r == null -> null
            r.value.isEmpty() -> null
            else -> r
        }
    }

    fun pushToken(token: IElementType, startOffset: Int, endOffset: Int): Boolean {
        stack.add(StackItem(token, startOffset, endOffset, context))
        this.startOffset = endOffset + 1
        return true
    }

    fun pushToken(token: IElementType, match: MatchResult): Boolean {
        stack.add(StackItem(token, match.range.first, match.range.last + 1, context))
        startOffset = match.range.last + 1
        return true
    }

    fun pushToken(token: IElementType, match: MatchGroup): Boolean {
        stack.add(StackItem(token, match.range.first, match.range.last + 1, context))
        startOffset = match.range.last + 1
        return true
    }
}

private fun TokenInterpreter.resetToken(token: IElementType) {
    for (item in stack.asReversed()) {
        when {
            item.canSkip() -> continue
            else -> {
                item.token = token
                break
            }
        }
    }
}

private fun TokenInterpreter.resetContext(context: LexerContext) {
    contextStack.removeLastOrNull()
    contextStack.add(context)
}

private fun TokenInterpreter.enterContext(context: LexerContext) {
    contextStack.add(context)
}

private fun TokenInterpreter.endContext() {
    contextStack.removeLastOrNull()
}

private fun TokenInterpreter.contextIs(vararg check: LexerContext): Boolean {
    for (c in check) {
        if (context == c) {
            return true
        }
    }
    return false
}


private fun TokenInterpreter.lastIs(vararg token: IElementType, skipWS: Boolean = true): Boolean {
    for (item in stack.reversed()) {
        if (item.canSkip()) {
            when {
                skipWS -> continue
                else -> return false
            }
        }
        if (item.tokenIs(*token)) return true
    }
    return false
}

private fun TokenInterpreter.lastNot(vararg token: IElementType, skipWS: Boolean = true): Boolean {
    for (item in stack.reversed()) {
        if (item.tokenIs(WHITE_SPACE, ValkyrieTypes.COMMENT)) {
            when {
                skipWS -> continue
                else -> return false
            }
        }
        if (item.tokenIs(*token)) return false
    }
    return true
}