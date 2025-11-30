// task3/AbstractBinaryOperation.java
public abstract class AbstractBinaryOperation implements Expression {
    protected final Expression left, right;
    public AbstractBinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
