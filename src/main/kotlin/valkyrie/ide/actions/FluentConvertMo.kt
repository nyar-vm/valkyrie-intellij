package valkyrie.ide.actions

import com.intellij.ide.actions.CreateFileAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import valkyrie.language.ValkyrieBundle
import valkyrie.language.file.ValkyrieIconProvider

class FluentConvertMo : CreateFileAction(name, description, ValkyrieIconProvider.Instance.Valkyrie) {
    companion object {
        private val name = ValkyrieBundle.message("action.convert_prop")
        private val description = ValkyrieBundle.message("action.convert_prop.description")
    }

    private var sourceFile: PsiFile? = null;

    override fun update(event: AnActionEvent) {
        sourceFile = LangDataKeys.PSI_FILE.getData(event.dataContext)
        super.update(event)
    }

    override fun create(newName: String, directory: PsiDirectory): Array<PsiElement> {
        return super.create(newName, directory)
    }
}
