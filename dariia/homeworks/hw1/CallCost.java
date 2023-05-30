package hw1;

import java.util.Scanner;

public class CallCost {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Please, insert three costs of calls for each country per minute (use integer type of data): ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        System.out.println("Please, insert three time durations of calls for each country (minutes, integer): ");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        int total1 = c1*t1;
        int total2 = c2*t2;
        int total3 = c3*t3;

        int totalAll = total1 + total2 + total3;

        System.out.println("total bill for first call is "+total1);
        System.out.println("total bill for second call is "+total2);
        System.out.println("total bill for third call is "+total3);
        System.out.println("total for all three calls is "+totalAll);
    }
}
