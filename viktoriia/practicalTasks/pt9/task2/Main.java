package pt9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter set of integers: ");
        String input = scanner.nextLine();
        String[] nums = input.split(", ");
        LinkedList<Integer> numbers = new LinkedList<>();
        for (String number: nums) {
            if (!numbers.contains(Integer.parseInt(number))) {
                numbers.add(Integer.parseInt(number));
            }
        }
        System.out.println(numbers);
    }
}
