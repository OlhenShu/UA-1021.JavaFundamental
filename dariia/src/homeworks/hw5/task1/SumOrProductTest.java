package hw5.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOrProductTest {

	@Test
	void testProcessArray() {
		int[] testArray1 = {10, 5, 25, 15, 8, 20, 30, 12, 2, 28};
		int[] testArray2 = {-10, 15, -5, 20, 30, -25, 8, 18, 6, 0};
		
		int expectedSum = 63;
		int expectedProduct = 450000;
		
		assertEquals(expectedSum, SumOrProduct.Sum.getSum(testArray1));
		assertEquals(expectedProduct, SumOrProduct.Product.getProduct(testArray2));
	}

}
