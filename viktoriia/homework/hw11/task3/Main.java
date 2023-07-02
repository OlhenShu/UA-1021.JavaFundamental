package hw11.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
        List<String> UScurrencies = new ArrayList<>();
        System.out.println("Enter instance of US currency: ");
        String input = scanner.nextLine();
        Matcher m = p.matcher(input);
        if (m.matches()) {
            UScurrencies.add(input);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter one more: ");
            input = scanner.nextLine();
            m = p.matcher(input);
            if (m.matches()) {
                UScurrencies.add(input);
            }
        }
        System.out.println("Right inputted US currency: ");
        for (String currency: UScurrencies) {
            System.out.println(currency);
        }
    }
}
