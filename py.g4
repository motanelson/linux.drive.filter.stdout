grammar py;

program : statement* EOF ;

// ==========================
// Statements
// ==========================

statement
    : varDecl
    | assignment
    | funcDecl
    | ifStatement
    | whileLoop
    | forLoop
    | printStatement
    | returnStmt
    | NEWLINE
    ;

// ==========================
// Declarações
// ==========================

varDecl : ID '=' expression NEWLINE ;
assignment : ID '=' expression NEWLINE ;

funcDecl : 'def' ID '(' paramList? ')' ':' block ;

paramList : param (',' param)* ;
param : ID ;

// ==========================
// Controle
// ==========================

ifStatement
    : 'if' expression ':' block
      ('elif' expression ':' block)*
      ('else' ':' block)?
    ;

whileLoop : 'while' expression ':' block ;

forLoop : 'for' ID 'in' expression ':' block ;

// ==========================
// Outros
// ==========================

printStatement : 'print' '(' expressionList ')' NEWLINE ;
returnStmt : 'return' expression? NEWLINE ;

block : '{' statement* '}' ;

// ==========================
// Expressões
// ==========================

expression : comparison ;

comparison
    : addition (('==' | '!=' | '<' | '>' | '<=' | '>=') addition)*
    ;

addition
    : multiplication (('+' | '-') multiplication)*
    ;

multiplication
    : primary (('*' | '/') primary)*
    ;

primary
    : literal
    | ID
    | funcCall
    | '(' expression ')'
    ;

funcCall : ID '(' argList? ')' ;

argList : expression (',' expression)* ;

expressionList : expression (',' expression)* ;

// ==========================
// Literais
// ==========================

literal : INT | FLOAT | STRING | BOOL ;

// ==========================
// Lexer
// ==========================

ID : [a-zA-Z_][a-zA-Z0-9_]* ;
INT : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ ;
STRING : '"' (~["])* '"' ;
BOOL : 'True' | 'False' ;

NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;