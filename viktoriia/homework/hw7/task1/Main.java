package hw7.task1;

import hw7.task2.Car;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new SalariedEmployee("192", "John", 20, 154, "3949"),
                new SalariedEmployee("475", "Tom", 28, 170, "49939"),
                new ContractEmployee("945", "Hannah", 3298, "4959"),
                new SalariedEmployee("934", "Sem", 22, 161, "3495"),
                new ContractEmployee("783", "Kate", 4395, "94384")};
        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if(employees[i].compareTo(employees[j]) < 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
