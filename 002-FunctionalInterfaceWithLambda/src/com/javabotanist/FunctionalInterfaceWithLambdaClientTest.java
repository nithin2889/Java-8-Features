package com.javabotanist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceWithLambdaClientTest {

	public static void main(String[] args) {
		
		createThreadUsingAnonymousClass();
		createThreadUsingLambdaExpression();
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("AA");
		namesList.add("VV");
		namesList.add("DD");
		
		// without lambda expression
		namesList.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println("Names without lambda expression: "+name);
			}
		});
		
		// using lambda expression
		namesList.forEach((name) -> System.out.println("Names using lambda expression: "+name));
		
		// using method reference
		namesList.forEach(System.out::println);
		
		// using constructor reference
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Task is running");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
	
	private static void createThreadUsingLambdaExpression() {
		Runnable r = () -> { System.out.println("My Task is running from Lambda Expression"); };
		Thread t = new Thread(r);
		t.start();
	}

}
