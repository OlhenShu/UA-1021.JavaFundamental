package pt4;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of the day of the week:");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Вівторок");
                break;
            case 3:
                System.out.println("Wednesday, Середа");
                break;
            case 4:
                System.out.println("Thursday, Четвер");
                break;
            case 5:
                System.out.println("Friday, П'ятниця");
                break;
            case 6:
                System.out.println("Saturday, Субота");
                break;
            case 7:
                System.out.println("Sunday, Неділя");
                break;
            default:
                System.out.println("Day of the week with number " + number + " does not exist");
        }
    }
}
