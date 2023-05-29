package Viktoriia.practicalTasks.pt1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of 'a' variable");
        a = scanner.nextInt();
        System.out.println("Enter value of 'b' variable");
        b = scanner.nextInt();
        int addition = a + b;
        int substraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;
        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + substraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
        scanner.close();
    }
}
