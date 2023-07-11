package pr5;

import java.util.Scanner;

public class EmployeeDemo {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee[] employees = { new Employee("Alice", 1, 4800), new Employee("Bob", 3, 350), new Employee("David", 2, 5400) };
		
		System.out.println("Entere department nmber");
		int searchDepartmentNumber = sc.nextInt();
		
		System.out.println("Employee(s) of department:" + searchDepartmentNumber);
		for (Employee em : employees) {
			if (em.getDepartmentNumber() == searchDepartmentNumber) {
				System.out.println(em.getName());
			}
		}
	}
}