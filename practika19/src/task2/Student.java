public class Student {
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    // Геттеры
    public String getName() { return name; }
    public double getAverageGrade() { return averageGrade; }

    @Override
    public String toString() {
        return String.format("Student{name='%s', avg=%.2f}", name, averageGrade);
    }
}