// Generated from /Users/rahul/IdeaProjects/Easy Calculator/src/easycalc/grammar/EasyCalc.g4 by ANTLR 4.13.2
package easycalc.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EasyCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENDMARK=1, SEMICOLON=2, BOOLEAN=3, INTEGER=4, FLOATING=5, ASSIGNOP=6, 
		READ=7, WRITE=8, LPAREN=9, RPAREN=10, TO_INT=11, TO_REAL=12, MULTIPLY=13, 
		DIVIDE=14, PLUS=15, MINUS=16, LESSTHAN=17, GREATERTHAN=18, EQUALS=19, 
		AND=20, OR=21, IF=22, THEN=23, ELSE=24, LITERAL=25, IDENTIFIER=26, WHITESPACE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENDMARK", "SEMICOLON", "BOOLEAN", "INTEGER", "FLOATING", "ASSIGNOP", 
			"READ", "WRITE", "LPAREN", "RPAREN", "TO_INT", "TO_REAL", "MULTIPLY", 
			"DIVIDE", "PLUS", "MINUS", "LESSTHAN", "GREATERTHAN", "EQUALS", "AND", 
			"OR", "IF", "THEN", "ELSE", "LITERAL", "IDENTIFIER", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$$'", "';'", "'bool'", "'int'", "'real'", "':='", "'read'", "'write'", 
			"'('", "')'", "'to_int'", "'to_real'", "'*'", "'/'", "'+'", "'-'", "'<'", 
			"'>'", "'=='", "'and'", "'or'", "'if'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENDMARK", "SEMICOLON", "BOOLEAN", "INTEGER", "FLOATING", "ASSIGNOP", 
			"READ", "WRITE", "LPAREN", "RPAREN", "TO_INT", "TO_REAL", "MULTIPLY", 
			"DIVIDE", "PLUS", "MINUS", "LESSTHAN", "GREATERTHAN", "EQUALS", "AND", 
			"OR", "IF", "THEN", "ELSE", "LITERAL", "IDENTIFIER", "WHITESPACE"
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


	public EasyCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EasyCalc.g4"; }

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
		"\u0004\u0000\u001b\u00be\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0090"+
		"\b\u0018\u000b\u0018\f\u0018\u0091\u0001\u0018\u0005\u0018\u0095\b\u0018"+
		"\n\u0018\f\u0018\u0098\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u009e\b\u0018\u0001\u0018\u0005\u0018\u00a1\b\u0018"+
		"\n\u0018\f\u0018\u00a4\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00af\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00b3\b\u0019"+
		"\n\u0019\f\u0019\u00b6\t\u0019\u0001\u001a\u0004\u001a\u00b9\b\u001a\u000b"+
		"\u001a\f\u001a\u00ba\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz"+
		"\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00c6\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003:\u0001\u0000\u0000"+
		"\u0000\u0005<\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\t"+
		"E\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rM\u0001\u0000"+
		"\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000"+
		"\u0013Z\u0001\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000\u0017"+
		"c\u0001\u0000\u0000\u0000\u0019k\u0001\u0000\u0000\u0000\u001bm\u0001"+
		"\u0000\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000"+
		"\u0000!s\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000%w\u0001\u0000"+
		"\u0000\u0000\'z\u0001\u0000\u0000\u0000)~\u0001\u0000\u0000\u0000+\u0081"+
		"\u0001\u0000\u0000\u0000-\u0084\u0001\u0000\u0000\u0000/\u0089\u0001\u0000"+
		"\u0000\u00001\u00ae\u0001\u0000\u0000\u00003\u00b0\u0001\u0000\u0000\u0000"+
		"5\u00b8\u0001\u0000\u0000\u000078\u0005$\u0000\u000089\u0005$\u0000\u0000"+
		"9\u0002\u0001\u0000\u0000\u0000:;\u0005;\u0000\u0000;\u0004\u0001\u0000"+
		"\u0000\u0000<=\u0005b\u0000\u0000=>\u0005o\u0000\u0000>?\u0005o\u0000"+
		"\u0000?@\u0005l\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005i\u0000"+
		"\u0000BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000D\b\u0001\u0000\u0000"+
		"\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005a\u0000\u0000"+
		"HI\u0005l\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005:\u0000\u0000"+
		"KL\u0005=\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005r\u0000\u0000"+
		"NO\u0005e\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005d\u0000\u0000Q\u000e"+
		"\u0001\u0000\u0000\u0000RS\u0005w\u0000\u0000ST\u0005r\u0000\u0000TU\u0005"+
		"i\u0000\u0000UV\u0005t\u0000\u0000VW\u0005e\u0000\u0000W\u0010\u0001\u0000"+
		"\u0000\u0000XY\u0005(\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005"+
		")\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005"+
		"o\u0000\u0000^_\u0005_\u0000\u0000_`\u0005i\u0000\u0000`a\u0005n\u0000"+
		"\u0000ab\u0005t\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005t\u0000"+
		"\u0000de\u0005o\u0000\u0000ef\u0005_\u0000\u0000fg\u0005r\u0000\u0000"+
		"gh\u0005e\u0000\u0000hi\u0005a\u0000\u0000ij\u0005l\u0000\u0000j\u0018"+
		"\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u001a\u0001\u0000\u0000"+
		"\u0000mn\u0005/\u0000\u0000n\u001c\u0001\u0000\u0000\u0000op\u0005+\u0000"+
		"\u0000p\u001e\u0001\u0000\u0000\u0000qr\u0005-\u0000\u0000r \u0001\u0000"+
		"\u0000\u0000st\u0005<\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005>"+
		"\u0000\u0000v$\u0001\u0000\u0000\u0000wx\u0005=\u0000\u0000xy\u0005=\u0000"+
		"\u0000y&\u0001\u0000\u0000\u0000z{\u0005a\u0000\u0000{|\u0005n\u0000\u0000"+
		"|}\u0005d\u0000\u0000}(\u0001\u0000\u0000\u0000~\u007f\u0005o\u0000\u0000"+
		"\u007f\u0080\u0005r\u0000\u0000\u0080*\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005i\u0000\u0000\u0082\u0083\u0005f\u0000\u0000\u0083,\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005t\u0000\u0000\u0085\u0086\u0005h\u0000\u0000"+
		"\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088."+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005"+
		"l\u0000\u0000\u008b\u008c\u0005s\u0000\u0000\u008c\u008d\u0005e\u0000"+
		"\u0000\u008d0\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u00af\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009d\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005.\u0000\u0000\u009a\u009e\u0007\u0000\u0000\u0000\u009b"+
		"\u009c\u0007\u0000\u0000\u0000\u009c\u009e\u0005.\u0000\u0000\u009d\u0099"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a2"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00af"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005t\u0000\u0000\u00a6\u00a7\u0005r\u0000\u0000\u00a7\u00a8\u0005u"+
		"\u0000\u0000\u00a8\u00af\u0005e\u0000\u0000\u00a9\u00aa\u0005f\u0000\u0000"+
		"\u00aa\u00ab\u0005a\u0000\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac\u00ad"+
		"\u0005s\u0000\u0000\u00ad\u00af\u0005e\u0000\u0000\u00ae\u008f\u0001\u0000"+
		"\u0000\u0000\u00ae\u0096\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00af2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b4\u0007\u0001\u0000\u0000\u00b1\u00b3\u0007\u0002\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b54\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0003\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0006\u001a\u0000\u0000\u00bd6\u0001\u0000\u0000\u0000\b"+
		"\u0000\u0091\u0096\u009d\u00a2\u00ae\u00b4\u00ba\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}