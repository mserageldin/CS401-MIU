package problem2;

import java.util.ArrayList;

public class LandlordInfo {
	private ArrayList<Building> builds;
	
	LandlordInfo(){};
	void addBuilding(Building build)
	{
		builds=new ArrayList<Building>(); 
		builds.add(build);
	}
	int calcProfits()
	{
		//itreate build's
		
		int netProfit=0;
		for(Building b: builds) {
		//iterate apartments 
			int buildCost=b.getMaintainceCost();
			int buildProfit=0;
			for(Apartment p: b.getApts())
			{
				buildProfit+=p.getRentalFees();
			}
			netProfit+=buildProfit-buildCost;
		}
		return netProfit;
	}
	
}
