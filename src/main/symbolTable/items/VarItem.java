package main.symbolTable.items;

import main.ast.nodes.expression.Identifier;

public class VarItem extends SymbolTableItem{
    public static final String START_PREFIX = "VAR_";
    public VarItem(Identifier identifier){this.name = identifier.getName();}
    @Override
    public String getKey(){return START_PREFIX + this.name;}
}
