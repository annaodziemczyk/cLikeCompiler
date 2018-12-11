/**
  * Parser and lexer specification file with ANTLR for a subset of the C-- (Cmm) langauge.
  * 
  * @author Anna Odziemczyk
  *
  */

grammar Cmm;

@header {
	import ast.*;
	import types.*;
}	

import CommonLexerRules;

program returns [Program ast]: 	
		(varDefinition | functionDefinition)*
		('void' 'main' '(' ')' statementBlock)
 		(varDefinition | functionDefinition)*
    ;    
    
varDefinition returns [VarDefinition ast]:
	type ID	(',' ID)* ';' { $ast=new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $type.ast); }
	|  arrayType ID  ';'  { $ast=new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $arrayType.ast); }
	; 
	
functionDefinition returns [FunctionDefinition ast]:
            	functionType statementBlock 	 			
       ;
						
varDefinitions returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
          	(type ID	(',' ID)* ';'					{ $ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $type.ast)); }
          	| arrayType ID  ';'     					{ $ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $arrayType.ast)); }
       		)*
       ;    

arrayType returns [ArrayType ast]:
		type '[' num1=INT_CONSTANT ']' 						{ $ast = new ArrayType($type.ast.getLine(), $type.ast.getColumn(), $type.ast, LexerHelper.lexemeToInt($num1.text));}
		('[' num2=INT_CONSTANT ']')*							{ $ast = new ArrayType($type.ast.getLine(), $type.ast.getColumn(), $type.ast, LexerHelper.lexemeToInt($num1.text), LexerHelper.lexemeToInt($num2.text));}
	;      
             
functionDefinitions returns [List<FunctionDefinition> ast = new ArrayList<FunctionDefinition>()]:
          	 (functionDefinition   			{ $ast.add($functionDefinition.ast); })* 
            
       ; 
       
 
       
functionType returns [FunctionType ast]:
			'void'  ID '(' (type ID	(',' type ID)*)* ')'  		
		|  type  ID '(' (type ID	(',' type ID)*)* ')' 
	;

       
type returns [Type ast]: 
      'int' 						{ $ast = IntType.getInstance(); }				
    | 'double'						{ $ast = RealType.getInstance(); } 
    | 'char'						{ $ast = CharType.getInstance(); } 
    ;
    
statements returns [List<Statement> ast = new ArrayList<Statement>()]:
         ( statement       { $ast.add($statement.ast); }
         )*
         ;
         
statement returns [Statement ast]:
			e1=expression '=' e2=expression ';'				{ $ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast); }
          	| 'write' expression 	    																								{ $ast = new Write($expression.start.getLine(),
                                                   																						$expression.start.getCharPositionInLine()+1, $expression.ast); }
            | 'read' expression 	    																								{ $ast = new Read($expression.start.getLine(),
                                                   																						$expression.start.getCharPositionInLine()+1, $expression.ast); }
        	| 'while' '(' expression ')' statementBlock																					{ $ast = new WhileStatement($expression.start.getLine(),
                                                   																						$expression.start.getCharPositionInLine()+1, $expression.ast, $statementBlock.ast);}
           | ifElseStatement																											{ $ast = $ifElseStatement.ast;}
           
           | RETURN_CONSTANT expression ';'																								{ $ast = new ReturnStatement($RETURN_CONSTANT.getLine(),
                                                      																						$RETURN_CONSTANT.getCharPositionInLine()+1, $expression.ast);}																						         	                        																		
         ;
         
ifElseStatement returns [IfElseStatement ast]:
				
				'if'  '(' condition=expression ')'
				ifBody=statementBlockOrStatement
				(
				'else'
				
				elseBody=statementBlockOrStatement
				
				
				)*
				
				
				{ $ast = new IfElseStatement($condition.ast.getLine(), $condition.ast.getColumn(), $condition.ast, $ifBody.ast, $elseBody.ast );}

			;
			
statementBlockOrStatement returns [List<Statement> ast = new ArrayList()]:

		statementBlock { $ast = $statementBlock.ast;}
		| statement		{ $ast.add($statement.ast);}
	;
         
statementBlock returns [List<Statement> ast = new ArrayList()]:
				BLOCK_START 										
			 	stmts = statements  	
			 	 '}' 													{$ast = $stmts.ast;}
			;

expressions returns [List<Expression> ast = new ArrayList()]:
			(
				(e1=expression 					{$ast.add($e1.ast);}
				(',' e2=expression)*			{$ast.add($e2.ast);}
				)?
			)
		;
			
expression returns [Expression ast]: 
		 ID '(' expressions ')'															{ $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $expressions.ast);}
         | ID  																			{ $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); } 
         | INT_CONSTANT 			          											{ $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
         | REAL_CONSTANT 			          											{ $ast = new RealLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
         | CHAR_CONSTANT 			          											{ $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }       
         | '(' type ')' e1=expression													{ $ast = new Cast($e1.ast.getLine(), $e1.ast.getColumn(), $type.ast, $e1.ast); }        
         | '(' e1=expression ')'              											{ $ast = $e1.ast; }
		 | e1=expression op=('*'|'/'|'%') 
		   e2=expression                      											{ $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
		 | e1=expression op=('+'|'-') 
		 	e2=expression					  											{ $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
		 | e1=expression op=('>' | '>=' | '<' | '<=' | '!=' | '==') e2=expression 		{ $ast = new Comparision($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
		 | e1=expression op=( '&&' | '||') e2=expression 								{ $ast = new Logical($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
		 | '!' e1=expression  														{ $ast = new Negation($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast); }

         ;
 
 