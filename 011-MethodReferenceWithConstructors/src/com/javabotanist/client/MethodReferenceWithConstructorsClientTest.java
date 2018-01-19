package com.javabotanist.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceWithConstructorsClientTest {

	public static void main(String[] args) {
		/**
		 * 1. Method Reference is a feature related to Lambda Expressions. It allows us to reference the
		 * 	  constructors or methods without executing them.
		 * 2. Method references and Lambda are similar in that they both require a target type that consist 
		 *    of a compatible functional interface.
		 *    
		 * There are four types of Method Reference:
		 * 1. Reference to a Static Method:
		 * 	  Ex: ContainingClass::Static Method Name
		 * 	  Syntax: Class::Static Method Name 
		 * 2. Reference to a Constructor:
		 * 	  Ex: ClassName::new
		 * 	  Syntax: ClassName::new
		 */
		List<Integer> numbers = Arrays.asList(4, 25, 36, 100);
		numbers.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		List<Double> sqrt = MethodReferenceWithConstructorsClientTest.calculateSqrt(numbers, Integer::new);
		System.out.println("Square Roots are");
		sqrt.forEach(System.out::println);
	}

	private static List<Double> calculateSqrt(List<Integer> numbers, Function<Integer, Integer> f) {
		List<Double> results = new ArrayList<>();
		numbers.forEach((x) -> results.add(Math.sqrt(f.apply(x))));
		return results;
	}

}
