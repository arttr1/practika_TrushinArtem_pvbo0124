// task2/Main.java
import java.util.regex.*;
import java.util.*;

public class Main {
    // \d+ — целая часть, (?:\.\d+)? — необязательная дробная
    // \s+ — один или более пробелов
    // (USD|RUB|EUR) — только эти валюты, case-sensitive по ТЗ
    private static final String PATTERN = "\\b(\\d+(?:\\.\\d+)?)\\s+(USD|RUB|EUR)\\b";
    private static final Pattern regex = Pattern.compile(PATTERN);

    public static List<String> extractPrices(String text) {
        List<String> prices = new ArrayList<>();
        Matcher m = regex.matcher(text);
        while (m.find()) {
            String amount = m.group(1);
            String currency = m.group(2);
            prices.add(amount + " " + currency);
        }
        return prices;
    }

    public static void main(String[] args) {
        String text = """
            Купил хлеб за 2.50 RUB, кофе за 3.0 USD и сыр за 15.99 EUR.
            Ошибки: 44 ERR, 0.004 EU, -5 USD, 100. RUB.
            Ещё: 1000 RUB и 0.99 USD.
            """;

        List<String> prices = extractPrices(text);
        System.out.println("Найденные цены:");
        for (String p : prices) {
            System.out.println("✅ " + p);
        }
    }
}