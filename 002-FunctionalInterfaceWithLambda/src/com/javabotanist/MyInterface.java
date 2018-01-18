package com.javabotanist;

@FunctionalInterface
public interface MyInterface {
	
	/**
	 * 1 An interface can extend another interface and in case the interface is extending a functional interface and it doesn't declare 
	 * any new abstract methods then the new interface is also functional interface. But an interface can have one abstract method and 
	 * any number of default methods and the interface would still be called a functional interface.
	 * 
	 * 2. List of Functional Interfaces are defined in java.util.function package.
	 * 
	 * 3. There can only be one abstract method in any given functional interface.
	 * 
	 * 4. A functional interface is valid even though if you omit @FunctionalInterface annotation. It is only used to inform the compiler
	 *    to enforce single abstract method inside an interface.
	 * 
	 * 5. Conceptually, a functional interface has exactly one abstract method. Since default methods have an implementation, they are 
	 * 	  not abstract and hence you are free to add default methods as many as you like.
	 * 
	 * 6. Instances of functional interfaces can be created with lambda expressions, method references, or constructor references.
	 */
	
	public abstract void method();
	
	public abstract int hashCode();
	
	default public void display() {
		System.out.println("This is still a Functional Interface");
	}
}
