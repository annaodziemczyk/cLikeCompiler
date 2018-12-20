package types;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class FunctionType extends AbstractType{
	

	private Type returnType;
	
	private List<Type> paramType;
	
	public FunctionType(int line, int column) {
		super(line, column);
		this.returnType= VoidType.getInstance();
		this.paramType=new ArrayList();
	}
	
	public FunctionType(int line, int column, Type returnType) {
		super(line, column);
		this.returnType= returnType;
		this.paramType=new ArrayList();
	}	
	
	public FunctionType(int line, int column, Type returnType, List<Type> paramType) {
		super(line, column);
		this.returnType= returnType;
		this.paramType=paramType;
	}	
	
	public void addParamType(Type type) {
		this.paramType.add(type);
	}	

	public Type getReturnType() {
		return returnType;
	}

	public List<Type> getParamType() {
		return paramType;
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
