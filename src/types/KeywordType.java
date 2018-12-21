package types;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ast.ASTNode;
import visitor.Visitor;

public class KeywordType extends AbstractType  {
	
	private String keyword;
	private Type type;
	
	
	public KeywordType(String keyword) {
		super(0,0);
		this.keyword=keyword;
	}
	
	public KeywordType(String keyword, Type type) {
		super(0,0);
		this.keyword=keyword;
		this.type=type;
	}	

	public String getKeyword() {
		return keyword;
	}



	public Type getType() {
		return type;
	}



	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
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
		return this.type.numberOfBytes();
	}


}
