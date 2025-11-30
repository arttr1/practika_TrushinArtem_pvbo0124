// task3/Multiply.java
public class Multiply extends AbstractBinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        try {
            return Math.multiplyExact(left.evaluate(x), right.evaluate(x));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("overflow");
        }
    }

    @Override
    public String toString() {
        return "(" + left + " * " + right + ")";
    }
}
