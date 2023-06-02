package Viktoriia.practicalTasks.pt4;

import java.util.Scanner;

public class countOdd {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        if ((scanner.nextInt()) % 2 != 0) {
            count++;
        }
        System.out.println("Input second number:");
        if ((scanner.nextInt()) % 2 != 0) {
            count++;
        }
        System.out.println("Input third number:");
        if ((scanner.nextInt()) % 2 != 0) {
            count++;
        }
        System.out.println("There are " + count + " odd numbers");
    }
}
