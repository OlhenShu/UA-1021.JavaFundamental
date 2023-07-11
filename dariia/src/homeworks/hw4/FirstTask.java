package hw4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

enum HTTPError {
	INFORMATIONAL_RESPONSE, SUCCESS, REDIRECTON, CLIENT_ERRORS, SERVER_ERRORS, UNOFFICIAL_CODES, UNDEFINED;
}

class FirstTask {
	static Scanner sc = new Scanner(System.in);
	float num = sc.nextFloat();
	static List<String> options = new ArrayList<String>(List.of("[0 - exit]",
			"[1 - check if number belongs to the range [-5; 5]]", "[2 - find max and min value out of three]",
			"[3 - classify your HTTP error]", "[4 - work with products]"));

	// 1. Input three float numbers and check: are they all belong to the range [-5,
	// 5]
	private static String checkNum(float num) {
		String result = "";
		try {
			if (num < -5 || num > 5) {
				result = (num + " doesn't belong to the range [-5; 5]");
			} else {
				result = (num + "belongs to the range [-5; 5]");
			}
		} catch (Exception exception) {
			result = ("Error occured:\n" + exception);
		}
		return result;
	}

	// 2. Input three integer numbers and and output the maximum and minimum values
	// of them to the console.
	private static void finaMinAndMax(int num1, int num2, int num3) {
		int maxValue = Math.max(Math.max(num1, num2), num3);
		int minValue = Math.min(Math.min(num1, num2), num3);
		System.out.println("The max value is: " + maxValue + "\nThe min value is: " + minValue);
	}

	// 3. Input a number representing an HTTP error (such as 400, 401, 402, etc.)
	// and output the name of the error using an enum called HTTPError.
	private static void getHttpError(int errorNumber) {
		HTTPError httpError;

		try {
			httpError = switch (errorNumber) {
			case 100, 101, 102, 103 -> HTTPError.INFORMATIONAL_RESPONSE;
			case 200, 201, 202, 203, 204, 205, 206, 207, 208, 226 -> HTTPError.SUCCESS;
			case 300, 301, 303, 304, 305, 306, 307, 308 -> HTTPError.REDIRECTON;
			case 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 421,
					422, 423, 424, 425, 426, 428, 429, 431, 451 ->
				HTTPError.CLIENT_ERRORS;
			case 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, 511 -> HTTPError.SERVER_ERRORS;
			case 419, 420, 430, 450, 498, 499, 509, 529, 530, 598, 599 -> HTTPError.UNOFFICIAL_CODES;
			default -> HTTPError.UNDEFINED;
			};
			System.out.println("your error type: " + httpError);
		} catch (Exception exception) {
			System.out.println("Error occured:\n" + exception);
		}

	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Choose what you want to do: ");
			for (String option : options) {
				System.out.println(option);
			}
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("[turning off]");
				System.exit(0);
			case 1:
				System.out.println("please input your number: ");
				float num = sc.nextFloat();
				System.out.println(checkNum(num));
				break;
			case 2:
				System.out.println("input three integers to be compared: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				finaMinAndMax(num1, num2, num3);
				break;
			case 3:
				System.out.println("input your error number to clasify it: ");
				int errorNum = sc.nextInt();
				getHttpError(errorNum);
				break;
			case 4:
				//
			default:
				System.out.println("not a command, try again");
			}
		}
	}
}