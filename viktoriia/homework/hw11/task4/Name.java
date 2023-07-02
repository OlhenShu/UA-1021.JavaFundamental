package hw11.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    private String name;
    private static String[] greetingMessages = {"Hello, ", "Good evening, ", "Hi, ", "Good morning, ", "Hey, ", "Good afternoon, "};
    static Scanner scanner = new Scanner(System.in);

    public Name() {
        Pattern p = Pattern.compile("[A-Z][a-z]*((\\-[A-Z][a-z]*)?)");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        Matcher m = p.matcher(firstName);
        while (!m.matches()) {
            System.out.println("Invalid name, please, enter again: ");
            firstName = scanner.nextLine();
            m = p.matcher(firstName);
        }
        System.out.println("Now, enter your last name: ");
        String lastName = scanner.nextLine();
        m = p.matcher(lastName);
        while (!m.matches()) {
            System.out.println("Invalid last name, please, enter again: ");
            lastName = scanner.nextLine();
            m = p.matcher(lastName);
        }
        this.name = firstName.concat(" ").concat(lastName);
    }

    public void greeting() {
        Random random = new Random();
        int greet = random.nextInt(greetingMessages.length);
        String format = greetingMessages[greet].concat("%s");
        System.out.printf(format, this.name);
    }
}
