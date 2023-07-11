package pr5;

import java.util.Scanner;

// prime number check
public class Task2 {
	static Scanner sc = new Scanner(System.in);

	public static boolean isPrime(int number) {
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

	public static void main(String[] args) {
		System.out.println("Input positive integer number: ");
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is prime number");
		} else {
			System.out.println(number + " is not prime number");
		}
	}
}