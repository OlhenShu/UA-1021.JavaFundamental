package hm3oop;

import java.util.Scanner;

public class hm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" довжинa основи трикутника:");
        double base = scanner.nextDouble();

        System.out.println("висотa трикутника:");
        double height = scanner.nextDouble();

        double area = calculateTriangleArea(base, height);
        System.out.println("Площа трикутника: " + area);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

