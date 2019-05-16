package com.java.functionalInterface.operatorFunctionalInterface.binaryFI;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorFI
{
	// 1. Used for two input types when both input types are same and return type is also same.

	// 2. It is a child of BiFunction

	public static void main(String[] args)
	{
		LongBinaryOperator o = (a, b) -> a * b;
		System.out.println(o.applyAsLong(5, 2)); // Output: 10
	}
}
