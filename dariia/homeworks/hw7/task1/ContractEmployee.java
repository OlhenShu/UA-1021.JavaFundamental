package hw7.task1;

public class ContractEmployee extends Employee implements Payment{
	String federalTaxIdmember;
	private int salary;

	public ContractEmployee(String federalTaxIdmember, String name, int salary) {
		super(federalTaxIdmember, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.salary = salary;
	}

	public String getFederalTaxIdmember() {
		return this.federalTaxIdmember;
	}

	@Override
	public int calculatePay() {
		return this.salary;
	}

	@Override
	public void printInfo() {
		System.out.println("Position: Contract employee");
		super.printInfo();
		System.out.println("Average monthly wage: " + this.salary + "$");
	}

}
