package hw3;

import java.util.Scanner;

public class SmallestNumber {
    private int number1;
    private int number2;
    private int number3;

    public SmallestNumber(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int findTheSmallest() {
        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter third number: ");
        int third = scanner.nextInt();
        SmallestNumber group = new SmallestNumber(first, second, third);
        System.out.println("The smallest number is " + group.findTheSmallest());
        scanner.close();
    }
}
