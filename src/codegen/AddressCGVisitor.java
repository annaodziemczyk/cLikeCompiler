/**
  * Code generation template to generate the code that pushes the address of one expression.
  * 
  * @author  Francisco Ortin
  */

package codegen;

import ast.*;
import types.CharType;
import types.VoidType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

	
	public AddressCGVisitor(CG gc) {
		super(gc);
	}
	
	@Override
	public Void visit(Variable id, Void param) {
		// * Pushes the address of id
		cg.pushAddress(id);
		return null;
	}


	@Override
	public Void visit(ArrayIndexing arrayIndexing, Void param) {
		cg.pushAddress(arrayIndexing);
		return null;
	}


}
