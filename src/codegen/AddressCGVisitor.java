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
		// TODO Auto-generated method stub
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
	public Void visit(TypeDefinition typeDefiniton, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(Record e, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(ArrayIndexing e, Void param) {
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

	@Override
	public Void visit(CharType charType, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(VoidType voidType, Void param) {
		// TODO Auto-generated method stub
		return null;
	}



}
