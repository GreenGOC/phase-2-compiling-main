package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.statements.*;

/// HOW TO ADD ACTOR INSTANCE INTO SYMBOL TABLE?

public abstract class Visitor<T> implements IVisitor<T> {
    public T visit(Soact soact) {return null;} /// DONE
    public T visit(Identifier identifier) {return null;} /// DONE
    public T visit(VarDeclaration varDeclaration) {return null;} /// DONE
    public T visit(CustomPrimitiveDeclaration customPrimitiveDeclaration) {return null;} /// DONE
    public T visit(ActorDec actorDec) {
        return null;
    } /// DONE
    public T visit(RecordNode recordNode) {
        return null;
    } /// DONE
    public T visit(ForStatement forStatement) {return null;} /// DONE
    public T visit(IntValue intValue) {return null;} /// DONE (Nothing to be done)
    public T visit(WhileStatement whileStatement) {return null;} /// DONE
    public T visit(ServiceHandler serviceHandler) {return null;} /// DONE
    public T visit(ObserveHandler observeHandler) {return null;} /// DONE
    public T visit(IfStatement ifStatement) {return null;} /// DONE
    public T visit(JoinStatement joinStatement) {return null;} /// DONE
    public T visit(PipeStatement pipeStatement) {return null;} /// DONE
    public T visit(InitStatement assignmentStatement) {return null;} /// DONE
    public T visit(ConstructorExpression constructorExpression) {return null;} /// DONE
    public T visit(ExpressionStatement expressionStatement) {return null;} /// DONE
    public T visit(ObserveStatement observeStatement) {return null;}

}
