package com.javabotanist.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImplUsingLambdaClientTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nithin", "nithin@gmail.com", 90000.00));
		empList.add(new Employee("Andrew", "andrew@gmail.com", 60000.00));
		empList.add(new Employee("Sean", "sean@gmail.com", 80000.00));
		
		System.out.println("Before Sorting By Name");
		empList.forEach(System.out::println);
		
		// Without Anonymous Class
		Collections.sort(empList, new EmployeeNameComparator());
		
		// With Anonymous Class
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		
		// Using Lambda Expression
		Collections.sort(empList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		
		System.out.println("After Sorting By Name");
		empList.forEach(System.out::println);
	}

}
