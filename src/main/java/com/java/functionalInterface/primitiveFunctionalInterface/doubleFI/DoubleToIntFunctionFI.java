package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionFI
{
	public static void main(String[] args)
	{
		DoubleToIntFunction f = i -> (int) i * 2;
		System.out.println(f.applyAsInt(5.3)); // Output: 10
	}
}
