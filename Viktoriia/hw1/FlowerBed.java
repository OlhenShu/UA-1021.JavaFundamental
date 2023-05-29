package Viktoriia.hw1;

import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of flower bed:");
        double r = scanner.nextDouble();
        double perimeter = Math.PI * 2 * r;
        double area = Math.PI * r * r;
        System.out.printf("Flower bed perimeter: %.2f; radius: %.2f", perimeter, area);
        scanner.close();
    }
}
