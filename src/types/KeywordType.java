package types;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ast.ASTNode;
import visitor.Visitor;

public class KeywordType extends AbstractType  {
	
	private static Map<String, Type> keywords;
	private static KeywordType instance = new KeywordType();
	public static Type getInstance(String name) {return getKeywordType(name);}
	
	private KeywordType() {
		super(0,0);
		keywords = new HashMap();
	}

	public static void addKeyword(Type type, String name) {
		keywords.putIfAbsent(name, type);
	}

	public static Type getKeywordType(String name) {
		if(keywords.containsKey(name))
		{
			return keywords.get(name);
		}
		return  new ErrorType(String.format(
				"No typdef found for keyword %s", name),
				instance);
	}
	
	public static boolean isDefined(String name) {
		return keywords.containsKey(name);
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char suffix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numberOfBytes() {
		// TODO Auto-generated method stub
		return 0;
	}





	
	
	

}
