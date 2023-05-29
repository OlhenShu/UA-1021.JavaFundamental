package Viktoriia.homework.hw1;

import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;
        System.out.println("\nWhats you name?");
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
        System.out.println("Your name is " + name + ". Your address is " + address);
        scanner.close();
    }
}
