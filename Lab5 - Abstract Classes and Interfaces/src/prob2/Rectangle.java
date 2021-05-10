package prob2;

public class Rectangle implements Shape{
	private final double width;
	private final double length;
	Rectangle(double w,double l){
		this.width=w;
		this.length=l;
		
	}
	//public double computeArea() {};
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public double computeArea() {
		return width*length;
	}
	
}
