package soln2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lesson10.labs.prob5.Employee;
import lesson10.labs.prob5.Main;

public class secondTest {

	List<Employee> emps;

	@Before

	public void setUp() throws Exception {
		emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
	}

	@Test
	public void testFilterBySalary() {
		String expected = "Alice Richards, Joe Cummings, Joe Davis, Joe Stevens, John Sims, Steven Walters, Thomas Blake";
		Main main = new Main();
		assertEquals(main.filterBySalary(emps), expected);
	}

	@Test
	public void testFilterByName() {
		String expected = "Alice Richards, Andrew Reardon, Donald Trump, Joe Stevens, John Sims, Steven Walters";
		Main main = new Main();
		assertEquals(main.filterByName(emps), expected);
	}

}
