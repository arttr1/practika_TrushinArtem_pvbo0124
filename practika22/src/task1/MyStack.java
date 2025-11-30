public class MyStack<T> {
    private Object[] data;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.top = -1; 
    }

    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Stack overflow");
        }
        data[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return (T) data[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack [top→bottom]: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
    }
}