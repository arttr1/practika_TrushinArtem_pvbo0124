import java.util.*;

public class ArrayConverter {
    public static <T> List<T> arrayToList(T[] array) {
        if (array == null) return new ArrayList<>();
        return new ArrayList<>(Arrays.asList(array));
    }

    public static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        if (array != null) for (int v : array) list.add(v);
        return list;
    }

    public static List<Double> arrayToList(double[] array) {
        List<Double> list = new ArrayList<>();
        if (array != null) for (double v : array) list.add(v);
        return list;
    }
}