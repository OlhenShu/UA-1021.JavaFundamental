package edu05.practical;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1
        String[] stringArray = {"apple", "orange", "pinapple", "banana", "cherry"};
        //  System.out.println(Arrays.toString(stringArray));

        Arrays.sort(stringArray);
        //  System.out.println("Sorted array: " + Arrays.toString(stringArray));

        //2
        int[] numberArray = {10, 5, 7, 13, 18};
        int sum = 0;
        for (int numbers : numberArray) {
            sum += numbers;
        }
        double average = (double) sum / numberArray.length;

        //System.out.println("Average is: " + average);
        //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int searchValue = scanner.nextInt();

        boolean containsValue = false;
        for (int numbers : numberArray) {
            if (numbers == searchValue) {
                containsValue = true;
                break;
            }
        }
        System.out.println("Array contains value:" + containsValue);

        // boolean containsValue = Arrays.asList(numberArray).contains(searchValue);
        scanner.close();
    }

}
