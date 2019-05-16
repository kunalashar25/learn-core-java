package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntPredicate;

public class IntPredicateFI
{
	// 1. Using Predicate<Integer> functional interface, java internally used to perform lot of autoBoxing and unBoxing
	// (Integer to int and vice-versa) tasks which impacts overall performance.

	// 2. To avoid this issue, Primitive Functional Interfaces were introduced.

	// 3. Now instead of using Predicate<Integer>, we can directly use IntPredicate which will always accept int as
	// input parameter.

	public static void main(String[] args)
	{
		// Example 1
		int[] x = { 5, 10, 15, 20, 25, 30 };
		IntPredicate p = i -> i % 2 == 0;

		for (int x1 : x)
		{
			if (p.test(x1))
				System.out.println(x1);
		}
		// Output:
		// 10
		// 20
		// 30		
	}
}
