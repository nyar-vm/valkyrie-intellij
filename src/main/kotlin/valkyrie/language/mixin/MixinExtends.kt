package valkyrie.language.mixin

import valkyrie.language.ast.DeclareNode
import valkyrie.language.ast.ValkyrieASTBase
import valkyrie.language.ast.ViewableNode
import valkyrie.language.psi_node.ValkyrieExtendsStatementNode
import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import javax.swing.Icon

open class MixinExtends(node: ASTNode) : ViewableNode(node) {
    override fun getOriginalElement(): ValkyrieExtendsStatementNode {
        return this as ValkyrieExtendsStatementNode
    }
    override fun getIcon(flags: Int): Icon = AllIcons.Nodes.EntryPoints
    override fun getNavigationElement(): PsiElement {
        return this.originalElement
    }
}
