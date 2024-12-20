package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class VariableNotDeclared extends CompileError {
    private String name;
    public VariableNotDeclared(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Variable " + this.name + " not declared";}
}
