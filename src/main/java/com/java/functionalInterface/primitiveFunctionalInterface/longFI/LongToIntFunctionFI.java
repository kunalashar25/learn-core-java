package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionFI
{
	// takes long value as input argument and returns a int value
	public static void main(String[] args)
	{
		LongToIntFunction i = (l) -> (int) l;

		System.out.println(i.applyAsInt(Long.MAX_VALUE)); // Output: -1
	}
}
