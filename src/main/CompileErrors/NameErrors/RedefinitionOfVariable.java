package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class RedefinitionOfVariable extends CompileError {
    String name;
    public RedefinitionOfVariable(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Redefinition of variable " + this.name;}

}
