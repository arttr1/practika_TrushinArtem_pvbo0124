import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(
                1,
                "Иван",
                "Петров",
                "Информатика",
                2,
                "Б-201",
                4.7,
                LocalDate.of(2004, 5, 12)
        );

        System.out.println(st.toString()); // короткий формат
        System.out.println("Короткий формат: " + st.getFormattedBirthDate("short"));
        System.out.println("Средний формат: " + st.getFormattedBirthDate("medium"));
        System.out.println("Полный формат: " + st.getFormattedBirthDate("long"));
    }
}
