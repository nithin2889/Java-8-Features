package com.javabotanist;

public class TypeInferenceClientTest {

	public static void main(String[] args) {
		/**
		 * Even though we have not specified any type or a return keyword inside the lambda expression,
		 * the compiler is able to infer the type at runtime. This property is called Type Inference in a Lambda Expression.
		 */
		MyComparator myComparator = (n1, n2) -> n1 > n2;
		boolean compare = myComparator.compare(40, 20);
		System.out.println(compare);
	}

}
