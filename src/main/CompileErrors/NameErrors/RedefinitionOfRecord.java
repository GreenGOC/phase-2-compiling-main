package main.CompileErrors.NameErrors;

import main.CompileErrors.CompileError;

public class RedefinitionOfRecord extends CompileError {
    String name;
    public RedefinitionOfRecord(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + " -> Redefinition of record " + this.name;}

}

