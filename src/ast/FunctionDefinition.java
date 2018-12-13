package ast;

import java.util.ArrayList;
import java.util.List;

import types.FunctionType;
import types.Type;
import types.VoidType;
import visitor.Visitor;

public class FunctionDefinition extends AbstractASTNode {
	
	/**
	 * The offset of the variable
	 */
	private int offset;
	
	private String name;
	
	private FunctionType type;

	private List<Statement> functionBody;
	
	private List<VarDefinition> arguments;

	public FunctionDefinition(int line, int column) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = "";
		this.functionBody = new ArrayList();
		this.arguments=new ArrayList();
	}
	
	public FunctionDefinition(int line, int column, String functionName, List<Statement> functionBody) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = functionName;
		this.functionBody = functionBody;
		this.arguments=new ArrayList();
	}
	
	public FunctionDefinition(int line, int column, Type returnType) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = "";
		this.functionBody = new ArrayList();
		this.arguments=new ArrayList();
	}
	
	public void addArgument(Type argumentType, String name) {
		this.type.addParamType(argumentType);
		this.arguments.add(new VarDefinition(this.getLine(), this.getColumn(), name, argumentType));
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
	public List<Statement> getFunctionBody() {
		return functionBody;
	}
		
	public Type getType() {
		return this.type;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; // offset: %d.", this.getType(), this.getName(), this.getOffset());
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}


	
	
}	
	

