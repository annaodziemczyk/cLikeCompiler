package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class Read extends Console {

	public Read(int line, int column, Expression expression) {
		super(line, column, expression);
	}


	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
}
