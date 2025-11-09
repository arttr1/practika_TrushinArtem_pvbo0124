import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(3, "Иванов", 4.5));
        students1.add(new Student(1, "Петров", 3.8));
        students1.add(new Student(2, "Сидоров", 4.9));
        students1.add(new Student(4, "Кузнецов", 4.1));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(8, "Иванов", 4.2));
        students2.add(new Student(6, "Петров", 3.5));
        students2.add(new Student(5, "Сидоров", 5.0));
        students2.add(new Student(7, "Кузнецов", 4.0));

        System.out.println("До сортировки:");
        for (Student s : students1) System.out.println(s);

        Student.compareBy = "ID";
        InsertionSort.sort(students1);

        System.out.println("\nПосле сортировки students1 по ID:");
        for (Student s : students1) System.out.println(s);

        List<Student> combined = new ArrayList<>();
        combined.addAll(students1);
        combined.addAll(students2);

        combined = MergeSort.sort(combined);

        System.out.println("\nОбъединённый и отсортированный список по ID:");
        for (Student s : combined) System.out.println(s);

        Student.compareBy = "GPA";
        QuickSort.sort(combined);

        System.out.println("\nОбъединённый и отсортированный список по GPA:");
        for (Student s : combined) System.out.println(s);
    }
}
