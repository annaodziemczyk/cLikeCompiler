package types;

import ast.ASTNode;
import visitor.Visitor;

public class RecordType extends AbstractType  {
	
	private RecordType()  {
		super(0, 0);
	}
	
	private static RecordType instance=new RecordType();
	
	
	public static RecordType getInstance() { return instance; }
	
	
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
