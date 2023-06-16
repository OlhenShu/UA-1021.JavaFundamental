package hw6.task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Alice", 22, 32555.45),
                new Employee("Luka", 43, 44354.65),
                new Developer("Sarah", 33, 43444.65, "Average Java Developer"),
                new Developer("John", 28, 32945.73, "Average Python Developer"),
                new Employee("Kit", 27, 42748.94)};
        for (Employee employee: employees) {
            System.out.println(employee.report());
        }
    }
}
