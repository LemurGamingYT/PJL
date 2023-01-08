package core.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PJLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, SEMI=5, DOT=6, COMMA=7, EQUALS=8, 
		IF=9, ELSE=10, FUNC=11, ID=12, STRING=13, INT=14, FLOAT=15, NULL=16, BOOL=17, 
		WHITESPACE=18, COMMENT=19, MULTILINECOMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "DOT", "COMMA", "EQUALS", 
			"IF", "ELSE", "FUNC", "ID", "STRING", "INT", "FLOAT", "NULL", "BOOL", 
			"WHITESPACE", "COMMENT", "MULTILINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'.'", "','", "'='", "'if'", 
			"'else'", null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "DOT", "COMMA", 
			"EQUALS", "IF", "ELSE", "FUNC", "ID", "STRING", "INT", "FLOAT", "NULL", 
			"BOOL", "WHITESPACE", "COMMENT", "MULTILINECOMMENT"
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


	public PJLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PJL.g4"; }

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
		"\u0004\u0000\u0014\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nH\b\n\u0001\u000b\u0001\u000b\u0005\u000bL\b\u000b\n\u000b\f\u000bO"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fU\b\f\n\f\f\fX\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0003\r]\b\r\u0001\r\u0004\r`\b\r\u000b\r\f\ra\u0001"+
		"\u000e\u0003\u000ee\b\u000e\u0001\u000e\u0004\u000eh\b\u000e\u000b\u000e"+
		"\f\u000ei\u0001\u000e\u0001\u000e\u0005\u000en\b\u000e\n\u000e\f\u000e"+
		"q\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0081\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u008d\b\u0012\u0001\u0012"+
		"\u0005\u0012\u0090\b\u0012\n\u0012\f\u0012\u0093\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u009b"+
		"\b\u0013\n\u0013\f\u0013\u009e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0002i\u009c\u0000\u0014\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u00b1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b"+
		"3\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000"+
		"\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000"+
		"\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019P"+
		"\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001dd\u0001"+
		"\u0000\u0000\u0000\u001fr\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000"+
		"\u0000#\u0082\u0001\u0000\u0000\u0000%\u008c\u0001\u0000\u0000\u0000\'"+
		"\u0096\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005)\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005"+
		"{\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005}\u0000\u00000\b\u0001"+
		"\u0000\u0000\u000012\u0005;\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005"+
		".\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005,\u0000\u00006\u000e\u0001"+
		"\u0000\u0000\u000078\u0005=\u0000\u00008\u0010\u0001\u0000\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005f\u0000\u0000;\u0012\u0001\u0000\u0000\u0000"+
		"<=\u0005e\u0000\u0000=>\u0005l\u0000\u0000>?\u0005s\u0000\u0000?@\u0005"+
		"e\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000BC\u0005"+
		"u\u0000\u0000CD\u0005n\u0000\u0000DH\u0005c\u0000\u0000EF\u0005f\u0000"+
		"\u0000FH\u0005n\u0000\u0000GA\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000H\u0016\u0001\u0000\u0000\u0000IM\u0007\u0000\u0000\u0000JL\u0007"+
		"\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0018\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PV\u0005\"\u0000\u0000QU\b\u0002"+
		"\u0000\u0000RS\u0005\"\u0000\u0000SU\u0005\"\u0000\u0000TQ\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\"\u0000\u0000Z\u001a\u0001\u0000\u0000"+
		"\u0000[]\u0005-\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0007\u0003\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u001c\u0001\u0000\u0000\u0000ce\u0005-\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fh\u0007\u0003\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ko\u0005.\u0000\u0000ln\u0007\u0003\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u001e\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0005n\u0000\u0000st\u0005u\u0000\u0000tu\u0005l"+
		"\u0000\u0000uv\u0005l\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005t\u0000"+
		"\u0000xy\u0005r\u0000\u0000yz\u0005u\u0000\u0000z\u0081\u0005e\u0000\u0000"+
		"{|\u0005f\u0000\u0000|}\u0005a\u0000\u0000}~\u0005l\u0000\u0000~\u007f"+
		"\u0005s\u0000\u0000\u007f\u0081\u0005e\u0000\u0000\u0080w\u0001\u0000"+
		"\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\"\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0007\u0004\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0006\u0011\u0000\u0000\u0085$\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005/\u0000\u0000\u0087\u008d\u0005/\u0000\u0000\u0088\u0089"+
		"\u0005<\u0000\u0000\u0089\u008a\u0005-\u0000\u0000\u008a\u008d\u0005-"+
		"\u0000\u0000\u008b\u008d\u0005#\u0000\u0000\u008c\u0086\u0001\u0000\u0000"+
		"\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u0090\b\u0005\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0006\u0012\u0000\u0000\u0095&\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005/\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098\u009c\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\t\u0000\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005*\u0000"+
		"\u0000\u00a0\u00a1\u0005/\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0006\u0013\u0000\u0000\u00a3(\u0001\u0000\u0000\u0000\u000e"+
		"\u0000GMTV\\adio\u0080\u008c\u0091\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}