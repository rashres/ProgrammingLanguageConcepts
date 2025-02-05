//Rahul Shreshta
//Assingment 1
//PartA PLC

grammar EasyCalc;

// Main program structure
program : declaration* statement* ENDMARK;

// Variable declarations
declaration : datatype IDENTIFIER SEMICOLON;
datatype : (BOOLEAN | INTEGER | FLOATING);

// Statement types
statement : assignment
          | inputStmt
          | outputStmt
          ;

assignment : IDENTIFIER ASSIGNOP expression SEMICOLON;
inputStmt  : READ IDENTIFIER SEMICOLON;
outputStmt : WRITE expression SEMICOLON;

// Expression hierarchy
expression : LITERAL                           # Literal
          | IDENTIFIER                         # Variable
          | LPAREN expression RPAREN           # Parentheses
          | typecast LPAREN expression RPAREN  # TypeConversion
          | expression mathOp expression       # Math
          | expression compareOp expression    # Comparison
          | expression logicOp expression      # Logic
          | conditional                        # IfStatement
          ;

// Operators with precedence
mathOp    : MULTIPLY | DIVIDE | PLUS | MINUS;
compareOp : LESSTHAN | GREATERTHAN | EQUALS;
logicOp   : AND | OR;
typecast  : TO_INT | TO_REAL;
conditional : IF expression THEN expression ELSE expression;

// Tokens
ENDMARK     : '$$';
SEMICOLON   : ';';
BOOLEAN     : 'bool';
INTEGER     : 'int';
FLOATING    : 'real';
ASSIGNOP    : ':=';
READ        : 'read';
WRITE       : 'write';
LPAREN      : '(';
RPAREN      : ')';
TO_INT      : 'to_int';
TO_REAL     : 'to_real';
MULTIPLY    : '*';
DIVIDE      : '/';
PLUS        : '+';
MINUS       : '-';
LESSTHAN    : '<';
GREATERTHAN : '>';
EQUALS      : '==';
AND         : 'and';
OR          : 'or';
IF          : 'if';
THEN        : 'then';
ELSE        : 'else';

LITERAL     : [0-9]+
           | [0-9]* ('.' [0-9] | [0-9] '.') [0-9]*
           | 'true'
           | 'false'
           ;

IDENTIFIER  : [a-zA-Z][a-zA-Z0-9_]*;

WHITESPACE  : [ \t\r\n]+ -> skip;