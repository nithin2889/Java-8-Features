package com.javabotanist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationClientTest {

	public static void main(String[] args) {
		/**
		 * A Stream is a sequence of data on which we can perform various aggregate operations on the data
		 * returned from collections, arrays or input/output operations. 
		 * 
		 * A Stream can be created from different element sources e.g., collection or arrays with the help of 
		 * stream() or of() methods.
		 * 
		 * stream() is a default method that is added to the Collection interface in Java 8 and this method 
		 * allows us to create a Stream<T> using any collection as an element source.
		 */
		
		System.out.println("Method-1 of stream creation using stream() method");
		String [] arr = new String[] {"AA","BB","CC","DD"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		System.out.println("\nMethod-2 of stream creation using of() method");
		Stream<String> of = Stream.of("EE", "FF", "GG", "HH");
		of.forEach(System.out::println);
		
		System.out.println("\nMethod-3 of stream creation using stream() method from a list");
		List<String> list = new ArrayList<>();
		list.add("Nithin");
		list.add("Akhila");
		list.add("Martia");
		
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);
	}

}
