package hw7.task1;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.calculatePay() - emp2.calculatePay();
	}
}
