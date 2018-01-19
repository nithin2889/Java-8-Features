package com.javabotanist.client;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceToInstanceOfAParticularObjectClientTest {

	public static void main(String[] args) {
		/**
		 * 1. Method Reference is a feature related to Lambda Expressions. It allows us to reference the
		 * 	  constructors or methods without executing them.
		 * 2. Method references and Lambda are similar in that they both require a target type that consist 
		 *    of a compatible functional interface.
		 *    
		 * There are four types of Method Reference:
		 * 1. Reference to a Static Method:
		 * 	  Ex: ContainingClass::Static Method Name
		 * 	  Syntax: Class::Static Method Name 
		 * 2. Reference to a Constructor:
		 * 	  Ex: ClassName::new
		 * 	  Syntax: ClassName::new
		 * 3. Reference to an instance method of an arbitrary object of a particular type:
		 * 	  Ex: ContainingType::methodName
		 * 	  Syntax: Class::Instance Method Name
		 * 4. Reference to an instance method of a particular object:
		 * 	  Ex: containerObject::Instance Method Name
		 * 	  Syntax: Object::Instance Method Name
		 * 
		 * Take Away:
		 * 1. You can replace Lambda Expressions with Method Reference where Lambda is invoking already defined methods.
		 * 2. You can't pass arguments to a Method Reference.
		 * 3. To use Lambda and Method Reference, make sure you have Java 8 installed. They won't work on Java 7 and earlier versions.
		 */
		List<String> names = new ArrayList<>();
		names.add("Mathew");
		names.add("Mark");
		names.add("Luke");
		names.add("Isaiah");
		names.add("Solomon");

		// names.forEach(x -> System.out.println(x));
		names.forEach(System.out::println);
	}

}
