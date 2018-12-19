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
		T__31=32, T__32=33, NEWLINE=34, WS=35, ML_COMMENT=36, COMMENT=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, CHAR_CONSTANT=40, OP_ADD_SUB=41, OP_DIV_MUL=42, OP_LOG=43, 
		OP_NEG=44, OP_COMP=45, MAIN_FUNC=46, RETURN_CONSTANT=47, BLOCK_START=48, 
		ID=49;
	public static final int
		RULE_program = 0, RULE_typeDefinition = 1, RULE_structDefinition = 2, 
		RULE_varDefinition = 3, RULE_arrayType = 4, RULE_functionDefinition = 5, 
		RULE_mainFunction = 6, RULE_statementBlock = 7, RULE_statement = 8, RULE_type = 9, 
		RULE_ifElseStatement = 10, RULE_statementBlockOrStatement = 11, RULE_expression = 12, 
		RULE_arguments = 13;
	public static final String[] ruleNames = {
		"program", "typeDefinition", "structDefinition", "varDefinition", "arrayType", 
		"functionDefinition", "mainFunction", "statementBlock", "statement", "type", 
		"ifElseStatement", "statementBlockOrStatement", "expression", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'typedef'", "';'", "'typedef struct {'", "'}'", "','", "'['", "']'", 
		"'void'", "'('", "')'", "'='", "'write'", "'read'", "'while'", "'int'", 
		"'double'", "'char'", "'type'", "'if'", "'else'", "'*'", "'/'", "'%'", 
		"'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
		null, null, null, null, null, null, null, null, null, null, "'!'", null, 
		"'main'", "'return'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
		"WS", "ML_COMMENT", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
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
		public StructDefinitionContext structDef1;
		public MainFunctionContext mainFunction;
		public VarDefinitionContext var2;
		public FunctionDefinitionContext func2;
		public TypeDefinitionContext typeDef2;
		public StructDefinitionContext structDef2;
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
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
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
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(28);
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
						setState(31);
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
						setState(34);
						((ProgramContext)_localctx).typeDef1 = typeDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).typeDef1.ast.getLine(), ((ProgramContext)_localctx).typeDef1.ast.getColumn(), ((ProgramContext)_localctx).typeDef1.ast);
									}else{
										_localctx.ast.addTypeDefinition(((ProgramContext)_localctx).typeDef1.ast);
									}

								
						}
						break;
					case 4:
						{
						setState(37);
						((ProgramContext)_localctx).structDef1 = structDefinition();

									if(_localctx.ast==null){
										((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).typeDef1.ast.getLine(), ((ProgramContext)_localctx).typeDef1.ast.getColumn(), ((ProgramContext)_localctx).structDef1.ast);
									}else{
										_localctx.ast.addStructDefinition(((ProgramContext)_localctx).structDef1.ast);
									}

								
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			((ProgramContext)_localctx).mainFunction = mainFunction();

					
						if(_localctx.ast==null){
							((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).mainFunction.ast.getLine(), ((ProgramContext)_localctx).mainFunction.ast.getColumn(), ((ProgramContext)_localctx).mainFunction.ast);
						}else{
							_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).mainFunction.ast);
						}
					
					
					
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(47);
					((ProgramContext)_localctx).var2 = varDefinition();
					_localctx.ast.addVarDefinitions(((ProgramContext)_localctx).var2.ast);
					}
					break;
				case 2:
					{
					setState(50);
					((ProgramContext)_localctx).func2 = functionDefinition();
					_localctx.ast.addFunctionDefinition(((ProgramContext)_localctx).func2.ast);
					}
					break;
				case 3:
					{
					setState(53);
					((ProgramContext)_localctx).typeDef2 = typeDefinition();
					_localctx.ast.addTypeDefinition(((ProgramContext)_localctx).typeDef2.ast);
					}
					break;
				case 4:
					{
					setState(56);
					((ProgramContext)_localctx).structDef2 = structDefinition();
					_localctx.ast.addStructDefinition(((ProgramContext)_localctx).structDef2.ast);
					}
					break;
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			setState(66);
			match(T__0);
			setState(67);
			((TypeDefinitionContext)_localctx).type = type();
			setState(68);
			((TypeDefinitionContext)_localctx).ID = match(ID);
			setState(69);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public Record ast;
		public VarDefinitionContext varDefinition;
		public Token ID;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__2);
			setState(73);
			((StructDefinitionContext)_localctx).varDefinition = varDefinition();
			setState(74);
			match(T__3);
			setState(75);
			((StructDefinitionContext)_localctx).ID = match(ID);
			setState(76);
			match(T__1);
			((StructDefinitionContext)_localctx).ast =  new Record(((StructDefinitionContext)_localctx).ID.getLine(), ((StructDefinitionContext)_localctx).ID.getCharPositionInLine()+1, (((StructDefinitionContext)_localctx).ID!=null?((StructDefinitionContext)_localctx).ID.getText():null), ((StructDefinitionContext)_localctx).varDefinition.ast);
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
		enterRule(_localctx, 6, RULE_varDefinition);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((VarDefinitionContext)_localctx).type = type();
				setState(80);
				((VarDefinitionContext)_localctx).id1 = match(ID);
				 _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).id1.getLine(), ((VarDefinitionContext)_localctx).id1.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id1!=null?((VarDefinitionContext)_localctx).id1.getText():null), ((VarDefinitionContext)_localctx).type.ast));
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(82);
					match(T__4);
					setState(83);
					((VarDefinitionContext)_localctx).id2 = match(ID);
					 _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).id2.getLine(), ((VarDefinitionContext)_localctx).id2.getCharPositionInLine()+1, (((VarDefinitionContext)_localctx).id2!=null?((VarDefinitionContext)_localctx).id2.getText():null), ((VarDefinitionContext)_localctx).type.ast));
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((VarDefinitionContext)_localctx).arrayType = arrayType();
				setState(93);
				((VarDefinitionContext)_localctx).id3 = match(ID);
				setState(94);
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
		enterRule(_localctx, 8, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((ArrayTypeContext)_localctx).type = type();
			setState(100);
			match(T__5);
			setState(101);
			((ArrayTypeContext)_localctx).num1 = match(INT_CONSTANT);
			setState(102);
			match(T__6);
			((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)));
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(104);
				match(T__5);
				setState(105);
				((ArrayTypeContext)_localctx).num2 = match(INT_CONSTANT);
				setState(106);
				match(T__6);
				((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).num1.getLine(), ((ArrayTypeContext)_localctx).num1.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).type.ast, LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num1!=null?((ArrayTypeContext)_localctx).num1.getText():null)), LexerHelper.lexemeToInt((((ArrayTypeContext)_localctx).num2!=null?((ArrayTypeContext)_localctx).num2.getText():null)));
				}
				}
				setState(112);
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
		public Token funcName1;
		public TypeContext returnType;
		public Token funcName2;
		public TypeContext argType1;
		public Token arg1;
		public TypeContext argType2;
		public Token arg2;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(113);
				((FunctionDefinitionContext)_localctx).voidType = match(T__7);
				setState(114);
				((FunctionDefinitionContext)_localctx).funcName1 = match(ID);
				}
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).funcName1.getLine(), ((FunctionDefinitionContext)_localctx).funcName1.getCharPositionInLine()+1, (((FunctionDefinitionContext)_localctx).funcName1!=null?((FunctionDefinitionContext)_localctx).funcName1.getText():null));
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				{
				{
				setState(117);
				((FunctionDefinitionContext)_localctx).returnType = type();
				setState(118);
				((FunctionDefinitionContext)_localctx).funcName2 = match(ID);
				}
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).funcName2.getLine(), ((FunctionDefinitionContext)_localctx).funcName2.getCharPositionInLine()+1 ,(((FunctionDefinitionContext)_localctx).funcName2!=null?((FunctionDefinitionContext)_localctx).funcName2.getText():null), ((FunctionDefinitionContext)_localctx).returnType.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			match(T__8);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(125);
				((FunctionDefinitionContext)_localctx).argType1 = type();
				setState(126);
				((FunctionDefinitionContext)_localctx).arg1 = match(ID);
				_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg1!=null?((FunctionDefinitionContext)_localctx).arg1.getText():null)); 
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(128);
					match(T__4);
					setState(129);
					((FunctionDefinitionContext)_localctx).argType2 = type();
					setState(130);
					((FunctionDefinitionContext)_localctx).arg2 = match(ID);
					_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg2!=null?((FunctionDefinitionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__9);
			setState(144);
			match(BLOCK_START);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(145);
					((FunctionDefinitionContext)_localctx).varDefinition = varDefinition();
					 _localctx.ast.addVarDefinition(((FunctionDefinitionContext)_localctx).varDefinition.ast);
					}
					break;
				case T__8:
				case T__11:
				case T__12:
				case T__13:
				case T__18:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case OP_NEG:
				case RETURN_CONSTANT:
				case ID:
					{
					setState(148);
					((FunctionDefinitionContext)_localctx).statement = statement();
					 _localctx.ast.addStatement(((FunctionDefinitionContext)_localctx).statement.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__3);
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
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__7);
			setState(159);
			((MainFunctionContext)_localctx).funcName = match(MAIN_FUNC);
			setState(160);
			match(T__8);
			setState(161);
			match(T__9);
			((MainFunctionContext)_localctx).ast =  new FunctionDefinition(((MainFunctionContext)_localctx).funcName.getLine(), ((MainFunctionContext)_localctx).funcName.getCharPositionInLine()+1, (((MainFunctionContext)_localctx).funcName!=null?((MainFunctionContext)_localctx).funcName.getText():null));
			setState(163);
			match(BLOCK_START);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(164);
					((MainFunctionContext)_localctx).varDefinition = varDefinition();
					 _localctx.ast.addVarDefinition(((MainFunctionContext)_localctx).varDefinition.ast);
					}
					break;
				case T__8:
				case T__11:
				case T__12:
				case T__13:
				case T__18:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case OP_NEG:
				case RETURN_CONSTANT:
				case ID:
					{
					setState(167);
					((MainFunctionContext)_localctx).statement = statement();
					 _localctx.ast.addStatement(((MainFunctionContext)_localctx).statement.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__3);
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
		enterRule(_localctx, 14, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(BLOCK_START);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
				case T__12:
				case T__13:
				case T__18:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case OP_NEG:
				case RETURN_CONSTANT:
				case ID:
					{
					setState(178);
					((StatementBlockContext)_localctx).statement = statement();
					_localctx.ast.add(((StatementBlockContext)_localctx).statement.ast);
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(181);
					varDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__3);
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
		public Token ID;
		public ArgumentsContext arguments;
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
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((StatementContext)_localctx).e1 = expression(0);
				setState(190);
				match(T__10);
				setState(191);
				((StatementContext)_localctx).e2 = expression(0);
				setState(192);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__11);
				setState(196);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(198);
					match(T__4);
					setState(199);
					((StatementContext)_localctx).e2 = expression(0);
					((Write)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__12);
				setState(210);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(212);
					match(T__4);
					setState(213);
					((StatementContext)_localctx).e2 = expression(0);
					((Read)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__13);
				setState(224);
				match(T__8);
				setState(225);
				((StatementContext)_localctx).expression = expression(0);
				setState(226);
				match(T__9);
				setState(227);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   				(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(234);
				((StatementContext)_localctx).expression = expression(0);
				setState(235);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new ReturnStatement(((StatementContext)_localctx).RETURN_CONSTANT.getLine(),
				                                             ((StatementContext)_localctx).RETURN_CONSTANT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				((StatementContext)_localctx).ID = match(ID);
				setState(239);
				match(T__8);
				 ((StatementContext)_localctx).ast =  new FunctionCall(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
					{
					{
					setState(241);
					((StatementContext)_localctx).arguments = arguments();
					 ((StatementContext)_localctx).ast =  new FunctionCall(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).arguments.ast);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__9);
				setState(250);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__14);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__15);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(T__16);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(T__17);
				setState(260);
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
		enterRule(_localctx, 20, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__18);
			setState(265);
			match(T__8);
			setState(266);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(267);
			match(T__9);
			setState(268);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast );
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(T__19);
					setState(271);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast, ((IfElseStatementContext)_localctx).elseBody.ast );
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 22, RULE_statementBlockOrStatement);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				((StatementBlockOrStatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementBlockOrStatementContext)_localctx).ast =  ((StatementBlockOrStatementContext)_localctx).statementBlock.ast;
				}
				break;
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__18:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case OP_NEG:
			case RETURN_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
		public ExpressionContext e2;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public TypeContext type;
		public Token op;
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(288);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(289);
				match(T__8);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
					{
					{
					setState(291);
					((ExpressionContext)_localctx).arguments = arguments();
					 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).arguments.ast);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(300);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						match(T__5);
						setState(303);
						((ExpressionContext)_localctx).e1 = expression(0);
						setState(304);
						match(T__6);
						 ((ExpressionContext)_localctx).ast =  new ArrayIndexing(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast); 
						setState(313);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(306);
								match(T__5);
								setState(307);
								((ExpressionContext)_localctx).e2 = expression(0);
								setState(308);
								match(T__6);
								 ((ExpressionContext)_localctx).ast =  new ArrayIndexing(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
								}
								} 
							}
							setState(315);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						}
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(321);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(323);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(325);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(327);
				match(T__8);
				setState(328);
				((ExpressionContext)_localctx).type = type();
				setState(329);
				match(T__9);
				setState(330);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(333);
				match(T__8);
				setState(334);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(335);
				match(T__9);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(338);
				match(OP_NEG);
				setState(339);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
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
						setState(349);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(350);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(351);
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
						setState(354);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(355);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
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
						setState(359);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(360);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((ArgumentsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(371);
				match(T__4);
				setState(372);
				((ArgumentsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
				}
				}
				setState(379);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u017f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0088"+
		"\n\7\f\7\16\7\u008b\13\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cd\n"+
		"\n\f\n\16\n\u00d0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n"+
		"\n\f\n\16\n\u00de\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n\u00fa"+
		"\13\n\3\n\3\n\5\n\u00fe\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0109\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0115"+
		"\n\f\f\f\16\f\u0118\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0120\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u0129\n\16\f\16\16\16\u012c\13\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u013a"+
		"\n\16\f\16\16\16\u013d\13\16\7\16\u013f\n\16\f\16\16\16\u0142\13\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0159\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u016f\n\16\f\16\16\16\u0172\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u017a\n\17\f\17\16\17\u017d\13\17\3\17\2\3\32\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2\27\31\3\2\32\33\3\2\34!\3\2\"#"+
		"\2\u01a1\2,\3\2\2\2\4D\3\2\2\2\6J\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\f|\3\2"+
		"\2\2\16\u00a0\3\2\2\2\20\u00b3\3\2\2\2\22\u00fd\3\2\2\2\24\u0108\3\2\2"+
		"\2\26\u010a\3\2\2\2\30\u011f\3\2\2\2\32\u0158\3\2\2\2\34\u0173\3\2\2\2"+
		"\36\37\5\b\5\2\37 \b\2\1\2 +\3\2\2\2!\"\5\f\7\2\"#\b\2\1\2#+\3\2\2\2$"+
		"%\5\4\3\2%&\b\2\1\2&+\3\2\2\2\'(\5\6\4\2()\b\2\1\2)+\3\2\2\2*\36\3\2\2"+
		"\2*!\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2"+
		"\2\2.,\3\2\2\2/\60\5\16\b\2\60?\b\2\1\2\61\62\5\b\5\2\62\63\b\2\1\2\63"+
		">\3\2\2\2\64\65\5\f\7\2\65\66\b\2\1\2\66>\3\2\2\2\678\5\4\3\289\b\2\1"+
		"\29>\3\2\2\2:;\5\6\4\2;<\b\2\1\2<>\3\2\2\2=\61\3\2\2\2=\64\3\2\2\2=\67"+
		"\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2B"+
		"C\7\2\2\3C\3\3\2\2\2DE\7\3\2\2EF\5\24\13\2FG\7\63\2\2GH\7\4\2\2HI\b\3"+
		"\1\2I\5\3\2\2\2JK\7\5\2\2KL\5\b\5\2LM\7\6\2\2MN\7\63\2\2NO\7\4\2\2OP\b"+
		"\4\1\2P\7\3\2\2\2QR\5\24\13\2RS\7\63\2\2SY\b\5\1\2TU\7\7\2\2UV\7\63\2"+
		"\2VX\b\5\1\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2"+
		"\2\2\\]\7\4\2\2]d\3\2\2\2^_\5\n\6\2_`\7\63\2\2`a\7\4\2\2ab\b\5\1\2bd\3"+
		"\2\2\2cQ\3\2\2\2c^\3\2\2\2d\t\3\2\2\2ef\5\24\13\2fg\7\b\2\2gh\7(\2\2h"+
		"i\7\t\2\2ip\b\6\1\2jk\7\b\2\2kl\7(\2\2lm\7\t\2\2mo\b\6\1\2nj\3\2\2\2o"+
		"r\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\7\n\2\2tu\7\63\2"+
		"\2uv\3\2\2\2v}\b\7\1\2wx\5\24\13\2xy\7\63\2\2yz\3\2\2\2z{\b\7\1\2{}\3"+
		"\2\2\2|s\3\2\2\2|w\3\2\2\2}~\3\2\2\2~\u008e\7\13\2\2\177\u0080\5\24\13"+
		"\2\u0080\u0081\7\63\2\2\u0081\u0089\b\7\1\2\u0082\u0083\7\7\2\2\u0083"+
		"\u0084\5\24\13\2\u0084\u0085\7\63\2\2\u0085\u0086\b\7\1\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0082\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\177\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\f\2\2\u0092\u009b\7\62\2\2"+
		"\u0093\u0094\5\b\5\2\u0094\u0095\b\7\1\2\u0095\u009a\3\2\2\2\u0096\u0097"+
		"\5\22\n\2\u0097\u0098\b\7\1\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2"+
		"\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\r\3\2\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\7\13\2"+
		"\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00ae\7\62\2\2\u00a6"+
		"\u00a7\5\b\5\2\u00a7\u00a8\b\b\1\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\5\22"+
		"\n\2\u00aa\u00ab\b\b\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\6\2\2\u00b2"+
		"\17\3\2\2\2\u00b3\u00ba\7\62\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\b\t"+
		"\1\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5\b\5\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\6\2\2\u00be"+
		"\21\3\2\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5\32"+
		"\16\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00fe\3\2\2\2\u00c5"+
		"\u00c6\7\16\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00ce\b\n\1\2\u00c8\u00c9"+
		"\7\7\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\b\n\1\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00fe\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00dc"+
		"\b\n\1\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\b\n\1\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7\4\2\2\u00e0\u00fe\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\7"+
		"\13\2\2\u00e3\u00e4\5\32\16\2\u00e4\u00e5\7\f\2\2\u00e5\u00e6\5\20\t\2"+
		"\u00e6\u00e7\b\n\1\2\u00e7\u00fe\3\2\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea"+
		"\b\n\1\2\u00ea\u00fe\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\5\32\16"+
		"\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\b\n\1\2\u00ef\u00fe\3\2\2\2\u00f0\u00f1"+
		"\7\63\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f8\b\n\1\2\u00f3\u00f4\5\34\17"+
		"\2\u00f4\u00f5\b\n\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fe\7\4\2\2\u00fd\u00bf\3\2"+
		"\2\2\u00fd\u00c5\3\2\2\2\u00fd\u00d3\3\2\2\2\u00fd\u00e1\3\2\2\2\u00fd"+
		"\u00e8\3\2\2\2\u00fd\u00eb\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fe\23\3\2\2"+
		"\2\u00ff\u0100\7\21\2\2\u0100\u0109\b\13\1\2\u0101\u0102\7\22\2\2\u0102"+
		"\u0109\b\13\1\2\u0103\u0104\7\23\2\2\u0104\u0109\b\13\1\2\u0105\u0106"+
		"\7\24\2\2\u0106\u0107\7\63\2\2\u0107\u0109\b\13\1\2\u0108\u00ff\3\2\2"+
		"\2\u0108\u0101\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0105\3\2\2\2\u0109\25"+
		"\3\2\2\2\u010a\u010b\7\25\2\2\u010b\u010c\7\13\2\2\u010c\u010d\5\32\16"+
		"\2\u010d\u010e\7\f\2\2\u010e\u010f\5\30\r\2\u010f\u0116\b\f\1\2\u0110"+
		"\u0111\7\26\2\2\u0111\u0112\5\30\r\2\u0112\u0113\b\f\1\2\u0113\u0115\3"+
		"\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\27\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5\20\t"+
		"\2\u011a\u011b\b\r\1\2\u011b\u0120\3\2\2\2\u011c\u011d\5\22\n\2\u011d"+
		"\u011e\b\r\1\2\u011e\u0120\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2"+
		"\2\2\u0120\31\3\2\2\2\u0121\u0122\b\16\1\2\u0122\u0123\7\63\2\2\u0123"+
		"\u0124\7\13\2\2\u0124\u012a\b\16\1\2\u0125\u0126\5\34\17\2\u0126\u0127"+
		"\b\16\1\2\u0127\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u0159\7\f\2\2\u012e\u012f\7\63\2\2\u012f\u0140\b\16\1\2"+
		"\u0130\u0131\7\b\2\2\u0131\u0132\5\32\16\2\u0132\u0133\7\t\2\2\u0133\u013b"+
		"\b\16\1\2\u0134\u0135\7\b\2\2\u0135\u0136\5\32\16\2\u0136\u0137\7\t\2"+
		"\2\u0137\u0138\b\16\1\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u0130\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0159\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0144\7(\2\2\u0144\u0159\b\16\1\2\u0145\u0146\7)\2\2\u0146"+
		"\u0159\b\16\1\2\u0147\u0148\7*\2\2\u0148\u0159\b\16\1\2\u0149\u014a\7"+
		"\13\2\2\u014a\u014b\5\24\13\2\u014b\u014c\7\f\2\2\u014c\u014d\5\32\16"+
		"\t\u014d\u014e\b\16\1\2\u014e\u0159\3\2\2\2\u014f\u0150\7\13\2\2\u0150"+
		"\u0151\5\32\16\2\u0151\u0152\7\f\2\2\u0152\u0153\b\16\1\2\u0153\u0159"+
		"\3\2\2\2\u0154\u0155\7.\2\2\u0155\u0156\5\32\16\3\u0156\u0157\b\16\1\2"+
		"\u0157\u0159\3\2\2\2\u0158\u0121\3\2\2\2\u0158\u012e\3\2\2\2\u0158\u0143"+
		"\3\2\2\2\u0158\u0145\3\2\2\2\u0158\u0147\3\2\2\2\u0158\u0149\3\2\2\2\u0158"+
		"\u014f\3\2\2\2\u0158\u0154\3\2\2\2\u0159\u0170\3\2\2\2\u015a\u015b\f\7"+
		"\2\2\u015b\u015c\t\2\2\2\u015c\u015d\5\32\16\b\u015d\u015e\b\16\1\2\u015e"+
		"\u016f\3\2\2\2\u015f\u0160\f\6\2\2\u0160\u0161\t\3\2\2\u0161\u0162\5\32"+
		"\16\7\u0162\u0163\b\16\1\2\u0163\u016f\3\2\2\2\u0164\u0165\f\5\2\2\u0165"+
		"\u0166\t\4\2\2\u0166\u0167\5\32\16\6\u0167\u0168\b\16\1\2\u0168\u016f"+
		"\3\2\2\2\u0169\u016a\f\4\2\2\u016a\u016b\t\5\2\2\u016b\u016c\5\32\16\5"+
		"\u016c\u016d\b\16\1\2\u016d\u016f\3\2\2\2\u016e\u015a\3\2\2\2\u016e\u015f"+
		"\3\2\2\2\u016e\u0164\3\2\2\2\u016e\u0169\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\33\3\2\2\2\u0172\u0170\3\2\2"+
		"\2\u0173\u0174\5\32\16\2\u0174\u017b\b\17\1\2\u0175\u0176\7\7\2\2\u0176"+
		"\u0177\5\32\16\2\u0177\u0178\b\17\1\2\u0178\u017a\3\2\2\2\u0179\u0175"+
		"\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\35\3\2\2\2\u017d\u017b\3\2\2\2 *,=?Ycp|\u0089\u008e\u0099\u009b\u00ac"+
		"\u00ae\u00b8\u00ba\u00ce\u00dc\u00f8\u00fd\u0108\u0116\u011f\u012a\u013b"+
		"\u0140\u0158\u016e\u0170\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}