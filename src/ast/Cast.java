package ast;

import types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression{

	private Type castType;
	private Expression expression;
	
	public Cast(int line, int column, Type castType, Expression expression) {
		super(line, column);
		this.castType = castType;
		this.expression = expression;
	}
	
	

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}

}
