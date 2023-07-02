package pt11.task2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input first name: ");
        String firstN = scanner.nextLine();
        System.out.println("Input middle name: ");
        String middleN = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastN = scanner.nextLine();
        Name name = new Name(firstN, lastN, middleN);
        System.out.println(name.lastNameAndInitials());
        System.out.println(name.getFirstName());
        System.out.println(name.fullName());
    }
}
