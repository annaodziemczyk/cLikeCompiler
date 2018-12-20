package types;

import ast.ASTNode;
import visitor.Visitor;

public class ArrayType extends AbstractType{
	
	protected Type elemType;
	protected int numElems;
	protected int size;
	
	public ArrayType(int line, int column, Type elemType, int numElems) {
		super(line, column);
		this.elemType = elemType;
		this.numElems = numElems;
		this.size=1;
	}

	public ArrayType(int line, int column, Type elemType, int size, int numElems)
	{
		super(line, column);
		this.elemType = elemType;
		this.size= size;
		this.numElems = numElems;
	}

	
	public Type getElemType() {
		return elemType;
	}

	public int getNumElems() {
		return numElems;
	}

	public int getSize() {
		return size;
	}

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if(size>1) {
			if (type instanceof ArrayType)
				return new ErrorType("Arrays cannot be assigned",
						node);
			else {
				new ErrorType(String.format("%s cannot be assigned to %s[]", type, type),
						node);
				return this;
			}
		}
		
		
		return elemType.assignment(type, node);
	}
	
	@Override
	public String toString() {
		return "array";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char suffix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numberOfBytes() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
