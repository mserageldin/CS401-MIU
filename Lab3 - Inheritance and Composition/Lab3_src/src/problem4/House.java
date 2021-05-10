package problem4;

public class House implements Properties{
   private double rent;
   private double lotSize;
   House(double Rent)
   {
	   this.rent=Rent;
	  
   }
   House(double Rent,double LotSize)
   {
	   this.rent=Rent;
	   this.lotSize=LotSize;
   }
@Override
public double computeRent() {
	rent=0.1*lotSize;
	return rent;
}
}
