/* Generated By:JavaCC: Do not edit this line. CSharpParserConstants.java */
package tmp.generated_csharp;

public interface CSharpParserConstants {

  int EOF = 0;
  int ABSTRACT = 7;
  int LONG = 8;
  int AS = 9;
  int NAMESPACE = 10;
  int BASE = 11;
  int NEW = 12;
  int BOOL = 13;
  int NULL = 14;
  int BREAK = 15;
  int OBJECT = 16;
  int BYTE = 17;
  int OPERATOR = 18;
  int CASE = 19;
  int OUT = 20;
  int CATCH = 21;
  int OVERRIDE = 22;
  int CHAR = 23;
  int PARAMS = 24;
  int CHECKED = 25;
  int PRIVATE = 26;
  int CLASS = 27;
  int PROTECTED = 28;
  int CONST = 29;
  int PUBLIC = 30;
  int CONTINUE = 31;
  int READONLY = 32;
  int DECIMAL = 33;
  int REF = 34;
  int DEFAULTTOKEN = 35;
  int RETURN = 36;
  int DELEGATE = 37;
  int SBYTE = 38;
  int DO = 39;
  int SEALED = 40;
  int DOUBLE = 41;
  int SHORT = 42;
  int ELSE = 43;
  int SIZEOF = 44;
  int ENUM = 45;
  int STACKALLOC = 46;
  int EVENT = 47;
  int STATIC = 48;
  int EXPLICIT = 49;
  int STRING = 50;
  int EXTERN = 51;
  int STRUCT = 52;
  int FALSE = 53;
  int SWITCH = 54;
  int FINALLY = 55;
  int THIS = 56;
  int FIXED = 57;
  int THROW = 58;
  int FLOAT = 59;
  int TRUE = 60;
  int FOR = 61;
  int TRY = 62;
  int FOREACH = 63;
  int TYPEOF = 64;
  int GOTO = 65;
  int UINT = 66;
  int IF = 67;
  int ULONG = 68;
  int IMPLICIT = 69;
  int UNCHECKED = 70;
  int IN = 71;
  int UNSAFE = 72;
  int INT = 73;
  int USHORT = 74;
  int INTERFACE = 75;
  int USING = 76;
  int INTERNAL = 77;
  int VIRTUAL = 78;
  int IS = 79;
  int VOID = 80;
  int LOCK = 81;
  int WHILE = 82;
  int VOLATILE = 83;
  int WHERE = 84;
  int ASSEMBLY = 85;
  int MODULE = 86;
  int PARTIAL = 87;
  int DOT = 88;
  int LBRACE = 89;
  int RBRACE = 90;
  int LBRACK = 91;
  int RBRACK = 92;
  int LPAREN = 93;
  int RPAREN = 94;
  int PLUS = 95;
  int PLUS_ASN = 96;
  int MINUS = 97;
  int MINUS_ASN = 98;
  int STAR = 99;
  int STAR_ASN = 100;
  int DIV = 101;
  int DIV_ASN = 102;
  int MOD = 103;
  int MOD_ASN = 104;
  int INC = 105;
  int DEC = 106;
  int SL = 107;
  int SL_ASN = 108;
  int SR = 109;
  int SR_ASN = 110;
  int BSR = 111;
  int BSR_ASN = 112;
  int AMPER = 113;
  int BAND_ASN = 114;
  int BOR = 115;
  int BOR_ASN = 116;
  int CARET = 117;
  int BXOR_ASN = 118;
  int TILDE = 119;
  int ASSIGN = 120;
  int EQUAL = 121;
  int LTHAN = 122;
  int LE = 123;
  int GTHAN = 124;
  int GE = 125;
  int BANG = 126;
  int NOT_EQUAL = 127;
  int LOR = 128;
  int LAND = 129;
  int COMMA = 130;
  int COLON = 131;
  int SEMI = 132;
  int HASH = 133;
  int QUOTE = 134;
  int QMARK = 135;
  int ARROW = 136;
  int UNICODE_ESCAPE_SEQUENCE = 137;
  int IDENTIFIER = 138;
  int IDENTIFIER_START_CHARACTER = 139;
  int IDENTIFIER_PART_CHARACTER = 140;
  int NUMERIC_LITERAL = 141;
  int HEXADECIMAL_INTEGER_LITERAL = 142;
  int CHARACTER_LITERAL = 143;
  int REGULAR_STRING_LITERAL = 144;
  int VERBATIM_STRING_LITERAL = 145;
  int DECIMAL_DIGIT = 146;
  int INTEGER_TYPE_SUFFIX = 147;
  int HEX_DIGIT = 148;
  int EXPONENT_PART = 149;
  int SIGN = 150;
  int REAL_TYPE_SUFFIX = 151;
  int CHARACTER = 152;
  int SINGLE_CHARACTER = 153;
  int SIMPLE_ESCAPE_SEQUENCE = 154;
  int HEXADECIMAL_ESCAPE_SEQUENCE = 155;
  int REGULAR_STRING_LITERAL_CHARACTER = 156;
  int SINGLE_REGULAR_STRING_LITERAL_CHARACTER = 157;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "<token of kind 6>",
    "\"abstract\"",
    "\"long\"",
    "\"as\"",
    "\"namespace\"",
    "\"base\"",
    "\"new\"",
    "\"bool\"",
    "\"null\"",
    "\"break\"",
    "\"object\"",
    "\"byte\"",
    "\"operator\"",
    "\"case\"",
    "\"out\"",
    "\"catch\"",
    "\"override\"",
    "\"char\"",
    "\"params\"",
    "\"checked\"",
    "\"private\"",
    "\"class\"",
    "\"protected\"",
    "\"const\"",
    "\"public\"",
    "\"continue\"",
    "\"readonly\"",
    "\"decimal\"",
    "\"ref\"",
    "\"default\"",
    "\"return\"",
    "\"delegate\"",
    "\"sbyte\"",
    "\"do\"",
    "\"sealed\"",
    "\"double\"",
    "\"short\"",
    "\"else\"",
    "\"sizeof\"",
    "\"enum\"",
    "\"stackalloc\"",
    "\"event\"",
    "\"static\"",
    "\"explicit\"",
    "\"string\"",
    "\"extern\"",
    "\"struct\"",
    "\"false\"",
    "\"switch\"",
    "\"finally\"",
    "\"this\"",
    "\"fixed\"",
    "\"throw\"",
    "\"float\"",
    "\"true\"",
    "\"for\"",
    "\"try\"",
    "\"foreach\"",
    "\"typeof\"",
    "\"goto\"",
    "\"uint\"",
    "\"if\"",
    "\"ulong\"",
    "\"implicit\"",
    "\"unchecked\"",
    "\"in\"",
    "\"unsafe\"",
    "\"int\"",
    "\"ushort\"",
    "\"interface\"",
    "\"using\"",
    "\"internal\"",
    "\"virtual\"",
    "\"is\"",
    "\"void\"",
    "\"lock\"",
    "\"while\"",
    "\"volatile\"",
    "\"where\"",
    "\"assembly\"",
    "\"module\"",
    "\"partial\"",
    "\".\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"+\"",
    "\"+=\"",
    "\"-\"",
    "\"-=\"",
    "\"*\"",
    "\"*=\"",
    "\"/\"",
    "\"/=\"",
    "\"%\"",
    "\"%=\"",
    "\"++\"",
    "\"--\"",
    "\"<<\"",
    "\"<<=\"",
    "\">>\"",
    "\">>=\"",
    "\">>>\"",
    "\">>>=\"",
    "\"&\"",
    "\"&=\"",
    "\"|\"",
    "\"|=\"",
    "\"^\"",
    "\"^=\"",
    "\"~\"",
    "\"=\"",
    "\"==\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"!\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\",\"",
    "\":\"",
    "\";\"",
    "\"#\"",
    "\"\\\"\"",
    "\"?\"",
    "\"->\"",
    "<UNICODE_ESCAPE_SEQUENCE>",
    "<IDENTIFIER>",
    "<IDENTIFIER_START_CHARACTER>",
    "<IDENTIFIER_PART_CHARACTER>",
    "<NUMERIC_LITERAL>",
    "<HEXADECIMAL_INTEGER_LITERAL>",
    "<CHARACTER_LITERAL>",
    "<REGULAR_STRING_LITERAL>",
    "<VERBATIM_STRING_LITERAL>",
    "<DECIMAL_DIGIT>",
    "<INTEGER_TYPE_SUFFIX>",
    "<HEX_DIGIT>",
    "<EXPONENT_PART>",
    "<SIGN>",
    "<REAL_TYPE_SUFFIX>",
    "<CHARACTER>",
    "<SINGLE_CHARACTER>",
    "<SIMPLE_ESCAPE_SEQUENCE>",
    "<HEXADECIMAL_ESCAPE_SEQUENCE>",
    "<REGULAR_STRING_LITERAL_CHARACTER>",
    "<SINGLE_REGULAR_STRING_LITERAL_CHARACTER>",
    "\"#region\"",
    "\"#endregion\"",
  };

}