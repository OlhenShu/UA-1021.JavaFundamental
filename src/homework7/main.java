package homework7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Інтерфейс Оплата
interface Payment {
    double calculatePay(); // Метод для розрахунку заробітної плати
}

// Базовий абстрактний клас Працівник
abstract class Employee {
    private String employeeId; // Ідентифікатор працівника

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    // Абстрактний метод, який буде реалізовано в дочірніх класах
    public abstract double calculatePay(); // Розрахунок заробітної плати
}

// Клас Працівник з фіксованою заробітною платою
class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber; // Номер соціального страхування

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        // Фіксований місячний оклад для працівників з фіксованою оплатою праці
        return 5000; // Замініть на власний розрахунок
    }
}

// Клас Працівник з погодинною оплатою
class ContractEmployee extends Employee implements Payment {
    private String federalTaxId; // Ідентифікатор федерального податку

    public ContractEmployee(String employeeId, String federalTaxId) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public double calculatePay() {
        // Середня місячна заробітна плата для працівників з погодинною оплатою на основі годинної ставки та відпрацьованих годин
        double hourlyRate = 25; // Замініть на фактичну годинну ставку
        int hoursWorked = 160; // Замініть на фактичну кількість відпрацьованих годин
        return hourlyRate * hoursWorked;
    }
}

public class main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(); // Створення списку працівників

        // Створення об'єктів SalariedEmployee
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("E001", "SSN001");
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("E002", "SSN002");

        // Створення об'єктів ContractEmployee
        ContractEmployee contractEmployee1 = new ContractEmployee("E003", "TaxID001");
        ContractEmployee contractEmployee2 = new ContractEmployee("E004", "TaxID002");

        // Додавання працівників до списку
        employees.add(salariedEmployee1);
        employees.add(salariedEmployee2);
        employees.add(contractEmployee1);
        employees.add(contractEmployee2);

        // Сортування працівників за спаданням середньомісячної заробітної плати
        Collections.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        // Виведення ідентифікатора працівника, імені та середньомісячної заробітної плати для всіх елементів списку
        for (Employee employee : employees) {
            System.out.println("Ідентифікатор працівника: " + employee.getEmployeeId());
            System.out.println("Середньомісячна заробітна плата: " + employee.calculatePay());
            System.out.println();
        }
    }
}






