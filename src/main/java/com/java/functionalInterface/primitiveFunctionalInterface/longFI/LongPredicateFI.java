package com.java.functionalInterface.primitiveFunctionalInterface.longFI;

import java.util.function.LongPredicate;

public class LongPredicateFI
{
	// return boolean value for provided long value

	public static void main(String[] args)
	{
		LongPredicate i = (l) -> l > 0;

		System.out.println(i.test(Long.MAX_VALUE)); // Output: true
	}
}
