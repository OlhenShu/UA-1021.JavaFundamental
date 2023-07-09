package hw14.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static public Optional<String> mostPopularName(List<Employee> empls) {
        if (empls.isEmpty()) {
            return Optional.empty();
        }
        Map<String, Integer> names = empls.stream().collect(Collectors.toMap(Employee::getName, x -> 1, (em, emSame) -> em + 1));
        Map.Entry<String, Integer> name = null;
        for (Map.Entry<String, Integer> n: names.entrySet()) {
            if(name == null || name.getValue() < n.getValue()) {
                name = n;
            }
        }
        return Optional.ofNullable(name.getKey());
    }

    public static void main(String[] args) {
        List<Employee> empls = Arrays.asList(new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"));
        System.out.println(mostPopularName(empls));
    }
}
