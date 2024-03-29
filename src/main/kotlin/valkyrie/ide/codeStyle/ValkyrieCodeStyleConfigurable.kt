package valkyrie.ide.codeStyle

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.GenerationCodeStylePanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleSettings
import valkyrie.language.ValkyrieLanguage
import javax.swing.JComponent

class ValkyrieCodeStyleConfigurable(settings: CodeStyleSettings, modelSettings: CodeStyleSettings) :
    CodeStyleAbstractConfigurable(settings, modelSettings, ValkyrieLanguage.displayName) {
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun createComponent(): JComponent? {
        return super.createComponent()
    }

    override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel {
        return ValkyrieCodeStyleMainPanel(currentSettings, settings)
    }
}

private class ValkyrieCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings) :
    TabbedLanguageCodeStylePanel(ValkyrieLanguage, currentSettings, settings) {
    override fun initTabs(settings: CodeStyleSettings) {
//        addIndentOptionsTab(settings)
//        addWrappingAndBracesTab(settings)
        addTab(GenerationCodeStylePanel(settings, ValkyrieLanguage))
    }
}
