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
		
		exp.getOperand1().accept(this,null);
		exp.getOperand2().accept(this,null);
		if(exp.getOperand1().getType()!=null&&exp.getOperand2().getType()!=null)
			exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
		return null;
	}


	@Override
	public Void visit(Variable variable, Void param) {

		if(variable.getDefinition()!=null)
		variable.setType(variable.getDefinition().getType());

		return null;
	}
	
	@Override
	public Void visit(ArrayIndexing arrayIndexing, Void param) {

		if(!(((VarDefinition)arrayIndexing.getDefinition()).getType() instanceof ArrayType)) {
			new ErrorType("Variable '" + arrayIndexing.getName() + "' is not an array", arrayIndexing);
		}

		arrayIndexing.getIndex1().accept(this, param);
		arrayIndexing.setType(((VarDefinition)arrayIndexing.getDefinition()).getType().squareBrackets(arrayIndexing.getIndex1().getType(), arrayIndexing));


		if(arrayIndexing.getIndex2()!=null) {
			arrayIndexing.getIndex2().accept(this, param);	
			
			if(!(arrayIndexing.getIndex1() instanceof ArrayType)) {
				new ErrorType(String.format("%s [%s] is not an array", arrayIndexing.getName(), ((ArrayIndexing)arrayIndexing).getIndex1()), arrayIndexing);
			}

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
			new ErrorType("lvalue required", assignment);
		}else if(assignment.getLeftHandSide() instanceof IntLiteral
				|| assignment.getLeftHandSide() instanceof CharLiteral
				|| assignment.getLeftHandSide() instanceof RealLiteral) {
			new ErrorType("lvalue required", assignment);
		}else {
			assignment.getLeftHandSide().accept(this,param);
			assignment.getRightHandSide().accept(this,param);

			assignment.getLeftHandSide().getType().assignment(assignment.getRightHandSide().getType(), assignment);
		}

		return null;
	}
	
	@Override
	public Void visit(Cast cast, Void param) {
		cast.setType(cast.getCastType());
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
		
		if(comparision.getOperand1().getType()!=null && comparision.getOperand2().getType()!=null) {
			comparision.getOperand1().getType().comparision(comparision.getOperand2().getType(), comparision);
		}
		return null;
	}
	
	@Override
	public Void visit(FunctionCall functionCall, Void param) {
		
		for(Expression exp:functionCall.getExpressions())
			exp.accept(this, param);

		List<Type> reqParams=((FunctionType)functionCall.getFunctionDefinition().getType()).getParamType();
		List<Expression>callArgs=functionCall.getExpressions();
		if(reqParams.size()!=callArgs.size()) {
			new ErrorType("Invalid number of params", functionCall);
		}else {
			for(int i=0;i<reqParams.size();i++) {
				Type type=reqParams.get(i);
				type.assignment(callArgs.get(i).getType(),functionCall);				
			}
		}

		
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {

		for(VarDefinition varDefinition:functionDefinition.getVariables()) {
			varDefinition.accept(this, param);
		}
	
		for(Statement statement : functionDefinition.getFunctionBody()) {
			statement.accept(this, param);
			if(statement instanceof ReturnStatement) {
				Type funcReturnType=((FunctionType)functionDefinition.getType()).getReturnType();
				Type returnType=((ReturnStatement) statement).getExpression().getType();
				funcReturnType.assignment(returnType, statement);
			}
		}
		

		return null;
	}
	
	@Override
	public Void visit(IfElseStatement ifElse, Void param) {
		
		ifElse.getCondition().accept(this, null);
		
		this.checkIfBooleanExpression(ifElse.getCondition());
		
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
		
		logical.getOperand1().getType().logical(logical.getOperand2().getType(), logical);
		return null;
	}
	
	@Override
	public Void visit(Negation negation, Void param) {
		
		negation.getExpression().accept(this, null);
		this.checkIfBooleanExpression(negation.getExpression());

		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
	
		for(Expression expression : read.getExpressions()) {
			
			if(expression instanceof Arithmetic) {
				new ErrorType("lvalue required", expression);
			}else {
				expression.accept(this, param);
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
		
		whileStatement.getExpression().accept(this, param);
		
		this.checkIfBooleanExpression(whileStatement.getExpression());
		
		for(Statement statement:whileStatement.getStatements())
			statement.accept(this, param);
		
		return null;
	}
	
	private void checkIfBooleanExpression(Expression expression) {
		if(expression.getType() instanceof IntType) {
			return;
		}
		
		String name="";
		if(expression instanceof Variable) {
			name=((Variable)expression).getName();
		}else if(expression instanceof FunctionCall) {
			name=((FunctionCall)expression).getName();
		}else if(expression.getType() != null) {
			name=expression.getType().toString();
		}
		
		new ErrorType(name + " is not int", expression);
	}
	
	@Override
	public Void visit(Write writeStatement, Void param) {
		for(Expression expression : writeStatement.getExpressions()) {
			expression.accept(this, param);
		}
		return null;
	}
	


}