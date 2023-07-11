package hw5.task1;

public class DeepProcessArray {
	protected static int findSecondPositive(int[] arr) {
		int count = 0;
		int i = 2;
		
		while (i != 0) {
			if (arr[i] > 0) {
				count++;
				i--;
			} else {
				count++;
			}
		}
		
		if ((i <= 2 && i > 0) && (count == (arr.length - 1))) {
			System.out.println("there is only one positive number");
		} else if (i == 0 && count <= (arr.length - 1)) {
			System.out.println("position of second positive number: " + count + " (number = " + arr[count] + ")");
			return count;
		}
		return count;
	}

	protected static int minVal(int[] arr) {
		int minVal = 0;
		int count = 0;
		for (int element : arr) {
			if (element < minVal) {
				minVal = element;
				count++;
			}
		}
		return minVal;
	}

	protected static int evenProduct(int[] arr) {
		int product = 1;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				product *= arr[i];
			}
			i++;
		}
		System.out.println("product of all even numbers: " + product);
		return product;
	}

	public static void deepProcess(int[] arr) {
		findSecondPositive(arr);
		System.out.println("minimum value of array is: " + minVal(arr));
		evenProduct(arr);
	}
}
