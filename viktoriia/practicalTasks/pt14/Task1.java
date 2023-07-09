package pt14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long empty = list.stream().filter(String::isEmpty).count();
        System.out.println("Amount of empty strings is " + empty);
        List<String> notEmpty = list.stream().filter(not(String::isEmpty)).toList();
        System.out.println("List without empty strings: " + notEmpty);
        String inUpperCase = notEmpty.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("List in upper case: " + inUpperCase);
    }
}
