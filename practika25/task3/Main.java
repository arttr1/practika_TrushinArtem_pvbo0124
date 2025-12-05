// task3/Main.java
import java.util.regex.Pattern;

public class Main {
    // Ищем цифру, после которой НЕ идёт '+'
    // Т.е. цифра + (конец строки или НЕ '+')
    // Но проще: найти хотя бы одну цифру, за которой не стоит '+'
    // → просто проверим: есть ли цифра, после которой не '+' — почти всегда да
    // Вместо этого — найдём цифры, после которых НЕТ '+', и если >=1 — true

    // \d(?!\+) — цифра, после которой НЕ идёт '+' (negative lookahead)
    private static final String PATTERN = "\\d(?!\\+)";
    private static final Pattern regex = Pattern.compile(PATTERN);

    public static boolean hasDigitNotFollowedByPlus(String s) {
        return regex.matcher(s).find(); // хотя бы одно совпадение
    }

    public static void main(String[] args) {
        String[] valid = {"(1+ 8) – 9/4"};    // 8, 9, 4 — не за +
        String[] invalid = {"6/5 – 2*9"};     // ОЖИДАЕТСЯ false, но найдёт 6,5,2,9 → true

        // Но по ТЗ "6/5 – 2*9" — неправильное, значит, возможно,
        // нужно искать цифры, ПЕРЕД которыми не '+': (?<!\+)\d
        // Проверим оба:

        System.out.println("По условию: цифра, за которой НЕ '+'");
        for (String s : valid) {
            System.out.println(s + " → " + hasDigitNotFollowedByPlus(s));
        }
        for (String s : invalid) {
            System.out.println(s + " → " + hasDigitNotFollowedByPlus(s));
        }

        System.out.println("\nАльтернатива: цифра, перед которой НЕ '+'");
        Pattern alt = Pattern.compile("(?<!\\+)\\d");
        for (String s : valid) {
            System.out.println(s + " → " + alt.matcher(s).find());
        }
        for (String s : invalid) {
            System.out.println(s + " → " + alt.matcher(s).find());
        }

        // Оба варианта дают true для обоих → примеры в ТЗ, вероятно, перепутаны.
        // Для сдачи — реализуем по формулировке: "цифры, за которыми не стоит '+'"
        // → \d(?!\+)
    }
}