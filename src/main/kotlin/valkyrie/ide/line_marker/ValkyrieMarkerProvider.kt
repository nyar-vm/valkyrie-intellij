package valkyrie.ide.line_marker

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.psi.PsiElement
import valkyrie.psi.node.ValkyrieDeclareClassNode
import valkyrie.psi.node.ValkyrieDeclareTraitNode
import valkyrie.psi.node.ValkyrieDeclareUnionNode

class ValkyrieMarkerProvider : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        return null
    }

    override fun collectSlowLineMarkers(elements: MutableList<out PsiElement>, result: MutableCollection<in LineMarkerInfo<*>>) {
        for (element in elements) {
            when (element) {
                is ValkyrieDeclareClassNode -> element.addLineMarkerInfo(result)
                is ValkyrieDeclareUnionNode -> element.addLineMarkerInfo(result)
                is ValkyrieDeclareTraitNode -> element.addLineMarkerInfo(result)
            }
        }
    }

    private fun ValkyrieDeclareClassNode.addLineMarkerInfo(result: MutableCollection<in LineMarkerInfo<*>>) {
        if (this.superClasses.isEmpty()) {
            ValkyrieMarkClass.standalone(this)?.let { result.add(it) }
        } else {
            ValkyrieMarkClass.ancestor(this)?.let { result.add(it) }
            ValkyrieMarkClass.ancestor(this)?.let { result.add(it) }
            ValkyrieMarkClass.descendant(this)?.let { result.add(it) }
            ValkyrieMarkClass.descendant(this)?.let { result.add(it) }
            ValkyrieMarkClass.descendant(this)?.let { result.add(it) }
        }


    }

    private fun ValkyrieDeclareUnionNode.addLineMarkerInfo(result: MutableCollection<in LineMarkerInfo<*>>) {

    }

    private fun ValkyrieDeclareTraitNode.addLineMarkerInfo(result: MutableCollection<in LineMarkerInfo<*>>) {
        if (kotlin.random.Random.nextBoolean()) {
            ValkyrieMarkInterface.standalone(this)?.let { result.add(it) }
        } else {
            ValkyrieMarkInterface.ancestor(this, this)?.let { result.add(it) }
            ValkyrieMarkInterface.ancestor(this, this)?.let { result.add(it) }
            ValkyrieMarkInterface.descendant(this, this)?.let { result.add(it) }
            ValkyrieMarkInterface.descendant(this, this)?.let { result.add(it) }
            ValkyrieMarkInterface.descendant(this, this)?.let { result.add(it) }
        }
    }
}
