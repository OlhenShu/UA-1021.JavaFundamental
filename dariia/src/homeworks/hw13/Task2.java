package hw13;

import java.time.Year;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * Create a method to validate a date according to the format "mm.dd.yy".
 * Create a method that takes a year as a parameter and returns true if the year is a leap year.
 */

public class Task2 {
	
	public static boolean validateDateFormat(String date) {
		String pattern = "MM.dd.yy";
		try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
	}

	public static boolean isLeapYearCheck(int year) {
		Year y = Year.of(year);
		if (y.isLeap()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isLeapYearCheck(1900));	// true
		System.out.println(validateDateFormat("13.06.04")); // false
	}

}
