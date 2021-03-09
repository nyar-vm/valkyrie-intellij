package com.github.valkyrie.language.mixin

import com.github.valkyrie.ide.view.ValkyrieViewElement
import com.github.valkyrie.language.ast.ViewableNode
import com.github.valkyrie.language.psi.*
import com.github.valkyrie.language.psi_node.ValkyrieClassBraceItemNode
import com.github.valkyrie.language.psi_node.ValkyrieClassTupleNode
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolDeclarationProvider
import com.intellij.openapi.util.TextRange
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.util.PsiTreeUtil
import javax.swing.Icon

// PsiReference
abstract class ValkyrieClassMixin(node: ASTNode) : ViewableNode(node),
    PsiNameIdentifierOwner,
    PsiSymbolDeclarationProvider,
    ValkyrieClassStatement {
    override fun getName(): String = this.nameIdentifier.text
    override fun setName(name: String): PsiElement {
        return this.nameIdentifier
    }

    override fun getNameIdentifier(): PsiElement = this.modifierSymbols.lastChild
    override fun getNavigationElement(): PsiElement = this.nameIdentifier

    override val viewName: String = this.nameIdentifier.text;
    override val viewIcon: Icon = AllIcons.Nodes.Class;
    override fun addChildrenView() {
        when {
            this.classBrace != null -> {
                PsiTreeUtil.getChildrenOfTypeAsList(this.classBrace, ValkyrieClassBraceItemNode::class.java)
                    .forEach {
                        this.childrenView.add(ValkyrieViewElement(it as NavigatablePsiElement))
                    }
            }
            else -> {
                PsiTreeUtil.getChildrenOfTypeAsList(this.classTuple, ValkyrieClassTupleNode::class.java)
                    .forEach {
                        this.childrenView.add(ValkyrieViewElement(it as NavigatablePsiElement))
                    }

            }
        }
    }


    override fun getDeclarations(element: PsiElement, offsetInElement: Int):
            MutableCollection<out PsiSymbolDeclaration> = mutableSetOf(ClassDeclaration(this.nameIdentifier))

    class ClassDeclaration(var e: PsiElement) : PsiSymbolDeclaration {
        override fun getDeclaringElement(): PsiElement {
            return e
        }

        override fun getRangeInDeclaringElement(): TextRange {
            return e.textRange
        }

        override fun getSymbol(): Symbol {
            TODO("Not yet implemented")
        }
    }


}

