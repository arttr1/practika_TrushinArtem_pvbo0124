// task3/SimpleList.java
public class SimpleList<T> implements Iterable<T> {
    private Node<T> head;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    public int size() { return size; }

    @Override
    public SimpleListIterator<T> iterator() {
        return new SimpleListIterator<>(this);
    }

    // Для итератора
    Node<T> getHead() { return head; }
}