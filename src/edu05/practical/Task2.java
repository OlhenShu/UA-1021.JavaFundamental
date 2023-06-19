package edu05.practical;

import java.util.Scanner;
//while

//PrimeNumberChecker
public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

         if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
    public static boolean isPrime ( int number){
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
