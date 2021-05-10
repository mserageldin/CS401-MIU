package lab4;

import java.util.ArrayList;

public class Commissioned extends Employee{
 private double commission;
 private double baseSalary;
 private ArrayList<Order> ord;
 Commissioned(String empId,double comm,double base)
 {
	 super(empId);
	 commission=comm;
	 baseSalary=base;
	 ord=new ArrayList<Order>();
 }
 /*void addOrder(Order ord)
 {
	 ord.add(ord);
 }*/
@Override
double calcGrossPay(int month, int year) {
	double totalSales=0.0;
	for(Order or:ord)
	{
		totalSales+=or.getOrderAmount();
	}
	return ( getBaseSalary()+(getCommission()*totalSales) );
}
public double getCommission() {
	return commission;
}
public void setCommission(double commission) {
	this.commission = commission;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}
public ArrayList<Order> getOrd() {
	return ord;
}
public void setOrd(ArrayList<Order> ord) {
	this.ord = ord;
}
 
}
