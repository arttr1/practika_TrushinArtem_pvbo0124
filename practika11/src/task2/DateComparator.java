import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateComparator {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public static void compareDates(LocalDateTime currentDate, LocalDateTime userDate) {
        System.out.println("\nТекущая системная дата и время: " + currentDate.format(formatter));
        System.out.println("Введённая дата и время: " + userDate.format(formatter));

        if (userDate.isBefore(currentDate)) {
            System.out.println("Введённая дата раньше текущей.");
        } else if (userDate.isAfter(currentDate)) {
            System.out.println("Введённая дата позже текущей.");
        } else {
            System.out.println("Введённая дата совпадает с текущей.");
        }
    }
}
