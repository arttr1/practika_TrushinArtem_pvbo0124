package Prac13;

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Номер не может быть пустым");
        }

        String digitsOnly;

        // Обработка формата "8XXXXXXXXXX"
        if (input.startsWith("8") && input.length() == 11) {
            String rest = input.substring(1);
            if (!rest.matches("\\d{10}")) {
                throw new IllegalArgumentException("Некорректный номер: " + input);
            }
            digitsOnly = "7" + rest; // заменяем 8 на код страны 7
        }
        // Обработка формата "+<код><10 цифр>"
        else if (input.startsWith("+")) {
            String numberPart = input.substring(1);
            if (!numberPart.matches("\\d{11,12}")) {
                // Код страны может быть 1 или 2 цифры (например, +7 или +10), итого 11–12 цифр
                throw new IllegalArgumentException("Некорректный международный номер: " + input);
            }

            // Проверяем, что последние 10 символов — цифры (номер), а всё остальное — код страны
            String countryCode = numberPart.substring(0, numberPart.length() - 10);
            String phoneNumber = numberPart.substring(numberPart.length() - 10);

            if (!countryCode.matches("\\d{1,2}") || !phoneNumber.matches("\\d{10}")) {
                throw new IllegalArgumentException("Некорректная структура номера: " + input);
            }

            digitsOnly = numberPart; // уже в виде "79175655655" или "104289652211"
        } else {
            throw new IllegalArgumentException("Неподдерживаемый формат номера: " + input);
        }

        // Теперь digitsOnly = <код страны (1–2 цифры)><10 цифр номера>
        int totalLength = digitsOnly.length();
        if (totalLength < 11 || totalLength > 12) {
            throw new IllegalArgumentException("Неверная длина номера: " + input);
        }

        String countryCode = digitsOnly.substring(0, totalLength - 10);
        String phone = digitsOnly.substring(totalLength - 10);

        // Разбиваем номер на части: XXX-XXX-XXXX
        String part1 = phone.substring(0, 3);
        String part2 = phone.substring(3, 6);
        String part3 = phone.substring(6, 10);

        return "+" + countryCode + " " + part1 + "–" + part2 + "–" + part3;
    }
}