package hw11;

import java.util.*;
import java.util.regex.*;

public class Task4 {

	private static Scanner sc = new Scanner(System.in);
	
	private static void chooseGreeting() {
		String regex = "^[A-Za-z -]+$";
		System.out.println("Please input your first name:");
		String firstName = sc.nextLine();
		if (checkNamePattern(firstName, regex) == false) {
			System.out.println("Restart and try again!");
			return;
		}
		System.out.println("Please input your last name:");
		String lastName = sc.nextLine();
		if (checkNamePattern(lastName, regex) == false) {
			System.out.println("Restart and try again!");
			return;
		}
		
		String[] greetings = {"Hello, %s!", "Hi there, %s!", "Hey, %s!", "Greetings, %s!"};

        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);
        String randomGreeting = greetings[randomIndex];
        System.out.printf(randomGreeting, firstName);
	}

	private static boolean checkNamePattern(String name, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static void main(String[] args) {
		chooseGreeting();

	}

}
