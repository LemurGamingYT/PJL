grammar PJL;

// Lexer

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';

ARITHOPS : '+' | '-' | '*' | '/' | '%' | '**';
LOGICOPS : '==' | '!=' | '>' | '<' | '<=' | '>=';
BOOLOPS : '&&' | 'and' | '||' | 'or';
DUALOPS : '++' | '--';

SEMI : ';';
DOT : '.';
COMMA : ',';
EQUALS : '=';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
FUNC : 'func' | 'fn';

NULL : 'null';
BOOL : ('true' | 'false');

ID : [a-zA-Z_][a-zA-Z0-9_]*;
STRING : '"' (~["\r\n] | '""')* '"';
FLOAT : '-'? [0-9]+? '.' [0-9]*;
INT : '-'? [0-9]+;

WHITESPACE : [ \t\r\n] -> skip;
COMMENT : ('//' | '<--' | '#') ~[\r\n]* -> skip;
MULTILINECOMMENT : '/*' .*? '*/' -> skip;

// Parsing

parse : stmt* EOF;

stmt
    : expr SEMI?
    | var_assignment SEMI?
    | func_assignment SEMI?
    | if_stmt
    | while_stmt
    | for_stmt
    ;

var_assignment : ID EQUALS expr;
func_assignment : FUNC ID LPAREN params? RPAREN block;

if_stmt : IF conditional_block block (ELSE IF conditional_block block)* (ELSE block)?;
while_stmt : WHILE conditional_block block;
for_stmt : FOR ID SEMI expr SEMI ID DUALOPS block;

conditional_block
    : LPAREN expr RPAREN
    | expr
    ;

call : ID LPAREN args? RPAREN;

args : expr (COMMA expr)*;
params : ID (COMMA ID)*;

block : LBRACE stmt* RBRACE;

expr
    : atom
    | call
    | expr op=ARITHOPS expr
    | expr op=LOGICOPS expr
    | expr op=BOOLOPS expr
    | expr DUALOPS
    ;

atom
    : ID
    | STRING
    | INT
    | FLOAT
    | NULL
    | BOOL
    ;
