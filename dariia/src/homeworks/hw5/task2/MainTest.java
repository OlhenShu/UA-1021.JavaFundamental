package homeworks.hw5.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

	@Test
	void testAddNumbers() {
		assertEquals(6, Main.addNumbers(1, 5));
	}

}
