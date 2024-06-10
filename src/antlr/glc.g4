grammar glc;

// Regras principais
programa         : declaracao* EOF;

declaracao       : declaracaoVariavel
                 | declaracaoFuncao
                 | declaracaoEstrutura
                 | estruturaControle
                 | comentario;

// Declaração de Variável
declaracaoVariavel : tipo ID ';'
                   | tipo ID '=' expressao ';';

tipo              : 'int'
                  | 'float'
                  | 'double'
                  | 'char'
                  | 'boolean';

// Declaração de Função
declaracaoFuncao : tipo ID '(' parametros? ')' bloco;

// Parâmetros de Função
parametros       : parametro (',' parametro)*;

parametro        : tipo ID
                 | tipo ID '[]'
                 | tipo '...' ID;

// Bloco
bloco : '{' (declaracaoVariavel | estruturaControle | expressao ';')* '}';

// Comentário
comentario       : '//' ~('\r' | '\n')* ('\r'? '\n')?
                 | '/*' .*? '*/';

// Expressões
expressao        : atribuicao
                 | expressaoLogica;

atribuicao       : ID '=' expressao
                 | ID '+=' expressao
                 | ID '-=' expressao
                 | ID '*=' expressao
                 | ID '/=' expressao
                 | ID '%=' expressao
                 | ID '&&=' expressao
                 | ID '||=' expressao;

// Estruturas de Controle
estruturaControle : 'if' '(' expressao ')' bloco
                  | 'if' '(' expressao ')' bloco 'else' bloco
                  | 'while' '(' expressao ')' bloco
                  | 'for' '(' declaracaoVariavel expressao ';' expressao ')' bloco
                  | 'switch' '(' expressao ')' caseLista
                  | 'break' ';'
                  | 'continue' ';'
                  | 'return' expressao ';';

caseLista        : caseDecl*;

caseDecl         : 'case' expressao ':' bloco
                 | 'default' ':' bloco;

// Declaração de Estruturas
declaracaoEstrutura : 'struct' ID '{' declaracaoVariavel* '}' ';';

// Arrays
array            : ID '[' expressao ']'
                 | ID '[' ']';

arrayInicializacao : '{' expressaoLista '}';

// Expressões (parte 2)
expressaoLista   : expressao (',' expressao)*;

expressaoLogica  : expressaoRelacional
                 | expressaoLogica '&&' expressaoRelacional
                 | expressaoLogica '||' expressaoRelacional
                 | '!' expressaoRelacional;

expressaoRelacional : expressaoAritmetica
                   | expressaoAritmetica '>' expressaoAritmetica
                   | expressaoAritmetica '>=' expressaoAritmetica
                   | expressaoAritmetica '<' expressaoAritmetica
                   | expressaoAritmetica '<=' expressaoAritmetica
                   | expressaoAritmetica '!=' expressaoAritmetica
                   | expressaoAritmetica '==' expressaoAritmetica;

expressaoAritmetica : expressaoMultiplicativa
                    | expressaoAritmetica '+' expressaoMultiplicativa
                    | expressaoAritmetica '-' expressaoMultiplicativa;

expressaoMultiplicativa : expressaoUnaria
                       | expressaoMultiplicativa '*' expressaoUnaria
                       | expressaoMultiplicativa '/' expressaoUnaria
                       | expressaoMultiplicativa '%' expressaoUnaria;

expressaoUnaria   : expressaoPostfix
                  | '-' expressaoUnaria
                  | '++' expressaoPostfix
                  | '--' expressaoPostfix;

expressaoPostfix  : primaria
                  | primaria '[' expressao ']'
                  | primaria '(' argumentos ')'
                  | primaria '.' ID
                  | primaria '->' ID;

argumentos        : expressaoLista
                  | ;

primaria          : ID
                  | NUM_INT
                  | NUM_DEC
                  | CARACTERE
                  | BOOLEANO
                  | TEXTO
                  | '(' expressao ')';

// Regras léxicas
ID                : [a-zA-Z_][a-zA-Z_0-9]*;
NUM_INT           : [0-9]+;
NUM_DEC           : [0-9]+ '.' [0-9]* | '.' [0-9]+;
CARACTERE         : '\'' . '\'';
BOOLEANO          : 'true' | 'false';
TEXTO             : '"' (~["\\] | '\\' .)* '"';
WS                : [ \t\r\n]+ -> skip;
COMMENT           : '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip;
KEYWORD           : 'int' | 'float' | 'double' | 'char' | 'boolean' | 'void'
                  | 'if' | 'else' | 'for' | 'while' | 'switch' | 'case'
                  | 'default' | 'break' | 'continue' | 'return'
                  | 'main' | 'scanf' | 'println';
OPERADOR          : '==' | '!=' | '<=' | '>=' | '&&' | '||'
                  | '+' | '-' | '*' | '/' | '%' | '!'
                  | '<' | '>' | '=' | '+=' | '-=' | '*=' | '/=' | '%='
                  | '&&=' | '||=';
SIMBOLO           : '[' | ']' | '{' | '}' | '(' | ')' | ',' | ';';
