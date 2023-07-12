package homeworks.hw5.task1;

public class SumOrProduct {
	class Sum {
		static int getSum(int[] arr) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += arr[i];
			}
			return sum;
		}
	}

	class Product {
		static int getProduct(int[] arr) {
			int product = 1;
			for (int i = 0; i < 5; i++) {
				product *= arr[i];
			}
			return product;
		}
	}

	public static void processArray(int[] arr) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] <= 0) {
				System.out.println("first five elements were not all positive numbers");
				System.out.println("the product of the first five elements is: " + Product.getProduct(arr));
				break;
			} else {
				count++;
			}
		}
		if (count == 4) {
			System.out.println("first five elements all were positive numbers");
			System.out.println("the sum of the first five elements is: " + Sum.getSum(arr));
		}
	}
}