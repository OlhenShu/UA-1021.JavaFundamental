package edu05;

import java.util.Arrays;

public class Ex5 {
    //Bubble sort
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};

        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print("Array is [ " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        int[] array = {2, -5, 8, -4, 7};
        int index = Arrays.binarySearch(array, 7);//not correct
        System.out.println("Position of element with value 7 is " + (index + 1));

        Arrays.sort(array);//example for method sort()
        int position = Arrays.binarySearch(array, 7);
        String elements = Arrays.toString(array);
        System.out.println("Array = " + elements);
        System.out.println("Position of element with value 7 is " + (position + 1));
    }
}
