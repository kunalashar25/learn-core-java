package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoubleSupplier;

public class DoubleSupplierFI {
	// represents a supplier of double value result.

	public static void main(String[] args) {
		DoubleSupplier s = () ->
		{
			return 3.14d;
		};

		System.out.println(s.getAsDouble()); // Output: 3.14
	}
}
