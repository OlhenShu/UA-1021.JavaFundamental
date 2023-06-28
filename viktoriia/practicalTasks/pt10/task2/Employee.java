package pt10.task2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee{
    private String name;
    private String position;
    private int salary;
    private LocalDate dateOfBirth;

    public Employee(String name, String position, int salary, LocalDate dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ", position: " + position + ", salary: " + salary + ", dateOfBirth: " + dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateOfBirth);
    }
}
