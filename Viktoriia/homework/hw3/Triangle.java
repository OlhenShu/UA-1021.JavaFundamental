package Viktoriia.homework.hw3;

import java.util.Scanner;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = ((double)(side1 + side2 + side3)) / 2; //find semi-perimeter
        double squareArea = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.sqrt(squareArea);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        int first = scanner.nextInt();
        System.out.println("Enter second side of triangle:");
        int second = scanner.nextInt();
        System.out.println("Enter third side of triangle:");
        int third = scanner.nextInt();
        Triangle triangle = new Triangle(first, second, third);
        System.out.println("The area of the triangle is " + triangle.area());
        scanner.close();
    }
}
