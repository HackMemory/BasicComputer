// 
// Decompiled by Procyon v0.5.36
// 

package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface BCompNGVisitor<T> extends ParseTreeVisitor<T>
{
    T visitProg(final BCompNGParser.ProgContext p0);
    
    T visitLine(final BCompNGParser.LineContext p0);
    
    T visitInstructionLine(final BCompNGParser.InstructionLineContext p0);
    
    T visitInstruction(final BCompNGParser.InstructionContext p0);
    
    T visitDirective(final BCompNGParser.DirectiveContext p0);
    
    T visitOrgAddress(final BCompNGParser.OrgAddressContext p0);
    
    T visitWordDirective(final BCompNGParser.WordDirectiveContext p0);
    
    T visitWordArguments(final BCompNGParser.WordArgumentsContext p0);
    
    T visitWordArgument(final BCompNGParser.WordArgumentContext p0);
    
    T visitLbl(final BCompNGParser.LblContext p0);
    
    T visitLabel(final BCompNGParser.LabelContext p0);
    
    T visitDev(final BCompNGParser.DevContext p0);
    
    T visitOperand(final BCompNGParser.OperandContext p0);
    
    T visitDirectAbsolute(final BCompNGParser.DirectAbsoluteContext p0);
    
    T visitIndirect(final BCompNGParser.IndirectContext p0);
    
    T visitPostIncrement(final BCompNGParser.PostIncrementContext p0);
    
    T visitPreDecrement(final BCompNGParser.PreDecrementContext p0);
    
    T visitDisplacementSP(final BCompNGParser.DisplacementSPContext p0);
    
    T visitDirectRelative(final BCompNGParser.DirectRelativeContext p0);
    
    T visitDirectLoad(final BCompNGParser.DirectLoadContext p0);
    
    T visitAddress(final BCompNGParser.AddressContext p0);
    
    T visitString(final BCompNGParser.StringContext p0);
    
    T visitName(final BCompNGParser.NameContext p0);
    
    T visitNumber(final BCompNGParser.NumberContext p0);
    
    T visitComment(final BCompNGParser.CommentContext p0);
    
    T visitAddr(final BCompNGParser.AddrContext p0);
    
    T visitNonaddr(final BCompNGParser.NonaddrContext p0);
    
    T visitBranch(final BCompNGParser.BranchContext p0);
    
    T visitIo(final BCompNGParser.IoContext p0);
    
    T visitSp(final BCompNGParser.SpContext p0);
    
    T visitIp(final BCompNGParser.IpContext p0);
    
    T visitOrg(final BCompNGParser.OrgContext p0);
    
    T visitWord(final BCompNGParser.WordContext p0);
    
    T visitEnd(final BCompNGParser.EndContext p0);
}
