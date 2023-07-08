package pt13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        TemporalAdjuster firstMonday = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate firstMonInMonth = today.with(firstMonday);
        String date = firstMonInMonth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("First Monday in current month is " + date);
    }
}
