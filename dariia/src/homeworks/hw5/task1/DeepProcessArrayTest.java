package homeworks.hw5.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeepProcessArrayTest {
	protected int[] testArray = { 7, -3, -8, 2, 9, 1, 18, 11, 4, 10 };

	@Test
	void testFindSecondPositive() {
		int expectedPosition = 3;
		assertEquals(expectedPosition, DeepProcessArray.findSecondPositive(testArray));
	}

	@Test
	void testMinVal() {
		int expectedMinVal = -8;
		assertEquals(expectedMinVal, DeepProcessArray.minVal(testArray));
	}

	@Test
	void testEvenProduct() {
		int expectedProduct = -11520;
		assertEquals(expectedProduct, DeepProcessArray.evenProduct(testArray));
	}

}
