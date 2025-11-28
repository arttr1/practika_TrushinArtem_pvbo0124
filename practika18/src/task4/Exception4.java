import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println("Result: " + (2 / i));
        } catch (Exception e) {
            System.err.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Cleanup: Closing scanner...");
            myScanner.close(); 
            System.out.println("Scanner closed.");
        }
    }

}