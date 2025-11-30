// task3/Add.java
public class Add extends AbstractBinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        try {
            return Math.addExact(left.evaluate(x), right.evaluate(x));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("overflow");
        }
    }

    @Override
    public String toString() {
        return "(" + left + " + " + right + ")";
    }
}
