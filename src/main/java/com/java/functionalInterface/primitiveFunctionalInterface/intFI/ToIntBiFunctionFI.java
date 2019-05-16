package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionFI
{
	// accepts two input argument of any type but return type must be int.

	public static void main(String[] args)
	{
		ToIntBiFunction<String, String> i = (x, y) -> Integer.parseInt(x) + Integer.parseInt(y);

		System.out.println(i.applyAsInt("2", "3")); // Output: 5
	}
}
