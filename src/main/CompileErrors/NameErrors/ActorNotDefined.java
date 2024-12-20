package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class ActorNotDefined extends CompileError {
    String name;
    public ActorNotDefined(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Actor " + this.name + " not defined";}

}
