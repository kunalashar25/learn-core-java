package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongFunction;

public class LongFunctionFI {
	// accept long value as argument and generates a result.

	public static void main(String[] args) {
		LongFunction<String> i = (l) -> Long.toString(l);

		System.out.println(i.apply(Long.MAX_VALUE)); // Output: 9223372036854775807
	}
}
