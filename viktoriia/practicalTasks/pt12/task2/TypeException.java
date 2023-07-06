package pt12.task2;

public class TypeException extends Exception {
    public TypeException() {
        super("This type is incorrect. Available types: " + Type.availableTypes());
    }

    public TypeException(String message) {
        super(message);
    }
}
