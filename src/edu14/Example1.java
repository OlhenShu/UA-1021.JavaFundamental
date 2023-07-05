package edu14;

import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
      Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
        infiniteStream.limit(20).forEach(System.out::println);

        Stream<Double> randomNumbersStream = Stream.generate(Math::random);
    randomNumbersStream.limit(10).forEach(System.out::println);
    }
}
