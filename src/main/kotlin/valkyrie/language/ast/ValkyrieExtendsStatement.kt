package valkyrie.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.impl.source.tree.CompositeElement
import org.antlr.intellij.adaptor.psi.ScopeNode
import valkyrie.ide.view.NamepathPresentation
import valkyrie.language.file.ValkyrieIconProvider
import javax.swing.Icon

class ValkyrieExtendsStatement(node: CompositeElement) : ASTWrapperPsiElement(node), ScopeNode {
    private val _identifier by lazy { ValkyrieNamepathNode.find(this)!! }

    override fun getName(): String {
        return _identifier.name
    }

    override fun getIcon(flags: Int): Icon {
        return ValkyrieIconProvider.Instance.TRAIT
    }

    override fun getPresentation(): ItemPresentation {
        return NamepathPresentation(_identifier, getIcon(0))
    }

    override fun getContext(): ScopeNode? {
        return parentScope;
    }

    override fun resolve(element: PsiNamedElement?): PsiElement? {
        TODO("Not yet implemented")
    }
}