package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.util.ProcessingContext
import valkyrie.ide.project.crate.NamespaceMapping
import valkyrie.language.ValkyrieLanguage
import valkyrie.language.file.ValkyrieIconProvider
import javax.swing.Icon

class CompletionInFileScope : CompletionProvider<CompletionParameters>() {
    var element: PsiElement? = null;
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
        element = parameters.position
        result.addTopMacros()
        keywordSnippet(result)
        addControlFlow(result)

        for (classes in NamespaceMapping.Instance.ClassCache) {

            for (path in classes.value) {
                result.addElement(
                    LookupElementBuilder.create(path)
                        .withIcon(ValkyrieIconProvider.Instance.CLASS)
                        .withLookupString(classes.key)
                )


            }


        }

//        println("已触发: ${parameters.position.text}")
    }

    fun keywordFor(result: CompletionResultSet) {
        result.addKeywordSnippet("for in", "for_in.ft")
        result.addKeywordSnippet("for range", "for_range.ft")
        result.addKeywordSnippet("for kv", "for_kv.ft")
    }

    fun inClassBlock(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {

    }

    fun inClassTuple(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
//        element = parameters.position
        result.addTopMacros()
    }

    fun inMacroBlock(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
//        element = parameters.position
    }

    fun inDefineBlock(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
//        element = parameters.position
        addControlFlow(result)
    }

    private fun CompletionResultSet.addTopMacros() {
        addElement(annotationCall("@derive", "@derive()", 1))
        addElement(macroCall("@type_of", "@type_of[]", 1))
        addElement(macroCall("@name_of", "@name_of[]", 1))
        addElement(macroCall("@name_path_of", "@name_path_of[]", 1))
    }

    private fun macroCall(show: String, replace: String, offset: Int, lookup: Set<String> = setOf()): LookupElementBuilder {
        return buildWithReplace(show, replace, offset, lookup, ValkyrieIconProvider.Instance.MACRO)
    }

    private fun annotationCall(show: String, replace: String, offset: Int, lookup: Set<String> = setOf()): LookupElementBuilder {
        return buildWithReplace(show, replace, offset, lookup, ValkyrieIconProvider.Instance.ANNOTATION)
    }


    private fun keywordSnippet(result: CompletionResultSet) {
        result.addKeywordSnippet("let", "let.ft", setOf("val"))
        result.addKeywordSnippet("let mut", "let_mut.ft", setOf("var", "mut"))

        result.addKeywordSnippet("def", "def.ft", setOf("fn", "fun", "function"))
        result.addKeywordSnippet("method", "method.ft", setOf("def"))
        result.addKeywordSnippet("mutable method", "method_mut.ft", setOf("def", "mutmethod"))
        result.addKeywordSnippet("lambda", "lambda.ft")

        result.addKeywordSnippet("type", "type.ft")

        result.addKeywordSnippet("class", "class.ft", setOf("cass", "struct"))
        result.addKeywordSnippet("tuple class", "class_tuple.ft", setOf("class tuple"))
        result.addKeywordSnippet("generic class", "class_generic.ft", setOf("class generic"))

        result.addKeywordSnippet("tagged", "tagged.ft")
        result.addKeywordSnippet("bitset", "bitset.ft")

        result.addKeywordSnippet("trait", "trait.ft")
        result.addKeywordSnippet("interface", "interface.ft")
        result.addKeywordSnippet("protocol", "protocol.ft")
    }

    private fun addControlFlow(result: CompletionResultSet) {
        result.addKeywordSnippet("if", "if.ft")
        result.addKeywordSnippet("else if", "else_if.ft", setOf("ef"))
        result.addKeywordSnippet("else", "else.ft")
        result.addKeywordSnippet("for in", "for_in.ft")
        result.addKeywordSnippet("for range", "for_range.ft")
        result.addKeywordSnippet("for kv", "for_kv.ft")
    }


    private fun CompletionResultSet.addKeywordSnippet(id: String, file: String, lookup: Set<String> = setOf()) {
        if (element == null) {
            return
        }
        val item = TemplateReplaceElement.snippetFromPath(element!!, id, file)
            .bold()
            .withLookupStrings(lookup)
            .withIcon(ValkyrieIconProvider.Instance.SNIPPET)
        addElement(item)
    }


    companion object {
        val Condition = triggerCondition();
        private fun buildWithReplace(show: String, replace: String, offset: Int, lookup: Set<String>, icon: Icon): LookupElementBuilder {
            return LookupElementBuilder.create(show).bold()
                .withLookupStrings(lookup)
                .withIcon(icon)
                .withInsertHandler { context, _ ->
                    val document = context.document
                    document.replaceString(context.startOffset, context.tailOffset, replace)
                    context.editor.caretModel.moveToOffset(context.tailOffset - offset)
                }
        }

        private fun CompletionResultSet.addLinkedTraitMethod(kind: String, trait: String, args: String = "") {
            val element = LookupElementBuilder.create(kind)
                .withIcon(ValkyrieIconProvider.Instance.FUNCTION)
                .withTypeText(trait, ValkyrieIconProvider.Instance.TRAIT, false)
                .withInsertHandler { context, _ ->
                    val document = context.document
                    document.replaceString(context.startOffset, context.tailOffset, "$kind($args) {}")
                    context.editor.caretModel.moveToOffset(context.tailOffset - 1)
                }
            this.addElement(element)
        }
    }
}


private fun triggerCondition(): PsiElementPattern.Capture<LeafPsiElement> {
    return PlatformPatterns.psiElement(LeafPsiElement::class.java).withLanguage(ValkyrieLanguage);
}