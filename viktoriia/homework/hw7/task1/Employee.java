package hw7.task1;

public abstract class Employee implements Comparable<Employee> {
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}
