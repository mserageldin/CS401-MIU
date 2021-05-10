package prob2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle c=new Circle(5);
	//	Rectangle r=new Rectangle(3,4);
	//	Triangle t=new Triangle(5,6);
		ArrayList<Shape> arr=new ArrayList<Shape>();
		arr.add(new Circle(3));
		arr.add(new Rectangle(2,3));
		arr.add(new Triangle(4,3));
		double totalArea=0.0;
		for(Shape s:arr)
		{
			totalArea+=s.computeArea();
			
		}
		System.out.print("Sum of Areas : "+totalArea);
	}

}
