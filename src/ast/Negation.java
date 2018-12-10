package ast;

import visitor.Visitor;

public class Negation  extends AbstractExpression {
	
	private Expression exp;

	public Negation(int line, int column, Expression exp) {
		super(line, column);
		this.exp = exp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}