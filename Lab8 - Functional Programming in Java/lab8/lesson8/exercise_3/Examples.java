package lesson8.exercise_3;
import java.util.function.Function;
public class Examples {
	
	
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	Function<String, String> lower = String::toLowerCase;
	Function<String, Integer> len = String::length;
	
	
	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		System.out.println(lower.apply("MOHAMED SERAGELDIN"));
		System.out.println(len.apply("MOHAMED SERAGELDIN"));
		
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
