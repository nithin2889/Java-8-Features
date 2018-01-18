package com.javabotanist.client;

import java.util.ArrayList;
import java.util.List;

import com.javabotanist.interfaces.MyInterface;
import com.javabotanist.interfacesimpl.MyClass;
import com.javabotanist.model.Student;

public class DefaultAndStaticInterfaceMethodClientTest {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyClass();
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("XX", 16));
		studentList.add(new Student("SS", 12));
		studentList.add(new Student("DD", 13));
		studentList.add(new Student("AA", 19));
		studentList.add(new Student("QQ", 9));
		
		List<Student> sortedStudents = myInterface.sortStudents(studentList);
		
		System.out.println("Sorting the list based on the names");
		for (Student student : sortedStudents) {
			System.out.println(student.getName() + "-" + student.getAge());
		}
		
		MyInterface.greet("Nithin");
		
		System.out.println("---------------------");
		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(200);
		intList.add(100);
		intList.add(100000);
		intList.add(2000);
		
		Integer maxNum = myInterface.getMaxNum(intList);
		System.out.println("Maximum integer in the list is "+maxNum);
		
	}

}
