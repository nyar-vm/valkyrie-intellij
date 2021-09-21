package valkyrie.ide.hint

import com.intellij.codeInsight.codeVision.CodeVisionProvider
import com.intellij.codeInsight.hints.VcsCodeVisionLanguageContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import valkyrie.language.psi_node.*
import java.awt.event.MouseEvent

@Suppress("UnstableApiUsage")
class AuthorAbove : VcsCodeVisionLanguageContext {
    /// 额外的点击事件
    /// 本身会打开 Git Blame
    override fun handleClick(mouseEvent: MouseEvent, editor: Editor, element: PsiElement) {

    }

    override fun isAccepted(element: PsiElement) = when (element) {
        is ValkyrieClassStatementNode,
        is ValkyrieUnionStatementNode,
        is ValkyrieTraitStatementNode,
        is ValkyrieExtendsStatementNode,
        is ValkyrieMacroStatementNode,
        is ValkyrieDefineStatementNode,
        -> true

        else -> false
    }

    override fun isCustomFileAccepted(file: PsiFile): Boolean {
        return false
    }
}


