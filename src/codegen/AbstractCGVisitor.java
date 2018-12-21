/**
  * Default implementation of the Visitor design pattern for code generation.
  * A runtime error is generated, indicated that the code generation template has not been defined.
  * 
  * @author  Francisco Ortin
  */

package codegen;

import types.*;
import visitor.Visitor;
import ast.*;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

	/**
	 * Handles the code generation responsibilities
	 */
	protected CG cg;

	public CG getCG() {
		return this.cg;
	}
	
	public AbstractCGVisitor(CG cg) {
		this.cg=cg;
	}
	
	@Override	
	public TR visit(Variable variable, TP param) {
		throw new IllegalStateException("Code generation template \"Variable\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(IntLiteral intLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"IntLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(RealLiteral realLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"RealLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public TR visit(Assignment assignment, TP param) {
		throw new IllegalStateException("Code generation template \"Assignment\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(Write write, TP param) {
		throw new IllegalStateException("Code generation template \"Write\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(Program program, TP param) {
		throw new IllegalStateException("Code generation template \"Program\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(VarDefinition varDefinition, TP param) {
		throw new IllegalStateException("Code generation template \"VarDefinition\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(IntType intType, TP param) {
		throw new IllegalStateException("Code generation template \"IntType\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(ErrorType errorType, TP param) {
		throw new IllegalStateException("Code generation template \"ErrorType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(RealType realType, TP param) {
		throw new IllegalStateException("Code generation template \"RealType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(Arithmetic arithmetic, TP param) {
		throw new IllegalStateException("Code generation template \"Arithmetic\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public TR visit(ReturnStatement returnStatement, TP param) {
		throw new IllegalStateException("Code generation template \"ReturnStatement\" not defined for the code function " +
				this.getClass().getName()); 
	}	
	 
	@Override
	 public TR visit(Comparision comparision, TP param){
		throw new IllegalStateException("Code generation template \"Comparision\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	 public TR visit(Logical logical, TP param){
		throw new IllegalStateException("Code generation template \"Logical\" not defined for the code function " +
				this.getClass().getName()); 
	}
	 
	@Override
	 public TR visit(Negation Negation, TP param){
		throw new IllegalStateException("Code generation template \"Negation\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	 public TR visit(CharLiteral charLiteral, TP param){
		throw new IllegalStateException("Code generation template \"CharLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}	

	@Override
	 public TR visit(Cast cast, TP param){
		throw new IllegalStateException("Code generation template \"Cast\" not defined for the code function " +
				this.getClass().getName()); 
	}
	 
	@Override
	 public TR visit(FunctionCall functionCall, TP param){
		throw new IllegalStateException("Code generation template \"FunctionCall\" not defined for the code function " +
				this.getClass().getName()); 
	}
	 
	@Override
	 public TR visit(TypeDefinition typeDefiniton, TP param){
		throw new IllegalStateException("Code generation template \"TypeDefinition\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	 public TR visit(Record e, TP param){
		throw new IllegalStateException("Code generation template \"Record\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	 public TR visit(ArrayIndexing e, TP param){
		throw new IllegalStateException("Code generation template \"ArrayIndexing\" not defined for the code function " +
				this.getClass().getName()); 
	}
	 
	@Override
	 public TR visit(Read read, TP param){
		throw new IllegalStateException("Code generation template \"Read\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public  TR visit(FunctionDefinition functionDefinition, TP param){
		throw new IllegalStateException("Code generation template \"FunctionDefinition\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public  TR visit(WhileStatement whileStatement, TP param){
		throw new IllegalStateException("Code generation template \"WhileStatement\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public  TR visit(IfElseStatement IfElseStatement, TP param){
		throw new IllegalStateException("Code generation template \"IfElseStatement\" not defined for the code function " +
				this.getClass().getName()); 
	}	

	@Override
	 public TR visit(CharType charType, TP param){
		throw new IllegalStateException("Code generation template \"CharType\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	 public TR visit(VoidType voidType, TP param){
		throw new IllegalStateException("Code generation template \"VoidType\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public TR visit(KeywordType keywordType, TP param) {
		throw new IllegalStateException("Code generation template \"KeywordType\" not defined for the code function " +
				this.getClass().getName()); 
	}
	

}
