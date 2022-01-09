// Generated from C:/Users/Dell/IdeaProjects/valkyrie-intellij/src/main/antlr\Valkyrie.g4 by ANTLR 4.12.0
package valkyrie.language.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ValkyrieParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ValkyrieVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ValkyrieParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#top_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_statement(ValkyrieParser.Top_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ValkyrieParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_namespace(ValkyrieParser.Define_namespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(ValkyrieParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_extension(ValkyrieParser.Define_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_class(ValkyrieParser.Define_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#class_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statements(ValkyrieParser.Class_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#class_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_inherit(ValkyrieParser.Class_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#class_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field(ValkyrieParser.Class_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#class_eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_eos(ValkyrieParser.Class_eosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_trait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_trait(ValkyrieParser.Define_traitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#trait_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_statements(ValkyrieParser.Trait_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_union(ValkyrieParser.Define_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#union_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_statements(ValkyrieParser.Union_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_variale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_variale(ValkyrieParser.Define_varialeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_function(ValkyrieParser.Define_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(ValkyrieParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#parameter_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_item(ValkyrieParser.Parameter_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#parameter_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_default(ValkyrieParser.Parameter_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#function_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statements(ValkyrieParser.Function_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_method(ValkyrieParser.Define_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#define_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_type(ValkyrieParser.Define_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#type_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_hint(ValkyrieParser.Type_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#effect_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect_hint(ValkyrieParser.Effect_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ValkyrieParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(ValkyrieParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(ValkyrieParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EParens}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEParens(ValkyrieParser.EParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ETerm}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitETerm(ValkyrieParser.ETermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ELogic}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELogic(ValkyrieParser.ELogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EControl}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEControl(ValkyrieParser.EControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EIndex}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEIndex(ValkyrieParser.EIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EAdd}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEAdd(ValkyrieParser.EAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EIs}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEIs(ValkyrieParser.EIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ECall}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECall(ValkyrieParser.ECallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EMul}
	 * labeled alternative in {@link ValkyrieParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEMul(ValkyrieParser.EMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ITerm}
	 * labeled alternative in {@link ValkyrieParser#inline_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitITerm(ValkyrieParser.ITermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IOP}
	 * labeled alternative in {@link ValkyrieParser#inline_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIOP(ValkyrieParser.IOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EIdentifier}
	 * labeled alternative in {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEIdentifier(ValkyrieParser.EIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ENumber}
	 * labeled alternative in {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENumber(ValkyrieParser.ENumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EString}
	 * labeled alternative in {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEString(ValkyrieParser.EStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EVector}
	 * labeled alternative in {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVector(ValkyrieParser.EVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ESpeicalLiteral}
	 * labeled alternative in {@link ValkyrieParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitESpeicalLiteral(ValkyrieParser.ESpeicalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#op_multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_multiple(ValkyrieParser.Op_multipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#op_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_plus(ValkyrieParser.Op_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#op_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logic(ValkyrieParser.Op_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#infix_is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_is(ValkyrieParser.Infix_isContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix(ValkyrieParser.InfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TOp}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTOp(ValkyrieParser.TOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TParens}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTParens(ValkyrieParser.TParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TTerm}
	 * labeled alternative in {@link ValkyrieParser#type_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTTerm(ValkyrieParser.TTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(ValkyrieParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#control_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_expression(ValkyrieParser.Control_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#macro_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_call(ValkyrieParser.Macro_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#namepath_free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamepath_free(ValkyrieParser.Namepath_freeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#namepath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamepath(ValkyrieParser.NamepathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ValkyrieParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ValkyrieParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValkyrieParser#number_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_suffix(ValkyrieParser.Number_suffixContext ctx);
}