package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerFI {
	// accept one argument as Object type and second argument is of long type.

	public static void main(String[] args) {
		ObjLongConsumer<String> i = (s, d) -> System.out.println(s + d);

		i.accept("Hi ", Long.MAX_VALUE); // Output: Hi 9223372036854775807
	}
}
