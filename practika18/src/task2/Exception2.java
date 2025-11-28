import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString); 
            System.out.println(2 / i);           
        } catch (NumberFormatException e) {
            System.err.println("Error: Input is not a valid integer. (" + e.getMessage() + ")");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero.");
        }
        myScanner.close();
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}