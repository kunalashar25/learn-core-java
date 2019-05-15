package com.java.functionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFI
{
	// 1. Used to supply required objects and doesn't require any input.

	// 2. Contains only one method:
	// Syntax: T get(); T represents type of result supplied to this supplier.

	public static void main(String[] args)
	{
		// Example 1
		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get()); // Output: Wed May 15 15:29:29 SGT 2019

		// Example 2
		Supplier<String> s2 = () ->
		{
			String otp = "";
			for (int i = 0; i < 6; i++)
			{
				otp = otp + (int) (Math.random() * 10);
			}

			return otp;
		};

		System.out.println(s2.get()); // Output: 399780
	}
}
