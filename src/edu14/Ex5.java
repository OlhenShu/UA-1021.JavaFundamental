package edu14;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 3);

        list.parallelStream().forEach(number ->
            System.out.println(
                number
                    + " "
                    + Thread.currentThread()
                    .getName()));

    }
}

