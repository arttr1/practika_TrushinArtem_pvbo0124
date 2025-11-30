// task3/Subtract.java
public class Subtract extends AbstractBinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        try {
            return Math.subtractExact(left.evaluate(x), right.evaluate(x));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("overflow");
        }
    }

    @Override
    public String toString() {
        return "(" + left + " - " + right + ")";
    }
}
