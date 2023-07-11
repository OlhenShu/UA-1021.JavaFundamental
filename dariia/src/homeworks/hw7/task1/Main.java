package hw7.task1;

import java.util.Arrays;

/*
 * Dariia Sokolovska
 * version 1.0
 */

public class Main {
	
	private static Employee[] reverse(Employee[] employees) {
	    Employee temp;
	    
	    for (int i = 0; i < employees.length / 2; i++) {
	        int j = employees.length - 1 - i;
	        temp = employees[i];
	        employees[i] = employees[j];
	        employees[j] = temp;
	    }
	    
	    return employees;
	}

	public static void main(String[] args) {
		Employee[] employees = { new SalariedEmployee("218-76-5430", "Bob", 130, 24),
				new ContractEmployee("12-3456789", "Sam", 600), new SalariedEmployee("684-59-2301", "Alice", 120, 25),
				new ContractEmployee("34-1256789", "Ron", 750),
				new SalariedEmployee("903-46-0274", "Taeson", 110, 30), };

		Arrays.sort(employees, Employee.getSalaryComparator());
		reverse(employees);
		
		for (Employee employee : employees) {
			employee.printInfo();
			System.out.println();
		}
	}

}