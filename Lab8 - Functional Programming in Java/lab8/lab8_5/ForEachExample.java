package lab8_5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		/*Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s.toUpperCase());				
			}	
		};
		System.out.println("------using new forEach method------");
		list.forEach(consumer);*/
		//print each element of the list in upper case format
		
		List<String> li_uc= list.stream().map(String::toUpperCase).collect(Collectors.toList());

       li_uc.forEach(System.out::println);

		
		
	}
	
	//implement a Consumer
	
	
}