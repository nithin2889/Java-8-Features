package com.javabotanist.client;

import com.javabotanist.Operation;

public class ClosuresInLambdaClientTest {

	public static void main(String[] args) {
		
		int x=30;
		int y=40;
		
		/**
		 * NOTE: If we try to change the value of variables x or y it will throw a compilation error in Java 8 onwards.
		 * The compiler by default assumes the variables declared outside the anonymous class as "final".
		 * That is, the variables declared outside the anonymous class cannot be changed inside the anonymous class 
		 * and this concept is called as Closures.
		 */
		
		System.out.println("using anonymous class");
		doOperation(x, new Operation() {
			@Override
			public void operate(int n) {
				System.out.println(n+y);
			}
		});
		
		System.out.println("using lambda expression");
		doOperation(x, n -> System.out.println(n + y));
	}

	private static void doOperation(int i, Operation op) {
		op.operate(i);
	}
	
}
