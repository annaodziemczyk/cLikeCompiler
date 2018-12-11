// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, NEWLINE=31, 
		WS=32, ML_COMMENT=33, COMMENT=34, INT_CONSTANT=35, REAL_CONSTANT=36, CHAR_CONSTANT=37, 
		OP_ADD_SUB=38, OP_DIV_MUL=39, OP_LOG=40, OP_NEG=41, OP_COMP=42, MAIN_FUNC=43, 
		RETURN_CONSTANT=44, BLOCK_START=45, ID=46;
	public static final int
		RULE_program = 0, RULE_varDefinition = 1, RULE_functionDefinition = 2, 
		RULE_varDefinitions = 3, RULE_arrayType = 4, RULE_functionDefinitions = 5, 
		RULE_functionType = 6, RULE_type = 7, RULE_statements = 8, RULE_statement = 9, 
		RULE_ifElseStatement = 10, RULE_statementBlockOrStatement = 11, RULE_statementBlock = 12, 
		RULE_expressions = 13, RULE_expression = 14;
	public static final String[] ruleNames = {
		"program", "varDefinition", "functionDefinition", "varDefinitions", "arrayType", 
		"functionDefinitions", "functionType", "type", "statements", "statement", 
		"ifElseStatement", "statementBlockOrStatement", "statementBlock", "expressions", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'('", "')'", "','", "';'", "'['", "']'", "'int'", "'double'", 
		"'char'", "'='", "'write'", "'read'", "'while'", "'if'", "'else'", "'}'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'!='", 
		"'=='", "'&&'", "'||'", null, null, null, null, null, null, null, null, 
		null, null, "'!'", null, "'main'", "'return'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "NEWLINE", "WS", "ML_COMMENT", 
		"COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "OP_ADD_SUB", 
		"OP_DIV_MUL", "OP_LOG", "OP_NEG", "OP_COMP", "MAIN_FUNC", "RETURN_CONSTANT", 
		"BLOCK_START", "ID"
	};
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(30);
						varDefinition();
						}
						break;
					case 2:
						{
						setState(31);
						functionDefinition();
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			{
			setState(37);
			match(T__0);
			setState(38);
			match(MAIN_FUNC);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			statementBlock();
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(43);
					varDefinition();
					}
					break;
				case 2:
					{
					setState(44);
					functionDefinition();
					}
					break;
				}
				}
				setState(49);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public VarDefinition ast;
		public TypeContext type;
		public Token ID;
		public ArrayTypeContext arrayType;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDefinition);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((VarDefinitionContext)_localctx).type = type();
				setState(51);
				((VarDefinitionContext)_localctx).ID = match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(52);
					match(T__3);
					setState(53);
					((VarDefinitionContext)_localctx).ID = match(ID);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__4);
				 ((VarDefinitionContext)_localctx).ast = new VarDefinition(((VarDefinitionContext)_localctx).ID.getLine(), ((VarDefinitionContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).ID!=null?((VarDefinitionContext)_localctx).ID.getText():null), ((VarDefinitionContext)_localctx).type.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((VarDefinitionContext)_localctx).arrayType = arrayType();
				setState(63);
				((VarDefinitionContext)_localctx).ID = match(ID);
				setState(64);
				match(T__4);
				 ((VarDefinitionContext)_localctx).ast = new VarDefinition(((VarDefinitionContext)_localctx).ID.getLine(), ((VarDefinitionContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).ID!=null?((VarDefinitionContext)_localctx).ID.getText():null), ((VarDefinitionContext)_localctx).arrayType.ast); 
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			functionType();
			setState(70);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public TypeContext type;
		public Token ID;
		public ArrayTypeContext arrayType;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<ArrayTypeContext> arrayType() {
			return getRuleContexts(ArrayTypeContext.class);
		}
		public ArrayTypeContext arrayType(int i) {
			return getRuleContext(ArrayTypeContext.class,i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(72);
					((VarDefinitionsContext)_localctx).type = type();
					setState(73);
					((VarDefinitionsContext)_localctx).ID = match(ID);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(74);
						match(T__3);
						setState(75);
						((VarDefinitionsContext)_localctx).ID = match(ID);
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(81);
					match(T__4);
					 _localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).ID.getLine(), ((VarDefinitionsContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionsContext)_localctx).ID!=null?((VarDefinitionsContext)_localctx).ID.getText():null), ((VarDefinitionsContext)_localctx).type.ast)); 
					}
					break;
				case 2:
					{
					setState(84);
					((VarDefinitionsContext)_localctx).arrayType = arrayType();
					setState(85);
					((VarDefinitionsContext)_localctx).ID = match(ID);
					setState(86);
					match(T__4);
					 _localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).ID.getLine(), ((VarDefinitionsContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionsContext)_localctx).ID!=null?((VarDefinitionsContext)_localctx).ID.getText():null), ((VarDefinitionsContext)_localctx).arrayType.ast)); 
					}
					break;
				}
				}
				setState(93);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayType ast;
		public TypeContext type;
		public Token num1;
		public Token num2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((ArrayTypeContext)_localctx).type = type();
			setState(95);
			match(T__5);
			setState(96);
			((ArrayTypeContext)_localctx).num1 = match(INT_CONSTANT);
			setState(97);
			match(T__6);
			 ((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).type.ast.getLine(), ((ArrayTypeContext)_localctx).type.ast.getColumn(), ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)));
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(99);
				match(T__5);
				setState(100);
				((ArrayTypeContext)_localctx).num2 = match(INT_CONSTANT);
				setState(101);
				match(T__6);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).type.ast.getLine(), ((ArrayTypeContext)_localctx).type.ast.getColumn(), ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)), LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num2!=null?((ArrayTypeContext)_localctx).num2.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionsContext extends ParserRuleContext {
		public List<FunctionDefinition> ast = new ArrayList<FunctionDefinition>();
		public FunctionDefinitionContext functionDefinition;
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitions; }
	}

	public final FunctionDefinitionsContext functionDefinitions() throws RecognitionException {
		FunctionDefinitionsContext _localctx = new FunctionDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(109);
				((FunctionDefinitionsContext)_localctx).functionDefinition = functionDefinition();
				 _localctx.ast.add(((FunctionDefinitionsContext)_localctx).functionDefinition.ast); 
				}
				}
				setState(116);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionType ast;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionType);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__0);
				setState(118);
				match(ID);
				setState(119);
				match(T__1);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					{
					setState(120);
					type();
					setState(121);
					match(ID);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(122);
						match(T__3);
						setState(123);
						type();
						setState(124);
						match(ID);
						}
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__2);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				type();
				setState(138);
				match(ID);
				setState(139);
				match(T__1);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					{
					setState(140);
					type();
					setState(141);
					match(ID);
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(142);
						match(T__3);
						setState(143);
						type();
						setState(144);
						match(ID);
						}
						}
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__7);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__8);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__9);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
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

	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(168);
				((StatementsContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				}
				setState(175);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext expression;
		public StatementBlockContext statementBlock;
		public IfElseStatementContext ifElseStatement;
		public Token RETURN_CONSTANT;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public TerminalNode RETURN_CONSTANT() { return getToken(CmmParser.RETURN_CONSTANT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((StatementContext)_localctx).e1 = expression(0);
				setState(177);
				match(T__10);
				setState(178);
				((StatementContext)_localctx).e2 = expression(0);
				setState(179);
				match(T__4);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__11);
				setState(183);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Write((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__12);
				setState(187);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Read((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(T__13);
				setState(191);
				match(T__1);
				setState(192);
				((StatementContext)_localctx).expression = expression(0);
				setState(193);
				match(T__2);
				setState(194);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case RETURN_CONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(201);
				((StatementContext)_localctx).expression = expression(0);
				setState(202);
				match(T__4);
				 ((StatementContext)_localctx).ast =  new ReturnStatement(((StatementContext)_localctx).RETURN_CONSTANT.getLine(),
				                                                      																						((StatementContext)_localctx).RETURN_CONSTANT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast);
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

	public static class IfElseStatementContext extends ParserRuleContext {
		public IfElseStatement ast;
		public ExpressionContext condition;
		public StatementBlockOrStatementContext ifBody;
		public StatementBlockOrStatementContext elseBody;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementBlockOrStatementContext> statementBlockOrStatement() {
			return getRuleContexts(StatementBlockOrStatementContext.class);
		}
		public StatementBlockOrStatementContext statementBlockOrStatement(int i) {
			return getRuleContext(StatementBlockOrStatementContext.class,i);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__14);
			setState(208);
			match(T__1);
			setState(209);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(210);
			match(T__2);
			setState(211);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(T__15);
					setState(213);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast, ((IfElseStatementContext)_localctx).elseBody.ast );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockOrStatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList();
		public StatementBlockContext statementBlock;
		public StatementContext statement;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementBlockOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlockOrStatement; }
	}

	public final StatementBlockOrStatementContext statementBlockOrStatement() throws RecognitionException {
		StatementBlockOrStatementContext _localctx = new StatementBlockOrStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlockOrStatement);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((StatementBlockOrStatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementBlockOrStatementContext)_localctx).ast =  ((StatementBlockOrStatementContext)_localctx).statementBlock.ast;
				}
				break;
			case T__1:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case RETURN_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((StatementBlockOrStatementContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementBlockOrStatementContext)_localctx).statement.ast);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList();
		public StatementsContext stmts;
		public TerminalNode BLOCK_START() { return getToken(CmmParser.BLOCK_START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(BLOCK_START);
			setState(230);
			((StatementBlockContext)_localctx).stmts = statements();
			setState(231);
			match(T__16);
			((StatementBlockContext)_localctx).ast =  ((StatementBlockContext)_localctx).stmts.ast;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
				{
				setState(234);
				((ExpressionsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(236);
					match(T__3);
					setState(237);
					((ExpressionsContext)_localctx).e2 = expression(0);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.ast.add(((ExpressionsContext)_localctx).e2.ast);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public ExpressionsContext expressions;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public TypeContext type;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(248);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(249);
				match(T__1);
				setState(250);
				((ExpressionContext)_localctx).expressions = expressions();
				setState(251);
				match(T__2);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expressions.ast);
				}
				break;
			case 2:
				{
				setState(254);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(256);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(258);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(260);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(262);
				match(T__1);
				setState(263);
				((ExpressionContext)_localctx).type = type();
				setState(264);
				match(T__2);
				setState(265);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(268);
				match(T__1);
				setState(269);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(270);
				match(T__2);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(273);
				match(OP_NEG);
				setState(274);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(280);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((ExpressionContext)_localctx).e2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						((ExpressionContext)_localctx).e2 = expression(5);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(290);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						((ExpressionContext)_localctx).e2 = expression(4);
						 ((ExpressionContext)_localctx).ast =  new Comparision((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0133\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13"+
		"\2\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3F\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\7\7s\n\7"+
		"\f\7\16\7v\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b"+
		"\16\b\u0084\13\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\7\b\u009a\n\b\f"+
		"\b\16\b\u009d\13\b\3\b\3\b\5\b\u00a1\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9"+
		"\n\t\3\n\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\7\17\u00f1\n\17\f\17\16\17\u00f4\13\17\3\17\3\17\5\17\u00f8"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0118\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012e"+
		"\n\20\f\20\16\20\u0131\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\6\3\2\24\26\3\2\27\30\3\2\31\36\3\2\37 \2\u014a\2$\3\2"+
		"\2\2\4E\3\2\2\2\6G\3\2\2\2\b]\3\2\2\2\n`\3\2\2\2\ft\3\2\2\2\16\u00a0\3"+
		"\2\2\2\20\u00a8\3\2\2\2\22\u00af\3\2\2\2\24\u00cf\3\2\2\2\26\u00d1\3\2"+
		"\2\2\30\u00e5\3\2\2\2\32\u00e7\3\2\2\2\34\u00f7\3\2\2\2\36\u0117\3\2\2"+
		"\2 #\5\4\3\2!#\5\6\4\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3"+
		"\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\3\2\2()\7-\2\2)*\7\4\2\2*+\7\5\2\2+,"+
		"\5\32\16\2,\61\3\2\2\2-\60\5\4\3\2.\60\5\6\4\2/-\3\2\2\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65"+
		"\5\20\t\2\65:\7\60\2\2\66\67\7\6\2\2\679\7\60\2\28\66\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\7\2\2>?\b\3\1\2?F\3\2\2"+
		"\2@A\5\n\6\2AB\7\60\2\2BC\7\7\2\2CD\b\3\1\2DF\3\2\2\2E\64\3\2\2\2E@\3"+
		"\2\2\2F\5\3\2\2\2GH\5\16\b\2HI\5\32\16\2I\7\3\2\2\2JK\5\20\t\2KP\7\60"+
		"\2\2LM\7\6\2\2MO\7\60\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3"+
		"\2\2\2RP\3\2\2\2ST\7\7\2\2TU\b\5\1\2U\\\3\2\2\2VW\5\n\6\2WX\7\60\2\2X"+
		"Y\7\7\2\2YZ\b\5\1\2Z\\\3\2\2\2[J\3\2\2\2[V\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\5\20\t\2ab\7\b\2\2bc\7%\2\2cd\7\t"+
		"\2\2dj\b\6\1\2ef\7\b\2\2fg\7%\2\2gi\7\t\2\2he\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\b\6\1\2n\13\3\2\2\2op\5\6\4\2pq\b"+
		"\7\1\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt"+
		"\3\2\2\2wx\7\3\2\2xy\7\60\2\2y\u0087\7\4\2\2z{\5\20\t\2{\u0082\7\60\2"+
		"\2|}\7\6\2\2}~\5\20\t\2~\177\7\60\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085z\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u00a1\7\5\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7\60\2\2\u008d"+
		"\u009b\7\4\2\2\u008e\u008f\5\20\t\2\u008f\u0096\7\60\2\2\u0090\u0091\7"+
		"\6\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\60\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0090\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008e\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"w\3\2\2\2\u00a0\u008b\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3"+
		"\u00a9\b\t\1\2\u00a4\u00a5\7\13\2\2\u00a5\u00a9\b\t\1\2\u00a6\u00a7\7"+
		"\f\2\2\u00a7\u00a9\b\t\1\2\u00a8\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\b\n"+
		"\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\5\36\20\2\u00b5"+
		"\u00b6\7\7\2\2\u00b6\u00b7\b\13\1\2\u00b7\u00d0\3\2\2\2\u00b8\u00b9\7"+
		"\16\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\b\13\1\2\u00bb\u00d0\3\2\2\2"+
		"\u00bc\u00bd\7\17\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\b\13\1\2\u00bf"+
		"\u00d0\3\2\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00c3\5"+
		"\36\20\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\b\13\1"+
		"\2\u00c6\u00d0\3\2\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\b\13\1\2\u00c9"+
		"\u00d0\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\7"+
		"\7\2\2\u00cd\u00ce\b\13\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00b2\3\2\2\2\u00cf"+
		"\u00b8\3\2\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3"+
		"\7\4\2\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\5\2\2\u00d5\u00da\5\30\r"+
		"\2\u00d6\u00d7\7\22\2\2\u00d7\u00d9\5\30\r\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\f\1\2\u00de\27\3\2\2\2\u00df\u00e0"+
		"\5\32\16\2\u00e0\u00e1\b\r\1\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\5\24\13"+
		"\2\u00e3\u00e4\b\r\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\5\22\n\2\u00e9"+
		"\u00ea\7\23\2\2\u00ea\u00eb\b\16\1\2\u00eb\33\3\2\2\2\u00ec\u00ed\5\36"+
		"\20\2\u00ed\u00f2\b\17\1\2\u00ee\u00ef\7\6\2\2\u00ef\u00f1\5\36\20\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\b\17\1\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\35\3\2\2"+
		"\2\u00f9\u00fa\b\20\1\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7\4\2\2\u00fc"+
		"\u00fd\5\34\17\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\b\20\1\2\u00ff\u0118"+
		"\3\2\2\2\u0100\u0101\7\60\2\2\u0101\u0118\b\20\1\2\u0102\u0103\7%\2\2"+
		"\u0103\u0118\b\20\1\2\u0104\u0105\7&\2\2\u0105\u0118\b\20\1\2\u0106\u0107"+
		"\7\'\2\2\u0107\u0118\b\20\1\2\u0108\u0109\7\4\2\2\u0109\u010a\5\20\t\2"+
		"\u010a\u010b\7\5\2\2\u010b\u010c\5\36\20\t\u010c\u010d\b\20\1\2\u010d"+
		"\u0118\3\2\2\2\u010e\u010f\7\4\2\2\u010f\u0110\5\36\20\2\u0110\u0111\7"+
		"\5\2\2\u0111\u0112\b\20\1\2\u0112\u0118\3\2\2\2\u0113\u0114\7+\2\2\u0114"+
		"\u0115\5\36\20\3\u0115\u0116\b\20\1\2\u0116\u0118\3\2\2\2\u0117\u00f9"+
		"\3\2\2\2\u0117\u0100\3\2\2\2\u0117\u0102\3\2\2\2\u0117\u0104\3\2\2\2\u0117"+
		"\u0106\3\2\2\2\u0117\u0108\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u0113\3\2"+
		"\2\2\u0118\u012f\3\2\2\2\u0119\u011a\f\7\2\2\u011a\u011b\t\2\2\2\u011b"+
		"\u011c\5\36\20\b\u011c\u011d\b\20\1\2\u011d\u012e\3\2\2\2\u011e\u011f"+
		"\f\6\2\2\u011f\u0120\t\3\2\2\u0120\u0121\5\36\20\7\u0121\u0122\b\20\1"+
		"\2\u0122\u012e\3\2\2\2\u0123\u0124\f\5\2\2\u0124\u0125\t\4\2\2\u0125\u0126"+
		"\5\36\20\6\u0126\u0127\b\20\1\2\u0127\u012e\3\2\2\2\u0128\u0129\f\4\2"+
		"\2\u0129\u012a\t\5\2\2\u012a\u012b\5\36\20\5\u012b\u012c\b\20\1\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0119\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0123\3\2"+
		"\2\2\u012d\u0128\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\37\3\2\2\2\u0131\u012f\3\2\2\2\34\"$/\61:EP[]jt\u0082"+
		"\u0087\u0096\u009b\u00a0\u00a8\u00af\u00cf\u00da\u00e5\u00f2\u00f7\u0117"+
		"\u012d\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}