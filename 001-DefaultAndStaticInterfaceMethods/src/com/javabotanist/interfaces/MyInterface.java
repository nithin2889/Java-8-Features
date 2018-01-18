package com.javabotanist.interfaces;

import java.util.Collections;
import java.util.List;

import com.javabotanist.model.Student;

public interface MyInterface {
	
	/**
	 * 1. From Java 8 onwards, interfaces are enhanced to have methods with implementation. 
	 * 2. We can use default and static keywords to create interfaces with method implementation.
	 * 3. Java 8 uses default and static methods heavily in Collection API and default methods are added 
	 * 	  so that our code remains backward compatible.
	 * 4. Overriding methods on 'Object' class methods:
	 * 	  a. It is not possible for an interface to override and provide default implementations for the methods in Object class.
	 * 		 Trying to do so will result in a compilation error.
	 *    b. If any class in the hierarchy has a method with same signature as Object class methods, then default methods will 
	 *    	 be irrelevant.
	 *    c. Since any class that is implementing an interface already, has Object as superclass, if we have equals(), hashCode() default 
	 *    	 methods in interface, it will become irrelevant. That's why for better clarity, interfaces are not allowed to have Object class
	 *       default methods.
	 *       
	 * 5. Interface default methods helps in extending interfaces without having the fear of breaking implementation classes.
	 * 6. Normally, static methods can be used as helper methods while default methods are used as a default implementation for classes that 
	 * 	  implements that interface.
	 * 7. Default methods can be overridden while static methods cannot be overridden. However, both implementation class and interface can have 
	 * 	  static methods with same names, by neither overriding each other.
	 * 8. In case a class is implementing more than one interfaces with same default method signature then the implementing class needs to 
	 * 	  override the default method.
	 */
	
	// Implementation class can override this method.
	default public List<Student> sortStudents(List<Student> studentList) {
		Collections.sort(studentList);
		return studentList;
	}
	
	default public void display() {
		System.out.println("MyInterface.display()");
	}

	// Implementation class cannot override static method.
	static public void greet(String name) {
		System.out.println("Welcome "+name);
	}
	
	public abstract Integer getMaxNum(List<Integer> intList);
	
}
