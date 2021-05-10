package lab4;

import java.time.LocalDate;

public class Order {
   private int OrderNo;
   private LocalDate orderDate;
   private double orderAmount;
   public Order(LocalDate orderDate, double orderAmount) {
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
public int getOrderNo() {
	return OrderNo;
}
public void setOrderNo(int orderNo) {
	OrderNo = orderNo;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public double getOrderAmount() {
	return orderAmount;
}
public void setOrderAmount(double orderAmount) {
	this.orderAmount = orderAmount;
}
}
