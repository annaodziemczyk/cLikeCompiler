/**
  * Code generation template to generate the code that pushes the value of one expression.
  * 
  * @author  Francisco Ortin
  */

package codegen;

import ast.*;
import types.CharType;
import types.VoidType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;

	public ValueCGVisitor(CG cg) {
		super(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.getOperand1().accept(this, null);
		arithmetic.getOperand2().accept(this, null);
		cg.arithmetic(arithmetic.getOperator(), arithmetic.getType());
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		variable.accept(this.addressCGVisitor, null);
		cg.load(variable.getType());
		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		cg.push(intLiteral.value);
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		cg.push(realLiteral.value);
		return null;
	}

	@Override
	public Void visit(Comparision comparision, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(Logical logical, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(Negation Negation, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(CharLiteral charLiteral, Void param) {
		cg.push(charLiteral.value);
		return null;
	}

	@Override
	public Void visit(Cast cast, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(FunctionCall functionCall, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(Read read, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(WhileStatement whileStatement, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(IfElseStatement IfElseStatement, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(ReturnStatement returnStatement, Void param) {
		// TODO Auto-generated method stub
		return null;
	}


}
