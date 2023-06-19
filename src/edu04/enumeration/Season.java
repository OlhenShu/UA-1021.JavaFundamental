package edu04.enumeration;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public Season nextSeason() {
        if (this == Season.WINTER) return SPRING;
        if (this == Season.SPRING) return SUMMER;
        if (this == Season.SUMMER) return Season.AUTUMN;
        return Season.WINTER;
    }
}

class Demo {
    public static void main(String[] args) {
        String month = "December";

        Season season = Season.WINTER;

        switch (month) {
            case "Deсember", "January", "February" -> season = Season.WINTER;
            case "Marth", "April", "May" -> season = Season.SPRING;
            case "June", "Jule", "August" -> season = Season.SUMMER;
            case "September", "October", "November" -> season = Season.AUTUMN;
            default -> System.out.println("No this month");
        }
    }
}