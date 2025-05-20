grammar lang;

prog : (fnc | com)* EOF ;

fnc :  FUN ID LPAR RPAR LBRACE ((com)* | brainfuck )  RBRACE             # func
    ;


com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | TYPE ID ASSIGN exp  SEMICOLON                                     # assign
    | ID ASSIGN exp   SEMICOLON                                         # reAssign
    | TYPE ID LBRAK exp RBRAK ASSIGN exp   SEMICOLON                    # arrayAssign
    | SKIPP  SEMICOLON                                                  # skip
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | FOR LPAR forInit SEMICOLON exp SEMICOLON forStep RPAR LBRACE com RBRACE #for
    | OUT LPAR exp RPAR SEMICOLON                                       # out
    | RET ID SEMICOLON                                                  # return
    | exp SEMICOLON                                                     # comFuncCall
    | nondetCom                                                         # chainND
    ;

forInit
    : TYPE ID ASSIGN exp         # forDeclInit
    | ID ASSIGN exp              # forReassignInit
    |                            # emptyForInit
    ;

forStep
    : ID ASSIGN exp              # forReassignStep
    |                            # emptyForStep
    ;

nondetCom : nondetGroup (ND nondetGroup)+                               #exploreChain
          ;

nondetGroup
  : LPAR com* RPAR                                                      #insideCurly
  | LBRAK com* RBRAK                                                    #insideBrake
  | LBRACE com* RBRACE                                                  #insedeBrace
  ;


brainfuck :SLY LBRACE bf RBRACE ARNOLD                                    #bfcommand
       ;

bf  : OP = (LT | GT | PLUS | MINUS | DOT | COMMA ) bf                  #bfsintax
    | LBRAK bf RBRAK bf                                                #bfloop
    |                                                                  #nil
    ;

exp : FLOAT                               # float
    | BOOL                                # bool
    | STRING                              #string
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | exp CONCAT exp                      # concat
    | IN LPAR RPAR                        # input
    | TOSTR LPAR exp RPAR                 # tostr
    | ID LBRAK exp RBRAK                  # arrayExp
    | ID LPAR RPAR                        # funcCall
    | ID                                  # id
    ;




FLOAT : INT | (INT | '-' '0') '.' DIGIT + ;
fragment INT : NAT | '-' POS ;
fragment NAT : '0' | POS ;
fragment POS : POSDIGIT DIGIT * ;
fragment DIGIT : '0' | POSDIGIT ;
fragment POSDIGIT : [1-9] ;

BOOL : 'true' | 'false' ;

STRING : '"' STRCHR* '"' ;
fragment STRCHR : ~["\\] | ESC ;
fragment ESC : '\\' [btnfr"'\\] ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : '%' ;
POW   : '^' ;
DOT   :  '.';
COMMA :  ',';
CONCAT : '++';


AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
FOR    : 'for'  ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
TYPE   : 'var' ;
RET    : 'ret' ;
SLY    : 'sly';
ARNOLD : 'arnold';
OUT    : 'print' ;
IN     : 'input';
TOSTR  : 'str';
FUN    : 'fun' ;
ND     :     'ND';

LPAR      : '(' ;
RPAR      : ')';
LBRAK     :  '[';
RBRAK     :  ']';
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;

ID : [a-zA-Z][a-zA-Z0-9]* ;
//

WS : [ \t\r\n]+ -> skip ;
