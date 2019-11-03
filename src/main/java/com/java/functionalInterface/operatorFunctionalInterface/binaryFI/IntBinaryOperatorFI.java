package com.java.functionalInterface.operatorFunctionalInterface.binaryFI;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorFI {
	// 1. Used for two input types when both input types are same and return type is also same.

	// 2. It is a child of BiFunction

	public static void main(String[] args) {
		IntBinaryOperator o = (a, b) -> a * b;
		System.out.println(o.applyAsInt(5, 2)); // Output: 10
	}
}
