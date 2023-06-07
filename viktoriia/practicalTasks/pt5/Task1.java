package pt5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    static String[] strings = {"umbrella", "apple", "fire", "application", "bee", "domino", "1", "5"};
    static int[] values = {2, 7, 146, 84, 1};
    public static void main(String[] args) {
        Arrays.sort(strings);
        System.out.println("Sorted string array: " + Arrays.toString(strings));
        int sum = 0;
        for (int el: values) {
            sum+= el;
        }
        int average = sum / values.length;
        System.out.println("The average value of int array: " + average);
        System.out.println("Input search value:");
        Arrays.sort(values);
        boolean isInteger = scanner.hasNextInt();
        boolean valueFound = false;
        if (!isInteger) {
            String searched = scanner.nextLine();
            for (String str: strings) {
                if (str.equals(searched)) {
                    valueFound = true;
                }
            }
        } else {
            int search = scanner.nextInt();
            int resultInt = Arrays.binarySearch(values, search);
            if (resultInt >= 0) {
                valueFound = true;
            }
            String searchStr = Integer.toString(search);
            for (String str: strings) {
                if (str.equals(searchStr)) {
                    valueFound = true;
                }
            }
        }
        if (valueFound) {
            System.out.println("Searched value present in one of arrays");
        } else {
            System.out.println("Searched value not found");
        }
    }
}
