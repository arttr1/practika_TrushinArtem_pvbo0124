// task1/Main.java
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(3);

        System.out.println("isEmpty? " + stack.isEmpty()); // true

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("isFull? " + stack.isFull()); // true
        System.out.println("size: " + stack.size());      // 3
        stack.display();  // Stack [top→bottom]: 30, 20, 10

        System.out.println("peek: " + stack.peek());     // 30
        System.out.println("pop: " + stack.pop());       // 30
        System.out.println("pop: " + stack.pop());       // 20

        stack.display();  // Stack [top→bottom]: 10
    }
}