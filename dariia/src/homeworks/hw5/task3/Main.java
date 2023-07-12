package homeworks.hw5.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	// the algorithm below was inspired by some Internet resource
	// push all duplicates to the end
	// cut off all duplicates by pushing all origin elemments to the new array
	static int[] deleteDuplicates(int[] arr, int arrayLength) {
		if (arrayLength == 0 || arrayLength == 1) {
			return arr;
		}
		int[] temp = new int[arrayLength];
		int lastOrigin = 0;
		for (int i =0; i < arrayLength - 1; i++) {
			if(arr[i] != arr[i+1]) { 
			temp[lastOrigin++] = arr[i];
			}
		}
		
		temp[lastOrigin++] = arr[arrayLength-1];
		
		for (int i = 0; i < lastOrigin; i++) {
			arr[i] = temp[i];
		}
		
		int[] newArr = new int[arrayLength - lastOrigin];
		System.arraycopy(arr, 0, newArr, 0, lastOrigin);
		
		// "new" length
		return newArr;
		
		// my own try on implementing remove of duplicates and resizing array, 
		// but it only works once and finds only one pair of duplicates
		// so i'm still working on it
		
//		int[] sortedArray;
//		int itemToDelete;
//		int indexToDelete = -1;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length - 1; j++) {
//				if (arr[i] == arr[j]) {
//					itemToDelete = arr[j];
//					indexToDelete = j;
//					// System.out.println("itemToDelete = " + itemToDelete + "[" + indexToDelete +
//					// "]");
//				}
//			}
//		}
//		if (indexToDelete != -1) {
//			for (int j = indexToDelete; j < arr.length - 1; j++) {
//				arr[j] = arr[j + 1];
//				// System.out.println("arr[j] = " + arr[j] + "\narr[j+1] = " + arr[j + 1]);
//			}
//			sortedArray = new int[arr.length - 1];
//			System.arraycopy(arr, 0, sortedArray, 0, arr.length - 1);
//			arr = sortedArray;
//		}
//		System.out.println("after deleting duplicates: " + Arrays.toString(arr));
//		return arr;
	}

	static int[] sortYears(Car[] arr) {
		int[] years = new int[arr.length];
		int i = 0;
		// get year data to the new local array
		for (Car car : arr) {
			years[i++] = car.getYearOfProduction();
		}
		// sort it ( bubble sort )
		int tmp;
		int count = years.length;
		for (int j = 0; j < count - 1; j++) {
			for (int k = j + 1; k < count; k++) {
				if (years[j] > years[k]) {
					tmp = years[j];
					years[j] = years[k];
					years[k] = tmp;
				}
			}
		}
		return years;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", 2003, 6);
		Car car2 = new Car("Suzuki", 2004, 4);
		Car car3 = new Car("Nissan", 2005, 3);
		Car car4 = new Car("Isuzu", 2003, 5);
		Car car5 = new Car("Isuzu2", 2003, 5);
		Car car6 = new Car("Nissan2", 2005, 3);

		Car[] cars = { car1, car2, car3, car4, car5, car6 };

		// 1
//		System.out.println("please, type which year is to your taste: [2003, 2004, 2015]");
//		int year = sc.nextInt();
//		for (Car car : cars) {
//			if (car.getYearOfProduction() == year) {
//				System.out.println(car.getType() + " (" + car.getYearOfProduction() + ")");
//			}
//		}

		// 2
		int[] sortedYears = sortYears(cars);
		// + delete duplicates
		sortedYears = deleteDuplicates(sortedYears, sortedYears.length);
//		System.out.println(Arrays.toString(sortedYears));
		System.out.println("\nsorted cars by their year of production: ");
		int count = 0;
		int currYear;
		do {
			currYear = sortedYears[count++];
			for (Car car : cars) {
				if (car.getYearOfProduction() == currYear) {
					System.out.println(car.getType() + " (" + car.getYearOfProduction() + ")");
				}
			}
		} while (count < sortedYears.length);
	}
}