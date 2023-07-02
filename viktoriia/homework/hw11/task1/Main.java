package hw11.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentencePattern = "[A-Z]?[a-z]*\\s[a-z]+\\s[a-z]+\\s[a-z]+\\s[a-z]+\\.?\\s?";
        Pattern p = Pattern.compile(sentencePattern);
        System.out.println("Write a sentence of 5 words: ");
        String sentence = scanner.nextLine();
        Matcher m = p.matcher(sentence);
        while (!m.matches()) {
            System.out.println("This sentence has more or less than 5 words \nPlease, write another one: ");
            sentence = scanner.nextLine();
            m = p.matcher(sentence);
        }
        SentenceOf5Words sent = new SentenceOf5Words(sentence);
        System.out.println("The longest word in the sentence is '" + sent.theLongestWord() + "'");
        System.out.println("It contains " + sent.sizeOfTheLongest() + " letters");
        System.out.println("Reversed second word in the sentence '" + sent.reverseSecond() + "'");
    }
}
