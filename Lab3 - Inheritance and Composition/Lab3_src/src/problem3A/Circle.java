package problem3A;

public class Circle extends Cylinder{
	
	Circle(double radious,double height)
	{
		super(radious,height);
	}
	
	double  computeArea() {
			
	return	Math.PI * (super.getRadius() * super.getRadius());
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
