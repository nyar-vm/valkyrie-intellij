package valkyrie.ide.reference.declaration

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import valkyrie.language.ast.ValkyrieIdentifierNode

abstract class ValkyrieReference(element: ValkyrieIdentifierNode, private val definition: PsiElement) :
    PsiReferenceBase<ValkyrieIdentifierNode>(element, TextRange(0, element.text.length)) {

    override fun getVariants(): Array<Any> {
        return arrayOf()
    }

    /** Change the REFERENCE's ID node (not the targeted def's ID node)
     * to reflect a rename.
     *
     * Without this method, we get an error ("Cannot find manipulator...").
     *
     * getElement() refers to the identifier node that references the definition.
     */

    override fun handleElementRename(newElementName: String): PsiElement {
        return myElement!!.setName(newElementName)
    }

    /** Resolve a reference to the definition subtree (subclass of
     * IdentifierDefSubtree), do not resolve to the ID child of that
     * definition subtree root.
     */
    override fun resolve(): PsiElement? {
        return definition
    }
}