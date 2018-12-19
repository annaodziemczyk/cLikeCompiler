/**
  * Second pass of semantic analysis.
  * Infers the type of every (sub)expression in the program,
  * and assigns the inferred type to the expression AST node.
  * 
  * @author  Francisco Ortin
  */

package semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.*;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(Arithmetic exp, Void param) {
		
//		if(exp.getOperand1().getType()==null) {
//			new ErrorType("Error", exp);
//		}
		exp.getOperand1().accept(this,null);
		exp.getOperand2().accept(this,null);
//		exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
		return null;
	}
	
	@Override
	public Void visit(ArrayIndexing arrayIndexing, Void param) {
		
		arrayIndexing.getIndex1().accept(this, null);
		
		if(arrayIndexing.getIndex2()!=null)
			arrayIndexing.getIndex2().accept(this, null);
		
		
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		
		if(variable.getDefinition()!=null) {
			variable.setType(variable.getDefinition().getType());
		}

		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		intLiteral.setType(IntType.getInstance());
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		realLiteral.setType(RealType.getInstance());
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
	
		if(assignment.getLeftHandSide() instanceof Arithmetic) {
			new ErrorType("Error", assignment);
		}else if(assignment.getLeftHandSide().getType() instanceof IntType) {
			new ErrorType("Error", assignment);
		}
	
		assignment.getLeftHandSide().accept(this,null);
		assignment.getRightHandSide().accept(this,null);

//		assignment.getLeftHandSide().getType()
//				.assignment(assignment.getRightHandSide().getType(), assignment);
		return null;
	}
	
	@Override
	public Void visit(Cast cast, Void param) {
		
		cast.getExpression().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(CharLiteral charLiteral, Void param) {
		charLiteral.setType(CharType.getInstance());
		return null;
	}
	
	@Override
	public Void visit(Comparision comparision, Void param) {
		comparision.getOperand1().accept(this, null);
		comparision.getOperand2().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(FunctionCall functionCall, Void param) {
		for(Expression exp:functionCall.getExpressions())
			exp.accept(this, param);
		
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		
		for(Statement statement : functionDefinition.getFunctionBody())
			statement.accept(this, null);
		
		for(VarDefinition varDefinition:functionDefinition.getVariables())
			varDefinition.accept(this, null);
		
		return null;
	}
	
	@Override
	public Void visit(IfElseStatement ifElse, Void param) {
		
		ifElse.getCondition().accept(this, null);
		
		for(Statement statement: ifElse.getIfBody())
			statement.accept(this, null);
		
		for(Statement statement:ifElse.getElseBody())
			statement.accept(this, param);
		
		return null;
	}
	
	@Override
	public Void visit(Logical logical, Void param) {
		logical.getOperand1().accept(this, null);
		logical.getOperand2().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(Negation negation, Void param) {
		
		negation.getExpression().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
	
		for(Expression expression : read.getExpressions()) {
			
			if(expression instanceof Arithmetic) {
				new ErrorType("Error", expression);
			}else {
				expression.accept(this, null);
			}
			
		}
			
		
		return null;
	}
	
	@Override
	public Void visit(Record record, Void param) {
		
		return null;
	}
	
	@Override
	public Void visit(ReturnStatement returnStatement, Void param) {
		
		returnStatement.getExpression().accept(this, param);		
		return null;
	}
	
	@Override
	public Void visit(TypeDefinition typeDefinition, Void param) {
		return null;
	}
	
	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		return null;
	}
	
	@Override
	public Void visit(WhileStatement whileStatement, Void param) {
		
		for(Statement statement:whileStatement.getStatements())
			statement.accept(this, param);
		
		return null;
	}
	
	@Override
	public Void visit(Write writeStatement, Void param) {
		for(Expression expression : writeStatement.getExpressions()) {
			expression.accept(this, param);
		}
		return null;
	}
	
	public Void visit(Program program, Void param) {
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

}