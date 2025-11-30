// task2/AbstractQueue.java
public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size = 0;

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void clear() { 
        while (!isEmpty()) dequeue(); 
    }
}
