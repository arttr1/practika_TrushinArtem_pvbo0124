package Prac14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = """
            Доступные цены:
            25.98 USD — отличная цена!
            1500.00 RUB — для студентов.
            0.004 EU — это ошибка.
            44 ERR — неверная валюта.
            0.00 USD — бесплатно, но не считаем.
            123.45 EUR — европейский товар.
            99 RUB — распродажа!
            7.5 USD — должно быть 7.50, но примем как 7.5.
            0.1 RUB — меньше рубля, но допустимо?
            1000 EURR — опечатка.
            """;

        List<String> validPrices = extractValidPrices(text);
        System.out.println("Извлечённые корректные цены:");
        for (String price : validPrices) {
            System.out.println("  " + price);
        }
    }

    public static List<String> extractValidPrices(String text) {
        List<String> result = new ArrayList<>();

        // Регулярное выражение:
        // - Число: одна или более цифр, опционально: точка и 1-2 цифры (чтобы принять 7.5 и 7.50)
        // - Пробел
        // - Валюта: USD, RUB, EUR
        String regex = "\\b(\\d+(?:\\.\\d{1,2})?)\\s+(USD|RUB|EUR)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String numberStr = matcher.group(1);
            String currency = matcher.group(2).toUpperCase();

            try {
                double value = Double.parseDouble(numberStr);

                if (value <= 0) {
                    continue;
                }


                if (value < 0.01) {
                    continue;
                }


                result.add(numberStr + " " + currency);

            } catch (NumberFormatException ignored) {
            }
        }

        return result;
    }
}