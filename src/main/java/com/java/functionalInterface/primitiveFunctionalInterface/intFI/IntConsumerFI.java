package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntConsumer;

public class IntConsumerFI {
	// accepts int value as argument

	public static void main(String[] args) {
		IntConsumer ic = (x) -> System.out.println(x);
		ic.accept(3); // Output: 3
	}
}
