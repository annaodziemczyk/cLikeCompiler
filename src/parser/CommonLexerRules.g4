grammar CommonLexerRules;	

NEWLINE: ('\r\n' | '\n' | '\r')+ -> skip;
WS: ('\t' | ' ')+ -> skip
	;

	   
ML_COMMENT: '/*' .*? . '*/' -> skip
	   ;
	   
COMMENT: '//' .*? '\r'? ('\n' | EOF) -> skip
			;
	    		 
INT_CONSTANT: INT // no leading zeros 
            ;
            
REAL_CONSTANT: INT* '.' [0-9]+ EXP?
				| INT '.' ([0-9]+ EXP?)*
				| INT EXP
             ;

CHAR_CONSTANT: '\''.'\'' | '\''CHAR_WS'\''			
			;

fragment CHAR_ALPHA: ('a'..'z') | ('A'..'Z') ;
fragment CHAR_NUMERIC: ('0'..'9');
fragment CHAR_SYMBOL: ':' | '.' | '~' | '|' | '&' | '/' | '\\' | ';' | '-' | '(' | ')' | '=';
fragment CHAR_WS: '\\n' | '\\t';

OP_ADD_SUB: '+' | '-'; 
OP_DIV_MUL: '*' | '/' | '%';
OP_LOG: '&&' | '||';
OP_NEG: '!';
OP_COMP:  ('>' | '>=' | '<' | '<=' | '!=' | '==');

MAIN_FUNC: 'main';
RETURN_CONSTANT: 'return';
BLOCK_START:'{';

            
ID: (('_')* LETTER+ ('_')* (INT)*)+          
  ;

fragment INT: [0] | [1-9] [0-9]*;
fragment EXP:[Ee] [+\-]? INT;
fragment LETTER: [a-zA-Z];
fragment ALPHANUMERIC: INT | LETTER;
             
