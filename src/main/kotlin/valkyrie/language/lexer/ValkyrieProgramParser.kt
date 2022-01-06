package valkyrie.language.lexer

import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import valkyrie.language.ValkyrieLanguage
import valkyrie.language.antlr.ValkyrieParser
import valkyrie.language.ast.*

class ValkyrieProgramParser(parser: ValkyrieParser) : ANTLRParserAdaptor(ValkyrieLanguage, parser) {
    override fun parse(parser: Parser, root: IElementType): ParseTree {
        return (parser as ValkyrieParser).program()
    }


    companion object {
        fun extractCompositeNode(node: CompositeElement): PsiElement {
            val type: RuleIElementType = node.elementType as RuleIElementType;
            return when (type.ruleIndex) {
                ValkyrieParser.RULE_program -> ValkyrieProgramNode(node, type)
                ValkyrieParser.RULE_define_namespace -> ValkyrieNamespaceDeclaration(node, type)
                ValkyrieParser.RULE_define_class -> ValkyrieClassStatement(node, type)
                ValkyrieParser.RULE_define_trait -> ValkyrieTraitStatement(node, type)
                ValkyrieParser.RULE_define_function -> ValkyrieFunctionStatement(node, type)
                ValkyrieParser.RULE_function_parameter_item -> ValkyrieFunctionItem(node, type)

                ValkyrieParser.RULE_expression -> extractExpression(node)
                ValkyrieParser.RULE_namepath_free -> ValkyrieNamepathNode(node, type, true)
                ValkyrieParser.RULE_namepath -> ValkyrieNamepathNode(node, type)
                ValkyrieParser.RULE_identifier -> ValkyrieIdentifierNode(node, type)
                else -> {
                    ANTLRPsiNode(node)
                }
            }
        }
    }
}

private fun extractExpression(node: CompositeElement): ANTLRPsiNode {
    val infix = node.findPsiChildByType(ValkyrieProgramLexer.OperatorInfix);
    return if (infix == null) {
        println("extractExpression: ${node.elementType} ${node.text}")
        ANTLRPsiNode(node)
    } else {
        ValkyrieBinaryExpression(node, infix)
    }
}

