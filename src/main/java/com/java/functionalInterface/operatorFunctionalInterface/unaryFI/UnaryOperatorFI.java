package com.java.functionalInterface.operatorFunctionalInterface.unaryFI;

import java.util.function.UnaryOperator;

public class UnaryOperatorFI {
	// 1. To be used when input type and return type are same.

	// 2. It is a child of Function interface.

	public static void main(String[] args) {
		UnaryOperator<Integer> o = i -> i * i;
		System.out.println(o.apply(5)); // Output: 25
	}
}
