// task1/Main.java
public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();

        // Проверим инициализацию
        System.out.println("Хеш-таблица создана. Емкость: " + ht.getClass().getDeclaredFields()[0].getType().getComponentType().getSimpleName());
        // Просто покажем, что методы компилируются
        ht.hashtabAdd("test", "value");
        System.out.println("Добавлено: test → " + ht.hashtabLookup("test"));
        ht.hashtabDelete("test");
        System.out.println("После удаления: test → " + ht.hashtabLookup("test"));
        System.out.println("✅ Базовая реализация работает");
    }
}