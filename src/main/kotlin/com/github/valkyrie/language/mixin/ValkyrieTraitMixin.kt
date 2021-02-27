package com.github.valkyrie.language.mixin

import com.github.valkyrie.language.psi.*
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.NlsSafe
import com.intellij.psi.NavigatablePsiElement
import com.intellij.util.PlatformIcons
import javax.swing.Icon

abstract class ValkyrieTraitMixin(node: ASTNode) : ValkyrieElement(node),
    NavigatablePsiElement,
    ValkyrieTraitStatement {
    override fun getPresentation(): ItemPresentation = ValkyriePresentationItem(
        this.modifiers.lastChild.text,
        PlatformIcons.INTERFACE_ICON
    )
}

