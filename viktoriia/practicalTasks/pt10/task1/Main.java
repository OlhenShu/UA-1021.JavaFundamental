package pt10.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John");
        employeeMap.put(2, "Mary");
        employeeMap.put(3, "Sarah");
        employeeMap.put(4, "Tom");
        employeeMap.put(5, "Jacob");
        employeeMap.put(6, "Sam");
        employeeMap.put(7, "Bella");
        for (Map.Entry<Integer, String> empl: employeeMap.entrySet()) {
            System.out.println("Employee ID: " + empl.getKey() + ", employee name: " + empl.getValue());
        }
        System.out.println("Enter employee ID to find one: ");
        int searchedID = scanner.nextInt();
        if (employeeMap.containsKey(searchedID)) {
            System.out.println("You are search for " + employeeMap.get(searchedID));
        } else {
            System.out.println("There are no employee with ID " + searchedID);
        }
        scanner.nextLine();
        System.out.println("Enter employee name to find one: ");
        String searchedName = scanner.nextLine();
        if (employeeMap.containsValue(searchedName)) {
            for (Map.Entry<Integer, String> empl: employeeMap.entrySet()) {
                if (empl.getValue().equals(searchedName)) {
                    System.out.println("You are search for employee with ID " + empl.getKey());
                    // break; //do not use break to output all ID of employees with the same name
                }
            }
        } else {
            System.out.println("There are no employee with name " + searchedName);
        }
    }
}
