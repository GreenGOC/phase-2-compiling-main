package main.visitor;

import main.CompileErrors.CompileError;
import main.CompileErrors.NameErrors.RedefinitionOfActor;
import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.ConstructorExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import main.CompileErrors.NameErrors.*;
import main.ast.nodes.statements.*;

import java.util.ArrayList;
import java.util.List;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    public Void visit(Soact soact) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(ActorDec actorDec : soact.getActorDecs()){
            ActorItem actorItem = new ActorItem(actorDec);
            try{
                SymbolTable.root.put(actorItem);
            }catch(ItemAlreadyExists e){
                nameErrors.add(new RedefinitionOfActor(actorDec.getLine(), actorDec.getActorName()));
                continue;
            }
            SymbolTable actorSymbolTable = new SymbolTable();
            actorItem.setSymbolTable(actorSymbolTable);
            SymbolTable.push(actorSymbolTable);
            actorDec.accept(this);
            SymbolTable.pop();
        }
        for(RecordNode recordNode : soact.getRecords()){
            RecordItem recordItem = new RecordItem(recordNode);
            try{
                SymbolTable.root.put(recordItem);
            }catch(ItemAlreadyExists e){
                nameErrors.add(new RedefinitionOfRecord(recordNode.getLine(), recordNode.getRecordName()));
            }
            SymbolTable recordSymbolTable = new SymbolTable();
            recordItem.setSymbolTable(recordSymbolTable);
            SymbolTable.push(recordSymbolTable);
            recordNode.accept(this);
            SymbolTable.pop();
        }
        for(Statement statement : soact.getMain()){
            statement.accept(this);
        }
        for(CompileError nameError : nameErrors){
            System.out.println(nameError.getErrorMessage());
        }
        return null;

    }

    public Void visit(Identifier identifier) {
        try{
            SymbolTable.top.getItem(identifier.getName());
        }catch(ItemNotFound e){
            nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
        }
        return null;
    }

    public Void visit(VarDeclaration varDeclaration){
        VarItem varItem = new VarItem(varDeclaration.getName());
        try{
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new RedefinitionOfVariable(varDeclaration.getLine(), varDeclaration.getName().getName()));
        }
        return null;
    }

    public Void visit(CustomPrimitiveDeclaration customPrimitiveDeclaration){
        customPrimitiveDeclaration.getStates().forEach(state ->state.accept(this));
        return null;
    }
    public Void Visit(ActorDec actorDec){
        for(CustomPrimitiveDeclaration customPrimitiveDeclaration : actorDec.getCustomPrimitiveDeclarations()){
            CustomPrimitiveItem customPrimitiveItem = new CustomPrimitiveItem(customPrimitiveDeclaration);
            try{
                SymbolTable.top.put(customPrimitiveItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfCustomPrimitive(customPrimitiveDeclaration.getLine(), customPrimitiveDeclaration.getName()));
            }
            SymbolTable customPrimitiveSymbolTable = new SymbolTable();
            customPrimitiveItem.setCustomSymbolTable(customPrimitiveSymbolTable);
            SymbolTable.push(customPrimitiveSymbolTable);
            customPrimitiveDeclaration.accept(this);
            SymbolTable.pop();
        }
        List<List<Expression>> accessList = actorDec.getAccessExpressions();
        int item = 0;
        for(VarDeclaration varDeclaration : actorDec.getActorVars()){
            varDeclaration.accept(this);
            accessList.get(item).forEach(expression -> expression.accept(this));
        }
        actorDec.getConstructorArgs().forEach(varDeclaration -> varDeclaration.accept(this));
        SymbolTable constructorSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(constructorSymbolTable);
        actorDec.getConstructorStatements().forEach(statement -> statement.accept(this));
        SymbolTable.pop();
        for(Handler handler : actorDec.getMsgHandlers()){
            HandlerItem handlerItem = new HandlerItem(handler);
            if(actorDec.getActorName().equals(handlerItem.getPureName())){
                nameErrors.add(new MessageHandlerConflict(handler.getLine()));
            }
            try{
                SymbolTable.top.put(handlerItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfMessageHandler(handler.getLine(), handler.getName()));
            }
            SymbolTable handlerSymbolTable = SymbolTable.top.copy();
            handlerItem.setSymbolTable(handlerSymbolTable);
            SymbolTable.push(handlerSymbolTable);
            handler.accept(this);
            SymbolTable.pop();
            item += 1;
        }

        return null;

    }

    public Void visit(RecordNode recordNode){
        recordNode.getVars().forEach(var -> var.accept(this));
        return null;
    }

    public Void visit(ForStatement forStatement){
        SymbolTable forSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(forSymbolTable);
        forStatement.getConditions().forEach(expression -> expression.accept(this));
        forStatement.getBody().forEach(statement -> statement.accept(this));
        SymbolTable.pop();
        return null;
    }
    public Void visit(WhileStatement whileStatement) {
        whileStatement.getConditions().forEach(condition -> condition.accept(this));
        SymbolTable whileSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(whileSymbolTable);
        whileStatement.getBody().forEach(statement -> statement.accept(this));
        SymbolTable.pop();
        return null;
    }

    public void visitHandler(Handler handler){
        SymbolTable handlerSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(handlerSymbolTable);
        handler.getArgs().forEach(argument -> argument.accept(this));
        handler.getAuthorizationExpressions().forEach(expression -> expression.accept(this));
        handler.getBody().forEach(statement -> statement.accept(this));
        SymbolTable.pop();
    }

    public Void visit(ServiceHandler serviceHandler) {
        visitHandler(serviceHandler);
        return null;
    }

    public Void visit(ObserveHandler observeHandler) {
        visitHandler(observeHandler);
        return null;
    }
    public Void visit(IfStatement ifStatement) {
        ifStatement.getIfConds().forEach(expression -> expression.accept(this));
        SymbolTable ifSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(ifSymbolTable);
        ifStatement.getIfBody().forEach(statement -> statement.accept(this));
        SymbolTable.pop();
        List<List<Statement>> elseIfBodies = ifStatement.getElseIfBody();
        int item = 0;
        for(List<Expression> elseIfCond : ifStatement.getElseIfConds()){
            elseIfCond.forEach(expression -> expression.accept(this));
            SymbolTable elseIfSymbolTable = SymbolTable.top.copy();
            SymbolTable.push(elseIfSymbolTable);
            elseIfBodies.get(item).forEach(statement -> statement.accept(this));
            SymbolTable.pop();
            item += 1;
        }
        SymbolTable elseSymbolTable = SymbolTable.top.copy();
        SymbolTable.push(elseSymbolTable);
        ifStatement.getElseBody().forEach(statement -> statement.accept(this));
        SymbolTable.pop();

        return null;
    }
    public Void visit(JoinStatement joinStatement) {
        joinStatement.getBody().forEach(statement -> statement.accept(this));
        return null;
    }
    public Void visit(PipeStatement pipeStatement) {
        pipeStatement.getAssignee().forEach(expression -> expression.accept(this));
        pipeStatement.getAssigned().forEach(expression -> expression.accept(this));
        pipeStatement.getPipeExpressions().forEach(expression -> expression.accept(this));
        return null;
    }
    public Void visit(InitStatement assignmentStatement) {
        assignmentStatement.getAssignee().accept(this);
        assignmentStatement.getAssigned().forEach(expression -> expression.accept(this));
        return null;
    }
    public Void visit(ConstructorExpression constructorExpression) {
        constructorExpression.getActorItemName();
        try{
            SymbolTable.root.getItem(constructorExpression.getActorItemName());
        } catch (ItemNotFound e) {
            nameErrors.add(new ActorNotDefined(constructorExpression.getLine(), constructorExpression.getActorPureName()));
        }
        constructorExpression.getArgs().forEach(expression -> expression.accept(this));
        return null;
    }
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().forEach(expression -> expression.accept(this));
        return null;
    }
    public Void visit(ObserveStatement observeStatement) { /// Seemingly, the list of Identifier can have at most two identifiers
        List<Identifier> sequence = observeStatement.getIds();
        String handlerPrefix = HandlerItem.START_PREFIX;
        String actorPrefix = ActorItem.START_PREFIX;
        if(sequence.size() >= 2){
            SymbolTableItem target = null;
            try{
                target = SymbolTable.top.getItem(actorPrefix + sequence.getFirst().getName());
            } catch (ItemNotFound e) {
                nameErrors.add(new ActorNotDefined(observeStatement.getLine(), sequence.getFirst().getName()));
                return null;
            }
            if(target instanceof ActorItem){
                try {
                    ((ActorItem) target).getSymbolTable().getItem(handlerPrefix + sequence.get(1).getName());
                } catch (ItemNotFound e) {
                    nameErrors.add(new MessageHandlerNotDeclared(observeStatement.getLine(), sequence.get(1).getName()));
                }
            }
        }
        observeStatement.getArgs().forEach(expression -> expression.accept(this));
        observeStatement.getObservers().forEach(expression -> expression.accept(this));
        return null;
    }

}
