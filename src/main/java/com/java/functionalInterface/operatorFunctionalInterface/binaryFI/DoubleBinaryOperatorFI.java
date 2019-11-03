package com.java.functionalInterface.operatorFunctionalInterface.binaryFI;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorFI {
	// 1. Used for two input types when both input types are same and return type is also same.

	// 2. It is a child of BiFunction

	public static void main(String[] args) {
		DoubleBinaryOperator o = (a, b) -> a * b;
		System.out.println(o.applyAsDouble(5.0, 2.2)); // Output: 11.0
	}
}
