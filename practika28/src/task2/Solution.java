// task2/Solution.java
import java.util.*;

public class Solution {

    /**
     * Создаёт и возвращает HashMap с 10 парами (фамилия, имя).
     * Требование ТЗ: метод не должен выводить текст и не должен читать с клавиатуры.
     */
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        // Пример данных — 10 записей, некоторые имена/фамилии повторяются
        map.put("Иванов", "Алексей");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Алексей");   // повтор имени
        map.put("Кузнецов", "Мария");
        map.put("Смирнов", "Иван");      // повтор имени
        map.put("Попов", "Анна");
        map.put("Васильев", "Алексей");  // ещё повтор имени
        map.put("Морозов", "Елена");
        map.put("Новиков", "Иван");      // ещё раз Иван
        map.put("Фёдоров", "Анна");      // повтор имени
        return map;
    }

    /**
     * Возвращает количество людей с заданным именем.
     */
    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        if (map == null || name == null) return 0;
        int count = 0;
        for (String firstName : map.values()) {
            if (name.equals(firstName)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Возвращает количество людей с заданной фамилией.
     * (Технически — 0 или 1, т.к. ключи уникальны, но ТЗ требует метод)
     */
    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        if (map == null || lastName == null) return 0;
        return map.containsKey(lastName) ? 1 : 0;
    }
}