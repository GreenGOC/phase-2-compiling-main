package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;
import main.symbolTable.items.ActorItem;


public class ConstructorExpression extends Expression{
    private Identifier Id ;
    private List<Expression> args = new ArrayList<>();

    public ConstructorExpression(Identifier _id, int _line) {
        Id = _id;
        line = _line;
    }

    public void setArgs(List<Expression> _args){
        args.addAll(_args);
    }
    public String getActorItemName(){return ActorItem.START_PREFIX + Id.getName();}
    public String getActorPureName(){return this.Id.getName();}
    public List<Expression> getArgs(){return this.args;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
