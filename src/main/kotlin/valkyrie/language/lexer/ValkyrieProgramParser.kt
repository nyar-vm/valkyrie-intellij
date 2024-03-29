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
import valkyrie.language.antlr.ValkyrieParser.*
import valkyrie.language.ast.*
import valkyrie.language.ast.pattern_match.ValkyrieCatchBlockNode
import valkyrie.language.ast.pattern_match.ValkyrieMatchBlockNode
import valkyrie.language.ast.pattern_match.ValkyrieWhenBlockNode
import valkyrie.language.ast.pattern_match.ValkyrieWithBlockNode

class ValkyrieProgramParser(parser: ValkyrieParser) : ANTLRParserAdaptor(ValkyrieLanguage, parser) {
    override fun parse(parser: Parser, root: IElementType): ParseTree {
        return (parser as ValkyrieParser).program()
    }


    companion object {
        fun extractCompositeNode(node: CompositeElement): PsiElement {
            val type: RuleIElementType = node.elementType as RuleIElementType;
            return when (type.ruleIndex) {
                RULE_program -> ValkyrieProgramNode(node, type)
                RULE_define_namespace -> ValkyrieNamespaceStatement(node, type)
                // class
                RULE_define_class -> ValkyrieClassStatement(node)
                RULE_class_block -> ValkyrieBraceBlockNode(node)
                RULE_class_field -> ValkyrieClassFieldNode(node)
                RULE_class_method -> ValkyrieClassMethodNode(node)
                RULE_modifiers -> ModifiedIdentifier(node)
                RULE_modified_identifier -> ModifiedIdentifier(node)
                RULE_modified_namepath -> ModifiedNamepath(node)
                // flags
                RULE_define_bitflags -> ValkyrieFlagsStatement(node, type)
                RULE_bitflags_block -> ValkyrieBraceBlockNode(node)
                RULE_bitflags_item -> ValkyrieFlagsItemNode(node, type)
                // union
                RULE_define_union -> ValkyrieUnionStatement(node)
                RULE_union_block -> ValkyrieBraceBlockNode(node)
                RULE_define_variant -> ValkyrieVariantItem(node)
                RULE_variant_block -> ValkyrieBraceBlockNode(node)
                // trait
                RULE_define_trait -> ValkyrieTraitStatement(node, type)
                RULE_define_extends -> ValkyrieExtendsStatement(node)
                // function
                RULE_define_function -> ValkyrieFunctionStatement(node, type)
                RULE_parameter_item -> ValkyrieFunctionParameter(node, type)
                RULE_function_block -> ValkyrieBraceBlockNode(node)
                // variable
                RULE_define_variale -> ValkyrieAssignStatement(node, type)
                // control
                RULE_for_statement -> ValkyrieForStatement(node)
                RULE_while_statement -> ValkyrieWhileStatement(node)
                // pattern match
                RULE_match_call -> ValkyrieMatchBlockNode(node)
                RULE_catch_call -> ValkyrieCatchBlockNode(node)
                RULE_match_block -> ValkyrieBraceBlockNode(node)
                RULE_with_block -> ValkyrieWithBlockNode(node)
                RULE_when_block -> ValkyrieWhenBlockNode(node)
                // expression
                RULE_macro_call -> ValkyrieMacroCall(node)
                RULE_expression -> extractExpression(node)
                // atomic
                RULE_namepath_free -> ValkyrieNamepathNode(node, type, true)
                RULE_namepath -> ValkyrieNamepathNode(node, type)
                RULE_identifier -> ValkyrieIdentifierNode(node)
                RULE_number -> ValkyrieNumberNode(node)
                // comment


                else -> ANTLRPsiNode(node)
            }
        }
    }
}

private fun extractExpression(node: CompositeElement): ANTLRPsiNode {
    val infix = node.findPsiChildByType(ValkyrieProgramLexer.OperatorInfix);
    return if (infix == null) {
//        println("extractExpression: ${node.elementType} ${node.text}")
        ANTLRPsiNode(node)
    } else {
        ValkyrieBinaryExpression(node, infix)
    }
}

