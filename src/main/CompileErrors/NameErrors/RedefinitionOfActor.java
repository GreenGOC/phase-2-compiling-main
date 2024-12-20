package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class RedefinitionOfActor extends CompileError {
    String name;
    public RedefinitionOfActor(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Redefinition of actor " + this.name;}

}
