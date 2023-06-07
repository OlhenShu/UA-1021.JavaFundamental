package pt5;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        } else {
            for(int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        int integer = scanner.nextInt();
        while (integer <= 0) {
            System.out.println("This integer is not positive! Please enter the positive integer: ");
            integer = scanner.nextInt();
        }
        if(isPrime(integer)) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }

    }
}
