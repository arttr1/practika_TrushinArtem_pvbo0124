// task3/DoubleKeyHashTable.java
import java.util.*;

public class DoubleKeyHashTable<V> {
    private static class Entry<V> {
        double key;
        V value;
        Entry<V> next;

        Entry(double key, V value, Entry<V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Entry<V>[] buckets;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public DoubleKeyHashTable(int capacity) {
        if (capacity <= 0) capacity = DEFAULT_CAPACITY;
        this.buckets = new Entry[capacity];
        this.size = 0;
    }

    public DoubleKeyHashTable() {
        this(DEFAULT_CAPACITY);
    }

    // Хеш-функция по Sedgewick, 2001, с. 575
    private int hash(double key) {
        long bits = Double.doubleToLongBits(key);
        // bits >>> 32 — сдвиг без знака, bits ^ (bits >>> 32) — смешивание
        return (int) ((bits ^ (bits >>> 32)) % buckets.length);
    }

    private int indexFor(double key) {
        int h = hash(key);
        if (h < 0) h = -h; // избегаем отрицательных индексов
        return h % buckets.length;
    }

    public void put(double key, V value) {
        int index = indexFor(key);
        Entry<V> bucket = buckets[index];

        // Проверка существующего ключа
        for (Entry<V> e = bucket; e != null; e = e.next) {
            if (Double.compare(e.key, key) == 0) {
                e.value = value;
                return;
            }
        }

        // Новый ключ — добавляем в начало связного списка
        buckets[index] = new Entry<>(key, value, bucket);
        size++;
    }

    public V get(double key) {
        int index = indexFor(key);
        for (Entry<V> e = buckets[index]; e != null; e = e.next) {
            if (Double.compare(e.key, key) == 0) {
                return e.value;
            }
        }
        return null;
    }

    public boolean containsKey(double key) {
        return get(key) != null;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
}