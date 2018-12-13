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
		RULE_program = 0, RULE_varDefinition = 1, RULE_arrayType = 2, RULE_functionDefinition = 3, 
		RULE_mainFunction = 4, RULE_statementBlock = 5, RULE_statement = 6, RULE_type = 7, 
		RULE_ifElseStatement = 8, RULE_statementBlockOrStatement = 9, RULE_expression = 10, 
		RULE_arguments = 11;
	public static final String[] ruleNames = {
		"program", "varDefinition", "arrayType", "functionDefinition", "mainFunction", 
		"statementBlock", "statement", "type", "ifElseStatement", "statementBlockOrStatement", 
		"expression", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'['", "']'", "'void'", "'('", "')'", "'}'", "'='", 
		"'write'", "'read'", "'while'", "'int'", "'double'", "'char'", "'if'", 
		"'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", 
		"'!='", "'=='", "'&&'", "'||'", null, null, null, null, null, null, null, 
		null, null, null, "'!'", null, "'main'", "'return'", "'{'"
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
		public VarDefinitionContext var1;
		public FunctionDefinitionContext func1;
		public MainFunctionContext mainFunction;
		public VarDefinitionContext var2;
		public FunctionDefinitionContext func2;
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
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
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(24);
						((ProgramContext)_localctx).var1 = varDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).var1.ast.getLine(), ((ProgramContext)_localctx).var1.ast.getColumn(), ((ProgramContext)_localctx).var1.ast);
									}else{
										_localctx.ast.addVarDefinition(((ProgramContext)_localctx).var1.ast);
									}
									
								
						}
						break;
					case 2:
						{
						setState(27);
						((ProgramContext)_localctx).func1 = functionDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).func1.ast.getLine(), ((ProgramContext)_localctx).func1.ast.getColumn(), ((ProgramContext)_localctx).func1.ast);
									}else{
										_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).func1.ast);
									}
							
								
								
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
			((ProgramContext)_localctx).mainFunction = mainFunction();

					
						if(_localctx.ast==null){
							((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).mainFunction.ast.getLine(), ((ProgramContext)_localctx).mainFunction.ast.getColumn(), ((ProgramContext)_localctx).mainFunction.ast);
						}else{
							_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).mainFunction.ast);
						}
					
					
					
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(37);
					((ProgramContext)_localctx).var2 = varDefinition();
					_localctx.ast.addVarDefinition(((ProgramContext)_localctx).var2.ast);
					}
					break;
				case 2:
					{
					setState(40);
					((ProgramContext)_localctx).func2 = functionDefinition();
					_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).func2.ast);
					}
					break;
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public VarDefinition ast;
		public TypeContext type;
		public Token id1;
		public Token id2;
		public ArrayTypeContext arrayType;
		public Token id3;
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((VarDefinitionContext)_localctx).type = type();
				setState(51);
				((VarDefinitionContext)_localctx).id1 = match(ID);
				 ((VarDefinitionContext)_localctx).ast = new VarDefinition(((VarDefinitionContext)_localctx).id1.getLine(), ((VarDefinitionContext)_localctx).id1.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id1!=null?((VarDefinitionContext)_localctx).id1.getText():null), ((VarDefinitionContext)_localctx).type.ast);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(53);
					match(T__0);
					setState(54);
					((VarDefinitionContext)_localctx).id2 = match(ID);
					 ((VarDefinitionContext)_localctx).ast = new VarDefinition(((VarDefinitionContext)_localctx).id2.getLine(), ((VarDefinitionContext)_localctx).id2.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id2!=null?((VarDefinitionContext)_localctx).id2.getText():null), ((VarDefinitionContext)_localctx).type.ast);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				((VarDefinitionContext)_localctx).arrayType = arrayType();
				setState(64);
				((VarDefinitionContext)_localctx).id3 = match(ID);
				setState(65);
				match(T__1);
				 ((VarDefinitionContext)_localctx).ast = new VarDefinition(((VarDefinitionContext)_localctx).id3.getLine(), ((VarDefinitionContext)_localctx).id3.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id3!=null?((VarDefinitionContext)_localctx).id3.getText():null), ((VarDefinitionContext)_localctx).arrayType.ast);
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
			setState(70);
			((ArrayTypeContext)_localctx).type = type();
			setState(71);
			match(T__2);
			setState(72);
			((ArrayTypeContext)_localctx).num1 = match(INT_CONSTANT);
			setState(73);
			match(T__3);
			((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)));
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(75);
				match(T__2);
				setState(76);
				((ArrayTypeContext)_localctx).num2 = match(INT_CONSTANT);
				setState(77);
				match(T__3);
				((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)), LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num2!=null?((ArrayTypeContext)_localctx).num2.getText():null)));
				}
				}
				setState(83);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token funcName1;
		public TypeContext argType1;
		public Token arg1;
		public TypeContext argType2;
		public Token arg2;
		public StatementBlockContext statementBlock;
		public TypeContext returnType;
		public Token funcName2;
		public TypeContext argType3;
		public TypeContext argType4;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
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
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__4);
				setState(85);
				((FunctionDefinitionContext)_localctx).funcName1 = match(ID);
				setState(86);
				match(T__5);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					{
					setState(87);
					((FunctionDefinitionContext)_localctx).argType1 = type();
					setState(88);
					((FunctionDefinitionContext)_localctx).arg1 = match(ID);
					 
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(90);
						match(T__0);
						setState(91);
						((FunctionDefinitionContext)_localctx).argType2 = type();
						setState(92);
						((FunctionDefinitionContext)_localctx).arg2 = match(ID);

						}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__6);
				setState(106);
				((FunctionDefinitionContext)_localctx).statementBlock = statementBlock();
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).funcName1.getLine(), ((FunctionDefinitionContext)_localctx).funcName1.getCharPositionInLine()+1, (((FunctionDefinitionContext)_localctx).funcName1!=null?((FunctionDefinitionContext)_localctx).funcName1.getText():null), ((FunctionDefinitionContext)_localctx).statementBlock.ast);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((FunctionDefinitionContext)_localctx).returnType = type();
				setState(110);
				((FunctionDefinitionContext)_localctx).funcName2 = match(ID);
				setState(111);
				match(T__5);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					{
					setState(112);
					((FunctionDefinitionContext)_localctx).argType3 = type();
					setState(113);
					match(ID);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(114);
						match(T__0);
						setState(115);
						((FunctionDefinitionContext)_localctx).argType4 = type();
						setState(116);
						match(ID);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__6);
				setState(129);
				((FunctionDefinitionContext)_localctx).statementBlock = statementBlock();
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).funcName2.getLine(), ((FunctionDefinitionContext)_localctx).funcName2.getCharPositionInLine()+1, (((FunctionDefinitionContext)_localctx).funcName2!=null?((FunctionDefinitionContext)_localctx).funcName2.getText():null), ((FunctionDefinitionContext)_localctx).statementBlock.ast);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token funcName;
		public StatementBlockContext statementBlock;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__4);
			setState(135);
			((MainFunctionContext)_localctx).funcName = match(MAIN_FUNC);
			setState(136);
			match(T__5);
			setState(137);
			match(T__6);
			setState(138);
			((MainFunctionContext)_localctx).statementBlock = statementBlock();
			((MainFunctionContext)_localctx).ast =  new FunctionDefinition(((MainFunctionContext)_localctx).funcName.getLine(), ((MainFunctionContext)_localctx).funcName.getCharPositionInLine()+1, ((MainFunctionContext)_localctx).statementBlock.ast);
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
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(BLOCK_START);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__9:
				case T__10:
				case T__11:
				case T__15:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case OP_NEG:
				case RETURN_CONSTANT:
				case ID:
					{
					setState(142);
					((StatementBlockContext)_localctx).statement = statement();
					_localctx.ast.add(((StatementBlockContext)_localctx).statement.ast);
					}
					break;
				case T__12:
				case T__13:
				case T__14:
					{
					setState(145);
					varDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__7);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((StatementContext)_localctx).e1 = expression(0);
				setState(154);
				match(T__8);
				setState(155);
				((StatementContext)_localctx).e2 = expression(0);
				setState(156);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__9);
				setState(160);
				((StatementContext)_localctx).expression = expression(0);
				setState(161);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Write((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   		(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__10);
				setState(165);
				((StatementContext)_localctx).expression = expression(0);
				setState(166);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Read((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   	(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(T__11);
				setState(170);
				match(T__5);
				setState(171);
				((StatementContext)_localctx).expression = expression(0);
				setState(172);
				match(T__6);
				setState(173);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   				(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(180);
				((StatementContext)_localctx).expression = expression(0);
				setState(181);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new ReturnStatement(((StatementContext)_localctx).RETURN_CONSTANT.getLine(),
				                                             ((StatementContext)_localctx).RETURN_CONSTANT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				expression(0);
				setState(185);
				match(T__1);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__12);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__13);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(T__14);
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
		enterRule(_localctx, 16, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__15);
			setState(198);
			match(T__5);
			setState(199);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(200);
			match(T__6);
			setState(201);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast );
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(T__16);
					setState(204);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast, ((IfElseStatementContext)_localctx).elseBody.ast );
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 18, RULE_statementBlockOrStatement);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((StatementBlockOrStatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementBlockOrStatementContext)_localctx).ast =  ((StatementBlockOrStatementContext)_localctx).statementBlock.ast;
				}
				break;
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__15:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case RETURN_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public ArgumentsContext arguments;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public TypeContext type;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(221);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(222);
				match(T__5);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
					{
					{
					setState(224);
					((ExpressionContext)_localctx).arguments = arguments();
					 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).arguments.ast);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(233);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						match(T__2);
						setState(235);
						expression(0);
						setState(236);
						match(T__3);
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(244);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(246);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(248);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(250);
				match(T__5);
				setState(251);
				((ExpressionContext)_localctx).type = type();
				setState(252);
				match(T__6);
				setState(253);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(256);
				match(T__5);
				setState(257);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(258);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(261);
				match(OP_NEG);
				setState(262);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268);
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
						setState(269);
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
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
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
						setState(274);
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
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
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
						setState(279);
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
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
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
						setState(284);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(291);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList();;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((ArgumentsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(294);
				match(T__0);
				setState(295);
				((ArgumentsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
				}
				}
				setState(302);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5"+
		"\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5y\n\5\f\5\16\5|\13\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0087\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00c6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n"+
		"\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e6\n\f\f\f\16\f\u00e9\13\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00f1\n\f\f\f\16\f\u00f4\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u010c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0122\n\f\f\f\16\f\u0125\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u012d\n\r\f\r\16\r\u0130\13\r\3\r\2\3\26\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\6\3\2\24\26\3\2\27\30\3\2\31\36\3\2\37 \2\u014b\2\""+
		"\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\b\u0086\3\2\2\2\n\u0088\3\2\2\2\f\u008f"+
		"\3\2\2\2\16\u00bd\3\2\2\2\20\u00c5\3\2\2\2\22\u00c7\3\2\2\2\24\u00dc\3"+
		"\2\2\2\26\u010b\3\2\2\2\30\u0126\3\2\2\2\32\33\5\4\3\2\33\34\b\2\1\2\34"+
		"!\3\2\2\2\35\36\5\b\5\2\36\37\b\2\1\2\37!\3\2\2\2 \32\3\2\2\2 \35\3\2"+
		"\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\5\n\6\2&/"+
		"\b\2\1\2\'(\5\4\3\2()\b\2\1\2).\3\2\2\2*+\5\b\5\2+,\b\2\1\2,.\3\2\2\2"+
		"-\'\3\2\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2"+
		"\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\5\20\t\2\65\66\7\60\2\2"+
		"\66<\b\3\1\2\678\7\3\2\289\7\60\2\29;\b\3\1\2:\67\3\2\2\2;>\3\2\2\2<:"+
		"\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\4\2\2@G\3\2\2\2AB\5\6\4\2B"+
		"C\7\60\2\2CD\7\4\2\2DE\b\3\1\2EG\3\2\2\2F\64\3\2\2\2FA\3\2\2\2G\5\3\2"+
		"\2\2HI\5\20\t\2IJ\7\5\2\2JK\7%\2\2KL\7\6\2\2LS\b\4\1\2MN\7\5\2\2NO\7%"+
		"\2\2OP\7\6\2\2PR\b\4\1\2QM\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3"+
		"\2\2\2US\3\2\2\2VW\7\7\2\2WX\7\60\2\2Xh\7\b\2\2YZ\5\20\t\2Z[\7\60\2\2"+
		"[c\b\5\1\2\\]\7\3\2\2]^\5\20\t\2^_\7\60\2\2_`\b\5\1\2`b\3\2\2\2a\\\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fY\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\t\2\2lm\5\f\7\2mn\b\5"+
		"\1\2n\u0087\3\2\2\2op\5\20\t\2pq\7\60\2\2q\177\7\b\2\2rs\5\20\t\2sz\7"+
		"\60\2\2tu\7\3\2\2uv\5\20\t\2vw\7\60\2\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}r\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\t\2\2\u0083\u0084\5\f\7\2\u0084\u0085\b\5\1\2\u0085\u0087\3\2"+
		"\2\2\u0086V\3\2\2\2\u0086o\3\2\2\2\u0087\t\3\2\2\2\u0088\u0089\7\7\2\2"+
		"\u0089\u008a\7-\2\2\u008a\u008b\7\b\2\2\u008b\u008c\7\t\2\2\u008c\u008d"+
		"\5\f\7\2\u008d\u008e\b\6\1\2\u008e\13\3\2\2\2\u008f\u0096\7/\2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u0092\b\7\1\2\u0092\u0095\3\2\2\2\u0093\u0095\5"+
		"\4\3\2\u0094\u0090\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\n\2\2\u009a\r\3\2\2\2\u009b\u009c\5\26\f\2\u009c\u009d"+
		"\7\13\2\2\u009d\u009e\5\26\f\2\u009e\u009f\7\4\2\2\u009f\u00a0\b\b\1\2"+
		"\u00a0\u00be\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4"+
		"\7\4\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00be\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7"+
		"\u00a8\5\26\f\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\b\b\1\2\u00aa\u00be\3"+
		"\2\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\5\26\f\2\u00ae"+
		"\u00af\7\t\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\b\b\1\2\u00b1\u00be\3\2"+
		"\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\b\b\1\2\u00b4\u00be\3\2\2\2\u00b5"+
		"\u00b6\7.\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\b\b"+
		"\1\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\4\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u009b\3\2\2\2\u00bd\u00a1\3\2\2\2\u00bd\u00a6\3\2"+
		"\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c6\b\t\1"+
		"\2\u00c1\u00c2\7\20\2\2\u00c2\u00c6\b\t\1\2\u00c3\u00c4\7\21\2\2\u00c4"+
		"\u00c6\b\t\1\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\21\3\2\2\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca"+
		"\5\26\f\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\5\24\13\2\u00cc\u00d3\b\n\1"+
		"\2\u00cd\u00ce\7\23\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\b\n\1\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\5\f\7\2\u00d7\u00d8\b\13\1\2\u00d8\u00dd\3\2\2\2\u00d9\u00da\5\16\b\2"+
		"\u00da\u00db\b\13\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9"+
		"\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\b\f\1\2\u00df\u00e0\7\60\2\2\u00e0"+
		"\u00e1\7\b\2\2\u00e1\u00e7\b\f\1\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\b"+
		"\f\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u010c\7\t\2\2\u00eb\u00f2\7\60\2\2\u00ec\u00ed\7\5\2\2\u00ed"+
		"\u00ee\5\26\f\2\u00ee\u00ef\7\6\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u010c\b\f\1\2\u00f6\u00f7\7%"+
		"\2\2\u00f7\u010c\b\f\1\2\u00f8\u00f9\7&\2\2\u00f9\u010c\b\f\1\2\u00fa"+
		"\u00fb\7\'\2\2\u00fb\u010c\b\f\1\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5\20"+
		"\t\2\u00fe\u00ff\7\t\2\2\u00ff\u0100\5\26\f\t\u0100\u0101\b\f\1\2\u0101"+
		"\u010c\3\2\2\2\u0102\u0103\7\b\2\2\u0103\u0104\5\26\f\2\u0104\u0105\7"+
		"\t\2\2\u0105\u0106\b\f\1\2\u0106\u010c\3\2\2\2\u0107\u0108\7+\2\2\u0108"+
		"\u0109\5\26\f\3\u0109\u010a\b\f\1\2\u010a\u010c\3\2\2\2\u010b\u00de\3"+
		"\2\2\2\u010b\u00eb\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00f8\3\2\2\2\u010b"+
		"\u00fa\3\2\2\2\u010b\u00fc\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0107\3\2"+
		"\2\2\u010c\u0123\3\2\2\2\u010d\u010e\f\7\2\2\u010e\u010f\t\2\2\2\u010f"+
		"\u0110\5\26\f\b\u0110\u0111\b\f\1\2\u0111\u0122\3\2\2\2\u0112\u0113\f"+
		"\6\2\2\u0113\u0114\t\3\2\2\u0114\u0115\5\26\f\7\u0115\u0116\b\f\1\2\u0116"+
		"\u0122\3\2\2\2\u0117\u0118\f\5\2\2\u0118\u0119\t\4\2\2\u0119\u011a\5\26"+
		"\f\6\u011a\u011b\b\f\1\2\u011b\u0122\3\2\2\2\u011c\u011d\f\4\2\2\u011d"+
		"\u011e\t\5\2\2\u011e\u011f\5\26\f\5\u011f\u0120\b\f\1\2\u0120\u0122\3"+
		"\2\2\2\u0121\u010d\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0117\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\27\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5\26\f\2\u0127\u012e"+
		"\b\r\1\2\u0128\u0129\7\3\2\2\u0129\u012a\5\26\f\2\u012a\u012b\b\r\1\2"+
		"\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\31\3\2\2\2\u0130\u012e\3\2\2\2\32 "+
		"\"-/<FSchz\177\u0086\u0094\u0096\u00bd\u00c5\u00d3\u00dc\u00e7\u00f2\u010b"+
		"\u0121\u0123\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}