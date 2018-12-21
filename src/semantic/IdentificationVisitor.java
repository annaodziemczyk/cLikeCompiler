package semantic;

import java.util.*;

import types.*;
import visitor.*;
import ast.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {
	
	// * A Symbol Table to store the variables defined (VarDefinitions)
	protected SymbolTable st = new SymbolTable();
	
	@Override
	public Void visit(Variable variable, Void param) {
		
		Definition definition = st.find(variable.getName());

		// * If there is no definition, an error type is created 
		if (definition ==null)
				new ErrorType("Variable '"+variable.getName()+"' not defined",variable);
		else if(definition instanceof VarDefinition)
			variable.setDefinition((VarDefinition)definition);
		else
			// * Identification of the node where the variable was defined
			new ErrorType("Variable '"+variable.getName()+"' not defined",variable);

			
		return null;
	}
	
	@Override
	public Void visit(ArrayIndexing variable, Void param) {
		
		Definition definition = st.find(variable.getName());

		// * Identification of the node where the variable was defined
		variable.setDefinition((VarDefinition)definition);
		
		// * If there is no definition, an error type is created 
		if (variable.getDefinition() == null)
			variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(), variable.getName(),
					new ErrorType("Variable '"+variable.getName()+"' not defined",variable)));
		return null;
	}

	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		
		// * A variable with the same name cannot be declared before
		if (this.isAlreadyDefined(varDefinition.getName(),st.getScope())) 
			new ErrorType("The identifier '" + varDefinition.getName()
					+ "' has already been defined in this scope", varDefinition);
		else
			// * We add the variable definition to the symbol table
			st.insert(varDefinition);
		return null;
	}
	
	
	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		
		arithmetic.getOperand1().accept(this, null);
		arithmetic.getOperand2().accept(this, null);
		
		return null;
	}
	
	
	@Override
	public Void visit(Cast cast, Void param) {
		cast.getExpression().accept(this, null);
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

		Definition definition=st.find(functionCall.getName());
		
		if (definition == null)
				new ErrorType("Function '"+functionCall.getName()+"' not defined",functionCall);
		else
			functionCall.setFunctionDefinition((FunctionDefinition)definition);
		
		for(Expression exp:functionCall.getExpressions()) {
			exp.accept(this, null);
		}
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		
		if (this.isAlreadyDefined(functionDefinition.getName())) {
			new ErrorType("Function '" + functionDefinition.getName()
			+ "' has already been defined", functionDefinition);
		}else {
			st.insert(functionDefinition);
		}
		
		st.set();
		
		for(VarDefinition var:functionDefinition.getVariables()) {		
			var.accept(this, null);
		}
			
	
		for(Statement statement:functionDefinition.getFunctionBody()) {
			statement.accept(this, null);			
		}
		
		st.reset();

		
		return null;
	}
	
	private boolean isAlreadyDefined(String name, int scope) {
		Definition definition=st.find(name);
	
		return definition!=null && definition.getScope()==scope;
	}
	
	private boolean isAlreadyDefined(String name) {
		Definition definition=st.find(name);

		return definition!=null;
	}
	
	@Override
	public Void visit(IfElseStatement ifElse, Void param) {
		
		ifElse.getCondition().accept(this, null);
		
		for(Statement st:ifElse.getIfBody()) {
			st.accept(this, null);
		}
		
		for(Statement st:ifElse.getElseBody()) {
			st.accept(this, null);
		}
		
		return null;
	}
	
	@Override
	public Void visit(Logical logical, Void param) {
		logical.getOperand1().accept(this, null);
		logical.getOperand2().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(Negation neg, Void param) {
		neg.getExpression().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
		for(Expression expression:read.getExpressions())
			expression.accept(this, null);
		
		return null;
	}
	
	@Override
	public Void visit(Assignment assignment, Void param) {
		assignment.getLeftHandSide().accept(this, null);
		assignment.getRightHandSide().accept(this, null);
		return null;
	}

	
	@Override
	public Void visit(Record record, Void param) {
		for(TypeDefinition typeDef:record.getFields().values()) {
			typeDef.accept(this, null);
		}
		return null;
	}
	
	@Override
	public Void visit(ReturnStatement returnStatement, Void param) {
		returnStatement.getExpression().accept(this, null);
		return null;
	}
	
	@Override
	public Void visit(WhileStatement whileStatement, Void param) {
		whileStatement.getExpression().accept(this, null);
		for(Statement statement:whileStatement.getStatements()) {
			statement.accept(this, null);
		}
		return null;
	}
	
	@Override
	public Void visit(Write write, Void param) {
		for(Expression exp:write.getExpressions()) {
			exp.accept(this, null);
		}
		return null;
	}

	
	@Override
	public Void visit(TypeDefinition typeDefition, Void param) {
		typeDefition.getType().accept(this, null);
		return null;
	}
	

	@Override
	public Void visit(KeywordType keyword, Void param) {
		
		Type keywordType=st.findKeyword(keyword.getKeyword());
		if(keywordType==null) {
			st.addKeyword(keyword);
		}else {
			new ErrorType(String.format(
					"Type has already been defined for keyword %s", keyword),
					keyword);
		}
		return null;
	}




}
