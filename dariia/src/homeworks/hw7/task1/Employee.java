package hw7.task1;

import java.util.Comparator;

public abstract class Employee implements Payment {

	private String employeeId;
	protected String name;

	static SalaryComparator salaryComparator = new SalaryComparator();

	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	void printInfo() {
		System.out.println("Name: " + this.name + "\nEmployee ID: " + employeeId);
	}

	public static Comparator<Employee> getSalaryComparator() {
		return salaryComparator;
	}
}
