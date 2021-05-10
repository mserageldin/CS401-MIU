package lab7_2;

public final class Rectangle implements Polygon,ClosedCurve {
	final private double width;
	final private double length;
	
	
	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	
	@Override
	public double getwidth() {
		
		return length;
		
	}
	@Override
	public double getlength() {
		
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
