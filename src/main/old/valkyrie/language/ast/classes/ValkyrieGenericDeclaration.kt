package valkyrie.language.ast.classes

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.formatter.ValkyrieRewriter
import valkyrie.language.psi.ValkyrieRewritableElement

class ValkyrieGenericDeclaration(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieRewritableElement {
    override fun on_rewrite(e: ValkyrieRewriter) {
        e.replace_generic(this)
    }
}
