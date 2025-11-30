// task1/ArrayQueueModule.java

/**
 * Реализация очереди как модуля: один глобальный экземпляр.
 * Инвариант:
 *   - front ∈ [-1, size)
 *   - rear ∈ [-1, capacity)
 *   - если очередь не пуста: 0 ≤ front ≤ rear < capacity
 *   - если очередь пуста: front == -1 && rear == -1
 *   - элементы хранятся в items[front..rear] (включительно)
 */
public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] items = new Object[DEFAULT_CAPACITY];
    private static int front = -1;
    private static int rear = -1;

    // Предусловие: очередь не полна → (rear < capacity - 1)
    // Постусловие: элемент добавлен в конец; rear++, при первом добавлении front=0
    public static void enqueue(Object item) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow");
        }
        if (isEmpty()) {
            front = 0;
        }
        items[++rear] = item;
    }

    // Предусловие: очередь не пуста → !isEmpty()
    // Постусловие: элемент из начала удалён и возвращён; front++ (или front=rear=-1, если был последний)
    @SuppressWarnings("unchecked")
    public static <T> T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        T item = (T) items[front];
        if (front == rear) {
            // последний элемент
            front = rear = -1;
        } else {
            front++;
        }
        return item;
    }

    // Предусловие: очередь не пуста
    @SuppressWarnings("unchecked")
    public static <T> T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) items[front];
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static boolean isFull() {
        return rear == DEFAULT_CAPACITY - 1;
    }

    public static int size() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    // Постусловие: front = rear = -1
    public static void clear() {
        front = rear = -1;
    }
}
