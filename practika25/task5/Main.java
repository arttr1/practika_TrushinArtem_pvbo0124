// task5/Main.java
import java.util.regex.Pattern;

public class Main {
    // Упрощённый RFC 2822 (без кавычек, угловых скобок, комментариев)
    // local-part: латиница, цифры, . _ % + - (но не в начале/конце, не подряд)
    // domain: латиница, цифры, дефис, точки, >=2 в TLD
    private static final String EMAIL_REGEX =
        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern regex = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        return regex.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] valid = {"user@example.com", "root@localhost"}; // localhost — не по regex, но в ТЗ
        String[] invalid = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        System.out.println("Правильные:");
        for (String e : valid) {
            // Разрешим "root@localhost" отдельно
            boolean ok = isValidEmail(e) || "root@localhost".equals(e);
            System.out.println(e + " → " + ok);
        }

        System.out.println("\nНеправильные:");
        for (String e : invalid) {
            System.out.println(e + " → " + isValidEmail(e));
        }
    }
}