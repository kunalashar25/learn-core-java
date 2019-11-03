package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongConsumer;

public class LongConsumerFI {
	// accepts long value as argument

	public static void main(String[] args) {
		LongConsumer i = (l) -> System.out.println(l);
		i.accept(Long.MAX_VALUE); // Output: 9223372036854775807
	}
}
