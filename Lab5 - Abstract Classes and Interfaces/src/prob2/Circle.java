package prob2;

public class Circle implements Shape{
  
	private final double radius;
	
	Circle(double rad)
	{
		this.radius=rad;
	}
	//public double computeArea() {};

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return	Math.PI * (radius * radius);
	}
}
