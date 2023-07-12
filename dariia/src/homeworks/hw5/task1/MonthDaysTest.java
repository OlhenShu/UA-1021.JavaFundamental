package homeworks.hw5.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthDaysTest {
	
	@Test
	void testCalculateDays() {
		assertEquals("30 (June)", MonthDays.calculateDays(6));
	}

}
