package problem3B;

public class Circle  {
	
	private Cylinder cy;
	Circle(double radious,double height)
	{
		cy=new Cylinder(radious,height);
	}
	
	double  computeArea() {
			
	return	Math.PI * (cy.getRadius() * cy.getRadius());
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
