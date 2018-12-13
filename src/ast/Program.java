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
	private List<TypeDefinition> typeDefs;

	public Program(int line, int column, FunctionDefinition functionDef) {
		super(line, column);
		this.varDefinitions = new ArrayList();
		this.functionDefinitions = new ArrayList();
		this.typeDefs=new ArrayList();
		this.functionDefinitions.add(functionDef);
		
	}
	
	public Program(int line, int column, List<VarDefinition> varDefinitions) {
		super(line, column);
		this.varDefinitions = varDefinitions;
		this.functionDefinitions = new ArrayList();
		this.typeDefs=new ArrayList();
		
	}
	
	public Program(int line, int column, TypeDefinition typeDef) {
		super(line, column);
		this.varDefinitions = varDefinitions;
		this.functionDefinitions = new ArrayList();
		this.typeDefs=new ArrayList();
		this.addTypeDefinition(typeDef);		
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
	
	public void addVarDefinitions(List<VarDefinition> varDef) {		
		this.varDefinitions.addAll(varDef);
	}
	
	public void addTypeDefinition(TypeDefinition typeDef) {		
		this.typeDefs.add(typeDef);
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
