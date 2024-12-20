package main.symbolTable.items;

import main.ast.nodes.declaration.RecordNode;
import main.symbolTable.SymbolTable;

public class RecordItem extends SymbolTableItem{
    public static final String START_PREFIX = "RECORD_";
    private SymbolTable recordSymbolTable;
    private RecordNode recordNode;
    public RecordItem(RecordNode recordNode ){
        this.recordNode = recordNode;
        this.name = recordNode.getRecordName();
    }
    public void setSymbolTable(SymbolTable symbolTable){this.recordSymbolTable = symbolTable;}
    public SymbolTable getSymbolTable(){return this.recordSymbolTable;};
    @Override
    public String getKey() {
        return START_PREFIX + this.name;
    }
}
