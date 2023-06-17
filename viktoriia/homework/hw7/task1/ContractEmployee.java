package hw7.task1;

public class ContractEmployee extends Employee implements Payment{
    private int fixedMonthlyPayment;
    private String federalsTaxIdMember;

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, String name, int fixedMonthlyPayment, String federalsTaxIdMember) {
        super(employeeId,name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalsTaxIdMember = federalsTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
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
