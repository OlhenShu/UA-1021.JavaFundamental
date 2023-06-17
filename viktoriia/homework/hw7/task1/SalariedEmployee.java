package hw7.task1;

public class SalariedEmployee extends Employee implements Payment {
    private int hourlyRate;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public SalariedEmployee(String employeeId, String name, int hourlyRate, int numberOfHoursWorked, String socialSecurityNumber) {
        super(employeeId,name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public int compareTo(Employee empl) {
        if (empl instanceof SalariedEmployee) {
            return this.calculatePay() - ((SalariedEmployee) empl).calculatePay();
        } else if (empl instanceof ContractEmployee) {
            return this.calculatePay() - ((ContractEmployee) empl).calculatePay();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee id: " + employeeId + ", name: " + name + ", monthly average wage: " + this.calculatePay();
    }
}
