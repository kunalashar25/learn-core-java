package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.ToIntFunction;

public class ToIntFunctionFI
{
	// return type is int but input can be of any type.

	public static void main(String[] args)
	{
		ToIntFunction<String> i = (x) -> Integer.parseInt(x);

		System.out.println(i.applyAsInt("2")); // Output: 2
	}
}
