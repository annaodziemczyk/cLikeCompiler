/**
  * General type to represent any traversal of the AST.
  * TP is the generic type of the parameter passed in the traversal.
  * TR is the generic return type returned in the traversal.
  * If neither of these types are required, they should be instantiated with Void.
  * @see AbstractVisitor for its default implementation.
  * 
  * @author  Francisco Ortin
  */

package visitor;
import ast.*;
import types.*;
import types.ErrorType;

public interface Visitor<TP, TR> {
	
	// ********* Expressions **********
	 public TR visit(Arithmetic arithmetic, TP param);	
	 
	 public TR visit(Comparision comparision, TP param);
	 
	 public TR visit(Logical logical, TP param);
	 
	 public TR visit(Negation Negation, TP param);
	
	 public TR visit(Variable variable, TP param);
	 
	 public TR visit(IntLiteral intLiteral, TP param);
	 
	 public TR visit(CharLiteral charLiteral, TP param);	

	 public TR visit(RealLiteral realLiteral, TP param);
	 	  
	 public TR visit(Cast cast, TP param);
	 
	 public TR visit(FunctionCall functionCall, TP param);
	 
	 public TR visit(TypeDefinition typeDefiniton, Void param);

	 public TR visit(Record e, Void param);

	 public TR visit(ArrayIndexing e, Void param);
	
	
	// ************ Statements ***************
	
	 public TR visit(Write write, TP param);
	 
	 public TR visit(Read read, TP param);
	
	 public TR visit(Assignment assignment, TP param);
		
 	 public  TR visit(VarDefinition varDefinition, TP param);
 	 
 	public  TR visit(FunctionDefinition functionDefinition, TP param);
 	
 	public  TR visit(WhileStatement whileStatement, TP param);
 	
 	public  TR visit(IfElseStatement IfElseStatement, TP param);	
 	
 	public TR visit(ReturnStatement returnStatement, TP param);

 	
	// ************ Program ****************

	 public TR visit(Program program, TP param);

	// ************ Types ****************

	 public TR visit(IntType intType, TP param);
	 
	 public TR visit(CharType charType, TP param);
	 
	 public TR visit(VoidType voidType, TP param);

	 public TR visit(ErrorType errorType, TP param);

	 public TR visit(RealType realType, TP param);


}
