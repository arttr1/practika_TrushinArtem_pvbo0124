package report_FormattedOutputTask;
import java.util.ArrayList;
import java.util.Collections;

public class Report {
    public static void generateReport(Employee[] employees){
        String s = String.join("", Collections.nCopies(43, "="));
        System.out.println(s);
        System.out.printf("|%-41s|\n","Employee sallary report");
        System.out.println(s);
        System.out.printf("|%-20s|%20s|\n", "Full Name", "Salary");
        System.out.println(s);

        for (Employee emp: employees) {
            System.out.printf("|%-20s|%20.2f|\n", emp.getFullName(), emp.getSallary());
        }
        System.out.println(s);

    }
}
