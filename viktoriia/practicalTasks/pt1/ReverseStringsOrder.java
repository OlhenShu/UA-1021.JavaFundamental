package pt1;

import java.util.Scanner;

public class ReverseStringsOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String first = scanner.nextLine();
        System.out.println("Enter second string:");
        String second = scanner.nextLine();
        System.out.println("Enter third string:");
        String third = scanner.nextLine();
        System.out.println("Result:");
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
        scanner.close();
    }


}
