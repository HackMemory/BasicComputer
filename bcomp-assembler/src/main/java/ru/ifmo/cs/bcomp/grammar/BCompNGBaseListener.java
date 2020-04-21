package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BCompNGBaseListener implements BCompNGListener {

   public void enterProg(BCompNGParser.ProgContext ctx) {}

   public void exitProg(BCompNGParser.ProgContext ctx) {}

   public void enterLine(BCompNGParser.LineContext ctx) {}

   public void exitLine(BCompNGParser.LineContext ctx) {}

   public void enterInstructionLine(BCompNGParser.InstructionLineContext ctx) {}

   public void exitInstructionLine(BCompNGParser.InstructionLineContext ctx) {}

   public void enterInstruction(BCompNGParser.InstructionContext ctx) {}

   public void exitInstruction(BCompNGParser.InstructionContext ctx) {}

   public void enterDirective(BCompNGParser.DirectiveContext ctx) {}

   public void exitDirective(BCompNGParser.DirectiveContext ctx) {}

   public void enterOrgAddress(BCompNGParser.OrgAddressContext ctx) {}

   public void exitOrgAddress(BCompNGParser.OrgAddressContext ctx) {}

   public void enterWordDirective(BCompNGParser.WordDirectiveContext ctx) {}

   public void exitWordDirective(BCompNGParser.WordDirectiveContext ctx) {}

   public void enterWordArguments(BCompNGParser.WordArgumentsContext ctx) {}

   public void exitWordArguments(BCompNGParser.WordArgumentsContext ctx) {}

   public void enterWordArgument(BCompNGParser.WordArgumentContext ctx) {}

   public void exitWordArgument(BCompNGParser.WordArgumentContext ctx) {}

   public void enterDupArgument(BCompNGParser.DupArgumentContext ctx) {}

   public void exitDupArgument(BCompNGParser.DupArgumentContext ctx) {}

   public void enterCount(BCompNGParser.CountContext ctx) {}

   public void exitCount(BCompNGParser.CountContext ctx) {}

   public void enterLbl(BCompNGParser.LblContext ctx) {}

   public void exitLbl(BCompNGParser.LblContext ctx) {}

   public void enterLabel(BCompNGParser.LabelContext ctx) {}

   public void exitLabel(BCompNGParser.LabelContext ctx) {}

   public void enterDev(BCompNGParser.DevContext ctx) {}

   public void exitDev(BCompNGParser.DevContext ctx) {}

   public void enterOperand(BCompNGParser.OperandContext ctx) {}

   public void exitOperand(BCompNGParser.OperandContext ctx) {}

   public void enterDirectAbsolute(BCompNGParser.DirectAbsoluteContext ctx) {}

   public void exitDirectAbsolute(BCompNGParser.DirectAbsoluteContext ctx) {}

   public void enterIndirect(BCompNGParser.IndirectContext ctx) {}

   public void exitIndirect(BCompNGParser.IndirectContext ctx) {}

   public void enterPostIncrement(BCompNGParser.PostIncrementContext ctx) {}

   public void exitPostIncrement(BCompNGParser.PostIncrementContext ctx) {}

   public void enterPreDecrement(BCompNGParser.PreDecrementContext ctx) {}

   public void exitPreDecrement(BCompNGParser.PreDecrementContext ctx) {}

   public void enterDisplacementSP(BCompNGParser.DisplacementSPContext ctx) {}

   public void exitDisplacementSP(BCompNGParser.DisplacementSPContext ctx) {}

   public void enterDirectRelative(BCompNGParser.DirectRelativeContext ctx) {}

   public void exitDirectRelative(BCompNGParser.DirectRelativeContext ctx) {}

   public void enterDirectLoad(BCompNGParser.DirectLoadContext ctx) {}

   public void exitDirectLoad(BCompNGParser.DirectLoadContext ctx) {}

   public void enterAddress(BCompNGParser.AddressContext ctx) {}

   public void exitAddress(BCompNGParser.AddressContext ctx) {}

   public void enterString(BCompNGParser.StringContext ctx) {}

   public void exitString(BCompNGParser.StringContext ctx) {}

   public void enterName(BCompNGParser.NameContext ctx) {}

   public void exitName(BCompNGParser.NameContext ctx) {}

   public void enterNumber(BCompNGParser.NumberContext ctx) {}

   public void exitNumber(BCompNGParser.NumberContext ctx) {}

   public void enterComment(BCompNGParser.CommentContext ctx) {}

   public void exitComment(BCompNGParser.CommentContext ctx) {}

   public void enterAddr(BCompNGParser.AddrContext ctx) {}

   public void exitAddr(BCompNGParser.AddrContext ctx) {}

   public void enterNonaddr(BCompNGParser.NonaddrContext ctx) {}

   public void exitNonaddr(BCompNGParser.NonaddrContext ctx) {}

   public void enterBranch(BCompNGParser.BranchContext ctx) {}

   public void exitBranch(BCompNGParser.BranchContext ctx) {}

   public void enterIo(BCompNGParser.IoContext ctx) {}

   public void exitIo(BCompNGParser.IoContext ctx) {}

   public void enterSp(BCompNGParser.SpContext ctx) {}

   public void exitSp(BCompNGParser.SpContext ctx) {}

   public void enterIp(BCompNGParser.IpContext ctx) {}

   public void exitIp(BCompNGParser.IpContext ctx) {}

   public void enterOrg(BCompNGParser.OrgContext ctx) {}

   public void exitOrg(BCompNGParser.OrgContext ctx) {}

   public void enterWord(BCompNGParser.WordContext ctx) {}

   public void exitWord(BCompNGParser.WordContext ctx) {}

   public void enterDup(BCompNGParser.DupContext ctx) {}

   public void exitDup(BCompNGParser.DupContext ctx) {}

   public void enterEnd(BCompNGParser.EndContext ctx) {}

   public void exitEnd(BCompNGParser.EndContext ctx) {}

   public void enterEveryRule(ParserRuleContext ctx) {}

   public void exitEveryRule(ParserRuleContext ctx) {}

   public void visitTerminal(TerminalNode node) {}

   public void visitErrorNode(ErrorNode node) {}
}
