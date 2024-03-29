/**
  * Default implementation of the Visitor interface. 
  * The default traversal provided is depth first.
  * 
  * @author  Francisco Ortin
  */

package visitor;

import types.*;
import ast.*;
import symboltable.SymbolTable;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

	@Override
	public TR visit(Program program, TP param) {
		for(VarDefinition varDefinition: program.getVarDefinitions())
			varDefinition.accept(this, null);
		for(TypeDefinition typeDefinition: program.getTypeDefs())
			typeDefinition.accept(this, null);
		for(Record record: program.getStructDefs())
			record.accept(this, null);		
		for(FunctionDefinition functionDefinition: program.getFunctionDefinitions())
			functionDefinition.accept(this, null);
		return null;
	}

	@Override
	public TR visit(Variable variable, TP param) {
		return null;
	}

	@Override
	public TR visit(IntLiteral intLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(RealLiteral realLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(Assignment assignment, TP param) {
		return null;
	}


	@Override
	public TR visit(Write write, TP param) {
		return null;
	}
	
	@Override
	public TR visit(VarDefinition varDefinition, TP param) {
		return null;
	}


	@Override
	public TR visit(IntType intType, TP param) {
		return null;
	}

	@Override
	public TR visit(ErrorType errorType, TP param) {
		return null;
	}

	@Override
	public TR visit(RealType realType, TP param) {
		return null;
	}

	@Override
	public TR visit(Arithmetic arithmetic, TP param) {
		return null;
	}

	@Override
	public TR visit(Comparision comparision, TP param) {
		return null;
	}

	@Override
	public TR visit(CharLiteral charLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(Logical logical, TP param) {
		return null;
	}

	@Override
	public TR visit(Negation negation, TP param) {
		negation.accept(this, param);
		return null;
	}

	@Override
	public TR visit(VoidType voidype, TP param) {
		return null;
	}

	@Override
	public TR visit(CharType charType, TP param) {
		return null;
	}

	@Override
	public TR visit(FunctionDefinition functionDefinition, TP param) {
		return null;
	}

	@Override
	public TR visit(WhileStatement whileStatement, TP param) {
		return null;
	}

	@Override
	public TR visit(IfElseStatement ifElseStatement, TP param) {
		return null;
	}

	@Override
	public TR visit(Cast cast, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Read read, TP param) {
		return null;
	}


	@Override
	public TR visit(FunctionCall functionCall, TP param) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TR visit(ReturnStatement returnStatement, TP param) {
		return null;
	}

	@Override
	public TR visit(TypeDefinition e, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Record e, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(ArrayIndexing e, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(KeywordType keywordType, TP param) {
		// TODO Auto-generated method stub
		return null;
	}


}
