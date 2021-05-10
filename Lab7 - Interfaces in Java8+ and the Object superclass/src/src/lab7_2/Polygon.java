package lab7_2;

public interface Polygon {
	  double getwidth();
	  double getlength();
	default double[] getSides() {
		
		return new double[] {getwidth(),getlength()};
	};
	default double computePerimeter() {
	double area =  getwidth() * getlength();
	return area;

	}
}