package com.javabotanist;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HanlingCheckedExceptionClientTest {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 0, 20);
		integers.forEach(i -> {
			try {
				writeToFile(i);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}

	private static Object writeToFile(Integer i) throws IOException {
		return null;
	}

}
