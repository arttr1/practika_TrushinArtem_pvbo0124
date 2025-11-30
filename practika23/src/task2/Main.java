// task2/Main.java
public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedQueue<>();
        q.enqueue("first");
        q.enqueue("second");
        System.out.println("element: " + q.element()); // first
        System.out.println("dequeue: " + q.dequeue()); // first
        System.out.println("size: " + q.size());       // 1
    }
}
