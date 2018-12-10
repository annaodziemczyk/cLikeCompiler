package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class IfElseStatement extends AbstractASTNode implements Statement {
	
	private Expression condition;
	private List<Statement> ifBody;
	private List<Statement> elseBody;

	public IfElseStatement(int line, int column, Expression condition, List<Statement> ifBody) {
		super(line, column);
		this.condition = condition;
		this.ifBody = ifBody;
		this.elseBody = new ArrayList<Statement>();
	}
	
	public IfElseStatement(int line, int column, Expression condition, Statement ifStatement) {
		super(line, column);
		this.condition = condition;
		this.ifBody = new ArrayList<Statement>();
		this.ifBody.add(ifStatement);
		this.elseBody = new ArrayList<Statement>();
	}

	public IfElseStatement(int line, int column, Expression condition, List<Statement> ifBody,
			List<Statement> elseBody) {
		super(line, column);
		this.condition = condition;
		this.ifBody = ifBody;
		this.elseBody = elseBody;
	}
	
	public IfElseStatement(int line, int column, Expression condition, Statement ifStatement,
			List<Statement> elseBody) {
		super(line, column);
		this.condition = condition;
		this.ifBody = new ArrayList<Statement>();
		this.ifBody.add(ifStatement);
		this.elseBody = elseBody;
	}
	
	public IfElseStatement(int line, int column, Expression condition, Statement ifStatement,
			Statement elseStatement) {
		super(line, column);
		this.condition = condition;
		this.ifBody = new ArrayList<Statement>();
		this.ifBody.add(ifStatement);
		this.elseBody = new ArrayList<Statement>();
		this.elseBody.add(elseStatement);
	}


	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getIfBody() {
		return ifBody;
	}

	public List<Statement> getElseBody() {
		return elseBody;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
