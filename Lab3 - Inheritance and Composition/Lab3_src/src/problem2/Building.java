package problem2;

import java.util.ArrayList;

public class Building {
	private int maintainceCost;
	private ArrayList<Apartment> apts;
	Building(int mainCost,int rentalValue)
	{
		this.maintainceCost=mainCost;
		apts=new ArrayList<Apartment>(); 
		apts.add(new Apartment(rentalValue));
	}
	void addApartment(Apartment apt)
	{
		apts.add(apt);
	}
	public int getMaintainceCost() {
		return maintainceCost;
	}
	public void setMaintainceCost(int maintainceCost) {
		this.maintainceCost = maintainceCost;
	}
	public ArrayList<Apartment> getApts() {
		return apts;
	}
	public void setApts(ArrayList<Apartment> apts) {
		this.apts = apts;
	}
}
