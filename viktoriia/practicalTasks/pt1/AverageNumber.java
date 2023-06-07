package pt1;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        System.out.println("Enter third number:");
        int third = scanner.nextInt();
        double average = ((double)(first + second + third)) / 3;
        System.out.println("Average is " + average);
        scanner.close();
    }
}
