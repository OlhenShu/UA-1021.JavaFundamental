package edu13.pr;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

//Show which today is a day of a week
public class Task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Today is " + dayOfWeek);

       // System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("uk")));
    }
}
