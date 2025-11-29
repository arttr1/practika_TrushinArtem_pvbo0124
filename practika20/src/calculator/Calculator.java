public class Calculator {

    // Приватный конструктор — класс служебный
    private Calculator() {}

    // Возвращаем double для простоты и точности
    public static double sum(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static double multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static double divide(Number a, Number b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static double subtract(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }
}