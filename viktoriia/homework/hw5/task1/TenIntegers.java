package hw5.task1;

import java.util.Scanner;

public class TenIntegers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter the number:");
        numbers[0] = scanner.nextInt();
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter one more number:");
            numbers[i] = scanner.nextInt();
        }
        int result = 0;
        boolean firstFivePositive = true;
        for(int i = 0; i < 5; i++) {
            if(numbers[i] <= 0){
                result = 1;
                firstFivePositive = false;
                break;
            }
            result+= numbers[i];
        }
        if(!firstFivePositive) {
            for(int i = 5; i < numbers.length; i++) {
                result*= numbers[i];
            }
        }
        System.out.println(result);
    }
}
