// task2/MyIterator.java
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private final MyArrayList<T> list;
    private int cursor = 0; // index следующего элемента
    private int lastRet = -1; // индекс последнего возвращённого; -1 если нет

    public MyIterator(MyArrayList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.getSize();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        T item = (T) list.getData()[cursor];
        lastRet = cursor++;
        return item;
    }

    @Override
    public void remove() {
        if (lastRet == -1) throw new IllegalStateException();
        list.remove(lastRet);
        cursor = lastRet;
        lastRet = -1;
    }
}