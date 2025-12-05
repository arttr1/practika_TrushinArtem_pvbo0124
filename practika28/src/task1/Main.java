// task1/Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Создаём HashSet (как в примере)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("geeks");
        hashSet.add("practice");
        hashSet.add("contribute");
        hashSet.add("ide");

        System.out.println("Original HashSet: " + hashSet);

        // 2. Преобразуем в TreeSet (автоматическая сортировка)
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("Sorted via TreeSet: " + treeSet);

        // Альтернатива через List (как в примере) — для сравнения
        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        System.out.println("Sorted via List:   " + list);
    }
}