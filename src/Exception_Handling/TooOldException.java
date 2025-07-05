package Exception_Handling;

public class TooOldException extends RuntimeException {
    public TooOldException(String message) {
        super(message);
    }
}
