package pt5;

import java.util.Arrays;
import java.util.Random;

public class RandomIntegers {
    static Random random = new Random();
    private int[] numbers = new int[10];

    public RandomIntegers() {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000) * (random .nextBoolean() ? -1 : 1);  //add a range 1000 to avoid out of range of integer value for sumPositive method
        }
    }

    public int theBiggest() {
        int biggest = numbers[0];
        for(int element: numbers) {
            if(element > biggest){
                biggest = element;
            }
        }
        return biggest;
    }

    public int sumOfPositive() {
        int sum = 0;
        for(int element: numbers) {
            if(element > 0){
                sum+= element;
            }
        }
        return sum;
    }

    public int countNegative() {
        int count = 0;
        for(int element: numbers) {
            if(element < 0){
                count++;
            }
        }
        return count;
    }

    public String morePositiveOrNegative() {
        int count = 0;
        for(int element: numbers) {
            if(element > 0){
                count++;
            }
        }
        if (count > countNegative()) {
            return "There are more positive values in the array.";
        } else if (count < countNegative()) {
            return "There are more negative values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }

    public static void main(String[] args) {
        RandomIntegers test = new RandomIntegers();
        System.out.println(Arrays.toString(test.numbers));
        System.out.println("The biggest: " + test.theBiggest());
        System.out.println("Sum of positive: " + test.sumOfPositive());
        System.out.println("Count negative: " + test.countNegative());
        System.out.println(test.morePositiveOrNegative());
    }
}
