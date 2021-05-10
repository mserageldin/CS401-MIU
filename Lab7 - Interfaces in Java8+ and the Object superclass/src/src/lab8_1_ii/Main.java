package lab8_1_ii;

import java.util.Arrays;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> toRandom=()->Math.random();
			System.out.print(toRandom.get());
			System.out.print(System.lineSeparator());
			System.out.print(toRandomClass().get());
	}
	static Supplier<Double> toRandomClass()
	{
		return ()->Math.random();
	}
	

}
