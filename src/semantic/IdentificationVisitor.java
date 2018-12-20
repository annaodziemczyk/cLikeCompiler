/**
  * First pass of semantic analysis.
  * Links every variable usage with its definition.
  * 
  * @author  Francisco Ortin
  */
package semantic;

import java.util.*;

import types.*;
import visitor.*;
import ast.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {
	
	@Override
	public Void visit(Variable variable, Void param) {
		
		Definition definition = st.find(variable.getName());
		// * Identification of the node where the variable was defined
		if(definition instanceof VarDefinition) {
			variable.setDefinition((VarDefinition)definition);
		}
		
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
	public Void visit(Arithmetic exp, Void param) {
		return null;
	}
	
	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		return null;		
	}
	
	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		return null;
		
	}
	
	@Override
	public Void visit(Cast e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(CharLiteral e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Comparision e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(FunctionCall functionCall, Void param) {

		Definition definition=st.find(functionCall.getName());
		
		if (definition == null)
				new ErrorType("Function '"+functionCall.getName()+"' not defined",functionCall);
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
//		boolean argsMatch=false;
//		if(definition instanceof FunctionDefinition) {
//			argsMatch= ((FunctionType)((FunctionDefinition)definition).getType()).getParamType().containsAll(functionType.getParamType());
//		}
		return definition!=null;
	}
	
	@Override
	public Void visit(IfElseStatement e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Logical e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Negation e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
		for(Expression expression:read.getExpressions())
			expression.accept(this, null);
		
		return null;
	}
	
	@Override
	public Void visit(Program program, Void param) {
		for(VarDefinition varDefinition: program.getVarDefinitions())
			varDefinition.accept(this, null);
		for(TypeDefinition typeDefinition: program.getTypeDefs())
			typeDefinition.accept(this, null);
		for(Record record: program.getStructDefs())
			record.accept(this, null);		
		for(FunctionDefinition functionDefinition: program.getFunctionDefinitions()) {
			functionDefinition.accept(this, null);
		}			
		return null;
	}
	
	@Override
	public Void visit(Record e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(ReturnStatement e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(TypeDefinition e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(WhileStatement e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Write e, Void param) {
		return null;
	}

}
