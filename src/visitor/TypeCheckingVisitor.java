package visitor;

import ast.Arithmetic;
import ast.Variable;

public class TypeCheckingVisitor extends AbstractVisitor{
	
	Void visit(Arithmetic e, Void param) {
		return null;
		
	}
	
	Void visit(Variable e, Void param) {
		return null;
		
	}

}
