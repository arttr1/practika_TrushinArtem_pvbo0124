import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("isEmpty? " + stack.isEmpty()); 

        stack.push("Alpha");
        stack.push("Beta");
        stack.push("Gamma");

        System.out.println("size: " + stack.size());       
        System.out.println("peek: " + stack.peek());       

        while (!stack.isEmpty()) {
            System.out.println("pop: " + stack.pop());
        }
        
    }
}