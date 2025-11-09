package Prac13;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(PhoneNumberFormatter.formatPhoneNumber("+79175655655"));   // +7 917–565–5655
            System.out.println(PhoneNumberFormatter.formatPhoneNumber("89175655655"));    // +7 917–565–5655
            System.out.println(PhoneNumberFormatter.formatPhoneNumber("+104289652211"));  // +10 428–965–2211
            System.out.println(PhoneNumberFormatter.formatPhoneNumber("+447911123456"));  // +44 791–112–3456
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}