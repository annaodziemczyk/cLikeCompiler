package ast;

import visitor.Visitor;

public class ArrayIndexing extends Variable{

	private Expression index1;
	private Expression index2;

	public ArrayIndexing(int line, int column, String name, Expression index) {
		super(line, column, name);
		this.index1 = index;
		// TODO Auto-generated constructor stub
	}
	
	public ArrayIndexing(int line, int column, String name, Expression index1, Expression index2) {
		super(line, column, name);
		this.index1 = index1;
		this.index2 = index2;
		// TODO Auto-generated constructor stub
	}


	public Expression getIndex1() {
		return index1;
	}

	public Expression getIndex2() {
		return index2;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

	@Override
	public String toString() {
		
		String arrayIndex=this.getName()+"[" + index1 + "]" ;
		if(index2!=null)
			arrayIndex+="[" +index2 + "]";
		return arrayIndex;
	}
	
	
	
	

}
