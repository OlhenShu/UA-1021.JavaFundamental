package edu13;

import java.util.Scanner;
import java.util.function.Function;


public class TestFunction {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int celsius = sc.nextInt();

        Function<Integer, Double> centigradeToFahrenheitInt =
            x -> Double.valueOf((x * 9.0 / 5) + 32);

        double fahrenheit = centigradeToFahrenheitInt.apply(celsius);

        System.out.println(fahrenheit);

// String to an integer
        String input = "123456";
       // Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        Function<String, Integer> stringToInt = Integer::valueOf;

        int result = stringToInt.apply(input);
        System.out.println("Result: " + result);


    }
}
