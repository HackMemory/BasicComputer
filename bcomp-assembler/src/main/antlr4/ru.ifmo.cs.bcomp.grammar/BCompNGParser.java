// 
// Decompiled by Procyon v0.5.36
// 

package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.Parser;

public class BCompNGParser extends Parser
{
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
    public static final int ORG = 10;
    public static final int WORD = 11;
    public static final int END = 12;
    public static final int AND = 13;
    public static final int OR = 14;
    public static final int ADD = 15;
    public static final int ADC = 16;
    public static final int SUB = 17;
    public static final int CMP = 18;
    public static final int LOOP = 19;
    public static final int LD = 20;
    public static final int SWAM = 21;
    public static final int JUMP = 22;
    public static final int CALL = 23;
    public static final int ST = 24;
    public static final int NOP = 25;
    public static final int HLT = 26;
    public static final int CLA = 27;
    public static final int NOT = 28;
    public static final int CLC = 29;
    public static final int CMC = 30;
    public static final int ROL = 31;
    public static final int ROR = 32;
    public static final int ASL = 33;
    public static final int ASR = 34;
    public static final int SXTB = 35;
    public static final int SWAB = 36;
    public static final int INC = 37;
    public static final int DEC = 38;
    public static final int NEG = 39;
    public static final int POP = 40;
    public static final int POPF = 41;
    public static final int RET = 42;
    public static final int IRET = 43;
    public static final int PUSH = 44;
    public static final int PUSHF = 45;
    public static final int SWAP = 46;
    public static final int BEQ = 47;
    public static final int BNE = 48;
    public static final int BMI = 49;
    public static final int BPL = 50;
    public static final int BCS = 51;
    public static final int BCC = 52;
    public static final int BVS = 53;
    public static final int BVC = 54;
    public static final int BLT = 55;
    public static final int BGE = 56;
    public static final int BR = 57;
    public static final int CLF = 58;
    public static final int TSF = 59;
    public static final int IN = 60;
    public static final int OUT = 61;
    public static final int SP = 62;
    public static final int IP = 63;
    public static final int NAME = 64;
    public static final int DECIMAL = 65;
    public static final int HEX = 66;
    public static final int COMMENT = 67;
    public static final int STRING = 68;
    public static final int EOL = 69;
    public static final int WS = 70;
    public static final int RULE_prog = 0;
    public static final int RULE_line = 1;
    public static final int RULE_instructionLine = 2;
    public static final int RULE_instruction = 3;
    public static final int RULE_directive = 4;
    public static final int RULE_orgAddress = 5;
    public static final int RULE_wordDirective = 6;
    public static final int RULE_wordArguments = 7;
    public static final int RULE_wordArgument = 8;
    public static final int RULE_lbl = 9;
    public static final int RULE_label = 10;
    public static final int RULE_dev = 11;
    public static final int RULE_operand = 12;
    public static final int RULE_directAbsolute = 13;
    public static final int RULE_indirect = 14;
    public static final int RULE_postIncrement = 15;
    public static final int RULE_preDecrement = 16;
    public static final int RULE_displacementSP = 17;
    public static final int RULE_directRelative = 18;
    public static final int RULE_directLoad = 19;
    public static final int RULE_address = 20;
    public static final int RULE_string = 21;
    public static final int RULE_name = 22;
    public static final int RULE_number = 23;
    public static final int RULE_comment = 24;
    public static final int RULE_addr = 25;
    public static final int RULE_nonaddr = 26;
    public static final int RULE_branch = 27;
    public static final int RULE_io = 28;
    public static final int RULE_sp = 29;
    public static final int RULE_ip = 30;
    public static final int RULE_org = 31;
    public static final int RULE_word = 32;
    public static final int RULE_end = 33;
    public static final String[] ruleNames;
    private static final String[] _LITERAL_NAMES;
    private static final String[] _SYMBOLIC_NAMES;
    public static final Vocabulary VOCABULARY;
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003H\u00da\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0003\u0002\u0005\u0002H\n\u0002\u0003\u0002\u0007\u0002K\n\u0002\f\u0002\u000e\u0002N\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003T\n\u0003\u0003\u0004\u0005\u0004W\n\u0004\u0003\u0004\u0003\u0004\u0005\u0004[\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005g\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006l\n\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006q\n\u0006\u0005\u0006s\n\u0006\u0003\u0007\u0003\u0007\u0003\b\u0005\bx\n\b\u0003\b\u0003\b\u0003\b\u0005\b}\n\b\u0003\t\u0003\t\u0003\t\u0007\t\u0082\n\t\f\t\u000e\t\u0085\u000b\t\u0003\n\u0003\n\u0003\n\u0005\n\u008a\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u009a\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u009f\n\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013·\n\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003 \u0003 \u0003!\u0003!\u0003\"\u0003\"\u0003#\u0003#\u0003#\u0002\u0002$\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0002\u0007\u0003\u0002CD\u0003\u0002\u000f\u001a\u0003\u0002\u001b0\u0003\u00021;\u0003\u0002<?\u0002\u00d1\u0002L\u0003\u0002\u0002\u0002\u0004S\u0003\u0002\u0002\u0002\u0006V\u0003\u0002\u0002\u0002\bf\u0003\u0002\u0002\u0002\nr\u0003\u0002\u0002\u0002\ft\u0003\u0002\u0002\u0002\u000ew\u0003\u0002\u0002\u0002\u0010~\u0003\u0002\u0002\u0002\u0012\u0089\u0003\u0002\u0002\u0002\u0014\u008b\u0003\u0002\u0002\u0002\u0016\u008e\u0003\u0002\u0002\u0002\u0018\u0090\u0003\u0002\u0002\u0002\u001a\u0099\u0003\u0002\u0002\u0002\u001c\u009e\u0003\u0002\u0002\u0002\u001e \u0003\u0002\u0002\u0002 ¤\u0003\u0002\u0002\u0002\"©\u0003\u0002\u0002\u0002$¶\u0003\u0002\u0002\u0002&¸\u0003\u0002\u0002\u0002(º\u0003\u0002\u0002\u0002*½\u0003\u0002\u0002\u0002,¿\u0003\u0002\u0002\u0002.\u00c1\u0003\u0002\u0002\u00020\u00c3\u0003\u0002\u0002\u00022\u00c5\u0003\u0002\u0002\u00024\u00c7\u0003\u0002\u0002\u00026\u00c9\u0003\u0002\u0002\u00028\u00cb\u0003\u0002\u0002\u0002:\u00cd\u0003\u0002\u0002\u0002<\u00cf\u0003\u0002\u0002\u0002>\u00d1\u0003\u0002\u0002\u0002@\u00d3\u0003\u0002\u0002\u0002B\u00d5\u0003\u0002\u0002\u0002D\u00d7\u0003\u0002\u0002\u0002FH\u0005\u0004\u0003\u0002GF\u0003\u0002\u0002\u0002GH\u0003\u0002\u0002\u0002HI\u0003\u0002\u0002\u0002IK\u0007G\u0002\u0002JG\u0003\u0002\u0002\u0002KN\u0003\u0002\u0002\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002M\u0003\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002OT\u00052\u001a\u0002PT\u0005\u0006\u0004\u0002QT\u0005\n\u0006\u0002RT\u0005\u0014\u000b\u0002SO\u0003\u0002\u0002\u0002SP\u0003\u0002\u0002\u0002SQ\u0003\u0002\u0002\u0002SR\u0003\u0002\u0002\u0002T\u0005\u0003\u0002\u0002\u0002UW\u0005\u0014\u000b\u0002VU\u0003\u0002\u0002\u0002VW\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0005\b\u0005\u0002Y[\u00052\u001a\u0002ZY\u0003\u0002\u0002\u0002Z[\u0003\u0002\u0002\u0002[\u0007\u0003\u0002\u0002\u0002\\]\u00054\u001b\u0002]^\u0005\u001a\u000e\u0002^g\u0003\u0002\u0002\u0002_g\u00056\u001c\u0002`a\u00058\u001d\u0002ab\u0005\u0016\f\u0002bg\u0003\u0002\u0002\u0002cd\u0005:\u001e\u0002de\u0005\u0018\r\u0002eg\u0003\u0002\u0002\u0002f\\\u0003\u0002\u0002\u0002f_\u0003\u0002\u0002\u0002f`\u0003\u0002\u0002\u0002fc\u0003\u0002\u0002\u0002g\t\u0003\u0002\u0002\u0002hi\u0005@!\u0002ik\u0005\f\u0007\u0002jl\u00052\u001a\u0002kj\u0003\u0002\u0002\u0002kl\u0003\u0002\u0002\u0002ls\u0003\u0002\u0002\u0002ms\u0005\u000e\b\u0002np\u0005D#\u0002oq\u00052\u001a\u0002po\u0003\u0002\u0002\u0002pq\u0003\u0002\u0002\u0002qs\u0003\u0002\u0002\u0002rh\u0003\u0002\u0002\u0002rm\u0003\u0002\u0002\u0002rn\u0003\u0002\u0002\u0002s\u000b\u0003\u0002\u0002\u0002tu\u0005*\u0016\u0002u\r\u0003\u0002\u0002\u0002vx\u0005\u0014\u000b\u0002wv\u0003\u0002\u0002\u0002wx\u0003\u0002\u0002\u0002xy\u0003\u0002\u0002\u0002yz\u0005B\"\u0002z|\u0005\u0010\t\u0002{}\u00052\u001a\u0002|{\u0003\u0002\u0002\u0002|}\u0003\u0002\u0002\u0002}\u000f\u0003\u0002\u0002\u0002~\u0083\u0005\u0012\n\u0002\u007f\u0080\u0007\u0003\u0002\u0002\u0080\u0082\u0005\u0012\n\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0082\u0085\u0003\u0002\u0002\u0002\u0083\u0081\u0003\u0002\u0002\u0002\u0083\u0084\u0003\u0002\u0002\u0002\u0084\u0011\u0003\u0002\u0002\u0002\u0085\u0083\u0003\u0002\u0002\u0002\u0086\u008a\u00050\u0019\u0002\u0087\u0088\u0007\u0004\u0002\u0002\u0088\u008a\u0005\u0016\f\u0002\u0089\u0086\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u008a\u0013\u0003\u0002\u0002\u0002\u008b\u008c\u0005\u0016\f\u0002\u008c\u008d\u0007\u0005\u0002\u0002\u008d\u0015\u0003\u0002\u0002\u0002\u008e\u008f\u0005.\u0018\u0002\u008f\u0017\u0003\u0002\u0002\u0002\u0090\u0091\u00050\u0019\u0002\u0091\u0019\u0003\u0002\u0002\u0002\u0092\u009a\u0005\u001c\u000f\u0002\u0093\u009a\u0005\u001e\u0010\u0002\u0094\u009a\u0005 \u0011\u0002\u0095\u009a\u0005\"\u0012\u0002\u0096\u009a\u0005$\u0013\u0002\u0097\u009a\u0005&\u0014\u0002\u0098\u009a\u0005(\u0015\u0002\u0099\u0092\u0003\u0002\u0002\u0002\u0099\u0093\u0003\u0002\u0002\u0002\u0099\u0094\u0003\u0002\u0002\u0002\u0099\u0095\u0003\u0002\u0002\u0002\u0099\u0096\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u001b\u0003\u0002\u0002\u0002\u009b\u009f\u0005*\u0016\u0002\u009c\u009d\u0007\u0004\u0002\u0002\u009d\u009f\u0005\u0016\f\u0002\u009e\u009b\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009f\u001d\u0003\u0002\u0002\u0002 ¡\u0007\u0006\u0002\u0002¡¢\u0005\u0016\f\u0002¢£\u0007\u0007\u0002\u0002£\u001f\u0003\u0002\u0002\u0002¤¥\u0007\u0006\u0002\u0002¥¦\u0005\u0016\f\u0002¦§\u0007\u0007\u0002\u0002§¨\u0007\b\u0002\u0002¨!\u0003\u0002\u0002\u0002©ª\u0007\t\u0002\u0002ª«\u0007\u0006\u0002\u0002«¬\u0005\u0016\f\u0002¬\u00ad\u0007\u0007\u0002\u0002\u00ad#\u0003\u0002\u0002\u0002®¯\u0007\n\u0002\u0002¯·\u00050\u0019\u0002°±\u0007\u0006\u0002\u0002±²\u0005<\u001f\u0002²³\u0007\b\u0002\u0002³´\u00050\u0019\u0002´µ\u0007\u0007\u0002\u0002µ·\u0003\u0002\u0002\u0002¶®\u0003\u0002\u0002\u0002¶°\u0003\u0002\u0002\u0002·%\u0003\u0002\u0002\u0002¸¹\u0005\u0016\f\u0002¹'\u0003\u0002\u0002\u0002º»\u0007\u000b\u0002\u0002»¼\u00050\u0019\u0002¼)\u0003\u0002\u0002\u0002½¾\u00050\u0019\u0002¾+\u0003\u0002\u0002\u0002¿\u00c0\u0007F\u0002\u0002\u00c0-\u0003\u0002\u0002\u0002\u00c1\u00c2\u0007B\u0002\u0002\u00c2/\u0003\u0002\u0002\u0002\u00c3\u00c4\t\u0002\u0002\u0002\u00c41\u0003\u0002\u0002\u0002\u00c5\u00c6\u0007E\u0002\u0002\u00c63\u0003\u0002\u0002\u0002\u00c7\u00c8\t\u0003\u0002\u0002\u00c85\u0003\u0002\u0002\u0002\u00c9\u00ca\t\u0004\u0002\u0002\u00ca7\u0003\u0002\u0002\u0002\u00cb\u00cc\t\u0005\u0002\u0002\u00cc9\u0003\u0002\u0002\u0002\u00cd\u00ce\t\u0006\u0002\u0002\u00ce;\u0003\u0002\u0002\u0002\u00cf\u00d0\u0007@\u0002\u0002\u00d0=\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007A\u0002\u0002\u00d2?\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\f\u0002\u0002\u00d4A\u0003\u0002\u0002\u0002\u00d5\u00d6\u0007\r\u0002\u0002\u00d6C\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u000e\u0002\u0002\u00d8E\u0003\u0002\u0002\u0002\u0012GLSVZfkprw|\u0083\u0089\u0099\u009e¶";
    public static final ATN _ATN;
    
    private static String[] makeRuleNames() {
        return new String[] { "prog", "line", "instructionLine", "instruction", "directive", "orgAddress", "wordDirective", "wordArguments", "wordArgument", "lbl", "label", "dev", "operand", "directAbsolute", "indirect", "postIncrement", "preDecrement", "displacementSP", "directRelative", "directLoad", "address", "string", "name", "number", "comment", "addr", "nonaddr", "branch", "io", "sp", "ip", "org", "word", "end" };
    }
    
    private static String[] makeLiteralNames() {
        return new String[] { null, "','", "'$'", "':'", "'('", "')'", "'+'", "'-'", "'&'", "'#'" };
    }
    
    private static String[] makeSymbolicNames() {
        return new String[] { null, null, null, null, null, null, null, null, null, null, "ORG", "WORD", "END", "AND", "OR", "ADD", "ADC", "SUB", "CMP", "LOOP", "LD", "SWAM", "JUMP", "CALL", "ST", "NOP", "HLT", "CLA", "NOT", "CLC", "CMC", "ROL", "ROR", "ASL", "ASR", "SXTB", "SWAB", "INC", "DEC", "NEG", "POP", "POPF", "RET", "IRET", "PUSH", "PUSHF", "SWAP", "BEQ", "BNE", "BMI", "BPL", "BCS", "BCC", "BVS", "BVC", "BLT", "BGE", "BR", "CLF", "TSF", "IN", "OUT", "SP", "IP", "NAME", "DECIMAL", "HEX", "COMMENT", "STRING", "EOL", "WS" };
    }
    
    @Deprecated
    @Override
    public String[] getTokenNames() {
        return BCompNGParser.tokenNames;
    }
    
    @Override
    public Vocabulary getVocabulary() {
        return BCompNGParser.VOCABULARY;
    }
    
    @Override
    public String getGrammarFileName() {
        return "BCompNG.g4";
    }
    
    @Override
    public String[] getRuleNames() {
        return BCompNGParser.ruleNames;
    }
    
    @Override
    public String getSerializedATN() {
        return "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003H\u00da\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0003\u0002\u0005\u0002H\n\u0002\u0003\u0002\u0007\u0002K\n\u0002\f\u0002\u000e\u0002N\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003T\n\u0003\u0003\u0004\u0005\u0004W\n\u0004\u0003\u0004\u0003\u0004\u0005\u0004[\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005g\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006l\n\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006q\n\u0006\u0005\u0006s\n\u0006\u0003\u0007\u0003\u0007\u0003\b\u0005\bx\n\b\u0003\b\u0003\b\u0003\b\u0005\b}\n\b\u0003\t\u0003\t\u0003\t\u0007\t\u0082\n\t\f\t\u000e\t\u0085\u000b\t\u0003\n\u0003\n\u0003\n\u0005\n\u008a\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u009a\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u009f\n\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013·\n\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003 \u0003 \u0003!\u0003!\u0003\"\u0003\"\u0003#\u0003#\u0003#\u0002\u0002$\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0002\u0007\u0003\u0002CD\u0003\u0002\u000f\u001a\u0003\u0002\u001b0\u0003\u00021;\u0003\u0002<?\u0002\u00d1\u0002L\u0003\u0002\u0002\u0002\u0004S\u0003\u0002\u0002\u0002\u0006V\u0003\u0002\u0002\u0002\bf\u0003\u0002\u0002\u0002\nr\u0003\u0002\u0002\u0002\ft\u0003\u0002\u0002\u0002\u000ew\u0003\u0002\u0002\u0002\u0010~\u0003\u0002\u0002\u0002\u0012\u0089\u0003\u0002\u0002\u0002\u0014\u008b\u0003\u0002\u0002\u0002\u0016\u008e\u0003\u0002\u0002\u0002\u0018\u0090\u0003\u0002\u0002\u0002\u001a\u0099\u0003\u0002\u0002\u0002\u001c\u009e\u0003\u0002\u0002\u0002\u001e \u0003\u0002\u0002\u0002 ¤\u0003\u0002\u0002\u0002\"©\u0003\u0002\u0002\u0002$¶\u0003\u0002\u0002\u0002&¸\u0003\u0002\u0002\u0002(º\u0003\u0002\u0002\u0002*½\u0003\u0002\u0002\u0002,¿\u0003\u0002\u0002\u0002.\u00c1\u0003\u0002\u0002\u00020\u00c3\u0003\u0002\u0002\u00022\u00c5\u0003\u0002\u0002\u00024\u00c7\u0003\u0002\u0002\u00026\u00c9\u0003\u0002\u0002\u00028\u00cb\u0003\u0002\u0002\u0002:\u00cd\u0003\u0002\u0002\u0002<\u00cf\u0003\u0002\u0002\u0002>\u00d1\u0003\u0002\u0002\u0002@\u00d3\u0003\u0002\u0002\u0002B\u00d5\u0003\u0002\u0002\u0002D\u00d7\u0003\u0002\u0002\u0002FH\u0005\u0004\u0003\u0002GF\u0003\u0002\u0002\u0002GH\u0003\u0002\u0002\u0002HI\u0003\u0002\u0002\u0002IK\u0007G\u0002\u0002JG\u0003\u0002\u0002\u0002KN\u0003\u0002\u0002\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002M\u0003\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002OT\u00052\u001a\u0002PT\u0005\u0006\u0004\u0002QT\u0005\n\u0006\u0002RT\u0005\u0014\u000b\u0002SO\u0003\u0002\u0002\u0002SP\u0003\u0002\u0002\u0002SQ\u0003\u0002\u0002\u0002SR\u0003\u0002\u0002\u0002T\u0005\u0003\u0002\u0002\u0002UW\u0005\u0014\u000b\u0002VU\u0003\u0002\u0002\u0002VW\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0005\b\u0005\u0002Y[\u00052\u001a\u0002ZY\u0003\u0002\u0002\u0002Z[\u0003\u0002\u0002\u0002[\u0007\u0003\u0002\u0002\u0002\\]\u00054\u001b\u0002]^\u0005\u001a\u000e\u0002^g\u0003\u0002\u0002\u0002_g\u00056\u001c\u0002`a\u00058\u001d\u0002ab\u0005\u0016\f\u0002bg\u0003\u0002\u0002\u0002cd\u0005:\u001e\u0002de\u0005\u0018\r\u0002eg\u0003\u0002\u0002\u0002f\\\u0003\u0002\u0002\u0002f_\u0003\u0002\u0002\u0002f`\u0003\u0002\u0002\u0002fc\u0003\u0002\u0002\u0002g\t\u0003\u0002\u0002\u0002hi\u0005@!\u0002ik\u0005\f\u0007\u0002jl\u00052\u001a\u0002kj\u0003\u0002\u0002\u0002kl\u0003\u0002\u0002\u0002ls\u0003\u0002\u0002\u0002ms\u0005\u000e\b\u0002np\u0005D#\u0002oq\u00052\u001a\u0002po\u0003\u0002\u0002\u0002pq\u0003\u0002\u0002\u0002qs\u0003\u0002\u0002\u0002rh\u0003\u0002\u0002\u0002rm\u0003\u0002\u0002\u0002rn\u0003\u0002\u0002\u0002s\u000b\u0003\u0002\u0002\u0002tu\u0005*\u0016\u0002u\r\u0003\u0002\u0002\u0002vx\u0005\u0014\u000b\u0002wv\u0003\u0002\u0002\u0002wx\u0003\u0002\u0002\u0002xy\u0003\u0002\u0002\u0002yz\u0005B\"\u0002z|\u0005\u0010\t\u0002{}\u00052\u001a\u0002|{\u0003\u0002\u0002\u0002|}\u0003\u0002\u0002\u0002}\u000f\u0003\u0002\u0002\u0002~\u0083\u0005\u0012\n\u0002\u007f\u0080\u0007\u0003\u0002\u0002\u0080\u0082\u0005\u0012\n\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0082\u0085\u0003\u0002\u0002\u0002\u0083\u0081\u0003\u0002\u0002\u0002\u0083\u0084\u0003\u0002\u0002\u0002\u0084\u0011\u0003\u0002\u0002\u0002\u0085\u0083\u0003\u0002\u0002\u0002\u0086\u008a\u00050\u0019\u0002\u0087\u0088\u0007\u0004\u0002\u0002\u0088\u008a\u0005\u0016\f\u0002\u0089\u0086\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u008a\u0013\u0003\u0002\u0002\u0002\u008b\u008c\u0005\u0016\f\u0002\u008c\u008d\u0007\u0005\u0002\u0002\u008d\u0015\u0003\u0002\u0002\u0002\u008e\u008f\u0005.\u0018\u0002\u008f\u0017\u0003\u0002\u0002\u0002\u0090\u0091\u00050\u0019\u0002\u0091\u0019\u0003\u0002\u0002\u0002\u0092\u009a\u0005\u001c\u000f\u0002\u0093\u009a\u0005\u001e\u0010\u0002\u0094\u009a\u0005 \u0011\u0002\u0095\u009a\u0005\"\u0012\u0002\u0096\u009a\u0005$\u0013\u0002\u0097\u009a\u0005&\u0014\u0002\u0098\u009a\u0005(\u0015\u0002\u0099\u0092\u0003\u0002\u0002\u0002\u0099\u0093\u0003\u0002\u0002\u0002\u0099\u0094\u0003\u0002\u0002\u0002\u0099\u0095\u0003\u0002\u0002\u0002\u0099\u0096\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u001b\u0003\u0002\u0002\u0002\u009b\u009f\u0005*\u0016\u0002\u009c\u009d\u0007\u0004\u0002\u0002\u009d\u009f\u0005\u0016\f\u0002\u009e\u009b\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009f\u001d\u0003\u0002\u0002\u0002 ¡\u0007\u0006\u0002\u0002¡¢\u0005\u0016\f\u0002¢£\u0007\u0007\u0002\u0002£\u001f\u0003\u0002\u0002\u0002¤¥\u0007\u0006\u0002\u0002¥¦\u0005\u0016\f\u0002¦§\u0007\u0007\u0002\u0002§¨\u0007\b\u0002\u0002¨!\u0003\u0002\u0002\u0002©ª\u0007\t\u0002\u0002ª«\u0007\u0006\u0002\u0002«¬\u0005\u0016\f\u0002¬\u00ad\u0007\u0007\u0002\u0002\u00ad#\u0003\u0002\u0002\u0002®¯\u0007\n\u0002\u0002¯·\u00050\u0019\u0002°±\u0007\u0006\u0002\u0002±²\u0005<\u001f\u0002²³\u0007\b\u0002\u0002³´\u00050\u0019\u0002´µ\u0007\u0007\u0002\u0002µ·\u0003\u0002\u0002\u0002¶®\u0003\u0002\u0002\u0002¶°\u0003\u0002\u0002\u0002·%\u0003\u0002\u0002\u0002¸¹\u0005\u0016\f\u0002¹'\u0003\u0002\u0002\u0002º»\u0007\u000b\u0002\u0002»¼\u00050\u0019\u0002¼)\u0003\u0002\u0002\u0002½¾\u00050\u0019\u0002¾+\u0003\u0002\u0002\u0002¿\u00c0\u0007F\u0002\u0002\u00c0-\u0003\u0002\u0002\u0002\u00c1\u00c2\u0007B\u0002\u0002\u00c2/\u0003\u0002\u0002\u0002\u00c3\u00c4\t\u0002\u0002\u0002\u00c41\u0003\u0002\u0002\u0002\u00c5\u00c6\u0007E\u0002\u0002\u00c63\u0003\u0002\u0002\u0002\u00c7\u00c8\t\u0003\u0002\u0002\u00c85\u0003\u0002\u0002\u0002\u00c9\u00ca\t\u0004\u0002\u0002\u00ca7\u0003\u0002\u0002\u0002\u00cb\u00cc\t\u0005\u0002\u0002\u00cc9\u0003\u0002\u0002\u0002\u00cd\u00ce\t\u0006\u0002\u0002\u00ce;\u0003\u0002\u0002\u0002\u00cf\u00d0\u0007@\u0002\u0002\u00d0=\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007A\u0002\u0002\u00d2?\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\f\u0002\u0002\u00d4A\u0003\u0002\u0002\u0002\u00d5\u00d6\u0007\r\u0002\u0002\u00d6C\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u000e\u0002\u0002\u00d8E\u0003\u0002\u0002\u0002\u0012GLSVZfkprw|\u0083\u0089\u0099\u009e¶";
    }
    
    @Override
    public ATN getATN() {
        return BCompNGParser._ATN;
    }
    
    public BCompNGParser(final TokenStream input) {
        super(input);
        this._interp = (ATNInterpreter)new ParserATNSimulator(this, BCompNGParser._ATN, BCompNGParser._decisionToDFA, BCompNGParser._sharedContextCache);
    }
    
    public final ProgContext prog() throws RecognitionException {
        final ProgContext _localctx = new ProgContext(this._ctx, this.getState());
        this.enterRule(_localctx, 0, 0);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(74);
            this._errHandler.sync(this);
            for (int _la = this._input.LA(1); (_la - 10 & 0xFFFFFFC0) == 0x0 && (1L << _la - 10 & 0xA4FFFFFFFFFFFFFL) != 0x0L; _la = this._input.LA(1)) {
                this.setState(69);
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if ((_la - 10 & 0xFFFFFFC0) == 0x0 && (1L << _la - 10 & 0x24FFFFFFFFFFFFFL) != 0x0L) {
                    this.setState(68);
                    this.line();
                }
                this.setState(71);
                this.match(69);
                this.setState(76);
                this._errHandler.sync(this);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final LineContext line() throws RecognitionException {
        final LineContext _localctx = new LineContext(this._ctx, this.getState());
        this.enterRule(_localctx, 2, 1);
        try {
            this.setState(81);
            this._errHandler.sync(this);
            switch (((Recognizer<Symbol, ParserATNSimulator>)this).getInterpreter().adaptivePredict(this._input, 2, this._ctx)) {
                case 1: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(77);
                    this.comment();
                    break;
                }
                case 2: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(78);
                    this.instructionLine();
                    break;
                }
                case 3: {
                    this.enterOuterAlt(_localctx, 3);
                    this.setState(79);
                    this.directive();
                    break;
                }
                case 4: {
                    this.enterOuterAlt(_localctx, 4);
                    this.setState(80);
                    this.lbl();
                    break;
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final InstructionLineContext instructionLine() throws RecognitionException {
        final InstructionLineContext _localctx = new InstructionLineContext(this._ctx, this.getState());
        this.enterRule(_localctx, 4, 2);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(84);
            this._errHandler.sync(this);
            int _la = this._input.LA(1);
            if (_la == 64) {
                this.setState(83);
                this.lbl();
            }
            this.setState(86);
            this.instruction();
            this.setState(88);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if (_la == 67) {
                this.setState(87);
                this.comment();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final InstructionContext instruction() throws RecognitionException {
        final InstructionContext _localctx = new InstructionContext(this._ctx, this.getState());
        this.enterRule(_localctx, 6, 3);
        try {
            this.setState(100);
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(90);
                    this.addr();
                    this.setState(91);
                    this.operand();
                    break;
                }
                case 25:
                case 26:
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
                case 46: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(93);
                    this.nonaddr();
                    break;
                }
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57: {
                    this.enterOuterAlt(_localctx, 3);
                    this.setState(94);
                    this.branch();
                    this.setState(95);
                    this.label();
                    break;
                }
                case 58:
                case 59:
                case 60:
                case 61: {
                    this.enterOuterAlt(_localctx, 4);
                    this.setState(97);
                    this.io();
                    this.setState(98);
                    this.dev();
                    break;
                }
                default: {
                    throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DirectiveContext directive() throws RecognitionException {
        final DirectiveContext _localctx = new DirectiveContext(this._ctx, this.getState());
        this.enterRule(_localctx, 8, 4);
        try {
            this.setState(112);
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
                case 10: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(102);
                    this.org();
                    this.setState(103);
                    this.orgAddress();
                    this.setState(105);
                    this._errHandler.sync(this);
                    final int _la = this._input.LA(1);
                    if (_la == 67) {
                        this.setState(104);
                        this.comment();
                        break;
                    }
                    break;
                }
                case 11:
                case 64: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(107);
                    this.wordDirective();
                    break;
                }
                case 12: {
                    this.enterOuterAlt(_localctx, 3);
                    this.setState(108);
                    this.end();
                    this.setState(110);
                    this._errHandler.sync(this);
                    final int _la = this._input.LA(1);
                    if (_la == 67) {
                        this.setState(109);
                        this.comment();
                        break;
                    }
                    break;
                }
                default: {
                    throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final OrgAddressContext orgAddress() throws RecognitionException {
        final OrgAddressContext _localctx = new OrgAddressContext(this._ctx, this.getState());
        this.enterRule(_localctx, 10, 5);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(114);
            this.address();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final WordDirectiveContext wordDirective() throws RecognitionException {
        final WordDirectiveContext _localctx = new WordDirectiveContext(this._ctx, this.getState());
        this.enterRule(_localctx, 12, 6);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(117);
            this._errHandler.sync(this);
            int _la = this._input.LA(1);
            if (_la == 64) {
                this.setState(116);
                this.lbl();
            }
            this.setState(119);
            this.word();
            this.setState(120);
            this.wordArguments();
            this.setState(122);
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if (_la == 67) {
                this.setState(121);
                this.comment();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final WordArgumentsContext wordArguments() throws RecognitionException {
        final WordArgumentsContext _localctx = new WordArgumentsContext(this._ctx, this.getState());
        this.enterRule(_localctx, 14, 7);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(124);
            this.wordArgument();
            this.setState(129);
            this._errHandler.sync(this);
            for (int _la = this._input.LA(1); _la == 1; _la = this._input.LA(1)) {
                this.setState(125);
                this.match(1);
                this.setState(126);
                this.wordArgument();
                this.setState(131);
                this._errHandler.sync(this);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final WordArgumentContext wordArgument() throws RecognitionException {
        final WordArgumentContext _localctx = new WordArgumentContext(this._ctx, this.getState());
        this.enterRule(_localctx, 16, 8);
        try {
            this.setState(135);
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
                case 65:
                case 66: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(132);
                    this.number();
                    break;
                }
                case 2: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(133);
                    this.match(2);
                    this.setState(134);
                    this.label();
                    break;
                }
                default: {
                    throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final LblContext lbl() throws RecognitionException {
        final LblContext _localctx = new LblContext(this._ctx, this.getState());
        this.enterRule(_localctx, 18, 9);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(137);
            this.label();
            this.setState(138);
            this.match(3);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final LabelContext label() throws RecognitionException {
        final LabelContext _localctx = new LabelContext(this._ctx, this.getState());
        this.enterRule(_localctx, 20, 10);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(140);
            this.name();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DevContext dev() throws RecognitionException {
        final DevContext _localctx = new DevContext(this._ctx, this.getState());
        this.enterRule(_localctx, 22, 11);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(142);
            this.number();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final OperandContext operand() throws RecognitionException {
        final OperandContext _localctx = new OperandContext(this._ctx, this.getState());
        this.enterRule(_localctx, 24, 12);
        try {
            this.setState(151);
            this._errHandler.sync(this);
            switch (((Recognizer<Symbol, ParserATNSimulator>)this).getInterpreter().adaptivePredict(this._input, 13, this._ctx)) {
                case 1: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(144);
                    this.directAbsolute();
                    break;
                }
                case 2: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(145);
                    this.indirect();
                    break;
                }
                case 3: {
                    this.enterOuterAlt(_localctx, 3);
                    this.setState(146);
                    this.postIncrement();
                    break;
                }
                case 4: {
                    this.enterOuterAlt(_localctx, 4);
                    this.setState(147);
                    this.preDecrement();
                    break;
                }
                case 5: {
                    this.enterOuterAlt(_localctx, 5);
                    this.setState(148);
                    this.displacementSP();
                    break;
                }
                case 6: {
                    this.enterOuterAlt(_localctx, 6);
                    this.setState(149);
                    this.directRelative();
                    break;
                }
                case 7: {
                    this.enterOuterAlt(_localctx, 7);
                    this.setState(150);
                    this.directLoad();
                    break;
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DirectAbsoluteContext directAbsolute() throws RecognitionException {
        final DirectAbsoluteContext _localctx = new DirectAbsoluteContext(this._ctx, this.getState());
        this.enterRule(_localctx, 26, 13);
        try {
            this.setState(156);
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
                case 65:
                case 66: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(153);
                    this.address();
                    break;
                }
                case 2: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(154);
                    this.match(2);
                    this.setState(155);
                    this.label();
                    break;
                }
                default: {
                    throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final IndirectContext indirect() throws RecognitionException {
        final IndirectContext _localctx = new IndirectContext(this._ctx, this.getState());
        this.enterRule(_localctx, 28, 14);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(158);
            this.match(4);
            this.setState(159);
            this.label();
            this.setState(160);
            this.match(5);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final PostIncrementContext postIncrement() throws RecognitionException {
        final PostIncrementContext _localctx = new PostIncrementContext(this._ctx, this.getState());
        this.enterRule(_localctx, 30, 15);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(162);
            this.match(4);
            this.setState(163);
            this.label();
            this.setState(164);
            this.match(5);
            this.setState(165);
            this.match(6);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final PreDecrementContext preDecrement() throws RecognitionException {
        final PreDecrementContext _localctx = new PreDecrementContext(this._ctx, this.getState());
        this.enterRule(_localctx, 32, 16);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(167);
            this.match(7);
            this.setState(168);
            this.match(4);
            this.setState(169);
            this.label();
            this.setState(170);
            this.match(5);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DisplacementSPContext displacementSP() throws RecognitionException {
        final DisplacementSPContext _localctx = new DisplacementSPContext(this._ctx, this.getState());
        this.enterRule(_localctx, 34, 17);
        try {
            this.setState(180);
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
                case 8: {
                    this.enterOuterAlt(_localctx, 1);
                    this.setState(172);
                    this.match(8);
                    this.setState(173);
                    this.number();
                    break;
                }
                case 4: {
                    this.enterOuterAlt(_localctx, 2);
                    this.setState(174);
                    this.match(4);
                    this.setState(175);
                    this.sp();
                    this.setState(176);
                    this.match(6);
                    this.setState(177);
                    this.number();
                    this.setState(178);
                    this.match(5);
                    break;
                }
                default: {
                    throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DirectRelativeContext directRelative() throws RecognitionException {
        final DirectRelativeContext _localctx = new DirectRelativeContext(this._ctx, this.getState());
        this.enterRule(_localctx, 36, 18);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(182);
            this.label();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final DirectLoadContext directLoad() throws RecognitionException {
        final DirectLoadContext _localctx = new DirectLoadContext(this._ctx, this.getState());
        this.enterRule(_localctx, 38, 19);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(184);
            this.match(9);
            this.setState(185);
            this.number();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final AddressContext address() throws RecognitionException {
        final AddressContext _localctx = new AddressContext(this._ctx, this.getState());
        this.enterRule(_localctx, 40, 20);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(187);
            this.number();
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final StringContext string() throws RecognitionException {
        final StringContext _localctx = new StringContext(this._ctx, this.getState());
        this.enterRule(_localctx, 42, 21);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(189);
            this.match(68);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final NameContext name() throws RecognitionException {
        final NameContext _localctx = new NameContext(this._ctx, this.getState());
        this.enterRule(_localctx, 44, 22);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(191);
            this.match(64);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final NumberContext number() throws RecognitionException {
        final NumberContext _localctx = new NumberContext(this._ctx, this.getState());
        this.enterRule(_localctx, 46, 23);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(193);
            final int _la = this._input.LA(1);
            if (_la != 65 && _la != 66) {
                this._errHandler.recoverInline(this);
            }
            else {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }
                this._errHandler.reportMatch(this);
                this.consume();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final CommentContext comment() throws RecognitionException {
        final CommentContext _localctx = new CommentContext(this._ctx, this.getState());
        this.enterRule(_localctx, 48, 24);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(195);
            this.match(67);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final AddrContext addr() throws RecognitionException {
        final AddrContext _localctx = new AddrContext(this._ctx, this.getState());
        this.enterRule(_localctx, 50, 25);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(197);
            final int _la = this._input.LA(1);
            if ((_la & 0xFFFFFFC0) != 0x0 || (1L << _la & 0x1FFE000L) == 0x0L) {
                this._errHandler.recoverInline(this);
            }
            else {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }
                this._errHandler.reportMatch(this);
                this.consume();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final NonaddrContext nonaddr() throws RecognitionException {
        final NonaddrContext _localctx = new NonaddrContext(this._ctx, this.getState());
        this.enterRule(_localctx, 52, 26);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(199);
            final int _la = this._input.LA(1);
            if ((_la & 0xFFFFFFC0) != 0x0 || (1L << _la & 0x7FFFFE000000L) == 0x0L) {
                this._errHandler.recoverInline(this);
            }
            else {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }
                this._errHandler.reportMatch(this);
                this.consume();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final BranchContext branch() throws RecognitionException {
        final BranchContext _localctx = new BranchContext(this._ctx, this.getState());
        this.enterRule(_localctx, 54, 27);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(201);
            final int _la = this._input.LA(1);
            if ((_la & 0xFFFFFFC0) != 0x0 || (1L << _la & 0x3FF800000000000L) == 0x0L) {
                this._errHandler.recoverInline(this);
            }
            else {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }
                this._errHandler.reportMatch(this);
                this.consume();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final IoContext io() throws RecognitionException {
        final IoContext _localctx = new IoContext(this._ctx, this.getState());
        this.enterRule(_localctx, 56, 28);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(203);
            final int _la = this._input.LA(1);
            if ((_la & 0xFFFFFFC0) != 0x0 || (1L << _la & 0x3C00000000000000L) == 0x0L) {
                this._errHandler.recoverInline(this);
            }
            else {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }
                this._errHandler.reportMatch(this);
                this.consume();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final SpContext sp() throws RecognitionException {
        final SpContext _localctx = new SpContext(this._ctx, this.getState());
        this.enterRule(_localctx, 58, 29);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(205);
            this.match(62);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final IpContext ip() throws RecognitionException {
        final IpContext _localctx = new IpContext(this._ctx, this.getState());
        this.enterRule(_localctx, 60, 30);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(207);
            this.match(63);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final OrgContext org() throws RecognitionException {
        final OrgContext _localctx = new OrgContext(this._ctx, this.getState());
        this.enterRule(_localctx, 62, 31);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(209);
            this.match(10);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final WordContext word() throws RecognitionException {
        final WordContext _localctx = new WordContext(this._ctx, this.getState());
        this.enterRule(_localctx, 64, 32);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(211);
            this.match(11);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    public final EndContext end() throws RecognitionException {
        final EndContext _localctx = new EndContext(this._ctx, this.getState());
        this.enterRule(_localctx, 66, 33);
        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(213);
            this.match(12);
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            this._errHandler.reportError(this, re);
            this._errHandler.recover(this, re);
        }
        finally {
            this.exitRule();
        }
        return _localctx;
    }
    
    static {
        RuntimeMetaData.checkVersion("4.7.2", "4.7.2");
        _sharedContextCache = new PredictionContextCache();
        ruleNames = makeRuleNames();
        _LITERAL_NAMES = makeLiteralNames();
        _SYMBOLIC_NAMES = makeSymbolicNames();
        VOCABULARY = new VocabularyImpl(BCompNGParser._LITERAL_NAMES, BCompNGParser._SYMBOLIC_NAMES);
        tokenNames = new String[BCompNGParser._SYMBOLIC_NAMES.length];
        for (int i = 0; i < BCompNGParser.tokenNames.length; ++i) {
            BCompNGParser.tokenNames[i] = BCompNGParser.VOCABULARY.getLiteralName(i);
            if (BCompNGParser.tokenNames[i] == null) {
                BCompNGParser.tokenNames[i] = BCompNGParser.VOCABULARY.getSymbolicName(i);
            }
            if (BCompNGParser.tokenNames[i] == null) {
                BCompNGParser.tokenNames[i] = "<INVALID>";
            }
        }
        _ATN = new ATNDeserializer().deserialize("\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003H\u00da\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004!\t!\u0004\"\t\"\u0004#\t#\u0003\u0002\u0005\u0002H\n\u0002\u0003\u0002\u0007\u0002K\n\u0002\f\u0002\u000e\u0002N\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003T\n\u0003\u0003\u0004\u0005\u0004W\n\u0004\u0003\u0004\u0003\u0004\u0005\u0004[\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005g\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006l\n\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006q\n\u0006\u0005\u0006s\n\u0006\u0003\u0007\u0003\u0007\u0003\b\u0005\bx\n\b\u0003\b\u0003\b\u0003\b\u0005\b}\n\b\u0003\t\u0003\t\u0003\t\u0007\t\u0082\n\t\f\t\u000e\t\u0085\u000b\t\u0003\n\u0003\n\u0003\n\u0005\n\u008a\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u009a\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u009f\n\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013·\n\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003 \u0003 \u0003!\u0003!\u0003\"\u0003\"\u0003#\u0003#\u0003#\u0002\u0002$\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0002\u0007\u0003\u0002CD\u0003\u0002\u000f\u001a\u0003\u0002\u001b0\u0003\u00021;\u0003\u0002<?\u0002\u00d1\u0002L\u0003\u0002\u0002\u0002\u0004S\u0003\u0002\u0002\u0002\u0006V\u0003\u0002\u0002\u0002\bf\u0003\u0002\u0002\u0002\nr\u0003\u0002\u0002\u0002\ft\u0003\u0002\u0002\u0002\u000ew\u0003\u0002\u0002\u0002\u0010~\u0003\u0002\u0002\u0002\u0012\u0089\u0003\u0002\u0002\u0002\u0014\u008b\u0003\u0002\u0002\u0002\u0016\u008e\u0003\u0002\u0002\u0002\u0018\u0090\u0003\u0002\u0002\u0002\u001a\u0099\u0003\u0002\u0002\u0002\u001c\u009e\u0003\u0002\u0002\u0002\u001e \u0003\u0002\u0002\u0002 ¤\u0003\u0002\u0002\u0002\"©\u0003\u0002\u0002\u0002$¶\u0003\u0002\u0002\u0002&¸\u0003\u0002\u0002\u0002(º\u0003\u0002\u0002\u0002*½\u0003\u0002\u0002\u0002,¿\u0003\u0002\u0002\u0002.\u00c1\u0003\u0002\u0002\u00020\u00c3\u0003\u0002\u0002\u00022\u00c5\u0003\u0002\u0002\u00024\u00c7\u0003\u0002\u0002\u00026\u00c9\u0003\u0002\u0002\u00028\u00cb\u0003\u0002\u0002\u0002:\u00cd\u0003\u0002\u0002\u0002<\u00cf\u0003\u0002\u0002\u0002>\u00d1\u0003\u0002\u0002\u0002@\u00d3\u0003\u0002\u0002\u0002B\u00d5\u0003\u0002\u0002\u0002D\u00d7\u0003\u0002\u0002\u0002FH\u0005\u0004\u0003\u0002GF\u0003\u0002\u0002\u0002GH\u0003\u0002\u0002\u0002HI\u0003\u0002\u0002\u0002IK\u0007G\u0002\u0002JG\u0003\u0002\u0002\u0002KN\u0003\u0002\u0002\u0002LJ\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002M\u0003\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002OT\u00052\u001a\u0002PT\u0005\u0006\u0004\u0002QT\u0005\n\u0006\u0002RT\u0005\u0014\u000b\u0002SO\u0003\u0002\u0002\u0002SP\u0003\u0002\u0002\u0002SQ\u0003\u0002\u0002\u0002SR\u0003\u0002\u0002\u0002T\u0005\u0003\u0002\u0002\u0002UW\u0005\u0014\u000b\u0002VU\u0003\u0002\u0002\u0002VW\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0005\b\u0005\u0002Y[\u00052\u001a\u0002ZY\u0003\u0002\u0002\u0002Z[\u0003\u0002\u0002\u0002[\u0007\u0003\u0002\u0002\u0002\\]\u00054\u001b\u0002]^\u0005\u001a\u000e\u0002^g\u0003\u0002\u0002\u0002_g\u00056\u001c\u0002`a\u00058\u001d\u0002ab\u0005\u0016\f\u0002bg\u0003\u0002\u0002\u0002cd\u0005:\u001e\u0002de\u0005\u0018\r\u0002eg\u0003\u0002\u0002\u0002f\\\u0003\u0002\u0002\u0002f_\u0003\u0002\u0002\u0002f`\u0003\u0002\u0002\u0002fc\u0003\u0002\u0002\u0002g\t\u0003\u0002\u0002\u0002hi\u0005@!\u0002ik\u0005\f\u0007\u0002jl\u00052\u001a\u0002kj\u0003\u0002\u0002\u0002kl\u0003\u0002\u0002\u0002ls\u0003\u0002\u0002\u0002ms\u0005\u000e\b\u0002np\u0005D#\u0002oq\u00052\u001a\u0002po\u0003\u0002\u0002\u0002pq\u0003\u0002\u0002\u0002qs\u0003\u0002\u0002\u0002rh\u0003\u0002\u0002\u0002rm\u0003\u0002\u0002\u0002rn\u0003\u0002\u0002\u0002s\u000b\u0003\u0002\u0002\u0002tu\u0005*\u0016\u0002u\r\u0003\u0002\u0002\u0002vx\u0005\u0014\u000b\u0002wv\u0003\u0002\u0002\u0002wx\u0003\u0002\u0002\u0002xy\u0003\u0002\u0002\u0002yz\u0005B\"\u0002z|\u0005\u0010\t\u0002{}\u00052\u001a\u0002|{\u0003\u0002\u0002\u0002|}\u0003\u0002\u0002\u0002}\u000f\u0003\u0002\u0002\u0002~\u0083\u0005\u0012\n\u0002\u007f\u0080\u0007\u0003\u0002\u0002\u0080\u0082\u0005\u0012\n\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0082\u0085\u0003\u0002\u0002\u0002\u0083\u0081\u0003\u0002\u0002\u0002\u0083\u0084\u0003\u0002\u0002\u0002\u0084\u0011\u0003\u0002\u0002\u0002\u0085\u0083\u0003\u0002\u0002\u0002\u0086\u008a\u00050\u0019\u0002\u0087\u0088\u0007\u0004\u0002\u0002\u0088\u008a\u0005\u0016\f\u0002\u0089\u0086\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u008a\u0013\u0003\u0002\u0002\u0002\u008b\u008c\u0005\u0016\f\u0002\u008c\u008d\u0007\u0005\u0002\u0002\u008d\u0015\u0003\u0002\u0002\u0002\u008e\u008f\u0005.\u0018\u0002\u008f\u0017\u0003\u0002\u0002\u0002\u0090\u0091\u00050\u0019\u0002\u0091\u0019\u0003\u0002\u0002\u0002\u0092\u009a\u0005\u001c\u000f\u0002\u0093\u009a\u0005\u001e\u0010\u0002\u0094\u009a\u0005 \u0011\u0002\u0095\u009a\u0005\"\u0012\u0002\u0096\u009a\u0005$\u0013\u0002\u0097\u009a\u0005&\u0014\u0002\u0098\u009a\u0005(\u0015\u0002\u0099\u0092\u0003\u0002\u0002\u0002\u0099\u0093\u0003\u0002\u0002\u0002\u0099\u0094\u0003\u0002\u0002\u0002\u0099\u0095\u0003\u0002\u0002\u0002\u0099\u0096\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u001b\u0003\u0002\u0002\u0002\u009b\u009f\u0005*\u0016\u0002\u009c\u009d\u0007\u0004\u0002\u0002\u009d\u009f\u0005\u0016\f\u0002\u009e\u009b\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009f\u001d\u0003\u0002\u0002\u0002 ¡\u0007\u0006\u0002\u0002¡¢\u0005\u0016\f\u0002¢£\u0007\u0007\u0002\u0002£\u001f\u0003\u0002\u0002\u0002¤¥\u0007\u0006\u0002\u0002¥¦\u0005\u0016\f\u0002¦§\u0007\u0007\u0002\u0002§¨\u0007\b\u0002\u0002¨!\u0003\u0002\u0002\u0002©ª\u0007\t\u0002\u0002ª«\u0007\u0006\u0002\u0002«¬\u0005\u0016\f\u0002¬\u00ad\u0007\u0007\u0002\u0002\u00ad#\u0003\u0002\u0002\u0002®¯\u0007\n\u0002\u0002¯·\u00050\u0019\u0002°±\u0007\u0006\u0002\u0002±²\u0005<\u001f\u0002²³\u0007\b\u0002\u0002³´\u00050\u0019\u0002´µ\u0007\u0007\u0002\u0002µ·\u0003\u0002\u0002\u0002¶®\u0003\u0002\u0002\u0002¶°\u0003\u0002\u0002\u0002·%\u0003\u0002\u0002\u0002¸¹\u0005\u0016\f\u0002¹'\u0003\u0002\u0002\u0002º»\u0007\u000b\u0002\u0002»¼\u00050\u0019\u0002¼)\u0003\u0002\u0002\u0002½¾\u00050\u0019\u0002¾+\u0003\u0002\u0002\u0002¿\u00c0\u0007F\u0002\u0002\u00c0-\u0003\u0002\u0002\u0002\u00c1\u00c2\u0007B\u0002\u0002\u00c2/\u0003\u0002\u0002\u0002\u00c3\u00c4\t\u0002\u0002\u0002\u00c41\u0003\u0002\u0002\u0002\u00c5\u00c6\u0007E\u0002\u0002\u00c63\u0003\u0002\u0002\u0002\u00c7\u00c8\t\u0003\u0002\u0002\u00c85\u0003\u0002\u0002\u0002\u00c9\u00ca\t\u0004\u0002\u0002\u00ca7\u0003\u0002\u0002\u0002\u00cb\u00cc\t\u0005\u0002\u0002\u00cc9\u0003\u0002\u0002\u0002\u00cd\u00ce\t\u0006\u0002\u0002\u00ce;\u0003\u0002\u0002\u0002\u00cf\u00d0\u0007@\u0002\u0002\u00d0=\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007A\u0002\u0002\u00d2?\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\f\u0002\u0002\u00d4A\u0003\u0002\u0002\u0002\u00d5\u00d6\u0007\r\u0002\u0002\u00d6C\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u000e\u0002\u0002\u00d8E\u0003\u0002\u0002\u0002\u0012GLSVZfkprw|\u0083\u0089\u0099\u009e¶".toCharArray());
        _decisionToDFA = new DFA[BCompNGParser._ATN.getNumberOfDecisions()];
        for (int i = 0; i < BCompNGParser._ATN.getNumberOfDecisions(); ++i) {
            BCompNGParser._decisionToDFA[i] = new DFA(BCompNGParser._ATN.getDecisionState(i), i);
        }
    }
    
    public static class ProgContext extends ParserRuleContext
    {
        public List<TerminalNode> EOL() {
            return this.getTokens(69);
        }
        
        public TerminalNode EOL(final int i) {
            return this.getToken(69, i);
        }
        
        public List<LineContext> line() {
            return this.getRuleContexts((Class<? extends LineContext>)LineContext.class);
        }
        
        public LineContext line(final int i) {
            return this.getRuleContext((Class<? extends LineContext>)LineContext.class, i);
        }
        
        public ProgContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 0;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterProg(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitProg(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitProg(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class LineContext extends ParserRuleContext
    {
        public CommentContext comment() {
            return this.getRuleContext((Class<? extends CommentContext>)CommentContext.class, 0);
        }
        
        public InstructionLineContext instructionLine() {
            return this.getRuleContext((Class<? extends InstructionLineContext>)InstructionLineContext.class, 0);
        }
        
        public DirectiveContext directive() {
            return this.getRuleContext((Class<? extends DirectiveContext>)DirectiveContext.class, 0);
        }
        
        public LblContext lbl() {
            return this.getRuleContext((Class<? extends LblContext>)LblContext.class, 0);
        }
        
        public LineContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 1;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterLine(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitLine(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitLine(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class InstructionLineContext extends ParserRuleContext
    {
        public InstructionContext instruction() {
            return this.getRuleContext((Class<? extends InstructionContext>)InstructionContext.class, 0);
        }
        
        public LblContext lbl() {
            return this.getRuleContext((Class<? extends LblContext>)LblContext.class, 0);
        }
        
        public CommentContext comment() {
            return this.getRuleContext((Class<? extends CommentContext>)CommentContext.class, 0);
        }
        
        public InstructionLineContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 2;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterInstructionLine(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitInstructionLine(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitInstructionLine(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class InstructionContext extends ParserRuleContext
    {
        public AddrContext addr() {
            return this.getRuleContext((Class<? extends AddrContext>)AddrContext.class, 0);
        }
        
        public OperandContext operand() {
            return this.getRuleContext((Class<? extends OperandContext>)OperandContext.class, 0);
        }
        
        public NonaddrContext nonaddr() {
            return this.getRuleContext((Class<? extends NonaddrContext>)NonaddrContext.class, 0);
        }
        
        public BranchContext branch() {
            return this.getRuleContext((Class<? extends BranchContext>)BranchContext.class, 0);
        }
        
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public IoContext io() {
            return this.getRuleContext((Class<? extends IoContext>)IoContext.class, 0);
        }
        
        public DevContext dev() {
            return this.getRuleContext((Class<? extends DevContext>)DevContext.class, 0);
        }
        
        public InstructionContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 3;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterInstruction(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitInstruction(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitInstruction(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DirectiveContext extends ParserRuleContext
    {
        public OrgContext org() {
            return this.getRuleContext((Class<? extends OrgContext>)OrgContext.class, 0);
        }
        
        public OrgAddressContext orgAddress() {
            return this.getRuleContext((Class<? extends OrgAddressContext>)OrgAddressContext.class, 0);
        }
        
        public CommentContext comment() {
            return this.getRuleContext((Class<? extends CommentContext>)CommentContext.class, 0);
        }
        
        public WordDirectiveContext wordDirective() {
            return this.getRuleContext((Class<? extends WordDirectiveContext>)WordDirectiveContext.class, 0);
        }
        
        public EndContext end() {
            return this.getRuleContext((Class<? extends EndContext>)EndContext.class, 0);
        }
        
        public DirectiveContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 4;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDirective(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDirective(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDirective(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class OrgAddressContext extends ParserRuleContext
    {
        public AddressContext address() {
            return this.getRuleContext((Class<? extends AddressContext>)AddressContext.class, 0);
        }
        
        public OrgAddressContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 5;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterOrgAddress(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitOrgAddress(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitOrgAddress(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class WordDirectiveContext extends ParserRuleContext
    {
        public WordContext word() {
            return this.getRuleContext((Class<? extends WordContext>)WordContext.class, 0);
        }
        
        public WordArgumentsContext wordArguments() {
            return this.getRuleContext((Class<? extends WordArgumentsContext>)WordArgumentsContext.class, 0);
        }
        
        public LblContext lbl() {
            return this.getRuleContext((Class<? extends LblContext>)LblContext.class, 0);
        }
        
        public CommentContext comment() {
            return this.getRuleContext((Class<? extends CommentContext>)CommentContext.class, 0);
        }
        
        public WordDirectiveContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 6;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterWordDirective(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitWordDirective(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitWordDirective(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class WordArgumentsContext extends ParserRuleContext
    {
        public List<WordArgumentContext> wordArgument() {
            return this.getRuleContexts((Class<? extends WordArgumentContext>)WordArgumentContext.class);
        }
        
        public WordArgumentContext wordArgument(final int i) {
            return this.getRuleContext((Class<? extends WordArgumentContext>)WordArgumentContext.class, i);
        }
        
        public WordArgumentsContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 7;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterWordArguments(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitWordArguments(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitWordArguments(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class WordArgumentContext extends ParserRuleContext
    {
        public NumberContext number() {
            return this.getRuleContext((Class<? extends NumberContext>)NumberContext.class, 0);
        }
        
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public WordArgumentContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 8;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterWordArgument(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitWordArgument(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitWordArgument(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class LblContext extends ParserRuleContext
    {
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public LblContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 9;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterLbl(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitLbl(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitLbl(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class LabelContext extends ParserRuleContext
    {
        public NameContext name() {
            return this.getRuleContext((Class<? extends NameContext>)NameContext.class, 0);
        }
        
        public LabelContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 10;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterLabel(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitLabel(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitLabel(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DevContext extends ParserRuleContext
    {
        public NumberContext number() {
            return this.getRuleContext((Class<? extends NumberContext>)NumberContext.class, 0);
        }
        
        public DevContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 11;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDev(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDev(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDev(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class OperandContext extends ParserRuleContext
    {
        public DirectAbsoluteContext directAbsolute() {
            return this.getRuleContext((Class<? extends DirectAbsoluteContext>)DirectAbsoluteContext.class, 0);
        }
        
        public IndirectContext indirect() {
            return this.getRuleContext((Class<? extends IndirectContext>)IndirectContext.class, 0);
        }
        
        public PostIncrementContext postIncrement() {
            return this.getRuleContext((Class<? extends PostIncrementContext>)PostIncrementContext.class, 0);
        }
        
        public PreDecrementContext preDecrement() {
            return this.getRuleContext((Class<? extends PreDecrementContext>)PreDecrementContext.class, 0);
        }
        
        public DisplacementSPContext displacementSP() {
            return this.getRuleContext((Class<? extends DisplacementSPContext>)DisplacementSPContext.class, 0);
        }
        
        public DirectRelativeContext directRelative() {
            return this.getRuleContext((Class<? extends DirectRelativeContext>)DirectRelativeContext.class, 0);
        }
        
        public DirectLoadContext directLoad() {
            return this.getRuleContext((Class<? extends DirectLoadContext>)DirectLoadContext.class, 0);
        }
        
        public OperandContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 12;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterOperand(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitOperand(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitOperand(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DirectAbsoluteContext extends ParserRuleContext
    {
        public AddressContext address() {
            return this.getRuleContext((Class<? extends AddressContext>)AddressContext.class, 0);
        }
        
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public DirectAbsoluteContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 13;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDirectAbsolute(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDirectAbsolute(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDirectAbsolute(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class IndirectContext extends ParserRuleContext
    {
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public IndirectContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 14;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterIndirect(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitIndirect(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitIndirect(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class PostIncrementContext extends ParserRuleContext
    {
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public PostIncrementContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 15;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterPostIncrement(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitPostIncrement(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitPostIncrement(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class PreDecrementContext extends ParserRuleContext
    {
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public PreDecrementContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 16;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterPreDecrement(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitPreDecrement(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitPreDecrement(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DisplacementSPContext extends ParserRuleContext
    {
        public NumberContext number() {
            return this.getRuleContext((Class<? extends NumberContext>)NumberContext.class, 0);
        }
        
        public SpContext sp() {
            return this.getRuleContext((Class<? extends SpContext>)SpContext.class, 0);
        }
        
        public DisplacementSPContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 17;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDisplacementSP(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDisplacementSP(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDisplacementSP(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DirectRelativeContext extends ParserRuleContext
    {
        public LabelContext label() {
            return this.getRuleContext((Class<? extends LabelContext>)LabelContext.class, 0);
        }
        
        public DirectRelativeContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 18;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDirectRelative(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDirectRelative(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDirectRelative(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class DirectLoadContext extends ParserRuleContext
    {
        public NumberContext number() {
            return this.getRuleContext((Class<? extends NumberContext>)NumberContext.class, 0);
        }
        
        public DirectLoadContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 19;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterDirectLoad(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitDirectLoad(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitDirectLoad(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class AddressContext extends ParserRuleContext
    {
        public NumberContext number() {
            return this.getRuleContext((Class<? extends NumberContext>)NumberContext.class, 0);
        }
        
        public AddressContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 20;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterAddress(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitAddress(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitAddress(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class StringContext extends ParserRuleContext
    {
        public TerminalNode STRING() {
            return this.getToken(68, 0);
        }
        
        public StringContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 21;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterString(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitString(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitString(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class NameContext extends ParserRuleContext
    {
        public TerminalNode NAME() {
            return this.getToken(64, 0);
        }
        
        public NameContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 22;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterName(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitName(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitName(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class NumberContext extends ParserRuleContext
    {
        public TerminalNode DECIMAL() {
            return this.getToken(65, 0);
        }
        
        public TerminalNode HEX() {
            return this.getToken(66, 0);
        }
        
        public NumberContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 23;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterNumber(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitNumber(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitNumber(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class CommentContext extends ParserRuleContext
    {
        public TerminalNode COMMENT() {
            return this.getToken(67, 0);
        }
        
        public CommentContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 24;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterComment(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitComment(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitComment(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class AddrContext extends ParserRuleContext
    {
        public TerminalNode AND() {
            return this.getToken(13, 0);
        }
        
        public TerminalNode OR() {
            return this.getToken(14, 0);
        }
        
        public TerminalNode ADD() {
            return this.getToken(15, 0);
        }
        
        public TerminalNode ADC() {
            return this.getToken(16, 0);
        }
        
        public TerminalNode SUB() {
            return this.getToken(17, 0);
        }
        
        public TerminalNode CMP() {
            return this.getToken(18, 0);
        }
        
        public TerminalNode LOOP() {
            return this.getToken(19, 0);
        }
        
        public TerminalNode LD() {
            return this.getToken(20, 0);
        }
        
        public TerminalNode SWAM() {
            return this.getToken(21, 0);
        }
        
        public TerminalNode JUMP() {
            return this.getToken(22, 0);
        }
        
        public TerminalNode CALL() {
            return this.getToken(23, 0);
        }
        
        public TerminalNode ST() {
            return this.getToken(24, 0);
        }
        
        public AddrContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 25;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterAddr(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitAddr(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitAddr(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class NonaddrContext extends ParserRuleContext
    {
        public TerminalNode NOP() {
            return this.getToken(25, 0);
        }
        
        public TerminalNode HLT() {
            return this.getToken(26, 0);
        }
        
        public TerminalNode CLA() {
            return this.getToken(27, 0);
        }
        
        public TerminalNode NOT() {
            return this.getToken(28, 0);
        }
        
        public TerminalNode CLC() {
            return this.getToken(29, 0);
        }
        
        public TerminalNode CMC() {
            return this.getToken(30, 0);
        }
        
        public TerminalNode ROL() {
            return this.getToken(31, 0);
        }
        
        public TerminalNode ROR() {
            return this.getToken(32, 0);
        }
        
        public TerminalNode ASL() {
            return this.getToken(33, 0);
        }
        
        public TerminalNode ASR() {
            return this.getToken(34, 0);
        }
        
        public TerminalNode SXTB() {
            return this.getToken(35, 0);
        }
        
        public TerminalNode SWAB() {
            return this.getToken(36, 0);
        }
        
        public TerminalNode INC() {
            return this.getToken(37, 0);
        }
        
        public TerminalNode DEC() {
            return this.getToken(38, 0);
        }
        
        public TerminalNode NEG() {
            return this.getToken(39, 0);
        }
        
        public TerminalNode POP() {
            return this.getToken(40, 0);
        }
        
        public TerminalNode POPF() {
            return this.getToken(41, 0);
        }
        
        public TerminalNode RET() {
            return this.getToken(42, 0);
        }
        
        public TerminalNode IRET() {
            return this.getToken(43, 0);
        }
        
        public TerminalNode PUSH() {
            return this.getToken(44, 0);
        }
        
        public TerminalNode PUSHF() {
            return this.getToken(45, 0);
        }
        
        public TerminalNode SWAP() {
            return this.getToken(46, 0);
        }
        
        public NonaddrContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 26;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterNonaddr(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitNonaddr(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitNonaddr(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class BranchContext extends ParserRuleContext
    {
        public TerminalNode BEQ() {
            return this.getToken(47, 0);
        }
        
        public TerminalNode BNE() {
            return this.getToken(48, 0);
        }
        
        public TerminalNode BMI() {
            return this.getToken(49, 0);
        }
        
        public TerminalNode BPL() {
            return this.getToken(50, 0);
        }
        
        public TerminalNode BCS() {
            return this.getToken(51, 0);
        }
        
        public TerminalNode BCC() {
            return this.getToken(52, 0);
        }
        
        public TerminalNode BVS() {
            return this.getToken(53, 0);
        }
        
        public TerminalNode BVC() {
            return this.getToken(54, 0);
        }
        
        public TerminalNode BLT() {
            return this.getToken(55, 0);
        }
        
        public TerminalNode BGE() {
            return this.getToken(56, 0);
        }
        
        public TerminalNode BR() {
            return this.getToken(57, 0);
        }
        
        public BranchContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 27;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterBranch(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitBranch(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitBranch(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class IoContext extends ParserRuleContext
    {
        public TerminalNode CLF() {
            return this.getToken(58, 0);
        }
        
        public TerminalNode TSF() {
            return this.getToken(59, 0);
        }
        
        public TerminalNode IN() {
            return this.getToken(60, 0);
        }
        
        public TerminalNode OUT() {
            return this.getToken(61, 0);
        }
        
        public IoContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 28;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterIo(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitIo(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitIo(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class SpContext extends ParserRuleContext
    {
        public TerminalNode SP() {
            return this.getToken(62, 0);
        }
        
        public SpContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 29;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterSp(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitSp(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitSp(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class IpContext extends ParserRuleContext
    {
        public TerminalNode IP() {
            return this.getToken(63, 0);
        }
        
        public IpContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 30;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterIp(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitIp(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitIp(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class OrgContext extends ParserRuleContext
    {
        public TerminalNode ORG() {
            return this.getToken(10, 0);
        }
        
        public OrgContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 31;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterOrg(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitOrg(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitOrg(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class WordContext extends ParserRuleContext
    {
        public TerminalNode WORD() {
            return this.getToken(11, 0);
        }
        
        public WordContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 32;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterWord(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitWord(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitWord(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
    
    public static class EndContext extends ParserRuleContext
    {
        public TerminalNode END() {
            return this.getToken(12, 0);
        }
        
        public EndContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }
        
        @Override
        public int getRuleIndex() {
            return 33;
        }
        
        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).enterEnd(this);
            }
        }
        
        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof BCompNGListener) {
                ((BCompNGListener)listener).exitEnd(this);
            }
        }
        
        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof BCompNGVisitor) {
                return ((BCompNGVisitor)visitor).visitEnd(this);
            }
            return (T)visitor.visitChildren(this);
        }
    }
}
