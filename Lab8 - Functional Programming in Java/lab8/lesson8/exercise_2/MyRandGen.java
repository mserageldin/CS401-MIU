package lesson8.exercise_2;

import java.util.Random;

public class MyRandGen implements MyIface {

	@Override
	public int produce() {
		
		Random r=new Random();
		return r.nextInt();
		
	}
	public static void main(String[] args) {
	
		MyRandGen mg=new MyRandGen();
		System.out.println(mg.produce());
	
	}

}
