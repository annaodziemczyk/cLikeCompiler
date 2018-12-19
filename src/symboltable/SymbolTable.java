package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table=new ArrayList();
		table.add(new HashMap());
	}

	public void set() {
		scope+=1;
	}
	
	public void reset() {
		if(scope!=0) {
			scope-=1;	
		}		
	}

	public boolean insert(Definition definition) {
		
		if(this.table.size()<(this.scope+1))
			this.table.add(new HashMap());
		definition.setScope(scope);
		Map<String,Definition>scopeDefs=this.table.get(this.scope);
		if(scopeDefs.containsKey(definition.getName())==true){
			return false;
		}
		
		scopeDefs.put(definition.getName(), definition);
		
		return true;
				
	}
	
	public Definition find(String id) {
		
		Definition definition = null;
		
		if(this.table.size()>=(scope+1)) {
			definition=this.table.get(scope).get(id);
		}
		
		if(definition==null)
			definition=this.table.get(0).get(id);
		
		return definition;
	}

	public int getScope() {
		return scope;
	}


}
