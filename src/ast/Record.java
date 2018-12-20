package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import types.RecordType;
import types.Type;
import visitor.Visitor;

public class Record extends TypeDefinition {

	private Map<String,TypeDefinition> fields;
		
	public Record(int line, int column, String name, List<VarDefinition> varDefs ) {
		super(line, column);
		this.fields = new HashMap<>();
		this.name=name;
		List<Type>types=new ArrayList();
		for(VarDefinition varDef : varDefs ) {
			types.add(varDef.getType());
			this.fields.put(varDef.getName(), new TypeDefinition(line, column, varDef.getType(), this.createFieldKeyword(varDef.getName())));
		}
		
		this.type=new RecordType(types);

	}
	
	public Map<String, TypeDefinition> getFields() {
		return fields;
	}

	private String createFieldKeyword(String fieldName) {
		return this.name + '.' + fieldName;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return visitor.visit(this, null);
	}
	

}
