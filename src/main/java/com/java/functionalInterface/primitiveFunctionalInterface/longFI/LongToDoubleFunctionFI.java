package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionFI
{
	// takes long value as input argument and returns a double value
	public static void main(String[] args)
	{
		LongToDoubleFunction i = (l) -> Math.sin(l);

		System.out.println(i.applyAsDouble(Long.MAX_VALUE)); // Output: 0.9999303766734422
	}
}
