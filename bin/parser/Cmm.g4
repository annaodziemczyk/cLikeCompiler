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
		(var1=varDefinition {
			if($ast==null){
				$ast = new Program($var1.start.getLine(), $var1.start.getCharPositionInLine()+1, $var1.ast);
			}else{
				$ast.addVarDefinitions($var1.ast);
			}
			
		}
		| func1=functionDefinition {
			if($ast==null){
				$ast = new Program($func1.ast.getLine(), $func1.ast.getColumn(), $func1.ast);
			}else{
				$ast.addFunctionDefinition($func1.ast);
			}
	
		
		}
		
		| typeDef1=typeDefinition {
			if($ast==null){
				$ast = new Program($typeDef1.ast.getLine(), $typeDef1.ast.getColumn(), $typeDef1.ast);
			}else{
				$ast.addTypeDefinition($typeDef1.ast);
			}

		}
		| structDef1 = structDefinition  {
			if($ast==null){
				$ast = new Program($typeDef1.ast.getLine(), $typeDef1.ast.getColumn(), $structDef1.ast);
			}else{
				$ast.addStructDefinition($structDef1.ast);
			}

		}
		)* 
		mainFunction {
		
			if($ast==null){
				$ast = new Program($mainFunction.ast.getLine(), $mainFunction.ast.getColumn(), $mainFunction.ast);
			}else{
				$ast.addFunctionDefinition($mainFunction.ast);
			}
		
		
		}
 		(var2=varDefinition 		{$ast.addVarDefinitions($var2.ast);}
 		| func2=functionDefinition {$ast.addFunctionDefinition($func2.ast);}
 		| typeDef2=typeDefinition {$ast.addTypeDefinition($typeDef2.ast);}
 		| structDef2=structDefinition {$ast.addStructDefinition($structDef2.ast);}
 		)* 	
	
    ;    
 
typeDefinition returns [TypeDefinition ast]:
		'typedef' type ID ';' {$ast = new TypeDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $type.ast, $ID.text);}
	;
	

structDefinition returns [Record ast]:
	'typedef struct {'
		
		varDefinition
	
	'}' ID ';' {$ast = new Record($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $varDefinition.ast);}
	;

	
varDefinition returns [List<VarDefinition> ast = new ArrayList()]:
	type id1=ID		 	{ $ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, $id1.text, $type.ast));}
	(',' id2=ID	{ $ast.add(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, $id2.text, $type.ast));}
	)* ';'
	|  arrayType id3=ID  ';' { $ast.add(new VarDefinition($id3.getLine(), $id3.getCharPositionInLine()+1, $id3.text, $arrayType.ast));}
	; 
	

arrayType returns [ArrayType ast]:
		type '[' num1=INT_CONSTANT ']' {$ast = new ArrayType($num1.getLine(), $num1.getCharPositionInLine()+1, $type.ast, LexerHelper.lexemeToInt($num1.text));}
		('[' num2=INT_CONSTANT ']' {$ast = new ArrayType($num1.getLine(), $num1.getCharPositionInLine()+1, $type.ast, LexerHelper.lexemeToInt($num1.text), LexerHelper.lexemeToInt($num2.text));}
		)*	
	;   
	
functionDefinition returns [FunctionDefinition ast]:
            	((voidType='void' funcName1=ID)		{ $ast = new FunctionDefinition($funcName1.getLine(), $funcName1.getCharPositionInLine()+1, $funcName1.text);}
            		|  (returnType=type funcName2=ID) { $ast = new FunctionDefinition($funcName2.getLine(), $funcName2.getCharPositionInLine()+1 ,$funcName2.text, $returnType.ast);}	
            	)
            	'('
            	(argType1=type arg1=ID	{$ast.addArgument($argType1.ast, $arg1.text); }
            	(',' argType2=type arg2=ID {$ast.addArgument($argType1.ast, $arg2.text); }
            	)*)* ')' '{' 
            		(varDefinition   { $ast.addVarDefinition($varDefinition.ast);}
            		| statement		{ $ast.addStatement($statement.ast);}
            		)*	
            	
            	'}' 
       ;
      

mainFunction returns [FunctionDefinition ast]:
            'void' funcName='main' '(' ')'  	{$ast = new FunctionDefinition($funcName.getLine(), $funcName.getCharPositionInLine()+1, $funcName.text);}		
       		'{' 
        		(varDefinition   { $ast.addVarDefinition($varDefinition.ast);}
        		| statement		{ $ast.addStatement($statement.ast);}
        		)*	
        	
        	'}'
       ;

	
statementBlock returns [List<Statement> ast = new ArrayList()]:
				'{' (statement 			{$ast.add($statement.ast);}
				| varDefinition)*   '}' 	  												
	;

statement returns [Statement ast]:
			e1=expression '=' e2=expression ';'		{ $ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast); }
          	| 'write' e1=expression 		    	{ $ast = new Write($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast); }
               (',' e2=expression					{((Write)$ast).addExpression($e2.ast);}
            	)* ';'
            | 'read' e1=expression 		    		{ $ast = new Read($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast); }
              (',' e2=expression					{((Read)$ast).addExpression($e2.ast);}
        		)* ';'
        	| 'while' '(' expression ')' statementBlockOrStatement		{ $ast = new WhileStatement($expression.start.getLine(),
                                                   				$expression.start.getCharPositionInLine()+1, $expression.ast, $statementBlockOrStatement.ast);}
           | ifElseStatement		{ $ast = $ifElseStatement.ast;}
           
           | RETURN_CONSTANT expression ';'	{ $ast = new ReturnStatement($RETURN_CONSTANT.getLine(),
                                             $RETURN_CONSTANT.getCharPositionInLine()+1, $expression.ast);}																						         	                        																		
         
         	| 	ID '(' 		{ $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}	
 			(arguments { $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $arguments.ast);}	
 			)* ')'';'	
         ;

  
type returns [Type ast]: 
      'int' 						{ $ast = IntType.getInstance(); }				
    | 'double'						{ $ast = RealType.getInstance(); } 
    | 'char'						{ $ast = CharType.getInstance(); } 
    | 'type' ID						{ $ast = KeywordType.getKeywordType($ID.text); }
    ;
   
ifElseStatement returns [IfElseStatement ast]:
				
				'if'  '(' condition=expression ')'
					ifBody=statementBlockOrStatement  { $ast = new IfElseStatement($condition.ast.getLine(), $condition.ast.getColumn(), $condition.ast, $ifBody.ast );}
				(
				'else'
				
					elseBody=statementBlockOrStatement		{ $ast = new IfElseStatement($condition.ast.getLine(), $condition.ast.getColumn(), $condition.ast, $ifBody.ast, $elseBody.ast );}	
				
				)*				

			;
			
statementBlockOrStatement returns [List<Statement> ast = new ArrayList()]:
		statement		{ $ast.add($statement.ast);}
		| statementBlock { $ast = $statementBlock.ast;}
	;
         
			
expression returns [Expression ast]: 
 			ID '(' 		{ $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}	
 			(arguments { $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $arguments.ast);}	
 			)* ')'																					
         | 	ID  																		{ $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); } 
         	('[' e1=expression ']' 	  													{ $ast = new ArrayIndexing($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $e1.ast); }	
         	('[' e2=expression ']' 	  													{ $ast = new ArrayIndexing($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $e1.ast, $e2.ast); }	
         	)*)*  																		
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
		 | '!' e1=expression  															{ $ast = new Negation($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast); }

         ;

 	

 arguments returns [List<Expression> ast = new ArrayList();]:
 	e1=expression {$ast.add($e1.ast);} 
 	(',' e2=expression {$ast.add($e2.ast);} )* 
 ;	