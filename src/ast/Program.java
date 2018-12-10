package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class Program extends AbstractASTNode {

	/**
	 * Global variables
	 */
	private List<VarDefinition> varDefinitions;
	public List<VarDefinition> getVarDefinitions() {
		return this.varDefinitions;
	}

	private List<FunctionDefinition> functionDefinitions;
	
		
	public List<FunctionDefinition> getFunctionDefinitions() {
		return functionDefinitions;
	}

	public Program(int line, int column, List<VarDefinition> varDefinitions, List<FunctionDefinition> functionDefinitions) {
		super(line, column);
		this.varDefinitions = varDefinitions;
		this.functionDefinitions = functionDefinitions;
	}
	
	public Program(int line, int column, List<FunctionDefinition> functionDefinitions) {
		super(line, column);
		this.functionDefinitions = functionDefinitions;
	}
	
	public Program(int line, int column, FunctionDefinition functionDefinition) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		functionDefinitions.add(functionDefinition);
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	@Override
	public String toString() {
		return String.format("Program with %d variable definitions and %d functions.", 
								this.varDefinitions.size(), this.functionDefinitions.size());
	}

}
