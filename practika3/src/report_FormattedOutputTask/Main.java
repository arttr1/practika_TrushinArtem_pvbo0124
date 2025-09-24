package report_FormattedOutputTask;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan Ivanov", 50000.75f),
                new Employee("Petr Petrov", 65000.25f),
                new Employee("Vasiliy Vasiliev", 45000.50f),
                new Employee("Dmitry Sidorov", 72000.00f)
        };

        Report.generateReport(employees);
    }
}
