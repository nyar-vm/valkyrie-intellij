package valkyrie.ide.project.crate

import com.intellij.ide.util.projectWizard.ModuleNameGenerator
import com.intellij.ui.dsl.builder.panel
import java.util.function.Consumer
import javax.swing.JComponent

@Suppress("UnstableApiUsage")
class ValkyrieNameGenerator : ModuleNameGenerator {
    override fun getUi(place: String?, nameSetter: Consumer<in String>): JComponent? {
        return panel {
            row {
                label("Module Name:")
                textField()
            }
        }
    }
}