package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionFI
{
	public static void main(String[] args)
	{
		DoubleToLongFunction f = i -> (long) i * 3;
		System.out.println(f.applyAsLong(10.52)); // Output: 30
	}
}
