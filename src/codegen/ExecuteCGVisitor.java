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
		cg.line(write);
		cg.comment("Write");
		for(Expression ex:write.getExpressions()) {
			ex.accept(this.valueCGVisitor,null);
		}		
		return null;
	}
	
	@Override
	public Void visit(Program program, Void param) {
		// * Global variables
	
		for(VarDefinition varDefinition: program.getVarDefinitions()) { 
			varDefinition.accept(this,null);
		}

		for(FunctionDefinition funcDef: program.getFunctionDefinitions()) {
			if(funcDef.getName()=="main") {
				//cg.output("Invocation of the main function");
			}
			funcDef.accept(this, null);
		}
		

		for(TypeDefinition typeDef: program.getTypeDefs()) {
			cg.line(typeDef);
			typeDef.accept(this,null);
		}
		

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
		cg.line(assignment);
		assignment.getLeftHandSide().accept(this.addressCGVisitor, null); // * lvalue
		assignment.getRightHandSide().accept(this.valueCGVisitor, null); // * rvalue
		cg.store(assignment.getLeftHandSide().getType());
		return null;
	}
	

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.getOperand1().accept(this.addressCGVisitor, null); 
		arithmetic.getOperand2().accept(this.valueCGVisitor, null); 
		cg.store(arithmetic.getOperand1().getType());
		return null;
	}

	@Override
	public Void visit(Comparision comparision, Void param) {
		comparision.getOperand1().accept(this.addressCGVisitor, null);
		comparision.getOperand2().accept(this.valueCGVisitor, null);
		cg.store(comparision.getOperand1().getType());
		return null;
	}

	@Override
	public Void visit(Logical logical, Void param) {
		logical.getOperand1().accept(this.addressCGVisitor, null);
		logical.getOperand2().accept(this.valueCGVisitor, null);
		return null;
	}

	@Override
	public Void visit(Negation negation, Void param) {
		negation.getExpression().accept(this.valueCGVisitor, null);
		return null;
	}

	@Override
	public Void visit(CharLiteral charLiteral, Void param) {
		cg.push(charLiteral.value);
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
	public Void visit(Cast cast, Void param) {
		cast.getExpression().accept(this.valueCGVisitor, null);
		return null;
	}

	@Override
	public Void visit(FunctionCall functionCall, Void param) {
		cg.line(functionCall);
		functionCall.accept(this.valueCGVisitor, null);
		return null;
	}

	@Override
	public Void visit(TypeDefinition typeDefiniton, Void param) {
		typeDefiniton.accept(this.addressCGVisitor, null);
		return null;
	}

	@Override
	public Void visit(Record record, Void param) {
		record.accept(this.addressCGVisitor, null);
		for(TypeDefinition typeDef:record.getFields().values()) {
			typeDef.accept(this, null);
		}
		return null;
	}

	@Override
	public Void visit(ArrayIndexing arrayIndexing, Void param) {
		arrayIndexing.getIndex1().accept(this.addressCGVisitor, null);
		//TODO array indexing
		return null;
	}

	@Override
	public Void visit(Read read, Void param) {
		for(Expression ex:read.getExpressions()) {
			ex.accept(this.valueCGVisitor,null);
			cg.output(ex.getType());
		}	
		return null;
	}

	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		cg.line(functionDefinition);
		for(VarDefinition var:functionDefinition.getVariables()) {
			var.accept(this, null);
		}
		for(Statement statement:functionDefinition.getFunctionBody()) {
			statement.accept(this, null);
		}
		return null;
	}

	@Override
	public Void visit(WhileStatement whileStatement, Void param) {
		whileStatement.getExpression().accept(this.valueCGVisitor, null);
		for(Statement statement:whileStatement.getStatements()) {
			statement.accept(this, null);
		}
		return null;
	}

	@Override
	public Void visit(IfElseStatement IfElseStatement, Void param) {
		IfElseStatement.getCondition().accept(this.valueCGVisitor, null);
		for(Statement statement:IfElseStatement.getIfBody()) {
			statement.accept(this, null);
		}
		
		for(Statement statement:IfElseStatement.getElseBody()) {
			statement.accept(this, null);
		}
		
		return null;
	}

	@Override
	public Void visit(ReturnStatement returnStatement, Void param) {
		cg.line(returnStatement);
		returnStatement.getExpression().accept(this.valueCGVisitor, null);
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
