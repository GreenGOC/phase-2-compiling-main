package main.symbolTable.items;

import main.ast.nodes.declaration.Handler;
import main.symbolTable.SymbolTable;

public class HandlerItem extends SymbolTableItem{
    public static final String START_PREFIX = "HANDLER_";
    private SymbolTable handlerSymbolTable;
    private Handler handler;
    public HandlerItem(Handler handler){
        this.handler = handler;
        this.name = this.handler.getName();
    }
    public void setSymbolTable(SymbolTable handlerSymbolTable){this.handlerSymbolTable = handlerSymbolTable;}
    public SymbolTable getSymbolTable(){return this.handlerSymbolTable;}
    @Override
    public String getKey(){
        return this.START_PREFIX + this.name;
    }
    public String getPureName(){return this.name;};

}
