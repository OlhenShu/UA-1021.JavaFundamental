package edu05;

import java.util.Scanner;

public class ReadFromConsole {
    public static int readNumberFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();
        return number;
    }
}
