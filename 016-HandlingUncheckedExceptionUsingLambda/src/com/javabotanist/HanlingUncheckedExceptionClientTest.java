package com.javabotanist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HanlingUncheckedExceptionClientTest {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 0, 20);
		/*integers.forEach(n -> {
			try {
				System.out.println(50/n);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception Occurred "+e.getMessage());
			}
		});*/
		System.out.println("try-catch using lambda");
		
		// Here, the conciseness of lambda expression is maintained by creating a separate function to handle the exception.
		// But the number of lines used is still same as compared to the traditional try-catch block. 
		integers.forEach(lambdaWrapper(i -> System.out.println(50/i)));
		
		// This can be overcome by creating a generic method to handle all other scenarios.
		integers.forEach(consumerWrapper(i -> System.out.println(50/i), Exception.class));
	}
	
	/**
	 * This method only handles Lambda Expression for functional interface of type Consumer.
	 * @param consumer: works for functional interface of type Consumer.
	 * @param clazz: The type of exception that is being handled
	 * @return 
	 */
	public static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Exception Has Occurred "+e.getMessage());
			}
		};
	}
	
	public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception Occurred "+e.getMessage());
			}
		};
	}

}
