package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionFI
{
	// accepts two input argument of any type but return type must be double.

	public static void main(String[] args)
	{
		ToDoubleBiFunction<Integer, Long> i = (x, y) -> Math.sin(x) + Math.sin(y);

		System.out.println(i.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE)); // Output: 0.27501382152888576
	}
}
