import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

public class Main {
	
	public static void main(String... args) throws Exception {
	   
		if (args.length<2) {
	        System.err.println("Please specify input and output file names.");
	        return;
	    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);			
		
		Program ast = parser.program().ast;
		
		// * The AST is shown
		if(ast!=null) {
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);	
		}else {
			  System.err.println("Abstract syntaxt tree could not be modeled.");
		}
		
	}
	

}
