package com.javabotanist.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaMethodReferenceClientTest {

	public static void main(String[] args) {
		/**
		 * 1. Method Reference is a feature related to Lambda Expressions. It allows us to reference the
		 * 	  constructors or methods without executing them.
		 * 2. Method references and Lambda are similar in that they both require a target type that consist 
		 *    of a compatible functional interface.
		 *    
		 * There are four types of method reference:
		 * 1. Reference to a Static Method:
		 * 	  Ex: ContainingClass::Static Method Name
		 * 	  Syntax: Class::Static Method Name 
		 */
		ExecutorService execService = Executors.newSingleThreadExecutor();
		Runnable command = LambdaMethodReferenceClientTest::myRunnable;
		execService.execute(command);
	}

	private static void myRunnable() {
		System.out.println("My Task is running");
	}

}
