package valkyrie.ide.runner

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.psi.PsiElement
import valkyrie.language.ValkyrieBundle

class RunNamespaceGroup(element: PsiElement) : ActionGroup() {
    init {
//        if (element !is ValkyrieNamespaceStatementNode) {
//            throw IllegalArgumentException("element must be a ValkyrieNamespaceStatementNode")
//        }
        templatePresentation.icon = AllIcons.RunConfigurations.TestState.Run_run
        templatePresentation.text = ValkyrieBundle.message("action.run.namespace.group.name")
        templatePresentation.description = ValkyrieBundle.message("action.run.namespace.group.help")
    }

    override fun actionPerformed(event: AnActionEvent) {

    }

    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
        return arrayOf()
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return super.getActionUpdateThread()
    }

    override fun update(event: AnActionEvent) {
        val currentProject = event.project
        event.presentation.isEnabledAndVisible = currentProject != null
    }
}