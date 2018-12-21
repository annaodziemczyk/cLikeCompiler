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
			varDefinition.setOffset(-bytesLocalSum);
			bytesLocalSum += varDefinition.getType().numberOfBytes();	
			varDefinition.getType().accept(this, param);
		}		
		
		return null;
	}
	
	@Override
	public Void visit(FunctionDefinition functionDefinition, Void param) {
		bytesLocalSum=4;
		for(VarDefinition varDef:functionDefinition.getVariables()) {
			varDef.accept(this, param);
		}
		
		for(Statement statement:functionDefinition.getFunctionBody()) {
			statement.accept(this, param);
		}

		return null;
	}
	
	@Override
	public Void visit(Record record, Void param) {
		bytesLocalSum=0;
		for(TypeDefinition typeDef:record.getFields().values()) {
			record.setOffset(bytesLocalSum);
			bytesGlobalsSum += record.getType().numberOfBytes();
			record.getType().accept(this, param);
		}
		
		return null;
	}
}
