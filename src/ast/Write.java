/**
  * AST node for write statements.
  * 
  * @author  Francisco Ortin
  */

package ast;


import visitor.Visitor;

public class Write extends Console  {

	public Write(int line, int column, Expression expression) {
		super(line, column, expression);

	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
}
