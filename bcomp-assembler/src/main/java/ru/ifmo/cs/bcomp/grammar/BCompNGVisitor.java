package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import ru.ifmo.cs.bcomp.grammar.BCompNGParser;

public interface BCompNGVisitor extends ParseTreeVisitor {

   Object visitProg(BCompNGParser.ProgContext var1);

   Object visitLine(BCompNGParser.LineContext var1);

   Object visitInstructionLine(BCompNGParser.InstructionLineContext var1);

   Object visitInstruction(BCompNGParser.InstructionContext var1);

   Object visitDirective(BCompNGParser.DirectiveContext var1);

   Object visitOrgAddress(BCompNGParser.OrgAddressContext var1);

   Object visitWordDirective(BCompNGParser.WordDirectiveContext var1);

   Object visitWordArguments(BCompNGParser.WordArgumentsContext var1);

   Object visitWordArgument(BCompNGParser.WordArgumentContext var1);

   Object visitDupArgument(BCompNGParser.DupArgumentContext var1);

   Object visitCount(BCompNGParser.CountContext var1);

   Object visitLbl(BCompNGParser.LblContext var1);

   Object visitLabel(BCompNGParser.LabelContext var1);

   Object visitDev(BCompNGParser.DevContext var1);

   Object visitOperand(BCompNGParser.OperandContext var1);

   Object visitDirectAbsolute(BCompNGParser.DirectAbsoluteContext var1);

   Object visitIndirect(BCompNGParser.IndirectContext var1);

   Object visitPostIncrement(BCompNGParser.PostIncrementContext var1);

   Object visitPreDecrement(BCompNGParser.PreDecrementContext var1);

   Object visitDisplacementSP(BCompNGParser.DisplacementSPContext var1);

   Object visitDirectRelative(BCompNGParser.DirectRelativeContext var1);

   Object visitDirectLoad(BCompNGParser.DirectLoadContext var1);

   Object visitAddress(BCompNGParser.AddressContext var1);

   Object visitString(BCompNGParser.StringContext var1);

   Object visitName(BCompNGParser.NameContext var1);

   Object visitNumber(BCompNGParser.NumberContext var1);

   Object visitComment(BCompNGParser.CommentContext var1);

   Object visitAddr(BCompNGParser.AddrContext var1);

   Object visitNonaddr(BCompNGParser.NonaddrContext var1);

   Object visitBranch(BCompNGParser.BranchContext var1);

   Object visitIo(BCompNGParser.IoContext var1);

   Object visitSp(BCompNGParser.SpContext var1);

   Object visitIp(BCompNGParser.IpContext var1);

   Object visitOrg(BCompNGParser.OrgContext var1);

   Object visitWord(BCompNGParser.WordContext var1);

   Object visitDup(BCompNGParser.DupContext var1);

   Object visitEnd(BCompNGParser.EndContext var1);
}
