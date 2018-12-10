package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		char character='\0';
		if(str!=null && (str.length()==1 || str.charAt(0)=='\\') ) {
			
		character = str.charAt(0);
			
		 if(character=='\\')
		 {
			 str = str.substring(1);
			 
			 character =  (char)Integer.parseInt(str);
			 System.out.println(character);
			 
		 }
			
		}else {
			System.out.println("Cannot convert to char: " + str);
		}
		return character;
	}

	
	
}
