package ast;

import visitor.Visitor;

public class Negation  extends AbstractExpression{
	
	private Expression expression;

	public Negation(int line, int column, Expression exp) {
		super(line, column);
		this.expression = exp;
		// TODO Auto-generated constructor stub
	}
	

	public Expression getExpression() {
		return expression;
	}



	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}