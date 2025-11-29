import java.util.Arrays;

public class GenericArray<T> {
    private Object[] data;
    private int size;

    public GenericArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("capacity < 0");
        data = new Object[capacity];
        size = 0;
    }

    public void add(T item) {
        if (size >= data.length) throw new IllegalStateException("full");
        data[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    public int size() { return size; }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }
}