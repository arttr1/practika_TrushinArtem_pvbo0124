import java.util.*;

public class Solution {

    @SafeVarargs
    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        if (elements != null) Collections.addAll(list, elements);
        return list;
    }

    @SafeVarargs
    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        if (elements != null) Collections.addAll(set, elements);
        return set;
    }

    @SuppressWarnings("unchecked")
    public static <K, V> Map<K, V> newHashMap(K key1, V value1, Object... rest) {
        if (rest.length % 2 != 0) {
            throw new IllegalArgumentException("Нечётное число аргументов");
        }

        Map<K, V> map = new HashMap<>();
        map.put(key1, value1);

        for (int i = 0; i < rest.length; i += 2) {
            K key = (K) rest[i];
            V val = (V) rest[i + 1];
            map.put(key, val);
        }

        return map;
    }
}