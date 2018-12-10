/**
  * AST node for variables (identifiers).
  * 
  * @author  Francisco Ortin
  */

package ast;

import types.Type;
import visitor.Visitor;

public class Variable extends AbstractExpression {

	private String name;
		public String getName() {
		return name;
	}

	private VarDefinition definition;
	public VarDefinition getDefinition() {
		return definition;
	}
	public void setDefinition(VarDefinition definition) {
		this.definition = definition;
	}

	
	public Variable(int line, int column, String name) {
		super(line, column);
		this.name=name;
	}
	
	public Variable(int line, int column, String name, Type type) {
		super(line, column);
		this.name=name;
		
		this.definition = new VarDefinition(line, column, name, type);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

	
	
}
