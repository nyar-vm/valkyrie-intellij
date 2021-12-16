package valkyrie.language.ast

import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree
import org.antlr.intellij.adaptor.psi.ScopeNode
import valkyrie.language.ValkyrieLanguage
import valkyrie.language.file.ValkyrieIconProvider
import valkyrie.language.psi.ValkyrieGenericDefine
import javax.swing.Icon

class ValkyrieTraitDeclaration(node: ASTNode, type: IElementType) : IdentifierDefSubtree(node, type), ScopeNode {
    override fun getNameIdentifier(): PsiElement? {
        return findChildByClass(ValkyrieGenericDefine::class.java)
    }

    override fun getIcon(flags: Int): Icon {
        return ValkyrieIconProvider.TRAIT
    }

    override fun getPresentation(): ItemPresentation {
        return object : ItemPresentation {
            override fun getPresentableText(): String {
                return "trait getPresentableText"
            }

            override fun getLocationString(): String {
                return "trait getLocationString"
            }

            override fun getIcon(unused: Boolean): Icon {
                return getIcon(0)
            }
        }
    }

    override fun resolve(element: PsiNamedElement?): PsiElement? {
        return SymtabUtils.resolve(this, ValkyrieLanguage, element, "/script/trait/ID");
    }
}

