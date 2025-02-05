// Generated from /Users/rahul/IdeaProjects/Easy Calculator/src/easycalc/grammar/EasyCalc.g4 by ANTLR 4.13.2
package easycalc.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EasyCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENDMARK=1, SEMICOLON=2, BOOLEAN=3, INTEGER=4, FLOATING=5, ASSIGNOP=6, 
		READ=7, WRITE=8, LPAREN=9, RPAREN=10, TO_INT=11, TO_REAL=12, MULTIPLY=13, 
		DIVIDE=14, PLUS=15, MINUS=16, LESSTHAN=17, GREATERTHAN=18, EQUALS=19, 
		AND=20, OR=21, IF=22, THEN=23, ELSE=24, LITERAL=25, IDENTIFIER=26, WHITESPACE=27;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_datatype = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_inputStmt = 5, RULE_outputStmt = 6, RULE_expression = 7, 
		RULE_mathOp = 8, RULE_compareOp = 9, RULE_logicOp = 10, RULE_typecast = 11, 
		RULE_conditional = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "datatype", "statement", "assignment", "inputStmt", 
			"outputStmt", "expression", "mathOp", "compareOp", "logicOp", "typecast", 
			"conditional"
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

	@Override
	public String getGrammarFileName() { return "EasyCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EasyCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ENDMARK() { return getToken(EasyCalcParser.ENDMARK, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(26);
				declaration();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67109248L) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(ENDMARK);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EasyCalcParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(EasyCalcParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			datatype();
			setState(41);
			match(IDENTIFIER);
			setState(42);
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
	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(EasyCalcParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(EasyCalcParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(EasyCalcParser.FLOATING, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assignment();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				inputStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				outputStmt();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EasyCalcParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNOP() { return getToken(EasyCalcParser.ASSIGNOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EasyCalcParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IDENTIFIER);
			setState(52);
			match(ASSIGNOP);
			setState(53);
			expression(0);
			setState(54);
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
	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(EasyCalcParser.READ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EasyCalcParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(EasyCalcParser.SEMICOLON, 0); }
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(READ);
			setState(57);
			match(IDENTIFIER);
			setState(58);
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
	public static class OutputStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(EasyCalcParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EasyCalcParser.SEMICOLON, 0); }
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitOutputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitOutputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(WRITE);
			setState(61);
			expression(0);
			setState(62);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ExpressionContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public IfStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConversionContext extends ExpressionContext {
		public TypecastContext typecast() {
			return getRuleContext(TypecastContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EasyCalcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EasyCalcParser.RPAREN, 0); }
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(EasyCalcParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ExpressionContext {
		public TerminalNode LITERAL() { return getToken(EasyCalcParser.LITERAL, 0); }
		public LiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MathOpContext mathOp() {
			return getRuleContext(MathOpContext.class,0);
		}
		public MathContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public LogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(EasyCalcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EasyCalcParser.RPAREN, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitParentheses(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(LPAREN);
				setState(68);
				expression(0);
				setState(69);
				match(RPAREN);
				}
				break;
			case TO_INT:
			case TO_REAL:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				typecast();
				setState(72);
				match(LPAREN);
				setState(73);
				expression(0);
				setState(74);
				match(RPAREN);
				}
				break;
			case IF:
				{
				_localctx = new IfStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				conditional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MathContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						mathOp();
						setState(81);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						compareOp();
						setState(85);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						logicOp();
						setState(89);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class MathOpContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(EasyCalcParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(EasyCalcParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(EasyCalcParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EasyCalcParser.MINUS, 0); }
		public MathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterMathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitMathOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitMathOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOpContext mathOp() throws RecognitionException {
		MathOpContext _localctx = new MathOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
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
	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(EasyCalcParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(EasyCalcParser.GREATERTHAN, 0); }
		public TerminalNode EQUALS() { return getToken(EasyCalcParser.EQUALS, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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
	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(EasyCalcParser.AND, 0); }
		public TerminalNode OR() { return getToken(EasyCalcParser.OR, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
	public static class TypecastContext extends ParserRuleContext {
		public TerminalNode TO_INT() { return getToken(EasyCalcParser.TO_INT, 0); }
		public TerminalNode TO_REAL() { return getToken(EasyCalcParser.TO_REAL, 0); }
		public TypecastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterTypecast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitTypecast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitTypecast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecastContext typecast() throws RecognitionException {
		TypecastContext _localctx = new TypecastContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typecast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==TO_INT || _la==TO_REAL) ) {
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
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EasyCalcParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(EasyCalcParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(EasyCalcParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyCalcListener ) ((EasyCalcListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyCalcVisitor ) return ((EasyCalcVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			expression(0);
			setState(106);
			match(THEN);
			setState(107);
			expression(0);
			setState(108);
			match(ELSE);
			setState(109);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001bp\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\\\b"+
		"\u0007\n\u0007\f\u0007_\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u000e\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0001\u0000\u0003"+
		"\u0005\u0001\u0000\r\u0010\u0001\u0000\u0011\u0013\u0001\u0000\u0014\u0015"+
		"\u0001\u0000\u000b\fm\u0000\u001d\u0001\u0000\u0000\u0000\u0002(\u0001"+
		"\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b3\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f<\u0001"+
		"\u0000\u0000\u0000\u000eM\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000"+
		"\u0000\u0012b\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016"+
		"f\u0001\u0000\u0000\u0000\u0018h\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e#\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 \"\u0003\u0006\u0003\u0000! \u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000"+
		"\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005"+
		"\u001a\u0000\u0000*+\u0005\u0002\u0000\u0000+\u0003\u0001\u0000\u0000"+
		"\u0000,-\u0007\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.2\u0003"+
		"\b\u0004\u0000/2\u0003\n\u0005\u000002\u0003\f\u0006\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0007"+
		"\u0001\u0000\u0000\u000034\u0005\u001a\u0000\u000045\u0005\u0006\u0000"+
		"\u000056\u0003\u000e\u0007\u000067\u0005\u0002\u0000\u00007\t\u0001\u0000"+
		"\u0000\u000089\u0005\u0007\u0000\u00009:\u0005\u001a\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\b\u0000\u0000"+
		"=>\u0003\u000e\u0007\u0000>?\u0005\u0002\u0000\u0000?\r\u0001\u0000\u0000"+
		"\u0000@A\u0006\u0007\uffff\uffff\u0000AN\u0005\u0019\u0000\u0000BN\u0005"+
		"\u001a\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005"+
		"\n\u0000\u0000FN\u0001\u0000\u0000\u0000GH\u0003\u0016\u000b\u0000HI\u0005"+
		"\t\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\n\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LN\u0003\u0018\f\u0000M@\u0001\u0000\u0000\u0000MB\u0001"+
		"\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000N]\u0001\u0000\u0000\u0000OP\n\u0004\u0000\u0000"+
		"PQ\u0003\u0010\b\u0000QR\u0003\u000e\u0007\u0005R\\\u0001\u0000\u0000"+
		"\u0000ST\n\u0003\u0000\u0000TU\u0003\u0012\t\u0000UV\u0003\u000e\u0007"+
		"\u0004V\\\u0001\u0000\u0000\u0000WX\n\u0002\u0000\u0000XY\u0003\u0014"+
		"\n\u0000YZ\u0003\u000e\u0007\u0003Z\\\u0001\u0000\u0000\u0000[O\u0001"+
		"\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\u000f\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0007"+
		"\u0001\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0007\u0002\u0000"+
		"\u0000c\u0013\u0001\u0000\u0000\u0000de\u0007\u0003\u0000\u0000e\u0015"+
		"\u0001\u0000\u0000\u0000fg\u0007\u0004\u0000\u0000g\u0017\u0001\u0000"+
		"\u0000\u0000hi\u0005\u0016\u0000\u0000ij\u0003\u000e\u0007\u0000jk\u0005"+
		"\u0017\u0000\u0000kl\u0003\u000e\u0007\u0000lm\u0005\u0018\u0000\u0000"+
		"mn\u0003\u000e\u0007\u0000n\u0019\u0001\u0000\u0000\u0000\u0006\u001d"+
		"#1M[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}