package pt13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek todayDay = today.getDayOfWeek();
        String todayStr = todayDay.name().substring(0,1);
        todayStr = todayStr
                .concat(todayDay.name()
                        .toLowerCase().substring(1));
        System.out.println("Today is " + todayStr);
    }
}
