package soln1;

import static org.junit.Assert.*;
import lesson10.labs.prob5.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lesson10.labs.prob5.Employee;

public class mainTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAsString() {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 1000));
		String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		Main main = new Main();
		assertEquals(main.asString(emps), expected);

	}

}
