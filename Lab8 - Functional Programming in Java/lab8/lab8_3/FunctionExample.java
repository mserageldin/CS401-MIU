package lab8_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionExample {
	/* As a lambda:
	 * public static void main(String[] args) { BiFunction<Integer, Integer,
	 * Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {
	
		class myBiFunction implements BiFunction<Double, Double, List<Double>> {
			public List<Double> apply(Double x, Double y) {
				List<Double> list= new ArrayList<>();
				list.add(Math.pow(x, y));
				list.add(x* y);
				return list;
			}
		}
		
		myBiFunction f = new myBiFunction();
		
		System.out.println(f.apply(2.0, 3.0)); // output 1
	}

}
