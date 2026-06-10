package exceptions;

public class NegativeInpitException extends Exception{
    public NegativeInpitException() {
        this("Input must be greater or equal to 0");
    }

    public NegativeInpitException(String message) {
        super(message);
    }
}
