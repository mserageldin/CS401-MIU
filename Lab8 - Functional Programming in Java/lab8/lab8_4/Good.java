package lab8_4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		
		System.out.println(String.format("Friends with names that contain"
				+ " with 'N': "+ good.countWords(Folks.friends,'N','M',4)));
		
		
	}
	
	public List<String> countWords(List<String> words, char c,char d,int len) {
		return 
				words.stream()   //convert list to stream
         	     .filter(name -> count(name,len,c,d)) //returns filtered stream
         	     .collect(Collectors.toList()); //organizes into a list		
	}

	
	
	
	

	public boolean count(String word, int  len,char c,char d) {
		System.out.println("Check size at " + word + " to equal to  " + len);
		return word.length()==len&&word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d));
	}
	
}
