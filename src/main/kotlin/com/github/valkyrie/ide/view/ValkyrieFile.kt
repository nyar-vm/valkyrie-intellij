package com.github.valkyrie.ide.view

import com.github.valkyrie.ValkyrieBundle
import com.github.valkyrie.ValkyrieLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.util.PsiTreeUtil

class ValkyrieFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ValkyrieLanguage.INSTANCE) {
    override fun getFileType(): FileType = ValkyrieFileType.INSTANCE

    override fun toString(): String = ValkyrieBundle.message("action.create_file")

    fun getChildrenView(): Array<TreeElement> {
        // TODO: modifier buffer
        val childrenView: MutableSet<ValkyrieViewElement> = mutableSetOf()
        for (item in PsiTreeUtil.getChildrenOfTypeAsList(this, NavigatablePsiElement::class.java)) {
            childrenView.add(ValkyrieViewElement(item))
        }
        return childrenView.toTypedArray()
    }
}