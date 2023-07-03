package edu13.pr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        strings.sort(String::compareTo);

        System.out.println("Sorted strings: " + strings);
    }
}
