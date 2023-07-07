package hw11;

import java.util.*;
import java.util.regex.*;

public class Task3 {

	private static Scanner sc = new Scanner(System.in);

	private static void findPattern(String text, String pattern) {
		String result = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			result = result + text.substring(m.start(), m.end()) + "\n";
		}
		if (result != "") {
			System.out.println("matches:\n" + result);
		} else {
			System.out.println("nothing found");
		}
	}

	public static void main(String[] args) {
		String pattern = "\\$\\d+\\.\\d{2}";
		System.out.println("input your text:");
		String text = sc.nextLine();
//		String testText = "During my shopping trip, I bought a new dress for $99.99, a pair of shoes for $49.95, and a handbag for $79.50. "
//				+ "The total cost of my purchases amounted to $229.44. Later, I went out for dinner and paid $35.75 for a delicious meal. "
//				+ "In total, I spent $265.19 for the day.";

		findPattern(text, pattern);

	}

}
