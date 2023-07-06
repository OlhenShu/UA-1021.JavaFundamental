package pt12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        return a*b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter size of side 'a' of rectangle: ");
            int sideA = scanner.nextInt();
            System.out.println("Enter size of side 'b' of rectangle: ");
            int sideB = scanner.nextInt();
            int area = squareRectangle(sideA, sideB);
            System.out.println("Area of rectangle is " + area);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input data, size of side should be an integer");
        } catch (IllegalArgumentException e) {
            System.out.println("Size of side of rectangle can not be negative");
        }
    }
}
