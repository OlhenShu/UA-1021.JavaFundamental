package pt12.task2;

public class SizeException extends Exception{
    public SizeException() {
        super("This size is incorrect. Size can not be negative, zero or more than 10");
    }

    public SizeException(String message) {
        super(message);
    }
}
