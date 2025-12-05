// task3/Main.java
public class Main {
    public static void main(String[] args) {
        SimpleList<Integer> list = new SimpleList<>();
        for (int i = 1; i <= 5; i++) list.add(i * 10);

        System.out.println("Элементы через for-each:");
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\nЭлементы через итератор:");
        SimpleListIterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}