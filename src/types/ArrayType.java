package types;

import ast.ASTNode;
import visitor.Visitor;

public class ArrayType <T extends Type> extends AbstractType{
	
	protected Type elemType;
	protected int numElems;
	protected int numArrays;
	
	public ArrayType(int line, int column, Type elemType, int numElems) {
		super(line, column);
		this.elemType = elemType;
		this.numElems = numElems;
		this.numArrays=1;
	}

	public ArrayType(int line, int column, Type elemType, int numArrays, int numElems)
	{
		super(line, column);
		this.elemType = elemType;
		this.numArrays= numArrays;
		this.numElems = numElems;
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
