package com.javabotanist.interfacesimpl;

import java.util.Collections;
import java.util.List;

import com.javabotanist.interfaces.MyInterface;
import com.javabotanist.interfaces.MyInterface2;

public class MyClass implements MyInterface, MyInterface2 {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);
		return max;
	}

	@Override
	public void display() {
		MyInterface.super.display();
		MyInterface2.super.display();
	}

}
