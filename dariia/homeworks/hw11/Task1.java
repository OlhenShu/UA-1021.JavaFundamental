package hw11;

import java.util.*;

public class Task1 {

	private static Scanner sc = new Scanner(System.in);

	public static String reverseString(String string) {
		String newStr = "";
		char ch;
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			newStr = ch + newStr;
		}
		return newStr;
	}

	public static void main(String[] args) {
		System.out.println("input your sentence:");
		String[] words = sc.nextLine().split("[.,! ]");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		// 1 + 2
		System.out.println(
				"the longest word in your sentence is: " + longestWord + "\nits length: " + longestWord.length());

		// 3
		for (int i = 1; i < words.length; i++) {
			// starts with second element in array of words, but if it is empty, we move on
			// to next one
			// actual word
			if (words[i] != "") {
				System.out.print("origin word: " + words[i]);
				System.out.println(", reversed word: " + (reverseString(words[i])));
				break;
			}
		}

		System.out.println("words: " + Arrays.toString(words));

	}
}
