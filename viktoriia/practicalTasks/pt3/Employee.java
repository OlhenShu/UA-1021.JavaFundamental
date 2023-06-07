package pt3;

import java.util.Scanner;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum = 0;

    public Employee() {
        totalSum+= (rate * hours);
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum+= (rate * hours);
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getSalary() {
        return rate * hours;
    }

    public String toString() {
        return "Employee info: name is " + name + ", rate is " + rate + "hours is " + hours + "salary is " + getSalary();
    }

    public int getBonuses() {
        return getSalary() / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emplName;
        int emplRate;
        int emplHours;
        System.out.println("Enter name of first employee:");
        emplName = scanner.nextLine();
        System.out.println("Enter rate of first employee:");
        emplRate = scanner.nextInt();
        System.out.println("Enter hours of first employee:");
        emplHours = scanner.nextInt();
        Employee one = new Employee(emplName, emplRate, emplHours);
        System.out.println("Enter name of second employee:");
        emplName = scanner.nextLine();
        System.out.println("Enter rate of second employee:");
        emplRate = scanner.nextInt();
        System.out.println("Enter hours of second employee:");
        emplHours = scanner.nextInt();
        Employee two = new Employee(emplName, emplRate, emplHours);
        System.out.println("Enter name of third employee:");
        emplName = scanner.nextLine();
        System.out.println("Enter rate of third employee:");
        emplRate = scanner.nextInt();
        System.out.println("Enter hours of third employee:");
        emplHours = scanner.nextInt();
        Employee three = new Employee(emplName, emplRate, emplHours);
        System.out.println("The total salary of employees is " + totalSum);
    }
}
