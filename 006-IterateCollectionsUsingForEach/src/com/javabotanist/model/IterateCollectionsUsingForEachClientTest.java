package com.javabotanist.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterateCollectionsUsingForEachClientTest {

	public static void main(String[] args) {
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student("Nithin", 28));
		studList.add(new Student("Andrew", 40));
		studList.add(new Student("Martin", 32));
		
		// Method - 1 (Anonymous Class)
		System.out.println("Anonymous Class");
		studList.forEach(new Consumer<Student>() {
			public void accept(Student s) {
				System.out.println(s);
			};
		});
		
		// Method - 2 (Lambda Expression)
		System.out.println("\nLambda Expression");
		studList.forEach((s) -> System.out.println(s));
		
		// Method - 3 (Method Reference)
		System.out.println("\nMethod Reference");
		studList.forEach(System.out::println);
		
		// Method - 4 (Iterator)
		System.out.println("\nIterator");
		Iterator<Student> iterator = studList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
