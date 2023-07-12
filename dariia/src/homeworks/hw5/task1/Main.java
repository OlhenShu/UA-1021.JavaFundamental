package homeworks.hw5.task1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static private String[] options = { "[0 - exit]", "[1 - calculate number of days in month]",
			"[2 - calculate sum/product of first five integers of an array]", "[3 - process array of 5 integers]" };

	public static void main(String[] args) {
		while (true) {
			System.out.println("choose what you want to do:");
			for (String option : options) {
				System.out.println(option);
			}
			int choise = sc.nextInt();
			switch (choise) {
			case 0:
				System.out.println("exited with code status 0");
				System.exit(0);
			case 1:
				System.out.print("please, insert number of month: ");
				try {
					int monthNum = sc.nextInt();
					if (monthNum < 0 || monthNum > 12) {
						System.out.println("invalid month number! try again.");
					} else {
						MonthDays.calculateDays(monthNum);
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println("exception occured: " + e);
				}
				break;
			case 2:
				try {
					System.out.println("input your ten numbers for the array:");
					int[] arr = new int[10];
					int i = 0;
					while (i < 10) {
						int num = sc.nextInt();
						arr[i++] = num;
					}
					System.out.println("array: " + Arrays.toString(arr));
					SumOrProduct.processArray(arr);
					System.out.println();
				} catch (Exception e) {
					System.out.println("exception occured: " + e);
				}
				break;
			case 3:
				try {
					System.out.println("input your five numbers for the array:");
					int[] arr = new int[5];
					int i = 0;
					while (i < 5) {
						int num = sc.nextInt();
						if (num == 0) {
							System.out.println("no zeros allowed");
							continue;
						}
						arr[i++] = num;
					}
					System.out.println("array: " + Arrays.toString(arr));
					DeepProcessArray.deepProcess(arr);
					System.out.println();
				} catch (Exception e) {
					System.out.println("exception occured: " + e);
				}
				break;
			}
		}
	}
}