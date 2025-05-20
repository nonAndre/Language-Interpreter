// Generated from /home/franco/Desktop/MileStone/src/lang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, BOOL=2, STRING=3, PLUS=4, MINUS=5, MUL=6, DIV=7, MOD=8, POW=9, 
		DOT=10, COMMA=11, CONCAT=12, AND=13, OR=14, EQQ=15, NEQ=16, LEQ=17, GEQ=18, 
		LT=19, GT=20, NOT=21, IF=22, THEN=23, ELSE=24, WHILE=25, FOR=26, SKIPP=27, 
		ASSIGN=28, TYPE=29, RET=30, SLY=31, ARNOLD=32, OUT=33, IN=34, TOSTR=35, 
		FUN=36, ND=37, LPAR=38, RPAR=39, LBRAK=40, RBRAK=41, LBRACE=42, RBRACE=43, 
		SEMICOLON=44, ID=45, WS=46;
	public static final int
		RULE_prog = 0, RULE_fnc = 1, RULE_com = 2, RULE_forInit = 3, RULE_forStep = 4, 
		RULE_nondetCom = 5, RULE_nondetGroup = 6, RULE_brainfuck = 7, RULE_bf = 8, 
		RULE_exp = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fnc", "com", "forInit", "forStep", "nondetCom", "nondetGroup", 
			"brainfuck", "bf", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'", 
			"','", "'++'", "'&'", "'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", 
			"'!'", "'if'", "'then'", "'else'", "'while'", "'for'", "'skip'", "'='", 
			"'var'", "'ret'", "'sly'", "'arnold'", "'print'", "'input'", "'str'", 
			"'fun'", "'ND'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "BOOL", "STRING", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"POW", "DOT", "COMMA", "CONCAT", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", 
			"LT", "GT", "NOT", "IF", "THEN", "ELSE", "WHILE", "FOR", "SKIPP", "ASSIGN", 
			"TYPE", "RET", "SLY", "ARNOLD", "OUT", "IN", "TOSTR", "FUN", "ND", "LPAR", 
			"RPAR", "LBRAK", "RBRAK", "LBRACE", "RBRACE", "SEMICOLON", "ID", "WS"
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
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(langParser.EOF, 0); }
		public List<FncContext> fnc() {
			return getRuleContexts(FncContext.class);
		}
		public FncContext fnc(int i) {
			return getRuleContext(FncContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41087508938766L) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN:
					{
					setState(20);
					fnc();
					}
					break;
				case FLOAT:
				case BOOL:
				case STRING:
				case NOT:
				case IF:
				case WHILE:
				case FOR:
				case SKIPP:
				case TYPE:
				case RET:
				case OUT:
				case IN:
				case TOSTR:
				case LPAR:
				case LBRAK:
				case LBRACE:
				case ID:
					{
					setState(21);
					com();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class FncContext extends ParserRuleContext {
		public FncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnc; }
	 
		public FncContext() { }
		public void copyFrom(FncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends FncContext {
		public TerminalNode FUN() { return getToken(langParser.FUN, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public BrainfuckContext brainfuck() {
			return getRuleContext(BrainfuckContext.class,0);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public FuncContext(FncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FncContext fnc() throws RecognitionException {
		FncContext _localctx = new FncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fnc);
		int _la;
		try {
			_localctx = new FuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(FUN);
			setState(30);
			match(ID);
			setState(31);
			match(LPAR);
			setState(32);
			match(RPAR);
			setState(33);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case BOOL:
			case STRING:
			case NOT:
			case IF:
			case WHILE:
			case FOR:
			case SKIPP:
			case TYPE:
			case RET:
			case OUT:
			case IN:
			case TOSTR:
			case LPAR:
			case LBRAK:
			case LBRACE:
			case RBRACE:
			case ID:
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41018789462030L) != 0)) {
					{
					{
					setState(34);
					com();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SLY:
				{
				setState(40);
				brainfuck();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(43);
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
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public ReAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterReAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitReAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitReAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignContext extends ComContext {
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode LBRAK() { return getToken(langParser.LBRAK, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RBRAK() { return getToken(langParser.RBRAK, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public ArrayAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ComContext {
		public TerminalNode FOR() { return getToken(langParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(langParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(langParser.SEMICOLON, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForStepContext forStep() {
			return getRuleContext(ForStepContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public ForContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(langParser.SKIPP, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(langParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComFuncCallContext extends ComContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public ComFuncCallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterComFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitComFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitComFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(langParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(langParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(langParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(langParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(langParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ComContext {
		public TerminalNode RET() { return getToken(langParser.RET, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public ReturnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainNDContext extends ComContext {
		public NondetComContext nondetCom() {
			return getRuleContext(NondetComContext.class,0);
		}
		public ChainNDContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterChainND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitChainND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitChainND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(langParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_com);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(IF);
				setState(46);
				match(LPAR);
				setState(47);
				exp(0);
				setState(48);
				match(RPAR);
				setState(49);
				match(THEN);
				setState(50);
				match(LBRACE);
				setState(51);
				com();
				setState(52);
				match(RBRACE);
				setState(53);
				match(ELSE);
				setState(54);
				match(LBRACE);
				setState(55);
				com();
				setState(56);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(TYPE);
				setState(59);
				match(ID);
				setState(60);
				match(ASSIGN);
				setState(61);
				exp(0);
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ReAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(ID);
				setState(65);
				match(ASSIGN);
				setState(66);
				exp(0);
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(TYPE);
				setState(70);
				match(ID);
				setState(71);
				match(LBRAK);
				setState(72);
				exp(0);
				setState(73);
				match(RBRAK);
				setState(74);
				match(ASSIGN);
				setState(75);
				exp(0);
				setState(76);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(SKIPP);
				setState(79);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(WHILE);
				setState(81);
				match(LPAR);
				setState(82);
				exp(0);
				setState(83);
				match(RPAR);
				setState(84);
				match(LBRACE);
				setState(85);
				com();
				setState(86);
				match(RBRACE);
				}
				break;
			case 7:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(FOR);
				setState(89);
				match(LPAR);
				setState(90);
				forInit();
				setState(91);
				match(SEMICOLON);
				setState(92);
				exp(0);
				setState(93);
				match(SEMICOLON);
				setState(94);
				forStep();
				setState(95);
				match(RPAR);
				setState(96);
				match(LBRACE);
				setState(97);
				com();
				setState(98);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new OutContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(OUT);
				setState(101);
				match(LPAR);
				setState(102);
				exp(0);
				setState(103);
				match(RPAR);
				setState(104);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				match(RET);
				setState(107);
				match(ID);
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ComFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				exp(0);
				setState(110);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new ChainNDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				nondetCom();
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
	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyForInitContext extends ForInitContext {
		public EmptyForInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterEmptyForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitEmptyForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitEmptyForInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForReassignInitContext extends ForInitContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForReassignInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterForReassignInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitForReassignInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitForReassignInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclInitContext extends ForInitContext {
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForDeclInitContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterForDeclInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitForDeclInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitForDeclInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forInit);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new ForDeclInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(TYPE);
				setState(116);
				match(ID);
				setState(117);
				match(ASSIGN);
				setState(118);
				exp(0);
				}
				break;
			case ID:
				_localctx = new ForReassignInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				setState(120);
				match(ASSIGN);
				setState(121);
				exp(0);
				}
				break;
			case SEMICOLON:
				_localctx = new EmptyForInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
	public static class ForStepContext extends ParserRuleContext {
		public ForStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStep; }
	 
		public ForStepContext() { }
		public void copyFrom(ForStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForReassignStepContext extends ForStepContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForReassignStepContext(ForStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterForReassignStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitForReassignStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitForReassignStep(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyForStepContext extends ForStepContext {
		public EmptyForStepContext(ForStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterEmptyForStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitEmptyForStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitEmptyForStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStepContext forStep() throws RecognitionException {
		ForStepContext _localctx = new ForStepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStep);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ForReassignStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(ID);
				setState(126);
				match(ASSIGN);
				setState(127);
				exp(0);
				}
				break;
			case RPAR:
				_localctx = new EmptyForStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class NondetComContext extends ParserRuleContext {
		public NondetComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondetCom; }
	 
		public NondetComContext() { }
		public void copyFrom(NondetComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExploreChainContext extends NondetComContext {
		public List<NondetGroupContext> nondetGroup() {
			return getRuleContexts(NondetGroupContext.class);
		}
		public NondetGroupContext nondetGroup(int i) {
			return getRuleContext(NondetGroupContext.class,i);
		}
		public List<TerminalNode> ND() { return getTokens(langParser.ND); }
		public TerminalNode ND(int i) {
			return getToken(langParser.ND, i);
		}
		public ExploreChainContext(NondetComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterExploreChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitExploreChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitExploreChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NondetComContext nondetCom() throws RecognitionException {
		NondetComContext _localctx = new NondetComContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nondetCom);
		int _la;
		try {
			_localctx = new ExploreChainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			nondetGroup();
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(ND);
				setState(133);
				nondetGroup();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ND );
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
	public static class NondetGroupContext extends ParserRuleContext {
		public NondetGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nondetGroup; }
	 
		public NondetGroupContext() { }
		public void copyFrom(NondetGroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsideCurlyContext extends NondetGroupContext {
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public InsideCurlyContext(NondetGroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterInsideCurly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitInsideCurly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitInsideCurly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsideBrakeContext extends NondetGroupContext {
		public TerminalNode LBRAK() { return getToken(langParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(langParser.RBRAK, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public InsideBrakeContext(NondetGroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterInsideBrake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitInsideBrake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitInsideBrake(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsedeBraceContext extends NondetGroupContext {
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public InsedeBraceContext(NondetGroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterInsedeBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitInsedeBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitInsedeBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NondetGroupContext nondetGroup() throws RecognitionException {
		NondetGroupContext _localctx = new NondetGroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nondetGroup);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new InsideCurlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(LPAR);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41018789462030L) != 0)) {
					{
					{
					setState(139);
					com();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(RPAR);
				}
				break;
			case LBRAK:
				_localctx = new InsideBrakeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LBRAK);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41018789462030L) != 0)) {
					{
					{
					setState(147);
					com();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(RBRAK);
				}
				break;
			case LBRACE:
				_localctx = new InsedeBraceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(LBRACE);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41018789462030L) != 0)) {
					{
					{
					setState(155);
					com();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(RBRACE);
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
	public static class BrainfuckContext extends ParserRuleContext {
		public BrainfuckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brainfuck; }
	 
		public BrainfuckContext() { }
		public void copyFrom(BrainfuckContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfcommandContext extends BrainfuckContext {
		public TerminalNode SLY() { return getToken(langParser.SLY, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public BfContext bf() {
			return getRuleContext(BfContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public TerminalNode ARNOLD() { return getToken(langParser.ARNOLD, 0); }
		public BfcommandContext(BrainfuckContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBfcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBfcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBfcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrainfuckContext brainfuck() throws RecognitionException {
		BrainfuckContext _localctx = new BrainfuckContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_brainfuck);
		try {
			_localctx = new BfcommandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(SLY);
			setState(165);
			match(LBRACE);
			setState(166);
			bf();
			setState(167);
			match(RBRACE);
			setState(168);
			match(ARNOLD);
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
	public static class BfContext extends ParserRuleContext {
		public BfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bf; }
	 
		public BfContext() { }
		public void copyFrom(BfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfsintaxContext extends BfContext {
		public Token OP;
		public BfContext bf() {
			return getRuleContext(BfContext.class,0);
		}
		public TerminalNode LT() { return getToken(langParser.LT, 0); }
		public TerminalNode GT() { return getToken(langParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(langParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(langParser.MINUS, 0); }
		public TerminalNode DOT() { return getToken(langParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(langParser.COMMA, 0); }
		public BfsintaxContext(BfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBfsintax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBfsintax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBfsintax(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilContext extends BfContext {
		public NilContext(BfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfloopContext extends BfContext {
		public TerminalNode LBRAK() { return getToken(langParser.LBRAK, 0); }
		public List<BfContext> bf() {
			return getRuleContexts(BfContext.class);
		}
		public BfContext bf(int i) {
			return getRuleContext(BfContext.class,i);
		}
		public TerminalNode RBRAK() { return getToken(langParser.RBRAK, 0); }
		public BfloopContext(BfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBfloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBfloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBfloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfContext bf() throws RecognitionException {
		BfContext _localctx = new BfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bf);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case DOT:
			case COMMA:
			case LT:
			case GT:
				_localctx = new BfsintaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((BfsintaxContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1575984L) != 0)) ) {
					((BfsintaxContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				bf();
				}
				break;
			case LBRAK:
				_localctx = new BfloopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LBRAK);
				setState(173);
				bf();
				setState(174);
				match(RBRAK);
				setState(175);
				bf();
				}
				break;
			case RBRAK:
			case RBRACE:
				_localctx = new NilContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TostrContext extends ExpContext {
		public TerminalNode TOSTR() { return getToken(langParser.TOSTR, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public TostrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterTostr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitTostr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitTostr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(langParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(langParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(langParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(langParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode LBRAK() { return getToken(langParser.LBRAK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(langParser.RBRAK, 0); }
		public ArrayExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterArrayExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitArrayExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitArrayExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(langParser.CONCAT, 0); }
		public ConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExpContext {
		public TerminalNode FLOAT() { return getToken(langParser.FLOAT, 0); }
		public FloatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ExpContext {
		public TerminalNode IN() { return getToken(langParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public InputContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(langParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(langParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(langParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterDivMulMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitDivMulMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(langParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(langParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(langParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(langParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(langParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(langParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(langParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterCmpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitCmpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(langParser.AND, 0); }
		public TerminalNode OR() { return getToken(langParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitLogicExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(langParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExpContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(langParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(langParser.RPAR, 0); }
		public FuncCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(FLOAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(LPAR);
				setState(185);
				exp(0);
				setState(186);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(NOT);
				setState(189);
				exp(12);
				}
				break;
			case 6:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(IN);
				setState(191);
				match(LPAR);
				setState(192);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new TostrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(TOSTR);
				setState(194);
				match(LPAR);
				setState(195);
				exp(0);
				setState(196);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new ArrayExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(ID);
				setState(199);
				match(LBRAK);
				setState(200);
				exp(0);
				setState(201);
				match(RBRAK);
				}
				break;
			case 9:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(ID);
				setState(204);
				match(LPAR);
				setState(205);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(209);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(210);
						match(POW);
						setState(211);
						exp(13);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						exp(12);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						exp(11);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(218);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(219);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						exp(10);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(221);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(222);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						exp(9);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(225);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						exp(8);
						}
						break;
					case 7:
						{
						_localctx = new ConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(228);
						match(CONCAT);
						setState(229);
						exp(7);
						}
						break;
					}
					} 
				}
				setState(234);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b"+
		"\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002r\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u0005\u0087\b\u0005\u000b\u0005\f\u0005\u0088\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006\n\u0006\f\u0006"+
		"\u0098\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d\b"+
		"\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0001\u0006\u0003\u0006\u00a3\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00d0\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e7\b\t\n"+
		"\t\f\t\u00ea\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0000\u0006\u0003\u0000\u0004\u0005\n\u000b\u0013"+
		"\u0014\u0001\u0000\u0006\b\u0001\u0000\u0004\u0005\u0001\u0000\u0011\u0014"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\r\u000e\u010a\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000"+
		"\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000\u0000"+
		"\n\u0083\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e"+
		"\u00a4\u0001\u0000\u0000\u0000\u0010\u00b2\u0001\u0000\u0000\u0000\u0012"+
		"\u00cf\u0001\u0000\u0000\u0000\u0014\u0017\u0003\u0002\u0001\u0000\u0015"+
		"\u0017\u0003\u0004\u0002\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005$\u0000\u0000\u001e\u001f\u0005-\u0000\u0000\u001f \u0005"+
		"&\u0000\u0000 !\u0005\'\u0000\u0000!)\u0005*\u0000\u0000\"$\u0003\u0004"+
		"\u0002\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&*\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000(*\u0003\u000e\u0007\u0000)%\u0001\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0005+\u0000"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005\u0016\u0000\u0000./\u0005"+
		"&\u0000\u0000/0\u0003\u0012\t\u000001\u0005\'\u0000\u000012\u0005\u0017"+
		"\u0000\u000023\u0005*\u0000\u000034\u0003\u0004\u0002\u000045\u0005+\u0000"+
		"\u000056\u0005\u0018\u0000\u000067\u0005*\u0000\u000078\u0003\u0004\u0002"+
		"\u000089\u0005+\u0000\u00009r\u0001\u0000\u0000\u0000:;\u0005\u001d\u0000"+
		"\u0000;<\u0005-\u0000\u0000<=\u0005\u001c\u0000\u0000=>\u0003\u0012\t"+
		"\u0000>?\u0005,\u0000\u0000?r\u0001\u0000\u0000\u0000@A\u0005-\u0000\u0000"+
		"AB\u0005\u001c\u0000\u0000BC\u0003\u0012\t\u0000CD\u0005,\u0000\u0000"+
		"Dr\u0001\u0000\u0000\u0000EF\u0005\u001d\u0000\u0000FG\u0005-\u0000\u0000"+
		"GH\u0005(\u0000\u0000HI\u0003\u0012\t\u0000IJ\u0005)\u0000\u0000JK\u0005"+
		"\u001c\u0000\u0000KL\u0003\u0012\t\u0000LM\u0005,\u0000\u0000Mr\u0001"+
		"\u0000\u0000\u0000NO\u0005\u001b\u0000\u0000Or\u0005,\u0000\u0000PQ\u0005"+
		"\u0019\u0000\u0000QR\u0005&\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005"+
		"\'\u0000\u0000TU\u0005*\u0000\u0000UV\u0003\u0004\u0002\u0000VW\u0005"+
		"+\u0000\u0000Wr\u0001\u0000\u0000\u0000XY\u0005\u001a\u0000\u0000YZ\u0005"+
		"&\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005,\u0000\u0000\\]\u0003"+
		"\u0012\t\u0000]^\u0005,\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\'\u0000"+
		"\u0000`a\u0005*\u0000\u0000ab\u0003\u0004\u0002\u0000bc\u0005+\u0000\u0000"+
		"cr\u0001\u0000\u0000\u0000de\u0005!\u0000\u0000ef\u0005&\u0000\u0000f"+
		"g\u0003\u0012\t\u0000gh\u0005\'\u0000\u0000hi\u0005,\u0000\u0000ir\u0001"+
		"\u0000\u0000\u0000jk\u0005\u001e\u0000\u0000kl\u0005-\u0000\u0000lr\u0005"+
		",\u0000\u0000mn\u0003\u0012\t\u0000no\u0005,\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pr\u0003\n\u0005\u0000q-\u0001\u0000\u0000\u0000q:\u0001\u0000"+
		"\u0000\u0000q@\u0001\u0000\u0000\u0000qE\u0001\u0000\u0000\u0000qN\u0001"+
		"\u0000\u0000\u0000qP\u0001\u0000\u0000\u0000qX\u0001\u0000\u0000\u0000"+
		"qd\u0001\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000r\u0005\u0001\u0000\u0000\u0000st\u0005"+
		"\u001d\u0000\u0000tu\u0005-\u0000\u0000uv\u0005\u001c\u0000\u0000v|\u0003"+
		"\u0012\t\u0000wx\u0005-\u0000\u0000xy\u0005\u001c\u0000\u0000y|\u0003"+
		"\u0012\t\u0000z|\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000{w\u0001"+
		"\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0007\u0001\u0000\u0000"+
		"\u0000}~\u0005-\u0000\u0000~\u007f\u0005\u001c\u0000\u0000\u007f\u0082"+
		"\u0003\u0012\t\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081}\u0001"+
		"\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\t\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0003\f\u0006\u0000\u0084\u0085\u0005%\u0000"+
		"\u0000\u0085\u0087\u0003\f\u0006\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000"+
		"\u008a\u008e\u0005&\u0000\u0000\u008b\u008d\u0003\u0004\u0002\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u00a3\u0005\'\u0000\u0000\u0092\u0096\u0005(\u0000\u0000\u0093\u0095"+
		"\u0003\u0004\u0002\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u00a3\u0005)\u0000\u0000\u009a\u009e\u0005"+
		"*\u0000\u0000\u009b\u009d\u0003\u0004\u0002\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005+\u0000"+
		"\u0000\u00a2\u008a\u0001\u0000\u0000\u0000\u00a2\u0092\u0001\u0000\u0000"+
		"\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u001f\u0000\u0000\u00a5\u00a6\u0005*\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0010\b\u0000\u00a7\u00a8\u0005+\u0000\u0000\u00a8\u00a9"+
		"\u0005 \u0000\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007"+
		"\u0000\u0000\u0000\u00ab\u00b3\u0003\u0010\b\u0000\u00ac\u00ad\u0005("+
		"\u0000\u0000\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u00af\u0005)\u0000"+
		"\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006\t\uffff\uffff\u0000"+
		"\u00b5\u00d0\u0005\u0001\u0000\u0000\u00b6\u00d0\u0005\u0002\u0000\u0000"+
		"\u00b7\u00d0\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005&\u0000\u0000\u00b9"+
		"\u00ba\u0003\u0012\t\u0000\u00ba\u00bb\u0005\'\u0000\u0000\u00bb\u00d0"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0015\u0000\u0000\u00bd\u00d0"+
		"\u0003\u0012\t\f\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005&\u0000"+
		"\u0000\u00c0\u00d0\u0005\'\u0000\u0000\u00c1\u00c2\u0005#\u0000\u0000"+
		"\u00c2\u00c3\u0005&\u0000\u0000\u00c3\u00c4\u0003\u0012\t\u0000\u00c4"+
		"\u00c5\u0005\'\u0000\u0000\u00c5\u00d0\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005-\u0000\u0000\u00c7\u00c8\u0005(\u0000\u0000\u00c8\u00c9\u0003\u0012"+
		"\t\u0000\u00c9\u00ca\u0005)\u0000\u0000\u00ca\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005-\u0000\u0000\u00cc\u00cd\u0005&\u0000\u0000\u00cd"+
		"\u00d0\u0005\'\u0000\u0000\u00ce\u00d0\u0005-\u0000\u0000\u00cf\u00b4"+
		"\u0001\u0000\u0000\u0000\u00cf\u00b6\u0001\u0000\u0000\u0000\u00cf\u00b7"+
		"\u0001\u0000\u0000\u0000\u00cf\u00b8\u0001\u0000\u0000\u0000\u00cf\u00bc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00be\u0001\u0000\u0000\u0000\u00cf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00e8"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\n\r\u0000\u0000\u00d2\u00d3\u0005"+
		"\t\u0000\u0000\u00d3\u00e7\u0003\u0012\t\r\u00d4\u00d5\n\u000b\u0000\u0000"+
		"\u00d5\u00d6\u0007\u0001\u0000\u0000\u00d6\u00e7\u0003\u0012\t\f\u00d7"+
		"\u00d8\n\n\u0000\u0000\u00d8\u00d9\u0007\u0002\u0000\u0000\u00d9\u00e7"+
		"\u0003\u0012\t\u000b\u00da\u00db\n\t\u0000\u0000\u00db\u00dc\u0007\u0003"+
		"\u0000\u0000\u00dc\u00e7\u0003\u0012\t\n\u00dd\u00de\n\b\u0000\u0000\u00de"+
		"\u00df\u0007\u0004\u0000\u0000\u00df\u00e7\u0003\u0012\t\t\u00e0\u00e1"+
		"\n\u0007\u0000\u0000\u00e1\u00e2\u0007\u0005\u0000\u0000\u00e2\u00e7\u0003"+
		"\u0012\t\b\u00e3\u00e4\n\u0006\u0000\u0000\u00e4\u00e5\u0005\f\u0000\u0000"+
		"\u00e5\u00e7\u0003\u0012\t\u0007\u00e6\u00d1\u0001\u0000\u0000\u0000\u00e6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e6\u00d7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00da\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u0013\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u0010\u0016\u0018%)q{\u0081\u0088\u008e"+
		"\u0096\u009e\u00a2\u00b2\u00cf\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}