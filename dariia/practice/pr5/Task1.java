package pr5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// 1
		String[] stringArray = { "apple", "orange", "pineapple", "banana", "cherry" };
		System.out.println(Arrays.toString(stringArray));
		Arrays.sort(stringArray);
		System.out.println("sorted: " + Arrays.toString(stringArray));

		// 2
		int[] numberArray = { 10, 5, 7, 13, 18 };
		int sum = 0;
		for (int num : numberArray) {
			sum += num;
		}
		double average = (double) sum / numberArray.length;
		System.out.println("average = " + average);

		// 3
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an integer number: ");
		int searchValue = scanner.nextInt();

		boolean containsValue = false;
		for (int number : numberArray) {
			if (number == searchValue) {
				containsValue = true;
				break;
			}
		}
		System.out.println("Array contains value: " + containsValue);
		
		// second option, faster one; instead of asList we can use listOf and not contains
//		boolean containsValue = Arrays.asList(numberArray).contains(searchValue);
//		System.out.println("Array contains value: " + containsValue);

		scanner.close();
	}
}