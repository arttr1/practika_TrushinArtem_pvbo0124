public class Student implements MyComparable<Student> {
    int iDNumber;
    String name;
    Double GPA;

    // "ID" = сортировка по iDNumber, "GPA" = сортировка по GPA
    public static String compareBy = "ID";  

    public Student(int iDNumber, String name, double GPA){
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student other) {
        if (compareBy.equals("ID")) {
            return Integer.compare(this.iDNumber, other.iDNumber); // по возрастанию
        } else if (compareBy.equals("GPA")) {
            // сортировка по GPA **по убыванию**
            return Double.compare(other.GPA, this.GPA); 
        } else {
            throw new IllegalStateException("Unknown compare criterion: " + compareBy);
        }
    }

    @Override
    public String toString(){
        return "iDNumber = " + iDNumber + ", name = " + name + ", GPA = " + GPA;
    }
}
