package hw12.task2;

import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static int readNumber(int start, int end) {
		System.out.println("Please enter a number between " + start + " and " + end + ":");
		int number;
		try {
			number = sc.nextInt();
			if (number < start || number > end) {
				throw new IllegalArgumentException("Number is not within the specified range.");
			}
		} catch (InputMismatchException e) {
			throw new IllegalArgumentException("Invalid input. Only integer numbers are supported.");
		} finally {
			sc.nextLine();
		}
		return number;
	}

	public static void main(String[] args) {
		int[] numbers = new int[10];

		try {
			int previousNumber = 1;
			for (int i = 0; i < numbers.length; i++) {
				int number = readNumber(previousNumber, 100);
				numbers[i] = number;
				previousNumber = number;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}

		System.out.println("Numbers: " + Arrays.toString(numbers));
	}

}
