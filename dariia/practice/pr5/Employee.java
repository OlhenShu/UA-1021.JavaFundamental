package pr5;
// task 4

public class Employee{
	private String name;
	private int departmentNumber;
	private double salary;
	
	public Employee(String name, int departmentNumber, double salary) {
		super();
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}