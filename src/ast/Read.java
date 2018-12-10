package ast;

import visitor.Visitor;

public class Read extends AbstractASTNode implements Statement {

	/**
	 * Expression to be written
	 */
	private Expression expression;

	public Expression getExpression() {
		return expression;
	}
	
	@Override
	public String toString() {
		return "write " + expression;
	}

	public Read(int line, int column, Expression expression) {
		super(line, column);
		this.expression = expression;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
}
