package valkyrie.language.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.parents

/**
 * This interface acts as a tag so that we can identify nodes in
 * the PSI tree that represent symbol scopes. For example, in
 * a simple language like C with globals, functions, arguments,
 * and local blocks you could create a PSI tree with heterogeneous node
 * types such as FileSubtree, FunctionSubtree, BlockSubtree, etc...
 * Each of those should implement this interface.  If you use this
 * mechanism, then the default getContext() mechanism will work; given
 * a node, it looks upward in the PSI tree for a node that
 * implements ScopeNode.
 */
abstract class ValkyrieScopeNode(node: CompositeElement) : ASTWrapperPsiElement(node) {
    override fun getContext(): ValkyrieScopeNode? {
        for (parent in this.parents(false)) {
            if (parent is ValkyrieScopeNode) {
                return parent
            }
        }
        return null;
    }
}
