package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongSupplier;

public class LongSupplierFI {
	// represents supplier of long value result

	public static void main(String[] args) {
		LongSupplier i = () -> Long.MAX_VALUE;

		System.out.println(i.getAsLong()); // Output: 9223372036854775807
	}
}
