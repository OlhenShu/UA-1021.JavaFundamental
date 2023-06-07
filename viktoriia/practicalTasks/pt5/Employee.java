package pt5;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;
    static Scanner scanner = new Scanner(System.in);

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ", departmentNumber: " + departmentNumber +", salary: " + salary;
    }

    public static void main(String[] args) {
        Employee[] employees = {new Employee("Kate", 5, 2500),
                new Employee("Tom", 2, 3200),
                new Employee("John", 4, 3000),
                new Employee("Sally", 4, 2700),
                new Employee("Sam", 5, 1500)};
        System.out.println("Enter number of department of searched employees: ");
        int searchedDepartment = scanner.nextInt();
        for(Employee employee: employees) {
            if (employee.getDepartmentNumber() == searchedDepartment) {
                System.out.println(employee.toString());
            }
        }
        for(int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if(employees[j].getSalary() > employees[i].getSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Employees sorted by salary descending:");
        for(Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }

}
