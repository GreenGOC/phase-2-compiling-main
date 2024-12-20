package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class RedefinitionOfMessageHandler extends CompileError {
    String name;
    public RedefinitionOfMessageHandler(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Redefinition of Message Handler " + this.name;}

}
