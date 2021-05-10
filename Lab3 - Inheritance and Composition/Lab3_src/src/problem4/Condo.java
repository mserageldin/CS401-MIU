package problem4;

public class Condo implements Properties{

	  private double rent;
	  private int numFloors;
	  
	  Condo(int NumFloors)
	  {
		  
		  this.numFloors=NumFloors;
	  }
	  Condo(double Rent,int NumFloors)
	  {
		  
		  this.rent=Rent;
		  this.numFloors=NumFloors;
	  }
	  
	@Override
	public double computeRent() {
		rent =400*numFloors;
		
		return rent;
	}
}
