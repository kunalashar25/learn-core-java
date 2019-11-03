package com.java.functionalInterface.primitiveFunctionalInterface.booleanFI;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFI {
	// Supplier of boolean values
	public static void main(String[] args) {
		int x = 5, y = 9;
		BooleanSupplier s = () -> x > y;
		System.out.println(s.getAsBoolean()); // Output: false
	}
}
