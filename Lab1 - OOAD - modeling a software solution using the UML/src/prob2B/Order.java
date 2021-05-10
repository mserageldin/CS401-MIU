package prob2B;

import java.util.*;

public class Order {

	private int  orderNum;
	private List<OrderLine> orders;
	Order(int oNum)
	{
		
		this.orderNum=oNum;
		this.orders=new ArrayList<OrderLine>();
	}
	void addOrderLine(String Name)
	{
		this.orders.add(new OrderLine(Name));
	}
	public static void main(String[] args) {
		
		Order amazon_order=new Order(1);
		
		System.out.println(amazon_order.toString());
		amazon_order.addOrderLine("test 1");
		amazon_order.addOrderLine("test 2");
		System.out.println(amazon_order.toString());
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (OrderLine s : orders)
		{
		    sb.append(s.toString());
		    sb.append("\t");
		}
		return "Order [orderNum=" + getOrderNum() + ", orders=" + sb.toString()+ "]";
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderLine> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderLine> orders) {
		this.orders = orders;
	}

}
