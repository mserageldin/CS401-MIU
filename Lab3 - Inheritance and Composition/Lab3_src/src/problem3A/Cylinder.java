package problem3A;

public class Cylinder {
   private double radius;
   private double height;
   Cylinder(double rad,double high)
   {
	   this.radius=rad;
	   this.height=high;
   }
   public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
double computeVolume() {
	   
	   return ((22*radius*radius*height)/7);
   };
}
