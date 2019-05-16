package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoubleFunction;

public class DoubleFunctionFI
{
	// accepts double value as argument
	public static void main(String[] args)
	{
		DoubleFunction<String> f = d -> d + " in String format";
		System.out.println(f.apply(5.03)); // Output: 5.03 in String format
	}
}
