package hw11;

import java.util.*;

public class Task2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Input a sentence:");
		String sentence = "";
		try {
			sentence = scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Only string is allowed!");
			return;
		}

		String modifiedSentence = replaceConsecutiveSpaces(sentence);
		System.out.println("Modified sentence: [" + modifiedSentence + "]");
	}

	public static String replaceConsecutiveSpaces(String sentence) {
		return sentence.replaceAll("\\s+", " ").trim(); // \\s+ = any amount of white spaces
	}

}
