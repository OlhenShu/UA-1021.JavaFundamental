package edu04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = br.readLine();
        String result = switch (input.toLowerCase()) {
            case "yes", "maybe" -> "Great!";
            case "no" -> "Too bad!";
            default -> "Wrong!";
        };
        System.out.println(result);

    }
}
