package main.symbolTable.items;

import main.ast.nodes.declaration.CustomPrimitiveDeclaration;
import main.symbolTable.SymbolTable;

public class CustomPrimitiveItem extends SymbolTableItem{
    public static final String START_PREFIX = "CUSTOM_PRIM_";
    private SymbolTable customSymbolTable;
    private CustomPrimitiveDeclaration customPrimitiveDeclaration;
    public CustomPrimitiveItem(CustomPrimitiveDeclaration customPrimitiveDeclaration){
        this.customPrimitiveDeclaration = customPrimitiveDeclaration;
        this.name = customPrimitiveDeclaration.getName();
    }
    public void setCustomSymbolTable(SymbolTable customSymbolTable){
        this.customSymbolTable = customSymbolTable;
    }
    public SymbolTable getCustomSymbolTable(){return this.customSymbolTable;};
    @Override
    public String getKey() {
        return START_PREFIX + this.name;
    }
}
