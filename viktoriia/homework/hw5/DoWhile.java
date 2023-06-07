package hw5;

import java.util.Scanner;

public class DoWhile {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean perform = true;
        do {
            System.out.println("Enter first numbers:");
            int first = scanner.nextInt();
            System.out.println("Enter second number:");
            int second = scanner.nextInt();
            System.out.println("Sum of " + first + " and " + second + " is " + (first + second));
            System.out.println("Do you want to perform operation again?");
            scanner.nextLine();
            String answer = scanner.nextLine();
            boolean correctInput = false;
            while (!correctInput) {
                switch (answer.toUpperCase()) {
                    case "YES":
                        perform = true;
                        correctInput = true;
                        break;
                    case "NO":
                        perform = false;
                        correctInput = true;
                        break;
                    default:
                        System.out.println("Please write 'YES' or 'NO'");
                        answer = scanner.nextLine();
                }
            }
        } while (perform);
    }
}
