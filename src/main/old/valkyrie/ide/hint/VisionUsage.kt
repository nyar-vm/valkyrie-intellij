package valkyrie.ide.hint

//import valkyrie.language.psi_node.ValkyrieDefineStatementNode
//import valkyrie.language.psi_node.ValkyrieExtendsStatementNode
//import valkyrie.language.psi_node.ValkyrieUnionStatementNode
import com.intellij.codeInsight.CodeInsightBundle
import com.intellij.codeInsight.codeVision.CodeVisionEntry
import com.intellij.codeInsight.codeVision.settings.PlatformCodeVisionIds
import com.intellij.psi.PsiElement
import valkyrie.language.ast.ValkyrieTraitStatement
import valkyrie.language.ast.classes.ValkyrieClassFieldNode
import valkyrie.language.ast.classes.ValkyrieClassMethodNode
import valkyrie.language.ast.classes.ValkyrieClassStatement


class VisionUsage : ValkyrieCodeVision() {
    override val groupId: String = PlatformCodeVisionIds.USAGES.key
    override val id: String = "VisionReferences"
    override val name: String = CodeInsightBundle.message("settings.inlay.hints.usages")

    /// Removed, it is recommended to click on the mark on the left to jump to find usages
    override fun getCodeVision(element: PsiElement): CodeVisionEntry? {
        return when (element) {
            is ValkyrieClassStatement, is ValkyrieTraitStatement -> {
                null
            }

            is ValkyrieClassMethodNode, is ValkyrieClassFieldNode -> {
                null
            }


            else -> null
        }
    }


}
