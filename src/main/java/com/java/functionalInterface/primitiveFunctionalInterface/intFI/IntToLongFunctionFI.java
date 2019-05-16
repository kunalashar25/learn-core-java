package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionFI
{
	// takes int as an input argument and returns long

	public static void main(String[] args)
	{
		IntToLongFunction i = (x) -> Long.MAX_VALUE - x;
		System.out.println(i.applyAsLong(2)); // Output: 9223372036854775805
	}
}
