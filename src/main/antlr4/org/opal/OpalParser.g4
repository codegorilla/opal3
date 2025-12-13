parser grammar OpalParser;

options {
    tokenVocab=OpalLexer;
}

// TRANSLATION UNIT

translationUnit
  : packageDeclaration importDeclarations? useDeclarations? otherDeclarations? EOF
  ;

// DECLARATIONS

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
  : '=' expression
  ; 

// STATEMENTS



// EXPRESSIONS

expression
  : assignmentExpression
  ;

assignmentExpression
  : logicalOrExpression ('=' logicalOrExpression)*
  ;

logicalOrExpression
  : logicalAndExpression ('||' logicalAndExpression)*
  ;

logicalAndExpression
  : inclusiveOrExpression ('&&' inclusiveOrExpression)*
  ;

inclusiveOrExpression
  : exclusiveOrExpression ('|' exclusiveOrExpression)*
  ;

exclusiveOrExpression
  : andExpression ('^' andExpression)*
  ;

andExpression
  : equalityExpression ('&' equalityExpression)*
  ;

equalityExpression
  : relationalExpression (('=='|'!=') relationalExpression)*
  ;

relationalExpression
  : shiftExpression (('>'|'<'|'>='|'<=') shiftExpression)*
  ;

shiftExpression
  : additiveExpression (('>>'|'<<') additiveExpression)*
  ;

additiveExpression
  : multiplicativeExpression (('+'|'-') multiplicativeExpression)*
  ;

multiplicativeExpression
  : unaryExpression (('*'|'/') unaryExpression)*
  ;

unaryExpression
  : ('-'|'*') unaryExpression
  | castExpression
  | deleteExpression
  | newExpression
  | postfixExpression
  ;

castExpression
  : 'cast' '<' type '>'
  ;

deleteExpression
  : 'delete' ('[' ']')? expression
  ;

newExpression
  : 'new' type newPlacement? newInitializer?
  ;

newPlacement
  : '[' expression ']'
  ;

newInitializer
  : '(' expression (',' expression)* ')'
  ;

postfixExpression
  : arraySubscript
  | dereferencingMemberAccess
  | memberAccess
  | routineCall
  | primaryExpression
  ;

arraySubscript
  : '[' expression ']'
  ;

dereferencingMemberAccess
  : IDENTIFIER '->' IDENTIFIER
  ;

memberAccess
  : IDENTIFIER '.' IDENTIFIER
  ;

routineCall
  : IDENTIFIER routineArguments
  ;

routineArguments
  : '(' routineArgument (',' routineArgument)* ')'
  ;

routineArgument
  : expression
  ;

primaryExpression
  : IDENTIFIER
  | literal
  | parenthesizedExpression
  | THIS
  ;

parenthesizedExpression
  : '(' expression ')'
  ;

literal
  : booleanLiteral
  | integerLiteral
  ;

booleanLiteral
  : TRUE
  | FALSE
  ;

integerLiteral
  : INT_LITERAL
  ;

// TYPES

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
  : ('[' expression ']')+
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
