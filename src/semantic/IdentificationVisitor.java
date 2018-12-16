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

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {
	
	// * A Symbol Table to store the variables defined (VarDefinitions)
	private Map<String,VarDefinition> st = new HashMap<String,VarDefinition>();

	@Override
	public Void visit(Variable variable, Void param) {
		// * Identification of the node where the variable was defined
		variable.setDefinition(st.get(variable.getName()));
		// * If there is no definition, an error type is created 
		if (variable.getDefinition() == null)
			variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(), variable.getName(),
					new ErrorType("Identifier "+variable.getName()+" not defined",variable)));
		return null;
	}

	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		// * A variable with the same name cannot be declared before
		if (st.get(varDefinition.getName()) != null) 
			new ErrorType("The identifier " + varDefinition.getName()
					+ " has already been defined in this scope", varDefinition);
		else
			// * We add the variable definition to the symbol table
			st.put(varDefinition.getName(), varDefinition);
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
	public Void visit(FunctionCall e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition e, Void param) {
		return null;
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
	public Void visit(Read e, Void param) {
		return null;
	}
	
	@Override
	public Void visit(Program e, Void param) {
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
