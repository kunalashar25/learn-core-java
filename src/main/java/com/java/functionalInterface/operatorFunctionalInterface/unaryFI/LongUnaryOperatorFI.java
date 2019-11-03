package com.java.functionalInterface.operatorFunctionalInterface.unaryFI;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorFI {
	// 1. To be used when input type and return type are long type.

	// 2. It is a child of Function interface.

	public static void main(String[] args) {
		LongUnaryOperator o = i -> i * i;
		System.out.println(o.applyAsLong(8)); // Output: 64
	}
}
