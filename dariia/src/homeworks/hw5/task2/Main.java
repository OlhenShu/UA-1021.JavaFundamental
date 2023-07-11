package hw5.task2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static int addNumbers(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		String answer;
		do {
			System.out.println("Do you want to calculate sum of two numbers? (yes/no)");
			answer = sc.nextLine();
			if (answer.toLowerCase().equals("no")) {
				System.out.println("Exited with code status 0");
				System.exit(0);
			} else if (answer.toLowerCase().equals("yes")) {
				System.out.println("Input two integers: ");
				int result = addNumbers(sc.nextInt(), sc.nextInt());
				sc.nextLine();
				System.out.println("Sum is: " + result);
			}
		} while (true);
	}
}