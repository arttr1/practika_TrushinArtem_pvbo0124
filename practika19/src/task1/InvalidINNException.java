public class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }

    public InvalidINNException(String message, Throwable cause) {
        super(message, cause);
    }
}