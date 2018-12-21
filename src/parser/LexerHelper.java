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
		if(str!=null) {
			str=str.substring(1,str.length()-1);
			byte[] strBytes = str.getBytes();	
			
			character = (char)strBytes[0];
		
		}else {
			System.out.println("Cannot convert to char: " + str);
		}
		return character;
	}

	
	
}
