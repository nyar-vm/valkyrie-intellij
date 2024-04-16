package valkyrie.project.facet

import com.intellij.openapi.module.ModuleConfigurationEditor
import com.intellij.ui.dsl.builder.panel
import javax.swing.JComponent

class ValkyrieModuleConfigurationEditor : ModuleConfigurationEditor {
    override fun createComponent(): JComponent? {
        return panel {
            row("ModuleConfigurationEditor") {
                text("???")
            }
        }
    }

    override fun isModified(): Boolean {
        return false
    }

    override fun apply() {

    }

    override fun getDisplayName(): String {
        return "ModuleConfigurationEditor222"
    }

    override fun getHelpTopic(): String? {
        return "getHelpTopic333"
    }


}