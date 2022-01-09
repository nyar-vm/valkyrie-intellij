grammar Valkyrie;
import ValkyrieOperators, XID;
options {
	language = Java;
}

// $antlr-format useTab false, alignColons hanging, alignSemicolons hanging
// $antlr-format alignFirstTokens true

program: top_statement* EOF;
top_statement
    : define_namespace eos?
    | import_statement eos?
    | define_extension eos?
    | define_class eos?
    | define_union eos?
    | define_trait eos?
    | define_function eos?
    | define_type eos?
    | define_variale eos?
    | if_statement eos?
    | while_statement eos?
    | for_statement eos?
    | expression eos?
    ;
eos: SEMICOLON;
// ===========================================================================
define_namespace: KW_NAMESPACE namepath_free;
// ===========================================================================
import_statement: KW_IMPORT namepath_free;
// ===========================================================================
define_extension: KW_EXTENSION;
// ===========================================================================
define_class
    : macro_call* KW_CLASS namepath class_inherit? BRACE_L class_statements* BRACE_R
    ;
class_statements: define_method | class_field | class_eos;
class_inherit:    PARENTHESES_L namepath? PARENTHESES_R;
class_field: macro_call* identifier+ type_hint? parameter_default?;
class_eos: COMMA | SEMICOLON;
// ===========================================================================
define_trait
    : KW_TRAIT namepath BRACE_L trait_statements* BRACE_R
    ;
trait_statements: define_method eos?;
// ===========================================================================
define_union
    : KW_UNION namepath BRACE_L union_statements* BRACE_R
    ;
union_statements: define_function eos?;
// ===========================================================================
define_variale: KW_LET identifier OP_EQ expression;
// ===========================================================================
define_function
    : KW_FUNCTION namepath function_parameters type_hint? effect_hint? BRACE_L function_statements*
        BRACE_R
    ;
function_parameters
    : PARENTHESES_L parameter_item (COMMA parameter_item)* PARENTHESES_R
    | PARENTHESES_L PARENTHESES_R
    ;
parameter_item:      identifier type_hint? parameter_default?;
parameter_default:   OP_EQ inline_expression;
function_statements: top_statement | define_variale;
// ===========================================================================
define_method: identifier PARENTHESES_L PARENTHESES_R;
// ===========================================================================
define_type: KW_TYPE identifier OP_EQ identifier;
type_hint:   (COLON | OP_ARROW) type_expression;
effect_hint: OP_DIV type_expression;
// ===========================================================================
if_statement
    : KW_IF expression '{' top_statement '}' (
        KW_ELSE '{' top_statement '}'
    )?
    ;
// ===========================================================================
while_statement
    : KW_WHILE '(' expression ')' '{' top_statement '}'
    ;
// ===========================================================================
for_statement
    : KW_FOR identifier (KW_IN | OP_IN) inline_expression BRACE_L function_statements* BRACE_R
    ;
// ===========================================================================
expression
    : expression op_multiple expression   # EMul
    | expression op_plus expression       # EAdd
    | expression op_logic expression      # ELogic
    | expression infix_is type_expression # EIs
    | namepath '(' expr_list? ')'         # ECall
    | identifier '[' expression ']'       # EIndex
    | '(' expression ')'                  # EParens
    | control_expression                  # EControl
    | term                                # ETerm
    ;
inline_expression
    : inline_expression infix inline_expression # IOP
    | term                                      # ITerm
    ;

term
    : identifier        # EIdentifier
    | number            # ENumber
    | STRING            # EString
    | '[' expr_list ']' # EVector
    | SPECIAL           # ESpeicalLiteral
    ;

op_multiple: OP_MUL | OP_DIV;
op_plus:     OP_ADD | OP_SUB;
op_logic:    LOGIC_OR | LOGIC_AND;
infix_is:    KW_IS | KW_IS KW_NOT;

infix: GT | GE | LT | LE | OP_EE | OP_NE;
// ===========================================================================
type_expression
    : type_expression infix type_expression # TOp
    | '(' type_expression ')'               # TParens
    | term                                  # TTerm
    ;

expr_list: expression (COMMA expression)*;

// controls
control_expression
    : RETURN expression
    | RESUME expression
    | BREAK
    | CONTINUE
    | RAISE expression
    | YIELD RETURN? expression
    | YIELD BREAK expression
    | YIELD FROM expression
    ;
// ===========================================================================
macro_call: HASH namepath;

// namepath
namepath_free: identifier ((OP_PROPORTION | DOT) identifier)*;
namepath:      identifier (OP_PROPORTION identifier)*;
// identifier
identifier: UNICODE_ID;
// numbewr
number:        INTEGER number_suffix?;
number_suffix: UNICODE_ID;

