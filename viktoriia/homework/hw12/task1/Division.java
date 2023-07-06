package hw12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    static Scanner scanner = new Scanner(System.in);
    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can not be zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter dividend: ");
            double a = scanner.nextDouble();
            System.out.println("Enter divisor: ");
            double b = scanner.nextDouble();
            System.out.println("Result is: " + div(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Input should be a number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
