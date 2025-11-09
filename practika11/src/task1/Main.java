import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Иванов");

        LocalDateTime receivedDate = LocalDateTime.of(2025, 11, 1, 10, 30);
        Assignment task = new Assignment(receivedDate);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("Разработчик: " + dev.getLastName());
        System.out.println("Дата и время получения задания: " + task.getReceivedDate().format(formatter));
        System.out.println("Дата и время сдачи задания: " + task.getSubmissionDate().format(formatter));
    }
}
