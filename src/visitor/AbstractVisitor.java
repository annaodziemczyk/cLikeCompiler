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

	// * A Symbol Table to store the variables defined (VarDefinitions)
	protected SymbolTable st = new SymbolTable();
	
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
//		write.getExpression().accept(this, param);
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
//		arithmetic.getOperand1().accept(this, param);
//		arithmetic.getOperand2().accept(this, param);
		return null;
	}

	@Override
	public TR visit(Comparision comparision, TP param) {
//		comparision.getOperand1().accept(this, param);
//		comparision.getOperand2().accept(this, param);
		return null;
	}

	@Override
	public TR visit(CharLiteral charLiteral, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Logical logical, TP param) {
//		logical.getOperand1().accept(this, param);
//		logical.getOperand2().accept(this, param);
		return null;
	}

	@Override
	public TR visit(Negation negation, TP param) {
		negation.accept(this, param);
		return null;
	}

	@Override
	public TR visit(VoidType voidype, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(CharType charType, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(FunctionDefinition functionDefinition, TP param) {
//		functionDefinition.getType().accept(this, param);
//		
//		for(Statement statement: functionDefinition.getFunctionBody())
//		{
//			statement.accept(this, param);
//		}

		return null;
	}

	@Override
	public TR visit(WhileStatement whileStatement, TP param) {
//		whileStatement.getExpression().accept(this, param);
//		for(Statement statement: whileStatement.getStatements())
//		{
//			statement.accept(this, param);
//		}
		return null;
	}

	@Override
	public TR visit(IfElseStatement ifElseStatement, TP param) {
		
//		ifElseStatement.getCondition().accept(this, param);
//		
//		for(Statement statement: ifElseStatement.getIfBody())
//		{
//			statement.accept(this, param);
//		}
//		
//		for(Statement statement: ifElseStatement.getElseBody())
//		{
//			statement.accept(this, param);
//		}
		
		return null;
	}

	@Override
	public TR visit(Cast cast, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Read read, TP param) {
//		read.getExpression().accept(this, param);
		return null;
	}


	@Override
	public TR visit(FunctionCall functionCall, TP param) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TR visit(ReturnStatement returnStatement, TP param) {
//		returnStatement.getExpression().accept(this, param);
		return null;
	}

	@Override
	public TR visit(TypeDefinition e, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Record e, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(ArrayIndexing e, Void param) {
		// TODO Auto-generated method stub
		return null;
	}


}
