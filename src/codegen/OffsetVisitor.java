package codegen;

import ast.Record;
import ast.TypeDefinition;
import ast.VarDefinition;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {
private int bytesGlobalsSum = 0;
	
	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		varDefinition.setOffset(bytesGlobalsSum);
		bytesGlobalsSum += varDefinition.getType().numberOfBytes();
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
