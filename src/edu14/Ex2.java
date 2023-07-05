package edu14;

import java.util.List;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = Stream.of("abc", "", "bc", "abcd", "", "jkl").toList();
        List<String> filtered = strings.stream()
                    .filter(string -> !string.isEmpty())
                    .toList();

        System.out.println(strings);
        System.out.println(filtered);
    }
}
