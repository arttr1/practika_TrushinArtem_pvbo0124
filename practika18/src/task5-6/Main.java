public class Main {
    public static void main(String[] args) {
        ThrowsDemo1 demo = new ThrowsDemo1();

        System.out.println("--- Test 1: valid key ---");
        demo.printMessage("user123");

        System.out.println("\n--- Test 2: null key ---");
        demo.printMessage(null);
    }
}
