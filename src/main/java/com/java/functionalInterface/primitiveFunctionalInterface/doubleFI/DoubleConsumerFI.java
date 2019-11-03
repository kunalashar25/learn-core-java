package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoubleConsumer;

public class DoubleConsumerFI {
	// accepts double value as argument

	public static void main(String[] args) {
		DoubleConsumer c = (x) -> System.out.println(x * x);
		c.accept(2.5); // Output: 6.25
	}
}
