package valkyrie.language.ast.unions

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.formatter.ValkyrieRewriter
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.ValkyrieHighlightColor
import valkyrie.ide.view.IdentifierPresentation
import valkyrie.language.ast.ValkyrieIdentifierNode
import valkyrie.language.file.ValkyrieIconProvider
import valkyrie.language.psi.ValkyrieHighlightElement
import valkyrie.language.psi.ValkyrieRewritableElement
import valkyrie.language.psi.ValkyrieScopeNode
import javax.swing.Icon

class ValkyrieUnionStatementItem(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieHighlightElement,
    ValkyrieRewritableElement {
    private val _identifier by lazy { ValkyrieIdentifierNode.find(this)!! }
    override fun getName(): String {
        return _identifier.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): ValkyrieIdentifierNode {
        return _identifier
    }

    override fun getBaseIcon(): Icon {
        return ValkyrieIconProvider.Instance.VARIANT
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(_identifier, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, ValkyrieHighlightColor.SYM_VARIANT)
    }

    override fun on_rewrite(e: ValkyrieRewriter) {
        e.fixDelimiter(this, e.settings.variant_trailing)
    }
}