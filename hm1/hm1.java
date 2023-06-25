package hm1;

import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус клумби: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Периметр клумби: " + perimeter);
        System.out.println("Площа клумби: " + area);
    }
}

