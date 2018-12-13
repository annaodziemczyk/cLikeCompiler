package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class Program extends AbstractASTNode {

	/**
	 * Global variables
	 */
	private List<VarDefinition> varDefinitions;


	private List<FunctionDefinition> functionDefinitions;

	public Program(int line, int column, FunctionDefinition mainFunction) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		if(mainFunction!=null) {
			this.functionDefinitions.add(mainFunction);
		}
		
	}
	
	public Program(int line, int column, VarDefinition varDefinition) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		if(varDefinition!=null) {
			this.varDefinitions.add(varDefinition);
		}
		
	}
	
	public Program(int line, int column, FunctionDefinition mainFunction, VarDefinition varDefinition) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		if(mainFunction!=null) {
			this.functionDefinitions.add(mainFunction);
		}
		
		if(varDefinition!=null) {
			this.varDefinitions.add(varDefinition);
		}
		
	}
	
	public Program(int line, int column, FunctionDefinition mainFunction, FunctionDefinition functionDefinition) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		if(mainFunction!=null) {
			this.functionDefinitions.add(mainFunction);
		}
		
		if(functionDefinition!=null) {
			this.functionDefinitions.add(functionDefinition);
		}
		
	}
	
	public Program(int line, int column, FunctionDefinition mainFunction, VarDefinition varDefinition, FunctionDefinition functionDefinition) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		
		if(mainFunction!=null) {
			this.functionDefinitions.add(mainFunction);
		}
		
		if(functionDefinition!=null) {
			this.functionDefinitions.add(functionDefinition);
		}
		
		if(varDefinition!=null) {
			this.varDefinitions.add(varDefinition);
		}
		
	}
	
	public List<VarDefinition> getVarDefinitions() {
		return this.varDefinitions;
	}
	
	public List<FunctionDefinition> getFunctionDefinitions() {
		return functionDefinitions;
	}
	
	public void addFunctionDefinition(FunctionDefinition functionDef) {
		this.functionDefinitions.add(functionDef);
	}
	
	public void addVarDefinition(VarDefinition varDef) {		
		this.varDefinitions.add(varDef);
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
