public class Main {
    public static void main(String[] args) {
        // Примеры арифметических операций с разными числовыми типами

        System.out.println("=== Калькулятор с разными числовыми типами ===");

        // Integer + Double
        double res1 = Calculator.sum(10, 5.5);
        System.out.println("10 + 5.5 = " + res1);

        // Long * Float
        double res2 = Calculator.multiply(100L, 2.5f);
        System.out.println("100L * 2.5f = " + res2);

        // Double / Integer
        double res3 = Calculator.divide(9.0, 3);
        System.out.println("9.0 / 3 = " + res3);

        // Short - Byte
        double res4 = Calculator.subtract((short) 20, (byte) 5);
        System.out.println("(short)20 - (byte)5 = " + res4);

        // Проверка деления на ноль
        try {
            Calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}