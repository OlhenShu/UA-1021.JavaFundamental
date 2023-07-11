package hw7.task1;

public class SalariedEmployee extends Employee implements Payment {
	@SuppressWarnings("unused")
	private String socialSecurityNumber;
	private int hoursWorked;
	private int paymentPerHour;
	protected int payment;

	public SalariedEmployee(String socialSecurityNumber, String name, int hoursWorked, int paymentPerHour) {
		super(socialSecurityNumber, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hoursWorked = hoursWorked;
		this.paymentPerHour = paymentPerHour;
		this.payment = calculatePay();
	}

	@Override
	public int calculatePay() {
		return this.hoursWorked * this.paymentPerHour;
	}

	@Override
	public void printInfo() {
		System.out.println("Position: Salaried employee");
		super.printInfo();
		System.out.println("Hours worked per month: " + this.hoursWorked + "\nPayment per hour: " + this.paymentPerHour
				+ "$" + "\nAverage monthly wage: " + this.payment + "$");
	}

}
