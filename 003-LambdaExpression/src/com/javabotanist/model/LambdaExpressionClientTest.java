package com.javabotanist.model;

public class LambdaExpressionClientTest {

	public static void main(String[] args) {
		createThreadWithoutLambda();
		createThreadUsingAnonymousClass();
		createThreadWithLambda();
	}
	
	private static void createThreadWithoutLambda() {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		t1.start();
	}
	
	private static void createThreadUsingAnonymousClass() {
		// Separate .class is created for anonymous class usage
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Task executing in anonymous class");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

	private static void createThreadWithLambda() {
		// Separate .class creation is avoided with lambda expression usage.
		Runnable r = () -> System.out.println("Task executing using lambda expression");
		Thread t = new Thread(r);
		t.start();
	}

}
