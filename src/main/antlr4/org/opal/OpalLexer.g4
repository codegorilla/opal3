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

IDENTIFIER: LETTER (LETTER | DIGIT | '_')*;

INT32_LITERAL: DIGIT+;

INT64_LITERAL: DIGIT+ LONG_SUFFIX;

UINT32_LITERAL: DIGIT+ UNSIGNED_SUFFIX;

UINT64_LITERAL: DIGIT+ ((UNSIGNED_SUFFIX LONG_SUFFIX) | (LONG_SUFFIX UNSIGNED_SUFFIX)) ;

FLOAT32_LITERAL
  : '.' DIGIT+ ('e' | 'E' DIGIT+)? FLOAT_SUFFIX?
  | DIGIT '.' DIGIT+ ('e' | 'E' DIGIT+)? FLOAT_SUFFIX?
  ;

FLOAT64_LITERAL
  : '.' DIGIT+ ('e' | 'E' DIGIT+)? DOUBLE_SUFFIX?
  | DIGIT '.' DIGIT+ ('e' | 'E' DIGIT+)? DOUBLE_SUFFIX?
  ;

fragment LONG_SUFFIX: 'l' | 'L';

fragment UNSIGNED_SUFFIX: 'u' | 'U';

fragment FLOAT_SUFFIX: 'f' | 'F';

fragment DOUBLE_SUFFIX: 'd' | 'D';

fragment DIGIT: [0-9];

fragment UPPER_LETTER: [A-Z];

fragment LOWER_LETTER: [a-z];

fragment LETTER: UPPER_LETTER | LOWER_LETTER;
