parser grammar OpalParser;

options {
    tokenVocab=OpalLexer;
}

translationUnit
  : packageDeclaration importDeclarations? useDeclarations? otherDeclarations? EOF
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

useDeclarations
  : useDeclaration+
  ;

useDeclaration
  : 'use' useQualifiedName ';'
  ;

useQualifiedName
  : IDENTIFIER '.' useQualifiedNameTail
  ;

useQualifiedNameTail
  : IDENTIFIER ('.' useQualifiedNameTail)?
  | useNameGroup
  | useNameWildcard
  ;

useNameGroup
  : '{' IDENTIFIER (',' IDENTIFIER)* '}'
  ;

useNameWildcard
  : '*'
  ;

otherDeclarations
  : variableDeclaration
  ;

variableDeclaration
  : 'var' IDENTIFIER typeSpecifier? initializer? ';'
  ;

initializer
  : '=' expr
  ; 

typeSpecifier
  : ':' type
  ;

type
  : pointerGroup? directType arrayGroup?
  ;

pointerGroup
  : ('*')+
  ;

arrayGroup
  : ('[' expr ']')+
  ;

directType
  : nominalType
  | primitiveType
  ;

nominalType
  : IDENTIFIER
  ;

primitiveType
  : 'bool'
  | 'double'
  | 'float'
  | 'float32'
  | 'float64'
  | 'int'
  | 'int8'
  | 'int16'
  | 'int32'
  | 'int64'
  | 'long'
  | 'null_t'
  | 'short'
  | 'uint'
  | 'uint8'
  | 'uint16'
  | 'uint32'
  | 'uint64'
  | 'void'
  ;


expression
  : expr EOF
  ;

expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT
    |	'(' expr ')'
    ;
