package types;

import java.util.List;

import ast.ASTNode;
import visitor.Visitor;

public class RecordType extends AbstractType  {
	
	private List<Type> fieldTypes;
	
	public RecordType(List<Type> fieldTypes)  {
		super(0, 0);
		this.fieldTypes=fieldTypes;
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
		int numBytes=0;
		for(Type fieldType:this.fieldTypes) {
			numBytes+=fieldType.numberOfBytes();
		}
		// TODO Auto-generated method stub
		return numBytes;
	}

}
