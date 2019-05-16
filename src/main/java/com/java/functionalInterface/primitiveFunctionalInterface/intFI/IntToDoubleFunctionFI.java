package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionFI
{
	// take int as an argument and returns double
	
	public static void main(String[] args)
	{
		IntToDoubleFunction i = (x) ->
		{
			return Math.sin(x);
		};
		System.out.println(i.applyAsDouble(2)); // Output: 0.9092974268256817
	}
}
