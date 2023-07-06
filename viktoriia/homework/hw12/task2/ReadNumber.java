package hw12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    static Scanner scanner = new Scanner(System.in);
    static int readNumber(int start, int end) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < start || number > end) {
            throw new IllegalArgumentException();
        }
        return number;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        for (int i = 0; i < 10; i++) {
            try {
                int number = readNumber(min, max);
                System.out.println("Number is " + number);
                min = number;
            } catch (InputMismatchException e) {
                i--; //ignore invalid input case
                scanner.nextLine();
                System.out.println("Incorrect input. Input should be a number");
            } catch (IllegalArgumentException e) {
                i--;
                System.out.println("Input should be in a range more than " + min + " and less than " + max);
            }
        }
    }
}
