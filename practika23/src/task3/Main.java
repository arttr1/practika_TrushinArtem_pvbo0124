// task3/Main.java
public class Main {
    public static void main(String[] args) {
        // x^2 - 2*x + 1 = ((x * x) - ((2) * x)) + 1
        Expression expr = new Add(
            new Subtract(
                new Multiply(new Variable("x"), new Variable("x")),
                new Multiply(new Const(2), new Variable("x"))
            ),
            new Const(1)
        );

        int x = args.length > 0 ? Integer.parseInt(args[0]) : 3;
        try {
            int result = expr.evaluate(x);
            System.out.println("x = " + x + " → " + result);
        } catch (ArithmeticException e) {
            System.out.println("x = " + x + " → " + e.getMessage());
        }
    }
}
