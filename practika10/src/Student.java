
public class Student {
    private int iDNumber;
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private double GPA;

    public Student(int iDNumber, String firstName, String lastName, String major, int course, String group, double GPA) {
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public int getiDNumber() { return iDNumber; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMajor() { return major; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGPA() { return GPA; }

    public void setiDNumber(int iDNumber) { this.iDNumber = iDNumber; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setMajor(String major) { this.major = major; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setGPA(double GPA) { this.GPA = GPA; }

    @Override
    public String toString() {
        return "ID: " + iDNumber + ", " + firstName + " " + lastName + ", " + major +
                ", курс " + course + ", группа " + group + ", GPA=" + GPA;
    }
}
