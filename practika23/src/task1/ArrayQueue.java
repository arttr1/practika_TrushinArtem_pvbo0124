// task1/ArrayQueue.java

public class ArrayQueue {
    private Object[] items;
    private int front;
    private int rear;
    private final int capacity;

    public ArrayQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity > 0");
        this.items = new Object[capacity];
        this.capacity = capacity;
        clear();
    }

    // Предусловие: !isFull()
    public void enqueue(Object item) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow");
        }
        if (isEmpty()) {
            front = 0;
        }
        items[++rear] = item;
    }

    // Предусловие: !isEmpty()
    @SuppressWarnings("unchecked")
    public <T> T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        T item = (T) items[front];
        if (front == rear) {
            clear();
        } else {
            front++;
        }
        return item;
    }

    // Предусловие: !isEmpty()
    @SuppressWarnings("unchecked")
    public <T> T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) items[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int size() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    // Постусловие: front = rear = -1
    public void clear() {
        front = rear = -1;
    }
}
