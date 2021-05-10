package prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


final public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	private  static Customer customer;
	
	//use a factory method
	private Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
		
	}
	void setCustomer(Customer cust)
	{
		customer=cust;
	}
	Customer getCustomer()
	{
		return customer;
	}
	public static Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Null customer");
		
		customer=cust;
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
	}
	public void addItem(String name){
		items.add(new Item(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
