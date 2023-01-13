// Generated from C:/Users/Dell/IdeaProjects/valkyrie-intellij/src/main/antlr\ValkyrieAntlr.g4 by ANTLR 4.12.0
package valkyrie.language.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ValkyrieAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, SEMICOLON=3, OP_PROPORTION=4, COLON=5, PARENTHESES_L=6, 
		PARENTHESES_R=7, BRACKET_L=8, BRACKET_R=9, BRACE_L=10, BRACE_R=11, GENERIC_L=12, 
		GENERIC_R=13, OFFSET_L=14, OFFSET_R=15, OP_ADD=16, OP_INC=17, OP_SUB=18, 
		OP_DEC=19, OP_MUL=20, OP_DIV=21, OP_EQ=22, OP_NE=23, OP_LT=24, OP_LL=25, 
		OP_LLL=26, OP_LEQ=27, OP_GT=28, OP_GG=29, OP_GGG=30, OP_GEQ=31, OP_ARROW=32, 
		OP_ARROW2=33, OP_ASSIGN=34, OP_ADD_ASSIGN=35, OP_SUB_ASSIGN=36, OP_MUL_ASSIGN=37, 
		OP_DIV_ASSIGN=38, LOGIC_OR=39, OP_OR=40, LOGIC_AND=41, OP_AND=42, AT=43, 
		HASH=44, LAMBDA_SLOT=45, MACRO_SLOT=46, OP_OR_ELSE=47, OP_THROW=48, OP_NOT=49, 
		KW_NOT=50, OP_IN=51, KW_IN=52, OP_NOT_IN=53, KW_IS=54, OP_IS=55, OP_IS_NOT=56, 
		KW_AS=57, OP_UNTIL=58, OP_POW=59, OP_TEMPERATURE=60, KW_NAMESPACE=61, 
		KW_IMPORT=62, KW_EXTENSION=63, KW_EXTENDS=64, KW_IMPLEMENTS=65, KW_CLASS=66, 
		KW_TRAIT=67, KW_UNION=68, KW_BITFLAGS=69, KW_TYPE=70, KW_LET=71, KW_FUNCTION=72, 
		KW_LAMBDA=73, KW_WITCH=74, KW_WHILE=75, KW_FOR=76, KW_NEW=77, KW_TRY=78, 
		KW_MATCH=79, KW_CATCH=80, KW_WITH=81, KW_CASE=82, KW_WHEN=83, INTEGER=84, 
		DECIMAL=85, STRING_SINGLE=86, STRING_DOUBLE=87, KW_IF=88, KW_ELSE=89, 
		KW_OTHERWISE=90, RETURN=91, RESUME=92, YIELD=93, BREAK=94, CONTINUE=95, 
		RAISE=96, SPECIAL=97, RAW_ID=98, UNICODE_ID=99, LINE_COMMENT=100, BLOCK_COMMENT=101, 
		WHITE_SPACE=102, ERROR_CHARACTAR=103;
	public static final int
		RULE_program = 0, RULE_top_statement = 1, RULE_function_statements = 2, 
		RULE_eos = 3, RULE_eos_free = 4, RULE_define_namespace = 5, RULE_import_statement = 6, 
		RULE_define_extension = 7, RULE_define_class = 8, RULE_class_block = 9, 
		RULE_class_statements = 10, RULE_class_inherit = 11, RULE_class_field = 12, 
		RULE_class_method = 13, RULE_define_trait = 14, RULE_trait_block = 15, 
		RULE_trait_statements = 16, RULE_define_trait_type = 17, RULE_define_extends = 18, 
		RULE_impliments = 19, RULE_define_union = 20, RULE_union_block = 21, RULE_union_statements = 22, 
		RULE_define_variant = 23, RULE_variant_block = 24, RULE_variant_statements = 25, 
		RULE_define_bitflags = 26, RULE_bitflags_block = 27, RULE_bitflags_statements = 28, 
		RULE_bitflags_item = 29, RULE_define_function = 30, RULE_function_parameters = 31, 
		RULE_parameter_item = 32, RULE_parameter_default = 33, RULE_function_call = 34, 
		RULE_dot_call = 35, RULE_tuple_call_body = 36, RULE_tuple_call_item = 37, 
		RULE_define_lambda = 38, RULE_lambda_call = 39, RULE_function_block = 40, 
		RULE_define_variale = 41, RULE_define_variale_lhs = 42, RULE_let_parameter = 43, 
		RULE_define_type = 44, RULE_type_hint = 45, RULE_effect_hint = 46, RULE_if_statement = 47, 
		RULE_else_if_statement = 48, RULE_else_statement = 49, RULE_while_statement = 50, 
		RULE_for_statement = 51, RULE_for_pattern = 52, RULE_if_guard = 53, RULE_expression = 54, 
		RULE_inline_expression = 55, RULE_type_expression = 56, RULE_prefix_call = 57, 
		RULE_suffix_call = 58, RULE_control_expression = 59, RULE_term = 60, RULE_op_compare = 61, 
		RULE_op_pattern = 62, RULE_op_multiple = 63, RULE_op_plus = 64, RULE_op_logic = 65, 
		RULE_op_assign = 66, RULE_infix_is = 67, RULE_infix_in = 68, RULE_define_generic = 69, 
		RULE_generic_call = 70, RULE_generic_call_in_type = 71, RULE_slice_call = 72, 
		RULE_offset_call = 73, RULE_macro_call = 74, RULE_macro_call_item = 75, 
		RULE_try_statement = 76, RULE_match_call = 77, RULE_catch_call = 78, RULE_match_block = 79, 
		RULE_match_statement = 80, RULE_with_block = 81, RULE_when_block = 82, 
		RULE_else_pattern = 83, RULE_case_pattern = 84, RULE_case_tuple = 85, 
		RULE_case_term = 86, RULE_new_call = 87, RULE_new_body = 88, RULE_new_block = 89, 
		RULE_new_statement = 90, RULE_modifiers = 91, RULE_modified_identifier = 92, 
		RULE_modified_namepath = 93, RULE_namepath_free = 94, RULE_namepath = 95, 
		RULE_identifier = 96, RULE_number = 97, RULE_number_literal = 98, RULE_string = 99, 
		RULE_string_literal = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "top_statement", "function_statements", "eos", "eos_free", 
			"define_namespace", "import_statement", "define_extension", "define_class", 
			"class_block", "class_statements", "class_inherit", "class_field", "class_method", 
			"define_trait", "trait_block", "trait_statements", "define_trait_type", 
			"define_extends", "impliments", "define_union", "union_block", "union_statements", 
			"define_variant", "variant_block", "variant_statements", "define_bitflags", 
			"bitflags_block", "bitflags_statements", "bitflags_item", "define_function", 
			"function_parameters", "parameter_item", "parameter_default", "function_call", 
			"dot_call", "tuple_call_body", "tuple_call_item", "define_lambda", "lambda_call", 
			"function_block", "define_variale", "define_variale_lhs", "let_parameter", 
			"define_type", "type_hint", "effect_hint", "if_statement", "else_if_statement", 
			"else_statement", "while_statement", "for_statement", "for_pattern", 
			"if_guard", "expression", "inline_expression", "type_expression", "prefix_call", 
			"suffix_call", "control_expression", "term", "op_compare", "op_pattern", 
			"op_multiple", "op_plus", "op_logic", "op_assign", "infix_is", "infix_in", 
			"define_generic", "generic_call", "generic_call_in_type", "slice_call", 
			"offset_call", "macro_call", "macro_call_item", "try_statement", "match_call", 
			"catch_call", "match_block", "match_statement", "with_block", "when_block", 
			"else_pattern", "case_pattern", "case_tuple", "case_term", "new_call", 
			"new_body", "new_block", "new_statement", "modifiers", "modified_identifier", 
			"modified_namepath", "namepath_free", "namepath", "identifier", "number", 
			"number_literal", "string", "string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", null, null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'\\u2993'", "'\\u2994'", "'\\u2045'", "'\\u2046'", "'+'", "'++'", 
			"'-'", "'--'", "'*'", "'/'", "'=='", "'!='", "'<'", null, null, null, 
			"'>'", null, null, null, null, null, "'='", "'+='", "'-='", "'*='", "'/='", 
			"'||'", "'|'", "'&&'", "'&'", "'@'", null, null, null, "'??'", "'?'", 
			"'!'", "'not'", null, "'in'", "'\\u2209'", "'is'", null, null, null, 
			null, "'^'", null, null, null, "'extension'", null, null, null, null, 
			"'union'", "'flags'", "'type'", "'let'", null, "'lambda'", "'which'", 
			"'while'", "'for'", null, "'try'", "'match'", "'catch'", "'with'", "'case'", 
			"'when'", null, null, null, null, "'if'", "'else'", "'otherwise'", "'return'", 
			"'resume'", "'yield'", "'break'", "'continue'", "'raise'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "OP_PROPORTION", "COLON", "PARENTHESES_L", 
			"PARENTHESES_R", "BRACKET_L", "BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", 
			"GENERIC_R", "OFFSET_L", "OFFSET_R", "OP_ADD", "OP_INC", "OP_SUB", "OP_DEC", 
			"OP_MUL", "OP_DIV", "OP_EQ", "OP_NE", "OP_LT", "OP_LL", "OP_LLL", "OP_LEQ", 
			"OP_GT", "OP_GG", "OP_GGG", "OP_GEQ", "OP_ARROW", "OP_ARROW2", "OP_ASSIGN", 
			"OP_ADD_ASSIGN", "OP_SUB_ASSIGN", "OP_MUL_ASSIGN", "OP_DIV_ASSIGN", "LOGIC_OR", 
			"OP_OR", "LOGIC_AND", "OP_AND", "AT", "HASH", "LAMBDA_SLOT", "MACRO_SLOT", 
			"OP_OR_ELSE", "OP_THROW", "OP_NOT", "KW_NOT", "OP_IN", "KW_IN", "OP_NOT_IN", 
			"KW_IS", "OP_IS", "OP_IS_NOT", "KW_AS", "OP_UNTIL", "OP_POW", "OP_TEMPERATURE", 
			"KW_NAMESPACE", "KW_IMPORT", "KW_EXTENSION", "KW_EXTENDS", "KW_IMPLEMENTS", 
			"KW_CLASS", "KW_TRAIT", "KW_UNION", "KW_BITFLAGS", "KW_TYPE", "KW_LET", 
			"KW_FUNCTION", "KW_LAMBDA", "KW_WITCH", "KW_WHILE", "KW_FOR", "KW_NEW", 
			"KW_TRY", "KW_MATCH", "KW_CATCH", "KW_WITH", "KW_CASE", "KW_WHEN", "INTEGER", 
			"DECIMAL", "STRING_SINGLE", "STRING_DOUBLE", "KW_IF", "KW_ELSE", "KW_OTHERWISE", 
			"RETURN", "RESUME", "YIELD", "BREAK", "CONTINUE", "RAISE", "SPECIAL", 
			"RAW_ID", "UNICODE_ID", "LINE_COMMENT", "BLOCK_COMMENT", "WHITE_SPACE", 
			"ERROR_CHARACTAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ValkyrieAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValkyrieAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ValkyrieAntlrParser.EOF, 0); }
		public List<Top_statementContext> top_statement() {
			return getRuleContexts(Top_statementContext.class);
		}
		public Top_statementContext top_statement(int i) {
			return getRuleContext(Top_statementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2304980992097189560L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 68617796093L) != 0)) {
				{
				{
				setState(202);
				top_statement();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_statementContext extends ParserRuleContext {
		public Define_namespaceContext define_namespace() {
			return getRuleContext(Define_namespaceContext.class,0);
		}
		public Import_statementContext import_statement() {
			return getRuleContext(Import_statementContext.class,0);
		}
		public Define_extensionContext define_extension() {
			return getRuleContext(Define_extensionContext.class,0);
		}
		public Define_classContext define_class() {
			return getRuleContext(Define_classContext.class,0);
		}
		public Define_unionContext define_union() {
			return getRuleContext(Define_unionContext.class,0);
		}
		public Define_bitflagsContext define_bitflags() {
			return getRuleContext(Define_bitflagsContext.class,0);
		}
		public Define_traitContext define_trait() {
			return getRuleContext(Define_traitContext.class,0);
		}
		public Define_extendsContext define_extends() {
			return getRuleContext(Define_extendsContext.class,0);
		}
		public Define_functionContext define_function() {
			return getRuleContext(Define_functionContext.class,0);
		}
		public Define_typeContext define_type() {
			return getRuleContext(Define_typeContext.class,0);
		}
		public Define_varialeContext define_variale() {
			return getRuleContext(Define_varialeContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Top_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_statementContext top_statement() throws RecognitionException {
		Top_statementContext _localctx = new Top_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				define_namespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				import_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				define_extension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				define_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				define_union();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				define_bitflags();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				define_trait();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				define_extends();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				define_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				define_type();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				define_variale();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(221);
				if_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(222);
				while_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(223);
				for_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(224);
				expression(0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(225);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_statementsContext extends ParserRuleContext {
		public Define_lambdaContext define_lambda() {
			return getRuleContext(Define_lambdaContext.class,0);
		}
		public Define_varialeContext define_variale() {
			return getRuleContext(Define_varialeContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Function_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFunction_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFunction_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFunction_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_statementsContext function_statements() throws RecognitionException {
		Function_statementsContext _localctx = new Function_statementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_statements);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				define_lambda();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				define_variale();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ValkyrieAntlrParser.SEMICOLON, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Eos_freeContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ValkyrieAntlrParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(ValkyrieAntlrParser.SEMICOLON, 0); }
		public Eos_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos_free; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterEos_free(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitEos_free(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitEos_free(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eos_freeContext eos_free() throws RecognitionException {
		Eos_freeContext _localctx = new Eos_freeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eos_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_namespaceContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE() { return getToken(ValkyrieAntlrParser.KW_NAMESPACE, 0); }
		public Namepath_freeContext namepath_free() {
			return getRuleContext(Namepath_freeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Define_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_namespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_namespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_namespaceContext define_namespace() throws RecognitionException {
		Define_namespaceContext _localctx = new Define_namespaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(KW_NAMESPACE);
			setState(241);
			namepath_free();
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(242);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(ValkyrieAntlrParser.KW_IMPORT, 0); }
		public Namepath_freeContext namepath_free() {
			return getRuleContext(Namepath_freeContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(KW_IMPORT);
			setState(246);
			namepath_free();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_extensionContext extends ParserRuleContext {
		public TerminalNode KW_EXTENSION() { return getToken(ValkyrieAntlrParser.KW_EXTENSION, 0); }
		public Define_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_extension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_extensionContext define_extension() throws RecognitionException {
		Define_extensionContext _localctx = new Define_extensionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(KW_EXTENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_classContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_CLASS() { return getToken(ValkyrieAntlrParser.KW_CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public Class_inheritContext class_inherit() {
			return getRuleContext(Class_inheritContext.class,0);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(250);
				macro_call();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			modifiers();
			setState(257);
			match(KW_CLASS);
			setState(258);
			identifier();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16781328L) != 0)) {
				{
				setState(259);
				define_generic();
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(262);
				class_inherit();
				}
			}

			setState(265);
			class_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Class_statementsContext> class_statements() {
			return getRuleContexts(Class_statementsContext.class);
		}
		public Class_statementsContext class_statements(int i) {
			return getRuleContext(Class_statementsContext.class,i);
		}
		public Class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterClass_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitClass_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitClass_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_blockContext class_block() throws RecognitionException {
		Class_blockContext _localctx = new Class_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(BRACE_L);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044428L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(268);
				class_statements();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_statementsContext extends ParserRuleContext {
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Class_fieldContext class_field() {
			return getRuleContext(Class_fieldContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Class_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterClass_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitClass_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitClass_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementsContext class_statements() throws RecognitionException {
		Class_statementsContext _localctx = new Class_statementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_statements);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				class_method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				class_field();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				eos_free();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_inheritContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Class_inheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_inherit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterClass_inherit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitClass_inherit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitClass_inherit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_inheritContext class_inherit() throws RecognitionException {
		Class_inheritContext _localctx = new Class_inheritContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_inherit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PARENTHESES_L);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(282);
				namepath();
				}
			}

			setState(285);
			match(PARENTHESES_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_fieldContext extends ParserRuleContext {
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Parameter_defaultContext parameter_default() {
			return getRuleContext(Parameter_defaultContext.class,0);
		}
		public Class_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterClass_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitClass_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitClass_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_fieldContext class_field() throws RecognitionException {
		Class_fieldContext _localctx = new Class_fieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(287);
				macro_call();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			modified_identifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(294);
				type_hint();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(297);
				parameter_default();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_methodContext extends ParserRuleContext {
		public Modified_namepathContext modified_namepath() {
			return getRuleContext(Modified_namepathContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Effect_hintContext effect_hint() {
			return getRuleContext(Effect_hintContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Class_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterClass_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitClass_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitClass_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_methodContext class_method() throws RecognitionException {
		Class_methodContext _localctx = new Class_methodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(300);
				macro_call();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			modified_namepath();
			setState(307);
			function_parameters();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(308);
				type_hint();
				}
			}

			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(311);
				effect_hint();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(314);
				function_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_traitContext extends ParserRuleContext {
		public TerminalNode KW_TRAIT() { return getToken(ValkyrieAntlrParser.KW_TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Trait_blockContext trait_block() {
			return getRuleContext(Trait_blockContext.class,0);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public ImplimentsContext impliments() {
			return getRuleContext(ImplimentsContext.class,0);
		}
		public Define_traitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_trait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_trait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_trait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_traitContext define_trait() throws RecognitionException {
		Define_traitContext _localctx = new Define_traitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_define_trait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(KW_TRAIT);
			setState(318);
			identifier();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16781328L) != 0)) {
				{
				setState(319);
				define_generic();
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==KW_IMPLEMENTS) {
				{
				setState(322);
				impliments();
				}
			}

			setState(325);
			trait_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Trait_statementsContext> trait_statements() {
			return getRuleContexts(Trait_statementsContext.class);
		}
		public Trait_statementsContext trait_statements(int i) {
			return getRuleContext(Trait_statementsContext.class,i);
		}
		public Trait_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTrait_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTrait_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTrait_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_blockContext trait_block() throws RecognitionException {
		Trait_blockContext _localctx = new Trait_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trait_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(BRACE_L);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044428L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 805306369L) != 0)) {
				{
				{
				setState(328);
				trait_statements();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_statementsContext extends ParserRuleContext {
		public Define_trait_typeContext define_trait_type() {
			return getRuleContext(Define_trait_typeContext.class,0);
		}
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Class_fieldContext class_field() {
			return getRuleContext(Class_fieldContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Trait_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTrait_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTrait_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTrait_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_statementsContext trait_statements() throws RecognitionException {
		Trait_statementsContext _localctx = new Trait_statementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trait_statements);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				define_trait_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				class_method();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				class_field();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				eos_free();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_trait_typeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(ValkyrieAntlrParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Define_trait_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_trait_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_trait_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_trait_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_trait_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_trait_typeContext define_trait_type() throws RecognitionException {
		Define_trait_typeContext _localctx = new Define_trait_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_trait_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(KW_TYPE);
			setState(343);
			identifier();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(344);
				match(OP_ASSIGN);
				setState(345);
				type_expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_extendsContext extends ParserRuleContext {
		public TerminalNode KW_EXTENDS() { return getToken(ValkyrieAntlrParser.KW_EXTENDS, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Trait_blockContext trait_block() {
			return getRuleContext(Trait_blockContext.class,0);
		}
		public ImplimentsContext impliments() {
			return getRuleContext(ImplimentsContext.class,0);
		}
		public Define_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_extends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_extends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_extendsContext define_extends() throws RecognitionException {
		Define_extendsContext _localctx = new Define_extendsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_define_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(KW_EXTENDS);
			setState(349);
			namepath();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==KW_IMPLEMENTS) {
				{
				setState(350);
				impliments();
				}
			}

			setState(353);
			trait_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplimentsContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public TerminalNode KW_IMPLEMENTS() { return getToken(ValkyrieAntlrParser.KW_IMPLEMENTS, 0); }
		public ImplimentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterImpliments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitImpliments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitImpliments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplimentsContext impliments() throws RecognitionException {
		ImplimentsContext _localctx = new ImplimentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_impliments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==KW_IMPLEMENTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(356);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_unionContext extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(ValkyrieAntlrParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Union_blockContext union_block() {
			return getRuleContext(Union_blockContext.class,0);
		}
		public Define_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_unionContext define_union() throws RecognitionException {
		Define_unionContext _localctx = new Define_unionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_define_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(KW_UNION);
			setState(359);
			identifier();
			setState(360);
			union_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Union_statementsContext> union_statements() {
			return getRuleContexts(Union_statementsContext.class);
		}
		public Union_statementsContext union_statements(int i) {
			return getRuleContext(Union_statementsContext.class,i);
		}
		public Union_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterUnion_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitUnion_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitUnion_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_blockContext union_block() throws RecognitionException {
		Union_blockContext _localctx = new Union_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_union_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(BRACE_L);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044428L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(363);
				union_statements();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_statementsContext extends ParserRuleContext {
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Define_variantContext define_variant() {
			return getRuleContext(Define_variantContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Union_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterUnion_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitUnion_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitUnion_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_statementsContext union_statements() throws RecognitionException {
		Union_statementsContext _localctx = new Union_statementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_union_statements);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				class_method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				define_variant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				eos_free();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_variantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variant_blockContext variant_block() {
			return getRuleContext(Variant_blockContext.class,0);
		}
		public Define_variantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_variant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_variant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_variant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_variantContext define_variant() throws RecognitionException {
		Define_variantContext _localctx = new Define_variantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_define_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			identifier();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(377);
				variant_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variant_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Variant_statementsContext> variant_statements() {
			return getRuleContexts(Variant_statementsContext.class);
		}
		public Variant_statementsContext variant_statements(int i) {
			return getRuleContext(Variant_statementsContext.class,i);
		}
		public Variant_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterVariant_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitVariant_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitVariant_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_blockContext variant_block() throws RecognitionException {
		Variant_blockContext _localctx = new Variant_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variant_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(BRACE_L);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044428L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(381);
				variant_statements();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variant_statementsContext extends ParserRuleContext {
		public Class_fieldContext class_field() {
			return getRuleContext(Class_fieldContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Variant_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterVariant_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitVariant_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitVariant_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_statementsContext variant_statements() throws RecognitionException {
		Variant_statementsContext _localctx = new Variant_statementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variant_statements);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				class_field();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				eos_free();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_bitflagsContext extends ParserRuleContext {
		public TerminalNode KW_BITFLAGS() { return getToken(ValkyrieAntlrParser.KW_BITFLAGS, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Bitflags_blockContext bitflags_block() {
			return getRuleContext(Bitflags_blockContext.class,0);
		}
		public Define_bitflagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_bitflags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_bitflags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_bitflags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_bitflags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_bitflagsContext define_bitflags() throws RecognitionException {
		Define_bitflagsContext _localctx = new Define_bitflagsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_define_bitflags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(KW_BITFLAGS);
			setState(394);
			namepath();
			setState(395);
			bitflags_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitflags_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Bitflags_statementsContext> bitflags_statements() {
			return getRuleContexts(Bitflags_statementsContext.class);
		}
		public Bitflags_statementsContext bitflags_statements(int i) {
			return getRuleContext(Bitflags_statementsContext.class,i);
		}
		public Bitflags_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitflags_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterBitflags_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitBitflags_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitBitflags_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitflags_blockContext bitflags_block() throws RecognitionException {
		Bitflags_blockContext _localctx = new Bitflags_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bitflags_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(BRACE_L);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(398);
				bitflags_statements();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitflags_statementsContext extends ParserRuleContext {
		public Bitflags_itemContext bitflags_item() {
			return getRuleContext(Bitflags_itemContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Bitflags_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitflags_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterBitflags_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitBitflags_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitBitflags_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitflags_statementsContext bitflags_statements() throws RecognitionException {
		Bitflags_statementsContext _localctx = new Bitflags_statementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bitflags_statements);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				bitflags_item();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				eos_free();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bitflags_itemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bitflags_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitflags_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterBitflags_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitBitflags_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitBitflags_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitflags_itemContext bitflags_item() throws RecognitionException {
		Bitflags_itemContext _localctx = new Bitflags_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bitflags_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			identifier();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(411);
				match(OP_ASSIGN);
				setState(412);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_functionContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(ValkyrieAntlrParser.KW_FUNCTION, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Effect_hintContext effect_hint() {
			return getRuleContext(Effect_hintContext.class,0);
		}
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(415);
				macro_call();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			modifiers();
			setState(422);
			match(KW_FUNCTION);
			setState(423);
			namepath();
			setState(424);
			function_parameters();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(425);
				type_hint();
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(428);
				effect_hint();
				}
			}

			setState(431);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parametersContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Parameter_itemContext> parameter_item() {
			return getRuleContexts(Parameter_itemContext.class);
		}
		public Parameter_itemContext parameter_item(int i) {
			return getRuleContext(Parameter_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_parameters);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(PARENTHESES_L);
				setState(434);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(PARENTHESES_L);
				setState(436);
				parameter_item();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(437);
					match(COMMA);
					setState(438);
					parameter_item();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_itemContext extends ParserRuleContext {
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Parameter_defaultContext parameter_default() {
			return getRuleContext(Parameter_defaultContext.class,0);
		}
		public Parameter_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterParameter_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitParameter_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitParameter_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_itemContext parameter_item() throws RecognitionException {
		Parameter_itemContext _localctx = new Parameter_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(448);
				macro_call();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			modified_identifier();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(455);
				type_hint();
				}
			}

			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(458);
				parameter_default();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_defaultContext extends ParserRuleContext {
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parameter_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterParameter_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitParameter_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitParameter_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_defaultContext parameter_default() throws RecognitionException {
		Parameter_defaultContext _localctx = new Parameter_defaultContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(OP_ASSIGN);
			setState(462);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(464);
				match(OP_THROW);
				}
			}

			setState(467);
			tuple_call_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public Dot_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDot_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDot_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDot_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_callContext dot_call() throws RecognitionException {
		Dot_callContext _localctx = new Dot_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dot_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(469);
				match(OP_THROW);
				}
			}

			setState(472);
			match(DOT);
			setState(473);
			identifier();
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(474);
				tuple_call_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_call_bodyContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Tuple_call_itemContext> tuple_call_item() {
			return getRuleContexts(Tuple_call_itemContext.class);
		}
		public Tuple_call_itemContext tuple_call_item(int i) {
			return getRuleContext(Tuple_call_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Tuple_call_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_call_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTuple_call_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTuple_call_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTuple_call_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_call_bodyContext tuple_call_body() throws RecognitionException {
		Tuple_call_bodyContext _localctx = new Tuple_call_bodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tuple_call_body);
		int _la;
		try {
			int _alt;
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(PARENTHESES_L);
				setState(478);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(PARENTHESES_L);
				setState(480);
				tuple_call_item();
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(481);
						match(COMMA);
						setState(482);
						tuple_call_item();
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(488);
					match(COMMA);
					}
				}

				setState(491);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_call_itemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tuple_call_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_call_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTuple_call_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTuple_call_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTuple_call_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_call_itemContext tuple_call_item() throws RecognitionException {
		Tuple_call_itemContext _localctx = new Tuple_call_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tuple_call_item);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				identifier();
				setState(496);
				match(COLON);
				setState(497);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_lambdaContext extends ParserRuleContext {
		public TerminalNode KW_LAMBDA() { return getToken(ValkyrieAntlrParser.KW_LAMBDA, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Effect_hintContext effect_hint() {
			return getRuleContext(Effect_hintContext.class,0);
		}
		public Define_lambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_lambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_lambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_lambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_lambdaContext define_lambda() throws RecognitionException {
		Define_lambdaContext _localctx = new Define_lambdaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_define_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(502);
				macro_call();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(KW_LAMBDA);
			setState(509);
			function_parameters();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(510);
				type_hint();
				}
			}

			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(513);
				effect_hint();
				}
			}

			setState(516);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_callContext extends ParserRuleContext {
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
		public Lambda_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterLambda_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitLambda_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitLambda_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_callContext lambda_call() throws RecognitionException {
		Lambda_callContext _localctx = new Lambda_callContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lambda_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(518);
				match(OP_THROW);
				}
			}

			setState(521);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Function_statementsContext> function_statements() {
			return getRuleContexts(Function_statementsContext.class);
		}
		public Function_statementsContext function_statements(int i) {
			return getRuleContext(Function_statementsContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(BRACE_L);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 862017116504392L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 536076533L) != 0)) {
				{
				{
				setState(524);
				function_statements();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_varialeContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(ValkyrieAntlrParser.KW_LET, 0); }
		public Define_variale_lhsContext define_variale_lhs() {
			return getRuleContext(Define_variale_lhsContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Define_varialeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_variale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_variale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_variale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_varialeContext define_variale() throws RecognitionException {
		Define_varialeContext _localctx = new Define_varialeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_define_variale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(KW_LET);
			setState(533);
			define_variale_lhs();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(534);
				type_hint();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(537);
				match(OP_ASSIGN);
				setState(538);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_variale_lhsContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Let_parameterContext> let_parameter() {
			return getRuleContexts(Let_parameterContext.class);
		}
		public Let_parameterContext let_parameter(int i) {
			return getRuleContext(Let_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public Case_tupleContext case_tuple() {
			return getRuleContext(Case_tupleContext.class,0);
		}
		public TerminalNode KW_CASE() { return getToken(ValkyrieAntlrParser.KW_CASE, 0); }
		public Define_variale_lhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variale_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_variale_lhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_variale_lhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_variale_lhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_variale_lhsContext define_variale_lhs() throws RecognitionException {
		Define_variale_lhsContext _localctx = new Define_variale_lhsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_define_variale_lhs);
		int _la;
		try {
			int _alt;
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(PARENTHESES_L);
				setState(542);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(PARENTHESES_L);
				setState(544);
				let_parameter();
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(545);
						match(COMMA);
						setState(546);
						let_parameter();
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(552);
					match(COMMA);
					}
				}

				setState(555);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(BRACKET_L);
				setState(558);
				match(BRACKET_R);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				match(BRACKET_L);
				setState(560);
				let_parameter();
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						match(COMMA);
						setState(562);
						let_parameter();
						}
						} 
					}
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(568);
					match(COMMA);
					}
				}

				setState(571);
				match(BRACKET_R);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				let_parameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CASE) {
					{
					setState(574);
					match(KW_CASE);
					}
				}

				setState(577);
				case_tuple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Let_parameterContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Let_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterLet_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitLet_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitLet_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_parameterContext let_parameter() throws RecognitionException {
		Let_parameterContext _localctx = new Let_parameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_let_parameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(580);
					identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(583); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_typeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(ValkyrieAntlrParser.KW_TYPE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Define_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_typeContext define_type() throws RecognitionException {
		Define_typeContext _localctx = new Define_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_define_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(KW_TYPE);
			setState(586);
			identifier();
			setState(587);
			match(OP_ASSIGN);
			setState(588);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_hintContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public TerminalNode OP_ARROW() { return getToken(ValkyrieAntlrParser.OP_ARROW, 0); }
		public Type_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterType_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitType_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitType_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_hintContext type_hint() throws RecognitionException {
		Type_hintContext _localctx = new Type_hintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_type_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==OP_ARROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(591);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Effect_hintContext extends ParserRuleContext {
		public TerminalNode OP_DIV() { return getToken(ValkyrieAntlrParser.OP_DIV, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Effect_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterEffect_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitEffect_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitEffect_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Effect_hintContext effect_hint() throws RecognitionException {
		Effect_hintContext _localctx = new Effect_hintContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_effect_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(OP_DIV);
			setState(594);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(KW_IF);
			setState(597);
			inline_expression(0);
			setState(598);
			function_block();
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					else_if_statement();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(605);
				else_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitElse_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitElse_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(KW_ELSE);
			setState(609);
			match(KW_IF);
			setState(610);
			inline_expression(0);
			setState(611);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(KW_ELSE);
			setState(614);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(ValkyrieAntlrParser.KW_WHILE, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(616);
				macro_call();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			match(KW_WHILE);
			setState(623);
			inline_expression(0);
			setState(624);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(ValkyrieAntlrParser.KW_FOR, 0); }
		public For_patternContext for_pattern() {
			return getRuleContext(For_patternContext.class,0);
		}
		public Infix_inContext infix_in() {
			return getRuleContext(Infix_inContext.class,0);
		}
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public If_guardContext if_guard() {
			return getRuleContext(If_guardContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(626);
				macro_call();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			match(KW_FOR);
			setState(633);
			for_pattern();
			setState(634);
			infix_in();
			setState(635);
			inline_expression(0);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(636);
				if_guard();
				}
			}

			setState(639);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_patternContext extends ParserRuleContext {
		public Case_tupleContext case_tuple() {
			return getRuleContext(Case_tupleContext.class,0);
		}
		public TerminalNode KW_CASE() { return getToken(ValkyrieAntlrParser.KW_CASE, 0); }
		public List<Let_parameterContext> let_parameter() {
			return getRuleContexts(Let_parameterContext.class);
		}
		public Let_parameterContext let_parameter(int i) {
			return getRuleContext(Let_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public For_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFor_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFor_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFor_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_patternContext for_pattern() throws RecognitionException {
		For_patternContext _localctx = new For_patternContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_for_pattern);
		int _la;
		try {
			int _alt;
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CASE) {
					{
					setState(641);
					match(KW_CASE);
					}
				}

				setState(644);
				case_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				let_parameter();
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(COMMA);
						setState(647);
						let_parameter();
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(653);
					match(COMMA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				match(PARENTHESES_L);
				setState(657);
				let_parameter();
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(658);
						match(COMMA);
						setState(659);
						let_parameter();
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(665);
					match(COMMA);
					}
				}

				setState(668);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_guardContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public If_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterIf_guard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitIf_guard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitIf_guard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_guardContext if_guard() throws RecognitionException {
		If_guardContext _localctx = new If_guardContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_if_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(KW_IF);
			setState(673);
			inline_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Control_expressionContext control_expression() {
			return getRuleContext(Control_expressionContext.class,0);
		}
		public Prefix_callContext prefix_call() {
			return getRuleContext(Prefix_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Op_multipleContext op_multiple() {
			return getRuleContext(Op_multipleContext.class,0);
		}
		public Op_plusContext op_plus() {
			return getRuleContext(Op_plusContext.class,0);
		}
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public Suffix_callContext suffix_call() {
			return getRuleContext(Suffix_callContext.class,0);
		}
		public Infix_isContext infix_is() {
			return getRuleContext(Infix_isContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Op_assignContext op_assign() {
			return getRuleContext(Op_assignContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case RESUME:
			case YIELD:
			case BREAK:
			case CONTINUE:
			case RAISE:
				{
				setState(676);
				control_expression();
				}
				break;
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
				{
				setState(677);
				prefix_call();
				setState(678);
				expression(2);
				}
				break;
			case PARENTHESES_L:
			case BRACKET_L:
			case HASH:
			case OP_THROW:
			case KW_NEW:
			case KW_TRY:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case KW_IF:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				{
				setState(680);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(684);
						op_multiple();
						setState(685);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(688);
						op_plus();
						setState(689);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(692);
						op_logic();
						setState(693);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(696);
						op_compare();
						setState(697);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(700);
						suffix_call();
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(702);
						infix_is();
						setState(703);
						type_expression(0);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(706);
						op_assign();
						setState(707);
						type_expression(0);
						}
						break;
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inline_expressionContext extends ParserRuleContext {
		public Prefix_callContext prefix_call() {
			return getRuleContext(Prefix_callContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Op_multipleContext op_multiple() {
			return getRuleContext(Op_multipleContext.class,0);
		}
		public Op_plusContext op_plus() {
			return getRuleContext(Op_plusContext.class,0);
		}
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public Infix_isContext infix_is() {
			return getRuleContext(Infix_isContext.class,0);
		}
		public Dot_callContext dot_call() {
			return getRuleContext(Dot_callContext.class,0);
		}
		public Inline_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterInline_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitInline_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitInline_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_expressionContext inline_expression() throws RecognitionException {
		return inline_expression(0);
	}

	private Inline_expressionContext inline_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inline_expressionContext _localctx = new Inline_expressionContext(_ctx, _parentState);
		Inline_expressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_inline_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
				{
				setState(715);
				prefix_call();
				setState(716);
				inline_expression(2);
				}
				break;
			case PARENTHESES_L:
			case BRACKET_L:
			case HASH:
			case OP_THROW:
			case KW_NEW:
			case KW_TRY:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case KW_IF:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				{
				setState(718);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(743);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(721);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(722);
						op_multiple();
						setState(723);
						inline_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(725);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(726);
						op_plus();
						setState(727);
						inline_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(729);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(730);
						op_logic();
						setState(731);
						inline_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(733);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(734);
						op_compare();
						setState(735);
						inline_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(737);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(738);
						infix_is();
						setState(739);
						inline_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(741);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(742);
						dot_call();
						}
						break;
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_expressionContext extends ParserRuleContext {
		public Type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expression; }
	 
		public Type_expressionContext() { }
		public void copyFrom(Type_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TParensContext extends Type_expressionContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Generic_call_in_typeContext generic_call_in_type() {
			return getRuleContext(Generic_call_in_typeContext.class,0);
		}
		public TParensContext(Type_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TTermContext extends Type_expressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TTermContext(Type_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPatternContext extends Type_expressionContext {
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public Op_patternContext op_pattern() {
			return getRuleContext(Op_patternContext.class,0);
		}
		public TPatternContext(Type_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_expressionContext type_expression() throws RecognitionException {
		return type_expression(0);
	}

	private Type_expressionContext type_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_expressionContext _localctx = new Type_expressionContext(_ctx, _parentState);
		Type_expressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_type_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(749);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(757);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new TPatternContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(751);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(752);
						op_pattern();
						setState(753);
						type_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new TParensContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(755);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(756);
						generic_call_in_type();
						}
						break;
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_callContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(ValkyrieAntlrParser.OP_NOT, 0); }
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(ValkyrieAntlrParser.OP_SUB, 0); }
		public Prefix_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterPrefix_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitPrefix_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitPrefix_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_callContext prefix_call() throws RecognitionException {
		Prefix_callContext _localctx = new Prefix_callContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_prefix_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953748992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Suffix_callContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(ValkyrieAntlrParser.OP_NOT, 0); }
		public TerminalNode OP_TEMPERATURE() { return getToken(ValkyrieAntlrParser.OP_TEMPERATURE, 0); }
		public Slice_callContext slice_call() {
			return getRuleContext(Slice_callContext.class,0);
		}
		public Offset_callContext offset_call() {
			return getRuleContext(Offset_callContext.class,0);
		}
		public Generic_callContext generic_call() {
			return getRuleContext(Generic_callContext.class,0);
		}
		public Lambda_callContext lambda_call() {
			return getRuleContext(Lambda_callContext.class,0);
		}
		public Match_callContext match_call() {
			return getRuleContext(Match_callContext.class,0);
		}
		public Catch_callContext catch_call() {
			return getRuleContext(Catch_callContext.class,0);
		}
		public Dot_callContext dot_call() {
			return getRuleContext(Dot_callContext.class,0);
		}
		public Suffix_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterSuffix_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitSuffix_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitSuffix_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suffix_callContext suffix_call() throws RecognitionException {
		Suffix_callContext _localctx = new Suffix_callContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_suffix_call);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(OP_NOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(OP_TEMPERATURE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				slice_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				offset_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				generic_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
				lambda_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(770);
				match_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(771);
				catch_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(772);
				dot_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(773);
				dot_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Control_expressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ValkyrieAntlrParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RESUME() { return getToken(ValkyrieAntlrParser.RESUME, 0); }
		public TerminalNode BREAK() { return getToken(ValkyrieAntlrParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ValkyrieAntlrParser.CONTINUE, 0); }
		public TerminalNode RAISE() { return getToken(ValkyrieAntlrParser.RAISE, 0); }
		public TerminalNode YIELD() { return getToken(ValkyrieAntlrParser.YIELD, 0); }
		public TerminalNode KW_WITH() { return getToken(ValkyrieAntlrParser.KW_WITH, 0); }
		public Control_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterControl_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitControl_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitControl_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_expressionContext control_expression() throws RecognitionException {
		Control_expressionContext _localctx = new Control_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_control_expression);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(RETURN);
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(777);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(RESUME);
				setState(781);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				match(BREAK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				match(CONTINUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				match(RAISE);
				setState(785);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(786);
				match(YIELD);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(787);
					match(RETURN);
					}
					break;
				}
				setState(791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(790);
					expression(0);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(793);
				match(YIELD);
				setState(794);
				match(BREAK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(795);
				match(YIELD);
				setState(796);
				match(KW_WITH);
				setState(797);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public New_callContext new_call() {
			return getRuleContext(New_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public TerminalNode SPECIAL() { return getToken(ValkyrieAntlrParser.SPECIAL, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_term);
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				try_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				new_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(804);
				string_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(805);
				number_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(806);
				namepath();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(807);
				match(PARENTHESES_L);
				setState(808);
				expression(0);
				setState(809);
				match(PARENTHESES_R);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(811);
				match(BRACKET_L);
				setState(812);
				expression(0);
				setState(813);
				match(BRACKET_R);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(815);
				match(SPECIAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_compareContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public TerminalNode OP_LEQ() { return getToken(ValkyrieAntlrParser.OP_LEQ, 0); }
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_GEQ() { return getToken(ValkyrieAntlrParser.OP_GEQ, 0); }
		public TerminalNode OP_EQ() { return getToken(ValkyrieAntlrParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(ValkyrieAntlrParser.OP_NE, 0); }
		public Op_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_compareContext op_compare() throws RecognitionException {
		Op_compareContext _localctx = new Op_compareContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_op_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2579496960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_patternContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(ValkyrieAntlrParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(ValkyrieAntlrParser.OP_OR, 0); }
		public Op_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_patternContext op_pattern() throws RecognitionException {
		Op_patternContext _localctx = new Op_patternContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_op_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !(_la==OP_OR || _la==OP_AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_multipleContext extends ParserRuleContext {
		public TerminalNode OP_MUL() { return getToken(ValkyrieAntlrParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(ValkyrieAntlrParser.OP_DIV, 0); }
		public Op_multipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multipleContext op_multiple() throws RecognitionException {
		Op_multipleContext _localctx = new Op_multipleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_op_multiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !(_la==OP_MUL || _la==OP_DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_plusContext extends ParserRuleContext {
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(ValkyrieAntlrParser.OP_SUB, 0); }
		public Op_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_plusContext op_plus() throws RecognitionException {
		Op_plusContext _localctx = new Op_plusContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_op_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_la = _input.LA(1);
			if ( !(_la==OP_ADD || _la==OP_SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logicContext extends ParserRuleContext {
		public TerminalNode LOGIC_OR() { return getToken(ValkyrieAntlrParser.LOGIC_OR, 0); }
		public TerminalNode LOGIC_AND() { return getToken(ValkyrieAntlrParser.LOGIC_AND, 0); }
		public Op_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicContext op_logic() throws RecognitionException {
		Op_logicContext _localctx = new Op_logicContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_op_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_la = _input.LA(1);
			if ( !(_la==LOGIC_OR || _la==LOGIC_AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_assignContext extends ParserRuleContext {
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public TerminalNode OP_ADD_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ADD_ASSIGN, 0); }
		public TerminalNode OP_SUB_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_SUB_ASSIGN, 0); }
		public TerminalNode OP_MUL_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_MUL_ASSIGN, 0); }
		public TerminalNode OP_DIV_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_DIV_ASSIGN, 0); }
		public Op_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOp_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOp_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOp_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_assignContext op_assign() throws RecognitionException {
		Op_assignContext _localctx = new Op_assignContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_op_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575944704L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_isContext extends ParserRuleContext {
		public TerminalNode KW_IS() { return getToken(ValkyrieAntlrParser.KW_IS, 0); }
		public TerminalNode KW_NOT() { return getToken(ValkyrieAntlrParser.KW_NOT, 0); }
		public Infix_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_is; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterInfix_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitInfix_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitInfix_is(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_isContext infix_is() throws RecognitionException {
		Infix_isContext _localctx = new Infix_isContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_infix_is);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(KW_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(KW_IS);
				setState(832);
				match(KW_NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_inContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(ValkyrieAntlrParser.KW_IN, 0); }
		public TerminalNode OP_IN() { return getToken(ValkyrieAntlrParser.OP_IN, 0); }
		public Infix_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterInfix_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitInfix_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitInfix_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_inContext infix_in() throws RecognitionException {
		Infix_inContext _localctx = new Infix_inContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_infix_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==KW_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_genericContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public Define_genericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterDefine_generic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitDefine_generic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitDefine_generic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_genericContext define_generic() throws RecognitionException {
		Define_genericContext _localctx = new Define_genericContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_define_generic);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
			case OP_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(837);
					match(OP_PROPORTION);
					}
				}

				setState(840);
				match(OP_LT);
				setState(841);
				identifier();
				setState(842);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(GENERIC_L);
				setState(845);
				identifier();
				setState(846);
				match(GENERIC_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_callContext extends ParserRuleContext {
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public Generic_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterGeneric_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitGeneric_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitGeneric_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_callContext generic_call() throws RecognitionException {
		Generic_callContext _localctx = new Generic_callContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_generic_call);
		try {
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				match(OP_PROPORTION);
				setState(851);
				match(OP_LT);
				setState(852);
				type_expression(0);
				setState(853);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(GENERIC_L);
				setState(856);
				type_expression(0);
				setState(857);
				match(GENERIC_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_call_in_typeContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public Generic_call_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_call_in_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterGeneric_call_in_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitGeneric_call_in_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitGeneric_call_in_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_call_in_typeContext generic_call_in_type() throws RecognitionException {
		Generic_call_in_typeContext _localctx = new Generic_call_in_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_generic_call_in_type);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
			case OP_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(861);
					match(OP_PROPORTION);
					}
				}

				setState(864);
				match(OP_LT);
				setState(865);
				type_expression(0);
				setState(866);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(GENERIC_L);
				setState(869);
				type_expression(0);
				setState(870);
				match(GENERIC_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slice_callContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public Slice_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterSlice_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitSlice_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitSlice_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_callContext slice_call() throws RecognitionException {
		Slice_callContext _localctx = new Slice_callContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_slice_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(BRACKET_L);
			setState(875);
			expression(0);
			setState(876);
			match(BRACKET_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Offset_callContext extends ParserRuleContext {
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public TerminalNode OFFSET_L() { return getToken(ValkyrieAntlrParser.OFFSET_L, 0); }
		public TerminalNode OFFSET_R() { return getToken(ValkyrieAntlrParser.OFFSET_R, 0); }
		public Offset_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterOffset_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitOffset_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitOffset_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Offset_callContext offset_call() throws RecognitionException {
		Offset_callContext _localctx = new Offset_callContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_offset_call);
		try {
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				match(OP_PROPORTION);
				setState(879);
				match(BRACKET_L);
				setState(880);
				expression(0);
				setState(881);
				match(BRACKET_R);
				}
				break;
			case OFFSET_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(OFFSET_L);
				setState(884);
				expression(0);
				setState(885);
				match(OFFSET_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Macro_callContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ValkyrieAntlrParser.HASH, 0); }
		public List<Macro_call_itemContext> macro_call_item() {
			return getRuleContexts(Macro_call_itemContext.class);
		}
		public Macro_call_itemContext macro_call_item(int i) {
			return getRuleContext(Macro_call_itemContext.class,i);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Macro_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterMacro_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitMacro_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitMacro_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_callContext macro_call() throws RecognitionException {
		Macro_callContext _localctx = new Macro_callContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_macro_call);
		int _la;
		try {
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(HASH);
				setState(890);
				macro_call_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				match(HASH);
				setState(892);
				match(BRACKET_L);
				setState(893);
				macro_call_item();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(894);
					match(COMMA);
					setState(895);
					macro_call_item();
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				match(BRACKET_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Macro_call_itemContext extends ParserRuleContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Macro_call_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterMacro_call_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitMacro_call_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitMacro_call_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_call_itemContext macro_call_item() throws RecognitionException {
		Macro_call_itemContext _localctx = new Macro_call_itemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_macro_call_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			namepath();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(906);
				function_parameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode KW_TRY() { return getToken(ValkyrieAntlrParser.KW_TRY, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(KW_TRY);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 299067162755392L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7344003L) != 0)) {
				{
				setState(910);
				type_expression(0);
				}
			}

			setState(913);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public TerminalNode KW_MATCH() { return getToken(ValkyrieAntlrParser.KW_MATCH, 0); }
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Match_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterMatch_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitMatch_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitMatch_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_callContext match_call() throws RecognitionException {
		Match_callContext _localctx = new Match_callContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_match_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(915);
				match(OP_THROW);
				}
			}

			setState(918);
			match(DOT);
			setState(919);
			match(KW_MATCH);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 299067162755392L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7344003L) != 0)) {
				{
				setState(920);
				type_expression(0);
				}
			}

			setState(923);
			match_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public TerminalNode KW_CATCH() { return getToken(ValkyrieAntlrParser.KW_CATCH, 0); }
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Catch_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterCatch_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitCatch_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitCatch_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_callContext catch_call() throws RecognitionException {
		Catch_callContext _localctx = new Catch_callContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catch_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(925);
				match(OP_THROW);
				}
			}

			setState(928);
			match(DOT);
			setState(929);
			match(KW_CATCH);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 299067162755392L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7344003L) != 0)) {
				{
				setState(930);
				type_expression(0);
				}
			}

			setState(933);
			match_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Match_statementContext> match_statement() {
			return getRuleContexts(Match_statementContext.class);
		}
		public Match_statementContext match_statement(int i) {
			return getRuleContext(Match_statementContext.class,i);
		}
		public Match_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterMatch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitMatch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitMatch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_blockContext match_block() throws RecognitionException {
		Match_blockContext _localctx = new Match_blockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_match_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(BRACE_L);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044428L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 131L) != 0)) {
				{
				{
				setState(936);
				match_statement();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_statementContext extends ParserRuleContext {
		public When_blockContext when_block() {
			return getRuleContext(When_blockContext.class,0);
		}
		public Else_patternContext else_pattern() {
			return getRuleContext(Else_patternContext.class,0);
		}
		public Case_patternContext case_pattern() {
			return getRuleContext(Case_patternContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Match_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterMatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitMatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitMatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_statementContext match_statement() throws RecognitionException {
		Match_statementContext _localctx = new Match_statementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_match_statement);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				when_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				else_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				case_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(947);
				eos_free();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_blockContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(ValkyrieAntlrParser.KW_WITH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public With_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterWith_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitWith_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitWith_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_blockContext with_block() throws RecognitionException {
		With_blockContext _localctx = new With_blockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_with_block);
		int _la;
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HASH) {
					{
					{
					setState(950);
					macro_call();
					}
					}
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(956);
				match(KW_WITH);
				setState(957);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				match(KW_WITH);
				setState(959);
				match(BRACKET_L);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(960);
					identifier();
					}
				}

				setState(963);
				match(BRACKET_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class When_blockContext extends ParserRuleContext {
		public TerminalNode KW_WHEN() { return getToken(ValkyrieAntlrParser.KW_WHEN, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public When_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterWhen_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitWhen_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitWhen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_blockContext when_block() throws RecognitionException {
		When_blockContext _localctx = new When_blockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_when_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(966);
				macro_call();
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			match(KW_WHEN);
			setState(973);
			inline_expression(0);
			setState(974);
			match(COLON);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					expression(0);
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_patternContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Else_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterElse_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitElse_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitElse_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_patternContext else_pattern() throws RecognitionException {
		Else_patternContext _localctx = new Else_patternContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_else_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(981);
				macro_call();
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987);
			match(KW_ELSE);
			setState(988);
			match(COLON);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(989);
					expression(0);
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_patternContext extends ParserRuleContext {
		public TerminalNode KW_CASE() { return getToken(ValkyrieAntlrParser.KW_CASE, 0); }
		public Case_tupleContext case_tuple() {
			return getRuleContext(Case_tupleContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public If_guardContext if_guard() {
			return getRuleContext(If_guardContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterCase_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitCase_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitCase_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_patternContext case_pattern() throws RecognitionException {
		Case_patternContext _localctx = new Case_patternContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_case_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(995);
				macro_call();
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1001);
			match(KW_CASE);
			setState(1002);
			case_tuple();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1003);
				if_guard();
				}
			}

			setState(1006);
			match(COLON);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007);
					expression(0);
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_tupleContext extends ParserRuleContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Case_termContext> case_term() {
			return getRuleContexts(Case_termContext.class);
		}
		public Case_termContext case_term(int i) {
			return getRuleContext(Case_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Case_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterCase_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitCase_tuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitCase_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_tupleContext case_tuple() throws RecognitionException {
		Case_tupleContext _localctx = new Case_tupleContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_case_tuple);
		int _la;
		try {
			int _alt;
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				namepath();
				setState(1014);
				match(PARENTHESES_L);
				setState(1015);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				namepath();
				setState(1018);
				match(PARENTHESES_L);
				setState(1019);
				case_term();
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1020);
						match(COMMA);
						setState(1021);
						case_term();
						}
						} 
					}
					setState(1026);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1027);
					match(COMMA);
					}
				}

				setState(1030);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_termContext extends ParserRuleContext {
		public Case_tupleContext case_tuple() {
			return getRuleContext(Case_tupleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Case_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterCase_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitCase_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitCase_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_termContext case_term() throws RecognitionException {
		Case_termContext _localctx = new Case_termContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_case_term);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				case_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_callContext extends ParserRuleContext {
		public TerminalNode KW_NEW() { return getToken(ValkyrieAntlrParser.KW_NEW, 0); }
		public Modified_namepathContext modified_namepath() {
			return getRuleContext(Modified_namepathContext.class,0);
		}
		public New_bodyContext new_body() {
			return getRuleContext(New_bodyContext.class,0);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public Generic_call_in_typeContext generic_call_in_type() {
			return getRuleContext(Generic_call_in_typeContext.class,0);
		}
		public New_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNew_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNew_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNew_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_callContext new_call() throws RecognitionException {
		New_callContext _localctx = new New_callContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_new_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(1038);
				macro_call();
				}
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1044);
			match(KW_NEW);
			setState(1045);
			modified_namepath();
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16781328L) != 0)) {
				{
				setState(1046);
				generic_call_in_type();
				}
			}

			setState(1049);
			new_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_bodyContext extends ParserRuleContext {
		public New_blockContext new_block() {
			return getRuleContext(New_blockContext.class,0);
		}
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public New_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNew_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNew_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNew_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_bodyContext new_body() throws RecognitionException {
		New_bodyContext _localctx = new New_bodyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_new_body);
		int _la;
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTHESES_L) {
					{
					setState(1051);
					tuple_call_body();
					}
				}

				setState(1054);
				new_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				tuple_call_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<New_statementContext> new_statement() {
			return getRuleContexts(New_statementContext.class);
		}
		public New_statementContext new_statement(int i) {
			return getRuleContext(New_statementContext.class,i);
		}
		public New_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNew_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNew_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNew_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_blockContext new_block() throws RecognitionException {
		New_blockContext _localctx = new New_blockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_new_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(BRACE_L);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 862017116504396L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 8376195L) != 0)) {
				{
				{
				setState(1059);
				new_statement();
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_statementContext extends ParserRuleContext {
		public Tuple_call_itemContext tuple_call_item() {
			return getRuleContext(Tuple_call_itemContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public New_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNew_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNew_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNew_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_statementContext new_statement() throws RecognitionException {
		New_statementContext _localctx = new New_statementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_new_statement);
		try {
			setState(1069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESES_L:
			case BRACKET_L:
			case OP_ADD:
			case OP_SUB:
			case HASH:
			case OP_THROW:
			case OP_NOT:
			case KW_NEW:
			case KW_TRY:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case KW_IF:
			case RETURN:
			case RESUME:
			case YIELD:
			case BREAK:
			case CONTINUE:
			case RAISE:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				tuple_call_item();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				eos_free();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifiersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(1071);
				identifier();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Modified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Modified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modified_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterModified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitModified_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitModified_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modified_identifierContext modified_identifier() throws RecognitionException {
		Modified_identifierContext _localctx = new Modified_identifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_modified_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1077);
					identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1080); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Modified_namepathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public Modified_namepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modified_namepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterModified_namepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitModified_namepath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitModified_namepath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modified_namepathContext modified_namepath() throws RecognitionException {
		Modified_namepathContext _localctx = new Modified_namepathContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_modified_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1082);
				identifier();
				}
				}
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RAW_ID || _la==UNICODE_ID );
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1087);
					match(OP_PROPORTION);
					setState(1088);
					identifier();
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namepath_freeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ValkyrieAntlrParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ValkyrieAntlrParser.DOT, i);
		}
		public Namepath_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath_free; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNamepath_free(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNamepath_free(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNamepath_free(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namepath_freeContext namepath_free() throws RecognitionException {
		Namepath_freeContext _localctx = new Namepath_freeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namepath_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			identifier();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OP_PROPORTION) {
				{
				{
				setState(1095);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==OP_PROPORTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1096);
				identifier();
				}
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamepathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public NamepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNamepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNamepath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNamepath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamepathContext namepath() throws RecognitionException {
		NamepathContext _localctx = new NamepathContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namepath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			identifier();
			setState(1107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					match(OP_PROPORTION);
					setState(1104);
					identifier();
					}
					} 
				}
				setState(1109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode UNICODE_ID() { return getToken(ValkyrieAntlrParser.UNICODE_ID, 0); }
		public TerminalNode RAW_ID() { return getToken(ValkyrieAntlrParser.RAW_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_la = _input.LA(1);
			if ( !(_la==RAW_ID || _la==UNICODE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(ValkyrieAntlrParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(ValkyrieAntlrParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Number_literalContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitNumber_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_number_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			number();
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1115);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_SINGLE() { return getToken(ValkyrieAntlrParser.STRING_SINGLE, 0); }
		public TerminalNode STRING_DOUBLE() { return getToken(ValkyrieAntlrParser.STRING_DOUBLE, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_la = _input.LA(1);
			if ( !(_la==STRING_SINGLE || _la==STRING_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(1120);
				identifier();
				}
			}

			setState(1123);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 55:
			return inline_expression_sempred((Inline_expressionContext)_localctx, predIndex);
		case 56:
			return type_expression_sempred((Type_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean inline_expression_sempred(Inline_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean type_expression_sempred(Type_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u0466\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0001\u0000\u0005\u0000\u00cc\b\u0000\n\u0000\f\u0000\u00cf\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00e3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00eb\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0005\b\u00fc\b\b\n\b\f\b\u00ff\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0105\b\b\u0001\b\u0003\b\u0108\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0005\t\u010e\b\t\n\t\f\t\u0111\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0118\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u011c\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0121\b\f\n\f\f"+
		"\f\u0124\t\f\u0001\f\u0001\f\u0003\f\u0128\b\f\u0001\f\u0003\f\u012b\b"+
		"\f\u0001\r\u0005\r\u012e\b\r\n\r\f\r\u0131\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u0136\b\r\u0001\r\u0003\r\u0139\b\r\u0001\r\u0003\r\u013c\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0141\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0144\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u014a\b\u000f\n\u000f\f\u000f\u014d\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0155"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u015b"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0160\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u016d\b\u0015\n\u0015\f\u0015\u0170\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0177\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u017b\b\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u017f"+
		"\b\u0018\n\u0018\f\u0018\u0182\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0188\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0190\b\u001b\n\u001b"+
		"\f\u001b\u0193\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0199\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u019e\b\u001d\u0001\u001e\u0005\u001e\u01a1\b\u001e\n\u001e\f\u001e\u01a4"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01ab\b\u001e\u0001\u001e\u0003\u001e\u01ae\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01b8\b\u001f\n\u001f\f\u001f\u01bb\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01bf\b\u001f\u0001 \u0005 \u01c2\b \n"+
		" \f \u01c5\t \u0001 \u0001 \u0003 \u01c9\b \u0001 \u0003 \u01cc\b \u0001"+
		"!\u0001!\u0001!\u0001\"\u0003\"\u01d2\b\"\u0001\"\u0001\"\u0001#\u0003"+
		"#\u01d7\b#\u0001#\u0001#\u0001#\u0003#\u01dc\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u01e4\b$\n$\f$\u01e7\t$\u0001$\u0003$\u01ea\b$"+
		"\u0001$\u0001$\u0003$\u01ee\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01f5\b%\u0001&\u0005&\u01f8\b&\n&\f&\u01fb\t&\u0001&\u0001&\u0001&"+
		"\u0003&\u0200\b&\u0001&\u0003&\u0203\b&\u0001&\u0001&\u0001\'\u0003\'"+
		"\u0208\b\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u020e\b(\n(\f(\u0211\t"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0003)\u0218\b)\u0001)\u0001)\u0003"+
		")\u021c\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u0224\b*\n"+
		"*\f*\u0227\t*\u0001*\u0003*\u022a\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u0234\b*\n*\f*\u0237\t*\u0001*\u0003*\u023a"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0240\b*\u0001*\u0003*\u0243\b"+
		"*\u0001+\u0004+\u0246\b+\u000b+\f+\u0247\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u0259\b/\n/\f/\u025c\t/\u0001/\u0003/\u025f\b/\u00010\u00010"+
		"\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u00052\u026a\b2\n2\f"+
		"2\u026d\t2\u00012\u00012\u00012\u00012\u00013\u00053\u0274\b3\n3\f3\u0277"+
		"\t3\u00013\u00013\u00013\u00013\u00013\u00033\u027e\b3\u00013\u00013\u0001"+
		"4\u00034\u0283\b4\u00014\u00014\u00014\u00014\u00054\u0289\b4\n4\f4\u028c"+
		"\t4\u00014\u00034\u028f\b4\u00014\u00014\u00014\u00014\u00054\u0295\b"+
		"4\n4\f4\u0298\t4\u00014\u00034\u029b\b4\u00014\u00014\u00034\u029f\b4"+
		"\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u02aa\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u02c6\b6\n6"+
		"\f6\u02c9\t6\u00017\u00017\u00017\u00017\u00017\u00037\u02d0\b7\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00057\u02e8\b7\n7\f7\u02eb\t7\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00058\u02f6\b8\n8\f8\u02f9\t8\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u0307\b:\u0001;\u0001;\u0003;\u030b\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u0315\b;\u0001;\u0003;\u0318\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u031f\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0331\b<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001"+
		"?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001C\u0003"+
		"C\u0342\bC\u0001D\u0001D\u0001E\u0003E\u0347\bE\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0003E\u0351\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u035c\bF\u0001G\u0003G\u035f"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0369"+
		"\bG\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u0378\bI\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0005J\u0381\bJ\nJ\fJ\u0384\tJ\u0001J\u0001J\u0003J\u0388"+
		"\bJ\u0001K\u0001K\u0003K\u038c\bK\u0001L\u0001L\u0003L\u0390\bL\u0001"+
		"L\u0001L\u0001M\u0003M\u0395\bM\u0001M\u0001M\u0001M\u0003M\u039a\bM\u0001"+
		"M\u0001M\u0001N\u0003N\u039f\bN\u0001N\u0001N\u0001N\u0003N\u03a4\bN\u0001"+
		"N\u0001N\u0001O\u0001O\u0005O\u03aa\bO\nO\fO\u03ad\tO\u0001O\u0001O\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u03b5\bP\u0001Q\u0005Q\u03b8\bQ\nQ\fQ\u03bb"+
		"\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03c2\bQ\u0001Q\u0003Q\u03c5"+
		"\bQ\u0001R\u0005R\u03c8\bR\nR\fR\u03cb\tR\u0001R\u0001R\u0001R\u0001R"+
		"\u0005R\u03d1\bR\nR\fR\u03d4\tR\u0001S\u0005S\u03d7\bS\nS\fS\u03da\tS"+
		"\u0001S\u0001S\u0001S\u0005S\u03df\bS\nS\fS\u03e2\tS\u0001T\u0005T\u03e5"+
		"\bT\nT\fT\u03e8\tT\u0001T\u0001T\u0001T\u0003T\u03ed\bT\u0001T\u0001T"+
		"\u0005T\u03f1\bT\nT\fT\u03f4\tT\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0005U\u03ff\bU\nU\fU\u0402\tU\u0001U\u0003U\u0405"+
		"\bU\u0001U\u0001U\u0003U\u0409\bU\u0001V\u0001V\u0003V\u040d\bV\u0001"+
		"W\u0005W\u0410\bW\nW\fW\u0413\tW\u0001W\u0001W\u0001W\u0003W\u0418\bW"+
		"\u0001W\u0001W\u0001X\u0003X\u041d\bX\u0001X\u0001X\u0003X\u0421\bX\u0001"+
		"Y\u0001Y\u0005Y\u0425\bY\nY\fY\u0428\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0003"+
		"Z\u042e\bZ\u0001[\u0005[\u0431\b[\n[\f[\u0434\t[\u0001\\\u0004\\\u0437"+
		"\b\\\u000b\\\f\\\u0438\u0001]\u0004]\u043c\b]\u000b]\f]\u043d\u0001]\u0001"+
		"]\u0005]\u0442\b]\n]\f]\u0445\t]\u0001^\u0001^\u0001^\u0005^\u044a\b^"+
		"\n^\f^\u044d\t^\u0001_\u0001_\u0001_\u0005_\u0452\b_\n_\f_\u0455\t_\u0001"+
		"`\u0001`\u0001a\u0001a\u0001b\u0001b\u0003b\u045d\bb\u0001c\u0001c\u0001"+
		"d\u0003d\u0462\bd\u0001d\u0001d\u0001d\u0000\u0003lnpe\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u0000\u000f\u0001"+
		"\u0000\u0002\u0003\u0002\u0000\u0005\u0005AA\u0002\u0000\u0005\u0005 "+
		" \u0003\u0000\u0010\u0010\u0012\u001211\u0003\u0000\u0016\u0018\u001b"+
		"\u001c\u001f\u001f\u0002\u0000((**\u0001\u0000\u0014\u0015\u0002\u0000"+
		"\u0010\u0010\u0012\u0012\u0002\u0000\'\'))\u0001\u0000\"&\u0001\u0000"+
		"34\u0002\u0000\u0001\u0001\u0004\u0004\u0001\u0000bc\u0001\u0000TU\u0001"+
		"\u0000VW\u04bf\u0000\u00cd\u0001\u0000\u0000\u0000\u0002\u00e2\u0001\u0000"+
		"\u0000\u0000\u0004\u00ea\u0001\u0000\u0000\u0000\u0006\u00ec\u0001\u0000"+
		"\u0000\u0000\b\u00ee\u0001\u0000\u0000\u0000\n\u00f0\u0001\u0000\u0000"+
		"\u0000\f\u00f5\u0001\u0000\u0000\u0000\u000e\u00f8\u0001\u0000\u0000\u0000"+
		"\u0010\u00fd\u0001\u0000\u0000\u0000\u0012\u010b\u0001\u0000\u0000\u0000"+
		"\u0014\u0117\u0001\u0000\u0000\u0000\u0016\u0119\u0001\u0000\u0000\u0000"+
		"\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u012f\u0001\u0000\u0000\u0000"+
		"\u001c\u013d\u0001\u0000\u0000\u0000\u001e\u0147\u0001\u0000\u0000\u0000"+
		" \u0154\u0001\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u015c"+
		"\u0001\u0000\u0000\u0000&\u0163\u0001\u0000\u0000\u0000(\u0166\u0001\u0000"+
		"\u0000\u0000*\u016a\u0001\u0000\u0000\u0000,\u0176\u0001\u0000\u0000\u0000"+
		".\u0178\u0001\u0000\u0000\u00000\u017c\u0001\u0000\u0000\u00002\u0187"+
		"\u0001\u0000\u0000\u00004\u0189\u0001\u0000\u0000\u00006\u018d\u0001\u0000"+
		"\u0000\u00008\u0198\u0001\u0000\u0000\u0000:\u019a\u0001\u0000\u0000\u0000"+
		"<\u01a2\u0001\u0000\u0000\u0000>\u01be\u0001\u0000\u0000\u0000@\u01c3"+
		"\u0001\u0000\u0000\u0000B\u01cd\u0001\u0000\u0000\u0000D\u01d1\u0001\u0000"+
		"\u0000\u0000F\u01d6\u0001\u0000\u0000\u0000H\u01ed\u0001\u0000\u0000\u0000"+
		"J\u01f4\u0001\u0000\u0000\u0000L\u01f9\u0001\u0000\u0000\u0000N\u0207"+
		"\u0001\u0000\u0000\u0000P\u020b\u0001\u0000\u0000\u0000R\u0214\u0001\u0000"+
		"\u0000\u0000T\u0242\u0001\u0000\u0000\u0000V\u0245\u0001\u0000\u0000\u0000"+
		"X\u0249\u0001\u0000\u0000\u0000Z\u024e\u0001\u0000\u0000\u0000\\\u0251"+
		"\u0001\u0000\u0000\u0000^\u0254\u0001\u0000\u0000\u0000`\u0260\u0001\u0000"+
		"\u0000\u0000b\u0265\u0001\u0000\u0000\u0000d\u026b\u0001\u0000\u0000\u0000"+
		"f\u0275\u0001\u0000\u0000\u0000h\u029e\u0001\u0000\u0000\u0000j\u02a0"+
		"\u0001\u0000\u0000\u0000l\u02a9\u0001\u0000\u0000\u0000n\u02cf\u0001\u0000"+
		"\u0000\u0000p\u02ec\u0001\u0000\u0000\u0000r\u02fa\u0001\u0000\u0000\u0000"+
		"t\u0306\u0001\u0000\u0000\u0000v\u031e\u0001\u0000\u0000\u0000x\u0330"+
		"\u0001\u0000\u0000\u0000z\u0332\u0001\u0000\u0000\u0000|\u0334\u0001\u0000"+
		"\u0000\u0000~\u0336\u0001\u0000\u0000\u0000\u0080\u0338\u0001\u0000\u0000"+
		"\u0000\u0082\u033a\u0001\u0000\u0000\u0000\u0084\u033c\u0001\u0000\u0000"+
		"\u0000\u0086\u0341\u0001\u0000\u0000\u0000\u0088\u0343\u0001\u0000\u0000"+
		"\u0000\u008a\u0350\u0001\u0000\u0000\u0000\u008c\u035b\u0001\u0000\u0000"+
		"\u0000\u008e\u0368\u0001\u0000\u0000\u0000\u0090\u036a\u0001\u0000\u0000"+
		"\u0000\u0092\u0377\u0001\u0000\u0000\u0000\u0094\u0387\u0001\u0000\u0000"+
		"\u0000\u0096\u0389\u0001\u0000\u0000\u0000\u0098\u038d\u0001\u0000\u0000"+
		"\u0000\u009a\u0394\u0001\u0000\u0000\u0000\u009c\u039e\u0001\u0000\u0000"+
		"\u0000\u009e\u03a7\u0001\u0000\u0000\u0000\u00a0\u03b4\u0001\u0000\u0000"+
		"\u0000\u00a2\u03c4\u0001\u0000\u0000\u0000\u00a4\u03c9\u0001\u0000\u0000"+
		"\u0000\u00a6\u03d8\u0001\u0000\u0000\u0000\u00a8\u03e6\u0001\u0000\u0000"+
		"\u0000\u00aa\u0408\u0001\u0000\u0000\u0000\u00ac\u040c\u0001\u0000\u0000"+
		"\u0000\u00ae\u0411\u0001\u0000\u0000\u0000\u00b0\u0420\u0001\u0000\u0000"+
		"\u0000\u00b2\u0422\u0001\u0000\u0000\u0000\u00b4\u042d\u0001\u0000\u0000"+
		"\u0000\u00b6\u0432\u0001\u0000\u0000\u0000\u00b8\u0436\u0001\u0000\u0000"+
		"\u0000\u00ba\u043b\u0001\u0000\u0000\u0000\u00bc\u0446\u0001\u0000\u0000"+
		"\u0000\u00be\u044e\u0001\u0000\u0000\u0000\u00c0\u0456\u0001\u0000\u0000"+
		"\u0000\u00c2\u0458\u0001\u0000\u0000\u0000\u00c4\u045a\u0001\u0000\u0000"+
		"\u0000\u00c6\u045e\u0001\u0000\u0000\u0000\u00c8\u0461\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0000\u0000"+
		"\u0001\u00d1\u0001\u0001\u0000\u0000\u0000\u00d2\u00e3\u0003\n\u0005\u0000"+
		"\u00d3\u00e3\u0003\f\u0006\u0000\u00d4\u00e3\u0003\u000e\u0007\u0000\u00d5"+
		"\u00e3\u0003\u0010\b\u0000\u00d6\u00e3\u0003(\u0014\u0000\u00d7\u00e3"+
		"\u00034\u001a\u0000\u00d8\u00e3\u0003\u001c\u000e\u0000\u00d9\u00e3\u0003"+
		"$\u0012\u0000\u00da\u00e3\u0003<\u001e\u0000\u00db\u00e3\u0003X,\u0000"+
		"\u00dc\u00e3\u0003R)\u0000\u00dd\u00e3\u0003^/\u0000\u00de\u00e3\u0003"+
		"d2\u0000\u00df\u00e3\u0003f3\u0000\u00e0\u00e3\u0003l6\u0000\u00e1\u00e3"+
		"\u0003\u0006\u0003\u0000\u00e2\u00d2\u0001\u0000\u0000\u0000\u00e2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e2\u00d4\u0001\u0000\u0000\u0000\u00e2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e2\u00d8\u0001\u0000\u0000\u0000\u00e2\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e2\u00da\u0001\u0000\u0000\u0000\u00e2\u00db"+
		"\u0001\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u0003\u0001\u0000\u0000\u0000\u00e4\u00eb"+
		"\u0003L&\u0000\u00e5\u00eb\u0003R)\u0000\u00e6\u00eb\u0003d2\u0000\u00e7"+
		"\u00eb\u0003f3\u0000\u00e8\u00eb\u0003l6\u0000\u00e9\u00eb\u0003\u0006"+
		"\u0003\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u0005\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0003"+
		"\u0000\u0000\u00ed\u0007\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0000"+
		"\u0000\u0000\u00ef\t\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005=\u0000"+
		"\u0000\u00f1\u00f3\u0003\u00bc^\u0000\u00f2\u00f4\u0003\u0006\u0003\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u000b\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005>\u0000\u0000\u00f6"+
		"\u00f7\u0003\u00bc^\u0000\u00f7\r\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005?\u0000\u0000\u00f9\u000f\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003"+
		"\u0094J\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0003\u00b6[\u0000\u0101\u0102\u0005B\u0000\u0000"+
		"\u0102\u0104\u0003\u00c0`\u0000\u0103\u0105\u0003\u008aE\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0003\u0016\u000b\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0012\t\u0000\u010a\u0011\u0001"+
		"\u0000\u0000\u0000\u010b\u010f\u0005\n\u0000\u0000\u010c\u010e\u0003\u0014"+
		"\n\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u000b\u0000\u0000\u0113\u0013\u0001\u0000\u0000"+
		"\u0000\u0114\u0118\u0003\u001a\r\u0000\u0115\u0118\u0003\u0018\f\u0000"+
		"\u0116\u0118\u0003\b\u0004\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0015\u0001\u0000\u0000\u0000\u0119\u011b\u0005\u0006\u0000\u0000\u011a"+
		"\u011c\u0003\u00be_\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0005\u0007\u0000\u0000\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0003\u0094J\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0125\u0127\u0003\u00b8\\\u0000\u0126\u0128\u0003Z"+
		"-\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u012b\u0003B!\u0000\u012a"+
		"\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"\u0019\u0001\u0000\u0000\u0000\u012c\u012e\u0003\u0094J\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0003\u00ba]\u0000\u0133\u0135\u0003>\u001f\u0000\u0134\u0136\u0003Z"+
		"-\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0139\u0003\\.\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u013c\u0003P(\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u001b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005C\u0000\u0000\u013e\u0140\u0003"+
		"\u00c0`\u0000\u013f\u0141\u0003\u008aE\u0000\u0140\u013f\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0003&\u0013\u0000\u0143\u0142\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0003\u001e\u000f\u0000\u0146\u001d\u0001\u0000\u0000\u0000"+
		"\u0147\u014b\u0005\n\u0000\u0000\u0148\u014a\u0003 \u0010\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\u000b\u0000\u0000\u014f\u001f\u0001\u0000\u0000\u0000\u0150"+
		"\u0155\u0003\"\u0011\u0000\u0151\u0155\u0003\u001a\r\u0000\u0152\u0155"+
		"\u0003\u0018\f\u0000\u0153\u0155\u0003\b\u0004\u0000\u0154\u0150\u0001"+
		"\u0000\u0000\u0000\u0154\u0151\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155!\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005F\u0000\u0000\u0157\u015a\u0003\u00c0`\u0000"+
		"\u0158\u0159\u0005\"\u0000\u0000\u0159\u015b\u0003p8\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b#\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005@\u0000\u0000\u015d\u015f\u0003\u00be"+
		"_\u0000\u015e\u0160\u0003&\u0013\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0003\u001e\u000f\u0000\u0162%\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0007\u0001\u0000\u0000\u0164\u0165\u0003p8\u0000\u0165\'\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0005D\u0000\u0000\u0167\u0168\u0003\u00c0"+
		"`\u0000\u0168\u0169\u0003*\u0015\u0000\u0169)\u0001\u0000\u0000\u0000"+
		"\u016a\u016e\u0005\n\u0000\u0000\u016b\u016d\u0003,\u0016\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005\u000b\u0000\u0000\u0172+\u0001\u0000\u0000\u0000\u0173\u0177"+
		"\u0003\u001a\r\u0000\u0174\u0177\u0003.\u0017\u0000\u0175\u0177\u0003"+
		"\b\u0004\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177-\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0003\u00c0`\u0000\u0179\u017b\u00030\u0018\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"/\u0001\u0000\u0000\u0000\u017c\u0180\u0005\n\u0000\u0000\u017d\u017f"+
		"\u00032\u0019\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005\u000b\u0000\u0000\u01841\u0001\u0000"+
		"\u0000\u0000\u0185\u0188\u0003\u0018\f\u0000\u0186\u0188\u0003\b\u0004"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u01883\u0001\u0000\u0000\u0000\u0189\u018a\u0005E\u0000\u0000\u018a"+
		"\u018b\u0003\u00be_\u0000\u018b\u018c\u00036\u001b\u0000\u018c5\u0001"+
		"\u0000\u0000\u0000\u018d\u0191\u0005\n\u0000\u0000\u018e\u0190\u00038"+
		"\u001c\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005\u000b\u0000\u0000\u01957\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0003:\u001d\u0000\u0197\u0199\u0003\b\u0004\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u01999\u0001\u0000\u0000\u0000\u019a\u019d\u0003\u00c0`\u0000\u019b\u019c"+
		"\u0005\"\u0000\u0000\u019c\u019e\u0003l6\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e;\u0001\u0000\u0000"+
		"\u0000\u019f\u01a1\u0003\u0094J\u0000\u01a0\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003\u00b6[\u0000\u01a6"+
		"\u01a7\u0005H\u0000\u0000\u01a7\u01a8\u0003\u00be_\u0000\u01a8\u01aa\u0003"+
		">\u001f\u0000\u01a9\u01ab\u0003Z-\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ae\u0003\\.\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0003P(\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005\u0006\u0000\u0000\u01b2\u01bf\u0005\u0007\u0000\u0000\u01b3\u01b4"+
		"\u0005\u0006\u0000\u0000\u01b4\u01b9\u0003@ \u0000\u01b5\u01b6\u0005\u0002"+
		"\u0000\u0000\u01b6\u01b8\u0003@ \u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u0007\u0000\u0000"+
		"\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01b1\u0001\u0000\u0000\u0000"+
		"\u01be\u01b3\u0001\u0000\u0000\u0000\u01bf?\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0003\u0094J\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c8\u0003\u00b8\\\u0000\u01c7\u01c9\u0003"+
		"Z-\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003B!\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"A\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\"\u0000\u0000\u01ce\u01cf"+
		"\u0003l6\u0000\u01cfC\u0001\u0000\u0000\u0000\u01d0\u01d2\u00050\u0000"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003H$\u0000\u01d4"+
		"E\u0001\u0000\u0000\u0000\u01d5\u01d7\u00050\u0000\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0005\u0001\u0000\u0000\u01d9\u01db\u0003"+
		"\u00c0`\u0000\u01da\u01dc\u0003H$\u0000\u01db\u01da\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dcG\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005\u0006\u0000\u0000\u01de\u01ee\u0005\u0007\u0000\u0000"+
		"\u01df\u01e0\u0005\u0006\u0000\u0000\u01e0\u01e5\u0003J%\u0000\u01e1\u01e2"+
		"\u0005\u0002\u0000\u0000\u01e2\u01e4\u0003J%\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005\u0002"+
		"\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u0007"+
		"\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01dd\u0001\u0000"+
		"\u0000\u0000\u01ed\u01df\u0001\u0000\u0000\u0000\u01eeI\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0003\u00c0`\u0000\u01f0\u01f1\u0005\u0005\u0000\u0000"+
		"\u01f1\u01f2\u0003l6\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f5"+
		"\u0003l6\u0000\u01f4\u01ef\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f5K\u0001\u0000\u0000\u0000\u01f6\u01f8\u0003\u0094J\u0000"+
		"\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005I\u0000\u0000\u01fd\u01ff\u0003>\u001f\u0000\u01fe\u0200"+
		"\u0003Z-\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u0203\u0003\\."+
		"\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0003P(\u0000\u0205"+
		"M\u0001\u0000\u0000\u0000\u0206\u0208\u00050\u0000\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0003P(\u0000\u020aO\u0001\u0000\u0000"+
		"\u0000\u020b\u020f\u0005\n\u0000\u0000\u020c\u020e\u0003\u0004\u0002\u0000"+
		"\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000"+
		"\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0005\u000b\u0000\u0000\u0213Q\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0005G\u0000\u0000\u0215\u0217\u0003T*\u0000\u0216\u0218\u0003"+
		"Z-\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000"+
		"\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u021a\u0005\"\u0000\u0000"+
		"\u021a\u021c\u0003l6\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021cS\u0001\u0000\u0000\u0000\u021d\u021e\u0005"+
		"\u0006\u0000\u0000\u021e\u0243\u0005\u0007\u0000\u0000\u021f\u0220\u0005"+
		"\u0006\u0000\u0000\u0220\u0225\u0003V+\u0000\u0221\u0222\u0005\u0002\u0000"+
		"\u0000\u0222\u0224\u0003V+\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224"+
		"\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227"+
		"\u0225\u0001\u0000\u0000\u0000\u0228\u022a\u0005\u0002\u0000\u0000\u0229"+
		"\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0007\u0000\u0000\u022c"+
		"\u0243\u0001\u0000\u0000\u0000\u022d\u022e\u0005\b\u0000\u0000\u022e\u0243"+
		"\u0005\t\u0000\u0000\u022f\u0230\u0005\b\u0000\u0000\u0230\u0235\u0003"+
		"V+\u0000\u0231\u0232\u0005\u0002\u0000\u0000\u0232\u0234\u0003V+\u0000"+
		"\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000"+
		"\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000"+
		"\u0238\u023a\u0005\u0002\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005\t\u0000\u0000\u023c\u0243\u0001\u0000\u0000\u0000\u023d"+
		"\u0243\u0003V+\u0000\u023e\u0240\u0005R\u0000\u0000\u023f\u023e\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0243\u0003\u00aaU\u0000\u0242\u021d\u0001\u0000"+
		"\u0000\u0000\u0242\u021f\u0001\u0000\u0000\u0000\u0242\u022d\u0001\u0000"+
		"\u0000\u0000\u0242\u022f\u0001\u0000\u0000\u0000\u0242\u023d\u0001\u0000"+
		"\u0000\u0000\u0242\u023f\u0001\u0000\u0000\u0000\u0243U\u0001\u0000\u0000"+
		"\u0000\u0244\u0246\u0003\u00c0`\u0000\u0245\u0244\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0001\u0000\u0000\u0000\u0248W\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0005F\u0000\u0000\u024a\u024b\u0003\u00c0`\u0000\u024b\u024c\u0005"+
		"\"\u0000\u0000\u024c\u024d\u0003\u00c0`\u0000\u024dY\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0007\u0002\u0000\u0000\u024f\u0250\u0003p8\u0000\u0250"+
		"[\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0015\u0000\u0000\u0252\u0253"+
		"\u0003p8\u0000\u0253]\u0001\u0000\u0000\u0000\u0254\u0255\u0005X\u0000"+
		"\u0000\u0255\u0256\u0003n7\u0000\u0256\u025a\u0003P(\u0000\u0257\u0259"+
		"\u0003`0\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000"+
		"\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000"+
		"\u0000\u0000\u025d\u025f\u0003b1\u0000\u025e\u025d\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f_\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0005Y\u0000\u0000\u0261\u0262\u0005X\u0000\u0000\u0262\u0263\u0003"+
		"n7\u0000\u0263\u0264\u0003P(\u0000\u0264a\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0005Y\u0000\u0000\u0266\u0267\u0003P(\u0000\u0267c\u0001\u0000"+
		"\u0000\u0000\u0268\u026a\u0003\u0094J\u0000\u0269\u0268\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026e\u0001\u0000\u0000"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026e\u026f\u0005K\u0000\u0000"+
		"\u026f\u0270\u0003n7\u0000\u0270\u0271\u0003P(\u0000\u0271e\u0001\u0000"+
		"\u0000\u0000\u0272\u0274\u0003\u0094J\u0000\u0273\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0001\u0000\u0000"+
		"\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u0279\u0005L\u0000\u0000"+
		"\u0279\u027a\u0003h4\u0000\u027a\u027b\u0003\u0088D\u0000\u027b\u027d"+
		"\u0003n7\u0000\u027c\u027e\u0003j5\u0000\u027d\u027c\u0001\u0000\u0000"+
		"\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0003P(\u0000\u0280g\u0001\u0000\u0000\u0000\u0281"+
		"\u0283\u0005R\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u029f"+
		"\u0003\u00aaU\u0000\u0285\u028a\u0003V+\u0000\u0286\u0287\u0005\u0002"+
		"\u0000\u0000\u0287\u0289\u0003V+\u0000\u0288\u0286\u0001\u0000\u0000\u0000"+
		"\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028f\u0005\u0002\u0000\u0000"+
		"\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000"+
		"\u028f\u029f\u0001\u0000\u0000\u0000\u0290\u0291\u0005\u0006\u0000\u0000"+
		"\u0291\u0296\u0003V+\u0000\u0292\u0293\u0005\u0002\u0000\u0000\u0293\u0295"+
		"\u0003V+\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000"+
		"\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000"+
		"\u0000\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000"+
		"\u0000\u0000\u0299\u029b\u0005\u0002\u0000\u0000\u029a\u0299\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0005\u0007\u0000\u0000\u029d\u029f\u0001\u0000"+
		"\u0000\u0000\u029e\u0282\u0001\u0000\u0000\u0000\u029e\u0285\u0001\u0000"+
		"\u0000\u0000\u029e\u0290\u0001\u0000\u0000\u0000\u029fi\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0005X\u0000\u0000\u02a1\u02a2\u0003n7\u0000\u02a2"+
		"k\u0001\u0000\u0000\u0000\u02a3\u02a4\u00066\uffff\uffff\u0000\u02a4\u02aa"+
		"\u0003v;\u0000\u02a5\u02a6\u0003r9\u0000\u02a6\u02a7\u0003l6\u0002\u02a7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003x<\u0000\u02a9\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a5\u0001\u0000\u0000\u0000\u02a9\u02a8\u0001"+
		"\u0000\u0000\u0000\u02aa\u02c7\u0001\u0000\u0000\u0000\u02ab\u02ac\n\t"+
		"\u0000\u0000\u02ac\u02ad\u0003~?\u0000\u02ad\u02ae\u0003l6\n\u02ae\u02c6"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\n\b\u0000\u0000\u02b0\u02b1\u0003"+
		"\u0080@\u0000\u02b1\u02b2\u0003l6\t\u02b2\u02c6\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\n\u0007\u0000\u0000\u02b4\u02b5\u0003\u0082A\u0000\u02b5"+
		"\u02b6\u0003l6\b\u02b6\u02c6\u0001\u0000\u0000\u0000\u02b7\u02b8\n\u0006"+
		"\u0000\u0000\u02b8\u02b9\u0003z=\u0000\u02b9\u02ba\u0003l6\u0007\u02ba"+
		"\u02c6\u0001\u0000\u0000\u0000\u02bb\u02bc\n\n\u0000\u0000\u02bc\u02c6"+
		"\u0003t:\u0000\u02bd\u02be\n\u0005\u0000\u0000\u02be\u02bf\u0003\u0086"+
		"C\u0000\u02bf\u02c0\u0003p8\u0000\u02c0\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\n\u0004\u0000\u0000\u02c2\u02c3\u0003\u0084B\u0000\u02c3"+
		"\u02c4\u0003p8\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02ab\u0001"+
		"\u0000\u0000\u0000\u02c5\u02af\u0001\u0000\u0000\u0000\u02c5\u02b3\u0001"+
		"\u0000\u0000\u0000\u02c5\u02b7\u0001\u0000\u0000\u0000\u02c5\u02bb\u0001"+
		"\u0000\u0000\u0000\u02c5\u02bd\u0001\u0000\u0000\u0000\u02c5\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8m\u0001\u0000"+
		"\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cb\u00067\uffff"+
		"\uffff\u0000\u02cb\u02cc\u0003r9\u0000\u02cc\u02cd\u0003n7\u0002\u02cd"+
		"\u02d0\u0001\u0000\u0000\u0000\u02ce\u02d0\u0003x<\u0000\u02cf\u02ca\u0001"+
		"\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0\u02e9\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\n\u0007\u0000\u0000\u02d2\u02d3\u0003~"+
		"?\u0000\u02d3\u02d4\u0003n7\b\u02d4\u02e8\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d6\n\u0006\u0000\u0000\u02d6\u02d7\u0003\u0080@\u0000\u02d7\u02d8"+
		"\u0003n7\u0007\u02d8\u02e8\u0001\u0000\u0000\u0000\u02d9\u02da\n\u0005"+
		"\u0000\u0000\u02da\u02db\u0003\u0082A\u0000\u02db\u02dc\u0003n7\u0006"+
		"\u02dc\u02e8\u0001\u0000\u0000\u0000\u02dd\u02de\n\u0004\u0000\u0000\u02de"+
		"\u02df\u0003z=\u0000\u02df\u02e0\u0003n7\u0005\u02e0\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e2\n\u0003\u0000\u0000\u02e2\u02e3\u0003\u0086C"+
		"\u0000\u02e3\u02e4\u0003n7\u0004\u02e4\u02e8\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\n\b\u0000\u0000\u02e6\u02e8\u0003F#\u0000\u02e7\u02d1\u0001\u0000"+
		"\u0000\u0000\u02e7\u02d5\u0001\u0000\u0000\u0000\u02e7\u02d9\u0001\u0000"+
		"\u0000\u0000\u02e7\u02dd\u0001\u0000\u0000\u0000\u02e7\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000"+
		"\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000"+
		"\u0000\u0000\u02eao\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u00068\uffff\uffff\u0000\u02ed\u02ee\u0003x<\u0000"+
		"\u02ee\u02f7\u0001\u0000\u0000\u0000\u02ef\u02f0\n\u0003\u0000\u0000\u02f0"+
		"\u02f1\u0003|>\u0000\u02f1\u02f2\u0003p8\u0004\u02f2\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\n\u0002\u0000\u0000\u02f4\u02f6\u0003\u008eG"+
		"\u0000\u02f5\u02ef\u0001\u0000\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8q\u0001\u0000\u0000\u0000"+
		"\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u0007\u0003\u0000\u0000"+
		"\u02fbs\u0001\u0000\u0000\u0000\u02fc\u0307\u00051\u0000\u0000\u02fd\u0307"+
		"\u0005<\u0000\u0000\u02fe\u0307\u0003\u0090H\u0000\u02ff\u0307\u0003\u0092"+
		"I\u0000\u0300\u0307\u0003\u008cF\u0000\u0301\u0307\u0003N\'\u0000\u0302"+
		"\u0307\u0003\u009aM\u0000\u0303\u0307\u0003\u009cN\u0000\u0304\u0307\u0003"+
		"F#\u0000\u0305\u0307\u0003F#\u0000\u0306\u02fc\u0001\u0000\u0000\u0000"+
		"\u0306\u02fd\u0001\u0000\u0000\u0000\u0306\u02fe\u0001\u0000\u0000\u0000"+
		"\u0306\u02ff\u0001\u0000\u0000\u0000\u0306\u0300\u0001\u0000\u0000\u0000"+
		"\u0306\u0301\u0001\u0000\u0000\u0000\u0306\u0302\u0001\u0000\u0000\u0000"+
		"\u0306\u0303\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0305\u0001\u0000\u0000\u0000\u0307u\u0001\u0000\u0000\u0000\u0308"+
		"\u030a\u0005[\u0000\u0000\u0309\u030b\u0003l6\u0000\u030a\u0309\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u031f\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0005\\\u0000\u0000\u030d\u031f\u0003l"+
		"6\u0000\u030e\u031f\u0005^\u0000\u0000\u030f\u031f\u0005_\u0000\u0000"+
		"\u0310\u0311\u0005`\u0000\u0000\u0311\u031f\u0003l6\u0000\u0312\u0314"+
		"\u0005]\u0000\u0000\u0313\u0315\u0005[\u0000\u0000\u0314\u0313\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0003l6\u0000\u0317\u0316\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031f\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0005]\u0000\u0000\u031a\u031f\u0005^\u0000\u0000\u031b\u031c"+
		"\u0005]\u0000\u0000\u031c\u031d\u0005Q\u0000\u0000\u031d\u031f\u0003l"+
		"6\u0000\u031e\u0308\u0001\u0000\u0000\u0000\u031e\u030c\u0001\u0000\u0000"+
		"\u0000\u031e\u030e\u0001\u0000\u0000\u0000\u031e\u030f\u0001\u0000\u0000"+
		"\u0000\u031e\u0310\u0001\u0000\u0000\u0000\u031e\u0312\u0001\u0000\u0000"+
		"\u0000\u031e\u0319\u0001\u0000\u0000\u0000\u031e\u031b\u0001\u0000\u0000"+
		"\u0000\u031fw\u0001\u0000\u0000\u0000\u0320\u0331\u0003\u0098L\u0000\u0321"+
		"\u0331\u0003^/\u0000\u0322\u0331\u0003\u00aeW\u0000\u0323\u0331\u0003"+
		"D\"\u0000\u0324\u0331\u0003\u00c8d\u0000\u0325\u0331\u0003\u00c4b\u0000"+
		"\u0326\u0331\u0003\u00be_\u0000\u0327\u0328\u0005\u0006\u0000\u0000\u0328"+
		"\u0329\u0003l6\u0000\u0329\u032a\u0005\u0007\u0000\u0000\u032a\u0331\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0005\b\u0000\u0000\u032c\u032d\u0003l"+
		"6\u0000\u032d\u032e\u0005\t\u0000\u0000\u032e\u0331\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u0005a\u0000\u0000\u0330\u0320\u0001\u0000\u0000\u0000"+
		"\u0330\u0321\u0001\u0000\u0000\u0000\u0330\u0322\u0001\u0000\u0000\u0000"+
		"\u0330\u0323\u0001\u0000\u0000\u0000\u0330\u0324\u0001\u0000\u0000\u0000"+
		"\u0330\u0325\u0001\u0000\u0000\u0000\u0330\u0326\u0001\u0000\u0000\u0000"+
		"\u0330\u0327\u0001\u0000\u0000\u0000\u0330\u032b\u0001\u0000\u0000\u0000"+
		"\u0330\u032f\u0001\u0000\u0000\u0000\u0331y\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0007\u0004\u0000\u0000\u0333{\u0001\u0000\u0000\u0000\u0334\u0335"+
		"\u0007\u0005\u0000\u0000\u0335}\u0001\u0000\u0000\u0000\u0336\u0337\u0007"+
		"\u0006\u0000\u0000\u0337\u007f\u0001\u0000\u0000\u0000\u0338\u0339\u0007"+
		"\u0007\u0000\u0000\u0339\u0081\u0001\u0000\u0000\u0000\u033a\u033b\u0007"+
		"\b\u0000\u0000\u033b\u0083\u0001\u0000\u0000\u0000\u033c\u033d\u0007\t"+
		"\u0000\u0000\u033d\u0085\u0001\u0000\u0000\u0000\u033e\u0342\u00056\u0000"+
		"\u0000\u033f\u0340\u00056\u0000\u0000\u0340\u0342\u00052\u0000\u0000\u0341"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342"+
		"\u0087\u0001\u0000\u0000\u0000\u0343\u0344\u0007\n\u0000\u0000\u0344\u0089"+
		"\u0001\u0000\u0000\u0000\u0345\u0347\u0005\u0004\u0000\u0000\u0346\u0345"+
		"\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348\u0349\u0005\u0018\u0000\u0000\u0349\u034a"+
		"\u0003\u00c0`\u0000\u034a\u034b\u0005\u001c\u0000\u0000\u034b\u0351\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0005\f\u0000\u0000\u034d\u034e\u0003\u00c0"+
		"`\u0000\u034e\u034f\u0005\r\u0000\u0000\u034f\u0351\u0001\u0000\u0000"+
		"\u0000\u0350\u0346\u0001\u0000\u0000\u0000\u0350\u034c\u0001\u0000\u0000"+
		"\u0000\u0351\u008b\u0001\u0000\u0000\u0000\u0352\u0353\u0005\u0004\u0000"+
		"\u0000\u0353\u0354\u0005\u0018\u0000\u0000\u0354\u0355\u0003p8\u0000\u0355"+
		"\u0356\u0005\u001c\u0000\u0000\u0356\u035c\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0005\f\u0000\u0000\u0358\u0359\u0003p8\u0000\u0359\u035a\u0005"+
		"\r\u0000\u0000\u035a\u035c\u0001\u0000\u0000\u0000\u035b\u0352\u0001\u0000"+
		"\u0000\u0000\u035b\u0357\u0001\u0000\u0000\u0000\u035c\u008d\u0001\u0000"+
		"\u0000\u0000\u035d\u035f\u0005\u0004\u0000\u0000\u035e\u035d\u0001\u0000"+
		"\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000"+
		"\u0000\u0000\u0360\u0361\u0005\u0018\u0000\u0000\u0361\u0362\u0003p8\u0000"+
		"\u0362\u0363\u0005\u001c\u0000\u0000\u0363\u0369\u0001\u0000\u0000\u0000"+
		"\u0364\u0365\u0005\f\u0000\u0000\u0365\u0366\u0003p8\u0000\u0366\u0367"+
		"\u0005\r\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u035e\u0001"+
		"\u0000\u0000\u0000\u0368\u0364\u0001\u0000\u0000\u0000\u0369\u008f\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0005\b\u0000\u0000\u036b\u036c\u0003l"+
		"6\u0000\u036c\u036d\u0005\t\u0000\u0000\u036d\u0091\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u0005\u0004\u0000\u0000\u036f\u0370\u0005\b\u0000\u0000"+
		"\u0370\u0371\u0003l6\u0000\u0371\u0372\u0005\t\u0000\u0000\u0372\u0378"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u000e\u0000\u0000\u0374\u0375"+
		"\u0003l6\u0000\u0375\u0376\u0005\u000f\u0000\u0000\u0376\u0378\u0001\u0000"+
		"\u0000\u0000\u0377\u036e\u0001\u0000\u0000\u0000\u0377\u0373\u0001\u0000"+
		"\u0000\u0000\u0378\u0093\u0001\u0000\u0000\u0000\u0379\u037a\u0005,\u0000"+
		"\u0000\u037a\u0388\u0003\u0096K\u0000\u037b\u037c\u0005,\u0000\u0000\u037c"+
		"\u037d\u0005\b\u0000\u0000\u037d\u0382\u0003\u0096K\u0000\u037e\u037f"+
		"\u0005\u0002\u0000\u0000\u037f\u0381\u0003\u0096K\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0381\u0384\u0001\u0000\u0000\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0385\u0001"+
		"\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0386\u0005"+
		"\t\u0000\u0000\u0386\u0388\u0001\u0000\u0000\u0000\u0387\u0379\u0001\u0000"+
		"\u0000\u0000\u0387\u037b\u0001\u0000\u0000\u0000\u0388\u0095\u0001\u0000"+
		"\u0000\u0000\u0389\u038b\u0003\u00be_\u0000\u038a\u038c\u0003>\u001f\u0000"+
		"\u038b\u038a\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000"+
		"\u038c\u0097\u0001\u0000\u0000\u0000\u038d\u038f\u0005N\u0000\u0000\u038e"+
		"\u0390\u0003p8\u0000\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0392\u0003"+
		"P(\u0000\u0392\u0099\u0001\u0000\u0000\u0000\u0393\u0395\u00050\u0000"+
		"\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0005\u0001\u0000"+
		"\u0000\u0397\u0399\u0005O\u0000\u0000\u0398\u039a\u0003p8\u0000\u0399"+
		"\u0398\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a"+
		"\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0003\u009eO\u0000\u039c\u009b"+
		"\u0001\u0000\u0000\u0000\u039d\u039f\u00050\u0000\u0000\u039e\u039d\u0001"+
		"\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a0\u03a1\u0005\u0001\u0000\u0000\u03a1\u03a3\u0005"+
		"P\u0000\u0000\u03a2\u03a4\u0003p8\u0000\u03a3\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a6\u0003\u009eO\u0000\u03a6\u009d\u0001\u0000\u0000\u0000"+
		"\u03a7\u03ab\u0005\n\u0000\u0000\u03a8\u03aa\u0003\u00a0P\u0000\u03a9"+
		"\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000\u03ab"+
		"\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac"+
		"\u03ae\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae"+
		"\u03af\u0005\u000b\u0000\u0000\u03af\u009f\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b5\u0003\u00a4R\u0000\u03b1\u03b5\u0003\u00a6S\u0000\u03b2\u03b5\u0003"+
		"\u00a8T\u0000\u03b3\u03b5\u0003\b\u0004\u0000\u03b4\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b1\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b5\u00a1\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b8\u0003\u0094J\u0000\u03b7\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b8\u03bb\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005Q\u0000\u0000"+
		"\u03bd\u03c5\u0003\u00c0`\u0000\u03be\u03bf\u0005Q\u0000\u0000\u03bf\u03c1"+
		"\u0005\b\u0000\u0000\u03c0\u03c2\u0003\u00c0`\u0000\u03c1\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c5\u0005\t\u0000\u0000\u03c4\u03b9\u0001\u0000"+
		"\u0000\u0000\u03c4\u03be\u0001\u0000\u0000\u0000\u03c5\u00a3\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c8\u0003\u0094J\u0000\u03c7\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c8\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005S\u0000\u0000"+
		"\u03cd\u03ce\u0003n7\u0000\u03ce\u03d2\u0005\u0005\u0000\u0000\u03cf\u03d1"+
		"\u0003l6\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u00a5\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d7\u0003\u0094J\u0000\u03d6\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d7\u03da\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000"+
		"\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03db\u03dc\u0005Y\u0000\u0000"+
		"\u03dc\u03e0\u0005\u0005\u0000\u0000\u03dd\u03df\u0003l6\u0000\u03de\u03dd"+
		"\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u00a7"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e5"+
		"\u0003\u0094J\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e9\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e9\u03ea\u0005R\u0000\u0000\u03ea\u03ec\u0003\u00aa"+
		"U\u0000\u03eb\u03ed\u0003j5\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000"+
		"\u03ee\u03f2\u0005\u0005\u0000\u0000\u03ef\u03f1\u0003l6\u0000\u03f0\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000\u0000\u0000\u03f2\u03f0"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u00a9"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u03f6"+
		"\u0003\u00be_\u0000\u03f6\u03f7\u0005\u0006\u0000\u0000\u03f7\u03f8\u0005"+
		"\u0007\u0000\u0000\u03f8\u0409\u0001\u0000\u0000\u0000\u03f9\u03fa\u0003"+
		"\u00be_\u0000\u03fa\u03fb\u0005\u0006\u0000\u0000\u03fb\u0400\u0003\u00ac"+
		"V\u0000\u03fc\u03fd\u0005\u0002\u0000\u0000\u03fd\u03ff\u0003\u00acV\u0000"+
		"\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0402\u0001\u0000\u0000\u0000"+
		"\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000"+
		"\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000\u0000\u0000"+
		"\u0403\u0405\u0005\u0002\u0000\u0000\u0404\u0403\u0001\u0000\u0000\u0000"+
		"\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0005\u0007\u0000\u0000\u0407\u0409\u0001\u0000\u0000\u0000"+
		"\u0408\u03f5\u0001\u0000\u0000\u0000\u0408\u03f9\u0001\u0000\u0000\u0000"+
		"\u0409\u00ab\u0001\u0000\u0000\u0000\u040a\u040d\u0003\u00aaU\u0000\u040b"+
		"\u040d\u0003\u00c0`\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040b"+
		"\u0001\u0000\u0000\u0000\u040d\u00ad\u0001\u0000\u0000\u0000\u040e\u0410"+
		"\u0003\u0094J\u0000\u040f\u040e\u0001\u0000\u0000\u0000\u0410\u0413\u0001"+
		"\u0000\u0000\u0000\u0411\u040f\u0001\u0000\u0000\u0000\u0411\u0412\u0001"+
		"\u0000\u0000\u0000\u0412\u0414\u0001\u0000\u0000\u0000\u0413\u0411\u0001"+
		"\u0000\u0000\u0000\u0414\u0415\u0005M\u0000\u0000\u0415\u0417\u0003\u00ba"+
		"]\u0000\u0416\u0418\u0003\u008eG\u0000\u0417\u0416\u0001\u0000\u0000\u0000"+
		"\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000\u0000\u0000"+
		"\u0419\u041a\u0003\u00b0X\u0000\u041a\u00af\u0001\u0000\u0000\u0000\u041b"+
		"\u041d\u0003H$\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001"+
		"\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u0421\u0003"+
		"\u00b2Y\u0000\u041f\u0421\u0003H$\u0000\u0420\u041c\u0001\u0000\u0000"+
		"\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u00b1\u0001\u0000\u0000"+
		"\u0000\u0422\u0426\u0005\n\u0000\u0000\u0423\u0425\u0003\u00b4Z\u0000"+
		"\u0424\u0423\u0001\u0000\u0000\u0000\u0425\u0428\u0001\u0000\u0000\u0000"+
		"\u0426\u0424\u0001\u0000\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000"+
		"\u0427\u0429\u0001\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000"+
		"\u0429\u042a\u0005\u000b\u0000\u0000\u042a\u00b3\u0001\u0000\u0000\u0000"+
		"\u042b\u042e\u0003J%\u0000\u042c\u042e\u0003\b\u0004\u0000\u042d\u042b"+
		"\u0001\u0000\u0000\u0000\u042d\u042c\u0001\u0000\u0000\u0000\u042e\u00b5"+
		"\u0001\u0000\u0000\u0000\u042f\u0431\u0003\u00c0`\u0000\u0430\u042f\u0001"+
		"\u0000\u0000\u0000\u0431\u0434\u0001\u0000\u0000\u0000\u0432\u0430\u0001"+
		"\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u00b7\u0001"+
		"\u0000\u0000\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0435\u0437\u0003"+
		"\u00c0`\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000"+
		"\u0000\u0000\u0439\u00b9\u0001\u0000\u0000\u0000\u043a\u043c\u0003\u00c0"+
		"`\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000"+
		"\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000"+
		"\u0000\u043e\u0443\u0001\u0000\u0000\u0000\u043f\u0440\u0005\u0004\u0000"+
		"\u0000\u0440\u0442\u0003\u00c0`\u0000\u0441\u043f\u0001\u0000\u0000\u0000"+
		"\u0442\u0445\u0001\u0000\u0000\u0000\u0443\u0441\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u00bb\u0001\u0000\u0000\u0000"+
		"\u0445\u0443\u0001\u0000\u0000\u0000\u0446\u044b\u0003\u00c0`\u0000\u0447"+
		"\u0448\u0007\u000b\u0000\u0000\u0448\u044a\u0003\u00c0`\u0000\u0449\u0447"+
		"\u0001\u0000\u0000\u0000\u044a\u044d\u0001\u0000\u0000\u0000\u044b\u0449"+
		"\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c\u00bd"+
		"\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000\u0000\u044e\u0453"+
		"\u0003\u00c0`\u0000\u044f\u0450\u0005\u0004\u0000\u0000\u0450\u0452\u0003"+
		"\u00c0`\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0452\u0455\u0001\u0000"+
		"\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000"+
		"\u0000\u0000\u0454\u00bf\u0001\u0000\u0000\u0000\u0455\u0453\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0007\f\u0000\u0000\u0457\u00c1\u0001\u0000\u0000"+
		"\u0000\u0458\u0459\u0007\r\u0000\u0000\u0459\u00c3\u0001\u0000\u0000\u0000"+
		"\u045a\u045c\u0003\u00c2a\u0000\u045b\u045d\u0003\u00c0`\u0000\u045c\u045b"+
		"\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u00c5"+
		"\u0001\u0000\u0000\u0000\u045e\u045f\u0007\u000e\u0000\u0000\u045f\u00c7"+
		"\u0001\u0000\u0000\u0000\u0460\u0462\u0003\u00c0`\u0000\u0461\u0460\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0001"+
		"\u0000\u0000\u0000\u0463\u0464\u0003\u00c6c\u0000\u0464\u00c9\u0001\u0000"+
		"\u0000\u0000\u0082\u00cd\u00e2\u00ea\u00f3\u00fd\u0104\u0107\u010f\u0117"+
		"\u011b\u0122\u0127\u012a\u012f\u0135\u0138\u013b\u0140\u0143\u014b\u0154"+
		"\u015a\u015f\u016e\u0176\u017a\u0180\u0187\u0191\u0198\u019d\u01a2\u01aa"+
		"\u01ad\u01b9\u01be\u01c3\u01c8\u01cb\u01d1\u01d6\u01db\u01e5\u01e9\u01ed"+
		"\u01f4\u01f9\u01ff\u0202\u0207\u020f\u0217\u021b\u0225\u0229\u0235\u0239"+
		"\u023f\u0242\u0247\u025a\u025e\u026b\u0275\u027d\u0282\u028a\u028e\u0296"+
		"\u029a\u029e\u02a9\u02c5\u02c7\u02cf\u02e7\u02e9\u02f5\u02f7\u0306\u030a"+
		"\u0314\u0317\u031e\u0330\u0341\u0346\u0350\u035b\u035e\u0368\u0377\u0382"+
		"\u0387\u038b\u038f\u0394\u0399\u039e\u03a3\u03ab\u03b4\u03b9\u03c1\u03c4"+
		"\u03c9\u03d2\u03d8\u03e0\u03e6\u03ec\u03f2\u0400\u0404\u0408\u040c\u0411"+
		"\u0417\u041c\u0420\u0426\u042d\u0432\u0438\u043d\u0443\u044b\u0453\u045c"+
		"\u0461";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}