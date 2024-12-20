package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class MessageHandlerNotDeclared extends CompileError {
    private String name;
    public MessageHandlerNotDeclared(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Variable " + this.name + " not declared";}
}
