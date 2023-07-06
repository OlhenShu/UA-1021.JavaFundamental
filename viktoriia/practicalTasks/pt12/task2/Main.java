package pt12.task2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter size of plant number " + (i + 1) + ":");
            int s = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter color of plant number " + (i + 1) + ":");
            String c = scanner.nextLine();
            System.out.println("Enter type of plant number " + (i + 1) + ":");
            String t = scanner.nextLine();
            try {
                Plant plant = new Plant(s, c, t);
                System.out.println(plant);
            } catch (IllegalArgumentException e) {
                System.out.println("Such plant can not exist");
            }
        }
    }
}
