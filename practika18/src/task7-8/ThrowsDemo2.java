import java.util.Scanner;

public class ThrowsDemo2 {

    // Задание 7 и 8: getKey с циклом и обработкой
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a non-empty key: ");
            String key = myScanner.next();

            try {
                printDetails(key);
                validInput = true; 
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage() + " — try again.");
            }
        }

        System.out.println("✓ Key accepted. Done.");
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println("Message: " + message);
    }

    private String getDetails(String key) throws Exception {
        if (key == null || key.isEmpty()) {
            throw new Exception("Key is null or empty");
        }
        return "data for " + key;
    }

}