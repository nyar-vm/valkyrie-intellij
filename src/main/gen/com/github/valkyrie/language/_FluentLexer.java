/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.valkyrie.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import com.intellij.util.containers.IntStack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.valkyrie.language.psi.FluentTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Valkyrie.flex</tt>
 */
public class _FluentLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int StringQuote = 2;
  public static final int TextContext = 4;
  public static final int TextContextSpace = 6;
  public static final int CodeContext = 8;
  public static final int SelectionStart = 10;
  public static final int SelectionText = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\2\2\1\1\16\22\0\1\1\1\0\1\37\1\3\1\27\3\0\1\31\1\32\1\4\1\0\1"+
    "\35\1\6\1\13\1\0\1\7\11\11\1\36\1\26\1\23\1\30\1\24\2\0\4\10\1\14\1\10\16"+
    "\5\1\21\5\5\1\33\1\17\1\34\1\25\1\12\1\0\4\10\1\14\1\10\16\5\1\20\5\5\1\22"+
    "\1\0\1\15\7\0\1\1\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1"+
    "\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\17"+
    "\1\20\1\21\2\2\1\22\1\23\3\24\1\25\1\5"+
    "\2\26\1\1\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\1\1\37\1\40\2\2\1\41\4\42"+
    "\1\0\1\43\1\2\1\0\1\44\1\0\1\45\1\26"+
    "\1\0\1\46\2\17\1\0\2\17\1\45\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\340\0\340\0\340\0\340\0\340"+
    "\0\340\0\340\0\340\0\340\0\340\0\u0160\0\u0180\0\340"+
    "\0\u01a0\0\u01c0\0\u01e0\0\340\0\340\0\u0200\0\u0220\0\u0240"+
    "\0\340\0\u0260\0\u0280\0\u02a0\0\u02c0\0\340\0\340\0\340"+
    "\0\340\0\340\0\340\0\340\0\340\0\u02e0\0\340\0\u0300"+
    "\0\u0320\0\u0340\0\340\0\u0160\0\u0360\0\u0380\0\340\0\u03a0"+
    "\0\340\0\u03c0\0\u02c0\0\340\0\u0280\0\u03e0\0\u0400\0\u0320"+
    "\0\340\0\u0420\0\u0440\0\u0460\0\u0480\0\u0360\0\u0460\0\u04a0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\2\11\1\12\1\10\1\13\1\14\1\10\1\13"+
    "\2\10\1\15\1\13\1\16\1\11\1\10\2\13\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\7\10\17\26"+
    "\1\27\17\26\1\30\2\31\1\32\12\31\1\10\1\33"+
    "\3\31\1\34\15\31\1\35\1\36\1\37\13\35\1\40"+
    "\21\35\1\10\2\11\1\12\1\41\1\13\1\42\1\43"+
    "\1\13\1\44\1\10\1\45\1\13\1\46\1\11\1\10"+
    "\2\13\5\10\1\24\1\10\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\10\2\11\1\10\1\41\1\13"+
    "\1\56\1\43\1\13\1\44\1\10\1\45\1\13\1\10"+
    "\1\11\1\10\2\13\11\10\1\51\1\57\3\10\2\60"+
    "\1\61\12\60\1\46\1\62\3\60\1\63\15\60\41\0"+
    "\2\11\13\0\1\11\21\0\2\12\1\0\13\12\1\0"+
    "\21\12\5\0\6\13\1\0\1\13\3\0\2\13\16\0"+
    "\37\26\1\0\20\64\1\65\1\66\15\64\1\67\2\31"+
    "\1\0\12\31\2\0\3\31\1\0\15\31\1\0\2\70"+
    "\1\71\1\0\2\71\1\0\1\71\3\0\1\71\1\0"+
    "\1\70\1\0\2\71\17\0\1\70\1\72\1\71\1\0"+
    "\2\71\1\0\1\71\3\0\1\71\1\0\1\70\1\0"+
    "\2\71\17\0\2\36\13\0\1\36\22\0\2\36\1\71"+
    "\1\0\2\71\1\0\1\71\3\0\1\71\1\0\1\36"+
    "\1\0\2\71\17\0\1\36\1\37\1\71\1\0\2\71"+
    "\1\0\1\71\3\0\1\71\1\0\1\36\1\0\2\71"+
    "\25\0\1\43\1\0\1\44\1\0\1\73\10\0\1\74"+
    "\22\0\1\75\1\0\1\75\1\0\1\76\33\0\1\44"+
    "\1\0\1\44\1\77\1\76\33\0\1\76\1\0\1\76"+
    "\35\0\1\43\1\0\1\44\1\0\1\73\24\0\2\60"+
    "\1\0\12\60\2\0\3\60\1\0\15\60\1\0\2\100"+
    "\1\0\1\101\11\0\1\100\14\0\1\101\5\0\1\100"+
    "\1\61\1\0\1\101\11\0\1\100\14\0\1\101\4\0"+
    "\7\26\3\102\2\26\1\102\22\26\1\0\7\26\3\103"+
    "\2\26\1\103\22\26\2\0\2\70\10\0\1\71\2\0"+
    "\1\70\22\0\2\70\1\71\1\0\2\71\1\0\1\71"+
    "\2\0\2\71\1\0\1\70\1\0\2\71\25\0\1\76"+
    "\1\0\1\76\2\0\1\104\32\0\1\77\1\0\2\77"+
    "\25\0\7\26\3\105\2\26\1\105\22\26\1\0\7\26"+
    "\3\106\2\26\1\106\22\26\10\0\1\107\1\0\1\107"+
    "\26\0\7\26\3\110\2\26\1\110\22\26\1\0\7\26"+
    "\3\64\2\26\1\64\22\26\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1216];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\1\11\3\1\12\11\2\1\1\11\3\1\2\11"+
    "\3\1\1\11\4\1\10\11\1\1\1\11\3\1\1\11"+
    "\3\1\1\11\1\0\1\11\1\1\1\0\1\11\1\0"+
    "\2\1\1\0\1\11\2\1\1\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
private static int indent_balance = 0;
private static IntStack brace_stack = new IntStack(9);

public _FluentLexer() {
	this((java.io.Reader)null);
}

public void brace_block(int state) {
    brace_stack.push(state);
    yybegin(CodeContext);
}

public void brace_recover() {
    if (brace_stack.empty()) {
        yybegin(YYINITIAL);
    }
    else {
        yybegin(brace_stack.pop());
    }
}

public void count_indent() {
    // yytext().last_line.count_indent
}
public void match_indent() {
    // length may < indent_balance
    // t = yytext().length() - indent_balance - Length of Newline
    // yypushback(t);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _FluentLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 39: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 40: break;
          case 3: 
            { return COMMENT_LINE;
            } 
            // fall through
          case 41: break;
          case 4: 
            { return SYMBOL;
            } 
            // fall through
          case 42: break;
          case 5: 
            { return HYPHEN;
            } 
            // fall through
          case 43: break;
          case 6: 
            { return DOT;
            } 
            // fall through
          case 44: break;
          case 7: 
            { return BRACE_R;
            } 
            // fall through
          case 45: break;
          case 8: 
            { return BRACE_L;
            } 
            // fall through
          case 46: break;
          case 9: 
            { return ANGLE_L;
            } 
            // fall through
          case 47: break;
          case 10: 
            { return ANGLE_R;
            } 
            // fall through
          case 48: break;
          case 11: 
            { return ACCENT;
            } 
            // fall through
          case 49: break;
          case 12: 
            { return SEMICOLON;
            } 
            // fall through
          case 50: break;
          case 13: 
            { return DOLLAR;
            } 
            // fall through
          case 51: break;
          case 14: 
            { yybegin(TextContextSpace);
	return EQ;
            } 
            // fall through
          case 52: break;
          case 15: 
            { return STRING_CHAR;
            } 
            // fall through
          case 53: break;
          case 16: 
            { yybegin(CodeContext);
	return STRING_QUOTE;
            } 
            // fall through
          case 54: break;
          case 17: 
            { return TEXT_LINE;
            } 
            // fall through
          case 55: break;
          case 18: 
            { brace_block(TextContext);
	return BRACE_L;
            } 
            // fall through
          case 56: break;
          case 19: 
            { yypushback(1);
	yybegin(TextContext);
            } 
            // fall through
          case 57: break;
          case 20: 
            { count_indent();
	return WHITE_SPACE;
            } 
            // fall through
          case 58: break;
          case 21: 
            { return STAR;
            } 
            // fall through
          case 59: break;
          case 22: 
            { return INTEGER;
            } 
            // fall through
          case 60: break;
          case 23: 
            { brace_recover();
	return BRACE_R;
            } 
            // fall through
          case 61: break;
          case 24: 
            { return PARENTHESIS_L;
            } 
            // fall through
          case 62: break;
          case 25: 
            { return PARENTHESIS_R;
            } 
            // fall through
          case 63: break;
          case 26: 
            { return BRACKET_L;
            } 
            // fall through
          case 64: break;
          case 27: 
            { return BRACKET_R;
            } 
            // fall through
          case 65: break;
          case 28: 
            { return COMMA;
            } 
            // fall through
          case 66: break;
          case 29: 
            { return COLON;
            } 
            // fall through
          case 67: break;
          case 30: 
            { yybegin(StringQuote);
    return STRING_QUOTE;
            } 
            // fall through
          case 68: break;
          case 31: 
            { yybegin(SelectionText);
	return BRACKET_R;
            } 
            // fall through
          case 69: break;
          case 32: 
            { return SELECTION_LINE;
            } 
            // fall through
          case 70: break;
          case 33: 
            { brace_block(SelectionText);
	return BRACE_L;
            } 
            // fall through
          case 71: break;
          case 34: 
            { return STRING_ESCAPE;
            } 
            // fall through
          case 72: break;
          case 35: 
            { yypushback(1);
	yybegin(YYINITIAL);
	return WHITE_SPACE;
            } 
            // fall through
          case 73: break;
          case 36: 
            { yybegin(SelectionStart);
	return TO;
            } 
            // fall through
          case 74: break;
          case 37: 
            { return DECIMAL;
            } 
            // fall through
          case 75: break;
          case 38: 
            { yypushback(1);
    yybegin(SelectionStart);
    return WHITE_SPACE;
            } 
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
