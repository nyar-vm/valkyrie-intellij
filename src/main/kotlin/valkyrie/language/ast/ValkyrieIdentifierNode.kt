package valkyrie.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
import com.intellij.psi.util.PsiTreeUtil
import valkyrie.ide.reference.declaration.ValkyrieClassReference
import valkyrie.ide.reference.declaration.ValkyrieTraitReference

class ValkyrieIdentifierNode(node: ASTNode) : ASTWrapperPsiElement(node), PsiNamedElement {
    override fun getName(): String {
        return text.trim('`')
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    /** Create and return a PsiReference object associated with this ID
     * node. The reference object will be asked to resolve this ref
     * by using the text of this node to identify the appropriate definition
     * site. The definition site is typically a subtree for a function
     * or variable definition whereas this reference is just to this ID
     * leaf node.
     *
     * As the AST factory has no context and cannot create different kinds
     * of PsiNamedElement nodes according to context, every ID node
     * in the tree will be of this type. So, we distinguish references
     * from definitions or other uses by looking at context in this method
     * as we have parent (context) information.
     */
    override fun getReference(): PsiReference? {
        return when (val parent = parent.parentScope) {
            is ValkyrieTraitStatement -> {
                ValkyrieTraitReference(parent, this)
            }
            is ValkyrieClassStatement -> {
                ValkyrieClassReference(parent, this)
            }
            else -> {
                null;
            }
        }
    }

    companion object {
        fun find(node: PsiElement): ValkyrieIdentifierNode? {
            return PsiTreeUtil.getChildOfType(node, ValkyrieIdentifierNode::class.java)
        }
    }
}

