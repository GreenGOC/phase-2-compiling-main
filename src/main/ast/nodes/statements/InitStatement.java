package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class InitStatement extends Statement{
    private VarDeclaration assignee;
    private List<Expression> assigned = new ArrayList<>();

    public InitStatement(VarDeclaration assignee, List<Expression> assigned, int _line) {
        this.assignee = assignee;
        this.assigned.addAll(assigned);
        line = _line;
    }

    public VarDeclaration getAssignee(){return this.assignee;}

    public List<Expression> getAssigned() {return this.assigned;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
