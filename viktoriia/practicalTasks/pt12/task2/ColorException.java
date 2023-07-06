package pt12.task2;

import java.util.Arrays;

public class ColorException extends Exception {
    public ColorException() {
        super("This color is incorrect. Available colors: " + Color.availableColors());
    }

    public ColorException(String message) {
        super(message);
    }
}
