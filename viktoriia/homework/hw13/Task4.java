package hw13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task4 {
    static void print(LocalDate birth) {
        LocalDate in6Month = birth.plus(6, ChronoUnit.MONTHS);
        LocalDate in12Month = birth.plus(12, ChronoUnit.MONTHS);
        DayOfWeek birthDay = birth.getDayOfWeek();
        DayOfWeek in6MonthDay = in6Month.getDayOfWeek();
        DayOfWeek in12MonthDay = in12Month.getDayOfWeek();
        System.out.println("Day of birthday falls on " + birthDay.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("In 6 month it was " + in6MonthDay.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("In 12 month it was " + in12MonthDay.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 12, 24);
        print(birthday);
    }
}
