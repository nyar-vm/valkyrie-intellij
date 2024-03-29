package valkyrie.ide.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.formatter.FormatterUtil
import valkyrie.language.ast.ValkyrieBraceBlockNode
import valkyrie.language.ast.isWhitespaceOrEmpty

//import valkyrie.language.psi.ValkyrieTokenType

class FormatBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val indent: Indent?,
    private val wrap: Wrap?,
    private val space: FormatSpace,
) : ASTBlock {
    private val myIsIncomplete: Boolean by lazy {
        node.getChildren(null).any { it.elementType is PsiErrorElement } || FormatterUtil.isIncomplete(node)
    }

    private val mySubBlocks: List<Block> by lazy { buildChildren() }

    private fun buildChildren(): List<Block> {
        return node.getChildren(null).filter { !it.isWhitespaceOrEmpty() }.map { childNode ->
            FormatBlock(
                node = childNode,
                alignment = computeAlignment(childNode),
                indent = computeIndent(childNode),
                wrap = computeWrap(childNode),
                space
            )
        }
    }

    override fun isLeaf(): Boolean = node.firstChildNode == null

    override fun getNode() = node

    override fun getTextRange(): TextRange = node.textRange

    override fun getWrap() = wrap

    override fun getIndent() = indent

    override fun getAlignment() = alignment

    override fun getSpacing(child1: Block?, child2: Block) = space.spacingBuilder.getSpacing(this, child1, child2)

    override fun getSubBlocks(): List<Block> = mySubBlocks

    override fun isIncomplete(): Boolean = myIsIncomplete

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        val indent = when (node.psi) {
            // is FluentAttribute -> Indent.getNormalIndent()
            else -> Indent.getNoneIndent()
        }
        return ChildAttributes(indent, null)
    }

    private fun computeIndent(child: ASTNode): Indent? {
        return if (node.psi is ValkyrieBraceBlockNode) {
            val firstLine = node.firstChildNode == child;
            val lastLine = node.lastChildNode == child;
            val isCornerChild = firstLine || lastLine
            if (isCornerChild) {
                Indent.getNoneIndent()
            } else {
                Indent.getNormalIndent()
            }
        } else {
            Indent.getNoneIndent()
        }

//            node.psi is ValkyrieMatchExpression -> {
//                when (child.psi) {
//                    is ValkyrieMatchCase, is ValkyrieMatchElse, is ValkyrieMatchWith -> Indent.getNoneIndent()
//                    else -> Indent.getNormalIndent()
//                }
//            }
//            node.psi is ValkyrieCaseBlock -> when (child.psi) {
//                is ValkyrieExpression -> Indent.getNormalIndent()
//                else -> Indent.getNoneIndent()
//            }
//            else -> Indent.getNoneIndent()

    }


    private fun computeAlignment(child: ASTNode): Alignment? {
        return when (node.psi) {
//            is ValkyrieBitflagItem -> Alignment.createAlignment(true, Alignment.Anchor.LEFT)
            else -> null
        }
    }

    private fun computeWrap(child: ASTNode): Wrap? {
        return when (node.psi) {
            else -> null
        }
    }
}
