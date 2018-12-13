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
	public int getOffset() {
		return this.offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

	private String name;
	
	public String getName() {
		return this.name;
	}
	
	private FunctionType type;
	
	public Type getType() {
		return this.type;
	}
	
	public List<Statement> functionBody;

	public FunctionDefinition(int line, int column, String name) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = name;

		this.functionBody = new ArrayList();
	}
	
	public FunctionDefinition(int line, int column, List<Statement> functionBody) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = "main";

		this.functionBody = functionBody;
	}
	
	public FunctionDefinition(int line, int column, String name, List<Statement> functionBody) {
		super(line, column);
		this.type = new FunctionType(line, column);
		this.name = name;

		this.functionBody = functionBody;
	}
	
	public FunctionDefinition(int line, int column, String name, FunctionType type, List<Statement> functionBody) {
		super(line, column);
		this.type = type;
		this.name = name;

		this.functionBody = functionBody;
	}
	

	public List<Statement> getFunctionBody() {
		return functionBody;
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
	

