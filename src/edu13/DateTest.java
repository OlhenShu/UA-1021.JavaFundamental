package edu13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTest {
    public static void main(String[] args) {
//        LocalDate past = LocalDate.now().plusWeeks(3).plus(3, ChronoUnit.CENTURIES);
//        System.out.println(past);
//        // prints all available timezone id
//        System.out.println(ZoneId.getAvailableZoneIds());
//        ZoneId zone1 = ZoneId.of("Europe/Kiev");
//        System.out.println(zone1.getRules());
//// ZoneRules[currentStandardOffset=+01:00]
//        ZoneId zone2 = ZoneId.of("Brazil/East");
//// ZoneRules[currentStandardOffset=-03:00]
//        System.out.println(zone2.getRules());
        LocalDateTime a = LocalDateTime.of(2023, 7, 31, 12, 01);
        LocalDateTime t = a.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(t);

    }
}
