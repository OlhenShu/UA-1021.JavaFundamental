package pt13;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task4 {
    static int count(ArrayList<Integer> array, Predicate<Integer> condition) {
        int result = 0;
        for (Integer element: array) {
            if (condition.test(element)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Predicate<Integer> moreThenZero = n -> n > 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> amount = n -> true;
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(5);
        test.add(0);
        test.add(-12);
        test.add(4);
        test.add(-5);
        System.out.println("Array: " + test);
        System.out.println("Contain " + Task4.count(test, moreThenZero) + " elements more than 0");
        System.out.println("Contain " + Task4.count(test, isOdd) + " odd elements");
        System.out.println("Contain " + Task4.count(test, amount) + " elements in total");
     }
}
