import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInput {
    public static LocalDateTime getUserDate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();
        
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите час (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minute = scanner.nextInt();


        scanner.close();
        return LocalDateTime.of(year, month, day, hour, minute);
    }
}
