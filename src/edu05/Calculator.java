package edu05;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if(b ==0){
            throw  new IllegalArgumentException("Div by zero is not allowed");
        }
        return a / b;
    }
}
