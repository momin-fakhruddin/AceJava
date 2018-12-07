package collections.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sort Employee according to lname in ascending and if lname if is empty,
 * sort according to fname in descending order
 */
public class MyEmployeeComparator implements Comparator<Employee> {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Employee> myEmps = new ArrayList<>();
     myEmps.add(new Employee("Robin", "Hood"));
     myEmps.add(new Employee("", "Momin"));
     myEmps.add(new Employee("", "Ravi"));
     myEmps.add(new Employee("", "Sunny"));
     myEmps.add(new Employee("Khan", "Imran"));
     myEmps.add(new Employee("Sachin", "Tendya"));
     System.out.println(myEmps);
     Collections.sort(myEmps, new MyEmployeeComparator());
     System.out.println(myEmps);
	}

	@Override
	public int compare(Employee first, Employee second) {
		// TODO Auto-generated method stub
		boolean isFirstLnameEmpty = first.lname.equals("");
		boolean isSecondLnameEmpty = second.lname.equals("");
		if (isFirstLnameEmpty && isSecondLnameEmpty ) {
			return second.fname.compareTo(first.fname);
		} else if (isFirstLnameEmpty) {
			return 1;
		} else if (isSecondLnameEmpty){
			return -1;
		} 
		
		return first.lname.compareTo(second.lname);
	}

}
