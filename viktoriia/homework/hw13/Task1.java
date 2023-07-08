package hw13;

import java.util.function.Function;

public class Task1 {
    static String encrypt(String s, int n) {
        String[] string = s.split("");
        Function<String, Character> stringToChar= (c) -> c.charAt(0);
        char[] charOfString = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            charOfString[i] = (char) (stringToChar.apply(string[i]) + n);
        }
        return new String(charOfString);
    }

    static String decrypt(String s, int n) {
        String[] string = s.split("");
        Function<String, Character> stringToChar= (c) -> c.charAt(0);
        char[] charOfString = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            charOfString[i] = (char) (stringToChar.apply(string[i]) - n);
        }
        return new String(charOfString);
    }

    public static void main(String[] args) {
        String s = "abc";
        int n = 3;
        String e = encrypt(s, n);
        String d = decrypt(e, n);
        System.out.println("Original: " + s);
        System.out.println("Encrypted: " + e);
        System.out.println("Decrypted: " + d);
    }
}
