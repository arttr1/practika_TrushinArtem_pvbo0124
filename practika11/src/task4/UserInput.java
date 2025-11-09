import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    public int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
