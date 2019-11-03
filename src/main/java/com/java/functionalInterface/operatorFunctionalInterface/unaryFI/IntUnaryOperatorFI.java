package com.java.functionalInterface.operatorFunctionalInterface.unaryFI;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorFI {
	// 1. To be used when input type and return type are int type.

	// 2. It is a child of Function interface.

	public static void main(String[] args) {
		IntUnaryOperator o = i -> i * i;
		System.out.println(o.applyAsInt(5)); // Output: 25
	}
}
