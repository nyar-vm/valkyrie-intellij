package valkyrie.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiNamedElement
import org.antlr.intellij.adaptor.psi.ScopeNode
import valkyrie.ide.view.IdentifierPresentation
import valkyrie.language.antlr.parentScope
import valkyrie.language.file.ValkyrieIconProvider
import valkyrie.language.psi.ValkyrieScopeNode
import javax.swing.Icon


class ValkyrieClassMethodNode(node: ASTNode) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner, ValkyrieScopeNode {
    val method by lazy { ValkyrieModifiedNode.findIdentifier(this)!! }
    val modifiers by lazy { ValkyrieModifiedNode.findModifiers(this) };
    override fun getName(): String {
        return method.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getIcon(flags: Int): Icon {
        return ValkyrieIconProvider.Instance.Method
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(method, this.getIcon(0))
    }

    override fun getNameIdentifier(): PsiElement {
        return method
    }
}