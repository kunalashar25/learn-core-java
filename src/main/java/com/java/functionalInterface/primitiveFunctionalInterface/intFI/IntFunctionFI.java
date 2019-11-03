package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntFunction;

public class IntFunctionFI {
	// 1. It takes input as int but return type can be of any type. Same is applicable for all primitive function.

	public static void main(String[] args) {
		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(5)); // Output: 25
		System.out.println(f.apply(8)); // Output: 64
	}
}
