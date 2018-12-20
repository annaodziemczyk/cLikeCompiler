package codegen;

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
}
