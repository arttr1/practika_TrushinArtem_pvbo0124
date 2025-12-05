// task2-3/Main.java
public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();

        // Задание 2: добавить 10 элементов
        String[] keys = {"name", "age", "city", "country", "job", "salary", "email", "phone", "hobby", "lang"};
        String[] values = {"Alice", "30", "Moscow", "Russia", "Engineer", "100000", "alice@ex.com", "+7123", "coding", "Java"};

        System.out.println("Добавление 10 элементов:");
        for (int i = 0; i < keys.length; i++) {
            ht.hashtabAdd(keys[i], values[i]);
            System.out.println("  ✅ " + keys[i] + " → " + values[i]);
        }

        System.out.println("\nВсего элементов: " + ht.size());

        // Задание 3: демонстрация поиска
        System.out.println("\n🔎 Поиск:");
        System.out.println("name → " + ht.hashtabLookup("name"));
        System.out.println("salary → " + ht.hashtabLookup("salary"));
        System.out.println("nonexistent → " + ht.hashtabLookup("xyz"));

        // Задание 3: демонстрация удаления
        System.out.println("\n🗑️ Удаление 'job' и 'hobby':");
        System.out.println("До удаления 'job': " + ht.hashtabLookup("job"));
        ht.hashtabDelete("job");
        System.out.println("После удаления 'job': " + ht.hashtabLookup("job"));

        System.out.println("До удаления 'hobby': " + ht.hashtabLookup("hobby"));
        ht.hashtabDelete("hobby");
        System.out.println("После удаления 'hobby': " + ht.hashtabLookup("hobby"));

        System.out.println("Осталось элементов: " + ht.size());
    }
}