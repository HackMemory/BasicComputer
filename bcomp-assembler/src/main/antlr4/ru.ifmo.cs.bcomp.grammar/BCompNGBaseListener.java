// 
// Decompiled by Procyon v0.5.36
// 

package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class BCompNGBaseListener implements BCompNGListener
{
    @Override
    public void enterProg(final BCompNGParser.ProgContext ctx) {
    }
    
    @Override
    public void exitProg(final BCompNGParser.ProgContext ctx) {
    }
    
    @Override
    public void enterLine(final BCompNGParser.LineContext ctx) {
    }
    
    @Override
    public void exitLine(final BCompNGParser.LineContext ctx) {
    }
    
    @Override
    public void enterInstructionLine(final BCompNGParser.InstructionLineContext ctx) {
    }
    
    @Override
    public void exitInstructionLine(final BCompNGParser.InstructionLineContext ctx) {
    }
    
    @Override
    public void enterInstruction(final BCompNGParser.InstructionContext ctx) {
    }
    
    @Override
    public void exitInstruction(final BCompNGParser.InstructionContext ctx) {
    }
    
    @Override
    public void enterDirective(final BCompNGParser.DirectiveContext ctx) {
    }
    
    @Override
    public void exitDirective(final BCompNGParser.DirectiveContext ctx) {
    }
    
    @Override
    public void enterOrgAddress(final BCompNGParser.OrgAddressContext ctx) {
    }
    
    @Override
    public void exitOrgAddress(final BCompNGParser.OrgAddressContext ctx) {
    }
    
    @Override
    public void enterWordDirective(final BCompNGParser.WordDirectiveContext ctx) {
    }
    
    @Override
    public void exitWordDirective(final BCompNGParser.WordDirectiveContext ctx) {
    }
    
    @Override
    public void enterWordArguments(final BCompNGParser.WordArgumentsContext ctx) {
    }
    
    @Override
    public void exitWordArguments(final BCompNGParser.WordArgumentsContext ctx) {
    }
    
    @Override
    public void enterWordArgument(final BCompNGParser.WordArgumentContext ctx) {
    }
    
    @Override
    public void exitWordArgument(final BCompNGParser.WordArgumentContext ctx) {
    }
    
    @Override
    public void enterLbl(final BCompNGParser.LblContext ctx) {
    }
    
    @Override
    public void exitLbl(final BCompNGParser.LblContext ctx) {
    }
    
    @Override
    public void enterLabel(final BCompNGParser.LabelContext ctx) {
    }
    
    @Override
    public void exitLabel(final BCompNGParser.LabelContext ctx) {
    }
    
    @Override
    public void enterDev(final BCompNGParser.DevContext ctx) {
    }
    
    @Override
    public void exitDev(final BCompNGParser.DevContext ctx) {
    }
    
    @Override
    public void enterOperand(final BCompNGParser.OperandContext ctx) {
    }
    
    @Override
    public void exitOperand(final BCompNGParser.OperandContext ctx) {
    }
    
    @Override
    public void enterDirectAbsolute(final BCompNGParser.DirectAbsoluteContext ctx) {
    }
    
    @Override
    public void exitDirectAbsolute(final BCompNGParser.DirectAbsoluteContext ctx) {
    }
    
    @Override
    public void enterIndirect(final BCompNGParser.IndirectContext ctx) {
    }
    
    @Override
    public void exitIndirect(final BCompNGParser.IndirectContext ctx) {
    }
    
    @Override
    public void enterPostIncrement(final BCompNGParser.PostIncrementContext ctx) {
    }
    
    @Override
    public void exitPostIncrement(final BCompNGParser.PostIncrementContext ctx) {
    }
    
    @Override
    public void enterPreDecrement(final BCompNGParser.PreDecrementContext ctx) {
    }
    
    @Override
    public void exitPreDecrement(final BCompNGParser.PreDecrementContext ctx) {
    }
    
    @Override
    public void enterDisplacementSP(final BCompNGParser.DisplacementSPContext ctx) {
    }
    
    @Override
    public void exitDisplacementSP(final BCompNGParser.DisplacementSPContext ctx) {
    }
    
    @Override
    public void enterDirectRelative(final BCompNGParser.DirectRelativeContext ctx) {
    }
    
    @Override
    public void exitDirectRelative(final BCompNGParser.DirectRelativeContext ctx) {
    }
    
    @Override
    public void enterDirectLoad(final BCompNGParser.DirectLoadContext ctx) {
    }
    
    @Override
    public void exitDirectLoad(final BCompNGParser.DirectLoadContext ctx) {
    }
    
    @Override
    public void enterAddress(final BCompNGParser.AddressContext ctx) {
    }
    
    @Override
    public void exitAddress(final BCompNGParser.AddressContext ctx) {
    }
    
    @Override
    public void enterString(final BCompNGParser.StringContext ctx) {
    }
    
    @Override
    public void exitString(final BCompNGParser.StringContext ctx) {
    }
    
    @Override
    public void enterName(final BCompNGParser.NameContext ctx) {
    }
    
    @Override
    public void exitName(final BCompNGParser.NameContext ctx) {
    }
    
    @Override
    public void enterNumber(final BCompNGParser.NumberContext ctx) {
    }
    
    @Override
    public void exitNumber(final BCompNGParser.NumberContext ctx) {
    }
    
    @Override
    public void enterComment(final BCompNGParser.CommentContext ctx) {
    }
    
    @Override
    public void exitComment(final BCompNGParser.CommentContext ctx) {
    }
    
    @Override
    public void enterAddr(final BCompNGParser.AddrContext ctx) {
    }
    
    @Override
    public void exitAddr(final BCompNGParser.AddrContext ctx) {
    }
    
    @Override
    public void enterNonaddr(final BCompNGParser.NonaddrContext ctx) {
    }
    
    @Override
    public void exitNonaddr(final BCompNGParser.NonaddrContext ctx) {
    }
    
    @Override
    public void enterBranch(final BCompNGParser.BranchContext ctx) {
    }
    
    @Override
    public void exitBranch(final BCompNGParser.BranchContext ctx) {
    }
    
    @Override
    public void enterIo(final BCompNGParser.IoContext ctx) {
    }
    
    @Override
    public void exitIo(final BCompNGParser.IoContext ctx) {
    }
    
    @Override
    public void enterSp(final BCompNGParser.SpContext ctx) {
    }
    
    @Override
    public void exitSp(final BCompNGParser.SpContext ctx) {
    }
    
    @Override
    public void enterIp(final BCompNGParser.IpContext ctx) {
    }
    
    @Override
    public void exitIp(final BCompNGParser.IpContext ctx) {
    }
    
    @Override
    public void enterOrg(final BCompNGParser.OrgContext ctx) {
    }
    
    @Override
    public void exitOrg(final BCompNGParser.OrgContext ctx) {
    }
    
    @Override
    public void enterWord(final BCompNGParser.WordContext ctx) {
    }
    
    @Override
    public void exitWord(final BCompNGParser.WordContext ctx) {
    }
    
    @Override
    public void enterEnd(final BCompNGParser.EndContext ctx) {
    }
    
    @Override
    public void exitEnd(final BCompNGParser.EndContext ctx) {
    }
    
    @Override
    public void enterEveryRule(final ParserRuleContext ctx) {
    }
    
    @Override
    public void exitEveryRule(final ParserRuleContext ctx) {
    }
    
    @Override
    public void visitTerminal(final TerminalNode node) {
    }
    
    @Override
    public void visitErrorNode(final ErrorNode node) {
    }
}
