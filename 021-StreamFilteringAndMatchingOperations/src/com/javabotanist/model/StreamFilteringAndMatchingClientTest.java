package com.javabotanist.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringAndMatchingClientTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("AA", 28));
		list.add(new Student("BB", 27));
		list.add(new Student("CC", 26));
		list.add(new Student("DD", 21));
		list.add(new Student("EE", 20));
		list.add(new Student("FF", 40));
		list.add(new Student("GG", 38));
		
		/**
		 * The filter() method allows us to pick stream of elements which satisfy a predicate.
		 * Here, we are filtering the list based on the age group between 25 and 35. 
		 * This will create a Stream<Student> of the list, finds all the students between the given
		 * age group and returns it.
		 */
		Stream<Student> filteredList = list.stream().filter(s -> s.getAge() > 25 && s.getAge() < 35);
		filteredList.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		// return true if all elements of this stream match the provided predicate
		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("D"));
		System.out.println("allMatch returns " + allMatch);
		
		// return true if any elements of this stream match the provided predicate
		boolean anyMatch = list.stream().anyMatch(s -> s.getAge() > 35);
		System.out.println("anyMatch returns " + anyMatch);
		
		// return true if no elements of this stream match the provided predicate
		boolean noneMatch = list.stream().noneMatch(s -> s.getAge() > 65);
		System.out.println("noneMatch returns " + noneMatch);
	}

}
