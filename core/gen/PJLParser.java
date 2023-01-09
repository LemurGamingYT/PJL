package core.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PJLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, ARITHOPS=5, LOGICOPS=6, BOOLOPS=7, 
		DUALOPS=8, SEMI=9, DOT=10, COMMA=11, EQUALS=12, IF=13, ELSE=14, WHILE=15, 
		FOR=16, FUNC=17, NULL=18, BOOL=19, ID=20, STRING=21, FLOAT=22, INT=23, 
		WHITESPACE=24, COMMENT=25, MULTILINECOMMENT=26;
	public static final int
		RULE_parse = 0, RULE_stmt = 1, RULE_var_assignment = 2, RULE_func_assignment = 3, 
		RULE_if_stmt = 4, RULE_while_stmt = 5, RULE_for_stmt = 6, RULE_conditional_block = 7, 
		RULE_call = 8, RULE_args = 9, RULE_params = 10, RULE_block = 11, RULE_expr = 12, 
		RULE_atom = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "stmt", "var_assignment", "func_assignment", "if_stmt", "while_stmt", 
			"for_stmt", "conditional_block", "call", "args", "params", "block", "expr", 
			"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", null, null, null, null, "';'", "'.'", 
			"','", "'='", "'if'", "'else'", "'while'", "'for'", null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ARITHOPS", "LOGICOPS", 
			"BOOLOPS", "DUALOPS", "SEMI", "DOT", "COMMA", "EQUALS", "IF", "ELSE", 
			"WHILE", "FOR", "FUNC", "NULL", "BOOL", "ID", "STRING", "FLOAT", "INT", 
			"WHITESPACE", "COMMENT", "MULTILINECOMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PJLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PJLParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16752640L) != 0) {
				{
				{
				setState(28);
				stmt();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PJLParser.SEMI, 0); }
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Func_assignmentContext func_assignment() {
			return getRuleContext(Func_assignmentContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				expr(0);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(37);
					match(SEMI);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				var_assignment();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(41);
					match(SEMI);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				func_assignment();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(45);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				while_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				for_stmt();
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
	public static class Var_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PJLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(PJLParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitVar_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(EQUALS);
			setState(55);
			expr(0);
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
	public static class Func_assignmentContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(PJLParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(PJLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PJLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PJLParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitFunc_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_assignmentContext func_assignment() throws RecognitionException {
		Func_assignmentContext _localctx = new Func_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(FUNC);
			setState(58);
			match(ID);
			setState(59);
			match(LPAREN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				params();
				}
			}

			setState(63);
			match(RPAREN);
			setState(64);
			block();
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
	public static class If_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PJLParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PJLParser.IF, i);
		}
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(PJLParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(PJLParser.ELSE, i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IF);
			setState(67);
			conditional_block();
			setState(68);
			block();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(ELSE);
					setState(70);
					match(IF);
					setState(71);
					conditional_block();
					setState(72);
					block();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(79);
				match(ELSE);
				setState(80);
				block();
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PJLParser.WHILE, 0); }
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			conditional_block();
			setState(85);
			block();
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PJLParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PJLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PJLParser.ID, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PJLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PJLParser.SEMI, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DUALOPS() { return getToken(PJLParser.DUALOPS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FOR);
			setState(88);
			match(ID);
			setState(89);
			match(SEMI);
			setState(90);
			expr(0);
			setState(91);
			match(SEMI);
			setState(92);
			match(ID);
			setState(93);
			match(DUALOPS);
			setState(94);
			block();
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
	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PJLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PJLParser.RPAREN, 0); }
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitConditional_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional_block);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(LPAREN);
				setState(97);
				expr(0);
				setState(98);
				match(RPAREN);
				}
				break;
			case NULL:
			case BOOL:
			case ID:
			case STRING:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				expr(0);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PJLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PJLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PJLParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0) {
				{
				setState(105);
				args();
				}
			}

			setState(108);
			match(RPAREN);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PJLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PJLParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expr(0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				expr(0);
				}
				}
				setState(117);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PJLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PJLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PJLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PJLParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				match(ID);
				}
				}
				setState(125);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PJLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PJLParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LBRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16752640L) != 0) {
				{
				{
				setState(127);
				stmt();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RBRACE);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ARITHOPS() { return getToken(PJLParser.ARITHOPS, 0); }
		public TerminalNode LOGICOPS() { return getToken(PJLParser.LOGICOPS, 0); }
		public TerminalNode BOOLOPS() { return getToken(PJLParser.BOOLOPS, 0); }
		public TerminalNode DUALOPS() { return getToken(PJLParser.DUALOPS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(136);
				atom();
				}
				break;
			case 2:
				{
				setState(137);
				call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						((ExprContext)_localctx).op = match(ARITHOPS);
						setState(142);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						((ExprContext)_localctx).op = match(LOGICOPS);
						setState(145);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						((ExprContext)_localctx).op = match(BOOLOPS);
						setState(148);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(150);
						match(DUALOPS);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PJLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PJLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(PJLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PJLParser.FLOAT, 0); }
		public TerminalNode NULL() { return getToken(PJLParser.NULL, 0); }
		public TerminalNode BOOL() { return getToken(PJLParser.BOOL, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJLVisitor ) return ((PJLVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u009f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bk\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tr\b\t\n\t\f\tu"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f\u0001\r\u0001\r\u0001\r\u0000\u0001"+
		"\u0018\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0001\u0001\u0000\u0012\u0017\u00a6\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000"+
		"\u0000\u00069\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nS\u0001"+
		"\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000"+
		"\u0000\u0010g\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014"+
		"v\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u008a\u0001"+
		"\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$&\u0003\u0018\f\u0000"+
		"%\'\u0005\t\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'4\u0001\u0000\u0000\u0000(*\u0003\u0004\u0002\u0000)+\u0005\t"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+4\u0001"+
		"\u0000\u0000\u0000,.\u0003\u0006\u0003\u0000-/\u0005\t\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/4\u0001\u0000\u0000\u0000"+
		"04\u0003\b\u0004\u000014\u0003\n\u0005\u000024\u0003\f\u0006\u00003$\u0001"+
		"\u0000\u0000\u00003(\u0001\u0000\u0000\u00003,\u0001\u0000\u0000\u0000"+
		"30\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000"+
		"\u00004\u0003\u0001\u0000\u0000\u000056\u0005\u0014\u0000\u000067\u0005"+
		"\f\u0000\u000078\u0003\u0018\f\u00008\u0005\u0001\u0000\u0000\u00009:"+
		"\u0005\u0011\u0000\u0000:;\u0005\u0014\u0000\u0000;=\u0005\u0001\u0000"+
		"\u0000<>\u0003\u0014\n\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0002\u0000\u0000@A\u0003\u0016"+
		"\u000b\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005\r\u0000\u0000CD\u0003"+
		"\u000e\u0007\u0000DL\u0003\u0016\u000b\u0000EF\u0005\u000e\u0000\u0000"+
		"FG\u0005\r\u0000\u0000GH\u0003\u000e\u0007\u0000HI\u0003\u0016\u000b\u0000"+
		"IK\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MQ\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u000e\u0000\u0000PR\u0003"+
		"\u0016\u000b\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"R\t\u0001\u0000\u0000\u0000ST\u0005\u000f\u0000\u0000TU\u0003\u000e\u0007"+
		"\u0000UV\u0003\u0016\u000b\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0005"+
		"\u0010\u0000\u0000XY\u0005\u0014\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0003"+
		"\u0018\f\u0000[\\\u0005\t\u0000\u0000\\]\u0005\u0014\u0000\u0000]^\u0005"+
		"\b\u0000\u0000^_\u0003\u0016\u000b\u0000_\r\u0001\u0000\u0000\u0000`a"+
		"\u0005\u0001\u0000\u0000ab\u0003\u0018\f\u0000bc\u0005\u0002\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000df\u0003\u0018\f\u0000e`\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005\u0014"+
		"\u0000\u0000hj\u0005\u0001\u0000\u0000ik\u0003\u0012\t\u0000ji\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0002\u0000\u0000m\u0011\u0001\u0000\u0000\u0000ns\u0003\u0018\f\u0000"+
		"op\u0005\u000b\u0000\u0000pr\u0003\u0018\f\u0000qo\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t\u0013\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000v{\u0005"+
		"\u0014\u0000\u0000wx\u0005\u000b\u0000\u0000xz\u0005\u0014\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0015\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0082\u0005\u0003\u0000\u0000\u007f\u0081\u0003\u0002"+
		"\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0017\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0006\f\uffff\uffff\u0000\u0088\u008b\u0003\u001a"+
		"\r\u0000\u0089\u008b\u0003\u0010\b\u0000\u008a\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0099\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\n\u0004\u0000\u0000\u008d\u008e\u0005\u0005\u0000\u0000"+
		"\u008e\u0098\u0003\u0018\f\u0005\u008f\u0090\n\u0003\u0000\u0000\u0090"+
		"\u0091\u0005\u0006\u0000\u0000\u0091\u0098\u0003\u0018\f\u0004\u0092\u0093"+
		"\n\u0002\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0098\u0003"+
		"\u0018\f\u0003\u0095\u0096\n\u0001\u0000\u0000\u0096\u0098\u0005\b\u0000"+
		"\u0000\u0097\u008c\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000"+
		"\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0000\u0000"+
		"\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u0010\u001f&*.3=LQejs{\u0082"+
		"\u008a\u0097\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}