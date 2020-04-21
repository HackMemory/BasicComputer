package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import ru.ifmo.cs.bcomp.grammar.BCompNGParser;
import ru.ifmo.cs.bcomp.grammar.BCompNGVisitor;

public class BCompNGBaseVisitor extends AbstractParseTreeVisitor implements BCompNGVisitor {

   public Object visitProg(BCompNGParser.ProgContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitLine(BCompNGParser.LineContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitInstructionLine(BCompNGParser.InstructionLineContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitInstruction(BCompNGParser.InstructionContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDirective(BCompNGParser.DirectiveContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitOrgAddress(BCompNGParser.OrgAddressContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitWordDirective(BCompNGParser.WordDirectiveContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitWordArguments(BCompNGParser.WordArgumentsContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitWordArgument(BCompNGParser.WordArgumentContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDupArgument(BCompNGParser.DupArgumentContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitCount(BCompNGParser.CountContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitLbl(BCompNGParser.LblContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitLabel(BCompNGParser.LabelContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDev(BCompNGParser.DevContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitOperand(BCompNGParser.OperandContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDirectAbsolute(BCompNGParser.DirectAbsoluteContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitIndirect(BCompNGParser.IndirectContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitPostIncrement(BCompNGParser.PostIncrementContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitPreDecrement(BCompNGParser.PreDecrementContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDisplacementSP(BCompNGParser.DisplacementSPContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDirectRelative(BCompNGParser.DirectRelativeContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDirectLoad(BCompNGParser.DirectLoadContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitAddress(BCompNGParser.AddressContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitString(BCompNGParser.StringContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitName(BCompNGParser.NameContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitNumber(BCompNGParser.NumberContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitComment(BCompNGParser.CommentContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitAddr(BCompNGParser.AddrContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitNonaddr(BCompNGParser.NonaddrContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitBranch(BCompNGParser.BranchContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitIo(BCompNGParser.IoContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitSp(BCompNGParser.SpContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitIp(BCompNGParser.IpContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitOrg(BCompNGParser.OrgContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitWord(BCompNGParser.WordContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitDup(BCompNGParser.DupContext ctx) {
      return this.visitChildren(ctx);
   }

   public Object visitEnd(BCompNGParser.EndContext ctx) {
      return this.visitChildren(ctx);
   }
}
