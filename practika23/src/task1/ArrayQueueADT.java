// task1/ArrayQueueADT.java

/**
 * АТД-стиль: очередь передаётся как параметр.
 * Инвариант (для любого экземпляра queue):
 *   - queue.items != null
 *   - queue.capacity > 0
 *   - queue.front ∈ [-1, queue.capacity)
 *   - queue.rear ∈ [-1, queue.capacity)
 *   - если пусто: front == -1 && rear == -1
 *   - иначе: 0 ≤ front ≤ rear < capacity
 */
public class ArrayQueueADT {
    private Object[] items;
    private int front;
    private int rear;
    private int capacity;

    // Конструктор — создаёт структуру, НЕ является методом АТД
    public ArrayQueueADT(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("capacity > 0");
        this.items = new Object[capacity];
        this.capacity = capacity;
        clear(this); // инициализация инварианта
    }

    // === Методы АТД: все принимают queue явно ===

    // Предусловие: !isFull(queue)
    public static void enqueue(ArrayQueueADT queue, Object item) {
        if (isFull(queue)) {
            throw new IllegalStateException("Queue overflow");
        }
        if (isEmpty(queue)) {
            queue.front = 0;
        }
        queue.items[++queue.rear] = item;
    }

    // Предусловие: !isEmpty(queue)
    // Постусловие: элемент удалён, front скорректирован
    @SuppressWarnings("unchecked")
    public static <T> T dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue underflow");
        }
        T item = (T) queue.items[queue.front];
        if (queue.front == queue.rear) {
            clear(queue);
        } else {
            queue.front++;
        }
        return item;
    }

    // Предусловие: !isEmpty(queue)
    @SuppressWarnings("unchecked")
    public static <T> T element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) queue.items[queue.front];
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.front == -1;
    }

    public static boolean isFull(ArrayQueueADT queue) {
        return queue.rear == queue.capacity - 1;
    }

    public static int size(ArrayQueueADT queue) {
        return isEmpty(queue) ? 0 : queue.rear - queue.front + 1;
    }

    // Постусловие: queue.front == -1 && queue.rear == -1
    public static void clear(ArrayQueueADT queue) {
        queue.front = queue.rear = -1;
    }
}
