package prob4;
import java.util.*;
import java.util.stream.Stream;
public class PrimeStream {

	void printFirstNPrimes(int num)
	{
		Stream<Integer> st=Stream.iterate(1, n-> n+1).limit(num);
		st.forEach(System.out::print);
		System.out.println(System.lineSeparator());
	}
	public static void main(String[] args) {
		PrimeStream ps=new PrimeStream();
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

	}

}
