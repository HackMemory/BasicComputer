package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import ru.ifmo.cs.bcomp.grammar.BCompNGParser;

public interface BCompNGListener extends ParseTreeListener {

   void enterProg(BCompNGParser.ProgContext var1);

   void exitProg(BCompNGParser.ProgContext var1);

   void enterLine(BCompNGParser.LineContext var1);

   void exitLine(BCompNGParser.LineContext var1);

   void enterInstructionLine(BCompNGParser.InstructionLineContext var1);

   void exitInstructionLine(BCompNGParser.InstructionLineContext var1);

   void enterInstruction(BCompNGParser.InstructionContext var1);

   void exitInstruction(BCompNGParser.InstructionContext var1);

   void enterDirective(BCompNGParser.DirectiveContext var1);

   void exitDirective(BCompNGParser.DirectiveContext var1);

   void enterOrgAddress(BCompNGParser.OrgAddressContext var1);

   void exitOrgAddress(BCompNGParser.OrgAddressContext var1);

   void enterWordDirective(BCompNGParser.WordDirectiveContext var1);

   void exitWordDirective(BCompNGParser.WordDirectiveContext var1);

   void enterWordArguments(BCompNGParser.WordArgumentsContext var1);

   void exitWordArguments(BCompNGParser.WordArgumentsContext var1);

   void enterWordArgument(BCompNGParser.WordArgumentContext var1);

   void exitWordArgument(BCompNGParser.WordArgumentContext var1);

   void enterDupArgument(BCompNGParser.DupArgumentContext var1);

   void exitDupArgument(BCompNGParser.DupArgumentContext var1);

   void enterCount(BCompNGParser.CountContext var1);

   void exitCount(BCompNGParser.CountContext var1);

   void enterLbl(BCompNGParser.LblContext var1);

   void exitLbl(BCompNGParser.LblContext var1);

   void enterLabel(BCompNGParser.LabelContext var1);

   void exitLabel(BCompNGParser.LabelContext var1);

   void enterDev(BCompNGParser.DevContext var1);

   void exitDev(BCompNGParser.DevContext var1);

   void enterOperand(BCompNGParser.OperandContext var1);

   void exitOperand(BCompNGParser.OperandContext var1);

   void enterDirectAbsolute(BCompNGParser.DirectAbsoluteContext var1);

   void exitDirectAbsolute(BCompNGParser.DirectAbsoluteContext var1);

   void enterIndirect(BCompNGParser.IndirectContext var1);

   void exitIndirect(BCompNGParser.IndirectContext var1);

   void enterPostIncrement(BCompNGParser.PostIncrementContext var1);

   void exitPostIncrement(BCompNGParser.PostIncrementContext var1);

   void enterPreDecrement(BCompNGParser.PreDecrementContext var1);

   void exitPreDecrement(BCompNGParser.PreDecrementContext var1);

   void enterDisplacementSP(BCompNGParser.DisplacementSPContext var1);

   void exitDisplacementSP(BCompNGParser.DisplacementSPContext var1);

   void enterDirectRelative(BCompNGParser.DirectRelativeContext var1);

   void exitDirectRelative(BCompNGParser.DirectRelativeContext var1);

   void enterDirectLoad(BCompNGParser.DirectLoadContext var1);

   void exitDirectLoad(BCompNGParser.DirectLoadContext var1);

   void enterAddress(BCompNGParser.AddressContext var1);

   void exitAddress(BCompNGParser.AddressContext var1);

   void enterString(BCompNGParser.StringContext var1);

   void exitString(BCompNGParser.StringContext var1);

   void enterName(BCompNGParser.NameContext var1);

   void exitName(BCompNGParser.NameContext var1);

   void enterNumber(BCompNGParser.NumberContext var1);

   void exitNumber(BCompNGParser.NumberContext var1);

   void enterComment(BCompNGParser.CommentContext var1);

   void exitComment(BCompNGParser.CommentContext var1);

   void enterAddr(BCompNGParser.AddrContext var1);

   void exitAddr(BCompNGParser.AddrContext var1);

   void enterNonaddr(BCompNGParser.NonaddrContext var1);

   void exitNonaddr(BCompNGParser.NonaddrContext var1);

   void enterBranch(BCompNGParser.BranchContext var1);

   void exitBranch(BCompNGParser.BranchContext var1);

   void enterIo(BCompNGParser.IoContext var1);

   void exitIo(BCompNGParser.IoContext var1);

   void enterSp(BCompNGParser.SpContext var1);

   void exitSp(BCompNGParser.SpContext var1);

   void enterIp(BCompNGParser.IpContext var1);

   void exitIp(BCompNGParser.IpContext var1);

   void enterOrg(BCompNGParser.OrgContext var1);

   void exitOrg(BCompNGParser.OrgContext var1);

   void enterWord(BCompNGParser.WordContext var1);

   void exitWord(BCompNGParser.WordContext var1);

   void enterDup(BCompNGParser.DupContext var1);

   void exitDup(BCompNGParser.DupContext var1);

   void enterEnd(BCompNGParser.EndContext var1);

   void exitEnd(BCompNGParser.EndContext var1);
}
