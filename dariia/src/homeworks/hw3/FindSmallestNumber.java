package hw3;

import java.util.Scanner;

class Triade {
	private int number1;
	private int number2;
	private int number3;

	public Triade(int number1, int number2, int number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	private int compareTwo(int num1, int num2) {
		int smallNum;
		if (num1 < num2) {
			smallNum = num1;
		} else {
			smallNum = num2;
		}
		return smallNum;
	}

	public int findSmallest() {
		int smallestNum = compareTwo(compareTwo(this.number1, this.number2), this.number3);
		return smallestNum;
	}
}

class FindSmallestNumber{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {		
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input third number: ");
		int num3 = sc.nextInt();
		
		Triade triade = new Triade(num1, num2, num3);
		System.out.print("The smallest number is: "+triade.findSmallest());
		
		
	}
}