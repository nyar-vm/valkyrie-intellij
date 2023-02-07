package valkyrie.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.formatting.Indent
import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.language.psi.ValkyrieIndentElement

class ValkyrieCallMacro(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieIndentElement {
    override fun on_indent(child: ASTNode): Indent {
        TODO("Not yet implemented")
    }

}


