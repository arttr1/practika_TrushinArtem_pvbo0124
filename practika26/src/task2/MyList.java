// task2/MyList.java
public interface MyList<T> extends Iterable<T> {
    void add(T item);
    T get(int index);
    int size();
    void remove(int index);
}