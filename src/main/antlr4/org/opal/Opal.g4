grammar Opal;

translationUnit
  : packageDeclaration importDeclarations?
  ;

packageDeclaration
  : 'package' IDENTIFIER ';'
  ;

importDeclarations
  : importDeclaration+
  ;

importDeclaration
  : 'import' importQualifiedName ('as' importName)? ';'
  ;

importQualifiedName
  : IDENTIFIER ('.' IDENTIFIER)*
  ;

importName
  : IDENTIFIER
  ;

expression
  : expr EOF
  ;

expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT
    |	'(' expr ')'
    ;

NEWLINE: [\r\n]+ -> skip;

WHITESPACE: [ \t] -> skip;

IDENTIFIER: [A-Za-z][A-Za-z0-9]*;

INT: [0-9]+;

