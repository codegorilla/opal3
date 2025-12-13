lexer grammar OpalLexer;


AS:         'as';
CAST:       'cast';
DELETE:     'delete';
FALSE:      'false';
IMPORT:     'import';
NEW:        'new';
PACKAGE:    'package';
THIS:       'this';
TRUE:       'true';
USE:        'use';
VAR:        'var';

BOOL:       'bool';
DOUBLE:     'double';
FLOAT:      'float';
FLOAT32:    'float32';
FLOAT64:    'float64';
INT:        'int';
INT8:       'int8';
INT16:      'int16';
INT32:      'int32';
INT64:      'int64';
LONG:       'long';
NULL_T:     'null_t';
SHORT:      'short';
UINT:       'uint';
UINT8:      'uint8';
UINT16:     'uint16';
UINT32:     'uint32';
UINT64:     'uint64';
VOID:       'void';

AMPERSAND:    '&';
ASTERISK:     '*';
BAR:          '|';
CARAT:        '^';
COMMA:        ',';
COLON:        ':';
DASH:         '-';
EQUAL:        '=';
LESS:         '<';
GREATER:      '>';
PERIOD:       '.';
PLUS:         '+';
SEMICOLON:    ';';
SLASH:        '/';

AMPERSAND_X2:   '&&';
BAR_X2:         '||';
EQUAL_X2:       '==';
NOT_EQUAL:      '!=';
GREATER_EQUAL:  '>=';
LESS_EQUAL:     '<=';
GREATER_X2:     '>>';
LESS_X2:        '<<';
DASH_GREATER:   '->';

L_BRACE:        '[';
L_BRACKET:      '{';
L_PARENTHESIS:  '(';
R_BRACE:        ']';
R_BRACKET:      '}';
R_PARENTHESIS:  ')';

NEWLINE: [\r\n]+ -> skip;

WHITESPACE: [ \t] -> skip;

IDENTIFIER: [A-Za-z][A-Za-z0-9]*;

INT_LITERAL: [0-9]+;

