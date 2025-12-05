// task2/Main.java
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = Solution.createMap();

        System.out.println("Алексей встречается: " + Solution.getSameFirstNameCount(map, "Алексей") + " раз(а)");
        System.out.println("Иван встречается: " + Solution.getSameFirstNameCount(map, "Иван") + " раз(а)");
        System.out.println("Фамилия 'Петров' есть? " + Solution.getSameLastNameCount(map, "Петров"));
        System.out.println("Фамилия 'Джонсон' есть? " + Solution.getSameLastNameCount(map, "Джонсон"));
    }
}