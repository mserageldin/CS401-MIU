package lesson11.labs.prob5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 15, 12, 13);
		List<Character> list2 = Arrays.asList('D', 'B', 'C', 'F');
		System.out.println(secondSmallest(list));
		System.out.println(secondSmallest(list2));
	}

	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		if (list == null) {
			return null;
		} else if (list.size() == 1) {
			return list.get(0);
		} else {
			return list.stream().distinct()
					.sorted().limit(2)
					.skip(1).findFirst().orElse(null);
		}
	}
}