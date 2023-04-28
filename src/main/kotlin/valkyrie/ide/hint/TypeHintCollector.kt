package valkyrie.ide.hint

import com.intellij.codeInsight.hints.InlayHintsCollector
import com.intellij.codeInsight.hints.InlayHintsSink
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import valkyrie.ide.hint.TypeHintProvider.InlayTypeSetting

@Suppress("UnstableApiUsage")
class TypeHintCollector(val settings: InlayTypeSetting) : InlayHintsCollector {
    override fun collect(element: PsiElement, editor: Editor, sink: InlayHintsSink): Boolean {
        println("TypeInlayHintCollector: ${element}")
        val visitor = TypeHintVisitor(sink, editor, settings)
        element.accept(visitor)
        return true
    }
}

