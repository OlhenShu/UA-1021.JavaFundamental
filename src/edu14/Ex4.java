package edu14;

import edu05.Calculator;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("Alice", "Bob", "Charlie", "Dave");

//        strings.sorted(Comparator.comparing(String :: length))
//            .forEach(System.out::println);

        strings.map(String::length)
            .sorted()
            .forEach(System.out::println);
    }
}
