package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import types.RecordType;
import visitor.Visitor;

public class Record extends TypeDefinition {

	private Map<String,TypeDefinition> fields;
	
	public Record(int line, int column, String name, List<VarDefinition> varDefs ) {
		super(line, column, RecordType.getInstance(), name );
		this.fields = new HashMap<>();
		for(VarDefinition varDef : varDefs ) {
			this.fields.put(varDef.getName(), new TypeDefinition(line, column, varDef.getType(), this.createFieldKeyword(varDef.getName())));
		}

	}
	
	private String createFieldKeyword(String fieldName) {
		return this.name + '.' + fieldName;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
