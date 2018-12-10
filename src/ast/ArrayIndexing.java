package ast;

import visitor.Visitor;

public class ArrayIndexing extends AbstractBinaryExpression{

	public ArrayIndexing(int line, int column, Expression operand1, String operator, Expression operand2) {
		super(line, column, operand1, operator, operand2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

}
