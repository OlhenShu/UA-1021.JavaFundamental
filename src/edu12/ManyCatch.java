package edu12;

public class ManyCatch {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int m = 3;
        int n = 0;
        try {
            int res = arr[m] / n;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.err.println("Division by zero or wrong array index");
        } catch (Exception e) {
            System.err.println("Something else...");
        }
        System.out.println("Some text");
    }
}
