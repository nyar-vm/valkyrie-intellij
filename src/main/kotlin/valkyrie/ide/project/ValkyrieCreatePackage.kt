package valkyrie.ide.project

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import valkyrie.ide.project.crate.ValkyrieModuleType
//import valkyrie.ide.project.crate.ValkyrieModuleType
import javax.swing.JComponent
import javax.swing.JLabel

// TODO: https://plugins.jetbrains.com/docs/intellij/framework.html#registering-framework
class ValkyrieCreatePackage : ModuleBuilder() {
    override fun getModuleType(): ValkyrieModuleType {
        return ValkyrieModuleType()
    }

    override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {
        super.setupRootModel(modifiableRootModel)
    }

    override fun createProject(name: String?, path: String?): Project? {
        return super.createProject(name, path)
    }

    override fun createWizardSteps(wizardContext: WizardContext, modulesProvider: ModulesProvider): Array<ModuleWizardStep> {
        return arrayOf(ValkyrieModuleWizardSteps())
    }
}


private class ValkyrieModuleWizardSteps : ModuleWizardStep() {
    override fun getComponent(): JComponent {
        return JLabel("Put your content here")
    }

    override fun updateDataModel() {

    }
}