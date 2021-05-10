package lab4;

public class Salaried extends Employee{
 private double salary;
 public Salaried(String empId, double salar) {
		super(empId);
		salary = salar;
	}
@Override
double calcGrossPay(int month, int year) {
	// TODO Auto-generated method stub
	return getSalary();
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
 
}
