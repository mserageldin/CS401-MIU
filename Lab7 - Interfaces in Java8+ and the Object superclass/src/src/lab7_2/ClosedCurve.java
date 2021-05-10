package lab7_2;

public interface ClosedCurve {	
	double getradius();
	default double computePerimeter() {
		
		return 2 * Math.PI * getradius(); 
	};
}
