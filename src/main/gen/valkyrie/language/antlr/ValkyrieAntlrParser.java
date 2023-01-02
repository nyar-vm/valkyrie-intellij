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
		OP_ARROW2=33, OP_ASSIGN=34, LOGIC_OR=35, OP_OR=36, LOGIC_AND=37, OP_AND=38, 
		AT=39, HASH=40, LAMBDA_SLOT=41, MACRO_SLOT=42, OP_OR_ELSE=43, OP_THROW=44, 
		OP_NOT=45, KW_NOT=46, OP_IN=47, KW_IN=48, OP_NOT_IN=49, KW_IS=50, OP_IS=51, 
		OP_IS_NOT=52, KW_AS=53, OP_UNTIL=54, OP_POW=55, OP_TEMPERATURE=56, OP_EMPTY=57, 
		KW_NAMESPACE=58, KW_IMPORT=59, KW_EXTENSION=60, KW_EXTENDS=61, KW_CLASS=62, 
		KW_TRAIT=63, KW_UNION=64, KW_BITFLAGS=65, KW_TYPE=66, KW_LET=67, KW_FUNCTION=68, 
		KW_LAMBDA=69, KW_WITCH=70, KW_WHILE=71, KW_FOR=72, KW_NEW=73, KW_TRY=74, 
		KW_MATCH=75, KW_CATCH=76, KW_WITH=77, KW_CASE=78, KW_WHEN=79, INTEGER=80, 
		DECIMAL=81, STRING_SINGLE=82, STRING_DOUBLE=83, KW_IF=84, KW_ELSE=85, 
		KW_OTHERWISE=86, RETURN=87, RESUME=88, YIELD=89, BREAK=90, CONTINUE=91, 
		RAISE=92, SPECIAL=93, RAW_ID=94, UNICODE_ID=95, LINE_COMMENT=96, BLOCK_COMMENT=97, 
		WHITE_SPACE=98, ERROR_CHARACTAR=99;
	public static final int
		RULE_program = 0, RULE_top_statement = 1, RULE_function_statements = 2, 
		RULE_eos = 3, RULE_eos_free = 4, RULE_define_namespace = 5, RULE_import_statement = 6, 
		RULE_define_extension = 7, RULE_define_class = 8, RULE_class_block = 9, 
		RULE_class_statements = 10, RULE_class_inherit = 11, RULE_class_field = 12, 
		RULE_class_method = 13, RULE_define_trait = 14, RULE_define_extends = 15, 
		RULE_define_union = 16, RULE_union_block = 17, RULE_union_statements = 18, 
		RULE_define_variant = 19, RULE_variant_block = 20, RULE_variant_statements = 21, 
		RULE_define_bitflags = 22, RULE_bitflags_block = 23, RULE_bitflags_statements = 24, 
		RULE_bitflags_item = 25, RULE_define_type = 26, RULE_type_hint = 27, RULE_effect_hint = 28, 
		RULE_define_function = 29, RULE_function_parameters = 30, RULE_parameter_item = 31, 
		RULE_parameter_default = 32, RULE_function_call = 33, RULE_dot_call = 34, 
		RULE_tuple_call_body = 35, RULE_tuple_call_item = 36, RULE_define_lambda = 37, 
		RULE_lambda_call = 38, RULE_function_block = 39, RULE_define_variale = 40, 
		RULE_if_statement = 41, RULE_else_if_statement = 42, RULE_else_statement = 43, 
		RULE_while_statement = 44, RULE_for_statement = 45, RULE_for_pattern = 46, 
		RULE_for_parameter = 47, RULE_if_guard = 48, RULE_expression = 49, RULE_inline_expression = 50, 
		RULE_type_expression = 51, RULE_prefix_call = 52, RULE_suffix_call = 53, 
		RULE_control_expression = 54, RULE_term = 55, RULE_op_compare = 56, RULE_op_pattern = 57, 
		RULE_op_multiple = 58, RULE_op_plus = 59, RULE_op_logic = 60, RULE_infix_is = 61, 
		RULE_infix_in = 62, RULE_define_generic = 63, RULE_generic_call = 64, 
		RULE_generic_call_in_type = 65, RULE_slice_call = 66, RULE_offset_call = 67, 
		RULE_macro_call = 68, RULE_macro_call_item = 69, RULE_try_statement = 70, 
		RULE_match_call = 71, RULE_catch_call = 72, RULE_match_block = 73, RULE_match_statement = 74, 
		RULE_with_block = 75, RULE_when_block = 76, RULE_else_pattern = 77, RULE_case_pattern = 78, 
		RULE_case_tuple = 79, RULE_new_call = 80, RULE_new_body = 81, RULE_new_block = 82, 
		RULE_new_statement = 83, RULE_modifiers = 84, RULE_modified_identifier = 85, 
		RULE_modified_namepath = 86, RULE_namepath_free = 87, RULE_namepath = 88, 
		RULE_identifier = 89, RULE_number = 90, RULE_number_literal = 91, RULE_string = 92, 
		RULE_string_literal = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "top_statement", "function_statements", "eos", "eos_free", 
			"define_namespace", "import_statement", "define_extension", "define_class", 
			"class_block", "class_statements", "class_inherit", "class_field", "class_method", 
			"define_trait", "define_extends", "define_union", "union_block", "union_statements", 
			"define_variant", "variant_block", "variant_statements", "define_bitflags", 
			"bitflags_block", "bitflags_statements", "bitflags_item", "define_type", 
			"type_hint", "effect_hint", "define_function", "function_parameters", 
			"parameter_item", "parameter_default", "function_call", "dot_call", "tuple_call_body", 
			"tuple_call_item", "define_lambda", "lambda_call", "function_block", 
			"define_variale", "if_statement", "else_if_statement", "else_statement", 
			"while_statement", "for_statement", "for_pattern", "for_parameter", "if_guard", 
			"expression", "inline_expression", "type_expression", "prefix_call", 
			"suffix_call", "control_expression", "term", "op_compare", "op_pattern", 
			"op_multiple", "op_plus", "op_logic", "infix_is", "infix_in", "define_generic", 
			"generic_call", "generic_call_in_type", "slice_call", "offset_call", 
			"macro_call", "macro_call_item", "try_statement", "match_call", "catch_call", 
			"match_block", "match_statement", "with_block", "when_block", "else_pattern", 
			"case_pattern", "case_tuple", "new_call", "new_body", "new_block", "new_statement", 
			"modifiers", "modified_identifier", "modified_namepath", "namepath_free", 
			"namepath", "identifier", "number", "number_literal", "string", "string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", null, null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'\\u2993'", "'\\u2994'", "'\\u2045'", "'\\u2046'", "'+'", "'++'", 
			"'-'", "'--'", "'*'", "'/'", "'=='", "'!='", "'<'", null, null, null, 
			"'>'", null, null, null, null, null, "'='", "'||'", "'|'", "'&&'", "'&'", 
			"'@'", null, null, null, "'??'", "'?'", "'!'", "'not'", null, "'in'", 
			"'\\u2209'", "'is'", null, null, null, null, "'^'", null, "'\\u2205'", 
			null, null, "'extension'", null, null, null, "'union'", "'flags'", "'type'", 
			"'let'", null, "'lambda'", "'which'", "'while'", "'for'", null, "'try'", 
			"'match'", "'catch'", "'with'", "'case'", "'when'", null, null, null, 
			null, "'if'", "'else'", "'otherwise'", "'return'", "'resume'", "'yield'", 
			"'break'", "'continue'", "'raise'"
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
			"LOGIC_OR", "OP_OR", "LOGIC_AND", "OP_AND", "AT", "HASH", "LAMBDA_SLOT", 
			"MACRO_SLOT", "OP_OR_ELSE", "OP_THROW", "OP_NOT", "KW_NOT", "OP_IN", 
			"KW_IN", "OP_NOT_IN", "KW_IS", "OP_IS", "OP_IS_NOT", "KW_AS", "OP_UNTIL", 
			"OP_POW", "OP_TEMPERATURE", "OP_EMPTY", "KW_NAMESPACE", "KW_IMPORT", 
			"KW_EXTENSION", "KW_EXTENDS", "KW_CLASS", "KW_TRAIT", "KW_UNION", "KW_BITFLAGS", 
			"KW_TYPE", "KW_LET", "KW_FUNCTION", "KW_LAMBDA", "KW_WITCH", "KW_WHILE", 
			"KW_FOR", "KW_NEW", "KW_TRY", "KW_MATCH", "KW_CATCH", "KW_WITH", "KW_CASE", 
			"KW_WHEN", "INTEGER", "DECIMAL", "STRING_SINGLE", "STRING_DOUBLE", "KW_IF", 
			"KW_ELSE", "KW_OTHERWISE", "RETURN", "RESUME", "YIELD", "BREAK", "CONTINUE", 
			"RAISE", "SPECIAL", "RAW_ID", "UNICODE_ID", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WHITE_SPACE", "ERROR_CHARACTAR"
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -288176500081622720L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4288612255L) != 0)) {
				{
				{
				setState(188);
				top_statement();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
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
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				define_namespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				import_statement();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(198);
					eos();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				define_extension();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(202);
					eos();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				define_class();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(206);
					eos();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				define_union();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(210);
					eos();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				define_bitflags();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(214);
					eos();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				define_trait();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(218);
					eos();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				define_extends();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(222);
					eos();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				define_function();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(226);
					eos();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(229);
				define_type();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(230);
					eos();
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(233);
				define_variale();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(234);
					eos();
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(237);
				if_statement();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(238);
					eos();
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(241);
				while_statement();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(242);
					eos();
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(245);
				for_statement();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(246);
					eos();
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(249);
				expression(0);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(250);
					eos();
					}
				}

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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
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
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				define_lambda();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(256);
					eos();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				while_statement();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(260);
					eos();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				for_statement();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(264);
					eos();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				expression(0);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(268);
					eos();
					}
				}

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
			setState(273);
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
			setState(275);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(KW_NAMESPACE);
			setState(278);
			namepath_free();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(279);
				eos();
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
			setState(282);
			match(KW_IMPORT);
			setState(283);
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
			setState(285);
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
			modifiers();
			setState(294);
			match(KW_CLASS);
			setState(295);
			identifier();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16781328L) != 0)) {
				{
				setState(296);
				define_generic();
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(299);
				class_inherit();
				}
			}

			setState(302);
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
			setState(304);
			match(BRACE_L);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511627788L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(305);
				class_statements();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				class_method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				class_field();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
			setState(318);
			match(PARENTHESES_L);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(319);
				namepath();
				}
			}

			setState(322);
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
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(324);
				macro_call();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			modified_identifier();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(331);
				type_hint();
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(334);
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
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(337);
				macro_call();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			modified_namepath();
			setState(344);
			function_parameters();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(345);
				type_hint();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(348);
				effect_hint();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(351);
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
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(KW_TRAIT);
			setState(355);
			identifier();
			setState(356);
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
	public static class Define_extendsContext extends ParserRuleContext {
		public TerminalNode KW_EXTENDS() { return getToken(ValkyrieAntlrParser.KW_EXTENDS, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_define_extends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(KW_EXTENDS);
			setState(359);
			namepath();
			{
			setState(360);
			match(COLON);
			setState(361);
			type_expression(0);
			}
			setState(363);
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
		enterRule(_localctx, 32, RULE_define_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(KW_UNION);
			setState(366);
			identifier();
			setState(367);
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
		enterRule(_localctx, 34, RULE_union_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(BRACE_L);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511627788L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(370);
				union_statements();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
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
		enterRule(_localctx, 36, RULE_union_statements);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				class_method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				define_variant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
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
		enterRule(_localctx, 38, RULE_define_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			identifier();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(384);
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
		enterRule(_localctx, 40, RULE_variant_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(BRACE_L);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511627788L) != 0) || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(388);
				variant_statements();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
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
		enterRule(_localctx, 42, RULE_variant_statements);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				class_field();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
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
		enterRule(_localctx, 44, RULE_define_bitflags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(KW_BITFLAGS);
			setState(401);
			namepath();
			setState(402);
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
		enterRule(_localctx, 46, RULE_bitflags_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(BRACE_L);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(405);
				bitflags_statements();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
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
		enterRule(_localctx, 48, RULE_bitflags_statements);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				bitflags_item();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
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
		enterRule(_localctx, 50, RULE_bitflags_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			identifier();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(418);
				match(OP_ASSIGN);
				setState(419);
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
		enterRule(_localctx, 52, RULE_define_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(KW_TYPE);
			setState(423);
			identifier();
			setState(424);
			match(OP_ASSIGN);
			setState(425);
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
		enterRule(_localctx, 54, RULE_type_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==OP_ARROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(428);
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
		enterRule(_localctx, 56, RULE_effect_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(OP_DIV);
			setState(431);
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
		enterRule(_localctx, 58, RULE_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(433);
				macro_call();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			modifiers();
			setState(440);
			match(KW_FUNCTION);
			setState(441);
			namepath();
			setState(442);
			function_parameters();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(443);
				type_hint();
				}
			}

			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(446);
				effect_hint();
				}
			}

			setState(449);
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
		public List<Parameter_itemContext> parameter_item() {
			return getRuleContexts(Parameter_itemContext.class);
		}
		public Parameter_itemContext parameter_item(int i) {
			return getRuleContext(Parameter_itemContext.class,i);
		}
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
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
		enterRule(_localctx, 60, RULE_function_parameters);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(PARENTHESES_L);
				setState(452);
				parameter_item();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(453);
					match(COMMA);
					setState(454);
					parameter_item();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(PARENTHESES_L);
				setState(463);
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
		enterRule(_localctx, 62, RULE_parameter_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(466);
				macro_call();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			modified_identifier();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(473);
				type_hint();
				}
			}

			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(476);
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
		enterRule(_localctx, 64, RULE_parameter_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OP_ASSIGN);
			setState(480);
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
		enterRule(_localctx, 66, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(482);
				match(OP_THROW);
				}
			}

			setState(485);
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
		enterRule(_localctx, 68, RULE_dot_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(487);
				match(OP_THROW);
				}
			}

			setState(490);
			match(DOT);
			setState(491);
			identifier();
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(492);
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
		enterRule(_localctx, 70, RULE_tuple_call_body);
		int _la;
		try {
			int _alt;
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(PARENTHESES_L);
				setState(496);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(PARENTHESES_L);
				setState(498);
				tuple_call_item();
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						match(COMMA);
						setState(500);
						tuple_call_item();
						}
						} 
					}
					setState(505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(506);
					match(COMMA);
					}
				}

				setState(509);
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
		enterRule(_localctx, 72, RULE_tuple_call_item);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				identifier();
				setState(514);
				match(COLON);
				setState(515);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
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
		enterRule(_localctx, 74, RULE_define_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(520);
				macro_call();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(KW_LAMBDA);
			setState(527);
			function_parameters();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(528);
				type_hint();
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(531);
				effect_hint();
				}
			}

			setState(534);
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
		enterRule(_localctx, 76, RULE_lambda_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(536);
				match(OP_THROW);
				}
			}

			setState(539);
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
		enterRule(_localctx, 78, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(BRACE_L);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53876070089024L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 134019133L) != 0)) {
				{
				{
				setState(542);
				function_statements();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 80, RULE_define_variale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(KW_LET);
			setState(551);
			identifier();
			setState(552);
			match(OP_ASSIGN);
			setState(553);
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
		enterRule(_localctx, 82, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(KW_IF);
			setState(556);
			inline_expression(0);
			setState(557);
			function_block();
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					else_if_statement();
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(564);
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
		enterRule(_localctx, 84, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(KW_ELSE);
			setState(568);
			match(KW_IF);
			setState(569);
			inline_expression(0);
			setState(570);
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
		enterRule(_localctx, 86, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(KW_ELSE);
			setState(573);
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
		enterRule(_localctx, 88, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(KW_WHILE);
			setState(576);
			inline_expression(0);
			setState(577);
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
		enterRule(_localctx, 90, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(KW_FOR);
			setState(580);
			for_pattern();
			setState(581);
			infix_in();
			setState(582);
			inline_expression(0);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(583);
				if_guard();
				}
			}

			setState(586);
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
		public List<For_parameterContext> for_parameter() {
			return getRuleContexts(For_parameterContext.class);
		}
		public For_parameterContext for_parameter(int i) {
			return getRuleContext(For_parameterContext.class,i);
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
		enterRule(_localctx, 92, RULE_for_pattern);
		int _la;
		try {
			int _alt;
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				case_tuple();
				}
				break;
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				for_parameter();
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						match(COMMA);
						setState(591);
						for_parameter();
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(597);
					match(COMMA);
					}
				}

				}
				break;
			case PARENTHESES_L:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(PARENTHESES_L);
				setState(601);
				for_parameter();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						match(COMMA);
						setState(603);
						for_parameter();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(609);
					match(COMMA);
					}
				}

				setState(612);
				match(PARENTHESES_R);
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
	public static class For_parameterContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public For_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).enterFor_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValkyrieAntlrListener ) ((ValkyrieAntlrListener)listener).exitFor_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValkyrieAntlrVisitor ) return ((ValkyrieAntlrVisitor<? extends T>)visitor).visitFor_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_parameterContext for_parameter() throws RecognitionException {
		For_parameterContext _localctx = new For_parameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_for_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(616);
				identifier();
				}
				}
				setState(619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RAW_ID || _la==UNICODE_ID );
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
		enterRule(_localctx, 96, RULE_if_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(KW_IF);
			setState(622);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case RESUME:
			case YIELD:
			case BREAK:
			case CONTINUE:
			case RAISE:
				{
				setState(625);
				control_expression();
				}
				break;
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
				{
				setState(626);
				prefix_call();
				setState(627);
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
				setState(629);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(654);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(633);
						op_multiple();
						setState(634);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(636);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(637);
						op_plus();
						setState(638);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(640);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(641);
						op_logic();
						setState(642);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(644);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(645);
						op_compare();
						setState(646);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(649);
						suffix_call();
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(650);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(651);
						infix_is();
						setState(652);
						type_expression(0);
						}
						break;
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_inline_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
				{
				setState(660);
				prefix_call();
				setState(661);
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
				setState(663);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(666);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(667);
						op_multiple();
						setState(668);
						inline_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(670);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(671);
						op_plus();
						setState(672);
						inline_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(674);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(675);
						op_logic();
						setState(676);
						inline_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(678);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(679);
						op_compare();
						setState(680);
						inline_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(682);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(683);
						infix_is();
						setState(684);
						inline_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Inline_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(686);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(687);
						dot_call();
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_type_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(694);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(702);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new TPatternContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(696);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(697);
						op_pattern();
						setState(698);
						type_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new TParensContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(700);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(701);
						generic_call_in_type();
						}
						break;
					}
					} 
				}
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 104, RULE_prefix_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372416512L) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_suffix_call);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(OP_NOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(OP_TEMPERATURE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				slice_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				offset_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				generic_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				lambda_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				match_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				catch_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				dot_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(718);
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
		enterRule(_localctx, 108, RULE_control_expression);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(RETURN);
				setState(722);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(RESUME);
				setState(724);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(BREAK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				match(CONTINUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				match(RAISE);
				setState(728);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				match(YIELD);
				setState(731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(730);
					match(RETURN);
					}
					break;
				}
				setState(733);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(734);
				match(YIELD);
				setState(735);
				match(BREAK);
				setState(736);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				match(YIELD);
				setState(738);
				match(KW_WITH);
				setState(739);
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
		enterRule(_localctx, 110, RULE_term);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				try_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				new_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				string_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				number_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				namepath();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				match(PARENTHESES_L);
				setState(750);
				expression(0);
				setState(751);
				match(PARENTHESES_R);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(753);
				match(BRACKET_L);
				setState(754);
				expression(0);
				setState(755);
				match(BRACKET_R);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(757);
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
		enterRule(_localctx, 112, RULE_op_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
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
		enterRule(_localctx, 114, RULE_op_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
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
		enterRule(_localctx, 116, RULE_op_multiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
		enterRule(_localctx, 118, RULE_op_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
		enterRule(_localctx, 120, RULE_op_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
		enterRule(_localctx, 122, RULE_infix_is);
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(KW_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(KW_IS);
				setState(772);
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
		enterRule(_localctx, 124, RULE_infix_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
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
		enterRule(_localctx, 126, RULE_define_generic);
		int _la;
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
			case OP_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(777);
					match(OP_PROPORTION);
					}
				}

				setState(780);
				match(OP_LT);
				setState(781);
				identifier();
				setState(782);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(GENERIC_L);
				setState(785);
				identifier();
				setState(786);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 128, RULE_generic_call);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(OP_PROPORTION);
				setState(791);
				match(OP_LT);
				setState(792);
				identifier();
				setState(793);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(GENERIC_L);
				setState(796);
				identifier();
				setState(797);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 130, RULE_generic_call_in_type);
		int _la;
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
			case OP_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(801);
					match(OP_PROPORTION);
					}
				}

				setState(804);
				match(OP_LT);
				setState(805);
				identifier();
				setState(806);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(GENERIC_L);
				setState(809);
				identifier();
				setState(810);
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
		enterRule(_localctx, 132, RULE_slice_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(BRACKET_L);
			setState(815);
			expression(0);
			setState(816);
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
		enterRule(_localctx, 134, RULE_offset_call);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(OP_PROPORTION);
				setState(819);
				match(BRACKET_L);
				setState(820);
				expression(0);
				setState(821);
				match(BRACKET_R);
				}
				break;
			case OFFSET_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(OFFSET_L);
				setState(824);
				expression(0);
				setState(825);
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
		enterRule(_localctx, 136, RULE_macro_call);
		int _la;
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(HASH);
				setState(830);
				macro_call_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(HASH);
				setState(832);
				match(BRACKET_L);
				setState(833);
				macro_call_item();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(834);
					match(COMMA);
					setState(835);
					macro_call_item();
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
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
		enterRule(_localctx, 138, RULE_macro_call_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			namepath();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(846);
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
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
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
		enterRule(_localctx, 140, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(KW_TRY);
			setState(850);
			type_expression(0);
			setState(851);
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
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
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
		enterRule(_localctx, 142, RULE_match_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(853);
				match(OP_THROW);
				}
			}

			setState(856);
			match(DOT);
			setState(857);
			match(KW_MATCH);
			setState(858);
			type_expression(0);
			setState(859);
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
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode OP_THROW() { return getToken(ValkyrieAntlrParser.OP_THROW, 0); }
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
		enterRule(_localctx, 144, RULE_catch_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_THROW) {
				{
				setState(861);
				match(OP_THROW);
				}
			}

			setState(864);
			match(DOT);
			setState(865);
			match(KW_CATCH);
			setState(866);
			type_expression(0);
			setState(867);
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
		enterRule(_localctx, 146, RULE_match_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(BRACE_L);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511627788L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 131L) != 0)) {
				{
				{
				setState(870);
				match_statement();
				}
				}
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(876);
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
		enterRule(_localctx, 148, RULE_match_statement);
		try {
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				when_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				else_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				case_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
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
		enterRule(_localctx, 150, RULE_with_block);
		int _la;
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HASH) {
					{
					{
					setState(884);
					macro_call();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(890);
				match(KW_WITH);
				setState(891);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(KW_WITH);
				setState(893);
				match(BRACKET_L);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(894);
					identifier();
					}
				}

				setState(897);
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
		enterRule(_localctx, 152, RULE_when_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(900);
				macro_call();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			match(KW_WHEN);
			setState(907);
			inline_expression(0);
			setState(908);
			match(COLON);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(909);
					expression(0);
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 154, RULE_else_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(915);
				macro_call();
				}
				}
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(921);
			match(KW_ELSE);
			setState(922);
			match(COLON);
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(923);
					expression(0);
					}
					} 
				}
				setState(928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 156, RULE_case_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(929);
				macro_call();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			case_tuple();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(936);
				if_guard();
				}
			}

			setState(939);
			match(COLON);
			setState(943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(940);
					expression(0);
					}
					} 
				}
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		public TerminalNode KW_CASE() { return getToken(ValkyrieAntlrParser.KW_CASE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
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
		enterRule(_localctx, 158, RULE_case_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(KW_CASE);
			setState(947);
			identifier();
			setState(948);
			match(PARENTHESES_L);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(949);
				identifier();
				}
			}

			setState(952);
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
		enterRule(_localctx, 160, RULE_new_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(954);
				macro_call();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			match(KW_NEW);
			setState(961);
			modified_namepath();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16781328L) != 0)) {
				{
				setState(962);
				generic_call_in_type();
				}
			}

			setState(965);
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
		enterRule(_localctx, 162, RULE_new_body);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTHESES_L) {
					{
					setState(967);
					tuple_call_body();
					}
				}

				setState(970);
				new_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
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
		enterRule(_localctx, 164, RULE_new_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(BRACE_L);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53876070089036L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 8376195L) != 0)) {
				{
				{
				setState(975);
				new_statement();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
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
		enterRule(_localctx, 166, RULE_new_statement);
		try {
			setState(985);
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
				setState(983);
				tuple_call_item();
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
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
		enterRule(_localctx, 168, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(987);
				identifier();
				}
				}
				setState(992);
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
		enterRule(_localctx, 170, RULE_modified_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(994); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(993);
					identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(996); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		enterRule(_localctx, 172, RULE_modified_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(998);
				identifier();
				}
				}
				setState(1001); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RAW_ID || _la==UNICODE_ID );
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1003);
					match(OP_PROPORTION);
					setState(1004);
					identifier();
					}
					} 
				}
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		enterRule(_localctx, 174, RULE_namepath_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			identifier();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OP_PROPORTION) {
				{
				{
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==OP_PROPORTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1012);
				identifier();
				}
				}
				setState(1017);
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
		enterRule(_localctx, 176, RULE_namepath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			identifier();
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1019);
					match(OP_PROPORTION);
					setState(1020);
					identifier();
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		enterRule(_localctx, 178, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
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
		enterRule(_localctx, 180, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
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
		enterRule(_localctx, 182, RULE_number_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			number();
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1031);
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
		enterRule(_localctx, 184, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 186, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(1036);
				identifier();
				}
			}

			setState(1039);
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
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return inline_expression_sempred((Inline_expressionContext)_localctx, predIndex);
		case 51:
			return type_expression_sempred((Type_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean inline_expression_sempred(Inline_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean type_expression_sempred(Type_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001c\u0412\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0001\u0000\u0005"+
		"\u0000\u00be\b\u0000\n\u0000\f\u0000\u00c1\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c8\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00cc\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00d0\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00d4\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00d8\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00dc\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00e0\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00e4\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00e8\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ec\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00f0\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00f4\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00f8"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00fc\b\u0001\u0003\u0001"+
		"\u00fe\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u0102\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0106\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u010a\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u010e\b\u0002"+
		"\u0003\u0002\u0110\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0119\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u0121"+
		"\b\b\n\b\f\b\u0124\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012a\b"+
		"\b\u0001\b\u0003\b\u012d\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u0133"+
		"\b\t\n\t\f\t\u0136\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u013d\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0141\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0005\f\u0146\b\f\n\f\f\f\u0149\t\f\u0001\f\u0001"+
		"\f\u0003\f\u014d\b\f\u0001\f\u0003\f\u0150\b\f\u0001\r\u0005\r\u0153\b"+
		"\r\n\r\f\r\u0156\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u015b\b\r\u0001\r"+
		"\u0003\r\u015e\b\r\u0001\r\u0003\r\u0161\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0174\b\u0011\n\u0011\f\u0011"+
		"\u0177\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u017e\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0182\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0186\b\u0014\n\u0014\f\u0014"+
		"\u0189\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u018f\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0197\b\u0017\n\u0017\f\u0017\u019a\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u01a0\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01a5\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0005\u001d\u01b3"+
		"\b\u001d\n\u001d\f\u001d\u01b6\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01bd\b\u001d\u0001\u001d\u0003\u001d"+
		"\u01c0\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u01c8\b\u001e\n\u001e\f\u001e\u01cb\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01d1\b\u001e\u0001"+
		"\u001f\u0005\u001f\u01d4\b\u001f\n\u001f\f\u001f\u01d7\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01db\b\u001f\u0001\u001f\u0003\u001f\u01de\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001!\u0003!\u01e4\b!\u0001!\u0001!\u0001"+
		"\"\u0003\"\u01e9\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u01ee\b\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u01f6\b#\n#\f#\u01f9\t#\u0001"+
		"#\u0003#\u01fc\b#\u0001#\u0001#\u0003#\u0200\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0207\b$\u0001%\u0005%\u020a\b%\n%\f%\u020d\t%\u0001%"+
		"\u0001%\u0001%\u0003%\u0212\b%\u0001%\u0003%\u0215\b%\u0001%\u0001%\u0001"+
		"&\u0003&\u021a\b&\u0001&\u0001&\u0001\'\u0001\'\u0005\'\u0220\b\'\n\'"+
		"\f\'\u0223\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0230\b)\n)\f)\u0233\t)\u0001)\u0003)\u0236"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0249\b-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0005.\u0251\b.\n.\f.\u0254\t.\u0001"+
		".\u0003.\u0257\b.\u0001.\u0001.\u0001.\u0001.\u0005.\u025d\b.\n.\f.\u0260"+
		"\t.\u0001.\u0003.\u0263\b.\u0001.\u0001.\u0003.\u0267\b.\u0001/\u0004"+
		"/\u026a\b/\u000b/\f/\u026b\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0277\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u028f\b1\n1\f1\u0292"+
		"\t1\u00012\u00012\u00012\u00012\u00012\u00032\u0299\b2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0005"+
		"2\u02b1\b2\n2\f2\u02b4\t2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u02bf\b3\n3\f3\u02c2\t3\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02d0"+
		"\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u02dc\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u02e5\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u02f7\b7\u0001"+
		"8\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0003=\u0306\b=\u0001>\u0001>\u0001?\u0003?\u030b\b?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0315\b?\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0320"+
		"\b@\u0001A\u0003A\u0323\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u032d\bA\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u033c\bC\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u0345\bD\nD\fD\u0348\tD\u0001"+
		"D\u0001D\u0003D\u034c\bD\u0001E\u0001E\u0003E\u0350\bE\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0003G\u0357\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"H\u0003H\u035f\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0005"+
		"I\u0368\bI\nI\fI\u036b\tI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0003"+
		"J\u0373\bJ\u0001K\u0005K\u0376\bK\nK\fK\u0379\tK\u0001K\u0001K\u0001K"+
		"\u0001K\u0001K\u0003K\u0380\bK\u0001K\u0003K\u0383\bK\u0001L\u0005L\u0386"+
		"\bL\nL\fL\u0389\tL\u0001L\u0001L\u0001L\u0001L\u0005L\u038f\bL\nL\fL\u0392"+
		"\tL\u0001M\u0005M\u0395\bM\nM\fM\u0398\tM\u0001M\u0001M\u0001M\u0005M"+
		"\u039d\bM\nM\fM\u03a0\tM\u0001N\u0005N\u03a3\bN\nN\fN\u03a6\tN\u0001N"+
		"\u0001N\u0003N\u03aa\bN\u0001N\u0001N\u0005N\u03ae\bN\nN\fN\u03b1\tN\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u03b7\bO\u0001O\u0001O\u0001P\u0005P\u03bc"+
		"\bP\nP\fP\u03bf\tP\u0001P\u0001P\u0001P\u0003P\u03c4\bP\u0001P\u0001P"+
		"\u0001Q\u0003Q\u03c9\bQ\u0001Q\u0001Q\u0003Q\u03cd\bQ\u0001R\u0001R\u0005"+
		"R\u03d1\bR\nR\fR\u03d4\tR\u0001R\u0001R\u0001S\u0001S\u0003S\u03da\bS"+
		"\u0001T\u0005T\u03dd\bT\nT\fT\u03e0\tT\u0001U\u0004U\u03e3\bU\u000bU\f"+
		"U\u03e4\u0001V\u0004V\u03e8\bV\u000bV\fV\u03e9\u0001V\u0001V\u0005V\u03ee"+
		"\bV\nV\fV\u03f1\tV\u0001W\u0001W\u0001W\u0005W\u03f6\bW\nW\fW\u03f9\t"+
		"W\u0001X\u0001X\u0001X\u0005X\u03fe\bX\nX\fX\u0401\tX\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001[\u0001[\u0003[\u0409\b[\u0001\\\u0001\\\u0001]\u0003]\u040e"+
		"\b]\u0001]\u0001]\u0001]\u0000\u0003bdf^\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u0000\r\u0001\u0000\u0002\u0003\u0002\u0000\u0005\u0005  \u0003\u0000"+
		"\u0010\u0010\u0012\u0012--\u0003\u0000\u0016\u0018\u001b\u001c\u001f\u001f"+
		"\u0002\u0000$$&&\u0001\u0000\u0014\u0015\u0002\u0000\u0010\u0010\u0012"+
		"\u0012\u0002\u0000##%%\u0001\u0000/0\u0002\u0000\u0001\u0001\u0004\u0004"+
		"\u0001\u0000^_\u0001\u0000PQ\u0001\u0000RS\u0461\u0000\u00bf\u0001\u0000"+
		"\u0000\u0000\u0002\u00fd\u0001\u0000\u0000\u0000\u0004\u010f\u0001\u0000"+
		"\u0000\u0000\u0006\u0111\u0001\u0000\u0000\u0000\b\u0113\u0001\u0000\u0000"+
		"\u0000\n\u0115\u0001\u0000\u0000\u0000\f\u011a\u0001\u0000\u0000\u0000"+
		"\u000e\u011d\u0001\u0000\u0000\u0000\u0010\u0122\u0001\u0000\u0000\u0000"+
		"\u0012\u0130\u0001\u0000\u0000\u0000\u0014\u013c\u0001\u0000\u0000\u0000"+
		"\u0016\u013e\u0001\u0000\u0000\u0000\u0018\u0147\u0001\u0000\u0000\u0000"+
		"\u001a\u0154\u0001\u0000\u0000\u0000\u001c\u0162\u0001\u0000\u0000\u0000"+
		"\u001e\u0166\u0001\u0000\u0000\u0000 \u016d\u0001\u0000\u0000\u0000\""+
		"\u0171\u0001\u0000\u0000\u0000$\u017d\u0001\u0000\u0000\u0000&\u017f\u0001"+
		"\u0000\u0000\u0000(\u0183\u0001\u0000\u0000\u0000*\u018e\u0001\u0000\u0000"+
		"\u0000,\u0190\u0001\u0000\u0000\u0000.\u0194\u0001\u0000\u0000\u00000"+
		"\u019f\u0001\u0000\u0000\u00002\u01a1\u0001\u0000\u0000\u00004\u01a6\u0001"+
		"\u0000\u0000\u00006\u01ab\u0001\u0000\u0000\u00008\u01ae\u0001\u0000\u0000"+
		"\u0000:\u01b4\u0001\u0000\u0000\u0000<\u01d0\u0001\u0000\u0000\u0000>"+
		"\u01d5\u0001\u0000\u0000\u0000@\u01df\u0001\u0000\u0000\u0000B\u01e3\u0001"+
		"\u0000\u0000\u0000D\u01e8\u0001\u0000\u0000\u0000F\u01ff\u0001\u0000\u0000"+
		"\u0000H\u0206\u0001\u0000\u0000\u0000J\u020b\u0001\u0000\u0000\u0000L"+
		"\u0219\u0001\u0000\u0000\u0000N\u021d\u0001\u0000\u0000\u0000P\u0226\u0001"+
		"\u0000\u0000\u0000R\u022b\u0001\u0000\u0000\u0000T\u0237\u0001\u0000\u0000"+
		"\u0000V\u023c\u0001\u0000\u0000\u0000X\u023f\u0001\u0000\u0000\u0000Z"+
		"\u0243\u0001\u0000\u0000\u0000\\\u0266\u0001\u0000\u0000\u0000^\u0269"+
		"\u0001\u0000\u0000\u0000`\u026d\u0001\u0000\u0000\u0000b\u0276\u0001\u0000"+
		"\u0000\u0000d\u0298\u0001\u0000\u0000\u0000f\u02b5\u0001\u0000\u0000\u0000"+
		"h\u02c3\u0001\u0000\u0000\u0000j\u02cf\u0001\u0000\u0000\u0000l\u02e4"+
		"\u0001\u0000\u0000\u0000n\u02f6\u0001\u0000\u0000\u0000p\u02f8\u0001\u0000"+
		"\u0000\u0000r\u02fa\u0001\u0000\u0000\u0000t\u02fc\u0001\u0000\u0000\u0000"+
		"v\u02fe\u0001\u0000\u0000\u0000x\u0300\u0001\u0000\u0000\u0000z\u0305"+
		"\u0001\u0000\u0000\u0000|\u0307\u0001\u0000\u0000\u0000~\u0314\u0001\u0000"+
		"\u0000\u0000\u0080\u031f\u0001\u0000\u0000\u0000\u0082\u032c\u0001\u0000"+
		"\u0000\u0000\u0084\u032e\u0001\u0000\u0000\u0000\u0086\u033b\u0001\u0000"+
		"\u0000\u0000\u0088\u034b\u0001\u0000\u0000\u0000\u008a\u034d\u0001\u0000"+
		"\u0000\u0000\u008c\u0351\u0001\u0000\u0000\u0000\u008e\u0356\u0001\u0000"+
		"\u0000\u0000\u0090\u035e\u0001\u0000\u0000\u0000\u0092\u0365\u0001\u0000"+
		"\u0000\u0000\u0094\u0372\u0001\u0000\u0000\u0000\u0096\u0382\u0001\u0000"+
		"\u0000\u0000\u0098\u0387\u0001\u0000\u0000\u0000\u009a\u0396\u0001\u0000"+
		"\u0000\u0000\u009c\u03a4\u0001\u0000\u0000\u0000\u009e\u03b2\u0001\u0000"+
		"\u0000\u0000\u00a0\u03bd\u0001\u0000\u0000\u0000\u00a2\u03cc\u0001\u0000"+
		"\u0000\u0000\u00a4\u03ce\u0001\u0000\u0000\u0000\u00a6\u03d9\u0001\u0000"+
		"\u0000\u0000\u00a8\u03de\u0001\u0000\u0000\u0000\u00aa\u03e2\u0001\u0000"+
		"\u0000\u0000\u00ac\u03e7\u0001\u0000\u0000\u0000\u00ae\u03f2\u0001\u0000"+
		"\u0000\u0000\u00b0\u03fa\u0001\u0000\u0000\u0000\u00b2\u0402\u0001\u0000"+
		"\u0000\u0000\u00b4\u0404\u0001\u0000\u0000\u0000\u00b6\u0406\u0001\u0000"+
		"\u0000\u0000\u00b8\u040a\u0001\u0000\u0000\u0000\u00ba\u040d\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0003\u0002\u0001\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0000"+
		"\u0000\u0001\u00c3\u0001\u0001\u0000\u0000\u0000\u00c4\u00fe\u0003\n\u0005"+
		"\u0000\u00c5\u00c7\u0003\f\u0006\u0000\u00c6\u00c8\u0003\u0006\u0003\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00fe\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u000e\u0007\u0000"+
		"\u00ca\u00cc\u0003\u0006\u0003\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cf\u0003\u0010\b\u0000\u00ce\u00d0\u0003\u0006\u0003\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00fe\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003 \u0010\u0000\u00d2\u00d4"+
		"\u0003\u0006\u0003\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00fe\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0003,\u0016\u0000\u00d6\u00d8\u0003\u0006\u0003\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00fe\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0003\u001c\u000e\u0000\u00da\u00dc\u0003"+
		"\u0006\u0003\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00fe\u0001\u0000\u0000\u0000\u00dd\u00df\u0003"+
		"\u001e\u000f\u0000\u00de\u00e0\u0003\u0006\u0003\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00fe\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0003:\u001d\u0000\u00e2\u00e4\u0003\u0006"+
		"\u0003\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00fe\u0001\u0000\u0000\u0000\u00e5\u00e7\u00034\u001a"+
		"\u0000\u00e6\u00e8\u0003\u0006\u0003\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00fe\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0003P(\u0000\u00ea\u00ec\u0003\u0006\u0003\u0000\u00eb"+
		"\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00fe\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003R)\u0000\u00ee\u00f0\u0003"+
		"\u0006\u0003\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00fe\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003"+
		"X,\u0000\u00f2\u00f4\u0003\u0006\u0003\u0000\u00f3\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00fe\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0003Z-\u0000\u00f6\u00f8\u0003\u0006\u0003\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003b1\u0000\u00fa\u00fc\u0003"+
		"\u0006\u0003\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00c4\u0001"+
		"\u0000\u0000\u0000\u00fd\u00c5\u0001\u0000\u0000\u0000\u00fd\u00c9\u0001"+
		"\u0000\u0000\u0000\u00fd\u00cd\u0001\u0000\u0000\u0000\u00fd\u00d1\u0001"+
		"\u0000\u0000\u0000\u00fd\u00d5\u0001\u0000\u0000\u0000\u00fd\u00d9\u0001"+
		"\u0000\u0000\u0000\u00fd\u00dd\u0001\u0000\u0000\u0000\u00fd\u00e1\u0001"+
		"\u0000\u0000\u0000\u00fd\u00e5\u0001\u0000\u0000\u0000\u00fd\u00e9\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ed\u0001\u0000\u0000\u0000\u00fd\u00f1\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fe\u0003\u0001\u0000\u0000\u0000\u00ff\u0101\u0003"+
		"J%\u0000\u0100\u0102\u0003\u0006\u0003\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0110\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0003X,\u0000\u0104\u0106\u0003\u0006\u0003\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0110\u0001\u0000\u0000\u0000\u0107\u0109\u0003Z-\u0000\u0108\u010a\u0003"+
		"\u0006\u0003\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u0110\u0001\u0000\u0000\u0000\u010b\u010d\u0003"+
		"b1\u0000\u010c\u010e\u0003\u0006\u0003\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u00ff\u0001\u0000\u0000\u0000\u010f\u0103\u0001\u0000\u0000"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000"+
		"\u0000\u0110\u0005\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0003\u0000"+
		"\u0000\u0112\u0007\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0000\u0000"+
		"\u0000\u0114\t\u0001\u0000\u0000\u0000\u0115\u0116\u0005:\u0000\u0000"+
		"\u0116\u0118\u0003\u00aeW\u0000\u0117\u0119\u0003\u0006\u0003\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u000b\u0001\u0000\u0000\u0000\u011a\u011b\u0005;\u0000\u0000\u011b\u011c"+
		"\u0003\u00aeW\u0000\u011c\r\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"<\u0000\u0000\u011e\u000f\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0088"+
		"D\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0003\u00a8T\u0000\u0126\u0127\u0005>\u0000\u0000\u0127"+
		"\u0129\u0003\u00b2Y\u0000\u0128\u012a\u0003~?\u0000\u0129\u0128\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0003\u0016\u000b\u0000\u012c\u012b\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0003\u0012\t\u0000\u012f\u0011\u0001\u0000"+
		"\u0000\u0000\u0130\u0134\u0005\n\u0000\u0000\u0131\u0133\u0003\u0014\n"+
		"\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\u000b\u0000\u0000\u0138\u0013\u0001\u0000\u0000"+
		"\u0000\u0139\u013d\u0003\u001a\r\u0000\u013a\u013d\u0003\u0018\f\u0000"+
		"\u013b\u013d\u0003\b\u0004\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u0015\u0001\u0000\u0000\u0000\u013e\u0140\u0005\u0006\u0000\u0000\u013f"+
		"\u0141\u0003\u00b0X\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0007\u0000\u0000\u0143\u0017\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u0003\u0088D\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u0003\u00aaU\u0000\u014b\u014d\u00036\u001b"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0150\u0003@ \u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u0019\u0001\u0000\u0000\u0000\u0151\u0153\u0003\u0088D\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0003\u00acV\u0000\u0158\u015a\u0003<\u001e\u0000\u0159\u015b\u00036"+
		"\u001b\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015e\u00038\u001c"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0161\u0003N\'\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u001b\u0001\u0000\u0000\u0000\u0162\u0163\u0005?\u0000\u0000\u0163"+
		"\u0164\u0003\u00b2Y\u0000\u0164\u0165\u0003\u0012\t\u0000\u0165\u001d"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0005=\u0000\u0000\u0167\u0168\u0003"+
		"\u00b0X\u0000\u0168\u0169\u0005\u0005\u0000\u0000\u0169\u016a\u0003f3"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0003\u0012\t\u0000"+
		"\u016c\u001f\u0001\u0000\u0000\u0000\u016d\u016e\u0005@\u0000\u0000\u016e"+
		"\u016f\u0003\u00b2Y\u0000\u016f\u0170\u0003\"\u0011\u0000\u0170!\u0001"+
		"\u0000\u0000\u0000\u0171\u0175\u0005\n\u0000\u0000\u0172\u0174\u0003$"+
		"\u0012\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005\u000b\u0000\u0000\u0179#\u0001\u0000\u0000"+
		"\u0000\u017a\u017e\u0003\u001a\r\u0000\u017b\u017e\u0003&\u0013\u0000"+
		"\u017c\u017e\u0003\b\u0004\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e"+
		"%\u0001\u0000\u0000\u0000\u017f\u0181\u0003\u00b2Y\u0000\u0180\u0182\u0003"+
		"(\u0014\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\'\u0001\u0000\u0000\u0000\u0183\u0187\u0005\n\u0000"+
		"\u0000\u0184\u0186\u0003*\u0015\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u000b\u0000\u0000"+
		"\u018b)\u0001\u0000\u0000\u0000\u018c\u018f\u0003\u0018\f\u0000\u018d"+
		"\u018f\u0003\b\u0004\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018f+\u0001\u0000\u0000\u0000\u0190\u0191\u0005"+
		"A\u0000\u0000\u0191\u0192\u0003\u00b0X\u0000\u0192\u0193\u0003.\u0017"+
		"\u0000\u0193-\u0001\u0000\u0000\u0000\u0194\u0198\u0005\n\u0000\u0000"+
		"\u0195\u0197\u00030\u0018\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197"+
		"\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a"+
		"\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u000b\u0000\u0000\u019c"+
		"/\u0001\u0000\u0000\u0000\u019d\u01a0\u00032\u0019\u0000\u019e\u01a0\u0003"+
		"\b\u0004\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000"+
		"\u0000\u0000\u01a01\u0001\u0000\u0000\u0000\u01a1\u01a4\u0003\u00b2Y\u0000"+
		"\u01a2\u01a3\u0005\"\u0000\u0000\u01a3\u01a5\u0003b1\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a53\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005B\u0000\u0000\u01a7\u01a8\u0003\u00b2"+
		"Y\u0000\u01a8\u01a9\u0005\"\u0000\u0000\u01a9\u01aa\u0003\u00b2Y\u0000"+
		"\u01aa5\u0001\u0000\u0000\u0000\u01ab\u01ac\u0007\u0001\u0000\u0000\u01ac"+
		"\u01ad\u0003f3\u0000\u01ad7\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"\u0015\u0000\u0000\u01af\u01b0\u0003f3\u0000\u01b09\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0003\u0088D\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003\u00a8T\u0000\u01b8"+
		"\u01b9\u0005D\u0000\u0000\u01b9\u01ba\u0003\u00b0X\u0000\u01ba\u01bc\u0003"+
		"<\u001e\u0000\u01bb\u01bd\u00036\u001b\u0000\u01bc\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000"+
		"\u0000\u01be\u01c0\u00038\u001c\u0000\u01bf\u01be\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0003N\'\u0000\u01c2;\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0005\u0006\u0000\u0000\u01c4\u01c9\u0003>\u001f\u0000\u01c5\u01c6\u0005"+
		"\u0002\u0000\u0000\u01c6\u01c8\u0003>\u001f\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0007"+
		"\u0000\u0000\u01cd\u01d1\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0006"+
		"\u0000\u0000\u01cf\u01d1\u0005\u0007\u0000\u0000\u01d0\u01c3\u0001\u0000"+
		"\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1=\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d4\u0003\u0088D\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01da\u0003\u00aaU\u0000\u01d9"+
		"\u01db\u00036\u001b\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01de"+
		"\u0003@ \u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de?\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\"\u0000"+
		"\u0000\u01e0\u01e1\u0003b1\u0000\u01e1A\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e4\u0005,\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0003F#\u0000\u01e6C\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005,\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u0001\u0000"+
		"\u0000\u01eb\u01ed\u0003\u00b2Y\u0000\u01ec\u01ee\u0003F#\u0000\u01ed"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"E\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u0006\u0000\u0000\u01f0\u0200"+
		"\u0005\u0007\u0000\u0000\u01f1\u01f2\u0005\u0006\u0000\u0000\u01f2\u01f7"+
		"\u0003H$\u0000\u01f3\u01f4\u0005\u0002\u0000\u0000\u01f4\u01f6\u0003H"+
		"$\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fc\u0005\u0002\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005\u0007\u0000\u0000\u01fe\u0200\u0001\u0000\u0000"+
		"\u0000\u01ff\u01ef\u0001\u0000\u0000\u0000\u01ff\u01f1\u0001\u0000\u0000"+
		"\u0000\u0200G\u0001\u0000\u0000\u0000\u0201\u0202\u0003\u00b2Y\u0000\u0202"+
		"\u0203\u0005\u0005\u0000\u0000\u0203\u0204\u0003b1\u0000\u0204\u0207\u0001"+
		"\u0000\u0000\u0000\u0205\u0207\u0003b1\u0000\u0206\u0201\u0001\u0000\u0000"+
		"\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207I\u0001\u0000\u0000\u0000"+
		"\u0208\u020a\u0003\u0088D\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a"+
		"\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0001\u0000\u0000\u0000\u020c\u020e\u0001\u0000\u0000\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020e\u020f\u0005E\u0000\u0000\u020f\u0211"+
		"\u0003<\u001e\u0000\u0210\u0212\u00036\u001b\u0000\u0211\u0210\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000"+
		"\u0000\u0000\u0213\u0215\u00038\u001c\u0000\u0214\u0213\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0003N\'\u0000\u0217K\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u0005,\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0003N\'\u0000\u021cM\u0001\u0000\u0000\u0000\u021d\u0221\u0005\n\u0000"+
		"\u0000\u021e\u0220\u0003\u0004\u0002\u0000\u021f\u021e\u0001\u0000\u0000"+
		"\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u000b\u0000"+
		"\u0000\u0225O\u0001\u0000\u0000\u0000\u0226\u0227\u0005C\u0000\u0000\u0227"+
		"\u0228\u0003\u00b2Y\u0000\u0228\u0229\u0005\"\u0000\u0000\u0229\u022a"+
		"\u0003b1\u0000\u022aQ\u0001\u0000\u0000\u0000\u022b\u022c\u0005T\u0000"+
		"\u0000\u022c\u022d\u0003d2\u0000\u022d\u0231\u0003N\'\u0000\u022e\u0230"+
		"\u0003T*\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000"+
		"\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u0003V+\u0000\u0235\u0234\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236S\u0001\u0000\u0000\u0000\u0237"+
		"\u0238\u0005U\u0000\u0000\u0238\u0239\u0005T\u0000\u0000\u0239\u023a\u0003"+
		"d2\u0000\u023a\u023b\u0003N\'\u0000\u023bU\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0005U\u0000\u0000\u023d\u023e\u0003N\'\u0000\u023eW\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0005G\u0000\u0000\u0240\u0241\u0003d2\u0000"+
		"\u0241\u0242\u0003N\'\u0000\u0242Y\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0005H\u0000\u0000\u0244\u0245\u0003\\.\u0000\u0245\u0246\u0003|>\u0000"+
		"\u0246\u0248\u0003d2\u0000\u0247\u0249\u0003`0\u0000\u0248\u0247\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0003N\'\u0000\u024b[\u0001\u0000\u0000"+
		"\u0000\u024c\u0267\u0003\u009eO\u0000\u024d\u0252\u0003^/\u0000\u024e"+
		"\u024f\u0005\u0002\u0000\u0000\u024f\u0251\u0003^/\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0256\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0257\u0005"+
		"\u0002\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257\u0001"+
		"\u0000\u0000\u0000\u0257\u0267\u0001\u0000\u0000\u0000\u0258\u0259\u0005"+
		"\u0006\u0000\u0000\u0259\u025e\u0003^/\u0000\u025a\u025b\u0005\u0002\u0000"+
		"\u0000\u025b\u025d\u0003^/\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d"+
		"\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260"+
		"\u025e\u0001\u0000\u0000\u0000\u0261\u0263\u0005\u0002\u0000\u0000\u0262"+
		"\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0007\u0000\u0000\u0265"+
		"\u0267\u0001\u0000\u0000\u0000\u0266\u024c\u0001\u0000\u0000\u0000\u0266"+
		"\u024d\u0001\u0000\u0000\u0000\u0266\u0258\u0001\u0000\u0000\u0000\u0267"+
		"]\u0001\u0000\u0000\u0000\u0268\u026a\u0003\u00b2Y\u0000\u0269\u0268\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u0269\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c_\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0005T\u0000\u0000\u026e\u026f\u0003d2\u0000"+
		"\u026fa\u0001\u0000\u0000\u0000\u0270\u0271\u00061\uffff\uffff\u0000\u0271"+
		"\u0277\u0003l6\u0000\u0272\u0273\u0003h4\u0000\u0273\u0274\u0003b1\u0002"+
		"\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0277\u0003n7\u0000\u0276\u0270"+
		"\u0001\u0000\u0000\u0000\u0276\u0272\u0001\u0000\u0000\u0000\u0276\u0275"+
		"\u0001\u0000\u0000\u0000\u0277\u0290\u0001\u0000\u0000\u0000\u0278\u0279"+
		"\n\b\u0000\u0000\u0279\u027a\u0003t:\u0000\u027a\u027b\u0003b1\t\u027b"+
		"\u028f\u0001\u0000\u0000\u0000\u027c\u027d\n\u0007\u0000\u0000\u027d\u027e"+
		"\u0003v;\u0000\u027e\u027f\u0003b1\b\u027f\u028f\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\n\u0006\u0000\u0000\u0281\u0282\u0003x<\u0000\u0282\u0283"+
		"\u0003b1\u0007\u0283\u028f\u0001\u0000\u0000\u0000\u0284\u0285\n\u0005"+
		"\u0000\u0000\u0285\u0286\u0003p8\u0000\u0286\u0287\u0003b1\u0006\u0287"+
		"\u028f\u0001\u0000\u0000\u0000\u0288\u0289\n\t\u0000\u0000\u0289\u028f"+
		"\u0003j5\u0000\u028a\u028b\n\u0004\u0000\u0000\u028b\u028c\u0003z=\u0000"+
		"\u028c\u028d\u0003f3\u0000\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u0278"+
		"\u0001\u0000\u0000\u0000\u028e\u027c\u0001\u0000\u0000\u0000\u028e\u0280"+
		"\u0001\u0000\u0000\u0000\u028e\u0284\u0001\u0000\u0000\u0000\u028e\u0288"+
		"\u0001\u0000\u0000\u0000\u028e\u028a\u0001\u0000\u0000\u0000\u028f\u0292"+
		"\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0001\u0000\u0000\u0000\u0291c\u0001\u0000\u0000\u0000\u0292\u0290\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u00062\uffff\uffff\u0000\u0294\u0295\u0003"+
		"h4\u0000\u0295\u0296\u0003d2\u0002\u0296\u0299\u0001\u0000\u0000\u0000"+
		"\u0297\u0299\u0003n7\u0000\u0298\u0293\u0001\u0000\u0000\u0000\u0298\u0297"+
		"\u0001\u0000\u0000\u0000\u0299\u02b2\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\n\u0007\u0000\u0000\u029b\u029c\u0003t:\u0000\u029c\u029d\u0003d2\b\u029d"+
		"\u02b1\u0001\u0000\u0000\u0000\u029e\u029f\n\u0006\u0000\u0000\u029f\u02a0"+
		"\u0003v;\u0000\u02a0\u02a1\u0003d2\u0007\u02a1\u02b1\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a3\n\u0005\u0000\u0000\u02a3\u02a4\u0003x<\u0000\u02a4"+
		"\u02a5\u0003d2\u0006\u02a5\u02b1\u0001\u0000\u0000\u0000\u02a6\u02a7\n"+
		"\u0004\u0000\u0000\u02a7\u02a8\u0003p8\u0000\u02a8\u02a9\u0003d2\u0005"+
		"\u02a9\u02b1\u0001\u0000\u0000\u0000\u02aa\u02ab\n\u0003\u0000\u0000\u02ab"+
		"\u02ac\u0003z=\u0000\u02ac\u02ad\u0003d2\u0004\u02ad\u02b1\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\n\b\u0000\u0000\u02af\u02b1\u0003D\"\u0000\u02b0"+
		"\u029a\u0001\u0000\u0000\u0000\u02b0\u029e\u0001\u0000\u0000\u0000\u02b0"+
		"\u02a2\u0001\u0000\u0000\u0000\u02b0\u02a6\u0001\u0000\u0000\u0000\u02b0"+
		"\u02aa\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b3e\u0001\u0000\u0000\u0000\u02b4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u00063\uffff\uffff\u0000\u02b6\u02b7"+
		"\u0003n7\u0000\u02b7\u02c0\u0001\u0000\u0000\u0000\u02b8\u02b9\n\u0003"+
		"\u0000\u0000\u02b9\u02ba\u0003r9\u0000\u02ba\u02bb\u0003f3\u0004\u02bb"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bc\u02bd\n\u0002\u0000\u0000\u02bd\u02bf"+
		"\u0003\u0082A\u0000\u02be\u02b8\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1g\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c4\u0007\u0002"+
		"\u0000\u0000\u02c4i\u0001\u0000\u0000\u0000\u02c5\u02d0\u0005-\u0000\u0000"+
		"\u02c6\u02d0\u00058\u0000\u0000\u02c7\u02d0\u0003\u0084B\u0000\u02c8\u02d0"+
		"\u0003\u0086C\u0000\u02c9\u02d0\u0003\u0080@\u0000\u02ca\u02d0\u0003L"+
		"&\u0000\u02cb\u02d0\u0003\u008eG\u0000\u02cc\u02d0\u0003\u0090H\u0000"+
		"\u02cd\u02d0\u0003D\"\u0000\u02ce\u02d0\u0003D\"\u0000\u02cf\u02c5\u0001"+
		"\u0000\u0000\u0000\u02cf\u02c6\u0001\u0000\u0000\u0000\u02cf\u02c7\u0001"+
		"\u0000\u0000\u0000\u02cf\u02c8\u0001\u0000\u0000\u0000\u02cf\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cf\u02ca\u0001\u0000\u0000\u0000\u02cf\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cf\u02cc\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0k\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0005W\u0000\u0000\u02d2\u02e5\u0003b1\u0000"+
		"\u02d3\u02d4\u0005X\u0000\u0000\u02d4\u02e5\u0003b1\u0000\u02d5\u02e5"+
		"\u0005Z\u0000\u0000\u02d6\u02e5\u0005[\u0000\u0000\u02d7\u02d8\u0005\\"+
		"\u0000\u0000\u02d8\u02e5\u0003b1\u0000\u02d9\u02db\u0005Y\u0000\u0000"+
		"\u02da\u02dc\u0005W\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd"+
		"\u02e5\u0003b1\u0000\u02de\u02df\u0005Y\u0000\u0000\u02df\u02e0\u0005"+
		"Z\u0000\u0000\u02e0\u02e5\u0003b1\u0000\u02e1\u02e2\u0005Y\u0000\u0000"+
		"\u02e2\u02e3\u0005M\u0000\u0000\u02e3\u02e5\u0003b1\u0000\u02e4\u02d1"+
		"\u0001\u0000\u0000\u0000\u02e4\u02d3\u0001\u0000\u0000\u0000\u02e4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02e4\u02d6\u0001\u0000\u0000\u0000\u02e4\u02d7"+
		"\u0001\u0000\u0000\u0000\u02e4\u02d9\u0001\u0000\u0000\u0000\u02e4\u02de"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e1\u0001\u0000\u0000\u0000\u02e5m\u0001"+
		"\u0000\u0000\u0000\u02e6\u02f7\u0003\u008cF\u0000\u02e7\u02f7\u0003R)"+
		"\u0000\u02e8\u02f7\u0003\u00a0P\u0000\u02e9\u02f7\u0003B!\u0000\u02ea"+
		"\u02f7\u0003\u00ba]\u0000\u02eb\u02f7\u0003\u00b6[\u0000\u02ec\u02f7\u0003"+
		"\u00b0X\u0000\u02ed\u02ee\u0005\u0006\u0000\u0000\u02ee\u02ef\u0003b1"+
		"\u0000\u02ef\u02f0\u0005\u0007\u0000\u0000\u02f0\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0005\b\u0000\u0000\u02f2\u02f3\u0003b1\u0000\u02f3"+
		"\u02f4\u0005\t\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5\u02f7"+
		"\u0005]\u0000\u0000\u02f6\u02e6\u0001\u0000\u0000\u0000\u02f6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02f6\u02e8\u0001\u0000\u0000\u0000\u02f6\u02e9\u0001"+
		"\u0000\u0000\u0000\u02f6\u02ea\u0001\u0000\u0000\u0000\u02f6\u02eb\u0001"+
		"\u0000\u0000\u0000\u02f6\u02ec\u0001\u0000\u0000\u0000\u02f6\u02ed\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f1\u0001\u0000\u0000\u0000\u02f6\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f7o\u0001\u0000\u0000\u0000\u02f8\u02f9\u0007\u0003"+
		"\u0000\u0000\u02f9q\u0001\u0000\u0000\u0000\u02fa\u02fb\u0007\u0004\u0000"+
		"\u0000\u02fbs\u0001\u0000\u0000\u0000\u02fc\u02fd\u0007\u0005\u0000\u0000"+
		"\u02fdu\u0001\u0000\u0000\u0000\u02fe\u02ff\u0007\u0006\u0000\u0000\u02ff"+
		"w\u0001\u0000\u0000\u0000\u0300\u0301\u0007\u0007\u0000\u0000\u0301y\u0001"+
		"\u0000\u0000\u0000\u0302\u0306\u00052\u0000\u0000\u0303\u0304\u00052\u0000"+
		"\u0000\u0304\u0306\u0005.\u0000\u0000\u0305\u0302\u0001\u0000\u0000\u0000"+
		"\u0305\u0303\u0001\u0000\u0000\u0000\u0306{\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0007\b\u0000\u0000\u0308}\u0001\u0000\u0000\u0000\u0309\u030b"+
		"\u0005\u0004\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a\u030b"+
		"\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0005\u0018\u0000\u0000\u030d\u030e\u0003\u00b2Y\u0000\u030e\u030f\u0005"+
		"\u001c\u0000\u0000\u030f\u0315\u0001\u0000\u0000\u0000\u0310\u0311\u0005"+
		"\f\u0000\u0000\u0311\u0312\u0003\u00b2Y\u0000\u0312\u0313\u0005\r\u0000"+
		"\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u030a\u0001\u0000\u0000"+
		"\u0000\u0314\u0310\u0001\u0000\u0000\u0000\u0315\u007f\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0005\u0004\u0000\u0000\u0317\u0318\u0005\u0018\u0000"+
		"\u0000\u0318\u0319\u0003\u00b2Y\u0000\u0319\u031a\u0005\u001c\u0000\u0000"+
		"\u031a\u0320\u0001\u0000\u0000\u0000\u031b\u031c\u0005\f\u0000\u0000\u031c"+
		"\u031d\u0003\u00b2Y\u0000\u031d\u031e\u0005\r\u0000\u0000\u031e\u0320"+
		"\u0001\u0000\u0000\u0000\u031f\u0316\u0001\u0000\u0000\u0000\u031f\u031b"+
		"\u0001\u0000\u0000\u0000\u0320\u0081\u0001\u0000\u0000\u0000\u0321\u0323"+
		"\u0005\u0004\u0000\u0000\u0322\u0321\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325"+
		"\u0005\u0018\u0000\u0000\u0325\u0326\u0003\u00b2Y\u0000\u0326\u0327\u0005"+
		"\u001c\u0000\u0000\u0327\u032d\u0001\u0000\u0000\u0000\u0328\u0329\u0005"+
		"\f\u0000\u0000\u0329\u032a\u0003\u00b2Y\u0000\u032a\u032b\u0005\r\u0000"+
		"\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u0322\u0001\u0000\u0000"+
		"\u0000\u032c\u0328\u0001\u0000\u0000\u0000\u032d\u0083\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0005\b\u0000\u0000\u032f\u0330\u0003b1\u0000\u0330"+
		"\u0331\u0005\t\u0000\u0000\u0331\u0085\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u0005\u0004\u0000\u0000\u0333\u0334\u0005\b\u0000\u0000\u0334\u0335\u0003"+
		"b1\u0000\u0335\u0336\u0005\t\u0000\u0000\u0336\u033c\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0005\u000e\u0000\u0000\u0338\u0339\u0003b1\u0000\u0339"+
		"\u033a\u0005\u000f\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b"+
		"\u0332\u0001\u0000\u0000\u0000\u033b\u0337\u0001\u0000\u0000\u0000\u033c"+
		"\u0087\u0001\u0000\u0000\u0000\u033d\u033e\u0005(\u0000\u0000\u033e\u034c"+
		"\u0003\u008aE\u0000\u033f\u0340\u0005(\u0000\u0000\u0340\u0341\u0005\b"+
		"\u0000\u0000\u0341\u0346\u0003\u008aE\u0000\u0342\u0343\u0005\u0002\u0000"+
		"\u0000\u0343\u0345\u0003\u008aE\u0000\u0344\u0342\u0001\u0000\u0000\u0000"+
		"\u0345\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000"+
		"\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000"+
		"\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034a\u0005\t\u0000\u0000\u034a"+
		"\u034c\u0001\u0000\u0000\u0000\u034b\u033d\u0001\u0000\u0000\u0000\u034b"+
		"\u033f\u0001\u0000\u0000\u0000\u034c\u0089\u0001\u0000\u0000\u0000\u034d"+
		"\u034f\u0003\u00b0X\u0000\u034e\u0350\u0003<\u001e\u0000\u034f\u034e\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u008b\u0001"+
		"\u0000\u0000\u0000\u0351\u0352\u0005J\u0000\u0000\u0352\u0353\u0003f3"+
		"\u0000\u0353\u0354\u0003N\'\u0000\u0354\u008d\u0001\u0000\u0000\u0000"+
		"\u0355\u0357\u0005,\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356"+
		"\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358"+
		"\u0359\u0005\u0001\u0000\u0000\u0359\u035a\u0005K\u0000\u0000\u035a\u035b"+
		"\u0003f3\u0000\u035b\u035c\u0003\u0092I\u0000\u035c\u008f\u0001\u0000"+
		"\u0000\u0000\u035d\u035f\u0005,\u0000\u0000\u035e\u035d\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0005\u0001\u0000\u0000\u0361\u0362\u0005L\u0000\u0000"+
		"\u0362\u0363\u0003f3\u0000\u0363\u0364\u0003\u0092I\u0000\u0364\u0091"+
		"\u0001\u0000\u0000\u0000\u0365\u0369\u0005\n\u0000\u0000\u0366\u0368\u0003"+
		"\u0094J\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0368\u036b\u0001\u0000"+
		"\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000"+
		"\u0000\u0000\u036a\u036c\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000"+
		"\u0000\u0000\u036c\u036d\u0005\u000b\u0000\u0000\u036d\u0093\u0001\u0000"+
		"\u0000\u0000\u036e\u0373\u0003\u0098L\u0000\u036f\u0373\u0003\u009aM\u0000"+
		"\u0370\u0373\u0003\u009cN\u0000\u0371\u0373\u0003\b\u0004\u0000\u0372"+
		"\u036e\u0001\u0000\u0000\u0000\u0372\u036f\u0001\u0000\u0000\u0000\u0372"+
		"\u0370\u0001\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373"+
		"\u0095\u0001\u0000\u0000\u0000\u0374\u0376\u0003\u0088D\u0000\u0375\u0374"+
		"\u0001\u0000\u0000\u0000\u0376\u0379\u0001\u0000\u0000\u0000\u0377\u0375"+
		"\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u037a"+
		"\u0001\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0005M\u0000\u0000\u037b\u0383\u0003\u00b2Y\u0000\u037c\u037d\u0005M"+
		"\u0000\u0000\u037d\u037f\u0005\b\u0000\u0000\u037e\u0380\u0003\u00b2Y"+
		"\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0383\u0005\t\u0000\u0000"+
		"\u0382\u0377\u0001\u0000\u0000\u0000\u0382\u037c\u0001\u0000\u0000\u0000"+
		"\u0383\u0097\u0001\u0000\u0000\u0000\u0384\u0386\u0003\u0088D\u0000\u0385"+
		"\u0384\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387"+
		"\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388"+
		"\u038a\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0005O\u0000\u0000\u038b\u038c\u0003d2\u0000\u038c\u0390\u0005"+
		"\u0005\u0000\u0000\u038d\u038f\u0003b1\u0000\u038e\u038d\u0001\u0000\u0000"+
		"\u0000\u038f\u0392\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0099\u0001\u0000\u0000"+
		"\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0393\u0395\u0003\u0088D\u0000"+
		"\u0394\u0393\u0001\u0000\u0000\u0000\u0395\u0398\u0001\u0000\u0000\u0000"+
		"\u0396\u0394\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000"+
		"\u0397\u0399\u0001\u0000\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0005U\u0000\u0000\u039a\u039e\u0005\u0005\u0000\u0000\u039b"+
		"\u039d\u0003b1\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039d\u03a0\u0001"+
		"\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039e\u039f\u0001"+
		"\u0000\u0000\u0000\u039f\u009b\u0001\u0000\u0000\u0000\u03a0\u039e\u0001"+
		"\u0000\u0000\u0000\u03a1\u03a3\u0003\u0088D\u0000\u03a2\u03a1\u0001\u0000"+
		"\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7\u03a9\u0003\u009e"+
		"O\u0000\u03a8\u03aa\u0003`0\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000"+
		"\u03ab\u03af\u0005\u0005\u0000\u0000\u03ac\u03ae\u0003b1\u0000\u03ad\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u009d"+
		"\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0005N\u0000\u0000\u03b3\u03b4\u0003\u00b2Y\u0000\u03b4\u03b6\u0005\u0006"+
		"\u0000\u0000\u03b5\u03b7\u0003\u00b2Y\u0000\u03b6\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0005\u0007\u0000\u0000\u03b9\u009f\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bc\u0003\u0088D\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000"+
		"\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c0\u0001\u0000\u0000\u0000"+
		"\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005I\u0000\u0000\u03c1"+
		"\u03c3\u0003\u00acV\u0000\u03c2\u03c4\u0003\u0082A\u0000\u03c3\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c6\u0003\u00a2Q\u0000\u03c6\u00a1\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c9\u0003F#\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000"+
		"\u03ca\u03cd\u0003\u00a4R\u0000\u03cb\u03cd\u0003F#\u0000\u03cc\u03c8"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u00a3"+
		"\u0001\u0000\u0000\u0000\u03ce\u03d2\u0005\n\u0000\u0000\u03cf\u03d1\u0003"+
		"\u00a6S\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0005\u000b\u0000\u0000\u03d6\u00a5\u0001\u0000"+
		"\u0000\u0000\u03d7\u03da\u0003H$\u0000\u03d8\u03da\u0003\b\u0004\u0000"+
		"\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000"+
		"\u03da\u00a7\u0001\u0000\u0000\u0000\u03db\u03dd\u0003\u00b2Y\u0000\u03dc"+
		"\u03db\u0001\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de"+
		"\u03dc\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df"+
		"\u00a9\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e3\u0003\u00b2Y\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e5\u00ab\u0001\u0000\u0000\u0000\u03e6\u03e8"+
		"\u0003\u00b2Y\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001"+
		"\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ea\u03ef\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005"+
		"\u0004\u0000\u0000\u03ec\u03ee\u0003\u00b2Y\u0000\u03ed\u03eb\u0001\u0000"+
		"\u0000\u0000\u03ee\u03f1\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u00ad\u0001\u0000"+
		"\u0000\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f2\u03f7\u0003\u00b2"+
		"Y\u0000\u03f3\u03f4\u0007\t\u0000\u0000\u03f4\u03f6\u0003\u00b2Y\u0000"+
		"\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f9\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f8\u00af\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000"+
		"\u03fa\u03ff\u0003\u00b2Y\u0000\u03fb\u03fc\u0005\u0004\u0000\u0000\u03fc"+
		"\u03fe\u0003\u00b2Y\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fe\u0401"+
		"\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400"+
		"\u0001\u0000\u0000\u0000\u0400\u00b1\u0001\u0000\u0000\u0000\u0401\u03ff"+
		"\u0001\u0000\u0000\u0000\u0402\u0403\u0007\n\u0000\u0000\u0403\u00b3\u0001"+
		"\u0000\u0000\u0000\u0404\u0405\u0007\u000b\u0000\u0000\u0405\u00b5\u0001"+
		"\u0000\u0000\u0000\u0406\u0408\u0003\u00b4Z\u0000\u0407\u0409\u0003\u00b2"+
		"Y\u0000\u0408\u0407\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000"+
		"\u0000\u0409\u00b7\u0001\u0000\u0000\u0000\u040a\u040b\u0007\f\u0000\u0000"+
		"\u040b\u00b9\u0001\u0000\u0000\u0000\u040c\u040e\u0003\u00b2Y\u0000\u040d"+
		"\u040c\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e"+
		"\u040f\u0001\u0000\u0000\u0000\u040f\u0410\u0003\u00b8\\\u0000\u0410\u00bb"+
		"\u0001\u0000\u0000\u0000{\u00bf\u00c7\u00cb\u00cf\u00d3\u00d7\u00db\u00df"+
		"\u00e3\u00e7\u00eb\u00ef\u00f3\u00f7\u00fb\u00fd\u0101\u0105\u0109\u010d"+
		"\u010f\u0118\u0122\u0129\u012c\u0134\u013c\u0140\u0147\u014c\u014f\u0154"+
		"\u015a\u015d\u0160\u0175\u017d\u0181\u0187\u018e\u0198\u019f\u01a4\u01b4"+
		"\u01bc\u01bf\u01c9\u01d0\u01d5\u01da\u01dd\u01e3\u01e8\u01ed\u01f7\u01fb"+
		"\u01ff\u0206\u020b\u0211\u0214\u0219\u0221\u0231\u0235\u0248\u0252\u0256"+
		"\u025e\u0262\u0266\u026b\u0276\u028e\u0290\u0298\u02b0\u02b2\u02be\u02c0"+
		"\u02cf\u02db\u02e4\u02f6\u0305\u030a\u0314\u031f\u0322\u032c\u033b\u0346"+
		"\u034b\u034f\u0356\u035e\u0369\u0372\u0377\u037f\u0382\u0387\u0390\u0396"+
		"\u039e\u03a4\u03a9\u03af\u03b6\u03bd\u03c3\u03c8\u03cc\u03d2\u03d9\u03de"+
		"\u03e4\u03e9\u03ef\u03f7\u03ff\u0408\u040d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}