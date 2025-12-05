// task1/Main.java
import java.util.regex.Pattern;

public class Main {
    // Точное совпадение — ^...$ + экранирование, но тут только буквы/цифры
    private static final String PATTERN = "^abcdefghijklmnopqrstuv18340$";
    private static final Pattern regex = Pattern.compile(PATTERN);

    public static boolean isValid(String s) {
        return regex.matcher(s).matches();
    }

    public static void main(String[] args) {
        // Примеры из ТЗ
        String[] valid = {"abcdefghijklmnopqrstuv18340"};
        String[] invalid = {
            "abcdefghijklmnopqrstuv1834",   // короче
            "abcdefghijklmnopqrstuv183400", // длиннее
            "Abcdefghijklmnopqrstuv18340",  // заглавная
            "abcdefghijklmnopqrstuv1834o",  // 'o' вместо '0'
            "abcdefghijklmnopqrstuv 18340"  // пробел
        };

        System.out.println("✅ Правильные:");
        for (String s : valid) {
            System.out.println(s + " → " + isValid(s));
        }

        System.out.println("\n❌ Неправильные:");
        for (String s : invalid) {
            System.out.println(s + " → " + isValid(s));
        }
    }
}