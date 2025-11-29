// Непроверяемое исключение (extends RuntimeException)
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }

    // Конструктор с причиной — как в листинге 19.6
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}