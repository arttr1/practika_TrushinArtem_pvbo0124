// task1/HashTable.java
import java.util.LinkedList;
import java.util.List;

public class HashTable {
    private static final int DEFAULT_CAPACITY = 16;
    private List<Entry>[] buckets;
    private int size;

    // Внутренний класс для пары ключ-значение
    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Задание 1: реализовать функции

    // hashtabInit() — инициализация
    public void hashtabInit(int capacity) {
        if (capacity <= 0) capacity = DEFAULT_CAPACITY;
        @SuppressWarnings("unchecked")
        List<Entry>[] newBuckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            newBuckets[i] = new LinkedList<>();
        }
        this.buckets = newBuckets;
        this.size = 0;
    }

    // Конструктор по умолчанию
    public HashTable() {
        hashtabInit(DEFAULT_CAPACITY);
    }

    // hashtabHash() — хеш-функция (для ключей типа String)
    public int hashtabHash(String key) {
        if (key == null) return 0;
        int hash = 0;
        // Простая полиномиальная хеш-функция: hash = s[0]*31^(n-1) + ... + s[n-1]
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        // Преобразуем в неотрицательный индекс
        return (hash & 0x7FFFFFFF) % buckets.length;
    }

    // hashtabAdd() — добавление
    public void hashtabAdd(String key, String value) {
        if (key == null) throw new IllegalArgumentException("Key cannot be null");
        int index = hashtabHash(key);
        List<Entry> bucket = buckets[index];

        // Проверяем, есть ли уже такой ключ — обновляем значение
        for (Entry entry : bucket) {
            if (key.equals(entry.key)) {
                entry.value = value;
                return;
            }
        }

        // Нет — добавляем новую пару
        bucket.add(new Entry(key, value));
        size++;
    }

    // hashtabLookup() — поиск по ключу
    public String hashtabLookup(String key) {
        if (key == null) return null;
        int index = hashtabHash(key);
        for (Entry entry : buckets[index]) {
            if (key.equals(entry.key)) {
                return entry.value;
            }
        }
        return null; // не найдено
    }

    // hashtabDelete() — удаление по ключу
    public boolean hashtabDelete(String key) {
        if (key == null) return false;
        int index = hashtabHash(key);
        List<Entry> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            Entry entry = bucket.get(i);
            if (key.equals(entry.key)) {
                bucket.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    // Вспомогательные методы
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
}