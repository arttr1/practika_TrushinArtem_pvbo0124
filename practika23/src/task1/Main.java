// task1/Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ArrayQueueModule ===");
        testModule();

        System.out.println("\n=== ArrayQueueADT ===");
        testADT();

        System.out.println("\n=== ArrayQueue (OOP) ===");
        testOOP();
    }

    static void testModule() {
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        System.out.println("element: " + ArrayQueueModule.element()); // A
        System.out.println("dequeue: " + ArrayQueueModule.dequeue()); // A
        System.out.println("size: " + ArrayQueueModule.size());       // 1
        ArrayQueueModule.clear();
        System.out.println("isEmpty after clear: " + ArrayQueueModule.isEmpty());
    }

    static void testADT() {
        ArrayQueueADT q = new ArrayQueueADT(3);
        ArrayQueueADT.enqueue(q, 10);
        ArrayQueueADT.enqueue(q, 20);
        System.out.println("element: " + ArrayQueueADT.element(q)); // 10
        System.out.println("dequeue: " + ArrayQueueADT.dequeue(q)); // 10
        System.out.println("size: " + ArrayQueueADT.size(q));       // 1
    }

    static void testOOP() {
        ArrayQueue q = new ArrayQueue(3);
        q.enqueue("X");
        q.enqueue("Y");
        System.out.println("element: " + q.element()); // X
        System.out.println("dequeue: " + q.dequeue()); // X
        System.out.println("size: " + q.size());       // 1
    }
}
