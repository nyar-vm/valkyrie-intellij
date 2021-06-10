package com.github.valkyrie.language.mixin

import com.github.valkyrie.language.ast.ValkyrieASTBase
import com.github.valkyrie.language.psi.ValkyrieTypes
import com.github.valkyrie.language.psi_node.ValkyrieIdentifierNode
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

open class MixinNamepath(node: ASTNode) : ValkyrieASTBase(node) {
    override fun getNavigationElement(): ValkyrieIdentifierNode {
        return identifierList().last()
    }

    override fun getName(): String? {
        return children
            .filterIsInstance<ValkyrieIdentifierNode>()
            .joinToString("∷") { it.name }
    }

    fun identifierList(): List<ValkyrieIdentifierNode> = children.filterIsInstance<ValkyrieIdentifierNode>()

    fun delimiterList(): List<PsiElement> {
        return this.children.filter {
            it.elementType == ValkyrieTypes.DOT || it.elementType == ValkyrieTypes.OP_PROPORTION
        }
    }
}

