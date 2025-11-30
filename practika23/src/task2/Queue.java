// task2/Queue.java
public interface Queue<T> {
    void enqueue(T item);      // добавить в конец
    T dequeue();               // удалить из начала
    T element();               // посмотреть начало
    int size();
    boolean isEmpty();
    void clear();
}
