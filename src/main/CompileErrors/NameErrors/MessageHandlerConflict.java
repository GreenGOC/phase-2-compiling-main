package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class MessageHandlerConflict extends CompileError {
    public MessageHandlerConflict(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Message Handler name conflicts with Actor name";}
}
