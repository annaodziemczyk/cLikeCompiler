package codegen;

import ast.FunctionDefinition;
import ast.Record;
import ast.Statement;
import ast.TypeDefinition;
import ast.VarDefinition;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {
private int bytesGlobalsSum = 0;
private int bytesLocalSum = 0;
	
	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		if(varDefinition.getScope()==0) {
			varDefinition.setOffset(bytesGlobalsSum);
			bytesGlobalsSum += varDefinition.getType().numberOfBytes();
		}else {
			varDefinition.setOffset(bytesLocalSum);
			bytesLocalSum += varDefinition.getType().numberOfBytes();
		}
		
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		functionDefinition.setOffset(bytesGlobalsSum);
		for(VarDefinition varDef:functionDefinition.getVariables()) {
			varDef.accept(this, param);
		}
		
		for(Statement statement:functionDefinition.getFunctionBody()) {
			statement.accept(this, param);
		}
		
		bytesLocalSum=0;
		
		return null;
	}
	
	@Override
	public Void visit(Record record, Void param) {
		record.setOffset(bytesGlobalsSum);
		record.getType().accept(this, param);
		bytesGlobalsSum += record.getType().numberOfBytes();
		return null;
	}
}
