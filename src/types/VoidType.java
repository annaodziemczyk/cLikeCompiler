package types;

import visitor.Visitor;

public class VoidType  extends AbstractType{

	private VoidType()  {
		super(0, 0);
	}
	
	private static VoidType instance=new VoidType();
	
	
	public static VoidType getInstance() { return instance; }

	
	@Override
	public String toString() {
		return "void";
	}

	

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
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

