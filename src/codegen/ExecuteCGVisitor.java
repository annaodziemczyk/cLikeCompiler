/**
  * Code generation template to generate the code for any statement and variable declaration.
  * 
  * @author  Francisco Ortin
  */

package codegen;

import ast.*;
import types.CharType;
import types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;
	
	private ValueCGVisitor valueCGVisitor;
	
	public ExecuteCGVisitor(CG cg) {
		super(cg);
		this.valueCGVisitor = new ValueCGVisitor(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}
		
	@Override
	public Void visit(Write write, Void param) {
		cg.comment("Write");
		for(Expression ex:write.getExpressions()) {
			ex.accept(this.valueCGVisitor,null);
			cg.output(ex.getType());
		}		
		return null;
	}
	
	@Override
	public Void visit(Program program, Void param) {
		// * Global variables
		cg.comment("Variable definitions");
		for(VarDefinition varDefinition: program.getVarDefinitions()) { 
			varDefinition.accept(this,null);
		}
		cg.newLine();
		cg.comment("Functions");
		for(FunctionDefinition funcDef: program.getFunctionDefinitions()) {
			cg.line(funcDef);
			funcDef.accept(this,null);
		}
		
		cg.newLine();
		cg.comment("TypeDefinition");
		for(TypeDefinition typeDef: program.getTypeDefs()) {
			cg.line(typeDef);
			typeDef.accept(this,null);
		}
		
		cg.newLine();
		cg.comment("Structs");
		for(Record rec: program.getStructDefs()) {
			cg.line(rec);
			rec.accept(this,null);
		}
		return null;
	}

	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		cg.declaration(varDefinition);
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
		cg.comment("Assignment");
		assignment.getLeftHandSide().accept(this.addressCGVisitor, null); // * lvalue
		assignment.getRightHandSide().accept(this.valueCGVisitor, null); // * rvalue
		cg.store(assignment.getLeftHandSide().getType());
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
