package problem4;

public class Trailer implements Properties{
 private double rent;
 Trailer()
 {
	 rent=0.0;
 }
 Trailer(int Rent)
 {
	 this.rent=Rent;
 }
@Override
public double computeRent() {
	rent=500;
	return rent;
}
}
