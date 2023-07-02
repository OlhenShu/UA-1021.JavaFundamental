package hw11.task2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a sentence with consecutive spaces: ");
        String toChange = scanner.nextLine();
        String changed = toChange.replaceAll("[ ]{2,}", " ");
        System.out.println(changed.trim());
    }
}
