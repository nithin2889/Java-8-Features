package com.javabotanist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamCreationClientTest {

	public static void main(String[] args) {
		/**
		 * Stream API also simplifies multithreading by providing the parallelStream() method that runs
		 * operations over stream's elements in parallel mode.
		 */
		
		System.out.println("Parallel stream creation");
		List<Student> list = new ArrayList<>();
		list.add(new Student("AA", 28));
		list.add(new Student("BB", 27));
		list.add(new Student("CC", 26));
		list.add(new Student("DD", 21));
		list.add(new Student("EE", 20));
		list.add(new Student("FF", 40));
		list.add(new Student("GG", 38));
		
		Stream<Student> parallelStream = list.parallelStream();
		System.out.println("Student data sending to processing");
		// The list will not be in the same order. The parallelStream() will spawn multiple threads to process the data
		// and make use of the multi-core processor of the underlying OS.
		parallelStream.forEach(s -> doProcess(s));
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}
