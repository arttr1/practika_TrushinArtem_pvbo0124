import java.time.LocalDateTime;

public class Assignment {
    private LocalDateTime receivedDate;
    private LocalDateTime submissionDate;

    public Assignment(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
        this.submissionDate = LocalDateTime.now(); // Текущее время
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public LocalDateTime getSubmissionDate() {
        return submissionDate;
    }
}
