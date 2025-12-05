// task3/SimpleListIterator.java
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleListIterator<T> implements Iterator<T> {
    private SimpleList.Node<T> current;

    public SimpleListIterator(SimpleList<T> list) {
        this.current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        T data = current.data;
        current = current.next;
        return data;
    }

    // remove() не реализуем — по ТЗ "implement only if needed"
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() not implemented");
    }
}