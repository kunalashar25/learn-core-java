package com.java.functionalInterface.operatorFunctionalInterface.unaryFI;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorFI
{
	// 1. To be used when input type and return type are double type.

	// 2. It is a child of Function interface.

	public static void main(String[] args)
	{
		DoubleUnaryOperator o = i -> i * i;
		System.out.println(o.applyAsDouble(5.5)); // Output: 30.25
	}
}
