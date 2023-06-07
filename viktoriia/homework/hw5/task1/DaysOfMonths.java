package hw5.task1;

import java.util.Scanner;

public class DaysOfMonths {
    private static int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static Scanner scanner = new Scanner(System.in);
    public static int daysInMonth(int month) {
        return numberOfDays[month-1];
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of month: ");
        int month = scanner.nextInt();
        while (month <= 0 || month > 12) {
            System.out.println("Such month does not exist enter the right number of month:");
            month = scanner.nextInt();
        }
        System.out.println("There are " + daysInMonth(month) + " days in " + month + "th month");
    }
}
