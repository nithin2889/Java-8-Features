package com.javabotanist.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapsUsingForEachClientTest {

	public static void main(String[] args) {
		Map<Integer, Employee> maps = new HashMap<>();
		maps.put(190333, new Employee("Kim", "kim@gmail.com", 20000.00));
		maps.put(190333, new Employee("Trump", "trump@gmail.com", 45000.00));
		maps.put(190333, new Employee("Obama", "obama@gmail.com", 150000.00));
		maps.put(190333, new Employee("Nithin", "nithin@gmail.com", 90000.00));
		
		System.out.println("Method - 1");
		Set<Entry<Integer, Employee>> entrySet = maps.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		System.out.println("Method - 2");
		Set<Integer> keySet = maps.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(maps.get(key));
		}
		
		System.out.println("Method - 3");
		maps.forEach((k, v) -> System.out.println(k + "-" + v));
	}

}
