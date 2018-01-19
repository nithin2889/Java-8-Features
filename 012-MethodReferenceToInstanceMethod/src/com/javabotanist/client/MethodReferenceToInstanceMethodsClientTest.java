package com.javabotanist.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.javabotanist.model.Person;

public class MethodReferenceToInstanceMethodsClientTest {

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
		 */
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Sean", 29));
		persons.add(new Person("Bean", 30));
		persons.add(new Person("Martin", 45));
		persons.add(new Person("Luther", 27));
		
		List<String> names = MethodReferenceToInstanceMethodsClientTest.getPersonName(persons, Person::getName);
		names.forEach(System.out::println);
	}

	// Function<T, R> - Represents a function that accepts one argument and produces a result. Here it accepts Person object 
	// and returns a list of String.
	private static List<String> getPersonName(List<Person> persons, Function<Person, String> f) {
		List<String> result = new ArrayList<>();
		persons.forEach(n -> result.add(f.apply(n)));
		return result;
	}

}
