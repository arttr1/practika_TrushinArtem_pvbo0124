// task6/Main.java
import java.util.regex.Pattern;

public class Main {
    // Минимум 8 символов
    // [a-zA-Z0-9_] — \w, но \w включает не-латиницу, поэтому явно:
    // Должно быть: хотя бы одна заглавная, одна строчная, одна цифра
    // Используем positive lookahead

    private static final String PATTERN =
        "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";
    private static final Pattern regex = Pattern.compile(PATTERN);

    public static boolean isStrongPassword(String pwd) {
        return pwd != null && regex.matcher(pwd).matches();
    }

    public static void main(String[] args) {
        String[] valid = {"F032_Password", "TrySpy1", "Aa1_____"};
        String[] invalid = {"smart_pass", "A007", "password", "PASSWORD1", "Pass"};

        System.out.println("✅ Надёжные:");
        for (String p : valid) {
            System.out.println(p + " → " + isStrongPassword(p));
        }

        System.out.println("\n❌ Слабые:");
        for (String p : invalid) {
            System.out.println(p + " → " + isStrongPassword(p));
        }
    }
}