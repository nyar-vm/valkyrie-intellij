package valkyrie.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.ValkyrieHighlightColor
import valkyrie.language.antlr.ValkyrieParser
import valkyrie.language.psi.ValkyrieHighlightElement

class ValkyrieLambdaSlot : ASTWrapperPsiElement, ValkyrieHighlightElement {
    private val _num = ValkyrieParser.getChildOfType<ValkyrieNumberNode>(this);
    constructor(node: CompositeElement) : super(node) {

    }
    override fun on_highlight(e: NodeHighlighter) {
        if (_num != null && _num.text == "0") {
            e.register(this, ValkyrieHighlightColor.KEYWORD)
        } else {
            e.register(this, ValkyrieHighlightColor.SYM_ARG)
        }
    }
}