package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionFI
{
	// accepts two input argument of any type but return type must be long.

	public static void main(String[] args)
	{
		ToLongBiFunction<String, String> i = (x, y) -> Long.parseLong(x) + Long.parseLong(y);

		System.out.println(i.applyAsLong("2", "2")); // Output: 4
	}
}
