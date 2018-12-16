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
		public TypeContext returnType;
		public Token funcName;
		public TypeContext argType1;
		public Token arg1;
		public TypeContext argType2;
		public Token arg2;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(113);
				((FunctionDefinitionContext)_localctx).voidType = match(T__7);
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).voidType.getLine(), ((FunctionDefinitionContext)_localctx).voidType.getCharPositionInLine()+1);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				{
				setState(115);
				((FunctionDefinitionContext)_localctx).returnType = type();
				 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).returnType.ast.getLine(), ((FunctionDefinitionContext)_localctx).returnType.ast.getColumn(), ((FunctionDefinitionContext)_localctx).returnType.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			((FunctionDefinitionContext)_localctx).funcName = match(ID);
			setState(121);
			match(T__8);
			 _localctx.ast.setName((((FunctionDefinitionContext)_localctx).funcName!=null?((FunctionDefinitionContext)_localctx).funcName.getText():null));
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(123);
				((FunctionDefinitionContext)_localctx).argType1 = type();
				setState(124);
				((FunctionDefinitionContext)_localctx).arg1 = match(ID);
				_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg1!=null?((FunctionDefinitionContext)_localctx).arg1.getText():null)); 
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(126);
					match(T__4);
					setState(127);
					((FunctionDefinitionContext)_localctx).argType2 = type();
					setState(128);
					((FunctionDefinitionContext)_localctx).arg2 = match(ID);
					_localctx.ast.addArgument(((FunctionDefinitionContext)_localctx).argType1.ast, (((FunctionDefinitionContext)_localctx).arg2!=null?((FunctionDefinitionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__9);
			setState(142);
			match(BLOCK_START);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(143);
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
					setState(146);
					((FunctionDefinitionContext)_localctx).statement = statement();
					 _localctx.ast.addStatement(((FunctionDefinitionContext)_localctx).statement.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
			setState(156);
			match(T__7);
			setState(157);
			((MainFunctionContext)_localctx).funcName = match(MAIN_FUNC);
			setState(158);
			match(T__8);
			setState(159);
			match(T__9);
			((MainFunctionContext)_localctx).ast =  new FunctionDefinition(((MainFunctionContext)_localctx).funcName.getLine(), ((MainFunctionContext)_localctx).funcName.getCharPositionInLine()+1, (((MainFunctionContext)_localctx).funcName!=null?((MainFunctionContext)_localctx).funcName.getText():null));
			setState(161);
			match(BLOCK_START);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(162);
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
					setState(165);
					((MainFunctionContext)_localctx).statement = statement();
					 _localctx.ast.addStatement(((MainFunctionContext)_localctx).statement.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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
			setState(175);
			match(BLOCK_START);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << RETURN_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(180);
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
					setState(176);
					((StatementBlockContext)_localctx).statement = statement();
					_localctx.ast.add(((StatementBlockContext)_localctx).statement.ast);
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(179);
					varDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((StatementContext)_localctx).e1 = expression(0);
				setState(188);
				match(T__10);
				setState(189);
				((StatementContext)_localctx).e2 = expression(0);
				setState(190);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__11);
				setState(194);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(196);
					match(T__4);
					setState(197);
					((StatementContext)_localctx).e2 = expression(0);
					((Write)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__12);
				setState(208);
				((StatementContext)_localctx).e1 = expression(0);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast); 
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(210);
					match(T__4);
					setState(211);
					((StatementContext)_localctx).e2 = expression(0);
					((Read)_localctx.ast).addExpression(((StatementContext)_localctx).e2.ast);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__13);
				setState(222);
				match(T__8);
				setState(223);
				((StatementContext)_localctx).expression = expression(0);
				setState(224);
				match(T__9);
				setState(225);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new WhileStatement((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(),
				                                                   				(((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifElseStatement.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				((StatementContext)_localctx).RETURN_CONSTANT = match(RETURN_CONSTANT);
				setState(232);
				((StatementContext)_localctx).expression = expression(0);
				setState(233);
				match(T__1);
				 ((StatementContext)_localctx).ast =  new ReturnStatement(((StatementContext)_localctx).RETURN_CONSTANT.getLine(),
				                                             ((StatementContext)_localctx).RETURN_CONSTANT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				expression(0);
				setState(237);
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
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__14);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__15);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T__16);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(T__17);
				setState(248);
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
			setState(252);
			match(T__18);
			setState(253);
			match(T__8);
			setState(254);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(255);
			match(T__9);
			setState(256);
			((IfElseStatementContext)_localctx).ifBody = statementBlockOrStatement();
			 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast );
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(T__19);
					setState(259);
					((IfElseStatementContext)_localctx).elseBody = statementBlockOrStatement();
					 ((IfElseStatementContext)_localctx).ast =  new IfElseStatement(((IfElseStatementContext)_localctx).condition.ast.getLine(), ((IfElseStatementContext)_localctx).condition.ast.getColumn(), ((IfElseStatementContext)_localctx).condition.ast, ((IfElseStatementContext)_localctx).ifBody.ast, ((IfElseStatementContext)_localctx).elseBody.ast );
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
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
				setState(270);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(276);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(277);
				match(T__8);
				 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << OP_NEG) | (1L << ID))) != 0)) {
					{
					{
					setState(279);
					((ExpressionContext)_localctx).arguments = arguments();
					 ((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).arguments.ast);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(288);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(T__5);
						setState(291);
						((ExpressionContext)_localctx).e1 = expression(0);
						setState(292);
						match(T__6);
						 ((ExpressionContext)_localctx).ast =  new ArrayIndexing(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast); 
						setState(301);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(294);
								match(T__5);
								setState(295);
								((ExpressionContext)_localctx).e2 = expression(0);
								setState(296);
								match(T__6);
								 ((ExpressionContext)_localctx).ast =  new ArrayIndexing(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
								}
								} 
							}
							setState(303);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						}
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(309);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(311);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(313);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(315);
				match(T__8);
				setState(316);
				((ExpressionContext)_localctx).type = type();
				setState(317);
				match(T__9);
				setState(318);
				((ExpressionContext)_localctx).e1 = expression(7);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 7:
				{
				setState(321);
				match(T__8);
				setState(322);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(323);
				match(T__9);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 8:
				{
				setState(326);
				match(OP_NEG);
				setState(327);
				((ExpressionContext)_localctx).e1 = expression(1);
				 ((ExpressionContext)_localctx).ast =  new Negation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
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
						setState(334);
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
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
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
						setState(339);
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
						setState(342);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(343);
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
						setState(344);
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
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
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
						setState(349);
						((ExpressionContext)_localctx).e2 = expression(3);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(357);
			((ArgumentsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(359);
				match(T__4);
				setState(360);
				((ArgumentsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
				}
				}
				setState(367);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0173\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7y\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0086\n\7\f"+
		"\7\16\7\u0089\13\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cb\n\n\f\n\16"+
		"\n\u00ce\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d9\n\n\f\n\16"+
		"\n\u00dc\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00fd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u0109\n\f\f\f\16\f\u010c\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0114\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u011d\n\16\f\16\16\16\u0120"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u012e\n\16\f\16\16\16\u0131\13\16\7\16\u0133\n\16\f\16\16\16\u0136\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u014d\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0163\n\16\f\16\16\16\u0166\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u016e\n\17\f\17\16\17\u0171\13\17\3\17\2\3\32\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2\27\31\3\2\32\33\3\2\34!\3"+
		"\2\"#\2\u0194\2,\3\2\2\2\4D\3\2\2\2\6J\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\f"+
		"x\3\2\2\2\16\u009e\3\2\2\2\20\u00b1\3\2\2\2\22\u00f1\3\2\2\2\24\u00fc"+
		"\3\2\2\2\26\u00fe\3\2\2\2\30\u0113\3\2\2\2\32\u014c\3\2\2\2\34\u0167\3"+
		"\2\2\2\36\37\5\b\5\2\37 \b\2\1\2 +\3\2\2\2!\"\5\f\7\2\"#\b\2\1\2#+\3\2"+
		"\2\2$%\5\4\3\2%&\b\2\1\2&+\3\2\2\2\'(\5\6\4\2()\b\2\1\2)+\3\2\2\2*\36"+
		"\3\2\2\2*!\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2"+
		"-/\3\2\2\2.,\3\2\2\2/\60\5\16\b\2\60?\b\2\1\2\61\62\5\b\5\2\62\63\b\2"+
		"\1\2\63>\3\2\2\2\64\65\5\f\7\2\65\66\b\2\1\2\66>\3\2\2\2\678\5\4\3\28"+
		"9\b\2\1\29>\3\2\2\2:;\5\6\4\2;<\b\2\1\2<>\3\2\2\2=\61\3\2\2\2=\64\3\2"+
		"\2\2=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3"+
		"\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\7\3\2\2EF\5\24\13\2FG\7\63\2\2GH\7\4\2\2"+
		"HI\b\3\1\2I\5\3\2\2\2JK\7\5\2\2KL\5\b\5\2LM\7\6\2\2MN\7\63\2\2NO\7\4\2"+
		"\2OP\b\4\1\2P\7\3\2\2\2QR\5\24\13\2RS\7\63\2\2SY\b\5\1\2TU\7\7\2\2UV\7"+
		"\63\2\2VX\b\5\1\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2["+
		"Y\3\2\2\2\\]\7\4\2\2]d\3\2\2\2^_\5\n\6\2_`\7\63\2\2`a\7\4\2\2ab\b\5\1"+
		"\2bd\3\2\2\2cQ\3\2\2\2c^\3\2\2\2d\t\3\2\2\2ef\5\24\13\2fg\7\b\2\2gh\7"+
		"(\2\2hi\7\t\2\2ip\b\6\1\2jk\7\b\2\2kl\7(\2\2lm\7\t\2\2mo\b\6\1\2nj\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\7\n\2\2ty\b"+
		"\7\1\2uv\5\24\13\2vw\b\7\1\2wy\3\2\2\2xs\3\2\2\2xu\3\2\2\2yz\3\2\2\2z"+
		"{\7\63\2\2{|\7\13\2\2|\u008c\b\7\1\2}~\5\24\13\2~\177\7\63\2\2\177\u0087"+
		"\b\7\1\2\u0080\u0081\7\7\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\63\2"+
		"\2\u0083\u0084\b\7\1\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a}\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0099\7\62\2\2\u0091\u0092\5\b\5\2\u0092\u0093\b\7\1\2"+
		"\u0093\u0098\3\2\2\2\u0094\u0095\5\22\n\2\u0095\u0096\b\7\1\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7\6\2\2\u009d\r\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\b\b\1\2"+
		"\u00a3\u00ac\7\62\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\b\b\1\2\u00a6\u00ab"+
		"\3\2\2\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\b\b\1\2\u00a9\u00ab\3\2\2\2"+
		"\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\6\2\2\u00b0\17\3\2\2\2\u00b1\u00b8\7\62\2\2\u00b2\u00b3\5\22"+
		"\n\2\u00b3\u00b4\b\t\1\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\5\b\5\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7\6\2\2\u00bc\21\3\2\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\7\r"+
		"\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\b\n\1\2\u00c2"+
		"\u00f2\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00cc"+
		"\b\n\1\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\b\n\1\2"+
		"\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\u00f2\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\5"+
		"\32\16\2\u00d3\u00da\b\n\1\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5\32\16\2"+
		"\u00d6\u00d7\b\n\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\4\2\2\u00de\u00f2\3\2\2\2\u00df\u00e0\7\20"+
		"\2\2\u00e0\u00e1\7\13\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\7\f\2\2\u00e3"+
		"\u00e4\5\20\t\2\u00e4\u00e5\b\n\1\2\u00e5\u00f2\3\2\2\2\u00e6\u00e7\5"+
		"\26\f\2\u00e7\u00e8\b\n\1\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea"+
		"\u00eb\5\32\16\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed\b\n\1\2\u00ed\u00f2\3"+
		"\2\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0\7\4\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00bd\3\2\2\2\u00f1\u00c3\3\2\2\2\u00f1\u00d1\3\2\2\2\u00f1\u00df\3\2"+
		"\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2"+
		"\23\3\2\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00fd\b\13\1\2\u00f5\u00f6\7\22"+
		"\2\2\u00f6\u00fd\b\13\1\2\u00f7\u00f8\7\23\2\2\u00f8\u00fd\b\13\1\2\u00f9"+
		"\u00fa\7\24\2\2\u00fa\u00fb\7\63\2\2\u00fb\u00fd\b\13\1\2\u00fc\u00f3"+
		"\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"\25\3\2\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\5\32"+
		"\16\2\u0101\u0102\7\f\2\2\u0102\u0103\5\30\r\2\u0103\u010a\b\f\1\2\u0104"+
		"\u0105\7\26\2\2\u0105\u0106\5\30\r\2\u0106\u0107\b\f\1\2\u0107\u0109\3"+
		"\2\2\2\u0108\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\27\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\20\t"+
		"\2\u010e\u010f\b\r\1\2\u010f\u0114\3\2\2\2\u0110\u0111\5\22\n\2\u0111"+
		"\u0112\b\r\1\2\u0112\u0114\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2"+
		"\2\2\u0114\31\3\2\2\2\u0115\u0116\b\16\1\2\u0116\u0117\7\63\2\2\u0117"+
		"\u0118\7\13\2\2\u0118\u011e\b\16\1\2\u0119\u011a\5\34\17\2\u011a\u011b"+
		"\b\16\1\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u014d\7\f\2\2\u0122\u0123\7\63\2\2\u0123\u0134\b\16\1\2"+
		"\u0124\u0125\7\b\2\2\u0125\u0126\5\32\16\2\u0126\u0127\7\t\2\2\u0127\u012f"+
		"\b\16\1\2\u0128\u0129\7\b\2\2\u0129\u012a\5\32\16\2\u012a\u012b\7\t\2"+
		"\2\u012b\u012c\b\16\1\2\u012c\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0124\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u014d\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7(\2\2\u0138\u014d\b\16\1\2\u0139\u013a\7)\2\2\u013a"+
		"\u014d\b\16\1\2\u013b\u013c\7*\2\2\u013c\u014d\b\16\1\2\u013d\u013e\7"+
		"\13\2\2\u013e\u013f\5\24\13\2\u013f\u0140\7\f\2\2\u0140\u0141\5\32\16"+
		"\t\u0141\u0142\b\16\1\2\u0142\u014d\3\2\2\2\u0143\u0144\7\13\2\2\u0144"+
		"\u0145\5\32\16\2\u0145\u0146\7\f\2\2\u0146\u0147\b\16\1\2\u0147\u014d"+
		"\3\2\2\2\u0148\u0149\7.\2\2\u0149\u014a\5\32\16\3\u014a\u014b\b\16\1\2"+
		"\u014b\u014d\3\2\2\2\u014c\u0115\3\2\2\2\u014c\u0122\3\2\2\2\u014c\u0137"+
		"\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u013b\3\2\2\2\u014c\u013d\3\2\2\2\u014c"+
		"\u0143\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u0164\3\2\2\2\u014e\u014f\f\7"+
		"\2\2\u014f\u0150\t\2\2\2\u0150\u0151\5\32\16\b\u0151\u0152\b\16\1\2\u0152"+
		"\u0163\3\2\2\2\u0153\u0154\f\6\2\2\u0154\u0155\t\3\2\2\u0155\u0156\5\32"+
		"\16\7\u0156\u0157\b\16\1\2\u0157\u0163\3\2\2\2\u0158\u0159\f\5\2\2\u0159"+
		"\u015a\t\4\2\2\u015a\u015b\5\32\16\6\u015b\u015c\b\16\1\2\u015c\u0163"+
		"\3\2\2\2\u015d\u015e\f\4\2\2\u015e\u015f\t\5\2\2\u015f\u0160\5\32\16\5"+
		"\u0160\u0161\b\16\1\2\u0161\u0163\3\2\2\2\u0162\u014e\3\2\2\2\u0162\u0153"+
		"\3\2\2\2\u0162\u0158\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\33\3\2\2\2\u0166\u0164\3\2\2"+
		"\2\u0167\u0168\5\32\16\2\u0168\u016f\b\17\1\2\u0169\u016a\7\7\2\2\u016a"+
		"\u016b\5\32\16\2\u016b\u016c\b\17\1\2\u016c\u016e\3\2\2\2\u016d\u0169"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\35\3\2\2\2\u0171\u016f\3\2\2\2\37*,=?Ycpx\u0087\u008c\u0097\u0099\u00aa"+
		"\u00ac\u00b6\u00b8\u00cc\u00da\u00f1\u00fc\u010a\u0113\u011e\u012f\u0134"+
		"\u014c\u0162\u0164\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}