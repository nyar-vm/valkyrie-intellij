package com.github.valkyrie.language.mixin

import com.github.valkyrie.language.ast.ValkyrieElement
import com.github.valkyrie.language.psi.ValkyrieNormalPattern
import com.github.valkyrie.language.psi.ValkyriePatternPair
import com.github.valkyrie.language.psi.ValkyrieSymbol
import com.intellij.lang.ASTNode
import com.intellij.model.Symbol
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.ResolveState
import com.intellij.psi.scope.PsiScopeProcessor

@Suppress("UnstableApiUsage")
abstract class MixinNormalPattern(node: ASTNode) : ValkyrieElement(node),
    ValkyrieNormalPattern {
    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
        val out = mutableListOf<PsiSymbolReference>()
        for (child in symbolList) {
            if (child is PsiElement) {
                out.add(Modifier(child))
            }
        }
        return out
    }

    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
        val out = mutableListOf<PsiSymbolDeclaration>()
        for (child in patternItemList) {
            if (child is ValkyriePatternPair) {
                out.add(Pattern(child))
            }
        }
        return out
    }

    class Modifier(private var target: ValkyrieSymbol) : PsiSymbolReference {
        override fun getElement(): PsiElement {
            return target
        }

        override fun getRangeInElement(): TextRange {
            return element.textRange
        }

        override fun resolveReference(): MutableCollection<out Symbol> {
            TODO("Not yet implemented")
        }
    }

    class Pattern(private var target: ValkyriePatternPair) : PsiSymbolDeclaration {
        override fun getDeclaringElement(): PsiElement {
            return target
        }

        override fun getRangeInDeclaringElement(): TextRange {
            return declaringElement.textRange
        }

        override fun getSymbol(): Symbol {
            TODO("Not yet implemented")
        }
    }
}

