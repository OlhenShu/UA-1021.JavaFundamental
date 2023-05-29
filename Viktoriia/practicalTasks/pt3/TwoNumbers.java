package Viktoriia.practicalTasks.pt3;

import java.util.Scanner;

public class TwoNumbers {

    static int one;
    static int two;
    public static int getTotal() {
        return one + two;
    }

    public static double getAverage() {
        return ((double) one + two) / 2;
    }

    public static void getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        one = scanner.nextInt();
        System.out.println("Enter the second number: ");
        two = scanner.nextInt();
    }

    public static void main(String[] args) {
        getNumber();
        System.out.println("The sum of " + one + " and " + two + " is " + getTotal());
        System.out.println("The average of " + one + " and " + two + " is " + getAverage());
    }
}
