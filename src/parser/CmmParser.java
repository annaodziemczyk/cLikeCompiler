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
		RULE_program = 0, RULE_varDefinitions = 1, RULE_arrayType = 2, RULE_functionDefinitions = 3, 
		RULE_functionDefinition = 4, RULE_functionType = 5, RULE_type = 6, RULE_statements = 7, 
		RULE_statement = 8, RULE_ifElseStatement = 9, RULE_statementBlockOrStatement = 10, 
		RULE_statementBlock = 11, RULE_expressions = 12, RULE_expression = 13;
	public static final String[] ruleNames = {
		"program", "varDefinitions", "arrayType", "functionDefinitions", "functionDefinition", 
		"functionType", "type", "statements", "statement", "ifElseStatement", 
		"statementBlockOrStatement", "statementBlock", "expressions", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'['", "']'", "'void'", "'('", "')'", "'int'", "'double'", 
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
		public VarDefinitionsContext varDefinitions;
		public FunctionDefinitionsContext functionDefinitions;
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
		}
		public List<FunctionDefinitionsContext> functionDefinitions() {
			return getRuleContexts(FunctionDefinitionsContext.class);
		}
		public FunctionDefinitionsContext functionDefinitions(int i) {
			return getRuleContext(FunctionDefinitionsContext.class,i);
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(28);
						((ProgramContext)_localctx).varDefinitions = varDefinitions();
						}
						} 
					}
					setState(33);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					((ProgramContext)_localctx).functionDefinitions = functionDefinitions();
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
				}
				}
				break;
			case 2:
				{
				{
				setState(40); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(39);
						((ProgramContext)_localctx).functionDefinitions = functionDefinitions();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(42); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					{
					setState(44);
					((ProgramContext)_localctx).varDefinitions = varDefinitions();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			 ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).functionDefinitions!=null?(((ProgramContext)_localctx).functionDefinitions.start):null).getLine(), (((ProgramContext)_localctx).functionDefinitions!=null?(((ProgramContext)_localctx).functionDefinitions.start):null).getCharPositionInLine()+1,    
			     	                 					         								((ProgramContext)_localctx).varDefinitions.ast, ((ProgramContext)_localctx).functionDefinitions.ast); 
			}
		}
		catch (RecognitionException re) {
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
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDefinitions);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((VarDefinitionsContext)_localctx).type = type();
				setState(55);
				((VarDefinitionsContext)_localctx).ID = match(ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(56);
					match(T__0);
					setState(57);
					((VarDefinitionsContext)_localctx).ID = match(ID);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__1);
				 _localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).ID.getLine(), ((VarDefinitionsContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionsContext)_localctx).ID!=null?((VarDefinitionsContext)_localctx).ID.getText():null), ((VarDefinitionsContext)_localctx).type.ast)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((VarDefinitionsContext)_localctx).arrayType = arrayType();
				setState(67);
				((VarDefinitionsContext)_localctx).ID = match(ID);
				setState(68);
				match(T__1);
				 _localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).ID.getLine(), ((VarDefinitionsContext)_localctx).ID.getCharPositionInLine()+1, (((VarDefinitionsContext)_localctx).ID!=null?((VarDefinitionsContext)_localctx).ID.getText():null), ((VarDefinitionsContext)_localctx).arrayType.ast)); 
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
		enterRule(_localctx, 4, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((ArrayTypeContext)_localctx).type = type();
			setState(74);
			match(T__2);
			setState(75);
			((ArrayTypeContext)_localctx).num1 = match(INT_CONSTANT);
			setState(76);
			match(T__3);
			 ((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).type.ast.getLine(), ((ArrayTypeContext)_localctx).type.ast.getColumn(), ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)));
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				((ArrayTypeContext)_localctx).num2 = match(INT_CONSTANT);
				setState(80);
				match(T__3);
				}
				}
				setState(85);
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitions; }
	}

	public final FunctionDefinitionsContext functionDefinitions() throws RecognitionException {
		FunctionDefinitionsContext _localctx = new FunctionDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((FunctionDefinitionsContext)_localctx).functionDefinition = functionDefinition();
			 _localctx.ast.add(((FunctionDefinitionsContext)_localctx).functionDefinition.ast); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			functionType();
			setState(92);
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
		public TerminalNode MAIN_FUNC() { return getToken(CmmParser.MAIN_FUNC, 0); }
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionType);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					{
					setState(97);
					type();
					setState(98);
					match(ID);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(99);
						match(T__0);
						setState(100);
						type();
						setState(101);
						match(ID);
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				type();
				setState(115);
				match(ID);
				setState(116);
				match(T__5);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					{
					setState(117);
					type();
					setState(118);
					match(ID);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(119);
						match(T__0);
						setState(120);
						type();
						setState(121);
						match(ID);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__4);
				setState(136);
				match(MAIN_FUNC);
				setState(137);
				match(T__5);
				setState(138);
				match(T__6);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__7);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__8);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
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
		enterRule(_localctx, 14, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(149);
				((StatementsContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				}
				setState(156);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((StatementContext)_localctx).e1 = expression(0);
				setState(158);
				match(T__10);
				setState(159);
				((StatementContext)_localctx).e2 = expression(0);
				setState(160);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__11);
				setState(164);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Write((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__12);
				setState(168);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Read((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__13);
				setState(172);
				match(T__5);
				setState(173);
				((StatementContext)_localctx).expression = expression(0);
				setState(174);
				match(T__6);
				setState(175);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   																						(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case RETURN_CONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(182);
				((StatementContext)_localctx).expression = expression(0);
				setState(183);
				match(T__1);
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
		enterRule(_localctx, 18, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__14);
			setState(189);
			match(T__5);
			setState(190);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(191);
			match(T__6);
			setState(192);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(T__15);
					setState(194);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 20, RULE_statementBlockOrStatement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((StatementBlockOrStatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementBlockOrStatementContext)_localctx).ast =  ((StatementBlockOrStatementContext)_localctx).statementBlock.ast;
				}
				break;
			case T__5:
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
				setState(205);
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
		enterRule(_localctx, 22, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(BLOCK_START);
			setState(211);
			((StatementBlockContext)_localctx).stmts = statements();
			setState(212);
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
		enterRule(_localctx, 24, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
				{
				setState(215);
				((ExpressionsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).e1.ast);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(217);
					match(T__0);
					setState(218);
					((ExpressionsContext)_localctx).e2 = expression(0);
					}
					}
					setState(223);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(229);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(230);
				match(T__5);
				setState(231);
				((ExpressionContext)_localctx).expressions = expressions();
				setState(232);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expressions.ast);
				}
				break;
			case 2:
				{
				setState(235);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(237);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(239);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(241);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(243);
				match(T__5);
				setState(244);
				((ExpressionContext)_localctx).type = type();
				setState(245);
				match(T__6);
				setState(246);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(249);
				match(T__5);
				setState(250);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(251);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(254);
				match(OP_NEG);
				setState(255);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
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
						setState(262);
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
						setState(265);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(266);
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
						setState(267);
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
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
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
						setState(272);
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
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
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
						setState(277);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\6\2+\n\2\r\2\16\2,\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\7\7o\n\7\f\7\16\7r"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081"+
		"\13\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008e"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\7\t\u009b\n\t\f"+
		"\t\16\t\u009e\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c6\n\13\f\13\16\13\u00c9"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\7\16\u00de\n\16\f\16\16\16\u00e1\13\16\3\16\3"+
		"\16\5\16\u00e5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u011b\n\17\f\17\16\17\u011e\13\17\3\17\2\3\34\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\6\3\2\24\26\3\2\27\30\3\2\31\36\3\2\37 \2"+
		"\u0136\2\64\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bZ\3\2\2\2\n]\3\2\2\2\f\u008d"+
		"\3\2\2\2\16\u0095\3\2\2\2\20\u009c\3\2\2\2\22\u00bc\3\2\2\2\24\u00be\3"+
		"\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3\2\2\2\32\u00e4\3\2\2\2\34\u0104\3\2"+
		"\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2$&\5\b\5\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\65"+
		"\3\2\2\2)+\5\b\5\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2"+
		".\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\64!\3\2\2\2\64*\3\2\2\2\65\66\3\2\2\2\66\67\b\2\1"+
		"\2\67\3\3\2\2\289\5\16\b\29>\7\60\2\2:;\7\3\2\2;=\7\60\2\2<:\3\2\2\2="+
		"@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\4\2\2BC\b\3\1\2"+
		"CJ\3\2\2\2DE\5\6\4\2EF\7\60\2\2FG\7\4\2\2GH\b\3\1\2HJ\3\2\2\2I8\3\2\2"+
		"\2ID\3\2\2\2J\5\3\2\2\2KL\5\16\b\2LM\7\5\2\2MN\7%\2\2NO\7\6\2\2OU\b\4"+
		"\1\2PQ\7\5\2\2QR\7%\2\2RT\7\6\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VX\3\2\2\2WU\3\2\2\2XY\b\4\1\2Y\7\3\2\2\2Z[\5\n\6\2[\\\b\5\1\2\\\t"+
		"\3\2\2\2]^\5\f\7\2^_\5\30\r\2_\13\3\2\2\2`a\7\7\2\2ab\7\60\2\2bp\7\b\2"+
		"\2cd\5\16\b\2dk\7\60\2\2ef\7\3\2\2fg\5\16\b\2gh\7\60\2\2hj\3\2\2\2ie\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2nc\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2s\u008e\7\t\2\2tu\5\16\b"+
		"\2uv\7\60\2\2v\u0084\7\b\2\2wx\5\16\b\2x\177\7\60\2\2yz\7\3\2\2z{\5\16"+
		"\b\2{|\7\60\2\2|~\3\2\2\2}y\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082w\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u008e\3\2\2\2\u0089\u008a\7\7"+
		"\2\2\u008a\u008b\7-\2\2\u008b\u008c\7\b\2\2\u008c\u008e\7\t\2\2\u008d"+
		"`\3\2\2\2\u008dt\3\2\2\2\u008d\u0089\3\2\2\2\u008e\r\3\2\2\2\u008f\u0090"+
		"\7\n\2\2\u0090\u0096\b\b\1\2\u0091\u0092\7\13\2\2\u0092\u0096\b\b\1\2"+
		"\u0093\u0094\7\f\2\2\u0094\u0096\b\b\1\2\u0095\u008f\3\2\2\2\u0095\u0091"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\5\22\n\2\u0098"+
		"\u0099\b\t\1\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\21\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\5\34\17"+
		"\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\b\n\1\2\u00a4\u00bd\3\2\2\2\u00a5\u00a6"+
		"\7\16\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\b\n\1\2\u00a8\u00bd\3\2\2"+
		"\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\b\n\1\2\u00ac"+
		"\u00bd\3\2\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5"+
		"\34\17\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\n\1\2"+
		"\u00b3\u00bd\3\2\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\b\n\1\2\u00b6\u00bd"+
		"\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\4\2\2"+
		"\u00ba\u00bb\b\n\1\2\u00bb\u00bd\3\2\2\2\u00bc\u009f\3\2\2\2\u00bc\u00a5"+
		"\3\2\2\2\u00bc\u00a9\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b7\3\2\2\2\u00bd\23\3\2\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c0\7\b\2"+
		"\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7\t\2\2\u00c2\u00c7\5\26\f\2\u00c3"+
		"\u00c4\7\22\2\2\u00c4\u00c6\5\26\f\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\b\13\1\2\u00cb\25\3\2\2\2\u00cc\u00cd\5\30"+
		"\r\2\u00cd\u00ce\b\f\1\2\u00ce\u00d3\3\2\2\2\u00cf\u00d0\5\22\n\2\u00d0"+
		"\u00d1\b\f\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2"+
		"\2\2\u00d3\27\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7"+
		"\7\23\2\2\u00d7\u00d8\b\r\1\2\u00d8\31\3\2\2\2\u00d9\u00da\5\34\17\2\u00da"+
		"\u00df\b\16\1\2\u00db\u00dc\7\3\2\2\u00dc\u00de\5\34\17\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b\16\1\2\u00e3\u00e5\3"+
		"\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\33\3\2\2\2\u00e6"+
		"\u00e7\b\17\1\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea\5"+
		"\32\16\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\b\17\1\2\u00ec\u0105\3\2\2\2"+
		"\u00ed\u00ee\7\60\2\2\u00ee\u0105\b\17\1\2\u00ef\u00f0\7%\2\2\u00f0\u0105"+
		"\b\17\1\2\u00f1\u00f2\7&\2\2\u00f2\u0105\b\17\1\2\u00f3\u00f4\7\'\2\2"+
		"\u00f4\u0105\b\17\1\2\u00f5\u00f6\7\b\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8"+
		"\7\t\2\2\u00f8\u00f9\5\34\17\t\u00f9\u00fa\b\17\1\2\u00fa\u0105\3\2\2"+
		"\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5\34\17\2\u00fd\u00fe\7\t\2\2\u00fe"+
		"\u00ff\b\17\1\2\u00ff\u0105\3\2\2\2\u0100\u0101\7+\2\2\u0101\u0102\5\34"+
		"\17\3\u0102\u0103\b\17\1\2\u0103\u0105\3\2\2\2\u0104\u00e6\3\2\2\2\u0104"+
		"\u00ed\3\2\2\2\u0104\u00ef\3\2\2\2\u0104\u00f1\3\2\2\2\u0104\u00f3\3\2"+
		"\2\2\u0104\u00f5\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u0100\3\2\2\2\u0105"+
		"\u011c\3\2\2\2\u0106\u0107\f\7\2\2\u0107\u0108\t\2\2\2\u0108\u0109\5\34"+
		"\17\b\u0109\u010a\b\17\1\2\u010a\u011b\3\2\2\2\u010b\u010c\f\6\2\2\u010c"+
		"\u010d\t\3\2\2\u010d\u010e\5\34\17\7\u010e\u010f\b\17\1\2\u010f\u011b"+
		"\3\2\2\2\u0110\u0111\f\5\2\2\u0111\u0112\t\4\2\2\u0112\u0113\5\34\17\6"+
		"\u0113\u0114\b\17\1\2\u0114\u011b\3\2\2\2\u0115\u0116\f\4\2\2\u0116\u0117"+
		"\t\5\2\2\u0117\u0118\5\34\17\5\u0118\u0119\b\17\1\2\u0119\u011b\3\2\2"+
		"\2\u011a\u0106\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0115"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\35\3\2\2\2\u011e\u011c\3\2\2\2\31!\',\61\64>IUkp\177\u0084\u008d\u0095"+
		"\u009c\u00bc\u00c7\u00d2\u00df\u00e4\u0104\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}