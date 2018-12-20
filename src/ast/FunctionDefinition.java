package ast;

import java.util.ArrayList;
import java.util.List;

import types.FunctionType;
import types.Type;
import types.VoidType;
import visitor.Visitor;

public class FunctionDefinition extends Definition {
	
	/**
	 * The offset of the variable
	 */
	private int offset;
	
	private String name;
	
	private FunctionType type;

	private List<Statement> functionBody;
	
	private List<VarDefinition> variables;

	public FunctionDefinition(int line, int column, String functionName) {
		super(line, column, functionName);
		this.type = new FunctionType(line, column);
		this.name = functionName;
		this.functionBody = new ArrayList();
		this.variables=new ArrayList();
	}
	
	public FunctionDefinition(int line, int column, String functionName, Type returnType) {
		super(line, column, functionName);
		this.type = new FunctionType(line, column, returnType);
		this.name = functionName;
		this.functionBody = new ArrayList();
		this.variables=new ArrayList();
	}
	
	public void addArgument(Type argumentType, String name) {
		this.type.addParamType(argumentType);
		this.variables.add(new VarDefinition(this.getLine(), this.getColumn(), name, argumentType));
	}
	
	public int getOffset() {
		return this.offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setFunctionBody(List<Statement> functionBody) {
		this.functionBody = functionBody;
	}
	
	
	public void setType(FunctionType type) {
		this.type = type;
	}

	public List<Statement> getFunctionBody() {
		return functionBody;
	}
		
	public Type getType() {
		return this.type;
	}
	
	public void addVarDefinition(List<VarDefinition> varDefinitions) {
		this.variables.addAll(varDefinitions);
		
	}
	
	public void addStatement(Statement statement) {
		
		this.functionBody.add(statement);
		
		
	}

	public List<VarDefinition> getVariables() {
		return variables;
	}

	@Override
	public String toString() {
		return String.format("%s %s; // offset: %d.", this.getType(), this.getName(), this.getOffset());
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,null);
	}


	
	
}	
	

