import java.util.*;

public class LabClass {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    // Сортировка по среднему баллу (по убыванию)
    public void sortByAverageGrade() {
        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
    }

    // 🔍 Поиск по ФИО (case-insensitive, частичное совпадение)
    public Student findByName(String nameQuery) {
        if (nameQuery == null || nameQuery.trim().isEmpty()) {
            throw new IllegalArgumentException("Запрос поиска не может быть пустым");
        }

        String query = nameQuery.trim().toLowerCase();
        List<Student> matches = new ArrayList<>();

        for (Student s : students) {
            if (s.getName().toLowerCase().contains(query)) {
                matches.add(s);
            }
        }

        if (matches.isEmpty()) {
            throw new StudentNotFoundException("Студент с ФИО, содержащим '" + nameQuery + "', не найден");
        }

        if (matches.size() > 1) {
            System.out.println("Найдено несколько совпадений:");
            for (Student s : matches) {
                System.out.println("  - " + s.getName());
            }
        }

        return matches.get(0); // возвращаем первое совпадение
    }

    // Вспомогательный: вывод списка
    public void printAll() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}