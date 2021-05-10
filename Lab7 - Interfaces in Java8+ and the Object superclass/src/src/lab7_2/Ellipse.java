package lab7_2;

public class Ellipse implements Polygon,ClosedCurve{

	final private double width;
	public Ellipse(double width, double length) {
		
		this.width = width;
		this.length = length;
	}

	final private double length;
	@Override
	public double getwidth() {
		// TODO Auto-generated method stub
		return width;
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
