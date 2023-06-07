package hw5.task1;

import java.util.Scanner;

public class FiveIntegers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("Enter the number:");
        numbers[0] = scanner.nextInt();
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter one more number:");
            numbers[i] = scanner.nextInt();
        }
        int indexSecondPositive = 0;
        int count = 0;

        int minimum = numbers[0];
        int indexMinimum = 0;
        int product = 1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0 && count < 2) {
                indexSecondPositive = i;
                count++;
            }
            if(numbers[i] < minimum) {
                minimum = numbers[i];
                indexMinimum = i;
            }
            if(numbers[i] % 2 == 0 && numbers[i] != 0) {
                product*= numbers[i];
            }
        }
        if (count == 2) {
            System.out.println("Position of second positive number is " + (indexSecondPositive + 1));
        } else {
            System.out.println("There are " + count + " positive number");
        }
        System.out.println("The minimum value is " + minimum + " and its position is " + (indexMinimum + 1));
        System.out.println("The product of even numbers except 0 is " + product);
    }
}
