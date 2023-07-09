package pt14;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Amount of elements: " + stats.getCount());
        System.out.println("Minimum value: " + stats.getMin());
        System.out.println("Maximum value: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
    }
}
