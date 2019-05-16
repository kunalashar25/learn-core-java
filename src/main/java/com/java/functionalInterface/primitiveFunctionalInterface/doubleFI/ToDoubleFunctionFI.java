package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionFI
{
	// return type is double but input can be of any type.

	public static void main(String[] args)
	{
		ToDoubleFunction<Integer> i = (x) -> Math.sin(x);

		System.out.println(i.applyAsDouble(Integer.MAX_VALUE)); // Output: -0.7249165551445564
	}
}
