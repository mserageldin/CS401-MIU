package lesson10.labs.prob5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		/*
		 * System.out.println(emps .filter(e -> (e.getSalary() > 100000)) .filter(e ->
		 * (e.getLastName().charAt(0) > 'M')) .map(e -> fullName(e)) .sorted()
		 * .collect(Collectors.joining(", ")));
		 */
		Main m = new Main();
		m.printEmps(emps);
		// System.out.print(m.filterByName(emps));

	}

	public String asString(List<Employee> pf) {
		return pf.stream().filter(e -> (e.getSalary() > 100000)).filter(e -> (e.getLastName().charAt(0) > 'M'))
				.map(e -> fullName(e)).sorted().collect(Collectors.joining(", "));
	}

	public String filterBySalary(List<Employee> pf) {
		return pf.stream().filter(e -> (e.getSalary() > 100000)).map(e -> fullName(e)).sorted()
				.collect(Collectors.joining(", "));
	}

	public String filterByName(List<Employee> pf) {
		return pf.stream().filter(e -> (e.getLastName().charAt(0) > 'M')).map(e -> fullName(e)).sorted()
				.collect(Collectors.joining(", "));
	}

	void printEmps(List<Employee> pf) {
		String res = asString(pf);
		System.out.println(res);

	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
