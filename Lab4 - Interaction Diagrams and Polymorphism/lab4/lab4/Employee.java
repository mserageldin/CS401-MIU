package lab4;

import java.time.LocalDate;

public abstract class Employee {
	private String empId;
	public Employee(String emplId) {
		this.empId = emplId;
	}
	void print() {
		LocalDate now = LocalDate.now();
		System.out.println(calcCompensation(now.getMonthValue(), now.getYear()));
	};
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay, Tax.FICA, Tax.State, 
				Tax.Local, Tax.Medicare, Tax.SocialSecurity);
	}
abstract double calcGrossPay(int month,int year);
}
