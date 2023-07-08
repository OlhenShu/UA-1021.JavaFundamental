package hw13;

import java.time.Year;

public class Task3 {
    static boolean isLeapYear(Year year) {
        int y = year.getValue();
        return y % 4 == 0;
    }

    public static void main(String[] args) {
        Year y1 = Year.now();
        Year y2 = Year.of(2008);  // true
        Year y3 = Year.of(2021);  // false
        Year y4 = Year.of(2018);  // false
        Year y5 = Year.of(2024);  // true
        System.out.println(isLeapYear(y1));
        System.out.println(isLeapYear(y2));
        System.out.println(isLeapYear(y3));
        System.out.println(isLeapYear(y4));
        System.out.println(isLeapYear(y5));
    }
}
