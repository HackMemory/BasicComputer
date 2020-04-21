package ru.ifmo.cs.bcomp.grammar;

import java.util.List;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import ru.ifmo.cs.bcomp.grammar.BCompNGListener;
import ru.ifmo.cs.bcomp.grammar.BCompNGVisitor;

public class BCompNGParser extends Parser {

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache;
   public static final int T__0 = 1;
   public static final int T__1 = 2;
   public static final int T__2 = 3;
   public static final int T__3 = 4;
   public static final int T__4 = 5;
   public static final int T__5 = 6;
   public static final int T__6 = 7;
   public static final int T__7 = 8;
   public static final int T__8 = 9;
   public static final int T__9 = 10;
   public static final int ORG = 11;
   public static final int WORD = 12;
   public static final int END = 13;
   public static final int DUP = 14;
   public static final int AND = 15;
   public static final int OR = 16;
   public static final int ADD = 17;
   public static final int ADC = 18;
   public static final int SUB = 19;
   public static final int CMP = 20;
   public static final int LOOP = 21;
   public static final int LD = 22;
   public static final int SWAM = 23;
   public static final int JUMP = 24;
   public static final int CALL = 25;
   public static final int ST = 26;
   public static final int NOP = 27;
   public static final int HLT = 28;
   public static final int CLA = 29;
   public static final int NOT = 30;
   public static final int CLC = 31;
   public static final int CMC = 32;
   public static final int ROL = 33;
   public static final int ROR = 34;
   public static final int ASL = 35;
   public static final int ASR = 36;
   public static final int SXTB = 37;
   public static final int SWAB = 38;
   public static final int INC = 39;
   public static final int DEC = 40;
   public static final int NEG = 41;
   public static final int POP = 42;
   public static final int POPF = 43;
   public static final int RET = 44;
   public static final int IRET = 45;
   public static final int PUSH = 46;
   public static final int PUSHF = 47;
   public static final int SWAP = 48;
   public static final int BEQ = 49;
   public static final int BNE = 50;
   public static final int BMI = 51;
   public static final int BPL = 52;
   public static final int BCS = 53;
   public static final int BCC = 54;
   public static final int BVS = 55;
   public static final int BVC = 56;
   public static final int BLT = 57;
   public static final int BGE = 58;
   public static final int BR = 59;
   public static final int DI = 60;
   public static final int EI = 61;
   public static final int IN = 62;
   public static final int OUT = 63;
   public static final int INT = 64;
   public static final int SP = 65;
   public static final int IP = 66;
   public static final int NAME = 67;
   public static final int DECIMAL = 68;
   public static final int HEX = 69;
   public static final int COMMENT = 70;
   public static final int STRING = 71;
   public static final int EOL = 72;
   public static final int WS = 73;
   public static final int RULE_prog = 0;
   public static final int RULE_line = 1;
   public static final int RULE_instructionLine = 2;
   public static final int RULE_instruction = 3;
   public static final int RULE_directive = 4;
   public static final int RULE_orgAddress = 5;
   public static final int RULE_wordDirective = 6;
   public static final int RULE_wordArguments = 7;
   public static final int RULE_wordArgument = 8;
   public static final int RULE_dupArgument = 9;
   public static final int RULE_count = 10;
   public static final int RULE_lbl = 11;
   public static final int RULE_label = 12;
   public static final int RULE_dev = 13;
   public static final int RULE_operand = 14;
   public static final int RULE_directAbsolute = 15;
   public static final int RULE_indirect = 16;
   public static final int RULE_postIncrement = 17;
   public static final int RULE_preDecrement = 18;
   public static final int RULE_displacementSP = 19;
   public static final int RULE_directRelative = 20;
   public static final int RULE_directLoad = 21;
   public static final int RULE_address = 22;
   public static final int RULE_string = 23;
   public static final int RULE_name = 24;
   public static final int RULE_number = 25;
   public static final int RULE_comment = 26;
   public static final int RULE_addr = 27;
   public static final int RULE_nonaddr = 28;
   public static final int RULE_branch = 29;
   public static final int RULE_io = 30;
   public static final int RULE_sp = 31;
   public static final int RULE_ip = 32;
   public static final int RULE_org = 33;
   public static final int RULE_word = 34;
   public static final int RULE_dup = 35;
   public static final int RULE_end = 36;
   public static final String[] ruleNames;
   private static final String[] _LITERAL_NAMES;
   private static final String[] _SYMBOLIC_NAMES;
   public static final Vocabulary VOCABULARY;
   @Deprecated
   public static final String[] tokenNames;
   public static final String _serializedATN = "悋Ꜫ脳맭䅼㯧瞆奤Kì\t\t\t\t\t\t\b\t\b\t\t\t\n\t\n\t\f\t\f\r\t\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t !\t!\"\t\"#\t#$\t$%\t%&\t&N\nQ\n\fTZ\n]\na\nm\nr\nw\ny\n\b\b~\n\b\b\b\b\b\n\b\t\t\t\t\n\t\f\t\t\t\n\n\n\n\n\n\n\n\f\f\r\r\rª\n¯\nÇ\n  !!\"\"##$$%%&&&\'\b\n\f \"$&(*,.02468:<>@BDFHJFG2>?3=@BâRY\\\bl\nx\fz} © ®\"°$´&¹(Æ*È,Ê.Í0Ï2Ñ4Ó6Õ8×:Ù<Û>Ý@ßBáDãFåHçJéLNMLMNNOOQJPMQTRPRSSTRUZ6VZWZ\nXZ\rYUYVYWYXZ[]\r\\[\\]]^^`\b_a6`_`aabc8cddmem:fg<ghhmij> jkkmlblelflim\tnoD#oq\fpr6qpqrrysy\btvJ&uw6vuvwwyxnxsxtyz{.{\r|~\r}|}~~F$\t6\n\n4\fH%\n4\b2 ¡4¡¢ª £ª\"¤ª$¥ª&¦ª(§ª*¨ª,©¢©£©¤©¥©¦©§©¨ª«¯.¬­­¯®«®¬¯!°±±²²³³#´µµ¶¶··¸\t¸%¹º\nº»»¼¼½½\'¾¿¿Ç4ÀÁÁÂ@!ÂÃ\tÃÄ4ÄÅÅÇÆ¾ÆÀÇ)ÈÉÉ+ÊË\fËÌ4Ì-ÍÎ4Î/ÏÐIÐ1ÑÒEÒ3ÓÔ\tÔ5ÕÖHÖ7×Ø\tØ9ÙÚ\tÚ;ÛÜ\tÜ=ÝÞ\tÞ?ßàCàAáâDâCãä\räEåææGçèèIéêêKMRY\\`lqvx}©®Æ";
   public static final ATN _ATN;


   private static String[] makeRuleNames() {
      return new String[]{"prog", "line", "instructionLine", "instruction", "directive", "orgAddress", "wordDirective", "wordArguments", "wordArgument", "dupArgument", "count", "lbl", "label", "dev", "operand", "directAbsolute", "indirect", "postIncrement", "preDecrement", "displacementSP", "directRelative", "directLoad", "address", "string", "name", "number", "comment", "addr", "nonaddr", "branch", "io", "sp", "ip", "org", "word", "dup", "end"};
   }

   private static String[] makeLiteralNames() {
      return new String[]{null, "\',\'", "\'$\'", "\'?\'", "\'(\'", "\')\'", "\':\'", "\'+\'", "\'-\'", "\'&\'", "\'#\'"};
   }

   private static String[] makeSymbolicNames() {
      return new String[]{null, null, null, null, null, null, null, null, null, null, null, "ORG", "WORD", "END", "DUP", "AND", "OR", "ADD", "ADC", "SUB", "CMP", "LOOP", "LD", "SWAM", "JUMP", "CALL", "ST", "NOP", "HLT", "CLA", "NOT", "CLC", "CMC", "ROL", "ROR", "ASL", "ASR", "SXTB", "SWAB", "INC", "DEC", "NEG", "POP", "POPF", "RET", "IRET", "PUSH", "PUSHF", "SWAP", "BEQ", "BNE", "BMI", "BPL", "BCS", "BCC", "BVS", "BVC", "BLT", "BGE", "BR", "DI", "EI", "IN", "OUT", "INT", "SP", "IP", "NAME", "DECIMAL", "HEX", "COMMENT", "STRING", "EOL", "WS"};
   }

   @Deprecated
   public String[] getTokenNames() {
      return tokenNames;
   }

   public Vocabulary getVocabulary() {
      return VOCABULARY;
   }

   public String getGrammarFileName() {
      return "BCompNG.g4";
   }

   public String[] getRuleNames() {
      return ruleNames;
   }

   public String getSerializedATN() {
      return "悋Ꜫ脳맭䅼㯧瞆奤Kì\t\t\t\t\t\t\b\t\b\t\t\t\n\t\n\t\f\t\f\r\t\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t !\t!\"\t\"#\t#$\t$%\t%&\t&N\nQ\n\fTZ\n]\na\nm\nr\nw\ny\n\b\b~\n\b\b\b\b\b\n\b\t\t\t\t\n\t\f\t\t\t\n\n\n\n\n\n\n\n\f\f\r\r\rª\n¯\nÇ\n  !!\"\"##$$%%&&&\'\b\n\f \"$&(*,.02468:<>@BDFHJFG2>?3=@BâRY\\\bl\nx\fz} © ®\"°$´&¹(Æ*È,Ê.Í0Ï2Ñ4Ó6Õ8×:Ù<Û>Ý@ßBáDãFåHçJéLNMLMNNOOQJPMQTRPRSSTRUZ6VZWZ\nXZ\rYUYVYWYXZ[]\r\\[\\]]^^`\b_a6`_`aabc8cddmem:fg<ghhmij> jkkmlblelflim\tnoD#oq\fpr6qpqrrysy\btvJ&uw6vuvwwyxnxsxtyz{.{\r|~\r}|}~~F$\t6\n\n4\fH%\n4\b2 ¡4¡¢ª £ª\"¤ª$¥ª&¦ª(§ª*¨ª,©¢©£©¤©¥©¦©§©¨ª«¯.¬­­¯®«®¬¯!°±±²²³³#´µµ¶¶··¸\t¸%¹º\nº»»¼¼½½\'¾¿¿Ç4ÀÁÁÂ@!ÂÃ\tÃÄ4ÄÅÅÇÆ¾ÆÀÇ)ÈÉÉ+ÊË\fËÌ4Ì-ÍÎ4Î/ÏÐIÐ1ÑÒEÒ3ÓÔ\tÔ5ÕÖHÖ7×Ø\tØ9ÙÚ\tÚ;ÛÜ\tÜ=ÝÞ\tÞ?ßàCàAáâDâCãä\räEåææGçèèIéêêKMRY\\`lqvx}©®Æ";
   }

   public ATN getATN() {
      return _ATN;
   }

   public BCompNGParser(TokenStream input) {
      super(input);
      this._interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public final BCompNGParser.ProgContext prog() throws RecognitionException {
      BCompNGParser.ProgContext _localctx = new BCompNGParser.ProgContext(this._ctx, this.getState());
      this.enterRule(_localctx, 0, 0);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(80);
         this._errHandler.sync(this);

         for(int _la = this._input.LA(1); (_la - 11 & -64) == 0 && (1L << _la - 11 & 2972375754064527351L) != 0L; _la = this._input.LA(1)) {
            this.setState(75);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if((_la - 11 & -64) == 0 && (1L << _la - 11 & 666532744850833399L) != 0L) {
               this.setState(74);
               this.line();
            }

            this.setState(77);
            this.match(72);
            this.setState(82);
            this._errHandler.sync(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.LineContext line() throws RecognitionException {
      BCompNGParser.LineContext _localctx = new BCompNGParser.LineContext(this._ctx, this.getState());
      this.enterRule(_localctx, 2, 1);

      try {
         this.setState(87);
         this._errHandler.sync(this);
         switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 2, this._ctx)) {
         case 1:
            this.enterOuterAlt(_localctx, 1);
            this.setState(83);
            this.comment();
            break;
         case 2:
            this.enterOuterAlt(_localctx, 2);
            this.setState(84);
            this.instructionLine();
            break;
         case 3:
            this.enterOuterAlt(_localctx, 3);
            this.setState(85);
            this.directive();
            break;
         case 4:
            this.enterOuterAlt(_localctx, 4);
            this.setState(86);
            this.lbl();
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.InstructionLineContext instructionLine() throws RecognitionException {
      BCompNGParser.InstructionLineContext _localctx = new BCompNGParser.InstructionLineContext(this._ctx, this.getState());
      this.enterRule(_localctx, 4, 2);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(90);
         this._errHandler.sync(this);
         int _la = this._input.LA(1);
         if(_la == 67) {
            this.setState(89);
            this.lbl();
         }

         this.setState(92);
         this.instruction();
         this.setState(94);
         this._errHandler.sync(this);
         _la = this._input.LA(1);
         if(_la == 70) {
            this.setState(93);
            this.comment();
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.InstructionContext instruction() throws RecognitionException {
      BCompNGParser.InstructionContext _localctx = new BCompNGParser.InstructionContext(this._ctx, this.getState());
      this.enterRule(_localctx, 6, 3);

      try {
         this.setState(106);
         this._errHandler.sync(this);
         switch(this._input.LA(1)) {
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
            this.enterOuterAlt(_localctx, 1);
            this.setState(96);
            this.addr();
            this.setState(97);
            this.operand();
            break;
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 60:
         case 61:
            this.enterOuterAlt(_localctx, 2);
            this.setState(99);
            this.nonaddr();
            break;
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
            this.enterOuterAlt(_localctx, 3);
            this.setState(100);
            this.branch();
            this.setState(101);
            this.label();
            break;
         case 62:
         case 63:
         case 64:
            this.enterOuterAlt(_localctx, 4);
            this.setState(103);
            this.io();
            this.setState(104);
            this.dev();
            break;
         default:
            throw new NoViableAltException(this);
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DirectiveContext directive() throws RecognitionException {
      BCompNGParser.DirectiveContext _localctx = new BCompNGParser.DirectiveContext(this._ctx, this.getState());
      this.enterRule(_localctx, 8, 4);

      try {
         this.setState(118);
         this._errHandler.sync(this);
         int _la;
         switch(this._input.LA(1)) {
         case 11:
            this.enterOuterAlt(_localctx, 1);
            this.setState(108);
            this.org();
            this.setState(109);
            this.orgAddress();
            this.setState(111);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if(_la == 70) {
               this.setState(110);
               this.comment();
            }
            break;
         case 12:
         case 67:
            this.enterOuterAlt(_localctx, 2);
            this.setState(113);
            this.wordDirective();
            break;
         case 13:
            this.enterOuterAlt(_localctx, 3);
            this.setState(114);
            this.end();
            this.setState(116);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if(_la == 70) {
               this.setState(115);
               this.comment();
            }
            break;
         default:
            throw new NoViableAltException(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.OrgAddressContext orgAddress() throws RecognitionException {
      BCompNGParser.OrgAddressContext _localctx = new BCompNGParser.OrgAddressContext(this._ctx, this.getState());
      this.enterRule(_localctx, 10, 5);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(120);
         this.address();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.WordDirectiveContext wordDirective() throws RecognitionException {
      BCompNGParser.WordDirectiveContext _localctx = new BCompNGParser.WordDirectiveContext(this._ctx, this.getState());
      this.enterRule(_localctx, 12, 6);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(123);
         this._errHandler.sync(this);
         int _la = this._input.LA(1);
         if(_la == 67) {
            this.setState(122);
            this.lbl();
         }

         this.setState(125);
         this.word();
         this.setState(126);
         this.wordArguments();
         this.setState(128);
         this._errHandler.sync(this);
         _la = this._input.LA(1);
         if(_la == 70) {
            this.setState(127);
            this.comment();
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.WordArgumentsContext wordArguments() throws RecognitionException {
      BCompNGParser.WordArgumentsContext _localctx = new BCompNGParser.WordArgumentsContext(this._ctx, this.getState());
      this.enterRule(_localctx, 14, 7);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(130);
         this.wordArgument();
         this.setState(135);
         this._errHandler.sync(this);

         for(int _la = this._input.LA(1); _la == 1; _la = this._input.LA(1)) {
            this.setState(131);
            this.match(1);
            this.setState(132);
            this.wordArgument();
            this.setState(137);
            this._errHandler.sync(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.WordArgumentContext wordArgument() throws RecognitionException {
      BCompNGParser.WordArgumentContext _localctx = new BCompNGParser.WordArgumentContext(this._ctx, this.getState());
      this.enterRule(_localctx, 16, 8);

      try {
         this.setState(143);
         this._errHandler.sync(this);
         switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 12, this._ctx)) {
         case 1:
            this.enterOuterAlt(_localctx, 1);
            this.setState(138);
            this.number();
            break;
         case 2:
            this.enterOuterAlt(_localctx, 2);
            this.setState(139);
            this.match(2);
            this.setState(140);
            this.label();
            break;
         case 3:
            this.enterOuterAlt(_localctx, 3);
            this.setState(141);
            this.dupArgument();
            break;
         case 4:
            this.enterOuterAlt(_localctx, 4);
            this.setState(142);
            this.match(3);
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DupArgumentContext dupArgument() throws RecognitionException {
      BCompNGParser.DupArgumentContext _localctx = new BCompNGParser.DupArgumentContext(this._ctx, this.getState());
      this.enterRule(_localctx, 18, 9);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(145);
         this.count();
         this.setState(146);
         this.dup();
         this.setState(147);
         this.match(4);
         this.setState(148);
         this.wordArgument();
         this.setState(149);
         this.match(5);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.CountContext count() throws RecognitionException {
      BCompNGParser.CountContext _localctx = new BCompNGParser.CountContext(this._ctx, this.getState());
      this.enterRule(_localctx, 20, 10);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(151);
         this.number();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.LblContext lbl() throws RecognitionException {
      BCompNGParser.LblContext _localctx = new BCompNGParser.LblContext(this._ctx, this.getState());
      this.enterRule(_localctx, 22, 11);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(153);
         this.label();
         this.setState(154);
         this.match(6);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.LabelContext label() throws RecognitionException {
      BCompNGParser.LabelContext _localctx = new BCompNGParser.LabelContext(this._ctx, this.getState());
      this.enterRule(_localctx, 24, 12);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(156);
         this.name();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DevContext dev() throws RecognitionException {
      BCompNGParser.DevContext _localctx = new BCompNGParser.DevContext(this._ctx, this.getState());
      this.enterRule(_localctx, 26, 13);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(158);
         this.number();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.OperandContext operand() throws RecognitionException {
      BCompNGParser.OperandContext _localctx = new BCompNGParser.OperandContext(this._ctx, this.getState());
      this.enterRule(_localctx, 28, 14);

      try {
         this.setState(167);
         this._errHandler.sync(this);
         switch(((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 13, this._ctx)) {
         case 1:
            this.enterOuterAlt(_localctx, 1);
            this.setState(160);
            this.directAbsolute();
            break;
         case 2:
            this.enterOuterAlt(_localctx, 2);
            this.setState(161);
            this.indirect();
            break;
         case 3:
            this.enterOuterAlt(_localctx, 3);
            this.setState(162);
            this.postIncrement();
            break;
         case 4:
            this.enterOuterAlt(_localctx, 4);
            this.setState(163);
            this.preDecrement();
            break;
         case 5:
            this.enterOuterAlt(_localctx, 5);
            this.setState(164);
            this.displacementSP();
            break;
         case 6:
            this.enterOuterAlt(_localctx, 6);
            this.setState(165);
            this.directRelative();
            break;
         case 7:
            this.enterOuterAlt(_localctx, 7);
            this.setState(166);
            this.directLoad();
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DirectAbsoluteContext directAbsolute() throws RecognitionException {
      BCompNGParser.DirectAbsoluteContext _localctx = new BCompNGParser.DirectAbsoluteContext(this._ctx, this.getState());
      this.enterRule(_localctx, 30, 15);

      try {
         this.setState(172);
         this._errHandler.sync(this);
         switch(this._input.LA(1)) {
         case 2:
            this.enterOuterAlt(_localctx, 2);
            this.setState(170);
            this.match(2);
            this.setState(171);
            this.label();
            break;
         case 68:
         case 69:
            this.enterOuterAlt(_localctx, 1);
            this.setState(169);
            this.address();
            break;
         default:
            throw new NoViableAltException(this);
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.IndirectContext indirect() throws RecognitionException {
      BCompNGParser.IndirectContext _localctx = new BCompNGParser.IndirectContext(this._ctx, this.getState());
      this.enterRule(_localctx, 32, 16);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(174);
         this.match(4);
         this.setState(175);
         this.label();
         this.setState(176);
         this.match(5);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.PostIncrementContext postIncrement() throws RecognitionException {
      BCompNGParser.PostIncrementContext _localctx = new BCompNGParser.PostIncrementContext(this._ctx, this.getState());
      this.enterRule(_localctx, 34, 17);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(178);
         this.match(4);
         this.setState(179);
         this.label();
         this.setState(180);
         this.match(5);
         this.setState(181);
         this.match(7);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.PreDecrementContext preDecrement() throws RecognitionException {
      BCompNGParser.PreDecrementContext _localctx = new BCompNGParser.PreDecrementContext(this._ctx, this.getState());
      this.enterRule(_localctx, 36, 18);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(183);
         this.match(8);
         this.setState(184);
         this.match(4);
         this.setState(185);
         this.label();
         this.setState(186);
         this.match(5);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DisplacementSPContext displacementSP() throws RecognitionException {
      BCompNGParser.DisplacementSPContext _localctx = new BCompNGParser.DisplacementSPContext(this._ctx, this.getState());
      this.enterRule(_localctx, 38, 19);

      try {
         this.setState(196);
         this._errHandler.sync(this);
         switch(this._input.LA(1)) {
         case 4:
            this.enterOuterAlt(_localctx, 2);
            this.setState(190);
            this.match(4);
            this.setState(191);
            this.sp();
            this.setState(192);
            this.match(7);
            this.setState(193);
            this.number();
            this.setState(194);
            this.match(5);
            break;
         case 9:
            this.enterOuterAlt(_localctx, 1);
            this.setState(188);
            this.match(9);
            this.setState(189);
            this.number();
            break;
         default:
            throw new NoViableAltException(this);
         }
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DirectRelativeContext directRelative() throws RecognitionException {
      BCompNGParser.DirectRelativeContext _localctx = new BCompNGParser.DirectRelativeContext(this._ctx, this.getState());
      this.enterRule(_localctx, 40, 20);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(198);
         this.label();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DirectLoadContext directLoad() throws RecognitionException {
      BCompNGParser.DirectLoadContext _localctx = new BCompNGParser.DirectLoadContext(this._ctx, this.getState());
      this.enterRule(_localctx, 42, 21);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(200);
         this.match(10);
         this.setState(201);
         this.number();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.AddressContext address() throws RecognitionException {
      BCompNGParser.AddressContext _localctx = new BCompNGParser.AddressContext(this._ctx, this.getState());
      this.enterRule(_localctx, 44, 22);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(203);
         this.number();
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.StringContext string() throws RecognitionException {
      BCompNGParser.StringContext _localctx = new BCompNGParser.StringContext(this._ctx, this.getState());
      this.enterRule(_localctx, 46, 23);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(205);
         this.match(71);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.NameContext name() throws RecognitionException {
      BCompNGParser.NameContext _localctx = new BCompNGParser.NameContext(this._ctx, this.getState());
      this.enterRule(_localctx, 48, 24);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(207);
         this.match(67);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.NumberContext number() throws RecognitionException {
      BCompNGParser.NumberContext _localctx = new BCompNGParser.NumberContext(this._ctx, this.getState());
      this.enterRule(_localctx, 50, 25);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(209);
         int _la = this._input.LA(1);
         if(_la != 68 && _la != 69) {
            this._errHandler.recoverInline(this);
         } else {
            if(this._input.LA(1) == -1) {
               this.matchedEOF = true;
            }

            this._errHandler.reportMatch(this);
            this.consume();
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.CommentContext comment() throws RecognitionException {
      BCompNGParser.CommentContext _localctx = new BCompNGParser.CommentContext(this._ctx, this.getState());
      this.enterRule(_localctx, 52, 26);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(211);
         this.match(70);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.AddrContext addr() throws RecognitionException {
      BCompNGParser.AddrContext _localctx = new BCompNGParser.AddrContext(this._ctx, this.getState());
      this.enterRule(_localctx, 54, 27);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(213);
         int _la = this._input.LA(1);
         if((_la & -64) == 0 && (1L << _la & 134184960L) != 0L) {
            if(this._input.LA(1) == -1) {
               this.matchedEOF = true;
            }

            this._errHandler.reportMatch(this);
            this.consume();
         } else {
            this._errHandler.recoverInline(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.NonaddrContext nonaddr() throws RecognitionException {
      BCompNGParser.NonaddrContext _localctx = new BCompNGParser.NonaddrContext(this._ctx, this.getState());
      this.enterRule(_localctx, 56, 28);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(215);
         int _la = this._input.LA(1);
         if((_la & -64) == 0 && (1L << _la & 3459327463639744512L) != 0L) {
            if(this._input.LA(1) == -1) {
               this.matchedEOF = true;
            }

            this._errHandler.reportMatch(this);
            this.consume();
         } else {
            this._errHandler.recoverInline(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.BranchContext branch() throws RecognitionException {
      BCompNGParser.BranchContext _localctx = new BCompNGParser.BranchContext(this._ctx, this.getState());
      this.enterRule(_localctx, 58, 29);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(217);
         int _la = this._input.LA(1);
         if((_la & -64) == 0 && (1L << _la & 1152358554653425664L) != 0L) {
            if(this._input.LA(1) == -1) {
               this.matchedEOF = true;
            }

            this._errHandler.reportMatch(this);
            this.consume();
         } else {
            this._errHandler.recoverInline(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.IoContext io() throws RecognitionException {
      BCompNGParser.IoContext _localctx = new BCompNGParser.IoContext(this._ctx, this.getState());
      this.enterRule(_localctx, 60, 30);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(219);
         int _la = this._input.LA(1);
         if((_la - 62 & -64) == 0 && (1L << _la - 62 & 7L) != 0L) {
            if(this._input.LA(1) == -1) {
               this.matchedEOF = true;
            }

            this._errHandler.reportMatch(this);
            this.consume();
         } else {
            this._errHandler.recoverInline(this);
         }
      } catch (RecognitionException var7) {
         _localctx.exception = var7;
         this._errHandler.reportError(this, var7);
         this._errHandler.recover(this, var7);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.SpContext sp() throws RecognitionException {
      BCompNGParser.SpContext _localctx = new BCompNGParser.SpContext(this._ctx, this.getState());
      this.enterRule(_localctx, 62, 31);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(221);
         this.match(65);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.IpContext ip() throws RecognitionException {
      BCompNGParser.IpContext _localctx = new BCompNGParser.IpContext(this._ctx, this.getState());
      this.enterRule(_localctx, 64, 32);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(223);
         this.match(66);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.OrgContext org() throws RecognitionException {
      BCompNGParser.OrgContext _localctx = new BCompNGParser.OrgContext(this._ctx, this.getState());
      this.enterRule(_localctx, 66, 33);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(225);
         this.match(11);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.WordContext word() throws RecognitionException {
      BCompNGParser.WordContext _localctx = new BCompNGParser.WordContext(this._ctx, this.getState());
      this.enterRule(_localctx, 68, 34);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(227);
         this.match(12);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.DupContext dup() throws RecognitionException {
      BCompNGParser.DupContext _localctx = new BCompNGParser.DupContext(this._ctx, this.getState());
      this.enterRule(_localctx, 70, 35);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(229);
         this.match(14);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   public final BCompNGParser.EndContext end() throws RecognitionException {
      BCompNGParser.EndContext _localctx = new BCompNGParser.EndContext(this._ctx, this.getState());
      this.enterRule(_localctx, 72, 36);

      try {
         this.enterOuterAlt(_localctx, 1);
         this.setState(231);
         this.match(13);
      } catch (RecognitionException var6) {
         _localctx.exception = var6;
         this._errHandler.reportError(this, var6);
         this._errHandler.recover(this, var6);
      } finally {
         this.exitRule();
      }

      return _localctx;
   }

   static {
      RuntimeMetaData.checkVersion("4.8", "4.8");
      _sharedContextCache = new PredictionContextCache();
      ruleNames = makeRuleNames();
      _LITERAL_NAMES = makeLiteralNames();
      _SYMBOLIC_NAMES = makeSymbolicNames();
      VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
      tokenNames = new String[_SYMBOLIC_NAMES.length];

      int i;
      for(i = 0; i < tokenNames.length; ++i) {
         tokenNames[i] = VOCABULARY.getLiteralName(i);
         if(tokenNames[i] == null) {
            tokenNames[i] = VOCABULARY.getSymbolicName(i);
         }

         if(tokenNames[i] == null) {
            tokenNames[i] = "<INVALID>";
         }
      }

      _ATN = (new ATNDeserializer()).deserialize("悋Ꜫ脳맭䅼㯧瞆奤Kì\t\t\t\t\t\t\b\t\b\t\t\t\n\t\n\t\f\t\f\r\t\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t !\t!\"\t\"#\t#$\t$%\t%&\t&N\nQ\n\fTZ\n]\na\nm\nr\nw\ny\n\b\b~\n\b\b\b\b\b\n\b\t\t\t\t\n\t\f\t\t\t\n\n\n\n\n\n\n\n\f\f\r\r\rª\n¯\nÇ\n  !!\"\"##$$%%&&&\'\b\n\f \"$&(*,.02468:<>@BDFHJFG2>?3=@BâRY\\\bl\nx\fz} © ®\"°$´&¹(Æ*È,Ê.Í0Ï2Ñ4Ó6Õ8×:Ù<Û>Ý@ßBáDãFåHçJéLNMLMNNOOQJPMQTRPRSSTRUZ6VZWZ\nXZ\rYUYVYWYXZ[]\r\\[\\]]^^`\b_a6`_`aabc8cddmem:fg<ghhmij> jkkmlblelflim\tnoD#oq\fpr6qpqrrysy\btvJ&uw6vuvwwyxnxsxtyz{.{\r|~\r}|}~~F$\t6\n\n4\fH%\n4\b2 ¡4¡¢ª £ª\"¤ª$¥ª&¦ª(§ª*¨ª,©¢©£©¤©¥©¦©§©¨ª«¯.¬­­¯®«®¬¯!°±±²²³³#´µµ¶¶··¸\t¸%¹º\nº»»¼¼½½\'¾¿¿Ç4ÀÁÁÂ@!ÂÃ\tÃÄ4ÄÅÅÇÆ¾ÆÀÇ)ÈÉÉ+ÊË\fËÌ4Ì-ÍÎ4Î/ÏÐIÐ1ÑÒEÒ3ÓÔ\tÔ5ÕÖHÖ7×Ø\tØ9ÙÚ\tÚ;ÛÜ\tÜ=ÝÞ\tÞ?ßàCàAáâDâCãä\räEåææGçèèIéêêKMRY\\`lqvx}©®Æ".toCharArray());
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];

      for(i = 0; i < _ATN.getNumberOfDecisions(); ++i) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }

   }

   public static class LineContext extends ParserRuleContext {

      public BCompNGParser.CommentContext comment() {
         return (BCompNGParser.CommentContext)this.getRuleContext(BCompNGParser.CommentContext.class, 0);
      }

      public BCompNGParser.InstructionLineContext instructionLine() {
         return (BCompNGParser.InstructionLineContext)this.getRuleContext(BCompNGParser.InstructionLineContext.class, 0);
      }

      public BCompNGParser.DirectiveContext directive() {
         return (BCompNGParser.DirectiveContext)this.getRuleContext(BCompNGParser.DirectiveContext.class, 0);
      }

      public BCompNGParser.LblContext lbl() {
         return (BCompNGParser.LblContext)this.getRuleContext(BCompNGParser.LblContext.class, 0);
      }

      public LineContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 1;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterLine(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitLine(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitLine(this):visitor.visitChildren(this);
      }
   }

   public static class NumberContext extends ParserRuleContext {

      public TerminalNode DECIMAL() {
         return this.getToken(68, 0);
      }

      public TerminalNode HEX() {
         return this.getToken(69, 0);
      }

      public NumberContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 25;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterNumber(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitNumber(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitNumber(this):visitor.visitChildren(this);
      }
   }

   public static class OrgContext extends ParserRuleContext {

      public TerminalNode ORG() {
         return this.getToken(11, 0);
      }

      public OrgContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 33;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterOrg(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitOrg(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitOrg(this):visitor.visitChildren(this);
      }
   }

   public static class EndContext extends ParserRuleContext {

      public TerminalNode END() {
         return this.getToken(13, 0);
      }

      public EndContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 36;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterEnd(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitEnd(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitEnd(this):visitor.visitChildren(this);
      }
   }

   public static class PostIncrementContext extends ParserRuleContext {

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public PostIncrementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 17;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterPostIncrement(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitPostIncrement(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitPostIncrement(this):visitor.visitChildren(this);
      }
   }

   public static class WordArgumentContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public BCompNGParser.DupArgumentContext dupArgument() {
         return (BCompNGParser.DupArgumentContext)this.getRuleContext(BCompNGParser.DupArgumentContext.class, 0);
      }

      public WordArgumentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 8;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterWordArgument(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitWordArgument(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitWordArgument(this):visitor.visitChildren(this);
      }
   }

   public static class WordDirectiveContext extends ParserRuleContext {

      public BCompNGParser.WordContext word() {
         return (BCompNGParser.WordContext)this.getRuleContext(BCompNGParser.WordContext.class, 0);
      }

      public BCompNGParser.WordArgumentsContext wordArguments() {
         return (BCompNGParser.WordArgumentsContext)this.getRuleContext(BCompNGParser.WordArgumentsContext.class, 0);
      }

      public BCompNGParser.LblContext lbl() {
         return (BCompNGParser.LblContext)this.getRuleContext(BCompNGParser.LblContext.class, 0);
      }

      public BCompNGParser.CommentContext comment() {
         return (BCompNGParser.CommentContext)this.getRuleContext(BCompNGParser.CommentContext.class, 0);
      }

      public WordDirectiveContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 6;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterWordDirective(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitWordDirective(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitWordDirective(this):visitor.visitChildren(this);
      }
   }

   public static class WordContext extends ParserRuleContext {

      public TerminalNode WORD() {
         return this.getToken(12, 0);
      }

      public WordContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 34;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterWord(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitWord(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitWord(this):visitor.visitChildren(this);
      }
   }

   public static class AddressContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public AddressContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 22;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterAddress(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitAddress(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitAddress(this):visitor.visitChildren(this);
      }
   }

   public static class DupContext extends ParserRuleContext {

      public TerminalNode DUP() {
         return this.getToken(14, 0);
      }

      public DupContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 35;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDup(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDup(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDup(this):visitor.visitChildren(this);
      }
   }

   public static class CountContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public CountContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 10;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterCount(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitCount(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitCount(this):visitor.visitChildren(this);
      }
   }

   public static class DupArgumentContext extends ParserRuleContext {

      public BCompNGParser.CountContext count() {
         return (BCompNGParser.CountContext)this.getRuleContext(BCompNGParser.CountContext.class, 0);
      }

      public BCompNGParser.DupContext dup() {
         return (BCompNGParser.DupContext)this.getRuleContext(BCompNGParser.DupContext.class, 0);
      }

      public BCompNGParser.WordArgumentContext wordArgument() {
         return (BCompNGParser.WordArgumentContext)this.getRuleContext(BCompNGParser.WordArgumentContext.class, 0);
      }

      public DupArgumentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 9;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDupArgument(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDupArgument(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDupArgument(this):visitor.visitChildren(this);
      }
   }

   public static class SpContext extends ParserRuleContext {

      public TerminalNode SP() {
         return this.getToken(65, 0);
      }

      public SpContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 31;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterSp(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitSp(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitSp(this):visitor.visitChildren(this);
      }
   }

   public static class InstructionContext extends ParserRuleContext {

      public BCompNGParser.AddrContext addr() {
         return (BCompNGParser.AddrContext)this.getRuleContext(BCompNGParser.AddrContext.class, 0);
      }

      public BCompNGParser.OperandContext operand() {
         return (BCompNGParser.OperandContext)this.getRuleContext(BCompNGParser.OperandContext.class, 0);
      }

      public BCompNGParser.NonaddrContext nonaddr() {
         return (BCompNGParser.NonaddrContext)this.getRuleContext(BCompNGParser.NonaddrContext.class, 0);
      }

      public BCompNGParser.BranchContext branch() {
         return (BCompNGParser.BranchContext)this.getRuleContext(BCompNGParser.BranchContext.class, 0);
      }

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public BCompNGParser.IoContext io() {
         return (BCompNGParser.IoContext)this.getRuleContext(BCompNGParser.IoContext.class, 0);
      }

      public BCompNGParser.DevContext dev() {
         return (BCompNGParser.DevContext)this.getRuleContext(BCompNGParser.DevContext.class, 0);
      }

      public InstructionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 3;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterInstruction(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitInstruction(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitInstruction(this):visitor.visitChildren(this);
      }
   }

   public static class OrgAddressContext extends ParserRuleContext {

      public BCompNGParser.AddressContext address() {
         return (BCompNGParser.AddressContext)this.getRuleContext(BCompNGParser.AddressContext.class, 0);
      }

      public OrgAddressContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 5;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterOrgAddress(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitOrgAddress(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitOrgAddress(this):visitor.visitChildren(this);
      }
   }

   public static class IpContext extends ParserRuleContext {

      public TerminalNode IP() {
         return this.getToken(66, 0);
      }

      public IpContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 32;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterIp(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitIp(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitIp(this):visitor.visitChildren(this);
      }
   }

   public static class DirectRelativeContext extends ParserRuleContext {

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public DirectRelativeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 20;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDirectRelative(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDirectRelative(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDirectRelative(this):visitor.visitChildren(this);
      }
   }

   public static class AddrContext extends ParserRuleContext {

      public TerminalNode AND() {
         return this.getToken(15, 0);
      }

      public TerminalNode OR() {
         return this.getToken(16, 0);
      }

      public TerminalNode ADD() {
         return this.getToken(17, 0);
      }

      public TerminalNode ADC() {
         return this.getToken(18, 0);
      }

      public TerminalNode SUB() {
         return this.getToken(19, 0);
      }

      public TerminalNode CMP() {
         return this.getToken(20, 0);
      }

      public TerminalNode LOOP() {
         return this.getToken(21, 0);
      }

      public TerminalNode LD() {
         return this.getToken(22, 0);
      }

      public TerminalNode SWAM() {
         return this.getToken(23, 0);
      }

      public TerminalNode JUMP() {
         return this.getToken(24, 0);
      }

      public TerminalNode CALL() {
         return this.getToken(25, 0);
      }

      public TerminalNode ST() {
         return this.getToken(26, 0);
      }

      public AddrContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 27;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterAddr(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitAddr(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitAddr(this):visitor.visitChildren(this);
      }
   }

   public static class IndirectContext extends ParserRuleContext {

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public IndirectContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 16;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterIndirect(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitIndirect(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitIndirect(this):visitor.visitChildren(this);
      }
   }

   public static class WordArgumentsContext extends ParserRuleContext {

      public List wordArgument() {
         return this.getRuleContexts(BCompNGParser.WordArgumentContext.class);
      }

      public BCompNGParser.WordArgumentContext wordArgument(int i) {
         return (BCompNGParser.WordArgumentContext)this.getRuleContext(BCompNGParser.WordArgumentContext.class, i);
      }

      public WordArgumentsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 7;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterWordArguments(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitWordArguments(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitWordArguments(this):visitor.visitChildren(this);
      }
   }

   public static class IoContext extends ParserRuleContext {

      public TerminalNode IN() {
         return this.getToken(62, 0);
      }

      public TerminalNode OUT() {
         return this.getToken(63, 0);
      }

      public TerminalNode INT() {
         return this.getToken(64, 0);
      }

      public IoContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 30;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterIo(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitIo(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitIo(this):visitor.visitChildren(this);
      }
   }

   public static class StringContext extends ParserRuleContext {

      public TerminalNode STRING() {
         return this.getToken(71, 0);
      }

      public StringContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 23;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterString(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitString(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitString(this):visitor.visitChildren(this);
      }
   }

   public static class LblContext extends ParserRuleContext {

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public LblContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 11;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterLbl(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitLbl(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitLbl(this):visitor.visitChildren(this);
      }
   }

   public static class BranchContext extends ParserRuleContext {

      public TerminalNode BEQ() {
         return this.getToken(49, 0);
      }

      public TerminalNode BNE() {
         return this.getToken(50, 0);
      }

      public TerminalNode BMI() {
         return this.getToken(51, 0);
      }

      public TerminalNode BPL() {
         return this.getToken(52, 0);
      }

      public TerminalNode BCS() {
         return this.getToken(53, 0);
      }

      public TerminalNode BCC() {
         return this.getToken(54, 0);
      }

      public TerminalNode BVS() {
         return this.getToken(55, 0);
      }

      public TerminalNode BVC() {
         return this.getToken(56, 0);
      }

      public TerminalNode BLT() {
         return this.getToken(57, 0);
      }

      public TerminalNode BGE() {
         return this.getToken(58, 0);
      }

      public TerminalNode BR() {
         return this.getToken(59, 0);
      }

      public BranchContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 29;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterBranch(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitBranch(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitBranch(this):visitor.visitChildren(this);
      }
   }

   public static class DevContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public DevContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 13;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDev(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDev(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDev(this):visitor.visitChildren(this);
      }
   }

   public static class DirectLoadContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public DirectLoadContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 21;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDirectLoad(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDirectLoad(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDirectLoad(this):visitor.visitChildren(this);
      }
   }

   public static class OperandContext extends ParserRuleContext {

      public BCompNGParser.DirectAbsoluteContext directAbsolute() {
         return (BCompNGParser.DirectAbsoluteContext)this.getRuleContext(BCompNGParser.DirectAbsoluteContext.class, 0);
      }

      public BCompNGParser.IndirectContext indirect() {
         return (BCompNGParser.IndirectContext)this.getRuleContext(BCompNGParser.IndirectContext.class, 0);
      }

      public BCompNGParser.PostIncrementContext postIncrement() {
         return (BCompNGParser.PostIncrementContext)this.getRuleContext(BCompNGParser.PostIncrementContext.class, 0);
      }

      public BCompNGParser.PreDecrementContext preDecrement() {
         return (BCompNGParser.PreDecrementContext)this.getRuleContext(BCompNGParser.PreDecrementContext.class, 0);
      }

      public BCompNGParser.DisplacementSPContext displacementSP() {
         return (BCompNGParser.DisplacementSPContext)this.getRuleContext(BCompNGParser.DisplacementSPContext.class, 0);
      }

      public BCompNGParser.DirectRelativeContext directRelative() {
         return (BCompNGParser.DirectRelativeContext)this.getRuleContext(BCompNGParser.DirectRelativeContext.class, 0);
      }

      public BCompNGParser.DirectLoadContext directLoad() {
         return (BCompNGParser.DirectLoadContext)this.getRuleContext(BCompNGParser.DirectLoadContext.class, 0);
      }

      public OperandContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 14;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterOperand(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitOperand(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitOperand(this):visitor.visitChildren(this);
      }
   }

   public static class DisplacementSPContext extends ParserRuleContext {

      public BCompNGParser.NumberContext number() {
         return (BCompNGParser.NumberContext)this.getRuleContext(BCompNGParser.NumberContext.class, 0);
      }

      public BCompNGParser.SpContext sp() {
         return (BCompNGParser.SpContext)this.getRuleContext(BCompNGParser.SpContext.class, 0);
      }

      public DisplacementSPContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 19;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDisplacementSP(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDisplacementSP(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDisplacementSP(this):visitor.visitChildren(this);
      }
   }

   public static class NonaddrContext extends ParserRuleContext {

      public TerminalNode NOP() {
         return this.getToken(27, 0);
      }

      public TerminalNode HLT() {
         return this.getToken(28, 0);
      }

      public TerminalNode CLA() {
         return this.getToken(29, 0);
      }

      public TerminalNode NOT() {
         return this.getToken(30, 0);
      }

      public TerminalNode CLC() {
         return this.getToken(31, 0);
      }

      public TerminalNode CMC() {
         return this.getToken(32, 0);
      }

      public TerminalNode ROL() {
         return this.getToken(33, 0);
      }

      public TerminalNode ROR() {
         return this.getToken(34, 0);
      }

      public TerminalNode ASL() {
         return this.getToken(35, 0);
      }

      public TerminalNode ASR() {
         return this.getToken(36, 0);
      }

      public TerminalNode SXTB() {
         return this.getToken(37, 0);
      }

      public TerminalNode SWAB() {
         return this.getToken(38, 0);
      }

      public TerminalNode INC() {
         return this.getToken(39, 0);
      }

      public TerminalNode DEC() {
         return this.getToken(40, 0);
      }

      public TerminalNode NEG() {
         return this.getToken(41, 0);
      }

      public TerminalNode POP() {
         return this.getToken(42, 0);
      }

      public TerminalNode POPF() {
         return this.getToken(43, 0);
      }

      public TerminalNode RET() {
         return this.getToken(44, 0);
      }

      public TerminalNode IRET() {
         return this.getToken(45, 0);
      }

      public TerminalNode PUSH() {
         return this.getToken(46, 0);
      }

      public TerminalNode PUSHF() {
         return this.getToken(47, 0);
      }

      public TerminalNode SWAP() {
         return this.getToken(48, 0);
      }

      public TerminalNode EI() {
         return this.getToken(61, 0);
      }

      public TerminalNode DI() {
         return this.getToken(60, 0);
      }

      public NonaddrContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 28;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterNonaddr(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitNonaddr(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitNonaddr(this):visitor.visitChildren(this);
      }
   }

   public static class ProgContext extends ParserRuleContext {

      public List EOL() {
         return this.getTokens(72);
      }

      public TerminalNode EOL(int i) {
         return this.getToken(72, i);
      }

      public List line() {
         return this.getRuleContexts(BCompNGParser.LineContext.class);
      }

      public BCompNGParser.LineContext line(int i) {
         return (BCompNGParser.LineContext)this.getRuleContext(BCompNGParser.LineContext.class, i);
      }

      public ProgContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 0;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterProg(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitProg(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitProg(this):visitor.visitChildren(this);
      }
   }

   public static class LabelContext extends ParserRuleContext {

      public BCompNGParser.NameContext name() {
         return (BCompNGParser.NameContext)this.getRuleContext(BCompNGParser.NameContext.class, 0);
      }

      public LabelContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 12;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterLabel(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitLabel(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitLabel(this):visitor.visitChildren(this);
      }
   }

   public static class PreDecrementContext extends ParserRuleContext {

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public PreDecrementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 18;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterPreDecrement(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitPreDecrement(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitPreDecrement(this):visitor.visitChildren(this);
      }
   }

   public static class DirectiveContext extends ParserRuleContext {

      public BCompNGParser.OrgContext org() {
         return (BCompNGParser.OrgContext)this.getRuleContext(BCompNGParser.OrgContext.class, 0);
      }

      public BCompNGParser.OrgAddressContext orgAddress() {
         return (BCompNGParser.OrgAddressContext)this.getRuleContext(BCompNGParser.OrgAddressContext.class, 0);
      }

      public BCompNGParser.CommentContext comment() {
         return (BCompNGParser.CommentContext)this.getRuleContext(BCompNGParser.CommentContext.class, 0);
      }

      public BCompNGParser.WordDirectiveContext wordDirective() {
         return (BCompNGParser.WordDirectiveContext)this.getRuleContext(BCompNGParser.WordDirectiveContext.class, 0);
      }

      public BCompNGParser.EndContext end() {
         return (BCompNGParser.EndContext)this.getRuleContext(BCompNGParser.EndContext.class, 0);
      }

      public DirectiveContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 4;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDirective(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDirective(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDirective(this):visitor.visitChildren(this);
      }
   }

   public static class DirectAbsoluteContext extends ParserRuleContext {

      public BCompNGParser.AddressContext address() {
         return (BCompNGParser.AddressContext)this.getRuleContext(BCompNGParser.AddressContext.class, 0);
      }

      public BCompNGParser.LabelContext label() {
         return (BCompNGParser.LabelContext)this.getRuleContext(BCompNGParser.LabelContext.class, 0);
      }

      public DirectAbsoluteContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 15;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterDirectAbsolute(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitDirectAbsolute(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitDirectAbsolute(this):visitor.visitChildren(this);
      }
   }

   public static class InstructionLineContext extends ParserRuleContext {

      public BCompNGParser.InstructionContext instruction() {
         return (BCompNGParser.InstructionContext)this.getRuleContext(BCompNGParser.InstructionContext.class, 0);
      }

      public BCompNGParser.LblContext lbl() {
         return (BCompNGParser.LblContext)this.getRuleContext(BCompNGParser.LblContext.class, 0);
      }

      public BCompNGParser.CommentContext comment() {
         return (BCompNGParser.CommentContext)this.getRuleContext(BCompNGParser.CommentContext.class, 0);
      }

      public InstructionLineContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 2;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterInstructionLine(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitInstructionLine(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitInstructionLine(this):visitor.visitChildren(this);
      }
   }

   public static class NameContext extends ParserRuleContext {

      public TerminalNode NAME() {
         return this.getToken(67, 0);
      }

      public NameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 24;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterName(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitName(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitName(this):visitor.visitChildren(this);
      }
   }

   public static class CommentContext extends ParserRuleContext {

      public TerminalNode COMMENT() {
         return this.getToken(70, 0);
      }

      public CommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public int getRuleIndex() {
         return 26;
      }

      public void enterRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).enterComment(this);
         }

      }

      public void exitRule(ParseTreeListener listener) {
         if(listener instanceof BCompNGListener) {
            ((BCompNGListener)listener).exitComment(this);
         }

      }

      public Object accept(ParseTreeVisitor visitor) {
         return visitor instanceof BCompNGVisitor?((BCompNGVisitor)visitor).visitComment(this):visitor.visitChildren(this);
      }
   }
}
