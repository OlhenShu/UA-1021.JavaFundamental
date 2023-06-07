package hw5;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Guess the number in the range 0-100: ");
        int guessed = scanner.nextInt();
        while (guessed != number) {
            if (guessed > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            guessed = scanner.nextInt();
        }
        System.out.println("Right the number is " + number);
    }
}
