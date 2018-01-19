package com.javabotanist;

public class LambdaExpressionWithReturnValueClientTest {

	public static void main(String[] args) {
		MyInterface my1 = (n1, n2) -> {
			return n1 > n2;
		};
		System.out.println("Lambda expression returns " + my1.test(40, 22));
		System.out.println("Lambda expression returns " + my1.test(40, 42));
		
		// Simplified Version
		MyInterface my2 = (n1, n2) -> n1 > n2;
		System.out.println("Lambda expression returns " + my2.test(40, 22));
		System.out.println("Lambda expression returns " + my2.test(40, 42));
	}

}
