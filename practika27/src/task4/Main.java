// task4/Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // === Set ===
        System.out.println("=== Set (уникальные элементы) ===");
        Set<Integer> set = new HashSet<>();
        int[] data = {5, 3, 9, 1, 3, 7, 9, 2, 4, 6};
        for (int x : data) {
            set.add(x);
        }
        System.out.println("Добавлено 10 чисел (с повторами)");
        System.out.println("Уникальные в Set: " + set);
        System.out.println("Размер Set: " + set.size()); // должно быть < 10

        // === PriorityQueue (min-heap по умолчанию) ===
        System.out.println("\n=== PriorityQueue (min-heap) ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : data) {
            pq.offer(x);
        }
        System.out.println("Элементы добавлены: " + Arrays.toString(data));

        System.out.println("Извлекаем 5 минимальных элементов:");
        for (int i = 0; i < 5 && !pq.isEmpty(); i++) {
            System.out.println("  #" + (i + 1) + ": " + pq.poll());
        }
        System.out.println("Осталось в очереди: " + pq.size());
    }
}