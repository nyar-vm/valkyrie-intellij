// Generated from C:/Users/Dell/IdeaProjects/valkyrie-intellij/src/main/antlr\Valkyrie.g4 by ANTLR 4.12.0
package valkyrie.language.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValkyrieParser}.
 */
public interface ValkyrieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ValkyrieParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ValkyrieParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#top_statement}.
	 * @param ctx the parse tree
	 */
	void enterTop_statement(ValkyrieParser.Top_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#top_statement}.
	 * @param ctx the parse tree
	 */
	void exitTop_statement(ValkyrieParser.Top_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statements(ValkyrieParser.Function_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statements(ValkyrieParser.Function_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ValkyrieParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ValkyrieParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#eos_free}.
	 * @param ctx the parse tree
	 */
	void enterEos_free(ValkyrieParser.Eos_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#eos_free}.
	 * @param ctx the parse tree
	 */
	void exitEos_free(ValkyrieParser.Eos_freeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_namespace}.
	 * @param ctx the parse tree
	 */
	void enterDefine_namespace(ValkyrieParser.Define_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_namespace}.
	 * @param ctx the parse tree
	 */
	void exitDefine_namespace(ValkyrieParser.Define_namespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(ValkyrieParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(ValkyrieParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_extension}.
	 * @param ctx the parse tree
	 */
	void enterDefine_extension(ValkyrieParser.Define_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_extension}.
	 * @param ctx the parse tree
	 */
	void exitDefine_extension(ValkyrieParser.Define_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_class}.
	 * @param ctx the parse tree
	 */
	void enterDefine_class(ValkyrieParser.Define_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_class}.
	 * @param ctx the parse tree
	 */
	void exitDefine_class(ValkyrieParser.Define_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#class_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_block(ValkyrieParser.Class_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#class_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_block(ValkyrieParser.Class_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void enterClass_statements(ValkyrieParser.Class_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void exitClass_statements(ValkyrieParser.Class_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#class_inherit}.
	 * @param ctx the parse tree
	 */
	void enterClass_inherit(ValkyrieParser.Class_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#class_inherit}.
	 * @param ctx the parse tree
	 */
	void exitClass_inherit(ValkyrieParser.Class_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#class_field}.
	 * @param ctx the parse tree
	 */
	void enterClass_field(ValkyrieParser.Class_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#class_field}.
	 * @param ctx the parse tree
	 */
	void exitClass_field(ValkyrieParser.Class_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#class_method}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(ValkyrieParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#class_method}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(ValkyrieParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_trait}.
	 * @param ctx the parse tree
	 */
	void enterDefine_trait(ValkyrieParser.Define_traitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_trait}.
	 * @param ctx the parse tree
	 */
	void exitDefine_trait(ValkyrieParser.Define_traitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_extends}.
	 * @param ctx the parse tree
	 */
	void enterDefine_extends(ValkyrieParser.Define_extendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_extends}.
	 * @param ctx the parse tree
	 */
	void exitDefine_extends(ValkyrieParser.Define_extendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_union}.
	 * @param ctx the parse tree
	 */
	void enterDefine_union(ValkyrieParser.Define_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_union}.
	 * @param ctx the parse tree
	 */
	void exitDefine_union(ValkyrieParser.Define_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#union_block}.
	 * @param ctx the parse tree
	 */
	void enterUnion_block(ValkyrieParser.Union_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#union_block}.
	 * @param ctx the parse tree
	 */
	void exitUnion_block(ValkyrieParser.Union_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#union_statements}.
	 * @param ctx the parse tree
	 */
	void enterUnion_statements(ValkyrieParser.Union_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#union_statements}.
	 * @param ctx the parse tree
	 */
	void exitUnion_statements(ValkyrieParser.Union_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_variant}.
	 * @param ctx the parse tree
	 */
	void enterDefine_variant(ValkyrieParser.Define_variantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_variant}.
	 * @param ctx the parse tree
	 */
	void exitDefine_variant(ValkyrieParser.Define_variantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#variant_block}.
	 * @param ctx the parse tree
	 */
	void enterVariant_block(ValkyrieParser.Variant_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#variant_block}.
	 * @param ctx the parse tree
	 */
	void exitVariant_block(ValkyrieParser.Variant_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#variant_statements}.
	 * @param ctx the parse tree
	 */
	void enterVariant_statements(ValkyrieParser.Variant_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#variant_statements}.
	 * @param ctx the parse tree
	 */
	void exitVariant_statements(ValkyrieParser.Variant_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_bitflags}.
	 * @param ctx the parse tree
	 */
	void enterDefine_bitflags(ValkyrieParser.Define_bitflagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_bitflags}.
	 * @param ctx the parse tree
	 */
	void exitDefine_bitflags(ValkyrieParser.Define_bitflagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#bitflags_block}.
	 * @param ctx the parse tree
	 */
	void enterBitflags_block(ValkyrieParser.Bitflags_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#bitflags_block}.
	 * @param ctx the parse tree
	 */
	void exitBitflags_block(ValkyrieParser.Bitflags_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#bitflags_statements}.
	 * @param ctx the parse tree
	 */
	void enterBitflags_statements(ValkyrieParser.Bitflags_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#bitflags_statements}.
	 * @param ctx the parse tree
	 */
	void exitBitflags_statements(ValkyrieParser.Bitflags_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#bitflags_item}.
	 * @param ctx the parse tree
	 */
	void enterBitflags_item(ValkyrieParser.Bitflags_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#bitflags_item}.
	 * @param ctx the parse tree
	 */
	void exitBitflags_item(ValkyrieParser.Bitflags_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_type}.
	 * @param ctx the parse tree
	 */
	void enterDefine_type(ValkyrieParser.Define_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_type}.
	 * @param ctx the parse tree
	 */
	void exitDefine_type(ValkyrieParser.Define_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#type_hint}.
	 * @param ctx the parse tree
	 */
	void enterType_hint(ValkyrieParser.Type_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#type_hint}.
	 * @param ctx the parse tree
	 */
	void exitType_hint(ValkyrieParser.Type_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#effect_hint}.
	 * @param ctx the parse tree
	 */
	void enterEffect_hint(ValkyrieParser.Effect_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#effect_hint}.
	 * @param ctx the parse tree
	 */
	void exitEffect_hint(ValkyrieParser.Effect_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_function}.
	 * @param ctx the parse tree
	 */
	void enterDefine_function(ValkyrieParser.Define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_function}.
	 * @param ctx the parse tree
	 */
	void exitDefine_function(ValkyrieParser.Define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(ValkyrieParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(ValkyrieParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#parameter_item}.
	 * @param ctx the parse tree
	 */
	void enterParameter_item(ValkyrieParser.Parameter_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#parameter_item}.
	 * @param ctx the parse tree
	 */
	void exitParameter_item(ValkyrieParser.Parameter_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#parameter_default}.
	 * @param ctx the parse tree
	 */
	void enterParameter_default(ValkyrieParser.Parameter_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#parameter_default}.
	 * @param ctx the parse tree
	 */
	void exitParameter_default(ValkyrieParser.Parameter_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ValkyrieParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ValkyrieParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_lambda}.
	 * @param ctx the parse tree
	 */
	void enterDefine_lambda(ValkyrieParser.Define_lambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_lambda}.
	 * @param ctx the parse tree
	 */
	void exitDefine_lambda(ValkyrieParser.Define_lambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#lambda_call}.
	 * @param ctx the parse tree
	 */
	void enterLambda_call(ValkyrieParser.Lambda_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#lambda_call}.
	 * @param ctx the parse tree
	 */
	void exitLambda_call(ValkyrieParser.Lambda_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(ValkyrieParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(ValkyrieParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_variale}.
	 * @param ctx the parse tree
	 */
	void enterDefine_variale(ValkyrieParser.Define_varialeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_variale}.
	 * @param ctx the parse tree
	 */
	void exitDefine_variale(ValkyrieParser.Define_varialeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ValkyrieParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ValkyrieParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(ValkyrieParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(ValkyrieParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(ValkyrieParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(ValkyrieParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ValkyrieParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ValkyrieParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(ValkyrieParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(ValkyrieParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#for_pattern}.
	 * @param ctx the parse tree
	 */
	void enterFor_pattern(ValkyrieParser.For_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#for_pattern}.
	 * @param ctx the parse tree
	 */
	void exitFor_pattern(ValkyrieParser.For_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#for_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFor_parameter(ValkyrieParser.For_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#for_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFor_parameter(ValkyrieParser.For_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ValkyrieParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ValkyrieParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#inline_expression}.
	 * @param ctx the parse tree
	 */
	void enterInline_expression(ValkyrieParser.Inline_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#inline_expression}.
	 * @param ctx the parse tree
	 */
	void exitInline_expression(ValkyrieParser.Inline_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TParens}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void enterTParens(ValkyrieParser.TParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TParens}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void exitTParens(ValkyrieParser.TParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TTerm}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void enterTTerm(ValkyrieParser.TTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TTerm}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void exitTTerm(ValkyrieParser.TTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPattern}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void enterTPattern(ValkyrieParser.TPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPattern}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void exitTPattern(ValkyrieParser.TPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#prefix_call}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_call(ValkyrieParser.Prefix_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#prefix_call}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_call(ValkyrieParser.Prefix_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#suffix_call}.
	 * @param ctx the parse tree
	 */
	void enterSuffix_call(ValkyrieParser.Suffix_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#suffix_call}.
	 * @param ctx the parse tree
	 */
	void exitSuffix_call(ValkyrieParser.Suffix_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#control_expression}.
	 * @param ctx the parse tree
	 */
	void enterControl_expression(ValkyrieParser.Control_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#control_expression}.
	 * @param ctx the parse tree
	 */
	void exitControl_expression(ValkyrieParser.Control_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ValkyrieParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ValkyrieParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#op_compare}.
	 * @param ctx the parse tree
	 */
	void enterOp_compare(ValkyrieParser.Op_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#op_compare}.
	 * @param ctx the parse tree
	 */
	void exitOp_compare(ValkyrieParser.Op_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#op_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOp_pattern(ValkyrieParser.Op_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#op_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOp_pattern(ValkyrieParser.Op_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#op_multiple}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiple(ValkyrieParser.Op_multipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#op_multiple}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiple(ValkyrieParser.Op_multipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#op_plus}.
	 * @param ctx the parse tree
	 */
	void enterOp_plus(ValkyrieParser.Op_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#op_plus}.
	 * @param ctx the parse tree
	 */
	void exitOp_plus(ValkyrieParser.Op_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void enterOp_logic(ValkyrieParser.Op_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void exitOp_logic(ValkyrieParser.Op_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#infix_is}.
	 * @param ctx the parse tree
	 */
	void enterInfix_is(ValkyrieParser.Infix_isContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#infix_is}.
	 * @param ctx the parse tree
	 */
	void exitInfix_is(ValkyrieParser.Infix_isContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#infix_in}.
	 * @param ctx the parse tree
	 */
	void enterInfix_in(ValkyrieParser.Infix_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#infix_in}.
	 * @param ctx the parse tree
	 */
	void exitInfix_in(ValkyrieParser.Infix_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCall_arguments(ValkyrieParser.Call_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCall_arguments(ValkyrieParser.Call_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#define_generic}.
	 * @param ctx the parse tree
	 */
	void enterDefine_generic(ValkyrieParser.Define_genericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#define_generic}.
	 * @param ctx the parse tree
	 */
	void exitDefine_generic(ValkyrieParser.Define_genericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#generic_call_type}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_call_type(ValkyrieParser.Generic_call_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#generic_call_type}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_call_type(ValkyrieParser.Generic_call_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#generic_call}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_call(ValkyrieParser.Generic_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#generic_call}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_call(ValkyrieParser.Generic_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#dot_call}.
	 * @param ctx the parse tree
	 */
	void enterDot_call(ValkyrieParser.Dot_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#dot_call}.
	 * @param ctx the parse tree
	 */
	void exitDot_call(ValkyrieParser.Dot_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#slice_call}.
	 * @param ctx the parse tree
	 */
	void enterSlice_call(ValkyrieParser.Slice_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#slice_call}.
	 * @param ctx the parse tree
	 */
	void exitSlice_call(ValkyrieParser.Slice_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#offset_call}.
	 * @param ctx the parse tree
	 */
	void enterOffset_call(ValkyrieParser.Offset_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#offset_call}.
	 * @param ctx the parse tree
	 */
	void exitOffset_call(ValkyrieParser.Offset_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#macro_call}.
	 * @param ctx the parse tree
	 */
	void enterMacro_call(ValkyrieParser.Macro_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#macro_call}.
	 * @param ctx the parse tree
	 */
	void exitMacro_call(ValkyrieParser.Macro_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#macro_call_item}.
	 * @param ctx the parse tree
	 */
	void enterMacro_call_item(ValkyrieParser.Macro_call_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#macro_call_item}.
	 * @param ctx the parse tree
	 */
	void exitMacro_call_item(ValkyrieParser.Macro_call_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(ValkyrieParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(ValkyrieParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#match_call}.
	 * @param ctx the parse tree
	 */
	void enterMatch_call(ValkyrieParser.Match_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#match_call}.
	 * @param ctx the parse tree
	 */
	void exitMatch_call(ValkyrieParser.Match_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#catch_call}.
	 * @param ctx the parse tree
	 */
	void enterCatch_call(ValkyrieParser.Catch_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#catch_call}.
	 * @param ctx the parse tree
	 */
	void exitCatch_call(ValkyrieParser.Catch_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#match_block}.
	 * @param ctx the parse tree
	 */
	void enterMatch_block(ValkyrieParser.Match_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#match_block}.
	 * @param ctx the parse tree
	 */
	void exitMatch_block(ValkyrieParser.Match_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#match_statement}.
	 * @param ctx the parse tree
	 */
	void enterMatch_statement(ValkyrieParser.Match_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#match_statement}.
	 * @param ctx the parse tree
	 */
	void exitMatch_statement(ValkyrieParser.Match_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#with_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_block(ValkyrieParser.With_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#with_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_block(ValkyrieParser.With_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#when_block}.
	 * @param ctx the parse tree
	 */
	void enterWhen_block(ValkyrieParser.When_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#when_block}.
	 * @param ctx the parse tree
	 */
	void exitWhen_block(ValkyrieParser.When_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#else_pattern}.
	 * @param ctx the parse tree
	 */
	void enterElse_pattern(ValkyrieParser.Else_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#else_pattern}.
	 * @param ctx the parse tree
	 */
	void exitElse_pattern(ValkyrieParser.Else_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCase_pattern(ValkyrieParser.Case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCase_pattern(ValkyrieParser.Case_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#if_guard}.
	 * @param ctx the parse tree
	 */
	void enterIf_guard(ValkyrieParser.If_guardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#if_guard}.
	 * @param ctx the parse tree
	 */
	void exitIf_guard(ValkyrieParser.If_guardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(ValkyrieParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(ValkyrieParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#modified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModified_identifier(ValkyrieParser.Modified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#modified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModified_identifier(ValkyrieParser.Modified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#modified_namepath}.
	 * @param ctx the parse tree
	 */
	void enterModified_namepath(ValkyrieParser.Modified_namepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#modified_namepath}.
	 * @param ctx the parse tree
	 */
	void exitModified_namepath(ValkyrieParser.Modified_namepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#namepath_free}.
	 * @param ctx the parse tree
	 */
	void enterNamepath_free(ValkyrieParser.Namepath_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#namepath_free}.
	 * @param ctx the parse tree
	 */
	void exitNamepath_free(ValkyrieParser.Namepath_freeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#namepath}.
	 * @param ctx the parse tree
	 */
	void enterNamepath(ValkyrieParser.NamepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#namepath}.
	 * @param ctx the parse tree
	 */
	void exitNamepath(ValkyrieParser.NamepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ValkyrieParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ValkyrieParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValkyrieParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ValkyrieParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValkyrieParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ValkyrieParser.NumberContext ctx);
}