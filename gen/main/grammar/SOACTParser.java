// Generated from E:/Projects/Compiler Design/ca2/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
package main.grammar;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.utils.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SOACTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ACTOR=1, INT=2, IF=3, STRING=4, OBSERVERS=5, MSGRCV=6, SELF=7, TRUE=8, 
		ELSE=9, BREAK=10, FOR=11, MSGOBS=12, PUBLIC=13, FALSE=14, BOOLEAN=15, 
		CONTINUE=16, WHILE=17, AUTHORIZED=18, RANGE=19, NULL=20, JOIN=21, PRIVATE=22, 
		TOUPPER=23, TOLOWER=24, LENGTH=25, SET=26, LIST=27, ACTORVAR=28, REMOVE=29, 
		INCLUDE=30, ADD=31, MAIN=32, PRINT=33, REVERSE=34, NEW=35, ID=36, PRIMITIVE=37, 
		IN=38, RECORD=39, PLUS=40, MINUS=41, MULT=42, DIVIDE=43, MOD=44, PIPE_OP=45, 
		EQUAL=46, NOT_EQUAL=47, GREATER_THAN=48, LESS_THAN=49, AND=50, OR=51, 
		NOT=52, INCREMENT=53, DECREMENT=54, QUESTION_MARK=55, ASSIGN=56, LPAR=57, 
		RPAR=58, LBRACK=59, RBRACK=60, LBRACE=61, RBRACE=62, COMMA=63, DOT=64, 
		SEMICOLON=65, COLON=66, INT_VALUE=67, IDENTIFIER=68, STRING_VALUE=69, 
		COMMENT=70, WS=71;
	public static final int
		RULE_soact = 0, RULE_record = 1, RULE_actorDec = 2, RULE_customPrimitive = 3, 
		RULE_actorVars = 4, RULE_init = 5, RULE_arrayIndex = 6, RULE_primitives = 7, 
		RULE_container = 8, RULE_constructor = 9, RULE_msgHandler = 10, RULE_arguments = 11, 
		RULE_arrayType = 12, RULE_accesslevels = 13, RULE_authorized = 14, RULE_accesslevelsParam = 15, 
		RULE_forLoop = 16, RULE_forLoopCondition = 17, RULE_range = 18, RULE_whileLoop = 19, 
		RULE_ifBlock = 20, RULE_joinBlock = 21, RULE_joinBlockBody = 22, RULE_pipeStatement = 23, 
		RULE_main = 24, RULE_body = 25, RULE_statements = 26, RULE_initStatement = 27, 
		RULE_constructorCall = 28, RULE_initRecord = 29, RULE_assignStatement = 30, 
		RULE_exprStatement = 31, RULE_observeStatement = 32, RULE_expression = 33, 
		RULE_expComma = 34, RULE_expOr = 35, RULE_expAnd = 36, RULE_expAndPrim = 37, 
		RULE_expEquals = 38, RULE_expEqualsPrim = 39, RULE_expCompare = 40, RULE_expComparePrim = 41, 
		RULE_expPlusMinus = 42, RULE_expPlusMinusPrim = 43, RULE_expDivideMultMod = 44, 
		RULE_expPreUnary = 45, RULE_expPreUnaryPrim = 46, RULE_expPostUnary = 47, 
		RULE_expBracket = 48, RULE_expAccess = 49, RULE_expPar = 50, RULE_customPrimAccess = 51, 
		RULE_handlerCall = 52, RULE_primitivesVals = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"soact", "record", "actorDec", "customPrimitive", "actorVars", "init", 
			"arrayIndex", "primitives", "container", "constructor", "msgHandler", 
			"arguments", "arrayType", "accesslevels", "authorized", "accesslevelsParam", 
			"forLoop", "forLoopCondition", "range", "whileLoop", "ifBlock", "joinBlock", 
			"joinBlockBody", "pipeStatement", "main", "body", "statements", "initStatement", 
			"constructorCall", "initRecord", "assignStatement", "exprStatement", 
			"observeStatement", "expression", "expComma", "expOr", "expAnd", "expAndPrim", 
			"expEquals", "expEqualsPrim", "expCompare", "expComparePrim", "expPlusMinus", 
			"expPlusMinusPrim", "expDivideMultMod", "expPreUnary", "expPreUnaryPrim", 
			"expPostUnary", "expBracket", "expAccess", "expPar", "customPrimAccess", 
			"handlerCall", "primitivesVals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Actor'", "'int'", "'if'", "'string'", "'@observers'", "'msgRcv'", 
			"'self'", "'true'", "'else'", "'break'", "'for'", "'msgObs'", "'public'", 
			"'false'", "'boolean'", "'continue'", "'while'", "'@authorized'", "'range'", 
			"'null'", "'join'", "'private'", "'toUpper'", "'toLower'", "'length'", 
			"'Set'", "'List'", "'actorVars'", "'remove'", "'include'", "'add'", "'main'", 
			"'print'", "'reverse'", "'new'", "'ID'", "'primitive'", "'in'", "'Record'", 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'|>'", "'=='", "'!='", "'>'", "'<'", 
			"'&&'", "'||'", "'!'", "'++'", "'--'", "'?'", "'='", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "'.'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ACTOR", "INT", "IF", "STRING", "OBSERVERS", "MSGRCV", "SELF", 
			"TRUE", "ELSE", "BREAK", "FOR", "MSGOBS", "PUBLIC", "FALSE", "BOOLEAN", 
			"CONTINUE", "WHILE", "AUTHORIZED", "RANGE", "NULL", "JOIN", "PRIVATE", 
			"TOUPPER", "TOLOWER", "LENGTH", "SET", "LIST", "ACTORVAR", "REMOVE", 
			"INCLUDE", "ADD", "MAIN", "PRINT", "REVERSE", "NEW", "ID", "PRIMITIVE", 
			"IN", "RECORD", "PLUS", "MINUS", "MULT", "DIVIDE", "MOD", "PIPE_OP", 
			"EQUAL", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "AND", "OR", "NOT", 
			"INCREMENT", "DECREMENT", "QUESTION_MARK", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", 
			"COLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "SOACT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SOACTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoactContext extends ParserRuleContext {
		public Soact soactRet;
		public ActorDecContext a;
		public RecordContext r;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ActorDecContext> actorDec() {
			return getRuleContexts(ActorDecContext.class);
		}
		public ActorDecContext actorDec(int i) {
			return getRuleContext(ActorDecContext.class,i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public SoactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterSoact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitSoact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitSoact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoactContext soact() throws RecognitionException {
		SoactContext _localctx = new SoactContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_soact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SoactContext)_localctx).soactRet =  new Soact();
			      _localctx.soactRet.setLine(1);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR || _la==RECORD) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(109);
					((SoactContext)_localctx).a = actorDec();
					 _localctx.soactRet.addActorDec(((SoactContext)_localctx).a.actorDecRet); 
					}
					break;
				case RECORD:
					{
					setState(112);
					((SoactContext)_localctx).r = record();
					 _localctx.soactRet.addRecordNode(((SoactContext)_localctx).r.recordNodeRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			((SoactContext)_localctx).m = main();
			_localctx.soactRet.setMain(((SoactContext)_localctx).m.mainRet);
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
	public static class RecordContext extends ParserRuleContext {
		public RecordNode recordNodeRet;
		public Token rec;
		public Token id;
		public InitContext var;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode RECORD() { return getToken(SOACTParser.RECORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((RecordContext)_localctx).rec = match(RECORD);
			setState(124);
			((RecordContext)_localctx).id = match(IDENTIFIER);
			 Identifier identifier = Identifier.createId((((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getText():null) ,(((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getLine():0));
			    ((RecordContext)_localctx).recordNodeRet =  new RecordNode(identifier, (((RecordContext)_localctx).rec!=null?((RecordContext)_localctx).rec.getLine():0));
			setState(126);
			match(LBRACE);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				((RecordContext)_localctx).var = init();
				_localctx.recordNodeRet.addVar(((RecordContext)_localctx).var.varRet);
				setState(129);
				match(SEMICOLON);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER );
			setState(135);
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
	public static class ActorDecContext extends ParserRuleContext {
		public ActorDec actorDecRet;
		public Token def;
		public Token id;
		public CustomPrimitiveContext c;
		public ActorVarsContext v;
		public ConstructorContext cs;
		public MsgHandlerContext h;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode ACTOR() { return getToken(SOACTParser.ACTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public List<CustomPrimitiveContext> customPrimitive() {
			return getRuleContexts(CustomPrimitiveContext.class);
		}
		public CustomPrimitiveContext customPrimitive(int i) {
			return getRuleContext(CustomPrimitiveContext.class,i);
		}
		public ActorVarsContext actorVars() {
			return getRuleContext(ActorVarsContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<MsgHandlerContext> msgHandler() {
			return getRuleContexts(MsgHandlerContext.class);
		}
		public MsgHandlerContext msgHandler(int i) {
			return getRuleContext(MsgHandlerContext.class,i);
		}
		public ActorDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorDecContext actorDec() throws RecognitionException {
		ActorDecContext _localctx = new ActorDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actorDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ActorDecContext)_localctx).def = match(ACTOR);
			setState(138);
			((ActorDecContext)_localctx).id = match(IDENTIFIER);
			 ((ActorDecContext)_localctx).actorDecRet =  new ActorDec(Identifier.createId((((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getText():null) ,(((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getLine():0)), (((ActorDecContext)_localctx).def!=null?((ActorDecContext)_localctx).def.getLine():0)); 
			setState(140);
			match(LBRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMITIVE) {
				{
				{
				setState(141);
				((ActorDecContext)_localctx).c = customPrimitive();
				_localctx.actorDecRet.addCustomPrimitive(((ActorDecContext)_localctx).c.cpRet);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTORVAR) {
				{
				setState(149);
				((ActorDecContext)_localctx).v = actorVars();
				_localctx.actorDecRet.setActorVars(((ActorDecContext)_localctx).v.argRet.vars);
				                    _localctx.actorDecRet.setAccessExpressions(((ActorDecContext)_localctx).v.argRet.accessLevels);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(154);
				((ActorDecContext)_localctx).cs = constructor();
				_localctx.actorDecRet.setConstructor(((ActorDecContext)_localctx).cs.constructorRet);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGRCV || _la==MSGOBS) {
				{
				{
				setState(159);
				((ActorDecContext)_localctx).h = msgHandler();
				_localctx.actorDecRet.addHandler(((ActorDecContext)_localctx).h.handlerRet);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
	public static class CustomPrimitiveContext extends ParserRuleContext {
		public CustomPrimitiveDeclaration cpRet;
		public Token p;
		public Token id;
		public Token stateId;
		public Token lastStateId;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode PRIMITIVE() { return getToken(SOACTParser.PRIMITIVE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public CustomPrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customPrimitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterCustomPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitCustomPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitCustomPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomPrimitiveContext customPrimitive() throws RecognitionException {
		CustomPrimitiveContext _localctx = new CustomPrimitiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_customPrimitive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((CustomPrimitiveContext)_localctx).p = match(PRIMITIVE);
			setState(170);
			((CustomPrimitiveContext)_localctx).id = match(IDENTIFIER);
			((CustomPrimitiveContext)_localctx).cpRet =  new CustomPrimitiveDeclaration(Identifier.createId((((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getText():null) ,(((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getLine():0)), (((CustomPrimitiveContext)_localctx).p!=null?((CustomPrimitiveContext)_localctx).p.getLine():0));
			setState(172);
			match(LBRACE);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					((CustomPrimitiveContext)_localctx).stateId = match(IDENTIFIER);
					_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getText():null) ,(((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getLine():0)));
					setState(175);
					match(COMMA);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(181);
			((CustomPrimitiveContext)_localctx).lastStateId = match(IDENTIFIER);
			_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getText():null) ,(((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getLine():0)));
			setState(183);
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
	public static class ActorVarsContext extends ParserRuleContext {
		public ActorVarsDTO argRet;
		public InitContext var;
		public AccesslevelsContext a;
		public TerminalNode ACTORVAR() { return getToken(SOACTParser.ACTORVAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public List<AccesslevelsContext> accesslevels() {
			return getRuleContexts(AccesslevelsContext.class);
		}
		public AccesslevelsContext accesslevels(int i) {
			return getRuleContext(AccesslevelsContext.class,i);
		}
		public ActorVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorVarsContext actorVars() throws RecognitionException {
		ActorVarsContext _localctx = new ActorVarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actorVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ActorVarsContext)_localctx).argRet =  new ActorVarsDTO();
			setState(186);
			match(ACTORVAR);
			setState(187);
			match(LBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(188);
				((ActorVarsContext)_localctx).var = init();
				_localctx.argRet.vars.add(((ActorVarsContext)_localctx).var.varRet);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(190);
					match(LPAR);
					setState(191);
					((ActorVarsContext)_localctx).a = accesslevels();
					_localctx.argRet.accessLevels.add(((ActorVarsContext)_localctx).a.accessLevelsRet);
					setState(193);
					match(RPAR);
					}
				}

				setState(197);
				match(SEMICOLON);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
	public static class InitContext extends ParserRuleContext {
		public VarDeclaration varRet;
		public Token id;
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(206);
				primitives();
				setState(207);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(209);
					arrayIndex();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(212);
				arrayType();
				setState(213);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(216);
				container();
				setState(217);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
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
	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode INT_VALUE() { return getToken(SOACTParser.INT_VALUE, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACK);
			setState(223);
			match(INT_VALUE);
			setState(224);
			match(RBRACK);
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
	public static class PrimitivesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SOACTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SOACTParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SOACTParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SOACTParser.ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimitives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimitives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimitives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719509524L) != 0) || _la==IDENTIFIER) ) {
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
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public TerminalNode SET() { return getToken(SOACTParser.SET, 0); }
		public TerminalNode LIST() { return getToken(SOACTParser.LIST, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==LIST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			match(LESS_THAN);
			setState(230);
			primitives();
			setState(231);
			match(GREATER_THAN);
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
	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDto constructorRet;
		public Token id;
		public ArgumentsContext args;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorContext)_localctx).constructorRet =  new ConstructorDto();
			setState(234);
			((ConstructorContext)_localctx).id = match(IDENTIFIER);
			_localctx.constructorRet.name = (((ConstructorContext)_localctx).id!=null?((ConstructorContext)_localctx).id.getText():null);
			setState(236);
			match(LPAR);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(237);
				((ConstructorContext)_localctx).args = arguments();
				_localctx.constructorRet.args.addAll(((ConstructorContext)_localctx).args.argsRet);
				}
			}

			setState(242);
			match(RPAR);
			setState(243);
			match(LBRACE);
			setState(244);
			((ConstructorContext)_localctx).b = body();
			_localctx.constructorRet.body.addAll(((ConstructorContext)_localctx).b.bodyRet);
			setState(246);
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
	public static class MsgHandlerContext extends ParserRuleContext {
		public Handler handlerRet;
		public Token srv;
		public Token obs;
		public AuthorizedContext a;
		public Token id_name;
		public ArgumentsContext args;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode MSGRCV() { return getToken(SOACTParser.MSGRCV, 0); }
		public TerminalNode MSGOBS() { return getToken(SOACTParser.MSGOBS, 0); }
		public AuthorizedContext authorized() {
			return getRuleContext(AuthorizedContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MsgHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMsgHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMsgHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMsgHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerContext msgHandler() throws RecognitionException {
		MsgHandlerContext _localctx = new MsgHandlerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_msgHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String type ;
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MSGRCV:
				{
				setState(249);
				((MsgHandlerContext)_localctx).srv = match(MSGRCV);
				type = (((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getText():null);
				                   ((MsgHandlerContext)_localctx).handlerRet =  new ServiceHandler((((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getLine():0));
				}
				break;
			case MSGOBS:
				{
				setState(251);
				((MsgHandlerContext)_localctx).obs = match(MSGOBS);
				type = (((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getText():null);
				                  ((MsgHandlerContext)_localctx).handlerRet =  new ObserveHandler((((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZED) {
				{
				setState(255);
				((MsgHandlerContext)_localctx).a = authorized();
				_localctx.handlerRet.setAuthorizationExpressions(((MsgHandlerContext)_localctx).a.authorizeRet);
				}
			}

			setState(260);
			((MsgHandlerContext)_localctx).id_name = match(IDENTIFIER);
			_localctx.handlerRet.setName(Identifier.createId((((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getText():null) ,(((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getLine():0)));
			System.out.println("Line " + ((MsgHandlerContext)_localctx).id_name.getLine() + " : " + type + ": " + (((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getText():null));
			setState(263);
			match(LPAR);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(264);
				((MsgHandlerContext)_localctx).args = arguments();
				_localctx.handlerRet.setArgs(((MsgHandlerContext)_localctx).args.argsRet);
				}
			}

			setState(269);
			match(RPAR);
			setState(270);
			match(LBRACE);
			setState(271);
			((MsgHandlerContext)_localctx).b = body();
			_localctx.handlerRet.setBody(((MsgHandlerContext)_localctx).b.bodyRet);
			setState(273);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> argsRet;
		public InitContext arg;
		public InitContext otherArg;
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArgumentsContext)_localctx).argsRet =  new ArrayList<>();
			setState(276);
			((ArgumentsContext)_localctx).arg = init();
			_localctx.argsRet.add(((ArgumentsContext)_localctx).arg.varRet);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				((ArgumentsContext)_localctx).otherArg = init();
				_localctx.argsRet.add(((ArgumentsContext)_localctx).otherArg.varRet);
				}
				}
				setState(286);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			primitives();
			setState(288);
			match(LBRACK);
			setState(289);
			match(RBRACK);
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
	public static class AccesslevelsContext extends ParserRuleContext {
		public List<Expression> accessLevelsRet;
		public Token PUBLIC;
		public Token PRIVATE;
		public AccesslevelsParamContext p;
		public AccesslevelsParamContext lp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<AccesslevelsParamContext> accesslevelsParam() {
			return getRuleContexts(AccesslevelsParamContext.class);
		}
		public AccesslevelsParamContext accesslevelsParam(int i) {
			return getRuleContext(AccesslevelsParamContext.class,i);
		}
		public TerminalNode PUBLIC() { return getToken(SOACTParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SOACTParser.PRIVATE, 0); }
		public AccesslevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesslevels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAccesslevels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAccesslevels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAccesslevels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesslevelsContext accesslevels() throws RecognitionException {
		AccesslevelsContext _localctx = new AccesslevelsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_accesslevels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AccesslevelsContext)_localctx).accessLevelsRet =  new ArrayList<>();
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				{
				setState(292);
				((AccesslevelsContext)_localctx).PUBLIC = match(PUBLIC);
				System.out.println("Line " + ((AccesslevelsContext)_localctx).PUBLIC.getLine() + " : " + "Built-In: PUBLIC");
				}
				}
				break;
			case PRIVATE:
				{
				{
				setState(294);
				((AccesslevelsContext)_localctx).PRIVATE = match(PRIVATE);
				System.out.println("Line " + ((AccesslevelsContext)_localctx).PRIVATE.getLine() + " : " + "Built-In: PRIVATE");
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			match(LPAR);
			setState(299);
			((AccesslevelsContext)_localctx).p = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).p.accessLevelsParamRet);
			setState(301);
			match(COMMA);
			setState(302);
			((AccesslevelsContext)_localctx).lp = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).lp.accessLevelsParamRet);
			setState(304);
			match(RPAR);
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
	public static class AuthorizedContext extends ParserRuleContext {
		public List<Expression> authorizeRet;
		public AccesslevelsContext a;
		public TerminalNode AUTHORIZED() { return getToken(SOACTParser.AUTHORIZED, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public AuthorizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAuthorized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAuthorized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAuthorized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorizedContext authorized() throws RecognitionException {
		AuthorizedContext _localctx = new AuthorizedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_authorized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AuthorizedContext)_localctx).authorizeRet =  new ArrayList<>();
			setState(307);
			match(AUTHORIZED);
			setState(308);
			match(LPAR);
			setState(309);
			((AuthorizedContext)_localctx).a = accesslevels();
			_localctx.authorizeRet.addAll(((AuthorizedContext)_localctx).a.accessLevelsRet);
			setState(311);
			match(RPAR);
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
	public static class AccesslevelsParamContext extends ParserRuleContext {
		public List<Expression> accessLevelsParamRet;
		public Token id;
		public AccesslevelsContext a;
		public TerminalNode NULL() { return getToken(SOACTParser.NULL, 0); }
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public AccesslevelsParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesslevelsParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAccesslevelsParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAccesslevelsParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAccesslevelsParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesslevelsParamContext accesslevelsParam() throws RecognitionException {
		AccesslevelsParamContext _localctx = new AccesslevelsParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_accesslevelsParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AccesslevelsParamContext)_localctx).accessLevelsParamRet =  new ArrayList<>();
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(314);
				((AccesslevelsParamContext)_localctx).id = match(IDENTIFIER);
				_localctx.accessLevelsParamRet.add(Identifier.createId((((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getText():null), (((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getLine():0)));
				}
				break;
			case NULL:
				{
				setState(316);
				match(NULL);
				}
				break;
			case SELF:
				{
				setState(317);
				match(SELF);
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(318);
				((AccesslevelsParamContext)_localctx).a = accesslevels();
				_localctx.accessLevelsParamRet.addAll(((AccesslevelsParamContext)_localctx).a.accessLevelsRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ForLoopContext extends ParserRuleContext {
		public ForStatement forRet;
		public Token def;
		public ForLoopConditionContext c;
		public BodyContext b;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode FOR() { return getToken(SOACTParser.FOR, 0); }
		public ForLoopConditionContext forLoopCondition() {
			return getRuleContext(ForLoopConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ForLoopContext)_localctx).def = match(FOR);
			System.out.println("Line " + ((ForLoopContext)_localctx).def.getLine() + " : " + "Loop: FOR");
			setState(325);
			((ForLoopContext)_localctx).c = forLoopCondition();
			_localctx.forRet.setCondition(((ForLoopContext)_localctx).c.condRet);
			setState(327);
			match(LBRACE);
			setState(328);
			((ForLoopContext)_localctx).b = body();
			((ForLoopContext)_localctx).forRet =  new ForStatement(((ForLoopContext)_localctx).c.condRet, ((ForLoopContext)_localctx).b.bodyRet, (((ForLoopContext)_localctx).def!=null?((ForLoopContext)_localctx).def.getLine():0));
			setState(330);
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
	public static class ForLoopConditionContext extends ParserRuleContext {
		public ArrayList<Expression> condRet;
		public Token id;
		public Token rangeId;
		public RangeContext r;
		public RangeContext range;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SOACTParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ForLoopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForLoopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForLoopCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForLoopCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopConditionContext forLoopCondition() throws RecognitionException {
		ForLoopConditionContext _localctx = new ForLoopConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForLoopConditionContext)_localctx).condRet =  new ArrayList<>();
			setState(333);
			match(LPAR);
			setState(334);
			((ForLoopConditionContext)_localctx).id = match(IDENTIFIER);
			_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getText():null), (((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getLine():0)));
			setState(336);
			match(IN);
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(337);
				((ForLoopConditionContext)_localctx).rangeId = match(IDENTIFIER);
				_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getText():null), (((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getLine():0)));
				}
				break;
			case RANGE:
				{
				setState(339);
				((ForLoopConditionContext)_localctx).r = ((ForLoopConditionContext)_localctx).range = range();
				_localctx.condRet.addAll(((ForLoopConditionContext)_localctx).range.rangeRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			match(RPAR);
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
	public static class RangeContext extends ParserRuleContext {
		public ArrayList<Expression> rangeRet;
		public Token id1;
		public Token id2;
		public TerminalNode RANGE() { return getToken(SOACTParser.RANGE, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<TerminalNode> INT_VALUE() { return getTokens(SOACTParser.INT_VALUE); }
		public TerminalNode INT_VALUE(int i) {
			return getToken(SOACTParser.INT_VALUE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RangeContext)_localctx).rangeRet =  new ArrayList<>();
			setState(347);
			match(RANGE);
			setState(348);
			match(LPAR);
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(349);
				((RangeContext)_localctx).id1 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getText():null), (((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(351);
				match(INT_VALUE);
				_localctx.rangeRet.add(new IntValue());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(355);
			match(COMMA);
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(356);
				((RangeContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getText():null), (((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(358);
				match(INT_VALUE);
				_localctx.rangeRet.add(new IntValue());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(362);
			match(RPAR);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public WhileStatement whileRet;
		public Token def;
		public ExpressionContext ex;
		public BodyContext b;
		public BodyContext body;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(SOACTParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((WhileLoopContext)_localctx).def = match(WHILE);
			System.out.println("Line " + ((WhileLoopContext)_localctx).def.getLine() + " : " + "Loop: WHILE");
			setState(366);
			match(LPAR);
			setState(367);
			((WhileLoopContext)_localctx).ex = expression();
			_localctx.whileRet.setWhileConds(((WhileLoopContext)_localctx).ex.expRet);
			setState(369);
			match(RPAR);
			setState(370);
			match(RPAR);
			setState(371);
			match(LBRACE);
			setState(372);
			((WhileLoopContext)_localctx).b = ((WhileLoopContext)_localctx).body = body();
			((WhileLoopContext)_localctx).whileRet =  new WhileStatement(((WhileLoopContext)_localctx).ex.expRet, ((WhileLoopContext)_localctx).body.bodyRet, (((WhileLoopContext)_localctx).def!=null?((WhileLoopContext)_localctx).def.getLine():0));
			setState(374);
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
	public static class IfBlockContext extends ParserRuleContext {
		public IfStatement ifRet;
		public Token def;
		public ExpressionContext ifExp;
		public BodyContext ifBody;
		public Token elif;
		public Token IF;
		public ExpressionContext elseIfExp;
		public BodyContext elseIfBody;
		public Token ELSE;
		public BodyContext elseBody;
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(SOACTParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SOACTParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SOACTParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SOACTParser.RBRACE, i);
		}
		public List<TerminalNode> IF() { return getTokens(SOACTParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SOACTParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(SOACTParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SOACTParser.ELSE, i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((IfBlockContext)_localctx).def = match(IF);
			((IfBlockContext)_localctx).ifRet =  new IfStatement((((IfBlockContext)_localctx).def!=null?((IfBlockContext)_localctx).def.getLine():0));
			System.out.println("Line " + ((IfBlockContext)_localctx).IF.getLine() + " : " + "Decision: IF");
			setState(379);
			match(LPAR);
			setState(380);
			((IfBlockContext)_localctx).ifExp = expression();
			_localctx.ifRet.setIfConds(((IfBlockContext)_localctx).ifExp.expRet);
			setState(382);
			match(RPAR);
			setState(383);
			match(LBRACE);
			setState(384);
			((IfBlockContext)_localctx).ifBody = body();
			_localctx.ifRet.setIfBody(((IfBlockContext)_localctx).ifBody.bodyRet);
			setState(386);
			match(RBRACE);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					((IfBlockContext)_localctx).elif = match(ELSE);
					setState(388);
					((IfBlockContext)_localctx).IF = match(IF);
					System.out.println("Line " + ((IfBlockContext)_localctx).elif.getLine() + " : " + "Decision: ELSE IF");
					setState(390);
					match(LPAR);
					setState(391);
					((IfBlockContext)_localctx).elseIfExp = expression();
					_localctx.ifRet.addElseIfcond(((IfBlockContext)_localctx).elseIfExp.expRet);
					setState(393);
					match(RPAR);
					setState(394);
					match(LBRACE);
					setState(395);
					((IfBlockContext)_localctx).elseIfBody = body();
					_localctx.ifRet.addElseIfBody(((IfBlockContext)_localctx).elseIfBody.bodyRet);
					setState(397);
					match(RBRACE);
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(404);
				((IfBlockContext)_localctx).ELSE = match(ELSE);
				System.out.println("Line " + ((IfBlockContext)_localctx).ELSE.getLine() + " : " + "Decision: ELSE");
				setState(406);
				match(LBRACE);
				setState(407);
				((IfBlockContext)_localctx).elseBody = body();
				_localctx.ifRet.setElseBody(((IfBlockContext)_localctx).elseBody.bodyRet);
				setState(409);
				match(RBRACE);
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
	public static class JoinBlockContext extends ParserRuleContext {
		public JoinStatement joinRet;
		public Token def;
		public JoinBlockBodyContext jb;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode JOIN() { return getToken(SOACTParser.JOIN, 0); }
		public JoinBlockBodyContext joinBlockBody() {
			return getRuleContext(JoinBlockBodyContext.class,0);
		}
		public JoinBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterJoinBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitJoinBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitJoinBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBlockContext joinBlock() throws RecognitionException {
		JoinBlockContext _localctx = new JoinBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_joinBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((JoinBlockContext)_localctx).def = match(JOIN);
			((JoinBlockContext)_localctx).joinRet =  new JoinStatement((((JoinBlockContext)_localctx).def!=null?((JoinBlockContext)_localctx).def.getLine():0));
			System.out.println("Line " + ((JoinBlockContext)_localctx).def.getLine() + " : " + "Join");
			setState(416);
			match(LBRACE);
			setState(417);
			((JoinBlockContext)_localctx).jb = joinBlockBody();
			_localctx.joinRet.setBody(((JoinBlockContext)_localctx).jb.joinBodyRet);
			setState(419);
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
	public static class JoinBlockBodyContext extends ParserRuleContext {
		public ArrayList<Statement> joinBodyRet;
		public BodyContext b1;
		public PipeStatementContext p;
		public BodyContext b2;
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public PipeStatementContext pipeStatement() {
			return getRuleContext(PipeStatementContext.class,0);
		}
		public JoinBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterJoinBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitJoinBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitJoinBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBlockBodyContext joinBlockBody() throws RecognitionException {
		JoinBlockBodyContext _localctx = new JoinBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinBlockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((JoinBlockBodyContext)_localctx).joinBodyRet =  new ArrayList<>();
			setState(422);
			((JoinBlockBodyContext)_localctx).b1 = body();
			_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b1.bodyRet);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(424);
				((JoinBlockBodyContext)_localctx).p = pipeStatement();
				_localctx.joinBodyRet.add(((JoinBlockBodyContext)_localctx).p.pipeRet);
				setState(426);
				((JoinBlockBodyContext)_localctx).b2 = body();
				_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b2.bodyRet);
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
	public static class PipeStatementContext extends ParserRuleContext {
		public PipeStatement pipeRet;
		public ExpressionContext assignee;
		public Token ASSIGN;
		public ExpressionContext assigned;
		public Token PIPE_OP;
		public ExpressionContext pipeExp;
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PIPE_OP() { return getTokens(SOACTParser.PIPE_OP); }
		public TerminalNode PIPE_OP(int i) {
			return getToken(SOACTParser.PIPE_OP, i);
		}
		public PipeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPipeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPipeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPipeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeStatementContext pipeStatement() throws RecognitionException {
		PipeStatementContext _localctx = new PipeStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pipeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((PipeStatementContext)_localctx).assignee = expression();
			((PipeStatementContext)_localctx).pipeRet =  new PipeStatement(((PipeStatementContext)_localctx).assignee.expRet.getFirst().getLine());
			     _localctx.pipeRet.setAssignee(((PipeStatementContext)_localctx).assignee.expRet);
			setState(433);
			((PipeStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(434);
			((PipeStatementContext)_localctx).assigned = expression();
			_localctx.pipeRet.setAssigned(((PipeStatementContext)_localctx).assigned.expRet);
			setState(441); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				((PipeStatementContext)_localctx).PIPE_OP = match(PIPE_OP);
				setState(437);
				((PipeStatementContext)_localctx).pipeExp = expression();
				_localctx.pipeRet.addPipeExp(((PipeStatementContext)_localctx).pipeExp.expRet);
				System.out.println("Line " + ((PipeStatementContext)_localctx).PIPE_OP.getLine() + " : " + "Operator:|>");
				}
				}
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE_OP );
			System.out.println("Line " + ((PipeStatementContext)_localctx).ASSIGN.getLine() + " : " + "Assignment");
			setState(446);
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
	public static class MainContext extends ParserRuleContext {
		public ArrayList<Statement> mainRet;
		public Token MAIN;
		public BodyContext b;
		public TerminalNode MAIN() { return getToken(SOACTParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainContext)_localctx).mainRet =  new ArrayList<>();
			setState(449);
			((MainContext)_localctx).MAIN = match(MAIN);
			System.out.println("Line " + ((MainContext)_localctx).MAIN.getLine() + " : " + "MAIN");
			setState(451);
			match(LPAR);
			setState(452);
			match(RPAR);
			setState(453);
			match(LBRACE);
			setState(454);
			((MainContext)_localctx).b = body();
			_localctx.mainRet.addAll(((MainContext)_localctx).b.bodyRet);
			setState(456);
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
	public static class BodyContext extends ParserRuleContext {
		public ArrayList<Statement> bodyRet;
		public ForLoopContext f1;
		public WhileLoopContext w1;
		public IfBlockContext i1;
		public JoinBlockContext j1;
		public StatementsContext st1;
		public Token CONTINUE;
		public Token BREAK;
		public ForLoopContext f2;
		public WhileLoopContext w2;
		public IfBlockContext i2;
		public JoinBlockContext j2;
		public StatementsContext st2;
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<JoinBlockContext> joinBlock() {
			return getRuleContexts(JoinBlockContext.class);
		}
		public JoinBlockContext joinBlock(int i) {
			return getRuleContext(JoinBlockContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(SOACTParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(SOACTParser.BREAK, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BodyContext)_localctx).bodyRet =  new ArrayList<>();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(474);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(459);
						((BodyContext)_localctx).f1 = forLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).f1.forRet);
						}
						break;
					case WHILE:
						{
						setState(462);
						((BodyContext)_localctx).w1 = whileLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).w1.whileRet);
						}
						break;
					case IF:
						{
						setState(465);
						((BodyContext)_localctx).i1 = ifBlock();
						_localctx.bodyRet.add(((BodyContext)_localctx).i1.ifRet);
						}
						break;
					case JOIN:
						{
						setState(468);
						((BodyContext)_localctx).j1 = joinBlock();
						_localctx.bodyRet.add(((BodyContext)_localctx).j1.joinRet);
						}
						break;
					case INT:
					case STRING:
					case SELF:
					case TRUE:
					case FALSE:
					case BOOLEAN:
					case TOUPPER:
					case TOLOWER:
					case LENGTH:
					case SET:
					case LIST:
					case REMOVE:
					case INCLUDE:
					case ADD:
					case PRINT:
					case REVERSE:
					case ID:
					case MINUS:
					case NOT:
					case INCREMENT:
					case DECREMENT:
					case LPAR:
					case LBRACK:
					case INT_VALUE:
					case IDENTIFIER:
					case STRING_VALUE:
						{
						setState(471);
						((BodyContext)_localctx).st1 = statements();
						_localctx.bodyRet.add(((BodyContext)_localctx).st1.statementRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK || _la==CONTINUE) {
				{
				{
				setState(483);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					{
					setState(479);
					((BodyContext)_localctx).CONTINUE = match(CONTINUE);
					System.out.println("Line " + ((BodyContext)_localctx).CONTINUE.getLine() + " : " + "Control: CONTINUE");
					}
					}
					break;
				case BREAK:
					{
					{
					setState(481);
					((BodyContext)_localctx).BREAK = match(BREAK);
					System.out.println("Line " + ((BodyContext)_localctx).BREAK.getLine() + " : " + "Control: BREAK");
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485);
				match(SEMICOLON);
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(502);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FOR:
							{
							setState(487);
							((BodyContext)_localctx).f2 = forLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).f2.forRet);
							}
							break;
						case WHILE:
							{
							setState(490);
							((BodyContext)_localctx).w2 = whileLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).w2.whileRet);
							}
							break;
						case IF:
							{
							setState(493);
							((BodyContext)_localctx).i2 = ifBlock();
							_localctx.bodyRet.add(((BodyContext)_localctx).i2.ifRet);
							}
							break;
						case JOIN:
							{
							setState(496);
							((BodyContext)_localctx).j2 = joinBlock();
							_localctx.bodyRet.add(((BodyContext)_localctx).j2.joinRet);
							}
							break;
						case INT:
						case STRING:
						case SELF:
						case TRUE:
						case FALSE:
						case BOOLEAN:
						case TOUPPER:
						case TOLOWER:
						case LENGTH:
						case SET:
						case LIST:
						case REMOVE:
						case INCLUDE:
						case ADD:
						case PRINT:
						case REVERSE:
						case ID:
						case MINUS:
						case NOT:
						case INCREMENT:
						case DECREMENT:
						case LPAR:
						case LBRACK:
						case INT_VALUE:
						case IDENTIFIER:
						case STRING_VALUE:
							{
							setState(499);
							((BodyContext)_localctx).st2 = statements();
							_localctx.bodyRet.add(((BodyContext)_localctx).st2.statementRet);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(506);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
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
	public static class StatementsContext extends ParserRuleContext {
		public Statement statementRet;
		public InitStatementContext i;
		public AssignStatementContext a;
		public ExprStatementContext e;
		public ObserveStatementContext o;
		public InitStatementContext initStatement() {
			return getRuleContext(InitStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public ObserveStatementContext observeStatement() {
			return getRuleContext(ObserveStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statements);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				((StatementsContext)_localctx).i = initStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).i.initRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				((StatementsContext)_localctx).a = assignStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).a.assignRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				((StatementsContext)_localctx).e = exprStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).e.expStatementRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				((StatementsContext)_localctx).o = observeStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).o.observeRet;
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
	public static class InitStatementContext extends ParserRuleContext {
		public InitStatement initRet;
		public InitContext i;
		public Token assign;
		public ConstructorCallContext c;
		public InitRecordContext r;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public InitRecordContext initRecord() {
			return getRuleContext(InitRecordContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStatementContext initStatement() throws RecognitionException {
		InitStatementContext _localctx = new InitStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expression> assigned = new ArrayList<>();
			setState(524);
			((InitStatementContext)_localctx).i = init();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(525);
				((InitStatementContext)_localctx).assign = match(ASSIGN);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(526);
					((InitStatementContext)_localctx).c = constructorCall();
					assigned.add(((InitStatementContext)_localctx).c.constructRet);
					}
					break;
				case 2:
					{
					setState(529);
					((InitStatementContext)_localctx).r = initRecord();
					assigned.add(((InitStatementContext)_localctx).r.recordRet);
					}
					break;
				case 3:
					{
					setState(532);
					((InitStatementContext)_localctx).e = expression();
					assigned.addAll(((InitStatementContext)_localctx).e.expRet);
					}
					break;
				}
				System.out.println("Line " + ((InitStatementContext)_localctx).assign.getLine() + " : " + "Assignment");
				}
			}

			((InitStatementContext)_localctx).initRet =  new InitStatement(((InitStatementContext)_localctx).i.varRet, assigned, ((InitStatementContext)_localctx).i.varRet.getLine());
			setState(542);
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
	public static class ConstructorCallContext extends ParserRuleContext {
		public ConstructorExpression constructRet;
		public Token def;
		public Token id;
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			((ConstructorCallContext)_localctx).def = match(NEW);
			setState(545);
			((ConstructorCallContext)_localctx).id = match(IDENTIFIER);
			((ConstructorCallContext)_localctx).constructRet =  new ConstructorExpression(Identifier.createId((((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getText():null) ,(((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getLine():0)), (((ConstructorCallContext)_localctx).def!=null?((ConstructorCallContext)_localctx).def.getLine():0));
			setState(547);
			match(LPAR);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(548);
				((ConstructorCallContext)_localctx).exp = expression();
				_localctx.constructRet.setArgs(((ConstructorCallContext)_localctx).exp.expRet);
				}
			}

			setState(553);
			match(RPAR);
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
	public static class InitRecordContext extends ParserRuleContext {
		public InitRecord recordRet;
		public Token name;
		public Token fi;
		public ExpressionContext fe;
		public Token lfi;
		public ExpressionContext lfe;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public InitRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInitRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitRecordContext initRecord() throws RecognitionException {
		InitRecordContext _localctx = new InitRecordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initRecord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			((InitRecordContext)_localctx).name = match(IDENTIFIER);
			((InitRecordContext)_localctx).recordRet =  new InitRecord(Identifier.createId((((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getText():null) ,(((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0)), (((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0));
			setState(557);
			match(LBRACE);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					((InitRecordContext)_localctx).fi = match(IDENTIFIER);
					_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getText():null) ,(((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getLine():0)));
					setState(560);
					match(COLON);
					setState(561);
					((InitRecordContext)_localctx).fe = expression();
					_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).fe.expRet);
					setState(563);
					match(COMMA);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(570);
			((InitRecordContext)_localctx).lfi = match(IDENTIFIER);
			_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getText():null) ,(((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getLine():0)));
			setState(572);
			match(COLON);
			setState(573);
			((InitRecordContext)_localctx).lfe = expression();
			_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).lfe.expRet);
			setState(575);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignmentStatement assignRet;
		public Token id;
		public Token SELF;
		public Token id2;
		public Token id3;
		public Token assign;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public List<TerminalNode> DOT() { return getTokens(SOACTParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SOACTParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AssignStatementContext)_localctx).assignRet =  new AssignmentStatement();
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(578);
				((AssignStatementContext)_localctx).id = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0));
				                      _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getText():null) ,(((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0)));
				}
				break;
			case SELF:
				{
				setState(580);
				((AssignStatementContext)_localctx).SELF = match(SELF);
				setState(581);
				match(DOT);
				setState(582);
				((AssignStatementContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).SELF!=null?((AssignStatementContext)_localctx).SELF.getLine():0));
				                                                 _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getText():null) ,(((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getLine():0)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(586);
				match(DOT);
				setState(587);
				((AssignStatementContext)_localctx).id3 = match(IDENTIFIER);
				_localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getText():null) ,(((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getLine():0)));
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(594);
				arrayIndex();
				}
			}

			setState(597);
			((AssignStatementContext)_localctx).assign = match(ASSIGN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(598);
				match(NEW);
				}
			}

			setState(601);
			((AssignStatementContext)_localctx).exp = expression();
			_localctx.assignRet.setAssigned(((AssignStatementContext)_localctx).exp.expRet);
			setState(603);
			match(SEMICOLON);
			System.out.println("Line " + ((AssignStatementContext)_localctx).assign.getLine() + " : " + "Assignment");
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
	public static class ExprStatementContext extends ParserRuleContext {
		public ExpressionStatement expStatementRet;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			((ExprStatementContext)_localctx).exp = expression();
			((ExprStatementContext)_localctx).expStatementRet =  new ExpressionStatement(((ExprStatementContext)_localctx).exp.expRet, ((ExprStatementContext)_localctx).exp.expRet.getFirst().getLine());
			setState(608);
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
	public static class ObserveStatementContext extends ParserRuleContext {
		public ObserveStatement observeRet;
		public Token id1;
		public Token s;
		public Token id;
		public ExpressionContext exp;
		public AccesslevelsContext a;
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public TerminalNode OBSERVERS() { return getToken(SOACTParser.OBSERVERS, 0); }
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SOACTParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public ObserveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterObserveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitObserveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitObserveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObserveStatementContext observeStatement() throws RecognitionException {
		ObserveStatementContext _localctx = new ObserveStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_observeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int line = -1;
			     ((ObserveStatementContext)_localctx).observeRet =  new ObserveStatement();
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(611);
					((ObserveStatementContext)_localctx).id1 = match(IDENTIFIER);
					line = (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0);
					                          _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getText():null), (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0)));
					}
					break;
				case SELF:
					{
					setState(613);
					((ObserveStatementContext)_localctx).s = match(SELF);
					line = (((ObserveStatementContext)_localctx).s!=null?((ObserveStatementContext)_localctx).s.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(617);
				match(DOT);
				}
				break;
			}
			setState(620);
			((ObserveStatementContext)_localctx).id = match(IDENTIFIER);
			if(line == -1)
			                         line = (((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getLine():0);
			                     _localctx.observeRet.setLine(line);
			                     _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getText():null), (((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getLine():0)));
			System.out.println("Line " + ((ObserveStatementContext)_localctx).id.getLine() + " : " + "Send Message");
			setState(623);
			match(LPAR);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(624);
				((ObserveStatementContext)_localctx).exp = expression();
				_localctx.observeRet.setArgs(((ObserveStatementContext)_localctx).exp.expRet);
				}
			}

			setState(629);
			match(RPAR);
			setState(630);
			match(OBSERVERS);
			setState(631);
			match(LPAR);
			setState(632);
			((ObserveStatementContext)_localctx).a = accesslevels();
			_localctx.observeRet.setObservers(((ObserveStatementContext)_localctx).a.accessLevelsRet);
			setState(634);
			match(RPAR);
			setState(635);
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
		public ArrayList<Expression> expRet;
		public ExpCommaContext expc;
		public ExpCommaContext expc2;
		public ExpressionContext ex;
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionContext)_localctx).expRet =  new ArrayList<>();
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(638);
				((ExpressionContext)_localctx).expc = expComma();
				_localctx.expRet.addAll(((ExpressionContext)_localctx).expc.expRet);
				}
				break;
			case 2:
				{
				setState(641);
				((ExpressionContext)_localctx).expc2 = expComma();
				_localctx.expRet.addAll(((ExpressionContext)_localctx).expc2.expRet);
				setState(643);
				match(COMMA);
				setState(644);
				((ExpressionContext)_localctx).ex = expression();
				_localctx.expRet.addAll(((ExpressionContext)_localctx).ex.expRet);
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
	public static class ExpCommaContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpOrContext expor;
		public ExpOrContext expor2;
		public Token OR;
		public ExpCommaContext expc;
		public TerminalNode OR() { return getToken(SOACTParser.OR, 0); }
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
		public ExpCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpCommaContext expComma() throws RecognitionException {
		ExpCommaContext _localctx = new ExpCommaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpCommaContext)_localctx).expRet =  new ArrayList<>();
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(650);
				((ExpCommaContext)_localctx).expor = expOr();
				_localctx.expRet.addAll(((ExpCommaContext)_localctx).expor.expRet);
				}
				break;
			case 2:
				{
				setState(653);
				((ExpCommaContext)_localctx).expor2 = expOr();
				_localctx.expRet.addAll(((ExpCommaContext)_localctx).expor2.expRet);
				setState(655);
				((ExpCommaContext)_localctx).OR = match(OR);
				setState(656);
				((ExpCommaContext)_localctx).expc = expComma();
				_localctx.expRet.addAll(((ExpCommaContext)_localctx).expc.expRet);System.out.println("Line " + ((ExpCommaContext)_localctx).OR.getLine() + " : " + "Operator:||");
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
	public static class ExpOrContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpAndContext expa;
		public ExpAndContext expa2;
		public Token AND;
		public ExpOrContext expo;
		public TerminalNode AND() { return getToken(SOACTParser.AND, 0); }
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public ExpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpOrContext expOr() throws RecognitionException {
		ExpOrContext _localctx = new ExpOrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpOrContext)_localctx).expRet =  new ArrayList<>();
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(662);
				((ExpOrContext)_localctx).expa = expAnd();
				_localctx.expRet.addAll(((ExpOrContext)_localctx).expa.expRet);
				}
				break;
			case 2:
				{
				setState(665);
				((ExpOrContext)_localctx).expa2 = expAnd();
				_localctx.expRet.addAll(((ExpOrContext)_localctx).expa2.expRet);
				setState(667);
				((ExpOrContext)_localctx).AND = match(AND);
				setState(668);
				((ExpOrContext)_localctx).expo = expOr();
				_localctx.expRet.addAll(((ExpOrContext)_localctx).expo.expRet);System.out.println("Line " + ((ExpOrContext)_localctx).AND.getLine() + " : " + "Operator:&&");
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
	public static class ExpAndContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpEqualsContext expe;
		public ExpAndPrimContext expap;
		public ExpEqualsContext expEquals() {
			return getRuleContext(ExpEqualsContext.class,0);
		}
		public ExpAndPrimContext expAndPrim() {
			return getRuleContext(ExpAndPrimContext.class,0);
		}
		public ExpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndContext expAnd() throws RecognitionException {
		ExpAndContext _localctx = new ExpAndContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpAndContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(674);
			((ExpAndContext)_localctx).expe = expEquals();
			_localctx.expRet.addAll(((ExpAndContext)_localctx).expe.expRet);
			setState(676);
			((ExpAndContext)_localctx).expap = expAndPrim();
			_localctx.expRet.addAll(((ExpAndContext)_localctx).expap.expRet);
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
	public static class ExpAndPrimContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token equals_name;
		public ExpEqualsContext expe;
		public ExpAndPrimContext expap;
		public ExpEqualsContext expEquals() {
			return getRuleContext(ExpEqualsContext.class,0);
		}
		public ExpAndPrimContext expAndPrim() {
			return getRuleContext(ExpAndPrimContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(SOACTParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SOACTParser.EQUAL, 0); }
		public ExpAndPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAndPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAndPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAndPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAndPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndPrimContext expAndPrim() throws RecognitionException {
		ExpAndPrimContext _localctx = new ExpAndPrimContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expAndPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpAndPrimContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==NOT_EQUAL) {
				{
				setState(680);
				((ExpAndPrimContext)_localctx).equals_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ExpAndPrimContext)_localctx).equals_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				((ExpAndPrimContext)_localctx).expe = expEquals();
				_localctx.expRet.addAll(((ExpAndPrimContext)_localctx).expe.expRet);System.out.println("Line " + ((ExpAndPrimContext)_localctx).equals_name.getLine() + " : " + "Operator:" + (((ExpAndPrimContext)_localctx).equals_name!=null?((ExpAndPrimContext)_localctx).equals_name.getText():null));
				setState(683);
				((ExpAndPrimContext)_localctx).expap = expAndPrim();
				_localctx.expRet.addAll(((ExpAndPrimContext)_localctx).expap.expRet);
				}
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
	public static class ExpEqualsContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpCompareContext expc;
		public ExpEqualsPrimContext expep;
		public ExpCompareContext expCompare() {
			return getRuleContext(ExpCompareContext.class,0);
		}
		public ExpEqualsPrimContext expEqualsPrim() {
			return getRuleContext(ExpEqualsPrimContext.class,0);
		}
		public ExpEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpEqualsContext expEquals() throws RecognitionException {
		ExpEqualsContext _localctx = new ExpEqualsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpEqualsContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(689);
			((ExpEqualsContext)_localctx).expc = expCompare();
			_localctx.expRet.addAll(((ExpEqualsContext)_localctx).expc.expRet);
			setState(691);
			((ExpEqualsContext)_localctx).expep = expEqualsPrim();
			_localctx.expRet.addAll(((ExpEqualsContext)_localctx).expep.expRet);
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
	public static class ExpEqualsPrimContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token than_name;
		public ExpCompareContext expc;
		public ExpEqualsPrimContext expep;
		public ExpCompareContext expCompare() {
			return getRuleContext(ExpCompareContext.class,0);
		}
		public ExpEqualsPrimContext expEqualsPrim() {
			return getRuleContext(ExpEqualsPrimContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public ExpEqualsPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expEqualsPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpEqualsPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpEqualsPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpEqualsPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpEqualsPrimContext expEqualsPrim() throws RecognitionException {
		ExpEqualsPrimContext _localctx = new ExpEqualsPrimContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expEqualsPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpEqualsPrimContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(695);
				((ExpEqualsPrimContext)_localctx).than_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GREATER_THAN || _la==LESS_THAN) ) {
					((ExpEqualsPrimContext)_localctx).than_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				((ExpEqualsPrimContext)_localctx).expc = expCompare();
				_localctx.expRet.addAll(((ExpEqualsPrimContext)_localctx).expc.expRet);System.out.println("Line " + ((ExpEqualsPrimContext)_localctx).than_name.getLine() + " : " + "Operator:" + (((ExpEqualsPrimContext)_localctx).than_name!=null?((ExpEqualsPrimContext)_localctx).than_name.getText():null));
				setState(698);
				((ExpEqualsPrimContext)_localctx).expep = expEqualsPrim();
				_localctx.expRet.addAll(((ExpEqualsPrimContext)_localctx).expep.expRet);
				}
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
	public static class ExpCompareContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpPlusMinusContext exppm;
		public ExpComparePrimContext expcp;
		public ExpPlusMinusContext expPlusMinus() {
			return getRuleContext(ExpPlusMinusContext.class,0);
		}
		public ExpComparePrimContext expComparePrim() {
			return getRuleContext(ExpComparePrimContext.class,0);
		}
		public ExpCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpCompareContext expCompare() throws RecognitionException {
		ExpCompareContext _localctx = new ExpCompareContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpCompareContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(704);
			((ExpCompareContext)_localctx).exppm = expPlusMinus();
			_localctx.expRet.addAll(((ExpCompareContext)_localctx).exppm.expRet);
			setState(706);
			((ExpCompareContext)_localctx).expcp = expComparePrim();
			_localctx.expRet.addAll(((ExpCompareContext)_localctx).expcp.expRet);
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
	public static class ExpComparePrimContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token pm_name;
		public ExpPlusMinusContext exppm;
		public ExpComparePrimContext expcp;
		public ExpPlusMinusContext expPlusMinus() {
			return getRuleContext(ExpPlusMinusContext.class,0);
		}
		public ExpComparePrimContext expComparePrim() {
			return getRuleContext(ExpComparePrimContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SOACTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SOACTParser.MINUS, 0); }
		public ExpComparePrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expComparePrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpComparePrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpComparePrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpComparePrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpComparePrimContext expComparePrim() throws RecognitionException {
		ExpComparePrimContext _localctx = new ExpComparePrimContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expComparePrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpComparePrimContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(710);
				((ExpComparePrimContext)_localctx).pm_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpComparePrimContext)_localctx).pm_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(711);
				((ExpComparePrimContext)_localctx).exppm = expPlusMinus();
				_localctx.expRet.addAll(((ExpComparePrimContext)_localctx).exppm.expRet); System.out.println("Line " + ((ExpComparePrimContext)_localctx).pm_name.getLine() + " : " + "Operator:" + (((ExpComparePrimContext)_localctx).pm_name!=null?((ExpComparePrimContext)_localctx).pm_name.getText():null));
				setState(713);
				((ExpComparePrimContext)_localctx).expcp = expComparePrim();
				_localctx.expRet.addAll(((ExpComparePrimContext)_localctx).expcp.expRet);
				}
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
	public static class ExpPlusMinusContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpDivideMultModContext expdmm;
		public ExpPlusMinusPrimContext exppmp;
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public ExpPlusMinusPrimContext expPlusMinusPrim() {
			return getRuleContext(ExpPlusMinusPrimContext.class,0);
		}
		public ExpPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPlusMinusContext expPlusMinus() throws RecognitionException {
		ExpPlusMinusContext _localctx = new ExpPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expPlusMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPlusMinusContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(719);
			((ExpPlusMinusContext)_localctx).expdmm = expDivideMultMod();
			_localctx.expRet.addAll(((ExpPlusMinusContext)_localctx).expdmm.expRet);
			setState(721);
			((ExpPlusMinusContext)_localctx).exppmp = expPlusMinusPrim();
			_localctx.expRet.addAll(((ExpPlusMinusContext)_localctx).exppmp.expRet);
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
	public static class ExpPlusMinusPrimContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token dmd_name;
		public ExpDivideMultModContext expdmm;
		public ExpPlusMinusPrimContext exppmp;
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public ExpPlusMinusPrimContext expPlusMinusPrim() {
			return getRuleContext(ExpPlusMinusPrimContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(SOACTParser.DIVIDE, 0); }
		public TerminalNode MULT() { return getToken(SOACTParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(SOACTParser.MOD, 0); }
		public ExpPlusMinusPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPlusMinusPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPlusMinusPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPlusMinusPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPlusMinusPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPlusMinusPrimContext expPlusMinusPrim() throws RecognitionException {
		ExpPlusMinusPrimContext _localctx = new ExpPlusMinusPrimContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expPlusMinusPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPlusMinusPrimContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
				{
				setState(725);
				((ExpPlusMinusPrimContext)_localctx).dmd_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
					((ExpPlusMinusPrimContext)_localctx).dmd_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(726);
				((ExpPlusMinusPrimContext)_localctx).expdmm = expDivideMultMod();
				_localctx.expRet.addAll(((ExpPlusMinusPrimContext)_localctx).expdmm.expRet);System.out.println("Line " + ((ExpPlusMinusPrimContext)_localctx).dmd_name.getLine() + " : " + "Operator:" + (((ExpPlusMinusPrimContext)_localctx).dmd_name!=null?((ExpPlusMinusPrimContext)_localctx).dmd_name.getText():null));
				setState(728);
				((ExpPlusMinusPrimContext)_localctx).exppmp = expPlusMinusPrim();
				_localctx.expRet.addAll(((ExpPlusMinusPrimContext)_localctx).exppmp.expRet);
				}
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
	public static class ExpDivideMultModContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpPreUnaryContext exppu;
		public Token bmndi;
		public ExpDivideMultModContext expdmm;
		public ExpPreUnaryContext expPreUnary() {
			return getRuleContext(ExpPreUnaryContext.class,0);
		}
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SOACTParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SOACTParser.NOT, 0); }
		public TerminalNode DECREMENT() { return getToken(SOACTParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(SOACTParser.INCREMENT, 0); }
		public ExpDivideMultModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expDivideMultMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpDivideMultMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpDivideMultMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpDivideMultMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpDivideMultModContext expDivideMultMod() throws RecognitionException {
		ExpDivideMultModContext _localctx = new ExpDivideMultModContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expDivideMultMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpDivideMultModContext)_localctx).expRet =  new ArrayList<>();
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				setState(734);
				((ExpDivideMultModContext)_localctx).exppu = expPreUnary();
				_localctx.expRet.addAll(((ExpDivideMultModContext)_localctx).exppu.expRet);
				}
				break;
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				{
				setState(737);
				((ExpDivideMultModContext)_localctx).bmndi = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31527396414849024L) != 0)) ) {
					((ExpDivideMultModContext)_localctx).bmndi = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(738);
				((ExpDivideMultModContext)_localctx).expdmm = expDivideMultMod();
				_localctx.expRet.addAll(((ExpDivideMultModContext)_localctx).expdmm.expRet); System.out.println("Line " + ((ExpDivideMultModContext)_localctx).bmndi.getLine() + " : " + "Operator:" + (((ExpDivideMultModContext)_localctx).bmndi!=null?((ExpDivideMultModContext)_localctx).bmndi.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExpPreUnaryContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpPostUnaryContext exppu;
		public ExpPreUnaryPrimContext exppup;
		public ExpPostUnaryContext expPostUnary() {
			return getRuleContext(ExpPostUnaryContext.class,0);
		}
		public ExpPreUnaryPrimContext expPreUnaryPrim() {
			return getRuleContext(ExpPreUnaryPrimContext.class,0);
		}
		public ExpPreUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPreUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPreUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPreUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPreUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPreUnaryContext expPreUnary() throws RecognitionException {
		ExpPreUnaryContext _localctx = new ExpPreUnaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expPreUnary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPreUnaryContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(744);
			((ExpPreUnaryContext)_localctx).exppu = expPostUnary();
			_localctx.expRet.addAll(((ExpPreUnaryContext)_localctx).exppu.expRet);
			setState(746);
			((ExpPreUnaryContext)_localctx).exppup = expPreUnaryPrim();
			_localctx.expRet.addAll(((ExpPreUnaryContext)_localctx).exppup.expRet);
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
	public static class ExpPreUnaryPrimContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token id_name;
		public ExpPreUnaryPrimContext exppup;
		public ExpPreUnaryPrimContext expPreUnaryPrim() {
			return getRuleContext(ExpPreUnaryPrimContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SOACTParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SOACTParser.DECREMENT, 0); }
		public ExpPreUnaryPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPreUnaryPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPreUnaryPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPreUnaryPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPreUnaryPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPreUnaryPrimContext expPreUnaryPrim() throws RecognitionException {
		ExpPreUnaryPrimContext _localctx = new ExpPreUnaryPrimContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expPreUnaryPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPreUnaryPrimContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(750);
				((ExpPreUnaryPrimContext)_localctx).id_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((ExpPreUnaryPrimContext)_localctx).id_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(751);
				((ExpPreUnaryPrimContext)_localctx).exppup = expPreUnaryPrim();
				System.out.println("Line " + ((ExpPreUnaryPrimContext)_localctx).id_name.getLine() + " : " + "Operator:" + (((ExpPreUnaryPrimContext)_localctx).id_name!=null?((ExpPreUnaryPrimContext)_localctx).id_name.getText():null));
				                                                        _localctx.expRet.addAll(((ExpPreUnaryPrimContext)_localctx).exppup.expRet);
				}
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
	public static class ExpPostUnaryContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpBracketContext expb;
		public ExpressionContext exp;
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ExpBracketContext expBracket() {
			return getRuleContext(ExpBracketContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpPostUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPostUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPostUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPostUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPostUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPostUnaryContext expPostUnary() throws RecognitionException {
		ExpPostUnaryContext _localctx = new ExpPostUnaryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expPostUnary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPostUnaryContext)_localctx).expRet =  new ArrayList<>();
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				setState(757);
				((ExpPostUnaryContext)_localctx).expb = expBracket();
				_localctx.expRet.addAll(((ExpPostUnaryContext)_localctx).expb.expRet); 
				}
				break;
			case LBRACK:
				{
				setState(760);
				match(LBRACK);
				setState(761);
				((ExpPostUnaryContext)_localctx).exp = expression();
				_localctx.expRet.addAll(((ExpPostUnaryContext)_localctx).exp.expRet); 
				setState(763);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExpBracketContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpAccessContext expa;
		public ExpAccessContext caller;
		public ExpBracketContext calling;
		public TerminalNode DOT() { return getToken(SOACTParser.DOT, 0); }
		public ExpAccessContext expAccess() {
			return getRuleContext(ExpAccessContext.class,0);
		}
		public ExpBracketContext expBracket() {
			return getRuleContext(ExpBracketContext.class,0);
		}
		public ExpBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpBracketContext expBracket() throws RecognitionException {
		ExpBracketContext _localctx = new ExpBracketContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpBracketContext)_localctx).expRet =  new ArrayList<>();
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(768);
				((ExpBracketContext)_localctx).expa = expAccess();
				_localctx.expRet.addAll(((ExpBracketContext)_localctx).expa.expRet);
				}
				break;
			case 2:
				{
				setState(771);
				((ExpBracketContext)_localctx).caller = expAccess();
				_localctx.expRet.addAll(((ExpBracketContext)_localctx).caller.expRet);
				setState(773);
				match(DOT);
				setState(774);
				((ExpBracketContext)_localctx).calling = expBracket();
				_localctx.expRet.addAll(((ExpBracketContext)_localctx).calling.expRet);
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
	public static class ExpAccessContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpParContext exppar;
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public ExpParContext expPar() {
			return getRuleContext(ExpParContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAccessContext expAccess() throws RecognitionException {
		ExpAccessContext _localctx = new ExpAccessContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpAccessContext)_localctx).expRet =  new ArrayList<>();
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				setState(780);
				((ExpAccessContext)_localctx).exppar = expPar();
				_localctx.expRet.addAll(((ExpAccessContext)_localctx).exppar.expRet);
				}
				break;
			case LPAR:
				{
				setState(783);
				match(LPAR);
				setState(784);
				((ExpAccessContext)_localctx).exp = expression();
				_localctx.expRet.addAll(((ExpAccessContext)_localctx).exp.expRet); 
				setState(786);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExpParContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public HandlerCallContext handlercall;
		public CustomPrimAccessContext cpa;
		public Token id;
		public PrimitivesValsContext primitivesVals() {
			return getRuleContext(PrimitivesValsContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public HandlerCallContext handlerCall() {
			return getRuleContext(HandlerCallContext.class,0);
		}
		public CustomPrimAccessContext customPrimAccess() {
			return getRuleContext(CustomPrimAccessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpParContext expPar() throws RecognitionException {
		ExpParContext _localctx = new ExpParContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpParContext)_localctx).expRet =  new ArrayList<>();
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(791);
				primitivesVals();
				}
				break;
			case 2:
				{
				setState(792);
				((ExpParContext)_localctx).handlercall = handlerCall();
				_localctx.expRet.addAll(((ExpParContext)_localctx).handlercall.expRet);
				}
				break;
			case 3:
				{
				setState(795);
				((ExpParContext)_localctx).cpa = customPrimAccess();
				_localctx.expRet.addAll(((ExpParContext)_localctx).cpa.expRet);
				}
				break;
			case 4:
				{
				setState(798);
				((ExpParContext)_localctx).id = match(IDENTIFIER);
				_localctx.expRet.add(new Identifier((((ExpParContext)_localctx).id!=null?((ExpParContext)_localctx).id.getText():null), (((ExpParContext)_localctx).id!=null?((ExpParContext)_localctx).id.getLine():0)));
				}
				break;
			case 5:
				{
				setState(800);
				match(SELF);
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
	public static class CustomPrimAccessContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token id;
		public Token idAccess;
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public CustomPrimAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customPrimAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterCustomPrimAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitCustomPrimAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitCustomPrimAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomPrimAccessContext customPrimAccess() throws RecognitionException {
		CustomPrimAccessContext _localctx = new CustomPrimAccessContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_customPrimAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((CustomPrimAccessContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(804);
			((CustomPrimAccessContext)_localctx).id = match(IDENTIFIER);
			_localctx.expRet.add(new Identifier((((CustomPrimAccessContext)_localctx).id!=null?((CustomPrimAccessContext)_localctx).id.getText():null), (((CustomPrimAccessContext)_localctx).id!=null?((CustomPrimAccessContext)_localctx).id.getLine():0)));
			setState(806);
			match(COLON);
			setState(807);
			match(COLON);
			setState(808);
			((CustomPrimAccessContext)_localctx).idAccess = match(IDENTIFIER);
			_localctx.expRet.add(new Identifier((((CustomPrimAccessContext)_localctx).idAccess!=null?((CustomPrimAccessContext)_localctx).idAccess.getText():null), (((CustomPrimAccessContext)_localctx).idAccess!=null?((CustomPrimAccessContext)_localctx).idAccess.getLine():0)));
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
	public static class HandlerCallContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public Token PRINT;
		public Token TOLOWER;
		public Token TOUPPER;
		public Token REVERSE;
		public Token ADD;
		public Token INCLUDE;
		public Token REMOVE;
		public Token LENGTH;
		public Token id;
		public ExpressionContext expression;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(SOACTParser.PRINT, 0); }
		public TerminalNode TOLOWER() { return getToken(SOACTParser.TOLOWER, 0); }
		public TerminalNode TOUPPER() { return getToken(SOACTParser.TOUPPER, 0); }
		public TerminalNode REVERSE() { return getToken(SOACTParser.REVERSE, 0); }
		public TerminalNode ADD() { return getToken(SOACTParser.ADD, 0); }
		public TerminalNode INCLUDE() { return getToken(SOACTParser.INCLUDE, 0); }
		public TerminalNode REMOVE() { return getToken(SOACTParser.REMOVE, 0); }
		public TerminalNode LENGTH() { return getToken(SOACTParser.LENGTH, 0); }
		public HandlerCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterHandlerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitHandlerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitHandlerCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerCallContext handlerCall() throws RecognitionException {
		HandlerCallContext _localctx = new HandlerCallContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_handlerCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((HandlerCallContext)_localctx).expRet =  new ArrayList<>();
			{
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				{
				setState(812);
				((HandlerCallContext)_localctx).PRINT = match(PRINT);
				System.out.println("Line " + ((HandlerCallContext)_localctx).PRINT.getLine() + " : " + "Built-In: PRINT");
				}
				}
				break;
			case TOLOWER:
				{
				{
				setState(814);
				((HandlerCallContext)_localctx).TOLOWER = match(TOLOWER);
				System.out.println("Line " + ((HandlerCallContext)_localctx).TOLOWER.getLine() + " : " + "Built-In: LOWER");
				}
				}
				break;
			case TOUPPER:
				{
				{
				setState(816);
				((HandlerCallContext)_localctx).TOUPPER = match(TOUPPER);
				System.out.println("Line " + ((HandlerCallContext)_localctx).TOUPPER.getLine() + " : " + "Built-In: UPPER");
				}
				}
				break;
			case REVERSE:
				{
				{
				setState(818);
				((HandlerCallContext)_localctx).REVERSE = match(REVERSE);
				System.out.println("Line " + ((HandlerCallContext)_localctx).REVERSE.getLine() + " : " + "Built-In: REVERSE");
				}
				}
				break;
			case ADD:
				{
				{
				setState(820);
				((HandlerCallContext)_localctx).ADD = match(ADD);
				System.out.println("Line " + ((HandlerCallContext)_localctx).ADD.getLine() + " : " + "Built-In: ADD");
				}
				}
				break;
			case INCLUDE:
				{
				{
				setState(822);
				((HandlerCallContext)_localctx).INCLUDE = match(INCLUDE);
				System.out.println("Line " + ((HandlerCallContext)_localctx).INCLUDE.getLine() + " : " + "Built-In: INCLUDE");
				}
				}
				break;
			case REMOVE:
				{
				{
				setState(824);
				((HandlerCallContext)_localctx).REMOVE = match(REMOVE);
				System.out.println("Line " + ((HandlerCallContext)_localctx).REMOVE.getLine() + " : " + "Built-In: REMOVE");
				}
				}
				break;
			case LENGTH:
				{
				{
				setState(826);
				((HandlerCallContext)_localctx).LENGTH = match(LENGTH);
				System.out.println("Line " + ((HandlerCallContext)_localctx).LENGTH.getLine() + " : " + "Built-In: LEN");
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(828);
				((HandlerCallContext)_localctx).id = match(IDENTIFIER);
				_localctx.expRet.add(new Identifier((((HandlerCallContext)_localctx).id!=null?((HandlerCallContext)_localctx).id.getText():null), (((HandlerCallContext)_localctx).id!=null?((HandlerCallContext)_localctx).id.getLine():0)));
				    System.out.println("Line " + ((HandlerCallContext)_localctx).id.getLine() + " : " + "Send Message");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(832);
			match(LPAR);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(833);
				((HandlerCallContext)_localctx).expression = expression();
				_localctx.expRet.addAll(((HandlerCallContext)_localctx).expression.expRet); 
				}
			}

			setState(838);
			match(RPAR);
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
	public static class PrimitivesValsContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(SOACTParser.INT_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(SOACTParser.STRING_VALUE, 0); }
		public TerminalNode TRUE() { return getToken(SOACTParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SOACTParser.FALSE, 0); }
		public PrimitivesValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivesVals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimitivesVals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimitivesVals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimitivesVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivesValsContext primitivesVals() throws RecognitionException {
		PrimitivesValsContext _localctx = new PrimitivesValsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primitivesVals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2882303761517117505L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001G\u034b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"t\b\u0000\n\u0000\f\u0000w\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0084\b\u0001\u000b\u0001\f\u0001"+
		"\u0085\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0091\b\u0002\n"+
		"\u0002\f\u0002\u0094\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0099\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009e"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00a3\b\u0002"+
		"\n\u0002\f\u0002\u00a6\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00b1\b\u0003\n\u0003\f\u0003\u00b4\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00c4\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c8\b"+
		"\u0004\n\u0004\f\u0004\u00cb\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d3\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00dd\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f1"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00fe\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0103"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u010c"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u011b\b\u000b\n\u000b\f\u000b\u011e\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0129\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0142\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0157\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0162\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0169\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0190\b\u0014\n\u0014\f\u0014\u0193"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u019c\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01ae\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u01ba\b\u0017\u000b\u0017\f\u0017\u01bb"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u01db\b\u0019\n\u0019\f\u0019\u01de\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01e4\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01f7\b\u0019\n\u0019\f\u0019"+
		"\u01fa\t\u0019\u0003\u0019\u01fc\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u020a\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0218\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u021c\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0228\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0236\b\u001d\n\u001d\f\u001d\u0239\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0249\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u024e\b\u001e\n\u001e\f\u001e\u0251\t\u001e\u0001\u001e\u0003\u001e"+
		"\u0254\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0258\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0268\b \u0001 \u0003 \u026b\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0274\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0288\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0294\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02a0\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u02af\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02be"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u02cd\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02dc"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02e6"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u02f3\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02fe\b/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u030a\b0\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u0315\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0322"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u033f\b4\u0001"+
		"4\u00014\u00014\u00014\u00034\u0345\b4\u00014\u00014\u00015\u00015\u0001"+
		"5\u0000\u00006\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000"+
		"\t\u0005\u0000\u0002\u0002\u0004\u0004\u000f\u000f$$DD\u0001\u0000\u001a"+
		"\u001b\u0001\u0000./\u0001\u000001\u0001\u0000()\u0001\u0000*,\u0002\u0000"+
		"))46\u0001\u000056\u0004\u0000\b\b\u000e\u000eCCEE\u0365\u0000l\u0001"+
		"\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u0089\u0001\u0000"+
		"\u0000\u0000\u0006\u00a9\u0001\u0000\u0000\u0000\b\u00b9\u0001\u0000\u0000"+
		"\u0000\n\u00dc\u0001\u0000\u0000\u0000\f\u00de\u0001\u0000\u0000\u0000"+
		"\u000e\u00e2\u0001\u0000\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000"+
		"\u0012\u00e9\u0001\u0000\u0000\u0000\u0014\u00f8\u0001\u0000\u0000\u0000"+
		"\u0016\u0113\u0001\u0000\u0000\u0000\u0018\u011f\u0001\u0000\u0000\u0000"+
		"\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u0132\u0001\u0000\u0000\u0000"+
		"\u001e\u0139\u0001\u0000\u0000\u0000 \u0143\u0001\u0000\u0000\u0000\""+
		"\u014c\u0001\u0000\u0000\u0000$\u015a\u0001\u0000\u0000\u0000&\u016c\u0001"+
		"\u0000\u0000\u0000(\u0178\u0001\u0000\u0000\u0000*\u019d\u0001\u0000\u0000"+
		"\u0000,\u01a5\u0001\u0000\u0000\u0000.\u01af\u0001\u0000\u0000\u00000"+
		"\u01c0\u0001\u0000\u0000\u00002\u01ca\u0001\u0000\u0000\u00004\u0209\u0001"+
		"\u0000\u0000\u00006\u020b\u0001\u0000\u0000\u00008\u0220\u0001\u0000\u0000"+
		"\u0000:\u022b\u0001\u0000\u0000\u0000<\u0241\u0001\u0000\u0000\u0000>"+
		"\u025e\u0001\u0000\u0000\u0000@\u0262\u0001\u0000\u0000\u0000B\u027d\u0001"+
		"\u0000\u0000\u0000D\u0289\u0001\u0000\u0000\u0000F\u0295\u0001\u0000\u0000"+
		"\u0000H\u02a1\u0001\u0000\u0000\u0000J\u02a7\u0001\u0000\u0000\u0000L"+
		"\u02b0\u0001\u0000\u0000\u0000N\u02b6\u0001\u0000\u0000\u0000P\u02bf\u0001"+
		"\u0000\u0000\u0000R\u02c5\u0001\u0000\u0000\u0000T\u02ce\u0001\u0000\u0000"+
		"\u0000V\u02d4\u0001\u0000\u0000\u0000X\u02dd\u0001\u0000\u0000\u0000Z"+
		"\u02e7\u0001\u0000\u0000\u0000\\\u02ed\u0001\u0000\u0000\u0000^\u02f4"+
		"\u0001\u0000\u0000\u0000`\u02ff\u0001\u0000\u0000\u0000b\u030b\u0001\u0000"+
		"\u0000\u0000d\u0316\u0001\u0000\u0000\u0000f\u0323\u0001\u0000\u0000\u0000"+
		"h\u032b\u0001\u0000\u0000\u0000j\u0348\u0001\u0000\u0000\u0000lu\u0006"+
		"\u0000\uffff\uffff\u0000mn\u0003\u0004\u0002\u0000no\u0006\u0000\uffff"+
		"\uffff\u0000ot\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0006"+
		"\u0000\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000xy\u00030\u0018\u0000yz\u0006\u0000\uffff\uffff\u0000"+
		"z\u0001\u0001\u0000\u0000\u0000{|\u0005\'\u0000\u0000|}\u0005D\u0000\u0000"+
		"}~\u0006\u0001\uffff\uffff\u0000~\u0083\u0005=\u0000\u0000\u007f\u0080"+
		"\u0003\n\u0005\u0000\u0080\u0081\u0006\u0001\uffff\uffff\u0000\u0081\u0082"+
		"\u0005A\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u007f\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005>\u0000\u0000\u0088\u0003\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b\u0005D\u0000"+
		"\u0000\u008b\u008c\u0006\u0002\uffff\uffff\u0000\u008c\u0092\u0005=\u0000"+
		"\u0000\u008d\u008e\u0003\u0006\u0003\u0000\u008e\u008f\u0006\u0002\uffff"+
		"\uffff\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0003\b\u0004"+
		"\u0000\u0096\u0097\u0006\u0002\uffff\uffff\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0012"+
		"\t\u0000\u009b\u009c\u0006\u0002\uffff\uffff\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a4\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0014"+
		"\n\u0000\u00a0\u00a1\u0006\u0002\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u0005\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005%\u0000\u0000\u00aa\u00ab\u0005D\u0000\u0000\u00ab"+
		"\u00ac\u0006\u0003\uffff\uffff\u0000\u00ac\u00b2\u0005=\u0000\u0000\u00ad"+
		"\u00ae\u0005D\u0000\u0000\u00ae\u00af\u0006\u0003\uffff\uffff\u0000\u00af"+
		"\u00b1\u0005?\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005D\u0000\u0000\u00b6\u00b7\u0006"+
		"\u0003\uffff\uffff\u0000\u00b7\u00b8\u0005>\u0000\u0000\u00b8\u0007\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0006\u0004\uffff\uffff\u0000\u00ba\u00bb"+
		"\u0005\u001c\u0000\u0000\u00bb\u00c9\u0005=\u0000\u0000\u00bc\u00bd\u0003"+
		"\n\u0005\u0000\u00bd\u00c3\u0006\u0004\uffff\uffff\u0000\u00be\u00bf\u0005"+
		"9\u0000\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0\u00c1\u0006\u0004"+
		"\uffff\uffff\u0000\u00c1\u00c2\u0005:\u0000\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005A\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005>\u0000\u0000"+
		"\u00cd\t\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u000e\u0007\u0000\u00cf"+
		"\u00d0\u0005D\u0000\u0000\u00d0\u00d2\u0006\u0005\uffff\uffff\u0000\u00d1"+
		"\u00d3\u0003\f\u0006\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00dd\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0018\f\u0000\u00d5\u00d6\u0005D\u0000\u0000\u00d6\u00d7\u0006"+
		"\u0005\uffff\uffff\u0000\u00d7\u00dd\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003\u0010\b\u0000\u00d9\u00da\u0005D\u0000\u0000\u00da\u00db\u0006"+
		"\u0005\uffff\uffff\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dd\u000b\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005;\u0000\u0000\u00df\u00e0\u0005C\u0000\u0000\u00e0\u00e1\u0005<"+
		"\u0000\u0000\u00e1\r\u0001\u0000\u0000\u0000\u00e2\u00e3\u0007\u0000\u0000"+
		"\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007\u0001\u0000"+
		"\u0000\u00e5\u00e6\u00051\u0000\u0000\u00e6\u00e7\u0003\u000e\u0007\u0000"+
		"\u00e7\u00e8\u00050\u0000\u0000\u00e8\u0011\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0006\t\uffff\uffff\u0000\u00ea\u00eb\u0005D\u0000\u0000\u00eb"+
		"\u00ec\u0006\t\uffff\uffff\u0000\u00ec\u00f0\u00059\u0000\u0000\u00ed"+
		"\u00ee\u0003\u0016\u000b\u0000\u00ee\u00ef\u0006\t\uffff\uffff\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005:\u0000\u0000\u00f3\u00f4\u0005=\u0000\u0000\u00f4\u00f5\u0003"+
		"2\u0019\u0000\u00f5\u00f6\u0006\t\uffff\uffff\u0000\u00f6\u00f7\u0005"+
		">\u0000\u0000\u00f7\u0013\u0001\u0000\u0000\u0000\u00f8\u00fd\u0006\n"+
		"\uffff\uffff\u0000\u00f9\u00fa\u0005\u0006\u0000\u0000\u00fa\u00fe\u0006"+
		"\n\uffff\uffff\u0000\u00fb\u00fc\u0005\f\u0000\u0000\u00fc\u00fe\u0006"+
		"\n\uffff\uffff\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u0102\u0001\u0000\u0000\u0000\u00ff\u0100\u0003"+
		"\u001c\u000e\u0000\u0100\u0101\u0006\n\uffff\uffff\u0000\u0101\u0103\u0001"+
		"\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"D\u0000\u0000\u0105\u0106\u0006\n\uffff\uffff\u0000\u0106\u0107\u0006"+
		"\n\uffff\uffff\u0000\u0107\u010b\u00059\u0000\u0000\u0108\u0109\u0003"+
		"\u0016\u000b\u0000\u0109\u010a\u0006\n\uffff\uffff\u0000\u010a\u010c\u0001"+
		"\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		":\u0000\u0000\u010e\u010f\u0005=\u0000\u0000\u010f\u0110\u00032\u0019"+
		"\u0000\u0110\u0111\u0006\n\uffff\uffff\u0000\u0111\u0112\u0005>\u0000"+
		"\u0000\u0112\u0015\u0001\u0000\u0000\u0000\u0113\u0114\u0006\u000b\uffff"+
		"\uffff\u0000\u0114\u0115\u0003\n\u0005\u0000\u0115\u011c\u0006\u000b\uffff"+
		"\uffff\u0000\u0116\u0117\u0005?\u0000\u0000\u0117\u0118\u0003\n\u0005"+
		"\u0000\u0118\u0119\u0006\u000b\uffff\uffff\u0000\u0119\u011b\u0001\u0000"+
		"\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0003\u000e\u0007\u0000\u0120\u0121\u0005;\u0000"+
		"\u0000\u0121\u0122\u0005<\u0000\u0000\u0122\u0019\u0001\u0000\u0000\u0000"+
		"\u0123\u0128\u0006\r\uffff\uffff\u0000\u0124\u0125\u0005\r\u0000\u0000"+
		"\u0125\u0129\u0006\r\uffff\uffff\u0000\u0126\u0127\u0005\u0016\u0000\u0000"+
		"\u0127\u0129\u0006\r\uffff\uffff\u0000\u0128\u0124\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u00059\u0000\u0000\u012b\u012c\u0003\u001e\u000f\u0000\u012c"+
		"\u012d\u0006\r\uffff\uffff\u0000\u012d\u012e\u0005?\u0000\u0000\u012e"+
		"\u012f\u0003\u001e\u000f\u0000\u012f\u0130\u0006\r\uffff\uffff\u0000\u0130"+
		"\u0131\u0005:\u0000\u0000\u0131\u001b\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0006\u000e\uffff\uffff\u0000\u0133\u0134\u0005\u0012\u0000\u0000\u0134"+
		"\u0135\u00059\u0000\u0000\u0135\u0136\u0003\u001a\r\u0000\u0136\u0137"+
		"\u0006\u000e\uffff\uffff\u0000\u0137\u0138\u0005:\u0000\u0000\u0138\u001d"+
		"\u0001\u0000\u0000\u0000\u0139\u0141\u0006\u000f\uffff\uffff\u0000\u013a"+
		"\u013b\u0005D\u0000\u0000\u013b\u0142\u0006\u000f\uffff\uffff\u0000\u013c"+
		"\u0142\u0005\u0014\u0000\u0000\u013d\u0142\u0005\u0007\u0000\u0000\u013e"+
		"\u013f\u0003\u001a\r\u0000\u013f\u0140\u0006\u000f\uffff\uffff\u0000\u0140"+
		"\u0142\u0001\u0000\u0000\u0000\u0141\u013a\u0001\u0000\u0000\u0000\u0141"+
		"\u013c\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141"+
		"\u013e\u0001\u0000\u0000\u0000\u0142\u001f\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005\u000b\u0000\u0000\u0144\u0145\u0006\u0010\uffff\uffff\u0000"+
		"\u0145\u0146\u0003\"\u0011\u0000\u0146\u0147\u0006\u0010\uffff\uffff\u0000"+
		"\u0147\u0148\u0005=\u0000\u0000\u0148\u0149\u00032\u0019\u0000\u0149\u014a"+
		"\u0006\u0010\uffff\uffff\u0000\u014a\u014b\u0005>\u0000\u0000\u014b!\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0006\u0011\uffff\uffff\u0000\u014d\u014e"+
		"\u00059\u0000\u0000\u014e\u014f\u0005D\u0000\u0000\u014f\u0150\u0006\u0011"+
		"\uffff\uffff\u0000\u0150\u0156\u0005&\u0000\u0000\u0151\u0152\u0005D\u0000"+
		"\u0000\u0152\u0157\u0006\u0011\uffff\uffff\u0000\u0153\u0154\u0003$\u0012"+
		"\u0000\u0154\u0155\u0006\u0011\uffff\uffff\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u0151\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005:\u0000"+
		"\u0000\u0159#\u0001\u0000\u0000\u0000\u015a\u015b\u0006\u0012\uffff\uffff"+
		"\u0000\u015b\u015c\u0005\u0013\u0000\u0000\u015c\u0161\u00059\u0000\u0000"+
		"\u015d\u015e\u0005D\u0000\u0000\u015e\u0162\u0006\u0012\uffff\uffff\u0000"+
		"\u015f\u0160\u0005C\u0000\u0000\u0160\u0162\u0006\u0012\uffff\uffff\u0000"+
		"\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0168\u0005?\u0000\u0000\u0164"+
		"\u0165\u0005D\u0000\u0000\u0165\u0169\u0006\u0012\uffff\uffff\u0000\u0166"+
		"\u0167\u0005C\u0000\u0000\u0167\u0169\u0006\u0012\uffff\uffff\u0000\u0168"+
		"\u0164\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005:\u0000\u0000\u016b%\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0005\u0011\u0000\u0000\u016d\u016e\u0006"+
		"\u0013\uffff\uffff\u0000\u016e\u016f\u00059\u0000\u0000\u016f\u0170\u0003"+
		"B!\u0000\u0170\u0171\u0006\u0013\uffff\uffff\u0000\u0171\u0172\u0005:"+
		"\u0000\u0000\u0172\u0173\u0005:\u0000\u0000\u0173\u0174\u0005=\u0000\u0000"+
		"\u0174\u0175\u00032\u0019\u0000\u0175\u0176\u0006\u0013\uffff\uffff\u0000"+
		"\u0176\u0177\u0005>\u0000\u0000\u0177\'\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005\u0003\u0000\u0000\u0179\u017a\u0006\u0014\uffff\uffff\u0000"+
		"\u017a\u017b\u0006\u0014\uffff\uffff\u0000\u017b\u017c\u00059\u0000\u0000"+
		"\u017c\u017d\u0003B!\u0000\u017d\u017e\u0006\u0014\uffff\uffff\u0000\u017e"+
		"\u017f\u0005:\u0000\u0000\u017f\u0180\u0005=\u0000\u0000\u0180\u0181\u0003"+
		"2\u0019\u0000\u0181\u0182\u0006\u0014\uffff\uffff\u0000\u0182\u0191\u0005"+
		">\u0000\u0000\u0183\u0184\u0005\t\u0000\u0000\u0184\u0185\u0005\u0003"+
		"\u0000\u0000\u0185\u0186\u0006\u0014\uffff\uffff\u0000\u0186\u0187\u0005"+
		"9\u0000\u0000\u0187\u0188\u0003B!\u0000\u0188\u0189\u0006\u0014\uffff"+
		"\uffff\u0000\u0189\u018a\u0005:\u0000\u0000\u018a\u018b\u0005=\u0000\u0000"+
		"\u018b\u018c\u00032\u0019\u0000\u018c\u018d\u0006\u0014\uffff\uffff\u0000"+
		"\u018d\u018e\u0005>\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f"+
		"\u0183\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u019b\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005\t\u0000\u0000\u0195\u0196\u0006\u0014\uffff\uffff\u0000\u0196"+
		"\u0197\u0005=\u0000\u0000\u0197\u0198\u00032\u0019\u0000\u0198\u0199\u0006"+
		"\u0014\uffff\uffff\u0000\u0199\u019a\u0005>\u0000\u0000\u019a\u019c\u0001"+
		"\u0000\u0000\u0000\u019b\u0194\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c)\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0015"+
		"\u0000\u0000\u019e\u019f\u0006\u0015\uffff\uffff\u0000\u019f\u01a0\u0006"+
		"\u0015\uffff\uffff\u0000\u01a0\u01a1\u0005=\u0000\u0000\u01a1\u01a2\u0003"+
		",\u0016\u0000\u01a2\u01a3\u0006\u0015\uffff\uffff\u0000\u01a3\u01a4\u0005"+
		">\u0000\u0000\u01a4+\u0001\u0000\u0000\u0000\u01a5\u01a6\u0006\u0016\uffff"+
		"\uffff\u0000\u01a6\u01a7\u00032\u0019\u0000\u01a7\u01ad\u0006\u0016\uffff"+
		"\uffff\u0000\u01a8\u01a9\u0003.\u0017\u0000\u01a9\u01aa\u0006\u0016\uffff"+
		"\uffff\u0000\u01aa\u01ab\u00032\u0019\u0000\u01ab\u01ac\u0006\u0016\uffff"+
		"\uffff\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01a8\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae-\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0003B!\u0000\u01b0\u01b1\u0006\u0017\uffff\uffff\u0000"+
		"\u01b1\u01b2\u00058\u0000\u0000\u01b2\u01b3\u0003B!\u0000\u01b3\u01b9"+
		"\u0006\u0017\uffff\uffff\u0000\u01b4\u01b5\u0005-\u0000\u0000\u01b5\u01b6"+
		"\u0003B!\u0000\u01b6\u01b7\u0006\u0017\uffff\uffff\u0000\u01b7\u01b8\u0006"+
		"\u0017\uffff\uffff\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b4"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0006\u0017\uffff\uffff\u0000\u01be"+
		"\u01bf\u0005A\u0000\u0000\u01bf/\u0001\u0000\u0000\u0000\u01c0\u01c1\u0006"+
		"\u0018\uffff\uffff\u0000\u01c1\u01c2\u0005 \u0000\u0000\u01c2\u01c3\u0006"+
		"\u0018\uffff\uffff\u0000\u01c3\u01c4\u00059\u0000\u0000\u01c4\u01c5\u0005"+
		":\u0000\u0000\u01c5\u01c6\u0005=\u0000\u0000\u01c6\u01c7\u00032\u0019"+
		"\u0000\u01c7\u01c8\u0006\u0018\uffff\uffff\u0000\u01c8\u01c9\u0005>\u0000"+
		"\u0000\u01c91\u0001\u0000\u0000\u0000\u01ca\u01dc\u0006\u0019\uffff\uffff"+
		"\u0000\u01cb\u01cc\u0003 \u0010\u0000\u01cc\u01cd\u0006\u0019\uffff\uffff"+
		"\u0000\u01cd\u01db\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003&\u0013\u0000"+
		"\u01cf\u01d0\u0006\u0019\uffff\uffff\u0000\u01d0\u01db\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0003(\u0014\u0000\u01d2\u01d3\u0006\u0019\uffff\uffff"+
		"\u0000\u01d3\u01db\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003*\u0015\u0000"+
		"\u01d5\u01d6\u0006\u0019\uffff\uffff\u0000\u01d6\u01db\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u00034\u001a\u0000\u01d8\u01d9\u0006\u0019\uffff\uffff"+
		"\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01cb\u0001\u0000\u0000"+
		"\u0000\u01da\u01ce\u0001\u0000\u0000\u0000\u01da\u01d1\u0001\u0000\u0000"+
		"\u0000\u01da\u01d4\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01fb\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0010\u0000"+
		"\u0000\u01e0\u01e4\u0006\u0019\uffff\uffff\u0000\u01e1\u01e2\u0005\n\u0000"+
		"\u0000\u01e2\u01e4\u0006\u0019\uffff\uffff\u0000\u01e3\u01df\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0005A\u0000\u0000\u01e6\u01f8\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0003 \u0010\u0000\u01e8\u01e9\u0006\u0019\uffff\uffff"+
		"\u0000\u01e9\u01f7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003&\u0013\u0000"+
		"\u01eb\u01ec\u0006\u0019\uffff\uffff\u0000\u01ec\u01f7\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0003(\u0014\u0000\u01ee\u01ef\u0006\u0019\uffff\uffff"+
		"\u0000\u01ef\u01f7\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003*\u0015\u0000"+
		"\u01f1\u01f2\u0006\u0019\uffff\uffff\u0000\u01f2\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u00034\u001a\u0000\u01f4\u01f5\u0006\u0019\uffff\uffff"+
		"\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01e7\u0001\u0000\u0000"+
		"\u0000\u01f6\u01ea\u0001\u0000\u0000\u0000\u01f6\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f0\u0001\u0000\u0000\u0000\u01f6\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01e3\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc3\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u00036\u001b\u0000\u01fe\u01ff\u0006\u001a\uffff\uffff\u0000"+
		"\u01ff\u020a\u0001\u0000\u0000\u0000\u0200\u0201\u0003<\u001e\u0000\u0201"+
		"\u0202\u0006\u001a\uffff\uffff\u0000\u0202\u020a\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0003>\u001f\u0000\u0204\u0205\u0006\u001a\uffff\uffff\u0000"+
		"\u0205\u020a\u0001\u0000\u0000\u0000\u0206\u0207\u0003@ \u0000\u0207\u0208"+
		"\u0006\u001a\uffff\uffff\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209"+
		"\u01fd\u0001\u0000\u0000\u0000\u0209\u0200\u0001\u0000\u0000\u0000\u0209"+
		"\u0203\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000\u0000\u020a"+
		"5\u0001\u0000\u0000\u0000\u020b\u020c\u0006\u001b\uffff\uffff\u0000\u020c"+
		"\u021b\u0003\n\u0005\u0000\u020d\u0217\u00058\u0000\u0000\u020e\u020f"+
		"\u00038\u001c\u0000\u020f\u0210\u0006\u001b\uffff\uffff\u0000\u0210\u0218"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0003:\u001d\u0000\u0212\u0213\u0006"+
		"\u001b\uffff\uffff\u0000\u0213\u0218\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0003B!\u0000\u0215\u0216\u0006\u001b\uffff\uffff\u0000\u0216\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u020e\u0001\u0000\u0000\u0000\u0217\u0211\u0001"+
		"\u0000\u0000\u0000\u0217\u0214\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0006\u001b\uffff\uffff\u0000\u021a\u021c"+
		"\u0001\u0000\u0000\u0000\u021b\u020d\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0006\u001b\uffff\uffff\u0000\u021e\u021f\u0005A\u0000\u0000\u021f7\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0005#\u0000\u0000\u0221\u0222\u0005D\u0000"+
		"\u0000\u0222\u0223\u0006\u001c\uffff\uffff\u0000\u0223\u0227\u00059\u0000"+
		"\u0000\u0224\u0225\u0003B!\u0000\u0225\u0226\u0006\u001c\uffff\uffff\u0000"+
		"\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0224\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000"+
		"\u0229\u022a\u0005:\u0000\u0000\u022a9\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0005D\u0000\u0000\u022c\u022d\u0006\u001d\uffff\uffff\u0000\u022d\u0237"+
		"\u0005=\u0000\u0000\u022e\u022f\u0005D\u0000\u0000\u022f\u0230\u0006\u001d"+
		"\uffff\uffff\u0000\u0230\u0231\u0005B\u0000\u0000\u0231\u0232\u0003B!"+
		"\u0000\u0232\u0233\u0006\u001d\uffff\uffff\u0000\u0233\u0234\u0005?\u0000"+
		"\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u022e\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023b\u0005D\u0000\u0000"+
		"\u023b\u023c\u0006\u001d\uffff\uffff\u0000\u023c\u023d\u0005B\u0000\u0000"+
		"\u023d\u023e\u0003B!\u0000\u023e\u023f\u0006\u001d\uffff\uffff\u0000\u023f"+
		"\u0240\u0005>\u0000\u0000\u0240;\u0001\u0000\u0000\u0000\u0241\u0248\u0006"+
		"\u001e\uffff\uffff\u0000\u0242\u0243\u0005D\u0000\u0000\u0243\u0249\u0006"+
		"\u001e\uffff\uffff\u0000\u0244\u0245\u0005\u0007\u0000\u0000\u0245\u0246"+
		"\u0005@\u0000\u0000\u0246\u0247\u0005D\u0000\u0000\u0247\u0249\u0006\u001e"+
		"\uffff\uffff\u0000\u0248\u0242\u0001\u0000\u0000\u0000\u0248\u0244\u0001"+
		"\u0000\u0000\u0000\u0249\u024f\u0001\u0000\u0000\u0000\u024a\u024b\u0005"+
		"@\u0000\u0000\u024b\u024c\u0005D\u0000\u0000\u024c\u024e\u0006\u001e\uffff"+
		"\uffff\u0000\u024d\u024a\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0252\u0254\u0003\f\u0006\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000"+
		"\u0000\u0255\u0257\u00058\u0000\u0000\u0256\u0258\u0005#\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0003B!\u0000\u025a\u025b\u0006"+
		"\u001e\uffff\uffff\u0000\u025b\u025c\u0005A\u0000\u0000\u025c\u025d\u0006"+
		"\u001e\uffff\uffff\u0000\u025d=\u0001\u0000\u0000\u0000\u025e\u025f\u0003"+
		"B!\u0000\u025f\u0260\u0006\u001f\uffff\uffff\u0000\u0260\u0261\u0005A"+
		"\u0000\u0000\u0261?\u0001\u0000\u0000\u0000\u0262\u026a\u0006 \uffff\uffff"+
		"\u0000\u0263\u0264\u0005D\u0000\u0000\u0264\u0268\u0006 \uffff\uffff\u0000"+
		"\u0265\u0266\u0005\u0007\u0000\u0000\u0266\u0268\u0006 \uffff\uffff\u0000"+
		"\u0267\u0263\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026b\u0005@\u0000\u0000\u026a"+
		"\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005D\u0000\u0000\u026d\u026e"+
		"\u0006 \uffff\uffff\u0000\u026e\u026f\u0006 \uffff\uffff\u0000\u026f\u0273"+
		"\u00059\u0000\u0000\u0270\u0271\u0003B!\u0000\u0271\u0272\u0006 \uffff"+
		"\uffff\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0270\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0005:\u0000\u0000\u0276\u0277\u0005\u0005\u0000"+
		"\u0000\u0277\u0278\u00059\u0000\u0000\u0278\u0279\u0003\u001a\r\u0000"+
		"\u0279\u027a\u0006 \uffff\uffff\u0000\u027a\u027b\u0005:\u0000\u0000\u027b"+
		"\u027c\u0005A\u0000\u0000\u027cA\u0001\u0000\u0000\u0000\u027d\u0287\u0006"+
		"!\uffff\uffff\u0000\u027e\u027f\u0003D\"\u0000\u027f\u0280\u0006!\uffff"+
		"\uffff\u0000\u0280\u0288\u0001\u0000\u0000\u0000\u0281\u0282\u0003D\""+
		"\u0000\u0282\u0283\u0006!\uffff\uffff\u0000\u0283\u0284\u0005?\u0000\u0000"+
		"\u0284\u0285\u0003B!\u0000\u0285\u0286\u0006!\uffff\uffff\u0000\u0286"+
		"\u0288\u0001\u0000\u0000\u0000\u0287\u027e\u0001\u0000\u0000\u0000\u0287"+
		"\u0281\u0001\u0000\u0000\u0000\u0288C\u0001\u0000\u0000\u0000\u0289\u0293"+
		"\u0006\"\uffff\uffff\u0000\u028a\u028b\u0003F#\u0000\u028b\u028c\u0006"+
		"\"\uffff\uffff\u0000\u028c\u0294\u0001\u0000\u0000\u0000\u028d\u028e\u0003"+
		"F#\u0000\u028e\u028f\u0006\"\uffff\uffff\u0000\u028f\u0290\u00053\u0000"+
		"\u0000\u0290\u0291\u0003D\"\u0000\u0291\u0292\u0006\"\uffff\uffff\u0000"+
		"\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u028a\u0001\u0000\u0000\u0000"+
		"\u0293\u028d\u0001\u0000\u0000\u0000\u0294E\u0001\u0000\u0000\u0000\u0295"+
		"\u029f\u0006#\uffff\uffff\u0000\u0296\u0297\u0003H$\u0000\u0297\u0298"+
		"\u0006#\uffff\uffff\u0000\u0298\u02a0\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0003H$\u0000\u029a\u029b\u0006#\uffff\uffff\u0000\u029b\u029c\u0005"+
		"2\u0000\u0000\u029c\u029d\u0003F#\u0000\u029d\u029e\u0006#\uffff\uffff"+
		"\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u0296\u0001\u0000\u0000"+
		"\u0000\u029f\u0299\u0001\u0000\u0000\u0000\u02a0G\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0006$\uffff\uffff\u0000\u02a2\u02a3\u0003L&\u0000\u02a3"+
		"\u02a4\u0006$\uffff\uffff\u0000\u02a4\u02a5\u0003J%\u0000\u02a5\u02a6"+
		"\u0006$\uffff\uffff\u0000\u02a6I\u0001\u0000\u0000\u0000\u02a7\u02ae\u0006"+
		"%\uffff\uffff\u0000\u02a8\u02a9\u0007\u0002\u0000\u0000\u02a9\u02aa\u0003"+
		"L&\u0000\u02aa\u02ab\u0006%\uffff\uffff\u0000\u02ab\u02ac\u0003J%\u0000"+
		"\u02ac\u02ad\u0006%\uffff\uffff\u0000\u02ad\u02af\u0001\u0000\u0000\u0000"+
		"\u02ae\u02a8\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000"+
		"\u02afK\u0001\u0000\u0000\u0000\u02b0\u02b1\u0006&\uffff\uffff\u0000\u02b1"+
		"\u02b2\u0003P(\u0000\u02b2\u02b3\u0006&\uffff\uffff\u0000\u02b3\u02b4"+
		"\u0003N\'\u0000\u02b4\u02b5\u0006&\uffff\uffff\u0000\u02b5M\u0001\u0000"+
		"\u0000\u0000\u02b6\u02bd\u0006\'\uffff\uffff\u0000\u02b7\u02b8\u0007\u0003"+
		"\u0000\u0000\u02b8\u02b9\u0003P(\u0000\u02b9\u02ba\u0006\'\uffff\uffff"+
		"\u0000\u02ba\u02bb\u0003N\'\u0000\u02bb\u02bc\u0006\'\uffff\uffff\u0000"+
		"\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0001\u0000\u0000\u0000\u02beO\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0006(\uffff\uffff\u0000\u02c0\u02c1\u0003T*\u0000\u02c1\u02c2"+
		"\u0006(\uffff\uffff\u0000\u02c2\u02c3\u0003R)\u0000\u02c3\u02c4\u0006"+
		"(\uffff\uffff\u0000\u02c4Q\u0001\u0000\u0000\u0000\u02c5\u02cc\u0006)"+
		"\uffff\uffff\u0000\u02c6\u02c7\u0007\u0004\u0000\u0000\u02c7\u02c8\u0003"+
		"T*\u0000\u02c8\u02c9\u0006)\uffff\uffff\u0000\u02c9\u02ca\u0003R)\u0000"+
		"\u02ca\u02cb\u0006)\uffff\uffff\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cc\u02c6\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cdS\u0001\u0000\u0000\u0000\u02ce\u02cf\u0006*\uffff\uffff\u0000\u02cf"+
		"\u02d0\u0003X,\u0000\u02d0\u02d1\u0006*\uffff\uffff\u0000\u02d1\u02d2"+
		"\u0003V+\u0000\u02d2\u02d3\u0006*\uffff\uffff\u0000\u02d3U\u0001\u0000"+
		"\u0000\u0000\u02d4\u02db\u0006+\uffff\uffff\u0000\u02d5\u02d6\u0007\u0005"+
		"\u0000\u0000\u02d6\u02d7\u0003X,\u0000\u02d7\u02d8\u0006+\uffff\uffff"+
		"\u0000\u02d8\u02d9\u0003V+\u0000\u02d9\u02da\u0006+\uffff\uffff\u0000"+
		"\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02d5\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0001\u0000\u0000\u0000\u02dcW\u0001\u0000\u0000\u0000\u02dd"+
		"\u02e5\u0006,\uffff\uffff\u0000\u02de\u02df\u0003Z-\u0000\u02df\u02e0"+
		"\u0006,\uffff\uffff\u0000\u02e0\u02e6\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0007\u0006\u0000\u0000\u02e2\u02e3\u0003X,\u0000\u02e3\u02e4\u0006,"+
		"\uffff\uffff\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02de\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e1\u0001\u0000\u0000\u0000\u02e6Y\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0006-\uffff\uffff\u0000\u02e8\u02e9\u0003^/"+
		"\u0000\u02e9\u02ea\u0006-\uffff\uffff\u0000\u02ea\u02eb\u0003\\.\u0000"+
		"\u02eb\u02ec\u0006-\uffff\uffff\u0000\u02ec[\u0001\u0000\u0000\u0000\u02ed"+
		"\u02f2\u0006.\uffff\uffff\u0000\u02ee\u02ef\u0007\u0007\u0000\u0000\u02ef"+
		"\u02f0\u0003\\.\u0000\u02f0\u02f1\u0006.\uffff\uffff\u0000\u02f1\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f2\u02ee\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f3]\u0001\u0000\u0000\u0000\u02f4\u02fd\u0006"+
		"/\uffff\uffff\u0000\u02f5\u02f6\u0003`0\u0000\u02f6\u02f7\u0006/\uffff"+
		"\uffff\u0000\u02f7\u02fe\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005;\u0000"+
		"\u0000\u02f9\u02fa\u0003B!\u0000\u02fa\u02fb\u0006/\uffff\uffff\u0000"+
		"\u02fb\u02fc\u0005<\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd"+
		"\u02f5\u0001\u0000\u0000\u0000\u02fd\u02f8\u0001\u0000\u0000\u0000\u02fe"+
		"_\u0001\u0000\u0000\u0000\u02ff\u0309\u00060\uffff\uffff\u0000\u0300\u0301"+
		"\u0003b1\u0000\u0301\u0302\u00060\uffff\uffff\u0000\u0302\u030a\u0001"+
		"\u0000\u0000\u0000\u0303\u0304\u0003b1\u0000\u0304\u0305\u00060\uffff"+
		"\uffff\u0000\u0305\u0306\u0005@\u0000\u0000\u0306\u0307\u0003`0\u0000"+
		"\u0307\u0308\u00060\uffff\uffff\u0000\u0308\u030a\u0001\u0000\u0000\u0000"+
		"\u0309\u0300\u0001\u0000\u0000\u0000\u0309\u0303\u0001\u0000\u0000\u0000"+
		"\u030aa\u0001\u0000\u0000\u0000\u030b\u0314\u00061\uffff\uffff\u0000\u030c"+
		"\u030d\u0003d2\u0000\u030d\u030e\u00061\uffff\uffff\u0000\u030e\u0315"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u00059\u0000\u0000\u0310\u0311\u0003"+
		"B!\u0000\u0311\u0312\u00061\uffff\uffff\u0000\u0312\u0313\u0005:\u0000"+
		"\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u030c\u0001\u0000\u0000"+
		"\u0000\u0314\u030f\u0001\u0000\u0000\u0000\u0315c\u0001\u0000\u0000\u0000"+
		"\u0316\u0321\u00062\uffff\uffff\u0000\u0317\u0322\u0003j5\u0000\u0318"+
		"\u0319\u0003h4\u0000\u0319\u031a\u00062\uffff\uffff\u0000\u031a\u0322"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0003f3\u0000\u031c\u031d\u00062"+
		"\uffff\uffff\u0000\u031d\u0322\u0001\u0000\u0000\u0000\u031e\u031f\u0005"+
		"D\u0000\u0000\u031f\u0322\u00062\uffff\uffff\u0000\u0320\u0322\u0005\u0007"+
		"\u0000\u0000\u0321\u0317\u0001\u0000\u0000\u0000\u0321\u0318\u0001\u0000"+
		"\u0000\u0000\u0321\u031b\u0001\u0000\u0000\u0000\u0321\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322e\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u00063\uffff\uffff\u0000\u0324\u0325\u0005D\u0000\u0000"+
		"\u0325\u0326\u00063\uffff\uffff\u0000\u0326\u0327\u0005B\u0000\u0000\u0327"+
		"\u0328\u0005B\u0000\u0000\u0328\u0329\u0005D\u0000\u0000\u0329\u032a\u0006"+
		"3\uffff\uffff\u0000\u032ag\u0001\u0000\u0000\u0000\u032b\u033e\u00064"+
		"\uffff\uffff\u0000\u032c\u032d\u0005!\u0000\u0000\u032d\u033f\u00064\uffff"+
		"\uffff\u0000\u032e\u032f\u0005\u0018\u0000\u0000\u032f\u033f\u00064\uffff"+
		"\uffff\u0000\u0330\u0331\u0005\u0017\u0000\u0000\u0331\u033f\u00064\uffff"+
		"\uffff\u0000\u0332\u0333\u0005\"\u0000\u0000\u0333\u033f\u00064\uffff"+
		"\uffff\u0000\u0334\u0335\u0005\u001f\u0000\u0000\u0335\u033f\u00064\uffff"+
		"\uffff\u0000\u0336\u0337\u0005\u001e\u0000\u0000\u0337\u033f\u00064\uffff"+
		"\uffff\u0000\u0338\u0339\u0005\u001d\u0000\u0000\u0339\u033f\u00064\uffff"+
		"\uffff\u0000\u033a\u033b\u0005\u0019\u0000\u0000\u033b\u033f\u00064\uffff"+
		"\uffff\u0000\u033c\u033d\u0005D\u0000\u0000\u033d\u033f\u00064\uffff\uffff"+
		"\u0000\u033e\u032c\u0001\u0000\u0000\u0000\u033e\u032e\u0001\u0000\u0000"+
		"\u0000\u033e\u0330\u0001\u0000\u0000\u0000\u033e\u0332\u0001\u0000\u0000"+
		"\u0000\u033e\u0334\u0001\u0000\u0000\u0000\u033e\u0336\u0001\u0000\u0000"+
		"\u0000\u033e\u0338\u0001\u0000\u0000\u0000\u033e\u033a\u0001\u0000\u0000"+
		"\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000"+
		"\u0000\u0340\u0344\u00059\u0000\u0000\u0341\u0342\u0003B!\u0000\u0342"+
		"\u0343\u00064\uffff\uffff\u0000\u0343\u0345\u0001\u0000\u0000\u0000\u0344"+
		"\u0341\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345"+
		"\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u0005:\u0000\u0000\u0347i\u0001"+
		"\u0000\u0000\u0000\u0348\u0349\u0007\b\u0000\u0000\u0349k\u0001\u0000"+
		"\u0000\u0000;su\u0085\u0092\u0098\u009d\u00a4\u00b2\u00c3\u00c9\u00d2"+
		"\u00dc\u00f0\u00fd\u0102\u010b\u011c\u0128\u0141\u0156\u0161\u0168\u0191"+
		"\u019b\u01ad\u01bb\u01da\u01dc\u01e3\u01f6\u01f8\u01fb\u0209\u0217\u021b"+
		"\u0227\u0237\u0248\u024f\u0253\u0257\u0267\u026a\u0273\u0287\u0293\u029f"+
		"\u02ae\u02bd\u02cc\u02db\u02e5\u02f2\u02fd\u0309\u0314\u0321\u033e\u0344";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}