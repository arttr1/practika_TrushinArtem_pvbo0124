import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Student {
    private int iDNumber;
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private double GPA;
    private LocalDate birthDate; // новое поле

    public Student(int iDNumber, String firstName, String lastName, String major,
                   int course, String group, double GPA, LocalDate birthDate) {
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.birthDate = birthDate;
    }

    // ---- Геттеры и сеттеры ----
    public int getiDNumber() { return iDNumber; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMajor() { return major; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGPA() { return GPA; }
    public LocalDate getBirthDate() { return birthDate; }

    public void setiDNumber(int iDNumber) { this.iDNumber = iDNumber; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setMajor(String major) { this.major = major; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setGPA(double GPA) { this.GPA = GPA; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    // ---- Метод, возвращающий дату рождения по заданному типу ----
    public String getFormattedBirthDate(String formatType) {
        DateTimeFormatter formatter;

        switch (formatType.toLowerCase()) {
            case "short":
                formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                break;
            case "medium":
                // средний формат — дд месяц гг г.
                formatter = DateTimeFormatter.ofPattern("d MMMM yy 'г.'", new Locale("ru"));
                break;
            case "long":
                // полный формат, например: 12 мая 2004 года
                formatter = DateTimeFormatter.ofPattern("d MMMM yyyy 'года'", new Locale("ru"));
                break;
            default:
                formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        }

        return birthDate.format(formatter);
    }

    // ---- Переопределение toString() ----
    @Override
    public String toString() {
        DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "ID: " + iDNumber + ", " +
                firstName + " " + lastName + ", " +
                major + ", курс " + course + ", группа " + group +
                ", GPA=" + GPA +
                ", дата рождения: " + birthDate.format(shortFormat);
    }
}
