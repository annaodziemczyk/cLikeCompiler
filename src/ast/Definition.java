package ast;

public abstract class Definition extends AbstractASTNode {

	private int scope;
	private String name;
		
	public Definition(int line, int column, String name) {
		super(line, column);
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

}
