package dk.dtu.compute.course02324.mini_java.model;

import dk.dtu.compute.course02324.mini_java.semantics.ProgramEvaluatorVisitor;
import dk.dtu.compute.course02324.mini_java.semantics.ProgramSerializerVisitor;
import dk.dtu.compute.course02324.mini_java.semantics.ProgramTypeVisitor;
import dk.dtu.compute.course02324.mini_java.semantics.ProgramVisitor;

public class PrintStatement implements SimpleStatement{
	
	private String literal;
	private Expression expression;
	
	public PrintStatement(String literal, Expression expression) {
		this.literal = literal;
		this.expression = expression;
	}
	
    public String getLiteral() {
        return literal;
    }

    public Expression getExpression() {
        return expression;
    }
    
    
    @Override
    public void accept(ProgramVisitor visitor) {
    	visitor.visit(this);
    }
    
    @Override
    public void accept(ProgramTypeVisitor visitor) {
    	visitor.visit(this);
    }
    
    @Override
    public void accept(ProgramEvaluatorVisitor visitor) {
    	visitor.visit(this);
    }
    
    @Override
    public void accept(ProgramSerializerVisitor visitor) {
    	visitor.visit(this);
    }
}
