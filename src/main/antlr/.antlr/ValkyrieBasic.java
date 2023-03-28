// Generated from c:\Users\Dell\IdeaProjects\valkyrie-intellij\src\main\antlr\ValkyrieBasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValkyrieBasic extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, SEMICOLON=3, FAKE_COLON=4, OP_PROPORTION=5, COLON=6, PARENTHESES_L=7, 
		PARENTHESES_R=8, BRACKET_L=9, BRACKET_R=10, BRACE_L=11, BRACE_R=12, GENERIC_L=13, 
		GENERIC_R=14, OFFSET_L=15, OFFSET_R=16, RANGE_L=17, RANGE_R=18, CEILING_L=19, 
		CEILING_R=20, FLOOR_L=21, FLOOR_R=22, COLLECTION_L=23, COLLECTION_R=24, 
		OP_ADD=25, OP_SUB=26, OP_INC=27, OP_DEC=28, OP_MUL=29, OP_DIV=30, OP_REM=31, 
		OP_DIV_REM=32, OP_LAST=33, OP_EQ=34, OP_NE=35, OP_NEE=36, OP_EEE=37, OP_LEQ=38, 
		OP_LLE=39, OP_LLL=40, OP_LL=41, OP_LT=42, OP_GEQ=43, OP_GGE=44, OP_GGG=45, 
		OP_GG=46, OP_GT=47, OP_LEFT=48, OP_ARROW=49, OP_ARROW2=50, OP_ARROW3=51, 
		OP_ASSIGN=52, OP_BIND=53, OP_MAY_ASSIGN=54, OP_ADD_ASSIGN=55, OP_SUB_ASSIGN=56, 
		OP_MUL_ASSIGN=57, OP_DIV_ASSIGN=58, LOGIC_NOT=59, LOGIC_AND=60, LOGIC_XAND=61, 
		LOGIC_NAND=62, LOGIC_OR=63, LOGIC_XOR=64, LOGIC_NOR=65, SET_INTERSECTION=66, 
		SET_UNION=67, OP_AND=68, OP_OR=69, OP_IMPL=70, OP_IFF=71, OP_MAP=72, OP_APPLY2=73, 
		OP_APPLY3=74, OP_AT=75, OP_HASH=76, LAMBDA_SLOT=77, MACRO_SLOT=78, OP_UNIMPLEMENTED=79, 
		OP_OR_DEFAULT=80, OP_OR_ELSE=81, OP_AND_THEN=82, OP_NOT=83, KW_NOT=84, 
		OP_IN=85, KW_IN=86, OP_NOT_IN=87, OP_CONTINUES=88, KW_IS=89, OP_IS=90, 
		OP_IS_NOT=91, KW_AS=92, OP_DOT3=93, OP_DOT2=94, OP_UNTIL=95, OP_POW=96, 
		OP_INVERSE=97, OP_ROOT2=98, OP_ROOT3=99, OP_ROOT4=100, OP_TEMPERATURE=101, 
		OP_TRANSPOSE=102, OP_PERCENT=103, OP_REFERENCE=104, OP_LABEL=105, KW_NAMESPACE=106, 
		KW_IMPORT=107, KW_EXTENSION=108, KW_CLASS=109, KW_TRAIT=110, KW_UNION=111, 
		KW_BITFLAGS=112, KW_TYPE=113, KW_TEMPLATE=114, KW_EXTENDS=115, KW_IMPLEMENTS=116, 
		KW_WHILE=117, KW_FOR=118, KW_LET=119, KW_WITCH=120, KW_NEW=121, KW_OBJECT=122, 
		KW_LAMBDA=123, KW_FUNCTION=124, KW_TRY=125, KW_MATCH=126, KW_CATCH=127, 
		KW_WITH=128, KW_CASE=129, KW_WHEN=130, INTEGER=131, DECIMAL=132, STRING_SINGLE=133, 
		STRING_DOUBLE=134, STRING_BLOCK=135, KW_IF=136, KW_ELSE=137, KW_OTHERWISE=138, 
		RETURN=139, RESUME=140, YIELD=141, BREAK=142, CONTINUE=143, RAISE=144, 
		SPECIAL=145, RAW_ID=146, UNICODE_ID=147, LINE_COMMENT=148, BLOCK_COMMENT=149, 
		WHITE_SPACE=150, ERROR_CHARACTAR=151;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOT", "COMMA", "SEMICOLON", "FAKE_COLON", "OP_PROPORTION", "COLON", 
			"PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", "BRACE_L", 
			"BRACE_R", "GENERIC_L", "GENERIC_R", "OFFSET_L", "OFFSET_R", "RANGE_L", 
			"RANGE_R", "CEILING_L", "CEILING_R", "FLOOR_L", "FLOOR_R", "COLLECTION_L", 
			"COLLECTION_R", "OP_ADD", "OP_SUB", "OP_INC", "OP_DEC", "OP_MUL", "OP_DIV", 
			"OP_REM", "OP_DIV_REM", "OP_LAST", "OP_EQ", "OP_NE", "OP_NEE", "OP_EEE", 
			"OP_LEQ", "OP_LLE", "OP_LLL", "OP_LL", "OP_LT", "OP_GEQ", "OP_GGE", "OP_GGG", 
			"OP_GG", "OP_GT", "OP_LEFT", "OP_ARROW", "OP_ARROW2", "OP_ARROW3", "OP_ASSIGN", 
			"OP_BIND", "OP_MAY_ASSIGN", "OP_ADD_ASSIGN", "OP_SUB_ASSIGN", "OP_MUL_ASSIGN", 
			"OP_DIV_ASSIGN", "LOGIC_NOT", "LOGIC_AND", "LOGIC_XAND", "LOGIC_NAND", 
			"LOGIC_OR", "LOGIC_XOR", "LOGIC_NOR", "SET_INTERSECTION", "SET_UNION", 
			"OP_AND", "OP_OR", "OP_IMPL", "OP_IFF", "OP_MAP", "OP_APPLY2", "OP_APPLY3", 
			"OP_AT", "OP_HASH", "LAMBDA_SLOT", "MACRO_SLOT", "OP_UNIMPLEMENTED", 
			"OP_OR_DEFAULT", "OP_OR_ELSE", "OP_AND_THEN", "OP_NOT", "KW_NOT", "OP_IN", 
			"KW_IN", "OP_NOT_IN", "OP_CONTINUES", "KW_IS", "OP_IS", "OP_IS_NOT", 
			"KW_AS", "OP_DOT3", "OP_DOT2", "OP_UNTIL", "OP_POW", "OP_INVERSE", "OP_ROOT2", 
			"OP_ROOT3", "OP_ROOT4", "OP_TEMPERATURE", "OP_TRANSPOSE", "OP_PERCENT", 
			"OP_REFERENCE", "OP_LABEL", "KW_NAMESPACE", "KW_IMPORT", "KW_EXTENSION", 
			"KW_CLASS", "KW_TRAIT", "KW_UNION", "KW_BITFLAGS", "KW_TYPE", "KW_TEMPLATE", 
			"KW_EXTENDS", "KW_IMPLEMENTS", "KW_WHILE", "KW_FOR", "KW_LET", "KW_WITCH", 
			"KW_NEW", "KW_OBJECT", "KW_LAMBDA", "KW_FUNCTION", "KW_TRY", "KW_MATCH", 
			"KW_CATCH", "KW_WITH", "KW_CASE", "KW_WHEN", "INTEGER", "DECIMAL", "EXP", 
			"STRING_SINGLE", "STRING_DOUBLE", "STRING_BLOCK", "KW_IF", "KW_ELSE", 
			"KW_OTHERWISE", "RETURN", "RESUME", "YIELD", "BREAK", "CONTINUE", "RAISE", 
			"SPECIAL", "RAW_ID", "UNICODE_ID", "LINE_COMMENT", "BLOCK_COMMENT", "WHITE_SPACE", 
			"ERROR_CHARACTAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, "';'", null, null, null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'\u27E8'", "'\u27E9'", "'\u2045'", "'\u2046'", "'\u27E6'", 
			"'\u27E7'", "'\u2308'", "'\u2309'", "'\u230A'", "'\u230B'", "'\u2983'", 
			"'\u2984'", "'+'", "'-'", "'++'", "'--'", "'*'", null, null, null, "'%%'", 
			"'=='", null, null, null, null, "'<<='", null, null, "'<'", null, "'>>='", 
			null, null, "'>'", null, null, null, "'==>'", "'='", null, "'?='", "'+='", 
			"'-='", "'*='", "'/='", "'\u00AC'", null, "'\u2A5F'", "'\u22BC'", null, 
			"'\u22BB'", "'\u22BD'", "'\u2229'", "'\u222A'", "'&'", "'|'", "'\u203D'", 
			"'\u21D4'", null, null, null, "'@'", null, null, null, null, "'??'", 
			"'?:'", "'?'", "'!'", "'not'", null, "'in'", "'\u2209'", null, "'is'", 
			null, null, null, null, null, null, "'^'", "'\u215F'", "'\u221A'", "'\u221B'", 
			"'\u221C'", null, null, null, "'\u203B'", "'\u00B6'", null, null, "'extension'", 
			null, null, "'union'", "'flags'", "'type'", "'template'", "'extends'", 
			"'implements'", null, "'for'", "'let'", "'which'", "'new'", "'object'", 
			"'lambda'", null, "'try'", "'match'", "'catch'", "'with'", "'case'", 
			"'when'", null, null, null, null, null, "'if'", "'else'", "'otherwise'", 
			"'return'", "'resume'", "'yield'", "'break'", "'continue'", "'raise'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "FAKE_COLON", "OP_PROPORTION", "COLON", 
			"PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", "BRACE_L", 
			"BRACE_R", "GENERIC_L", "GENERIC_R", "OFFSET_L", "OFFSET_R", "RANGE_L", 
			"RANGE_R", "CEILING_L", "CEILING_R", "FLOOR_L", "FLOOR_R", "COLLECTION_L", 
			"COLLECTION_R", "OP_ADD", "OP_SUB", "OP_INC", "OP_DEC", "OP_MUL", "OP_DIV", 
			"OP_REM", "OP_DIV_REM", "OP_LAST", "OP_EQ", "OP_NE", "OP_NEE", "OP_EEE", 
			"OP_LEQ", "OP_LLE", "OP_LLL", "OP_LL", "OP_LT", "OP_GEQ", "OP_GGE", "OP_GGG", 
			"OP_GG", "OP_GT", "OP_LEFT", "OP_ARROW", "OP_ARROW2", "OP_ARROW3", "OP_ASSIGN", 
			"OP_BIND", "OP_MAY_ASSIGN", "OP_ADD_ASSIGN", "OP_SUB_ASSIGN", "OP_MUL_ASSIGN", 
			"OP_DIV_ASSIGN", "LOGIC_NOT", "LOGIC_AND", "LOGIC_XAND", "LOGIC_NAND", 
			"LOGIC_OR", "LOGIC_XOR", "LOGIC_NOR", "SET_INTERSECTION", "SET_UNION", 
			"OP_AND", "OP_OR", "OP_IMPL", "OP_IFF", "OP_MAP", "OP_APPLY2", "OP_APPLY3", 
			"OP_AT", "OP_HASH", "LAMBDA_SLOT", "MACRO_SLOT", "OP_UNIMPLEMENTED", 
			"OP_OR_DEFAULT", "OP_OR_ELSE", "OP_AND_THEN", "OP_NOT", "KW_NOT", "OP_IN", 
			"KW_IN", "OP_NOT_IN", "OP_CONTINUES", "KW_IS", "OP_IS", "OP_IS_NOT", 
			"KW_AS", "OP_DOT3", "OP_DOT2", "OP_UNTIL", "OP_POW", "OP_INVERSE", "OP_ROOT2", 
			"OP_ROOT3", "OP_ROOT4", "OP_TEMPERATURE", "OP_TRANSPOSE", "OP_PERCENT", 
			"OP_REFERENCE", "OP_LABEL", "KW_NAMESPACE", "KW_IMPORT", "KW_EXTENSION", 
			"KW_CLASS", "KW_TRAIT", "KW_UNION", "KW_BITFLAGS", "KW_TYPE", "KW_TEMPLATE", 
			"KW_EXTENDS", "KW_IMPLEMENTS", "KW_WHILE", "KW_FOR", "KW_LET", "KW_WITCH", 
			"KW_NEW", "KW_OBJECT", "KW_LAMBDA", "KW_FUNCTION", "KW_TRY", "KW_MATCH", 
			"KW_CATCH", "KW_WITH", "KW_CASE", "KW_WHEN", "INTEGER", "DECIMAL", "STRING_SINGLE", 
			"STRING_DOUBLE", "STRING_BLOCK", "KW_IF", "KW_ELSE", "KW_OTHERWISE", 
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





	public ValkyrieBasic(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ValkyrieBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0099\u0421\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\5\5\u013d\n\5\3\6\3\6\3\6\5\6\u0142\n\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u017d\n!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\5$\u0188\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0191\n%\3&\3&\3&\3&\5"+
		"&\u0197\n&\3\'\3\'\3\'\5\'\u019c\n\'\3(\3(\3(\3(\3)\3)\3)\3)\5)\u01a6"+
		"\n)\3*\3*\3*\5*\u01ab\n*\3+\3+\3,\3,\3,\5,\u01b2\n,\3-\3-\3-\3-\3.\3."+
		"\3.\3.\5.\u01bc\n.\3/\3/\3/\5/\u01c1\n/\3\60\3\60\3\61\3\61\3\61\5\61"+
		"\u01c8\n\61\3\62\3\62\3\62\5\62\u01cd\n\62\3\63\3\63\3\63\5\63\u01d2\n"+
		"\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\5\66\u01dd\n\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\5=\u01f3"+
		"\n=\3>\3>\3?\3?\3@\3@\3@\5@\u01fc\n@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3I\3I\3I\5I\u0211\nI\3J\3J\3J\5J\u0216\nJ\3K\3K\3K\3K"+
		"\5K\u021c\nK\3L\3L\3M\3M\3M\3M\3M\5M\u0225\nM\3N\3N\3N\5N\u022a\nN\3O"+
		"\3O\3O\5O\u022f\nO\3P\3P\3P\3P\5P\u0235\nP\3Q\3Q\3Q\3R\3R\3R\3S\3S\3T"+
		"\3T\3U\3U\3U\3U\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0254"+
		"\n[\3\\\3\\\3\\\5\\\u0259\n\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0263\n]\3^\3"+
		"^\3^\3^\5^\u0269\n^\3_\3_\3_\5_\u026e\n_\3`\3`\3`\3`\3`\3`\5`\u0276\n"+
		"`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0297\nk\3l\3l\3l\3l\3l\3l\3l\5l\u02a0\n"+
		"l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\3n\5n\u02ba\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u02ca\n"+
		"o\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3"+
		"v\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u0303\nv\3w\3w\3w\3w\3x\3x\3x\3x\3y\3"+
		"y\3y\3y\3y\3y\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0337\n}\3~\3"+
		"~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u035b\n\u0084\f\u0084\16\u0084\u035e"+
		"\13\u0084\5\u0084\u0360\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0366\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u036b\n\u0085\3\u0086\3"+
		"\u0086\5\u0086\u036f\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\7\u0087\u0375"+
		"\n\u0087\f\u0087\16\u0087\u0378\13\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\7\u0088\u037e\n\u0088\f\u0088\16\u0088\u0381\13\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u038a\n\u0089\f\u0089"+
		"\16\u0089\u038d\13\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u0397\n\u0089\f\u0089\16\u0089\u039a\13\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u039f\n\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u03ed\n\u0093\3\u0094\3\u0094\6\u0094\u03f1\n\u0094\r"+
		"\u0094\16\u0094\u03f2\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u03f9\n"+
		"\u0095\f\u0095\16\u0095\u03fc\13\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\7\u0096\u0402\n\u0096\f\u0096\16\u0096\u0405\13\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u040d\n\u0097\f\u0097\16\u0097"+
		"\u0410\13\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\6\u0098"+
		"\u0418\n\u0098\r\u0098\16\u0098\u0419\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\5\u038b\u0398\u040e\2\u009a\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1"+
		"j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5"+
		"t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9"+
		"~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105\u0084"+
		"\u0107\u0085\u0109\u0086\u010b\2\u010d\u0087\u010f\u0088\u0111\u0089\u0113"+
		"\u008a\u0115\u008b\u0117\u008c\u0119\u008d\u011b\u008e\u011d\u008f\u011f"+
		"\u0090\u0121\u0091\u0123\u0092\u0125\u0093\u0127\u0094\u0129\u0095\u012b"+
		"\u0096\u012d\u0097\u012f\u0098\u0131\u0099\3\2\31\4\2..\uff0e\uff0e\4"+
		"\2<<\u2238\u2238\5\2\61\61\u2046\u2046\u2217\u2217\4\2\'\'\u2054\u2054"+
		"\4\2\u2266\u2266\u2a7f\u2a7f\4\2\u2267\u2267\u2a80\u2a80\4\2\u21f6\u21f6"+
		"\u2a37\u2a37\5\2\u2151\u2151\u237e\u237e\u27c3\u27c3\4\2\u220a\u220a\u220c"+
		"\u220c\4\2\u220d\u220d\u220f\u220f\4\2\u2105\u2105\u210b\u210b\4\2\u1d36"+
		"\u1d36\u1d42\u1d42\5\2##,,AA\3\2\62\62\3\2\63;\3\2\62;\4\2GGgg\4\2--/"+
		"/\3\2))\3\2$$\3\2bb\4\2\f\f\17\17\f\2\13\17\"\"\u0087\u0087\u00a2\u00a2"+
		"\u1682\u1682\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061\u3002\u3002"+
		"\4\u0253\2C\2\\\2a\2a\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2"+
		"\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3"+
		"\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0372\2\u0376\2\u0378"+
		"\2\u0379\2\u037d\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a\2\u038c"+
		"\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u048c"+
		"\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05d2\2\u05ec"+
		"\2\u05f2\2\u05f4\2\u0622\2\u064c\2\u0670\2\u0671\2\u0673\2\u06d5\2\u06d7"+
		"\2\u06d7\2\u06e7\2\u06e8\2\u06f0\2\u06f1\2\u06fc\2\u06fe\2\u0701\2\u0701"+
		"\2\u0712\2\u0712\2\u0714\2\u0731\2\u074f\2\u07a7\2\u07b3\2\u07b3\2\u07cc"+
		"\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0817\2\u081c\2\u081c"+
		"\2\u0826\2\u0826\2\u082a\2\u082a\2\u0842\2\u085a\2\u0862\2\u086c\2\u08a2"+
		"\2\u08b6\2\u08b8\2\u08bf\2\u0906\2\u093b\2\u093f\2\u093f\2\u0952\2\u0952"+
		"\2\u095a\2\u0963\2\u0973\2\u0982\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995"+
		"\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09bf"+
		"\2\u09d0\2\u09d0\2\u09de\2\u09df\2\u09e1\2\u09e3\2\u09f2\2\u09f3\2\u09fe"+
		"\2\u09fe\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32"+
		"\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a5b\2\u0a5e\2\u0a60"+
		"\2\u0a60\2\u0a74\2\u0a76\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa"+
		"\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0abf\2\u0ad2"+
		"\2\u0ad2\2\u0ae2\2\u0ae3\2\u0afb\2\u0afb\2\u0b07\2\u0b0e\2\u0b11\2\u0b12"+
		"\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f"+
		"\2\u0b3f\2\u0b5e\2\u0b5f\2\u0b61\2\u0b63\2\u0b73\2\u0b73\2\u0b85\2\u0b85"+
		"\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e"+
		"\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb"+
		"\2\u0bd2\2\u0bd2\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c"+
		"\2\u0c3b\2\u0c3f\2\u0c3f\2\u0c5a\2\u0c5c\2\u0c62\2\u0c63\2\u0c82\2\u0c82"+
		"\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7"+
		"\2\u0cbb\2\u0cbf\2\u0cbf\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce3\2\u0cf3\2\u0cf4"+
		"\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d3f\2\u0d50"+
		"\2\u0d50\2\u0d56\2\u0d58\2\u0d61\2\u0d63\2\u0d7c\2\u0d81\2\u0d87\2\u0d98"+
		"\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0e03"+
		"\2\u0e32\2\u0e34\2\u0e34\2\u0e42\2\u0e48\2\u0e83\2\u0e84\2\u0e86\2\u0e86"+
		"\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b"+
		"\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead"+
		"\2\u0eaf\2\u0eb2\2\u0eb4\2\u0eb4\2\u0ebf\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8"+
		"\2\u0ec8\2\u0ede\2\u0ee1\2\u0f02\2\u0f02\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e"+
		"\2\u0f8a\2\u0f8e\2\u1002\2\u102c\2\u1041\2\u1041\2\u1052\2\u1057\2\u105c"+
		"\2\u105f\2\u1063\2\u1063\2\u1067\2\u1068\2\u1070\2\u1072\2\u1077\2\u1083"+
		"\2\u1090\2\u1090\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2"+
		"\2\u10fc\2\u10fe\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a"+
		"\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4"+
		"\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8"+
		"\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c\2\u1382\2\u1391\2\u13a2"+
		"\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c"+
		"\2\u16a2\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1713\2\u1722"+
		"\2\u1733\2\u1742\2\u1753\2\u1762\2\u176e\2\u1770\2\u1772\2\u1782\2\u17b5"+
		"\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822\2\u1879\2\u1882\2\u18aa\2\u18ac"+
		"\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1952\2\u196f\2\u1972\2\u1976"+
		"\2\u1982\2\u19ad\2\u19b2\2\u19cb\2\u1a02\2\u1a18\2\u1a22\2\u1a56\2\u1aa9"+
		"\2\u1aa9\2\u1b07\2\u1b35\2\u1b47\2\u1b4d\2\u1b85\2\u1ba2\2\u1bb0\2\u1bb1"+
		"\2\u1bbc\2\u1be7\2\u1c02\2\u1c25\2\u1c4f\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82"+
		"\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf3\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1"+
		"\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52"+
		"\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f"+
		"\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8"+
		"\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6"+
		"\2\u1ff8\2\u1ffe\2\u2073\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104"+
		"\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115\2\u2117\2\u2117\2\u211a\2\u211f"+
		"\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a\2\u212c\2\u213b\2\u213e"+
		"\2\u2141\2\u2147\2\u214b\2\u2150\2\u2150\2\u2162\2\u218a\2\u2c02\2\u2c30"+
		"\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02"+
		"\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71"+
		"\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba"+
		"\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0"+
		"\2\u3007\2\u3009\2\u3023\2\u302b\2\u3033\2\u3037\2\u303a\2\u303e\2\u3043"+
		"\2\u3098\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130"+
		"\2\u3133\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02"+
		"\2\u9fec\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621"+
		"\2\ua62c\2\ua62d\2\ua642\2\ua670\2\ua681\2\ua69f\2\ua6a2\2\ua6f1\2\ua719"+
		"\2\ua721\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803"+
		"\2\ua805\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua824\2\ua842\2\ua875\2\ua884"+
		"\2\ua8b5\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua927"+
		"\2\ua932\2\ua948\2\ua962\2\ua97e\2\ua986\2\ua9b4\2\ua9d1\2\ua9d1\2\ua9e2"+
		"\2\ua9e6\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42\2\uaa44"+
		"\2\uaa46\2\uaa4d\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaab1\2\uaab3"+
		"\2\uaab3\2\uaab7\2\uaab8\2\uaabb\2\uaabf\2\uaac2\2\uaac2\2\uaac4\2\uaac4"+
		"\2\uaadd\2\uaadf\2\uaae2\2\uaaec\2\uaaf4\2\uaaf6\2\uab03\2\uab08\2\uab0b"+
		"\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c"+
		"\2\uab5e\2\uab67\2\uab72\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd"+
		"\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19"+
		"\2\ufb1f\2\ufb1f\2\ufb21\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40"+
		"\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufc5f"+
		"\2\ufc66\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfb\2\ufe73"+
		"\2\ufe73\2\ufe75\2\ufe75\2\ufe79\2\ufe79\2\ufe7b\2\ufe7b\2\ufe7d\2\ufe7d"+
		"\2\ufe7f\2\ufe7f\2\ufe81\2\ufefe\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68"+
		"\2\uff9f\2\uffa2\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1\2\uffd4\2\uffd9"+
		"\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc"+
		"\3\u0142\3\u0176\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3\u032f"+
		"\3\u034c\3\u0352\3\u0377\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1"+
		"\3\u03d3\3\u03d7\3\u0402\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502"+
		"\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769"+
		"\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e"+
		"\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4"+
		"\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0"+
		"\3\u09c1\3\u0a02\3\u0a02\3\u0a12\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35"+
		"\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02"+
		"\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a"+
		"\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1005\3\u1039\3\u1085\3\u10b1\3\u10d2"+
		"\3\u10ea\3\u1105\3\u1128\3\u1152\3\u1174\3\u1178\3\u1178\3\u1185\3\u11b4"+
		"\3\u11c3\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215"+
		"\3\u122d\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f"+
		"\3\u12a1\3\u12aa\3\u12b2\3\u12e0\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315"+
		"\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f\3\u133f"+
		"\3\u1352\3\u1352\3\u135f\3\u1363\3\u1402\3\u1436\3\u1449\3\u144c\3\u1482"+
		"\3\u14b1\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b0\3\u15da\3\u15dd"+
		"\3\u1602\3\u1631\3\u1646\3\u1646\3\u1682\3\u16ac\3\u1702\3\u171b\3\u18a2"+
		"\3\u18e1\3\u1901\3\u1901\3\u1a02\3\u1a02\3\u1a0d\3\u1a34\3\u1a3c\3\u1a3c"+
		"\3\u1a52\3\u1a52\3\u1a5e\3\u1a85\3\u1a88\3\u1a8b\3\u1ac2\3\u1afa\3\u1c02"+
		"\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42\3\u1c42\3\u1c74\3\u1c91\3\u1d02\3\u1d08"+
		"\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d32\3\u1d48\3\u1d48\3\u2002\3\u239b\3\u2402"+
		"\3\u2470\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a"+
		"\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b31\3\u6b42\3\u6b45\3\u6b65"+
		"\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f52\3\u6f95\3\u6fa1"+
		"\3\u6fe2\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172"+
		"\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b"+
		"\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7"+
		"\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5"+
		"\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520"+
		"\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552"+
		"\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe"+
		"\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772\3\ud78a"+
		"\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue802\3\ue8c6\3\ue902"+
		"\3\ue945\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26"+
		"\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d"+
		"\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d"+
		"\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b"+
		"\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64"+
		"\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b"+
		"\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5"+
		"\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4"+
		"\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u02ba\2\62\2"+
		";\2C\2\\\2a\2a\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00b9\2\u00b9\2"+
		"\u00bc\2\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8"+
		"\2\u02d3\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0302\2\u0376"+
		"\2\u0378\2\u0379\2\u037d\2\u037f\2\u0381\2\u0381\2\u0388\2\u038c\2\u038e"+
		"\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483\2\u0485\2\u0489"+
		"\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u0593"+
		"\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9"+
		"\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u066b\2\u0670"+
		"\2\u06d5\2\u06d7\2\u06de\2\u06e1\2\u06ea\2\u06ec\2\u06fe\2\u0701\2\u0701"+
		"\2\u0712\2\u074c\2\u074f\2\u07b3\2\u07c2\2\u07f7\2\u07fc\2\u07fc\2\u0802"+
		"\2\u082f\2\u0842\2\u085d\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf"+
		"\2\u08d6\2\u08e3\2\u08e5\2\u0965\2\u0968\2\u0971\2\u0973\2\u0985\2\u0987"+
		"\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4"+
		"\2\u09b8\2\u09bb\2\u09be\2\u09c6\2\u09c9\2\u09ca\2\u09cd\2\u09d0\2\u09d9"+
		"\2\u09d9\2\u09de\2\u09df\2\u09e1\2\u09e5\2\u09e8\2\u09f3\2\u09fe\2\u09fe"+
		"\2\u0a03\2\u0a05\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c"+
		"\2\u0a32\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a3e\2\u0a3e"+
		"\2\u0a40\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53\2\u0a5b"+
		"\2\u0a5e\2\u0a60\2\u0a60\2\u0a68\2\u0a77\2\u0a83\2\u0a85\2\u0a87\2\u0a8f"+
		"\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7"+
		"\2\u0abb\2\u0abe\2\u0ac7\2\u0ac9\2\u0acb\2\u0acd\2\u0acf\2\u0ad2\2\u0ad2"+
		"\2\u0ae2\2\u0ae5\2\u0ae8\2\u0af1\2\u0afb\2\u0b01\2\u0b03\2\u0b05\2\u0b07"+
		"\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34\2\u0b35"+
		"\2\u0b37\2\u0b3b\2\u0b3e\2\u0b46\2\u0b49\2\u0b4a\2\u0b4d\2\u0b4f\2\u0b58"+
		"\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b68\2\u0b71\2\u0b73\2\u0b73"+
		"\2\u0b84\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b"+
		"\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac"+
		"\2\u0bb0\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bcf\2\u0bd2"+
		"\2\u0bd2\2\u0bd9\2\u0bd9\2\u0be8\2\u0bf1\2\u0c02\2\u0c05\2\u0c07\2\u0c0e"+
		"\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48"+
		"\2\u0c4a\2\u0c4c\2\u0c4f\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65"+
		"\2\u0c68\2\u0c71\2\u0c82\2\u0c85\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94"+
		"\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbe\2\u0cc6\2\u0cc8\2\u0cca"+
		"\2\u0ccc\2\u0ccf\2\u0cd7\2\u0cd8\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0ce8"+
		"\2\u0cf1\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05\2\u0d07\2\u0d0e\2\u0d10\2\u0d12"+
		"\2\u0d14\2\u0d46\2\u0d48\2\u0d4a\2\u0d4c\2\u0d50\2\u0d56\2\u0d59\2\u0d61"+
		"\2\u0d65\2\u0d68\2\u0d71\2\u0d7c\2\u0d81\2\u0d84\2\u0d85\2\u0d87\2\u0d98"+
		"\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dcc"+
		"\2\u0dcc\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8\2\u0dda\2\u0de1\2\u0de8\2\u0df1"+
		"\2\u0df4\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e50\2\u0e52\2\u0e5b\2\u0e83"+
		"\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f\2\u0e8f"+
		"\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7\2\u0ea9"+
		"\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf\2\u0ec2\2\u0ec6"+
		"\2\u0ec8\2\u0ec8\2\u0eca\2\u0ecf\2\u0ed2\2\u0edb\2\u0ede\2\u0ee1\2\u0f02"+
		"\2\u0f02\2\u0f1a\2\u0f1b\2\u0f22\2\u0f2b\2\u0f37\2\u0f37\2\u0f39\2\u0f39"+
		"\2\u0f3b\2\u0f3b\2\u0f40\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f86\2\u0f88"+
		"\2\u0f99\2\u0f9b\2\u0fbe\2\u0fc8\2\u0fc8\2\u1002\2\u104b\2\u1052\2\u109f"+
		"\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe"+
		"\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f"+
		"\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba"+
		"\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312"+
		"\2\u1314\2\u1317\2\u131a\2\u135c\2\u135f\2\u1361\2\u136b\2\u1373\2\u1382"+
		"\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681"+
		"\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710"+
		"\2\u1716\2\u1722\2\u1736\2\u1742\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772"+
		"\2\u1774\2\u1775\2\u1782\2\u17d5\2\u17d9\2\u17d9\2\u17de\2\u17df\2\u17e2"+
		"\2\u17eb\2\u180d\2\u180f\2\u1812\2\u181b\2\u1822\2\u1879\2\u1882\2\u18ac"+
		"\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d\2\u1932\2\u193d\2\u1948"+
		"\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2\2\u19cb\2\u19d2\2\u19dc"+
		"\2\u1a02\2\u1a1d\2\u1a22\2\u1a60\2\u1a62\2\u1a7e\2\u1a81\2\u1a8b\2\u1a92"+
		"\2\u1a9b\2\u1aa9\2\u1aa9\2\u1ab2\2\u1abf\2\u1b02\2\u1b4d\2\u1b52\2\u1b5b"+
		"\2\u1b6d\2\u1b75\2\u1b82\2\u1bf5\2\u1c02\2\u1c39\2\u1c42\2\u1c4b\2\u1c4f"+
		"\2\u1c7f\2\u1c82\2\u1c8a\2\u1cd2\2\u1cd4\2\u1cd6\2\u1cfb\2\u1d02\2\u1dfb"+
		"\2\u1dfd\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52"+
		"\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f"+
		"\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8"+
		"\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6"+
		"\2\u1ff8\2\u1ffe\2\u2041\2\u2042\2\u2056\2\u2056\2\u2073\2\u2073\2\u2081"+
		"\2\u2081\2\u2092\2\u209e\2\u20d2\2\u20de\2\u20e3\2\u20e3\2\u20e7\2\u20f2"+
		"\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115\2\u2117\2\u2117\2\u211a"+
		"\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a\2\u212c\2\u213b"+
		"\2\u213e\2\u2141\2\u2147\2\u214b\2\u2150\2\u2150\2\u2162\2\u218a\2\u2c02"+
		"\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf5\2\u2d02\2\u2d27"+
		"\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d81"+
		"\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0"+
		"\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2de2"+
		"\2\u2e01\2\u3007\2\u3009\2\u3023\2\u3031\2\u3033\2\u3037\2\u303a\2\u303e"+
		"\2\u3043\2\u3098\2\u309b\2\u309c\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe"+
		"\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201"+
		"\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502"+
		"\2\ua60e\2\ua612\2\ua62d\2\ua642\2\ua671\2\ua676\2\ua67f\2\ua681\2\ua6f3"+
		"\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9"+
		"\2\ua829\2\ua842\2\ua875\2\ua882\2\ua8c7\2\ua8d2\2\ua8db\2\ua8e2\2\ua8f9"+
		"\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua902\2\ua92f\2\ua932\2\ua955\2\ua962"+
		"\2\ua97e\2\ua982\2\ua9c2\2\ua9d1\2\ua9db\2\ua9e2\2\uaa00\2\uaa02\2\uaa38"+
		"\2\uaa42\2\uaa4f\2\uaa52\2\uaa5b\2\uaa62\2\uaa78\2\uaa7c\2\uaac4\2\uaadd"+
		"\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf8\2\uab03\2\uab08\2\uab0b\2\uab10"+
		"\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e"+
		"\2\uab67\2\uab72\2\uabec\2\uabee\2\uabef\2\uabf2\2\uabfb\2\uac02\2\ud7a5"+
		"\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02"+
		"\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e"+
		"\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5"+
		"\2\ufc5f\2\ufc66\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfb"+
		"\2\ufe02\2\ufe11\2\ufe22\2\ufe31\2\ufe35\2\ufe36\2\ufe4f\2\ufe51\2\ufe73"+
		"\2\ufe73\2\ufe75\2\ufe75\2\ufe79\2\ufe79\2\ufe7b\2\ufe7b\2\ufe7d\2\ufe7d"+
		"\2\ufe7f\2\ufe7f\2\ufe81\2\ufefe\2\uff12\2\uff1b\2\uff23\2\uff3c\2\uff41"+
		"\2\uff41\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1"+
		"\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R"+
		"\3_\3\u0082\3\u00fc\3\u0142\3\u0176\3\u01ff\3\u01ff\3\u0282\3\u029e\3"+
		"\u02a2\3\u02d2\3\u02e2\3\u02e2\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352"+
		"\3\u037c\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7"+
		"\3\u0402\3\u049f\3\u04a2\3\u04ab\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502"+
		"\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769"+
		"\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e"+
		"\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4"+
		"\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0"+
		"\3\u09c1\3\u0a02\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17\3\u0a19"+
		"\3\u0a1b\3\u0a35\3\u0a3a\3\u0a3c\3\u0a41\3\u0a41\3\u0a62\3\u0a7e\3\u0a82"+
		"\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae8\3\u0b02\3\u0b37\3\u0b42\3\u0b57"+
		"\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2"+
		"\3\u0cf4\3\u1002\3\u1048\3\u1068\3\u1071\3\u1081\3\u10bc\3\u10d2\3\u10ea"+
		"\3\u10f2\3\u10fb\3\u1102\3\u1136\3\u1138\3\u1141\3\u1152\3\u1175\3\u1178"+
		"\3\u1178\3\u1182\3\u11c6\3\u11cc\3\u11ce\3\u11d2\3\u11dc\3\u11de\3\u11de"+
		"\3\u1202\3\u1213\3\u1215\3\u1239\3\u1240\3\u1240\3\u1282\3\u1288\3\u128a"+
		"\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12ec"+
		"\3\u12f2\3\u12fb\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315"+
		"\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133e\3\u1346"+
		"\3\u1349\3\u134a\3\u134d\3\u134f\3\u1352\3\u1352\3\u1359\3\u1359\3\u135f"+
		"\3\u1365\3\u1368\3\u136e\3\u1372\3\u1376\3\u1402\3\u144c\3\u1452\3\u145b"+
		"\3\u1482\3\u14c7\3\u14c9\3\u14c9\3\u14d2\3\u14db\3\u1582\3\u15b7\3\u15ba"+
		"\3\u15c2\3\u15da\3\u15df\3\u1602\3\u1642\3\u1646\3\u1646\3\u1652\3\u165b"+
		"\3\u1682\3\u16b9\3\u16c2\3\u16cb\3\u1702\3\u171b\3\u171f\3\u172d\3\u1732"+
		"\3\u173b\3\u18a2\3\u18eb\3\u1901\3\u1901\3\u1a02\3\u1a40\3\u1a49\3\u1a49"+
		"\3\u1a52\3\u1a85\3\u1a88\3\u1a9b\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c"+
		"\3\u1c38\3\u1c3a\3\u1c42\3\u1c52\3\u1c5b\3\u1c74\3\u1c91\3\u1c94\3\u1ca9"+
		"\3\u1cab\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c"+
		"\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d49\3\u1d52\3\u1d5b\3\u2002\3\u239b"+
		"\3\u2402\3\u2470\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802"+
		"\3\u6a3a\3\u6a42\3\u6a60\3\u6a62\3\u6a6b\3\u6ad2\3\u6aef\3\u6af2\3\u6af6"+
		"\3\u6b02\3\u6b38\3\u6b42\3\u6b45\3\u6b52\3\u6b5b\3\u6b65\3\u6b79\3\u6b7f"+
		"\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80\3\u6f91\3\u6fa1\3\u6fe2\3\u6fe3"+
		"\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd\3\ubc02"+
		"\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ubc9f\3\ubca0"+
		"\3\ud167\3\ud16b\3\ud16f\3\ud174\3\ud17d\3\ud184\3\ud187\3\ud18d\3\ud1ac"+
		"\3\ud1af\3\ud244\3\ud246\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1"+
		"\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd"+
		"\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516"+
		"\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548"+
		"\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc"+
		"\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752"+
		"\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd"+
		"\3\ud7d0\3\ud801\3\uda02\3\uda38\3\uda3d\3\uda6e\3\uda77\3\uda77\3\uda86"+
		"\3\uda86\3\uda9d\3\udaa1\3\udaa3\3\udab1\3\ue002\3\ue008\3\ue00a\3\ue01a"+
		"\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802\3\ue8c6\3\ue8d2"+
		"\3\ue8d8\3\ue902\3\ue94c\3\ue952\3\ue95b\3\uee02\3\uee05\3\uee07\3\uee21"+
		"\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36"+
		"\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49"+
		"\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56"+
		"\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f"+
		"\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e"+
		"\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b"+
		"\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\2\4"+
		"\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2"+
		"\4\uf802\4\ufa1f\4\u0102\20\u01f1\20\u045b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb"+
		"\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2"+
		"\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd"+
		"\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2"+
		"\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111"+
		"\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2"+
		"\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123"+
		"\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2"+
		"\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\3\u0133\3\2\2\2\5\u0135"+
		"\3\2\2\2\7\u0137\3\2\2\2\t\u013c\3\2\2\2\13\u0141\3\2\2\2\r\u0143\3\2"+
		"\2\2\17\u0145\3\2\2\2\21\u0147\3\2\2\2\23\u0149\3\2\2\2\25\u014b\3\2\2"+
		"\2\27\u014d\3\2\2\2\31\u014f\3\2\2\2\33\u0151\3\2\2\2\35\u0153\3\2\2\2"+
		"\37\u0155\3\2\2\2!\u0157\3\2\2\2#\u0159\3\2\2\2%\u015b\3\2\2\2\'\u015d"+
		"\3\2\2\2)\u015f\3\2\2\2+\u0161\3\2\2\2-\u0163\3\2\2\2/\u0165\3\2\2\2\61"+
		"\u0167\3\2\2\2\63\u0169\3\2\2\2\65\u016b\3\2\2\2\67\u016d\3\2\2\29\u0170"+
		"\3\2\2\2;\u0173\3\2\2\2=\u0175\3\2\2\2?\u0177\3\2\2\2A\u017c\3\2\2\2C"+
		"\u017e\3\2\2\2E\u0181\3\2\2\2G\u0187\3\2\2\2I\u0190\3\2\2\2K\u0196\3\2"+
		"\2\2M\u019b\3\2\2\2O\u019d\3\2\2\2Q\u01a5\3\2\2\2S\u01aa\3\2\2\2U\u01ac"+
		"\3\2\2\2W\u01b1\3\2\2\2Y\u01b3\3\2\2\2[\u01bb\3\2\2\2]\u01c0\3\2\2\2_"+
		"\u01c2\3\2\2\2a\u01c7\3\2\2\2c\u01cc\3\2\2\2e\u01d1\3\2\2\2g\u01d3\3\2"+
		"\2\2i\u01d7\3\2\2\2k\u01dc\3\2\2\2m\u01de\3\2\2\2o\u01e1\3\2\2\2q\u01e4"+
		"\3\2\2\2s\u01e7\3\2\2\2u\u01ea\3\2\2\2w\u01ed\3\2\2\2y\u01f2\3\2\2\2{"+
		"\u01f4\3\2\2\2}\u01f6\3\2\2\2\177\u01fb\3\2\2\2\u0081\u01fd\3\2\2\2\u0083"+
		"\u01ff\3\2\2\2\u0085\u0201\3\2\2\2\u0087\u0203\3\2\2\2\u0089\u0205\3\2"+
		"\2\2\u008b\u0207\3\2\2\2\u008d\u0209\3\2\2\2\u008f\u020b\3\2\2\2\u0091"+
		"\u0210\3\2\2\2\u0093\u0215\3\2\2\2\u0095\u021b\3\2\2\2\u0097\u021d\3\2"+
		"\2\2\u0099\u0224\3\2\2\2\u009b\u0229\3\2\2\2\u009d\u022e\3\2\2\2\u009f"+
		"\u0234\3\2\2\2\u00a1\u0236\3\2\2\2\u00a3\u0239\3\2\2\2\u00a5\u023c\3\2"+
		"\2\2\u00a7\u023e\3\2\2\2\u00a9\u0240\3\2\2\2\u00ab\u0244\3\2\2\2\u00ad"+
		"\u0246\3\2\2\2\u00af\u0249\3\2\2\2\u00b1\u024b\3\2\2\2\u00b3\u024d\3\2"+
		"\2\2\u00b5\u0253\3\2\2\2\u00b7\u0258\3\2\2\2\u00b9\u0262\3\2\2\2\u00bb"+
		"\u0268\3\2\2\2\u00bd\u026d\3\2\2\2\u00bf\u0275\3\2\2\2\u00c1\u0277\3\2"+
		"\2\2\u00c3\u0279\3\2\2\2\u00c5\u027b\3\2\2\2\u00c7\u027d\3\2\2\2\u00c9"+
		"\u027f\3\2\2\2\u00cb\u0281\3\2\2\2\u00cd\u0283\3\2\2\2\u00cf\u0285\3\2"+
		"\2\2\u00d1\u0287\3\2\2\2\u00d3\u0289\3\2\2\2\u00d5\u028b\3\2\2\2\u00d7"+
		"\u0298\3\2\2\2\u00d9\u02a1\3\2\2\2\u00db\u02b9\3\2\2\2\u00dd\u02c9\3\2"+
		"\2\2\u00df\u02cb\3\2\2\2\u00e1\u02d1\3\2\2\2\u00e3\u02d7\3\2\2\2\u00e5"+
		"\u02dc\3\2\2\2\u00e7\u02e5\3\2\2\2\u00e9\u02ed\3\2\2\2\u00eb\u0302\3\2"+
		"\2\2\u00ed\u0304\3\2\2\2\u00ef\u0308\3\2\2\2\u00f1\u030c\3\2\2\2\u00f3"+
		"\u0312\3\2\2\2\u00f5\u0316\3\2\2\2\u00f7\u031d\3\2\2\2\u00f9\u0336\3\2"+
		"\2\2\u00fb\u0338\3\2\2\2\u00fd\u033c\3\2\2\2\u00ff\u0342\3\2\2\2\u0101"+
		"\u0348\3\2\2\2\u0103\u034d\3\2\2\2\u0105\u0352\3\2\2\2\u0107\u035f\3\2"+
		"\2\2\u0109\u036a\3\2\2\2\u010b\u036c\3\2\2\2\u010d\u0372\3\2\2\2\u010f"+
		"\u037b\3\2\2\2\u0111\u039e\3\2\2\2\u0113\u03a0\3\2\2\2\u0115\u03a3\3\2"+
		"\2\2\u0117\u03a8\3\2\2\2\u0119\u03b2\3\2\2\2\u011b\u03b9\3\2\2\2\u011d"+
		"\u03c0\3\2\2\2\u011f\u03c6\3\2\2\2\u0121\u03cc\3\2\2\2\u0123\u03d5\3\2"+
		"\2\2\u0125\u03ec\3\2\2\2\u0127\u03ee\3\2\2\2\u0129\u03f6\3\2\2\2\u012b"+
		"\u03fd\3\2\2\2\u012d\u0408\3\2\2\2\u012f\u0417\3\2\2\2\u0131\u041d\3\2"+
		"\2\2\u0133\u0134\7\60\2\2\u0134\4\3\2\2\2\u0135\u0136\t\2\2\2\u0136\6"+
		"\3\2\2\2\u0137\u0138\7=\2\2\u0138\b\3\2\2\2\u0139\u013d\7\u2051\2\2\u013a"+
		"\u013b\7=\2\2\u013b\u013d\7=\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2"+
		"\2\u013d\n\3\2\2\2\u013e\u0142\7\u2239\2\2\u013f\u0140\7<\2\2\u0140\u0142"+
		"\7<\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0142\f\3\2\2\2\u0143"+
		"\u0144\t\3\2\2\u0144\16\3\2\2\2\u0145\u0146\7*\2\2\u0146\20\3\2\2\2\u0147"+
		"\u0148\7+\2\2\u0148\22\3\2\2\2\u0149\u014a\7]\2\2\u014a\24\3\2\2\2\u014b"+
		"\u014c\7_\2\2\u014c\26\3\2\2\2\u014d\u014e\7}\2\2\u014e\30\3\2\2\2\u014f"+
		"\u0150\7\177\2\2\u0150\32\3\2\2\2\u0151\u0152\7\u27ea\2\2\u0152\34\3\2"+
		"\2\2\u0153\u0154\7\u27eb\2\2\u0154\36\3\2\2\2\u0155\u0156\7\u2047\2\2"+
		"\u0156 \3\2\2\2\u0157\u0158\7\u2048\2\2\u0158\"\3\2\2\2\u0159\u015a\7"+
		"\u27e8\2\2\u015a$\3\2\2\2\u015b\u015c\7\u27e9\2\2\u015c&\3\2\2\2\u015d"+
		"\u015e\7\u230a\2\2\u015e(\3\2\2\2\u015f\u0160\7\u230b\2\2\u0160*\3\2\2"+
		"\2\u0161\u0162\7\u230c\2\2\u0162,\3\2\2\2\u0163\u0164\7\u230d\2\2\u0164"+
		".\3\2\2\2\u0165\u0166\7\u2985\2\2\u0166\60\3\2\2\2\u0167\u0168\7\u2986"+
		"\2\2\u0168\62\3\2\2\2\u0169\u016a\7-\2\2\u016a\64\3\2\2\2\u016b\u016c"+
		"\7/\2\2\u016c\66\3\2\2\2\u016d\u016e\7-\2\2\u016e\u016f\7-\2\2\u016f8"+
		"\3\2\2\2\u0170\u0171\7/\2\2\u0171\u0172\7/\2\2\u0172:\3\2\2\2\u0173\u0174"+
		"\7,\2\2\u0174<\3\2\2\2\u0175\u0176\t\4\2\2\u0176>\3\2\2\2\u0177\u0178"+
		"\t\5\2\2\u0178@\3\2\2\2\u0179\u017a\7\61\2\2\u017a\u017d\7\'\2\2\u017b"+
		"\u017d\7\u00f9\2\2\u017c\u0179\3\2\2\2\u017c\u017b\3\2\2\2\u017dB\3\2"+
		"\2\2\u017e\u017f\7\'\2\2\u017f\u0180\7\'\2\2\u0180D\3\2\2\2\u0181\u0182"+
		"\7?\2\2\u0182\u0183\7?\2\2\u0183F\3\2\2\2\u0184\u0188\7\u2262\2\2\u0185"+
		"\u0186\7#\2\2\u0186\u0188\7?\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2"+
		"\2\u0188H\3\2\2\2\u0189\u0191\7\u2264\2\2\u018a\u018b\7#\2\2\u018b\u018c"+
		"\7?\2\2\u018c\u0191\7?\2\2\u018d\u018e\7?\2\2\u018e\u018f\7#\2\2\u018f"+
		"\u0191\7?\2\2\u0190\u0189\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018d\3\2"+
		"\2\2\u0191J\3\2\2\2\u0192\u0197\7\u2263\2\2\u0193\u0194\7?\2\2\u0194\u0195"+
		"\7?\2\2\u0195\u0197\7?\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0197"+
		"L\3\2\2\2\u0198\u019c\t\6\2\2\u0199\u019a\7>\2\2\u019a\u019c\7?\2\2\u019b"+
		"\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019cN\3\2\2\2\u019d\u019e\7>\2\2\u019e"+
		"\u019f\7>\2\2\u019f\u01a0\7?\2\2\u01a0P\3\2\2\2\u01a1\u01a6\7\u22da\2"+
		"\2\u01a2\u01a3\7>\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a6\7>\2\2\u01a5\u01a1"+
		"\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6R\3\2\2\2\u01a7\u01ab\7\u226c\2\2\u01a8"+
		"\u01a9\7>\2\2\u01a9\u01ab\7>\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2\2"+
		"\2\u01abT\3\2\2\2\u01ac\u01ad\7>\2\2\u01adV\3\2\2\2\u01ae\u01b2\t\7\2"+
		"\2\u01af\u01b0\7@\2\2\u01b0\u01b2\7?\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b2X\3\2\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5\7@\2\2\u01b5\u01b6"+
		"\7?\2\2\u01b6Z\3\2\2\2\u01b7\u01bc\7\u22db\2\2\u01b8\u01b9\7@\2\2\u01b9"+
		"\u01ba\7@\2\2\u01ba\u01bc\7@\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2"+
		"\2\u01bc\\\3\2\2\2\u01bd\u01c1\7\u226d\2\2\u01be\u01bf\7@\2\2\u01bf\u01c1"+
		"\7@\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1^\3\2\2\2\u01c2\u01c3"+
		"\7@\2\2\u01c3`\3\2\2\2\u01c4\u01c8\7\u2192\2\2\u01c5\u01c6\7>\2\2\u01c6"+
		"\u01c8\7/\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8b\3\2\2\2\u01c9"+
		"\u01cd\7\u27f8\2\2\u01ca\u01cb\7/\2\2\u01cb\u01cd\7@\2\2\u01cc\u01c9\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cdd\3\2\2\2\u01ce\u01d2\7\u21d4\2\2\u01cf"+
		"\u01d0\7?\2\2\u01d0\u01d2\7@\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2"+
		"\2\u01d2f\3\2\2\2\u01d3\u01d4\7?\2\2\u01d4\u01d5\7?\2\2\u01d5\u01d6\7"+
		"@\2\2\u01d6h\3\2\2\2\u01d7\u01d8\7?\2\2\u01d8j\3\2\2\2\u01d9\u01dd\7\u2256"+
		"\2\2\u01da\u01db\7<\2\2\u01db\u01dd\7?\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01ddl\3\2\2\2\u01de\u01df\7A\2\2\u01df\u01e0\7?\2\2\u01e0n\3"+
		"\2\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\7?\2\2\u01e3p\3\2\2\2\u01e4\u01e5"+
		"\7/\2\2\u01e5\u01e6\7?\2\2\u01e6r\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8\u01e9"+
		"\7?\2\2\u01e9t\3\2\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\7?\2\2\u01ecv"+
		"\3\2\2\2\u01ed\u01ee\7\u00ae\2\2\u01eex\3\2\2\2\u01ef\u01f0\7(\2\2\u01f0"+
		"\u01f3\7(\2\2\u01f1\u01f3\7\u2229\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3z\3\2\2\2\u01f4\u01f5\7\u2a61\2\2\u01f5|\3\2\2\2\u01f6\u01f7"+
		"\7\u22be\2\2\u01f7~\3\2\2\2\u01f8\u01f9\7~\2\2\u01f9\u01fc\7~\2\2\u01fa"+
		"\u01fc\7\u222a\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u0080"+
		"\3\2\2\2\u01fd\u01fe\7\u22bd\2\2\u01fe\u0082\3\2\2\2\u01ff\u0200\7\u22bf"+
		"\2\2\u0200\u0084\3\2\2\2\u0201\u0202\7\u222b\2\2\u0202\u0086\3\2\2\2\u0203"+
		"\u0204\7\u222c\2\2\u0204\u0088\3\2\2\2\u0205\u0206\7(\2\2\u0206\u008a"+
		"\3\2\2\2\u0207\u0208\7~\2\2\u0208\u008c\3\2\2\2\u0209\u020a\7\u203f\2"+
		"\2\u020a\u008e\3\2\2\2\u020b\u020c\7\u21d6\2\2\u020c\u0090\3\2\2\2\u020d"+
		"\u020e\7\61\2\2\u020e\u0211\7B\2\2\u020f\u0211\t\b\2\2\u0210\u020d\3\2"+
		"\2\2\u0210\u020f\3\2\2\2\u0211\u0092\3\2\2\2\u0212\u0213\7B\2\2\u0213"+
		"\u0216\7B\2\2\u0214\u0216\7\u2297\2\2\u0215\u0212\3\2\2\2\u0215\u0214"+
		"\3\2\2\2\u0216\u0094\3\2\2\2\u0217\u0218\7B\2\2\u0218\u0219\7B\2\2\u0219"+
		"\u021c\7B\2\2\u021a\u021c\7\u27f6\2\2\u021b\u0217\3\2\2\2\u021b\u021a"+
		"\3\2\2\2\u021c\u0096\3\2\2\2\u021d\u021e\7B\2\2\u021e\u0098\3\2\2\2\u021f"+
		"\u0225\7%\2\2\u0220\u0221\7%\2\2\u0221\u0225\7%\2\2\u0222\u0223\7%\2\2"+
		"\u0223\u0225\7#\2\2\u0224\u021f\3\2\2\2\u0224\u0220\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0225\u009a\3\2\2\2\u0226\u022a\7&\2\2\u0227\u0228\7&\2\2\u0228"+
		"\u022a\7&\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u009c\3\2"+
		"\2\2\u022b\u022f\7\u00a9\2\2\u022c\u022d\7\u00a9\2\2\u022d\u022f\7\u00a9"+
		"\2\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u009e\3\2\2\2\u0230"+
		"\u0235\t\t\2\2\u0231\u0232\7A\2\2\u0232\u0233\7A\2\2\u0233\u0235\7A\2"+
		"\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0235\u00a0\3\2\2\2\u0236\u0237"+
		"\7A\2\2\u0237\u0238\7A\2\2\u0238\u00a2\3\2\2\2\u0239\u023a\7A\2\2\u023a"+
		"\u023b\7<\2\2\u023b\u00a4\3\2\2\2\u023c\u023d\7A\2\2\u023d\u00a6\3\2\2"+
		"\2\u023e\u023f\7#\2\2\u023f\u00a8\3\2\2\2\u0240\u0241\7p\2\2\u0241\u0242"+
		"\7q\2\2\u0242\u0243\7v\2\2\u0243\u00aa\3\2\2\2\u0244\u0245\t\n\2\2\u0245"+
		"\u00ac\3\2\2\2\u0246\u0247\7k\2\2\u0247\u0248\7p\2\2\u0248\u00ae\3\2\2"+
		"\2\u0249\u024a\7\u220b\2\2\u024a\u00b0\3\2\2\2\u024b\u024c\t\13\2\2\u024c"+
		"\u00b2\3\2\2\2\u024d\u024e\7k\2\2\u024e\u024f\7u\2\2\u024f\u00b4\3\2\2"+
		"\2\u0250\u0254\7\u2293\2\2\u0251\u0252\7>\2\2\u0252\u0254\7<\2\2\u0253"+
		"\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u00b6\3\2\2\2\u0255\u0259\7\u22e4"+
		"\2\2\u0256\u0257\7>\2\2\u0257\u0259\7#\2\2\u0258\u0255\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0259\u00b8\3\2\2\2\u025a\u025b\7c\2\2\u025b\u0263\7u\2\2\u025c"+
		"\u025d\7c\2\2\u025d\u025e\7u\2\2\u025e\u0263\7#\2\2\u025f\u0260\7c\2\2"+
		"\u0260\u0261\7u\2\2\u0261\u0263\7,\2\2\u0262\u025a\3\2\2\2\u0262\u025c"+
		"\3\2\2\2\u0262\u025f\3\2\2\2\u0263\u00ba\3\2\2\2\u0264\u0269\7\u2028\2"+
		"\2\u0265\u0266\7\60\2\2\u0266\u0267\7\60\2\2\u0267\u0269\7\60\2\2\u0268"+
		"\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0269\u00bc\3\2\2\2\u026a\u026e\7\u2027"+
		"\2\2\u026b\u026c\7\60\2\2\u026c\u026e\7\60\2\2\u026d\u026a\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u00be\3\2\2\2\u026f\u0270\7\60\2\2\u0270\u0271\7"+
		"\60\2\2\u0271\u0276\7>\2\2\u0272\u0273\7\60\2\2\u0273\u0274\7\60\2\2\u0274"+
		"\u0276\7?\2\2\u0275\u026f\3\2\2\2\u0275\u0272\3\2\2\2\u0276\u00c0\3\2"+
		"\2\2\u0277\u0278\7`\2\2\u0278\u00c2\3\2\2\2\u0279\u027a\7\u2161\2\2\u027a"+
		"\u00c4\3\2\2\2\u027b\u027c\7\u221c\2\2\u027c\u00c6\3\2\2\2\u027d\u027e"+
		"\7\u221d\2\2\u027e\u00c8\3\2\2\2\u027f\u0280\7\u221e\2\2\u0280\u00ca\3"+
		"\2\2\2\u0281\u0282\t\f\2\2\u0282\u00cc\3\2\2\2\u0283\u0284\t\r\2\2\u0284"+
		"\u00ce\3\2\2\2\u0285\u0286\4\u2032\u2033\2\u0286\u00d0\3\2\2\2\u0287\u0288"+
		"\7\u203d\2\2\u0288\u00d2\3\2\2\2\u0289\u028a\7\u00b8\2\2\u028a\u00d4\3"+
		"\2\2\2\u028b\u028c\7p\2\2\u028c\u028d\7c\2\2\u028d\u028e\7o\2\2\u028e"+
		"\u028f\7g\2\2\u028f\u0290\7u\2\2\u0290\u0291\7r\2\2\u0291\u0292\7c\2\2"+
		"\u0292\u0293\7e\2\2\u0293\u0294\7g\2\2\u0294\u0296\3\2\2\2\u0295\u0297"+
		"\t\16\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u00d6\3\2\2\2"+
		"\u0298\u0299\7w\2\2\u0299\u029a\7u\2\2\u029a\u029b\7k\2\2\u029b\u029c"+
		"\7p\2\2\u029c\u029d\7i\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\t\16\2\2\u029f"+
		"\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u00d8\3\2\2\2\u02a1\u02a2\7g"+
		"\2\2\u02a2\u02a3\7z\2\2\u02a3\u02a4\7v\2\2\u02a4\u02a5\7g\2\2\u02a5\u02a6"+
		"\7p\2\2\u02a6\u02a7\7u\2\2\u02a7\u02a8\7k\2\2\u02a8\u02a9\7q\2\2\u02a9"+
		"\u02aa\7p\2\2\u02aa\u00da\3\2\2\2\u02ab\u02ac\7e\2\2\u02ac\u02ad\7n\2"+
		"\2\u02ad\u02ae\7c\2\2\u02ae\u02af\7u\2\2\u02af\u02ba\7u\2\2\u02b0\u02b1"+
		"\7u\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3\7t\2\2\u02b3\u02b4\7w\2\2\u02b4"+
		"\u02b5\7e\2\2\u02b5\u02b6\7v\2\2\u02b6\u02b7\7w\2\2\u02b7\u02b8\7t\2\2"+
		"\u02b8\u02ba\7g\2\2\u02b9\u02ab\3\2\2\2\u02b9\u02b0\3\2\2\2\u02ba\u00dc"+
		"\3\2\2\2\u02bb\u02bc\7v\2\2\u02bc\u02bd\7t\2\2\u02bd\u02be\7c\2\2\u02be"+
		"\u02bf\7k\2\2\u02bf\u02ca\7v\2\2\u02c0\u02c1\7k\2\2\u02c1\u02c2\7p\2\2"+
		"\u02c2\u02c3\7v\2\2\u02c3\u02c4\7g\2\2\u02c4\u02c5\7t\2\2\u02c5\u02c6"+
		"\7h\2\2\u02c6\u02c7\7c\2\2\u02c7\u02c8\7e\2\2\u02c8\u02ca\7g\2\2\u02c9"+
		"\u02bb\3\2\2\2\u02c9\u02c0\3\2\2\2\u02ca\u00de\3\2\2\2\u02cb\u02cc\7w"+
		"\2\2\u02cc\u02cd\7p\2\2\u02cd\u02ce\7k\2\2\u02ce\u02cf\7q\2\2\u02cf\u02d0"+
		"\7p\2\2\u02d0\u00e0\3\2\2\2\u02d1\u02d2\7h\2\2\u02d2\u02d3\7n\2\2\u02d3"+
		"\u02d4\7c\2\2\u02d4\u02d5\7i\2\2\u02d5\u02d6\7u\2\2\u02d6\u00e2\3\2\2"+
		"\2\u02d7\u02d8\7v\2\2\u02d8\u02d9\7{\2\2\u02d9\u02da\7r\2\2\u02da\u02db"+
		"\7g\2\2\u02db\u00e4\3\2\2\2\u02dc\u02dd\7v\2\2\u02dd\u02de\7g\2\2\u02de"+
		"\u02df\7o\2\2\u02df\u02e0\7r\2\2\u02e0\u02e1\7n\2\2\u02e1\u02e2\7c\2\2"+
		"\u02e2\u02e3\7v\2\2\u02e3\u02e4\7g\2\2\u02e4\u00e6\3\2\2\2\u02e5\u02e6"+
		"\7g\2\2\u02e6\u02e7\7z\2\2\u02e7\u02e8\7v\2\2\u02e8\u02e9\7g\2\2\u02e9"+
		"\u02ea\7p\2\2\u02ea\u02eb\7f\2\2\u02eb\u02ec\7u\2\2\u02ec\u00e8\3\2\2"+
		"\2\u02ed\u02ee\7k\2\2\u02ee\u02ef\7o\2\2\u02ef\u02f0\7r\2\2\u02f0\u02f1"+
		"\7n\2\2\u02f1\u02f2\7g\2\2\u02f2\u02f3\7o\2\2\u02f3\u02f4\7g\2\2\u02f4"+
		"\u02f5\7p\2\2\u02f5\u02f6\7v\2\2\u02f6\u02f7\7u\2\2\u02f7\u00ea\3\2\2"+
		"\2\u02f8\u02f9\7y\2\2\u02f9\u02fa\7j\2\2\u02fa\u02fb\7k\2\2\u02fb\u02fc"+
		"\7n\2\2\u02fc\u0303\7g\2\2\u02fd\u02fe\7w\2\2\u02fe\u02ff\7p\2\2\u02ff"+
		"\u0300\7v\2\2\u0300\u0301\7k\2\2\u0301\u0303\7n\2\2\u0302\u02f8\3\2\2"+
		"\2\u0302\u02fd\3\2\2\2\u0303\u00ec\3\2\2\2\u0304\u0305\7h\2\2\u0305\u0306"+
		"\7q\2\2\u0306\u0307\7t\2\2\u0307\u00ee\3\2\2\2\u0308\u0309\7n\2\2\u0309"+
		"\u030a\7g\2\2\u030a\u030b\7v\2\2\u030b\u00f0\3\2\2\2\u030c\u030d\7y\2"+
		"\2\u030d\u030e\7j\2\2\u030e\u030f\7k\2\2\u030f\u0310\7e\2\2\u0310\u0311"+
		"\7j\2\2\u0311\u00f2\3\2\2\2\u0312\u0313\7p\2\2\u0313\u0314\7g\2\2\u0314"+
		"\u0315\7y\2\2\u0315\u00f4\3\2\2\2\u0316\u0317\7q\2\2\u0317\u0318\7d\2"+
		"\2\u0318\u0319\7l\2\2\u0319\u031a\7g\2\2\u031a\u031b\7e\2\2\u031b\u031c"+
		"\7v\2\2\u031c\u00f6\3\2\2\2\u031d\u031e\7n\2\2\u031e\u031f\7c\2\2\u031f"+
		"\u0320\7o\2\2\u0320\u0321\7d\2\2\u0321\u0322\7f\2\2\u0322\u0323\7c\2\2"+
		"\u0323\u00f8\3\2\2\2\u0324\u0325\7h\2\2\u0325\u0326\7w\2\2\u0326\u0327"+
		"\7p\2\2\u0327\u0328\7e\2\2\u0328\u0329\7v\2\2\u0329\u032a\7k\2\2\u032a"+
		"\u032b\7q\2\2\u032b\u0337\7p\2\2\u032c\u032d\7o\2\2\u032d\u032e\7k\2\2"+
		"\u032e\u032f\7e\2\2\u032f\u0330\7t\2\2\u0330\u0337\7q\2\2\u0331\u0332"+
		"\7o\2\2\u0332\u0333\7c\2\2\u0333\u0334\7e\2\2\u0334\u0335\7t\2\2\u0335"+
		"\u0337\7q\2\2\u0336\u0324\3\2\2\2\u0336\u032c\3\2\2\2\u0336\u0331\3\2"+
		"\2\2\u0337\u00fa\3\2\2\2\u0338\u0339\7v\2\2\u0339\u033a\7t\2\2\u033a\u033b"+
		"\7{\2\2\u033b\u00fc\3\2\2\2\u033c\u033d\7o\2\2\u033d\u033e\7c\2\2\u033e"+
		"\u033f\7v\2\2\u033f\u0340\7e\2\2\u0340\u0341\7j\2\2\u0341\u00fe\3\2\2"+
		"\2\u0342\u0343\7e\2\2\u0343\u0344\7c\2\2\u0344\u0345\7v\2\2\u0345\u0346"+
		"\7e\2\2\u0346\u0347\7j\2\2\u0347\u0100\3\2\2\2\u0348\u0349\7y\2\2\u0349"+
		"\u034a\7k\2\2\u034a\u034b\7v\2\2\u034b\u034c\7j\2\2\u034c\u0102\3\2\2"+
		"\2\u034d\u034e\7e\2\2\u034e\u034f\7c\2\2\u034f\u0350\7u\2\2\u0350\u0351"+
		"\7g\2\2\u0351\u0104\3\2\2\2\u0352\u0353\7y\2\2\u0353\u0354\7j\2\2\u0354"+
		"\u0355\7g\2\2\u0355\u0356\7p\2\2\u0356\u0106\3\2\2\2\u0357\u0360\t\17"+
		"\2\2\u0358\u035c\t\20\2\2\u0359\u035b\t\21\2\2\u035a\u0359\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u0358\3\2\2\2\u0360"+
		"\u0108\3\2\2\2\u0361\u0362\5\u0107\u0084\2\u0362\u0363\5\3\2\2\u0363\u0365"+
		"\5\u0107\u0084\2\u0364\u0366\5\u010b\u0086\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u036b\3\2\2\2\u0367\u0368\5\u0107\u0084\2\u0368\u0369"+
		"\5\u010b\u0086\2\u0369\u036b\3\2\2\2\u036a\u0361\3\2\2\2\u036a\u0367\3"+
		"\2\2\2\u036b\u010a\3\2\2\2\u036c\u036e\t\22\2\2\u036d\u036f\t\23\2\2\u036e"+
		"\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\5\u0107"+
		"\u0084\2\u0371\u010c\3\2\2\2\u0372\u0376\7)\2\2\u0373\u0375\n\24\2\2\u0374"+
		"\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0379\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037a\7)\2\2\u037a"+
		"\u010e\3\2\2\2\u037b\u037f\7$\2\2\u037c\u037e\n\25\2\2\u037d\u037c\3\2"+
		"\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0382\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7$\2\2\u0383\u0110\3\2"+
		"\2\2\u0384\u0385\7$\2\2\u0385\u0386\7$\2\2\u0386\u0387\7$\2\2\u0387\u038b"+
		"\3\2\2\2\u0388\u038a\13\2\2\2\u0389\u0388\3\2\2\2\u038a\u038d\3\2\2\2"+
		"\u038b\u038c\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038b"+
		"\3\2\2\2\u038e\u038f\7$\2\2\u038f\u0390\7$\2\2\u0390\u039f\7$\2\2\u0391"+
		"\u0392\7)\2\2\u0392\u0393\7)\2\2\u0393\u0394\7)\2\2\u0394\u0398\3\2\2"+
		"\2\u0395\u0397\13\2\2\2\u0396\u0395\3\2\2\2\u0397\u039a\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0398\3\2"+
		"\2\2\u039b\u039c\7)\2\2\u039c\u039d\7)\2\2\u039d\u039f\7)\2\2\u039e\u0384"+
		"\3\2\2\2\u039e\u0391\3\2\2\2\u039f\u0112\3\2\2\2\u03a0\u03a1\7k\2\2\u03a1"+
		"\u03a2\7h\2\2\u03a2\u0114\3\2\2\2\u03a3\u03a4\7g\2\2\u03a4\u03a5\7n\2"+
		"\2\u03a5\u03a6\7u\2\2\u03a6\u03a7\7g\2\2\u03a7\u0116\3\2\2\2\u03a8\u03a9"+
		"\7q\2\2\u03a9\u03aa\7v\2\2\u03aa\u03ab\7j\2\2\u03ab\u03ac\7g\2\2\u03ac"+
		"\u03ad\7t\2\2\u03ad\u03ae\7y\2\2\u03ae\u03af\7k\2\2\u03af\u03b0\7u\2\2"+
		"\u03b0\u03b1\7g\2\2\u03b1\u0118\3\2\2\2\u03b2\u03b3\7t\2\2\u03b3\u03b4"+
		"\7g\2\2\u03b4\u03b5\7v\2\2\u03b5\u03b6\7w\2\2\u03b6\u03b7\7t\2\2\u03b7"+
		"\u03b8\7p\2\2\u03b8\u011a\3\2\2\2\u03b9\u03ba\7t\2\2\u03ba\u03bb\7g\2"+
		"\2\u03bb\u03bc\7u\2\2\u03bc\u03bd\7w\2\2\u03bd\u03be\7o\2\2\u03be\u03bf"+
		"\7g\2\2\u03bf\u011c\3\2\2\2\u03c0\u03c1\7{\2\2\u03c1\u03c2\7k\2\2\u03c2"+
		"\u03c3\7g\2\2\u03c3\u03c4\7n\2\2\u03c4\u03c5\7f\2\2\u03c5\u011e\3\2\2"+
		"\2\u03c6\u03c7\7d\2\2\u03c7\u03c8\7t\2\2\u03c8\u03c9\7g\2\2\u03c9\u03ca"+
		"\7c\2\2\u03ca\u03cb\7m\2\2\u03cb\u0120\3\2\2\2\u03cc\u03cd\7e\2\2\u03cd"+
		"\u03ce\7q\2\2\u03ce\u03cf\7p\2\2\u03cf\u03d0\7v\2\2\u03d0\u03d1\7k\2\2"+
		"\u03d1\u03d2\7p\2\2\u03d2\u03d3\7w\2\2\u03d3\u03d4\7g\2\2\u03d4\u0122"+
		"\3\2\2\2\u03d5\u03d6\7t\2\2\u03d6\u03d7\7c\2\2\u03d7\u03d8\7k\2\2\u03d8"+
		"\u03d9\7u\2\2\u03d9\u03da\7g\2\2\u03da\u0124\3\2\2\2\u03db\u03dc\7v\2"+
		"\2\u03dc\u03dd\7t\2\2\u03dd\u03de\7w\2\2\u03de\u03ed\7g\2\2\u03df\u03e0"+
		"\7h\2\2\u03e0\u03e1\7c\2\2\u03e1\u03e2\7n\2\2\u03e2\u03e3\7u\2\2\u03e3"+
		"\u03ed\7g\2\2\u03e4\u03e5\7p\2\2\u03e5\u03e6\7w\2\2\u03e6\u03e7\7n\2\2"+
		"\u03e7\u03ed\7n\2\2\u03e8\u03e9\7p\2\2\u03e9\u03ea\7k\2\2\u03ea\u03ed"+
		"\7n\2\2\u03eb\u03ed\7\u2207\2\2\u03ec\u03db\3\2\2\2\u03ec\u03df\3\2\2"+
		"\2\u03ec\u03e4\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u0126"+
		"\3\2\2\2\u03ee\u03f0\7b\2\2\u03ef\u03f1\n\26\2\2\u03f0\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f5\7b\2\2\u03f5\u0128\3\2\2\2\u03f6\u03fa\t\31\2\2\u03f7"+
		"\u03f9\t\32\2\2\u03f8\u03f7\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3"+
		"\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u012a\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd"+
		"\u03fe\7\61\2\2\u03fe\u03ff\7\61\2\2\u03ff\u0403\3\2\2\2\u0400\u0402\n"+
		"\27\2\2\u0401\u0400\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0407\b\u0096"+
		"\2\2\u0407\u012c\3\2\2\2\u0408\u0409\7\61\2\2\u0409\u040a\7,\2\2\u040a"+
		"\u040e\3\2\2\2\u040b\u040d\13\2\2\2\u040c\u040b\3\2\2\2\u040d\u0410\3"+
		"\2\2\2\u040e\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0411\u0412\7,\2\2\u0412\u0413\7\61\2\2\u0413\u0414\3\2"+
		"\2\2\u0414\u0415\b\u0097\2\2\u0415\u012e\3\2\2\2\u0416\u0418\t\30\2\2"+
		"\u0417\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\b\u0098\2\2\u041c\u0130\3\2\2"+
		"\2\u041d\u041e\13\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\b\u0099\2\2\u0420"+
		"\u0132\3\2\2\28\2\u013c\u0141\u017c\u0187\u0190\u0196\u019b\u01a5\u01aa"+
		"\u01b1\u01bb\u01c0\u01c7\u01cc\u01d1\u01dc\u01f2\u01fb\u0210\u0215\u021b"+
		"\u0224\u0229\u022e\u0234\u0253\u0258\u0262\u0268\u026d\u0275\u0296\u029f"+
		"\u02b9\u02c9\u0302\u0336\u035c\u035f\u0365\u036a\u036e\u0376\u037f\u038b"+
		"\u0398\u039e\u03ec\u03f2\u03fa\u0403\u040e\u0419\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}