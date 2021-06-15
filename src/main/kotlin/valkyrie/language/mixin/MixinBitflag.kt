package valkyrie.language.mixin

import valkyrie.ide.view.ValkyrieViewElement
import valkyrie.language.ast.DeclareNode
import valkyrie.language.ast.ValkyrieASTBase
import valkyrie.language.psi_node.ValkyrieBitflagStatementNode
import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import javax.swing.Icon

open class MixinBitflag(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): ValkyrieBitflagStatementNode {
        return this as ValkyrieBitflagStatementNode
    }

    override fun getNameIdentifier(): ValkyrieASTBase {
        TODO("Not yet implemented")
    }

    override fun getIcon(flags: Int): Icon = AllIcons.Nodes.Enum
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


}
