package hw5.task4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	static Scanner sc = new Scanner(System.in);

	static void guessGame() {
		Random rd = new Random();
		int num = -1;
		int numToGuess = rd.nextInt(21);
		System.out.println("Now, I randomly generated a number from 0 to 20. Guess what it is!");

		while (num != numToGuess) {
			try {
				System.out.print("Type your choise (-1 to exit game): ");
				num = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Oops! Something went wrong, try again!");
				sc.nextLine();
				continue;
			}
			if (num == numToGuess) {
				System.out.println("Your guess is correct! The answer was " + numToGuess);
				break;
			} else if (num == -1) {
				System.out.println("The answer was " + numToGuess);
				System.out.println("Exiting with code status 0");
				System.exit(0);
			} else if (num > numToGuess) {
				System.out.println("Too high, try again!\n");
			} else if (num < numToGuess) {
				System.out.println("Too low, try again!\n");

			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Game: 'Guess the number!'");
		while (true) {
			System.out.println("Do you want to play? [yes/no]");
			String input;
			input = sc.nextLine();
			switch (input.toLowerCase()) {
			case "no":
				System.out.println("Exiting with code status 0");
				System.exit(0);
				break;
			case "yes":
				guessGame();
				break;
			default:
				System.out.println("Wrong command, mate.");
				break;
			}
		}
	}
}