package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.ToLongFunction;

public class ToLongFunctionFI
{
	// return type is long but input can be of any type.
	public static void main(String[] args)
	{
		ToLongFunction<String> i = (x) -> Long.parseLong(x);

		System.out.println(i.applyAsLong("2")); // Output: 2
	}
}
