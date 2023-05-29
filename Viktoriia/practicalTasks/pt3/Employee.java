package Viktoriia.practicalTasks.pt3;

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

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum+= (rate * hours);
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
        Employee one = new Employee("John", 35, 70);
        Employee two = new Employee(45, 40);
        Employee three = new Employee();
        System.out.println("The total salary of employees is " + totalSum);
    }
}
