package com.javabotanist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HanlingCheckedExceptionClientTest2 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 0, 20);
		integers.forEach(throwingConsumerWrapper(i -> System.out.println(50/i)));
	}

	private static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {
		return i -> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

}
