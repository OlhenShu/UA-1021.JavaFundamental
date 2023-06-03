package hw5.task3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void sortYears() {
		Car car1 = new Car("Toyota", 2005, 6);
		Car car2 = new Car("Suzuki", 2004, 4);
		Car car3 = new Car("Nissan", 2005, 3);
		Car car4 = new Car("Isuzu", 2003, 5);

		Car[] cars = { car1, car2, car3, car4 };
		int[] expected = {2003, 2004, 2005, 2005};
		
		assertArrayEquals(expected, Main.sortYears(cars));
	}
	
	@Test
	void deleteDuplicates() {
		int expected = 2;
		int[] actual = {2003, 2004, 2004,};
		int length = actual.length;
		
		assertEquals(expected, Main.deleteDuplicates(actual, length));
	}

}
