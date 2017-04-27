public class Token {

	int token;
	String lexeme;

	static final int EOF = 0;
	static final int IDENTIFIER = 1;
	static final int BREAK = 2;
	static final int DEFAULT = 3;
	static final int FUNC = 4;
	static final int CASE = 5;
	static final int STRUCT = 6;
	static final int ELSE = 7;
	static final int PACKAGE = 8;
	static final int SWITCH = 9;
	static final int CONST = 10;
	static final int IF = 11;
	static final int TYPE = 12;
	static final int FOR = 13;
	static final int IMPORT = 14;
	static final int RETURN = 15;
	static final int VAR = 16;
	static final int OR_OP = 17;
	static final int AND_OP = 18;
	static final int REL_OP = 19;
	static final int INT_LIT = 20;
	static final int PLUS = 21;
	static final int MINUS = 22;
	static final int STRING_LIT = 23;
	static final int OPEN_PARAN = 24;
	static final int CLOSE_PARAN = 25;
	static final int OPEN_CURLY = 26;
	static final int CLOSE_CURLY = 27;
	static final int OPEN_SQUARE = 28;
	static final int CLOSE_SQUARE = 29;
	static final int SEMI_COLON = 30;
	static final int COMMA = 31;
	static final int DOT = 32;
	static final int COLON = 33;
	static final int COLON_EQUAL = 34;
	static final int EQUAL = 35;
	static final int CDOTS = 36;
	static final int ASTRISK = 37;
	static final int SHIFT_LEFT = 38;
	static final int SHIFT_RIGHT = 39;
	static final int BAR = 40;
	static final int SLASH = 41;
	static final int EXCLAMATION = 42;
	static final int LESS_DASH = 43;
	static final int AMBERSAND = 44;
	static final int PERCENT = 45;
	static final int INCREMENT = 46;
	static final int DECREMENT = 47;
	static final int ERROR = 48;

	public Token(int token, String lexeme) {
		this.token = token;
		this.lexeme = lexeme;
	}

	public int getTokenType() {
		return token;
	}

	public String getLexeme() {
		return lexeme;
	}

	// String representation of token + lexeme
	public String toString() {

		switch (token) {
		case IDENTIFIER:
			return "IDENTIFIER : " + lexeme;
		case BREAK:
			return "BREAK : " + lexeme;
		case DEFAULT:
			return "DEFAULT : " + lexeme;
		case FUNC:
			return "FUNC : " + lexeme;
		case CASE:
			return "CASE : " + lexeme;
		case STRUCT:
			return "STRUCT : " + lexeme;
		case ELSE:
			return "ELSE : " + lexeme;
		case PACKAGE:
			return "PACKAGE : " + lexeme;
		case SWITCH:
			return "SWITCH : " + lexeme;
		case CONST:
			return "CONST : " + lexeme;
		case IF:
			return "IF : " + lexeme;
		case TYPE:
			return "TYPE : " + lexeme;
		case FOR:
			return "FOR : " + lexeme;
		case IMPORT:
			return "IMPORT : " + lexeme;
		case RETURN:
			return "RETURN : " + lexeme;
		case VAR:
			return "VAR : " + lexeme;
		case OR_OP:
			return "OR_OP : " + lexeme;
		case AND_OP:
			return "AND_OP : " + lexeme;
		case REL_OP:
			return "REL_OP : " + lexeme;
		case INT_LIT:
			return "INT_LIT : " + lexeme;
		case STRING_LIT:
			return "STRING_LIT : " + lexeme;
		case PLUS:
			return "PLUS :" + lexeme;
		case MINUS:
			return "MINUS :" + lexeme;
		case OPEN_PARAN:
			return "OPEN_PARAN : " + lexeme;
		case CLOSE_PARAN:
			return "CLOSE_PARAN : " + lexeme;
		case OPEN_CURLY:
			return "OPEN_CURLY : " + lexeme;
		case CLOSE_CURLY:
			return "CLOSE_CURLY : " + lexeme;
		case OPEN_SQUARE:
			return "OPEN_SQUARE : " + lexeme;
		case CLOSE_SQUARE:
			return "CLOSE_SQUARE : " + lexeme;
		case SEMI_COLON:
			return "SEMI_COLON : " + lexeme;
		case COMMA:
			return "COMMA : " + lexeme;
		case DOT:
			return "DOT : " + lexeme;
		case COLON:
			return "COLON : " + lexeme;
		case COLON_EQUAL:
			return "COLON_EQUAL : " + lexeme;
		case EQUAL:
			return "EQUAL : " + lexeme;
		case CDOTS:
			return "CDOTS : " + lexeme;
		case ASTRISK:
			return "ASTRISK : " + lexeme;
		case SHIFT_LEFT:
			return "SHIFT_LEFT : " + lexeme;
		case SHIFT_RIGHT:
			return "SHIFT_RIGHT : " + lexeme;
		case BAR:
			return "BAR : " + lexeme;
		case SLASH:
			return "SLASH : " + lexeme;
		case EXCLAMATION:
			return "EXCLAMATION : " + lexeme;
		case LESS_DASH:
			return "LESS_DASH : " + lexeme;
		case AMBERSAND:
			return "AMBERSAND : " + lexeme;
		case PERCENT:
			return "PERCENT : " + lexeme;
		case INCREMENT:
			return "INCREMENT : " + lexeme;
		case DECREMENT:
			return "DECREMENT : " + lexeme;
		case EOF:
			return "EOF: " + lexeme;
		default:
			return "ERROR: " + lexeme;
		}
	}
}
