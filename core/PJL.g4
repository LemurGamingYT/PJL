grammar PJL;

// PJL Lexer

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';

SEMI : ';';
DOT : '.';
COMMA : ',';
EQUALS : '=';

IF : 'if';
ELSE : 'else';
FUNC : 'func' | 'fn';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
STRING : '"' (~["\r\n] | '""')* '"';
INT : '-'? [0-9]+;
FLOAT : '-'? [0-9]+? '.' [0-9]*;
NULL : 'null';
BOOL : ('true' | 'false');

WHITESPACE : [ \t\r\n] -> skip;
COMMENT : ('//' | '<--' | '#') ~[\r\n]* -> skip;
MULTILINECOMMENT : '/*' .*? '*/' -> skip;

// PJL Parsing

parse : stmt* EOF;

stmt
    : expr SEMI?
    | var_assignment SEMI?
    | func_assignment SEMI?
    ;

var_assignment : ID EQUALS expr;
func_assignment : FUNC ID LPAREN params? RPAREN block;

call : ID LPAREN args? RPAREN;

args : expr (COMMA expr)*;
params : ID (COMMA ID)*;

block : LBRACE stmt* RBRACE;

expr
    : atom
    | call
    ;

atom
    : ID
    | STRING
    | INT
    | FLOAT
    | NULL
    | BOOL
    ;
