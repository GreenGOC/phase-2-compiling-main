package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class RedefinitionOfCustomPrimitive extends CompileError {
    String name;
    public RedefinitionOfCustomPrimitive(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Redefinition of custom primitive " + this.name;}

}
