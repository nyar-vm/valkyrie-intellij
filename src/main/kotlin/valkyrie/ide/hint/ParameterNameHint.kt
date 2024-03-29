package valkyrie.ide.hint

import com.intellij.codeInsight.hints.HintInfo
import com.intellij.codeInsight.hints.InlayInfo
import com.intellij.codeInsight.hints.InlayParameterHintsProvider
import com.intellij.codeInsight.hints.Option
import com.intellij.psi.PsiElement
import valkyrie.language.ValkyrieBundle


@Suppress("UnstableApiUsage")
class ParameterNameHint : InlayParameterHintsProvider {
    var context = ""

    override fun getHintInfo(element: PsiElement): HintInfo? {
        return HintInfo.MethodInfo("aaa", listOf("bbb"))
    }

    /// 函数里面的东西
    override fun getParameterHints(element: PsiElement): MutableList<InlayInfo> {
        return when (element) {
//            is ValkyrieCallSuffixNode -> element.resolveParameterName(element)
            else -> mutableListOf()
        }
    }

    /// getParameterHints 的后处理
    override fun getInlayPresentation(inlayText: String): String {
        return "$inlayText:"
    }


    override fun getMainCheckboxText(): String {
        return "getMainCheckboxText"
    }

    /// 显示在
    /// Editor > Inlay Hints > Parameter Names
    override fun getDescription(): String {
        return "Shows parameter names at function/macro call sites."
    }

    /// 显示在
    /// Editor > Inlay Hints > Parameter Names
    override fun getDefaultBlackList(): Set<String> = setOf(
        "derive", "matches", "Some",
        /* Gradle DSL especially annoying hints */
        "org.gradle.api.Project.hasProperty(propertyName)",
        "org.gradle.api.Project.findProperty(propertyName)",
    )

    /// 显示在
    /// Editor > Inlay Hints > Parameter Names > Valkyrie
    override fun getSupportedOptions(): MutableList<Option> {
        return mutableListOf(
            Option("getSupportedOptions1", ValkyrieBundle.messagePointer("color.token.null"), true),
            Option("getSupportedOptions2", ValkyrieBundle.messagePointer("color.token.boolean"), true)
        )
    }

//    private fun ValkyrieCallSuffixNode.resolveParameterName(caller: PsiElement): MutableList<InlayInfo> {
//        val out = mutableListOf<InlayInfo>();
//        var id = 0;
//        for (i in this.expressionList) {
//            val namepath = i.termList.first().atom.namepath;
//            if (namepath != null) {
//                out.add(InlayInfo(namepath.lastChild.text, i.startOffset))
//            }
//            else {
//                out.add(InlayInfo("${'a' + id}", i.startOffset))
//            }
//
//            id += 1
//        }
//        return out
//    }
}
