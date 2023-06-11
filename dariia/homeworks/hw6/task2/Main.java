package hw6.task2;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Alice", 24, 2400.50);
		Developer dev = new Developer("Bob", 25, 2500.30, "Middle Java Developer");
		
		System.out.println(emp.report());
		System.out.println(dev.report());
	}

}
