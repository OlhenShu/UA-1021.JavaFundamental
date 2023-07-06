package hw12.task1;

import java.util.*;

public class Main {

	public static int divInt(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is forbidden!");
		}
		if (num2 == 0) {
			return 0;
		} else {
			return result;
		}

	}

	public static double divDouble(double num1, double num2) {
		double result = 0;
		try {
			result = (double) num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is forbidden!");
		}
		if (num2 == 0) {
			return 0;
		} else {
			return result;
		}
	}

	private static void chooseFunc() {
	    System.out.println("choose what you want to do: \n[0 - exit program]\n[1 - divide integers]\n[2 - divide doubles]");
	    int answer1 = 0;
	    try {
	        answer1 = sc.nextInt();
	    } catch (InputMismatchException e) {
	        System.out.println("You cannot use something else except for numbers!");
	        sc.nextLine(); 
	        return;
	    }
	    switch (answer1) {
	        case 0:
	            System.out.println("Exiting with code status 0");
	            System.exit(0);
	        case 1:
	            int num1 = 0;
	            int num2 = 1;
	            try {
	                System.out.print("num1 = ");
	                num1 = sc.nextInt();
	                System.out.print("num2 = ");
	                num2 = sc.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("You cannot use something else except for numbers!");
	                sc.nextLine(); 
	                break;
	            }
	            System.out.println("result = " + divInt(num1, num2));
	            break;
	        case 2:
	            System.out.println("(insert number using comma, for example: 1,234)");
	            double numd1 = 0;
	            double numd2 = 1;
	            try {
	                System.out.print("num1 = ");
	                String input1 = sc.next();
	                numd1 = Double.parseDouble(input1.replace(',', '.'));
	                System.out.print("num2 = ");
	                String input2 = sc.next();
	                numd2 = Double.parseDouble(input2.replace(',', '.'));
	            } catch (NumberFormatException e) {
	                System.out.println("You cannot use something else except for numbers!");
	                sc.nextLine(); 
	                break;
	            }
	            double res = divDouble(numd1, numd2);
	            System.out.printf("result = %.2f\n", res);
	            break;
	        default:
	            System.out.println("Wrong command, try again.");
	            break;
	    }
	}


	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("choose what you wnat to do: \n[0 - exit]\n[1 - divide two numbers]");
			int answer = 0;
			try {
				answer = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You cannot use something else except for numbers!");
				sc.nextLine();
				continue;
			}
			switch (answer) {
			case 0:
				System.out.println("Exiting with code status 0");
				System.exit(0);
			case 1:
				chooseFunc();
				break;
			default:
				System.out.println("Wrong command, try again.");
				break;
			}
		}

	}

}
