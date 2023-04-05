package valkyrie.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import yggdrasil.psi.node.ValkyrieDeclareClassNode
import yggdrasil.psi.node.ValkyrieDeclareUnionNode
import yggdrasil.psi.node.ValkyrieIdentifierNode

class NamepathChecker : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is ValkyrieDeclareClassNode -> checkValidClassName(element, holder)
            is ValkyrieDeclareUnionNode -> checkValidUnionName(element, holder)
        }
    }

    // element.text can't start with lowercase
    private fun checkValidClassName(element: ValkyrieDeclareClassNode, holder: AnnotationHolder) {
        val id = element.nameIdentifier ?: return;
        checkNeedEscape(id, holder)
        checkCamelCase(id, holder)
    }

    private fun checkValidUnionName(element: ValkyrieDeclareUnionNode, holder: AnnotationHolder) {
        element.nameIdentifier?.let { checkNeedEscape(it, holder) }
        element.nameIdentifier?.let { checkCamelCase(it, holder) }
    }

    private fun checkCamelCase(element: ValkyrieIdentifierNode, holder: AnnotationHolder) {

//        val name = element.name;
//        val fixer = CamelCaseFixer();
//        if (name[0].isLowerCase()) {
//            holder.newAnnotation(HighlightSeverity.WEAK_WARNING, "Name must start with uppercase")
//                .range(element.textRange)
//                .create()
    }
}

private fun checkNeedEscape(element: ValkyrieIdentifierNode, holder: AnnotationHolder) {
    val rawName = element.text;
    if (!rawName.startsWith('`')) return
    // if raw name contains non xid_continue, then need escape
//        if (rawName.substring(1, rawName.length - 1).any { !it.isJavaIdentifierPart() }) {
//            holder.newAnnotation(HighlightSeverity.INFORMATION, "Need escape")
//                .range(element.textRange)
//                .create()
//        }
}

