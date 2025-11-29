public class ArrayUtils {
    public static <T> T getElement(T[] array, int index) {
        if (array == null) throw new IllegalArgumentException("null");
        if (index < 0 || index >= array.length) throw new IndexOutOfBoundsException();
        return array[index];
    }

    public static int getElement(int[] array, int index) {
        if (array == null) throw new IllegalArgumentException("null");
        if (index < 0 || index >= array.length) throw new IndexOutOfBoundsException();
        return array[index];
    }
}