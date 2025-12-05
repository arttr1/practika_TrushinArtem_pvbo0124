// task4/Main.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class Main {
    // Простой regex для формата dd/mm/yyyy
    private static final Pattern FORMAT = Pattern.compile(
        "^([0-2]\\d|3[01])/(0[1-9]|1[0-2])/([1-9]\\d{3})$"
    );

    public static boolean isValidDate(String s) {
        if (s == null) return false;
        var m = FORMAT.matcher(s);
        if (!m.matches()) return false;

        int day = Integer.parseInt(m.group(1));
        int month = Integer.parseInt(m.group(2));
        int year = Integer.parseInt(m.group(3));

        if (year < 1900 || year > 9999) return false;

        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] valid = {"29/02/2000", "30/04/2003", "01/01/2003", "31/12/1999"};
        String[] invalid = {
            "29/02/2001",   // не високосный
            "30-04-2003",   // не /
            "1/1/1899",     // <1900, и без ведущих нулей (но наш regex требует 2 цифры)
            "31/04/2020",   // апреля 30 дней
            "99/99/9999"
        };

        System.out.println("✅ Правильные:");
        for (String s : valid) {
            System.out.println(s + " → " + isValidDate(s));
        }

        System.out.println("\n❌ Неправильные:");
        for (String s : invalid) {
            System.out.println(s + " → " + isValidDate(s));
        }
    }
}