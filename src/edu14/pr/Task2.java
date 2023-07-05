package edu14.pr;
//For given collection 	List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//    calculate count, min, max, sum, for numbers and print all results

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {

        var primes = IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stat = primes.summaryStatistics();

//        System.out.println("Count: " + stat.getCount());
//        System.out.println("Min: " + stat.getMin());
//        System.out.println("Max: " + stat.getMax());
//        System.out.println("Sum: " + stat.getSum());
//        System.out.println("Average: " + stat.getAverage());

        List<Integer> primes1 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        Optional<Integer> max = primes1.stream()
                .max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Maximum: " + value));

        int sum = primes1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
    }
}
