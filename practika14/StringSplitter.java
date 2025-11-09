package Prac14;
import java.util.Scanner;

public class StringSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 'exit' в любой момент, чтобы завершить программу.\n");

        while (true) {
            System.out.print("Введите строку для разбиения: ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input.trim())) {
                System.out.println("Выход из программы.");
                break;
            }


            System.out.print("Введите регулярное выражение для разбиения: ");
            String regex = scanner.nextLine();
            if ("exit".equalsIgnoreCase(regex.trim())) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                String[] parts = input.split(regex);

                System.out.println("\nРезультат разбиения:");
                if (parts.length == 0) {
                    System.out.println("пустой массив");
                } else {
                    for (int i = 0; i < parts.length; i++) {
                        String display = parts[i].isEmpty() ? "[пусто]" : "\"" + parts[i] + "\"";
                        System.out.println("  [" + i + "] = " + display);
                    }
                }
                System.out.println("Всего элементов: " + parts.length + "\n");

            } catch (Exception e) {
                System.err.println("Ошибка при разбиении строки: " + e.getMessage());
            }
        }

        scanner.close();
    }
}