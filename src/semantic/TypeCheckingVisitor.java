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
	
//	@Override
//	public Void visit(ArrayIndexing arrayIndexing, Void param) {
//		
//		Definition definition = st.find(arrayIndexing.getName());
//		 
//		 if(definition!=null) {
//			 arrayIndexing.setDefinition((VarDefinition)definition);
//			 if(!(((VarDefinition)definition).getType() instanceof ArrayType)) {
//				new ErrorType("Variable '" + arrayIndexing.getName() + "' not an array", arrayIndexing);
//			 }else {
//				 arrayIndexing.getIndex1().accept(this, null);
//				if(arrayIndexing.getIndex2()!=null) {
//					arrayIndexing.getIndex2().accept(this, null);
//				}else {
//					arrayIndexing.getType().squareBrackets(type, astNode)
//				}
//			 }
//	
//			 
//		 }else {
//			new ErrorType("Variable '" + arrayIndexing.getName() + "' not declared", arrayIndexing);
//		}
//		 
//	
//
//		
//		return null;
//	}

	@Override
	public Void visit(Variable variable, Void param) {
		
		Definition definition = this.st.find(variable.getName());
		
		if(definition!=null && definition instanceof VarDefinition) {
			
			variable.setDefinition((VarDefinition)definition);
			variable.setType(((VarDefinition)definition).getType());
	
			if(variable instanceof ArrayIndexing) {
				if(!(((VarDefinition)definition).getType() instanceof ArrayType)) {
					new ErrorType("Variable '" + variable.getName() + "' is not an array", variable);
				}
				ArrayIndexing arrayIndexing =(ArrayIndexing)variable;
				arrayIndexing.getIndex1().accept(this, param);
				variable.setType(((VarDefinition)definition).getType().squareBrackets(arrayIndexing.getIndex1().getType(), variable));

				if(arrayIndexing.getIndex2()!=null) {
					arrayIndexing.getIndex2().accept(this, param);	
					
					if(!(arrayIndexing.getIndex1() instanceof ArrayType)) {
						new ErrorType(String.format("%s [%s] is not an array", variable.getName(), ((ArrayIndexing) variable).getIndex1()), variable);
					}

				}
				
				
				
			}
			
			
		}else {
			new ErrorType("Variable '" + variable.getName() + "' not declared", variable);
		}
		
//		if(variable instanceof ArrayIndexing) {
//			this.visit((ArrayIndexing)variable, param);
//		}
//		

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
		}else if(assignment.getLeftHandSide().getType()!=assignment.getRightHandSide().getType()) {
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
		
		Definition definition = st.find(functionCall.getName());
		if(definition instanceof FunctionDefinition) {
			functionCall.setFunctionDefinition((FunctionDefinition)definition);
		}
	
		
		if(functionCall.getFunctionDefinition()!=null) {
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
			
		}
		
		
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {

		if(st.find(functionDefinition.getName())==null)
			st.insert(functionDefinition);
		
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
		if(st.find(varDefinition.getName())==null)
			st.insert(varDefinition);
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