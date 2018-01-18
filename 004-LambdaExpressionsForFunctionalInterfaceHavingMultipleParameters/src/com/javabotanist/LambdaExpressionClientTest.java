package com.javabotanist;

public class LambdaExpressionClientTest {

	/**
	 * 1. To write a lambda expression for any method present inside an interface then the interface should be marked as @FunctionalInterface.
	 * 2. When you define the lambda object you are essentially implementing a single method from an interface. The lambda object implements 
	 * 	  that interface, but defining a lambda does not execute it. It only defines it. You still need to explicitly call the interface method 
	 *    to execute it, or pass the lambda on to another method which calls that interface method.
	 * 3. A lambda expression is characterised by the following syntax: parameter -> expression body.
	 * 4. Since Java lambda expressions are effectively just methods, lambda expressions can take parameters just like methods.
	 * 5. The parameters must however match the parameters of the methods on the single method interface.
	 * 6. When a lambda expression takes a single parameter, you can also omit the parenthesis.
	 * 7. Parenthesis can only be omitted when the method takes a single parameter.
	 * 8. Specifying argument type is also optional in a lambda expression. The compiler will explicitly know the type inside the 
	 * 	  expression body.
	 */
	
	public static void main(String[] args) {
		MyInterfaceWithoutParameters mi1 = methodImplementationUsingAnonymousClass();
		mi1.method1();
		
		MyInterfaceWithoutParameters mi2 = () -> System.out.println("Printing from Lambda Expression");
		mi2.method1();
		
		MyInterfaceWithParameters mi3 = (String name) -> System.out.println("Printing the name " + name + " from lambda expression with parameters");
		mi3.method2("Nithin");
		
		MyInterfaceWithMultipleParameters mi4 = (String name, int age) -> System.out.println("Printing name " + name + " aged " + age + " from a lambda expression");
		mi4.method3("Nithin", 28);
	}

	private static MyInterfaceWithoutParameters methodImplementationUsingAnonymousClass() {
		MyInterfaceWithoutParameters mi1 = new MyInterfaceWithoutParameters() {	
			@Override
			public void method1() {
				System.out.println("Printing from Anonymous Class");
			}
		};
		return mi1;
	}

}
