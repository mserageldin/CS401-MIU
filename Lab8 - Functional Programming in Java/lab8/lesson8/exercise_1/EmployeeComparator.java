package lesson8.exercise_1;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// for comparison
        int NameCompare = arg0.name.compareTo(arg1.name);
        int SalCompare = arg0.salary==arg1.salary?0:-1;
        SalCompare= arg0.salary<arg1.salary?-1:1;
        if (NameCompare == 0) {
            return ((SalCompare == 0) ? NameCompare : SalCompare);
        } else {
            return NameCompare;
        }
	}
	

}
