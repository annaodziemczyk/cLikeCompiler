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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, NEWLINE=33, WS=34, ML_COMMENT=35, COMMENT=36, INT_CONSTANT=37, 
		REAL_CONSTANT=38, CHAR_CONSTANT=39, OP_ADD_SUB=40, OP_DIV_MUL=41, OP_LOG=42, 
		OP_NEG=43, OP_COMP=44, MAIN_FUNC=45, RETURN_CONSTANT=46, BLOCK_START=47, 
		ID=48;
	public static final int
		RULE_program = 0, RULE_typeDefinition = 1, RULE_varDefinition = 2, RULE_arrayType = 3, 
		RULE_functionDefinition = 4, RULE_mainFunction = 5, RULE_statementBlock = 6, 
		RULE_statement = 7, RULE_type = 8, RULE_ifElseStatement = 9, RULE_statementBlockOrStatement = 10, 
		RULE_expression = 11, RULE_arguments = 12;
	public static final String[] ruleNames = {
		"program", "typeDefinition", "varDefinition", "arrayType", "functionDefinition", 
		"mainFunction", "statementBlock", "statement", "type", "ifElseStatement", 
		"statementBlockOrStatement", "expression", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'typedef'", "';'", "','", "'['", "']'", "'void'", "'('", "')'", 
		"'}'", "'='", "'write'", "'read'", "'while'", "'int'", "'double'", "'char'", 
		"'type'", "'if'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", 
		"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", null, null, null, 
		null, null, null, null, null, null, null, "'!'", null, "'main'", "'return'", 
		"'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NEWLINE", "WS", 
		"ML_COMMENT", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
		"OP_ADD_SUB", "OP_DIV_MUL", "OP_LOG", "OP_NEG", "OP_COMP", "MAIN_FUNC", 
		"RETURN_CONSTANT", "BLOCK_START", "ID"
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
		public TypeDefinitionContext typeDef1;
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
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
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
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(26);
						((ProgramContext)_localctx).var1 = varDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).var1!=null?(((ProgramContext)_localctx).var1.start):null).getLine(), (((ProgramContext)_localctx).var1!=null?(((ProgramContext)_localctx).var1.start):null).getCharPositionInLine()+1, ((ProgramContext)_localctx).var1.ast);
									}else{
										_localctx.ast.addVarDefinitions(((ProgramContext)_localctx).var1.ast);
									}
									
								
						}
						break;
					case 2:
						{
						setState(29);
						((ProgramContext)_localctx).func1 = functionDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).func1.ast.getLine(), ((ProgramContext)_localctx).func1.ast.getColumn(), ((ProgramContext)_localctx).func1.ast);
									}else{
										_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).func1.ast);
									}
							
								
								
						}
						break;
					case 3:
						{
						setState(32);
						((ProgramContext)_localctx).typeDef1 = typeDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).typeDef1.ast.getLine(), ((ProgramContext)_localctx).typeDef1.ast.getColumn(), ((ProgramContext)_localctx).typeDef1.ast);
									}else{
										_localctx.ast.addTypeDefinition(((ProgramContext)_localctx).typeDef1.ast);
									}

								
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(40);
			((ProgramContext)_localctx).mainFunction = mainFunction();

					
						if(_localctx.ast==null){
							((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).mainFunction.ast.getLine(), ((ProgramContext)_localctx).mainFunction.ast.getColumn(), ((ProgramContext)_localctx).mainFunction.ast);
						}else{
							_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).mainFunction.ast);
						}
					
					
					
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
					((ProgramContext)_localctx).var2 = varDefinition();
					_localctx.ast.addVarDefinitions(((ProgramContext)_localctx).var2.ast);
					}
					break;
				case 2:
					{
					setState(45);
					((ProgramContext)_localctx).func2 = functionDefinition();
					_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).func2.ast);
					}
					break;
				case 3:
					{
					setState(48);
					((ProgramContext)_localctx).typeDef1 = typeDefinition();
					_localctx.ast.addTypeDefinition(((ProgramContext)_localctx).typeDef1.ast);
					}
					break;
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefinition ast;
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			((TypeDefinitionContext)_localctx).type = type();
			setState(60);
			((TypeDefinitionContext)_localctx).ID = match(ID);
			setState(61);
			match(T__1);
			((TypeDefinitionContext)_localctx).ast =  new TypeDefinition(((TypeDefinitionContext)_localctx).ID.getLine(), ((TypeDefinitionContext)_localctx).ID.getCharPositionInLine()+1, ((TypeDefinitionContext)_localctx).type.ast, (((TypeDefinitionContext)_localctx).ID!=null?((TypeDefinitionContext)_localctx).ID.getText():null));
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
		public List<VarDefinition> ast = new ArrayList();
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
		enterRule(_localctx, 4, RULE_varDefinition);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((VarDefinitionContext)_localctx).type = type();
				setState(65);
				((VarDefinitionContext)_localctx).id1 = match(ID);
				 _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).id1.getLine(), ((VarDefinitionContext)_localctx).id1.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id1!=null?((VarDefinitionContext)_localctx).id1.getText():null), ((VarDefinitionContext)_localctx).type.ast));
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(67);
					match(T__2);
					setState(68);
					((VarDefinitionContext)_localctx).id2 = match(ID);
					 _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).id2.getLine(), ((VarDefinitionContext)_localctx).id2.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id2!=null?((VarDefinitionContext)_localctx).id2.getText():null), ((VarDefinitionContext)_localctx).type.ast));
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((VarDefinitionContext)_localctx).arrayType = arrayType();
				setState(78);
				((VarDefinitionContext)_localctx).id3 = match(ID);
				setState(79);
				match(T__1);
				 _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).id3.getLine(), ((VarDefinitionContext)_localctx).id3.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id3!=null?((VarDefinitionContext)_localctx).id3.getText():null), ((VarDefinitionContext)_localctx).arrayType.ast));
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
		enterRule(_localctx, 6, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((ArrayTypeContext)_localctx).type = type();
			setState(85);
			match(T__3);
			setState(86);
			((ArrayTypeContext)_localctx).num1 = match(INT_CONSTANT);
			setState(87);
			match(T__4);
			((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)));
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(89);
				match(T__3);
				setState(90);
				((ArrayTypeContext)_localctx).num2 = match(INT_CONSTANT);
				setState(91);
				match(T__4);
				((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)), LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num2!=null?((ArrayTypeContext)_localctx).num2.getText():null)));
				}
				}
				setState(97);
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
		public Token voidType;
		public TypeContext returnType;
		public Token funcName;
		public TypeContext argType1;
		public Token arg1;
		public TypeContext argType2;
		public Token arg2;
		public StatementBlockContext statementBlock;
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
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(98);
				((FunctionDefinitionContext)_localctx).voidType = match(T__5);
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).voidType.getLine(), ((FunctionDefinitionContext)_localctx).voidType.getCharPositionInLine()+1);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				setState(100);
				((FunctionDefinitionContext)_localctx).returnType = type();
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).returnType.ast.getLine(), ((FunctionDefinitionContext)_localctx).returnType.ast.getColumn(), ((FunctionDefinitionContext)_localctx).returnType.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			((FunctionDefinitionContext)_localctx).funcName = match(ID);
			setState(106);
			match(T__6);
			 _localctx.ast.setName((((FunctionDefinitionContext)_localctx).funcName!=null?((FunctionDefinitionContext)_localctx).funcName.getText():null));
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(108);
				((FunctionDefinitionContext)_localctx).argType1 = type();
				setState(109);
				((FunctionDefinitionContext)_localctx).arg1 = match(ID);
				_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg1!=null?((FunctionDefinitionContext)_localctx).arg1.getText():null)); 
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(111);
					match(T__2);
					setState(112);
					((FunctionDefinitionContext)_localctx).argType2 = type();
					setState(113);
					((FunctionDefinitionContext)_localctx).arg2 = match(ID);
					_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg2!=null?((FunctionDefinitionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__7);
			setState(127);
			((FunctionDefinitionContext)_localctx).statementBlock = statementBlock();
			 _localctx.ast.setFunctionBody(((FunctionDefinitionContext)_localctx).statementBlock.ast);
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
		enterRule(_localctx, 10, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__5);
			setState(131);
			((MainFunctionContext)_localctx).funcName = match(MAIN_FUNC);
			setState(132);
			match(T__6);
			setState(133);
			match(T__7);
			setState(134);
			((MainFunctionContext)_localctx).statementBlock = statementBlock();
			((MainFunctionContext)_localctx).ast =  new FunctionDefinition(((MainFunctionContext)_localctx).funcName.getLine(), ((MainFunctionContext)_localctx).funcName.getCharPositionInLine()+1, (((MainFunctionContext)_localctx).funcName!=null?((MainFunctionContext)_localctx).funcName.getText():null), ((MainFunctionContext)_localctx).statementBlock.ast);
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
		enterRule(_localctx, 12, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(BLOCK_START);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__10:
				case T__11:
				case T__12:
				case T__17:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case OP_NEG:
				case RETURN_CONSTANT:
				case ID:
					{
					setState(138);
					((StatementBlockContext)_localctx).statement = statement();
					_localctx.ast.add(((StatementBlockContext)_localctx).statement.ast);
					}
					break;
				case T__13:
				case T__14:
				case T__15:
				case T__16:
					{
					setState(141);
					varDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__8);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((StatementContext)_localctx).e1 = expression(0);
				setState(150);
				match(T__9);
				setState(151);
				((StatementContext)_localctx).e2 = expression(0);
				setState(152);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__10);
				setState(156);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(158);
					match(T__2);
					setState(159);
					((StatementContext)_localctx).e2 = expression(0);
					((Write)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__11);
				setState(170);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(172);
					match(T__2);
					setState(173);
					((StatementContext)_localctx).e2 = expression(0);
					((Read)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__12);
				setState(184);
				match(T__6);
				setState(185);
				((StatementContext)_localctx).expression = expression(0);
				setState(186);
				match(T__7);
				setState(187);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   				(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(194);
				((StatementContext)_localctx).expression = expression(0);
				setState(195);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new ReturnStatement(((StatementContext)_localctx).RETURN_CONSTANT.getLine(),
				                                             ((StatementContext)_localctx).RETURN_CONSTANT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				expression(0);
				setState(199);
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
		public Token ID;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__13);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__14);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__15);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__16);
				setState(210);
				((TypeContext)_localctx).ID = match(ID);
				 ((TypeContext)_localctx).ast =  KeywordType.getKeywordType((((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null)); 
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
			setState(214);
			match(T__17);
			setState(215);
			match(T__6);
			setState(216);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(217);
			match(T__7);
			setState(218);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast );
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(T__18);
					setState(221);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast, ((IfElseStatementContext)_localctx).elseBody.ast );
					}
					} 
				}
				setState(228);
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
		enterRule(_localctx, 20, RULE_statementBlockOrStatement);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((StatementBlockOrStatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementBlockOrStatementContext)_localctx).ast =  ((StatementBlockOrStatementContext)_localctx).statementBlock.ast;
				}
				break;
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__17:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case RETURN_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(238);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(239);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
					{
					{
					setState(241);
					((ExpressionContext)_localctx).arguments = arguments();
					 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).arguments.ast);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(250);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(251);
						match(T__3);
						setState(252);
						expression(0);
						setState(253);
						match(T__4);
						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 3:
				{
				setState(261);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(263);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(265);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(267);
				match(T__6);
				setState(268);
				((ExpressionContext)_localctx).type = type();
				setState(269);
				match(T__7);
				setState(270);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(273);
				match(T__6);
				setState(274);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(275);
				match(T__7);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(278);
				match(OP_NEG);
				setState(279);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(285);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
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
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
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
						setState(294);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(295);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
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
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(308);
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
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((ArgumentsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(311);
				match(T__2);
				setState(312);
				((ArgumentsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
				}
				}
				setState(319);
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
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0143\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6w\n"+
		"\6\f\6\16\6z\13\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a5"+
		"\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b3"+
		"\n\t\f\t\16\t\u00b6\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00e3\n\13\f\13\16\13\u00e6\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00ee\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r\u00fa"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u011d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0133\n\r\f\r\16\r\u0136\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u013e\n\16\f\16\16\16\u0141\13\16"+
		"\3\16\2\3\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\26\30\3\2\31"+
		"\32\3\2\33 \3\2!\"\2\u015e\2\'\3\2\2\2\4<\3\2\2\2\6T\3\2\2\2\bV\3\2\2"+
		"\2\ni\3\2\2\2\f\u0084\3\2\2\2\16\u008b\3\2\2\2\20\u00cb\3\2\2\2\22\u00d6"+
		"\3\2\2\2\24\u00d8\3\2\2\2\26\u00ed\3\2\2\2\30\u011c\3\2\2\2\32\u0137\3"+
		"\2\2\2\34\35\5\6\4\2\35\36\b\2\1\2\36&\3\2\2\2\37 \5\n\6\2 !\b\2\1\2!"+
		"&\3\2\2\2\"#\5\4\3\2#$\b\2\1\2$&\3\2\2\2%\34\3\2\2\2%\37\3\2\2\2%\"\3"+
		"\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\f\7\2"+
		"+\67\b\2\1\2,-\5\6\4\2-.\b\2\1\2.\66\3\2\2\2/\60\5\n\6\2\60\61\b\2\1\2"+
		"\61\66\3\2\2\2\62\63\5\4\3\2\63\64\b\2\1\2\64\66\3\2\2\2\65,\3\2\2\2\65"+
		"/\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2"+
		"\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<=\7\3\2\2=>\5\22\n\2>?\7\62\2\2?@"+
		"\7\4\2\2@A\b\3\1\2A\5\3\2\2\2BC\5\22\n\2CD\7\62\2\2DJ\b\4\1\2EF\7\5\2"+
		"\2FG\7\62\2\2GI\b\4\1\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LJ\3\2\2\2MN\7\4\2\2NU\3\2\2\2OP\5\b\5\2PQ\7\62\2\2QR\7\4\2\2RS\b"+
		"\4\1\2SU\3\2\2\2TB\3\2\2\2TO\3\2\2\2U\7\3\2\2\2VW\5\22\n\2WX\7\6\2\2X"+
		"Y\7\'\2\2YZ\7\7\2\2Za\b\5\1\2[\\\7\6\2\2\\]\7\'\2\2]^\7\7\2\2^`\b\5\1"+
		"\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\7\b"+
		"\2\2ej\b\6\1\2fg\5\22\n\2gh\b\6\1\2hj\3\2\2\2id\3\2\2\2if\3\2\2\2jk\3"+
		"\2\2\2kl\7\62\2\2lm\7\t\2\2m}\b\6\1\2no\5\22\n\2op\7\62\2\2px\b\6\1\2"+
		"qr\7\5\2\2rs\5\22\n\2st\7\62\2\2tu\b\6\1\2uw\3\2\2\2vq\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{n\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\5\16\b\2\u0082\u0083\b\6\1\2\u0083\13\3\2\2\2\u0084\u0085\7\b\2"+
		"\2\u0085\u0086\7/\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7\n\2\2\u0088\u0089"+
		"\5\16\b\2\u0089\u008a\b\7\1\2\u008a\r\3\2\2\2\u008b\u0092\7\61\2\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008e\b\b\1\2\u008e\u0091\3\2\2\2\u008f\u0091\5"+
		"\6\4\2\u0090\u008c\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\7\13\2\2\u0096\17\3\2\2\2\u0097\u0098\5\30\r\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7\4\2\2\u009b\u009c\b"+
		"\t\1\2\u009c\u00cc\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00a6\b\t\1\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\b"+
		"\t\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00cc\3\2\2\2\u00ab\u00ac\7\16\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00b4\b\t\1\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5"+
		"\30\r\2\u00b0\u00b1\b\t\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00cc\3\2\2\2\u00b9"+
		"\u00ba\7\17\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7"+
		"\n\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\b\t\1\2\u00bf\u00cc\3\2\2\2\u00c0"+
		"\u00c1\5\24\13\2\u00c1\u00c2\b\t\1\2\u00c2\u00cc\3\2\2\2\u00c3\u00c4\7"+
		"\60\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\b\t\1\2\u00c7"+
		"\u00cc\3\2\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\3"+
		"\2\2\2\u00cb\u0097\3\2\2\2\u00cb\u009d\3\2\2\2\u00cb\u00ab\3\2\2\2\u00cb"+
		"\u00b9\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c8\3\2"+
		"\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00d7\b\n\1\2\u00cf\u00d0"+
		"\7\21\2\2\u00d0\u00d7\b\n\1\2\u00d1\u00d2\7\22\2\2\u00d2\u00d7\b\n\1\2"+
		"\u00d3\u00d4\7\23\2\2\u00d4\u00d5\7\62\2\2\u00d5\u00d7\b\n\1\2\u00d6\u00cd"+
		"\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7"+
		"\23\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7\t\2\2\u00da\u00db\5\30"+
		"\r\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00e4\b\13\1\2\u00de"+
		"\u00df\7\25\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\b\13\1\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5\16\b"+
		"\2\u00e8\u00e9\b\f\1\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\5\20\t\2\u00eb"+
		"\u00ec\b\f\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ee\27\3\2\2\2\u00ef\u00f0\b\r\1\2\u00f0\u00f1\7\62\2\2\u00f1\u00f2"+
		"\7\t\2\2\u00f2\u00f8\b\r\1\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\b\r\1\2"+
		"\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u011d\7\n\2\2\u00fc\u0103\7\62\2\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\5"+
		"\30\r\2\u00ff\u0100\7\7\2\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u011d\b\r\1\2\u0107\u0108\7\'\2\2\u0108"+
		"\u011d\b\r\1\2\u0109\u010a\7(\2\2\u010a\u011d\b\r\1\2\u010b\u010c\7)\2"+
		"\2\u010c\u011d\b\r\1\2\u010d\u010e\7\t\2\2\u010e\u010f\5\22\n\2\u010f"+
		"\u0110\7\n\2\2\u0110\u0111\5\30\r\t\u0111\u0112\b\r\1\2\u0112\u011d\3"+
		"\2\2\2\u0113\u0114\7\t\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7\n\2\2\u0116"+
		"\u0117\b\r\1\2\u0117\u011d\3\2\2\2\u0118\u0119\7-\2\2\u0119\u011a\5\30"+
		"\r\3\u011a\u011b\b\r\1\2\u011b\u011d\3\2\2\2\u011c\u00ef\3\2\2\2\u011c"+
		"\u00fc\3\2\2\2\u011c\u0107\3\2\2\2\u011c\u0109\3\2\2\2\u011c\u010b\3\2"+
		"\2\2\u011c\u010d\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0118\3\2\2\2\u011d"+
		"\u0134\3\2\2\2\u011e\u011f\f\7\2\2\u011f\u0120\t\2\2\2\u0120\u0121\5\30"+
		"\r\b\u0121\u0122\b\r\1\2\u0122\u0133\3\2\2\2\u0123\u0124\f\6\2\2\u0124"+
		"\u0125\t\3\2\2\u0125\u0126\5\30\r\7\u0126\u0127\b\r\1\2\u0127\u0133\3"+
		"\2\2\2\u0128\u0129\f\5\2\2\u0129\u012a\t\4\2\2\u012a\u012b\5\30\r\6\u012b"+
		"\u012c\b\r\1\2\u012c\u0133\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\t\5"+
		"\2\2\u012f\u0130\5\30\r\5\u0130\u0131\b\r\1\2\u0131\u0133\3\2\2\2\u0132"+
		"\u011e\3\2\2\2\u0132\u0123\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012d\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\31\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5\30\r\2\u0138\u013f\b\16"+
		"\1\2\u0139\u013a\7\5\2\2\u013a\u013b\5\30\r\2\u013b\u013c\b\16\1\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\33\3\2\2\2\u0141\u013f\3\2\2\2\32%\'\65"+
		"\67JTaix}\u0090\u0092\u00a6\u00b4\u00cb\u00d6\u00e4\u00ed\u00f8\u0103"+
		"\u011c\u0132\u0134\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}