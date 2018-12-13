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
				$ast = new Program($var1.ast.getLine(), $var1.ast.getColumn(), $var1.ast);
			}else{
				$ast.addVarDefinition($var1.ast);
			}
			
		}
		| func1=functionDefinition {
			if($ast==null){
				$ast = new Program($func1.ast.getLine(), $func1.ast.getColumn(), $func1.ast);
			}else{
				$ast.addFunctionDefinition($func1.ast);
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
 		(var2=varDefinition 		{$ast.addVarDefinition($var2.ast);}
 		| func2=functionDefinition {$ast.addFunctionDefinition($func2.ast);}
 		)* 	EOF
	
    ;    
 
varDefinition returns [VarDefinition ast]:
	type id1=ID		 	{ $ast=new VarDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, $id1.text, $type.ast);}
	(',' id2=ID			{ $ast=new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, $id2.text, $type.ast);}
	)* ';'
	|  arrayType id3=ID  ';' { $ast=new VarDefinition($id3.getLine(), $id3.getCharPositionInLine()+1, $id3.text, $arrayType.ast);}
	; 
	

arrayType returns [ArrayType ast]:
		type '[' num1=INT_CONSTANT ']' {$ast = new ArrayType($num1.getLine(), $num1.getCharPositionInLine()+1, $type.ast, LexerHelper.lexemeToInt($num1.text));}
		('[' num2=INT_CONSTANT ']' {$ast = new ArrayType($num1.getLine(), $num1.getCharPositionInLine()+1, $type.ast, LexerHelper.lexemeToInt($num1.text), LexerHelper.lexemeToInt($num2.text));}
		)*	
	;   
	
functionDefinition returns [FunctionDefinition ast]:
            	(voidType='void' 		{ $ast = new FunctionDefinition($voidType.getLine(), $voidType.getCharPositionInLine()+1);}
            		|  returnType=type { $ast = new FunctionDefinition($returnType.ast.getLine(), $returnType.ast.getColumn(), $returnType.ast);}	
            	)
            	funcName=ID '(' { $ast.setName($funcName.text);}
            	(argType1=type arg1=ID	{$ast.addArgument($argType1.ast, $arg1.text); }
            	(',' argType2=type arg2=ID {$ast.addArgument($argType1.ast, $arg2.text); }
            	)*)* ')' statementBlock { $ast.setFunctionBody($statementBlock.ast);}
       ;
       

mainFunction returns [FunctionDefinition ast]:
            'void' funcName='main' '(' ')' statementBlock 	{$ast = new FunctionDefinition($funcName.getLine(), $funcName.getCharPositionInLine()+1, $funcName.text, $statementBlock.ast);}		
       ;

	
statementBlock returns [List<Statement> ast = new ArrayList()]:
				'{' (statement 			{$ast.add($statement.ast);}
				| varDefinition)*   '}' 	  												
	;

statement returns [Statement ast]:
			e1=expression '=' e2=expression ';'		{ $ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast); }
          	| 'write' expression ';'		    	{ $ast = new Write($expression.start.getLine(),
                                                   		$expression.start.getCharPositionInLine()+1, $expression.ast); }
            | 'read' expression ';'		    		{ $ast = new Read($expression.start.getLine(),
                                                   	$expression.start.getCharPositionInLine()+1, $expression.ast); }
        	| 'while' '(' expression ')' statementBlock		{ $ast = new WhileStatement($expression.start.getLine(),
                                                   				$expression.start.getCharPositionInLine()+1, $expression.ast, $statementBlock.ast);}
           | ifElseStatement		{ $ast = $ifElseStatement.ast;}
           
           | RETURN_CONSTANT expression ';'	{ $ast = new ReturnStatement($RETURN_CONSTANT.getLine(),
                                             $RETURN_CONSTANT.getCharPositionInLine()+1, $expression.ast);}																						         	                        																		
         
         	| expression ';'	
         ;

  
type returns [Type ast]: 
      'int' 						{ $ast = IntType.getInstance(); }				
    | 'double'						{ $ast = RealType.getInstance(); } 
    | 'char'						{ $ast = CharType.getInstance(); } 
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

		statementBlock { $ast = $statementBlock.ast;}
		| statement		{ $ast.add($statement.ast);}
	;
         
			
expression returns [Expression ast]: 
 			ID '(' 		{ $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}	
 			(arguments { $ast = new FunctionCall($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $arguments.ast);}	
 			)* ')'																					
         | ID  ('[' expression ']')*													{ $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); } 
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