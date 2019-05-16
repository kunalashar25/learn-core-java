package com.java.functionalInterface.operatorFunctionalInterface.binaryFI;

import java.util.function.BinaryOperator;

public class BinaryOperatorFI
{
	// 1. Used for two input types when both input types are same and return type is also same.

	// 2. It is a child of BiFunction

	public static void main(String[] args)
	{
		BinaryOperator<Integer> o = (a, b) -> a * b;
		System.out.println(o.apply(5, 3)); // Output: 15
	}
}
