// 
// Decompiled by Procyon v0.5.36
// 

package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface BCompNGListener extends ParseTreeListener
{
    void enterProg(final BCompNGParser.ProgContext p0);
    
    void exitProg(final BCompNGParser.ProgContext p0);
    
    void enterLine(final BCompNGParser.LineContext p0);
    
    void exitLine(final BCompNGParser.LineContext p0);
    
    void enterInstructionLine(final BCompNGParser.InstructionLineContext p0);
    
    void exitInstructionLine(final BCompNGParser.InstructionLineContext p0);
    
    void enterInstruction(final BCompNGParser.InstructionContext p0);
    
    void exitInstruction(final BCompNGParser.InstructionContext p0);
    
    void enterDirective(final BCompNGParser.DirectiveContext p0);
    
    void exitDirective(final BCompNGParser.DirectiveContext p0);
    
    void enterOrgAddress(final BCompNGParser.OrgAddressContext p0);
    
    void exitOrgAddress(final BCompNGParser.OrgAddressContext p0);
    
    void enterWordDirective(final BCompNGParser.WordDirectiveContext p0);
    
    void exitWordDirective(final BCompNGParser.WordDirectiveContext p0);
    
    void enterWordArguments(final BCompNGParser.WordArgumentsContext p0);
    
    void exitWordArguments(final BCompNGParser.WordArgumentsContext p0);
    
    void enterWordArgument(final BCompNGParser.WordArgumentContext p0);
    
    void exitWordArgument(final BCompNGParser.WordArgumentContext p0);
    
    void enterLbl(final BCompNGParser.LblContext p0);
    
    void exitLbl(final BCompNGParser.LblContext p0);
    
    void enterLabel(final BCompNGParser.LabelContext p0);
    
    void exitLabel(final BCompNGParser.LabelContext p0);
    
    void enterDev(final BCompNGParser.DevContext p0);
    
    void exitDev(final BCompNGParser.DevContext p0);
    
    void enterOperand(final BCompNGParser.OperandContext p0);
    
    void exitOperand(final BCompNGParser.OperandContext p0);
    
    void enterDirectAbsolute(final BCompNGParser.DirectAbsoluteContext p0);
    
    void exitDirectAbsolute(final BCompNGParser.DirectAbsoluteContext p0);
    
    void enterIndirect(final BCompNGParser.IndirectContext p0);
    
    void exitIndirect(final BCompNGParser.IndirectContext p0);
    
    void enterPostIncrement(final BCompNGParser.PostIncrementContext p0);
    
    void exitPostIncrement(final BCompNGParser.PostIncrementContext p0);
    
    void enterPreDecrement(final BCompNGParser.PreDecrementContext p0);
    
    void exitPreDecrement(final BCompNGParser.PreDecrementContext p0);
    
    void enterDisplacementSP(final BCompNGParser.DisplacementSPContext p0);
    
    void exitDisplacementSP(final BCompNGParser.DisplacementSPContext p0);
    
    void enterDirectRelative(final BCompNGParser.DirectRelativeContext p0);
    
    void exitDirectRelative(final BCompNGParser.DirectRelativeContext p0);
    
    void enterDirectLoad(final BCompNGParser.DirectLoadContext p0);
    
    void exitDirectLoad(final BCompNGParser.DirectLoadContext p0);
    
    void enterAddress(final BCompNGParser.AddressContext p0);
    
    void exitAddress(final BCompNGParser.AddressContext p0);
    
    void enterString(final BCompNGParser.StringContext p0);
    
    void exitString(final BCompNGParser.StringContext p0);
    
    void enterName(final BCompNGParser.NameContext p0);
    
    void exitName(final BCompNGParser.NameContext p0);
    
    void enterNumber(final BCompNGParser.NumberContext p0);
    
    void exitNumber(final BCompNGParser.NumberContext p0);
    
    void enterComment(final BCompNGParser.CommentContext p0);
    
    void exitComment(final BCompNGParser.CommentContext p0);
    
    void enterAddr(final BCompNGParser.AddrContext p0);
    
    void exitAddr(final BCompNGParser.AddrContext p0);
    
    void enterNonaddr(final BCompNGParser.NonaddrContext p0);
    
    void exitNonaddr(final BCompNGParser.NonaddrContext p0);
    
    void enterBranch(final BCompNGParser.BranchContext p0);
    
    void exitBranch(final BCompNGParser.BranchContext p0);
    
    void enterIo(final BCompNGParser.IoContext p0);
    
    void exitIo(final BCompNGParser.IoContext p0);
    
    void enterSp(final BCompNGParser.SpContext p0);
    
    void exitSp(final BCompNGParser.SpContext p0);
    
    void enterIp(final BCompNGParser.IpContext p0);
    
    void exitIp(final BCompNGParser.IpContext p0);
    
    void enterOrg(final BCompNGParser.OrgContext p0);
    
    void exitOrg(final BCompNGParser.OrgContext p0);
    
    void enterWord(final BCompNGParser.WordContext p0);
    
    void exitWord(final BCompNGParser.WordContext p0);
    
    void enterEnd(final BCompNGParser.EndContext p0);
    
    void exitEnd(final BCompNGParser.EndContext p0);
}
