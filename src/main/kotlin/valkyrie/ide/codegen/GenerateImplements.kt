package valkyrie.ide.codegen

//import valkyrie.language.psi_node.ValkyrieClassStatementNode
import com.intellij.codeInsight.intention.FileModifier
import com.intellij.lang.LanguageCodeInsightActionHandler
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import valkyrie.language.psi.caretElement
import valkyrie.language.psi.valkyrieContext
import valkyrie.language.psi_node.ValkyrieExtendsStatementNode
import valkyrie.language.psi_node.ValkyrieUnionStatementNode

class GenerateImplements : LanguageCodeInsightActionHandler {
    override fun isValidFor(editor: Editor?, file: PsiFile?) = when (file.caretElement(editor).valkyrieContext()) {
//        is ValkyrieClassStatementNode -> true
        is ValkyrieUnionStatementNode -> true
        is ValkyrieExtendsStatementNode -> true
        else -> false
    }
    override fun invoke(project: Project, editor: Editor, file: PsiFile) {
        println("ValkyrieImplementMark.invoke($editor, $file)")
    }



    override fun startInWriteAction(): Boolean {
        return super.startInWriteAction()
    }

    override fun getElementToMakeWritable(currentFile: PsiFile): PsiElement? {
        return super.getElementToMakeWritable(currentFile)
    }

    override fun getFileModifierForPreview(target: PsiFile): FileModifier? {
        return super.getFileModifierForPreview(target)
    }
}