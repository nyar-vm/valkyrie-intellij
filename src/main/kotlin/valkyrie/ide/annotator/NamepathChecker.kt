// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package valkyrie.ide.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import valkyrie.language.ast.ValkyrieClassStatement
import valkyrie.language.ast.ValkyrieIdentifierNode
import valkyrie.language.ast.ValkyrieUnionStatement

//import valkyrie.language.psi_node.ValkyrieUnionStatementNode

class NamepathChecker : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is ValkyrieClassStatement -> {
                checkValidClassName(element, holder)
            }

            is ValkyrieUnionStatement -> {
                checkValidUnionName(element, holder)
            }
        }
    }

    // element.text can't start with lowercase
    private fun checkValidClassName(element: ValkyrieClassStatement, holder: AnnotationHolder) {
        val id = element.nameIdentifier ?: return;
        checkNeedEscape(id, holder)
        checkCamelCase(id, holder)
    }

    private fun checkValidUnionName(element: ValkyrieUnionStatement, holder: AnnotationHolder) {
//        checkNeedEscape(element.nameIdentifier, holder)
//        checkCamelCase(element.nameIdentifier, holder)
    }

    private fun checkCamelCase(element: ValkyrieIdentifierNode, holder: AnnotationHolder) {

        val name = element.name;
//        val fixer = CamelCaseFixer();
        if (name[0].isLowerCase()) {
            holder.newAnnotation(HighlightSeverity.WEAK_WARNING, "Name must start with uppercase")
                .range(element.textRange)
                .create()
        }
    }

    private fun checkNeedEscape(element: ValkyrieIdentifierNode, holder: AnnotationHolder) {
        val rawName = element.text;
        if (!rawName.startsWith('`')) return
        // if raw name contains non xid_continue, then need escape
//        if (rawName.substring(1, rawName.length - 1).any { !it.isJavaIdentifierPart() }) {
//            holder.newAnnotation(HighlightSeverity.INFORMATION, "Need escape")
//                .range(element.textRange)
//                .create()
//        }
    }
}

