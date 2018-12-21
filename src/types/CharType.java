package types;

import ast.ASTNode;
import visitor.Visitor;

public class CharType extends AbstractType{

	private CharType()  {
		super(0, 0);
	}
	
	private static CharType instance=new CharType();
	
	
	public static CharType getInstance() { return instance; }

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof CharType)
			return this;
	
		return new ErrorType(String.format(
				"%s cannot be assigned to %s", type, this),
				node);
	}
	
	@Override
	public Type arithmetic(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof CharType)
			return IntType.getInstance();
		// * By default, not allowed (type error)
		return new ErrorType("An arithmetic expression cannot be performed with the types " + this.getClass().getSimpleName() + " and " + type.getClass().getSimpleName() + ".", node); 
	}
	
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
		return 'b';
	}


	@Override
	public int numberOfBytes() {
		// TODO Auto-generated method stub
		return 1;
	}


}
