package edu05;

import java.util.Scanner;

public class Example2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Input number: ");
        for (int i = 0; i < 5; i++) {

            n = sc.nextInt();
            if (n < 0) {
                break;
            }
        }
        System.out.println("The last input number is " + n);


        int sum = 0;
        int number;
        System.out.print("Input 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            number = sc.nextInt();
            if (number < 0){
                continue;
            }
            sum += number;
        }
        System.out.println("Sum of numbers is " + sum);

        //sc.close();
    }
}
