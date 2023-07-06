package edu11;

import java.util.Arrays;
import java.util.Locale;

public class Equals {
    public static void main(String[] args) {
//        String a = "a";
//        String A = "A";
//        System.out.println(a.compareToIgnoreCase(A));
//
//        var chars = "He[l]lo".split("[l]");
//        System.out.println(Arrays.toString(chars));

        Locale.setDefault(Locale.ROOT);
        var s = "PI = %.2f".formatted(3.141516);
        System.out.println(s);

    }
}
