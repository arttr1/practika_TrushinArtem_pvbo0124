
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Student> group1 = new ArrayList<>();
        group1.add(new Student(1, "Иван", "Иванов", "Физика", 2, "A1", 4.2));
        group1.add(new Student(2, "Пётр", "Петров", "Математика", 3, "B1", 3.8));
        group1.add(new Student(3, "Сидор", "Сидоров", "Программирование", 1, "C1", 4.9));
        group1.add(new Student(4, "Анна", "Кузнецова", "Физика", 2, "A1", 4.1));

        ArrayList<Student> group2 = new ArrayList<>();
        group2.add(new Student(5, "Мария", "Смирнова", "Программирование", 2, "C2", 4.7));
        group2.add(new Student(6, "Дмитрий", "Козлов", "Математика", 3, "B2", 3.9));

        System.out.println("Группа 1:");
        group1.forEach(System.out::println);

        System.out.println("\nГруппа 2:");
        group2.forEach(System.out::println);

        // Объединяем два списка студентов
        ArrayList<Student> mergedList = StudentSorter.mergeStudentLists(group1, group2);

        System.out.println("\nОбъединённый список студентов (по GPA):");
        mergedList.forEach(System.out::println);

        // Примеры сортировок
        StudentSorter.quickSortByID(mergedList);
        System.out.println("\nОбъединённый список студентов (по ID):");
        mergedList.forEach(System.out::println);

        StudentSorter.sortByLastName(mergedList);
        System.out.println("\nОбъединённый список студентов (по фамилии):");
        mergedList.forEach(System.out::println);
    }
}
