import java.util.*;

public class DateAndCalendarExample {
    private final Date date;
    private final Calendar calendar;

    public DateAndCalendarExample(int year, int month, int day, int hour, int minute) {
        // Месяцы в Calendar начинаются с 0 (январь = 0)
        calendar = new GregorianCalendar(year, month - 1, day, hour, minute);
        date = calendar.getTime(); // создаем Date на основе Calendar
    }

    public void showResults() {
        System.out.println("\nРезультаты:");
        System.out.println("Объект Date: " + date);
        System.out.printf(
                "Calendar: %04d-%02d-%02d %02d:%02d\n",
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE)
        );
    }
}
