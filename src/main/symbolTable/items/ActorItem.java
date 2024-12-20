package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.symbolTable.SymbolTable;

public class ActorItem extends SymbolTableItem{
    public static final String START_PREFIX = "ACTOR_";
    private SymbolTable actorSymbolTable;
    private ActorDec actorDec;
    public ActorItem(ActorDec actorDec){
        this.actorDec = actorDec;
        this.name = this.actorDec.getActorName();
    }
    public void setSymbolTable(SymbolTable symbolTable){this.actorSymbolTable = symbolTable;}
    public SymbolTable getSymbolTable(){return this.actorSymbolTable;};
    public String getKey(){
        return START_PREFIX +this.name;
    }
}
