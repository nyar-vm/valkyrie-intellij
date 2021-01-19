package com.github.valkyrie.ide.formatter

import com.github.valkyrie.language.ast.computeSpacing
import com.github.valkyrie.language.ast.isWhitespaceOrEmpty
import com.github.valkyrie.language.psi.ValkyrieBitflagBlock
import com.github.valkyrie.language.psi.ValkyrieBitflagItem
import com.github.valkyrie.language.psi.ValkyrieBlock
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.formatter.FormatterUtil

class FluentFormatBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val indent: Indent?,
    private val wrap: Wrap?,
    private val space: FluentFormatSpace,
) : ASTBlock {
    private val myIsIncomplete: Boolean by lazy {
        node.getChildren(null).any { it.elementType is PsiErrorElement } || FormatterUtil.isIncomplete(node)
    }

    private val mySubBlocks: List<Block> by lazy { buildChildren() }

    private fun buildChildren(): List<Block> {
        return node.getChildren(null)
            .filter { !it.isWhitespaceOrEmpty() }
            .map { childNode ->
                FluentFormatBlock(
                    node = childNode,
                    alignment = null,
                    indent = computeIndent(childNode),
                    wrap = null,
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

    override fun getSpacing(child1: Block?, child2: Block) = computeSpacing(child1, child2, space)

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
        val firstLine = node.firstChildNode == child;
        val lastLine = node.lastChildNode == child;
        val isCornerChild = firstLine || lastLine
        return when (node.psi) {
            is ValkyrieBlock, is ValkyrieBitflagBlock -> when {
                isCornerChild -> Indent.getNoneIndent()
                else -> Indent.getNormalIndent()
            }
            else -> Indent.getNoneIndent()
        }
    }
}