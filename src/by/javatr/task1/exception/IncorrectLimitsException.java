package by.javatr.task1.exception;

public class IncorrectLimitsException extends Exception{

    public IncorrectLimitsException() {
    }

    public IncorrectLimitsException(String message) {
        super(message);
    }

    public IncorrectLimitsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectLimitsException(Throwable cause) {
        super(cause);
    }
}
