package ast;

import types.ErrorType;
import types.KeywordType;
import types.Type;
import visitor.Visitor;

public class TypeDefinition extends AbstractASTNode {

	protected Type type;
	protected String name;

	private int offset;

	
	public TypeDefinition(int line, int column) {
		super(line, column);
		
	}
	
	public TypeDefinition(int line, int column, Type type, String keyword) {
		super(line, column);
		this.name=keyword;
		this.type=new KeywordType(keyword,type);

	}
	
	public int getOffset() {
		return this.offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

	public Type getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TypeDefinition [type=" + type + ", name=" + name + "]";
	}



	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return visitor.visit(this, null);
	}


}
