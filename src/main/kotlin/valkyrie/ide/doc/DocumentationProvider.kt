package valkyrie.ide.doc

import valkyrie.ide.file.ValkyrieFileNode
import valkyrie.language.ast.DocumentNode
import valkyrie.language.psi.ValkyrieTypes
import valkyrie.language.psi.ValkyrieTypes.*
import com.intellij.lang.documentation.DocumentationProvider
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiDocCommentBase
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import java.util.function.Consumer


class DocumentationProvider : DocumentationProvider {
    override fun generateDoc(element: PsiElement?, originalElement: PsiElement?): String? {
        return element?.let { DocumentationRenderer(it, originalElement).onHover() }
    }

    override fun findDocComment(file: PsiFile, range: TextRange): PsiDocCommentBase? {
        println("findDocComment $file $range")
        return super.findDocComment(file, range)
    }

    override fun collectDocComments(file: PsiFile, sink: Consumer<in PsiDocCommentBase>) {
        if (file !is ValkyrieFileNode) return
        for (leaf in PsiTreeUtil.findChildrenOfType(file, PsiComment::class.java)) {
            DocumentNode.tryBuild(leaf).let {
                if (it != null) {
                    sink.accept(it)
                }
            }
        }
    }

    override fun generateRenderedDoc(comment: PsiDocCommentBase): String? {
        return when (comment) {
            is DocumentNode -> comment.render()
            else -> super.generateRenderedDoc(comment)
        }
    }

    // 按住 Ctrl 后悬浮
    override fun getQuickNavigateInfo(element: PsiElement?, originalElement: PsiElement?): String? {
        return originalElement?.let { this.generateHoverDoc(it, originalElement) }
    }

    // 悬浮
    override fun generateHoverDoc(element: PsiElement, originalElement: PsiElement?): String {
        return DocumentationRenderer(element, originalElement).onHover()
    }

    override fun getCustomDocumentationElement(editor: Editor, file: PsiFile, contextElement: PsiElement?, targetOffset: Int): PsiElement? {
        return when (contextElement.elementType) {
            KW_CLASS, KW_DEF -> contextElement
            OP_ADD, OP_ADD_ASSIGN, OP_ARROW, OP_ARROW2 -> contextElement
            TokenType.WHITE_SPACE, COMMENT -> null
            else -> null
        }
    }
}