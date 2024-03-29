package valkyrie.ide.actions

import com.intellij.codeInspection.HintAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import valkyrie.language.ast.ValkyrieLetStatement
//import valkyrie.language.psi.ValkyrieTypes
import valkyrie.language.psi.childrenWithLeaves
//import valkyrie.language.psi_node.ValkyrieLetStatementNode

class InferLetType(private val element: ValkyrieLetStatement, private val action: Boolean) : HintAction {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getText(): String {
        return if (action) {
            "Infer let type"
        } else {
            "Remove let type"
        }
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?): Boolean {
        return true
    }

    override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {
        if (action) {

        } else {
            var shouldDelete = false;
            for (element in element.childrenWithLeaves) {
                when (element.elementType) {
//                    ValkyrieTypes.COLON -> {
//                        shouldDelete = true
//                    }
//                    ValkyrieTypes.OP_SET -> {
//                        shouldDelete = false
//                    }
//                    ValkyrieTypes.SEMICOLON -> {
//                        shouldDelete = false
//                    }
                }
                if (shouldDelete) {
                    element.delete()
                }
            }
        }
    }

    override fun showHint(editor: Editor): Boolean {
        return true
    }
}

