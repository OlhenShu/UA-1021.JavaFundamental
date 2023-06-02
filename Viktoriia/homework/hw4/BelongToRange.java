package Viktoriia.homework.hw4;

import java.util.Scanner;

public class BelongToRange {
    private static final float min = -5;
    private static final float max = 5;
    public static boolean belong(float number) {
        if (number <= max && number >= min) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        float first;
        float second;
        float third;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        first = scanner.nextFloat();
        System.out.print("The number " + first);
        if (!belong(first)) {
            System.out.print(" not");
        }
        System.out.println(" belongs to range [" + min + "; " + max + "]");
        System.out.println("Input the second number:");
        second = scanner.nextFloat();
        System.out.print("The number " + second);
        if (!belong(second)) {
            System.out.print(" not");
        }
        System.out.println(" belongs to range [" + min + "; " + max + "]");
        System.out.println("Input the third number:");
        third = scanner.nextFloat();
        System.out.print("The number " + third);
        if (!belong(third)) {
            System.out.print(" not");
        }
        System.out.println(" belongs to range [" + min + "; " + max + "]");
        System.out.print("The numbers " + first + ", " + second + ", " + third);
        if (!belong(first) || !belong(second) || !belong(third)) {
            System.out.print(" not");
        }
        System.out.println(" belong to range [" + min + "; " + max + "]");
    }
}
