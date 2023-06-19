package edu04;

public class ExampleFirst {
    public static void main(String[] args) {
        int x = 5;
        int a = x++ + ++x + ++x + x++;
        System.out.println(a);
    }
}
