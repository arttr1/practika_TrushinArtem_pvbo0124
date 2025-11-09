import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();

        // Получаем дату и время от пользователя
        int year = input.getInt("Введите год: ");
        int month = input.getInt("Введите месяц (1–12): ");
        int day = input.getInt("Введите число: ");
        int hour = input.getInt("Введите часы (0–23): ");
        int minute = input.getInt("Введите минуты (0–59): ");

        // Создаем объекты Date и Calendar
        DateAndCalendarExample example = new DateAndCalendarExample(year, month, day, hour, minute);
        example.showResults();
    }
}
