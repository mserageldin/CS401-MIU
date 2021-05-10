package lab7_2;

public class EquilateralTriangle implements Polygon,ClosedCurve{

	final private double length;
	@Override
	public double getwidth() {
		// TODO Auto-generated method stub
		return length;
	}

	
	public EquilateralTriangle(double length) {

		this.length = length;
	}


	@Override
	public double getlength() {
		// TODO Auto-generated method stub
		return length;
	}


	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return Polygon.super.computePerimeter();
	}


	@Override
	public double getradius() {
		// TODO Auto-generated method stub
		return 0;
	}

}
