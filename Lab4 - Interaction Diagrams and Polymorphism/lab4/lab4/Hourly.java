package lab4;

public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;
    private final int weeksPerMonth = 4;
    Hourly(String empId,double hourlyWag,int hourPerWeek)
    {
    	super(empId);
    	hourlyWage=hourlyWag;
    	hoursPerWeek=hourPerWeek;
    	
    }
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	double calcGrossPay(int month, int year) {
		return getHoursPerWeek()*getHourlyWage()*weeksPerMonth;
	}
    
    
}
