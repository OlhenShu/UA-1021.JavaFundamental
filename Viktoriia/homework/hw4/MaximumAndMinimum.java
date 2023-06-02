package Viktoriia.homework.hw4;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static int maximum(int a, int b, int c) {
        int result = a;
        if (b > result) {
            result = b;
        }
        if (c > result) {
            result = c;
        }
        return result;
    }
    public static int minimum(int a, int b, int c) {
        int result = a;
        if (b < result) {
            result = b;
        }
        if (c < result) {
            result = c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        int third;
        System.out.println("Input first number:");
        first = scanner.nextInt();
        System.out.println("Input second number:");
        second = scanner.nextInt();
        System.out.println("Input third number:");
        third = scanner.nextInt();
        System.out.print("The maximum value of " + first + ", " + second + ", " + third + " is " + maximum(first,second,third));
        System.out.println(" and the minimum value is " + minimum(first,second,third));
    }
}
