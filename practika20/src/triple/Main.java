public class Main {
    public static void main(String[] args) {
        // Подготавливаем данные
        String str = "Hello";
        Dog dog = new Dog("Rex");
        Integer number = 100;

        // Создаём экземпляр Triple
        Triple<String, Dog, Integer> triple = new Triple<>(str, dog, number);

        // Выводим значения
        System.out.println("T = " + triple.getT());
        System.out.println("V = " + triple.getV());
        System.out.println("K = " + triple.getK());

        // Выводим имена классов полей
        System.out.println("\nТипы полей:");
        triple.printTypes();

        // Пример сравнения — T реализует Comparable<String>
        String another = "World";
        int cmp = triple.getT().compareTo(another);
        System.out.println("\nСравнение T (\"Hello\" vs \"World\"): " + cmp);
    }
}