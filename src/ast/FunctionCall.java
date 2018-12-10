package ast;

import java.util.List;

import visitor.Visitor;

public class FunctionCall extends AbstractExpression {
	
	private String name;
	private List<Expression> expressions;
	
	public FunctionCall(int line, int column, String name, List<Expression> expressions) {
		super(line, column);
		this.name = name;
		this.expressions=expressions; 
	}
	
	

	public String getName() {
		return name;
	}



	public List<Expression> getExpressions() {
		return expressions;
	}



	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}

}
