package com.javabotanist.interfacesimpl;

import java.util.Collections;
import java.util.List;

import com.javabotanist.interfaces.MyInterface;

public class MyClass implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);
		return max;
	}

}
