package edu05;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        //sum
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        //System.out.println("Sum is " + sum);

        //product
        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                product *= arr[i];
            }
        }
        //  System.out.println("Product is " + product);

        //amount

        int amount = 0;
        for (int k : arr) {
            if (k > 3 && k < 8) {
                amount++;
            }
        }
        System.out.println("Amount is " + amount);
    }
}
