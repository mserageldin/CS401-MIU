package prob2;

public class Triangle implements Shape{

	private final double base;
	
	private final double height;
	Triangle(double b,double h)
	{
		this.base=b;
		this.height=h;
	}
	//public double computeArea() {};
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public double computeArea() {
		return 1/2*base*height;
	}
}
