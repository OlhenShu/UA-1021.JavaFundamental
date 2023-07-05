package edu14.pr;

//Suppose you have  next list
//    List<String> list = Arrays.asList("bla", "", "simp",
//    "", "second", "third", "third", "sec", "blablabla");
//    Print how many empty strings are in this list
//    Remove all empty Strings from list and print the result
//    Convert String to uppercase and Join them with coma. Print the result

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
   long empty = list.stream()
       .filter(str -> str.isEmpty())
           .count();
        System.out.println("Counts of empty strings: " + empty);
        long notEmpty = list.stream()
           // .filter(str -> !str.isEmpty())
            .filter(not(String:: isEmpty))
            .count();
        System.out.println("Counts of not empty strings: " + notEmpty);

        String upperCase = list.stream()
            .filter(not(String:: isEmpty))
            .map(String::toUpperCase)
            .collect(Collectors.joining("; ", "{", "}"));
        System.out.println("Uppercase strings joined with commas: " + upperCase);
    }

}
