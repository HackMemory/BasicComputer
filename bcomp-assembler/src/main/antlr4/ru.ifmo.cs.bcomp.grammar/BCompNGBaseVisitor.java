// 
// Decompiled by Procyon v0.5.36
// 

package ru.ifmo.cs.bcomp.grammar;

import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import ru.ifmo.cs.bcomp.grammar.BCompNGLexer;
import ru.ifmo.cs.bcomp.grammar.BCompNGLexer.*;
import ru.ifmo.cs.bcomp.grammar.BCompNGListener;
import ru.ifmo.cs.bcomp.grammar.BCompNGParser;
import ru.ifmo.cs.bcomp.grammar.BCompNGParser.*;
import ru.ifmo.cs.bcomp.grammar.BCompNGBaseListener;
import ru.ifmo.cs.bcomp.grammar.BCompNGBaseListener.*;

public class BCompNGBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements BCompNGVisitor<T>
{
    @Override
    public T visitProg(final BCompNGParser.ProgContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitLine(final BCompNGParser.LineContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitInstructionLine(final BCompNGParser.InstructionLineContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitInstruction(final BCompNGParser.InstructionContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDirective(final BCompNGParser.DirectiveContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitOrgAddress(final BCompNGParser.OrgAddressContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitWordDirective(final BCompNGParser.WordDirectiveContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitWordArguments(final BCompNGParser.WordArgumentsContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitWordArgument(final BCompNGParser.WordArgumentContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitLbl(final BCompNGParser.LblContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitLabel(final BCompNGParser.LabelContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDev(final BCompNGParser.DevContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitOperand(final BCompNGParser.OperandContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDirectAbsolute(final BCompNGParser.DirectAbsoluteContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitIndirect(final BCompNGParser.IndirectContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitPostIncrement(final BCompNGParser.PostIncrementContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitPreDecrement(final BCompNGParser.PreDecrementContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDisplacementSP(final BCompNGParser.DisplacementSPContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDirectRelative(final BCompNGParser.DirectRelativeContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitDirectLoad(final BCompNGParser.DirectLoadContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitAddress(final BCompNGParser.AddressContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitString(final BCompNGParser.StringContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitName(final BCompNGParser.NameContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitNumber(final BCompNGParser.NumberContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitComment(final BCompNGParser.CommentContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitAddr(final BCompNGParser.AddrContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitNonaddr(final BCompNGParser.NonaddrContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitBranch(final BCompNGParser.BranchContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitIo(final BCompNGParser.IoContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitSp(final BCompNGParser.SpContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitIp(final BCompNGParser.IpContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitOrg(final BCompNGParser.OrgContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitWord(final BCompNGParser.WordContext ctx) {
        return this.visitChildren(ctx);
    }
    
    @Override
    public T visitEnd(final BCompNGParser.EndContext ctx) {
        return this.visitChildren(ctx);
    }
}
