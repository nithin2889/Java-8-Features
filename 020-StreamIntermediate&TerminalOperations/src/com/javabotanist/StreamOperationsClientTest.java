package com.javabotanist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperationsClientTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sansa");
		list.add("Arya");
		list.add("Little Finger");
		list.add("Tyrion");
		list.add("Khaleesi");
		list.add("Jon Snow");
		
		
		/**
		 *  Steps broken down for easier understanding.
		 *  1. Intermediate Operations can only be chained and the result is not printed
		 *  until the terminal operation is called which returns a specific data type.
		 *  
		 *  2. Finally, once the stream is operated upon or closed it cannot be reused. Otherwise, 
		 *  we will get an IllegalStateException.
		 */
		
		// Intermediate Operation returns a Stream
		Stream<String> stream = list.stream();
		
		// Intermediate Operation returns a Stream
		Stream<String> distinct = stream.distinct();
		
		// Terminal Operation is an aggregate operation.
		long count = distinct.count();
		System.out.println("Count is "+count);
		
		/**
		 * 3. Stream API helps to substitute for, for-each and while loops. It allows 
		 * concentrating on operation's logic, but not on the iteration over the sequence
		 * of elements.
		 */
		System.out.println("Using Anonymous Class with Stream");
		boolean anyMatchOne = list.stream().anyMatch(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("K");
			}
		});
		System.out.println("Stream returns "+anyMatchOne);
		
		System.out.println("\nUsing Lambda with Stream");
		boolean anyMatchTwo = list.stream().anyMatch(s -> s.contains("K"));
		System.out.println("Stream returns "+anyMatchTwo);
	}

}
