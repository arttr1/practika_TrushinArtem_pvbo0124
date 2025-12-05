// task2/MyArrayList.java
public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length * 2);
            Object[] newData = new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override public void add(T item) {
        ensureCapacity(size + 1);
        data[size++] = item;
    }

    @Override @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    @Override public int size() { return size; }

    @Override public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    // Возвращает внутренний массив и size для итератора (не копия — для эффективности)
    Object[] getData() { return data; }
    int getSize() { return size; }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(this);
    }
}