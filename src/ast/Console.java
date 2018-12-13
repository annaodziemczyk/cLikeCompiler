package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public abstract class Console extends AbstractASTNode implements Statement {

	private List<Expression> expressions;
	
	
	public Console(int line, int column, Expression expression) {
		super(line, column);
		this.expressions = new ArrayList();
		this.addExpression(expression);
	}

	public List<Expression> getExpressions() {
		return expressions;
	}
	
	public void addExpression(Expression expression) {
		this.expressions.add(expression);
	}
	
	
	@Override
	public String toString() {
		return "Read [expressions=" + expressions + "]";
	}


}
