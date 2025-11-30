// task3/TestStack.java
public class TestStack {
    public static void main(String[] args) {
        System.out.println("=== Тест 1: isEmpty / isFull ===");
        MyStack<Double> s = new MyStack<>(2);
        assert s.isEmpty() : "Новый стек должен быть пуст";
        s.push(3.14);
        assert !s.isEmpty() : "После push — не пуст";
        s.push(2.71);
        assert s.isFull() : "Стек ёмкостью 2 — полон";
        System.out.println("Тесты isEmpty/isFull пройдены");

        System.out.println("\n=== Тест 2: pop/peek из пустого стека ===");
        MyStack<String> empty = new MyStack<>(1);
        try {
            empty.pop();
            assert false : "Должно было быть исключение!";
        } catch (IllegalStateException e) {
            System.out.println("pop() из пустого стека вызвал исключение: " + e.getMessage());
        }

        try {
            empty.peek();
            assert false : "Должно было быть исключение!";
        } catch (IllegalStateException e) {
            System.out.println("peek() из пустого стека вызвал исключение: " + e.getMessage());
        }

        System.out.println("\n=== Тест 3: стирание типов — совместимость с Object ===");
        MyStack<Object> objStack = new MyStack<>(3);
        objStack.push("строка");
        objStack.push(123);
        objStack.push(new int[]{1, 2, 3});

        assert objStack.size() == 3;
        System.out.println("Стек принял разные типы (через Object) — стирание работает");

        System.out.println("\n🎉 Все тесты пройдены!");
    }
}