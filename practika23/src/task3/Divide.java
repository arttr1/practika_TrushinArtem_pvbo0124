// task3/Divide.java
public class Divide extends AbstractBinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        int rightVal = right.evaluate(x);
        if (rightVal == 0) {
            throw new ArithmeticException("division by zero");
        }
        int leftVal = left.evaluate(x);
        // Проверка на overflow: Integer.MIN_VALUE / -1
        if (leftVal == Integer.MIN_VALUE && rightVal == -1) {
            throw new ArithmeticException("overflow");
        }
        return leftVal / rightVal;
    }

    @Override
    public String toString() {
        return "(" + left + " / " + right + ")";
    }
}
