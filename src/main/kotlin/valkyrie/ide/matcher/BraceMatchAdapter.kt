package valkyrie.ide.matcher

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType
import valkyrie.language.ValkyrieLanguage
import valkyrie.language.file.ValkyrieFileType

class BraceMatchAdapter : PairedBraceMatcherAdapter(ValkyrieBracketMatch(), ValkyrieLanguage) {
    override fun isLBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean {
        return isBrace(iterator, fileText, fileType, true)
    }

    override fun isRBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean {
        return isBrace(iterator, fileText, fileType, false)
    }

    private fun isBrace(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType, left: Boolean): Boolean {
        if (fileType != ValkyrieFileType) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
