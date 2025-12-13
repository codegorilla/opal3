lexer grammar OpalLexer;


AS:         'as';
IMPORT:     'import';
PACKAGE:    'package';
USE:        'use';


COLON: ':';
PERIOD: '.';
SEMICOLON: ';';

L_BRACE: '[';
L_BRACKET: '{';
L_PARENTHESIS: '(';
R_BRACE: ']';
R_BRACKET: '}';
R_PARENTHESIS: ')';

NEWLINE: [\r\n]+ -> skip;

WHITESPACE: [ \t] -> skip;

IDENTIFIER: [A-Za-z][A-Za-z0-9]*;

INT: [0-9]+;

