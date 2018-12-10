package types;

import visitor.Visitor;

public class CharType extends AbstractType{

	private CharType()  {
		super(0, 0);
	}
	
	private static CharType instance=new CharType();
	
	
	public static CharType getInstance() { return instance; }

	
	@Override
	public String toString() {
		return "char";
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
