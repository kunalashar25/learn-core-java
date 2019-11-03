package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerFI {
	// accept one argument as Object type and second argument is of double type.

	public static void main(String[] args) {
		ObjDoubleConsumer<String> c = (s, d) -> System.out.println(s + d);
		c.accept("Hello World ", 123.5); // Output: Hello World 123.5
	}
}
