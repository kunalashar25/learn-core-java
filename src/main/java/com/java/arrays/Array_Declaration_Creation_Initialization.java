package com.java.arrays;

public class Array_Declaration_Creation_Initialization
{
	public static void main(String[] args)
	{
		// 1D array
		int[] x = { 10, 20, 30 };
		char[] ch = { 'a', 'b', 'c', 'd' };
		String[] s = { "abc", "pqr", "xyz" };

		// 2D array
		int[][] y = { { 10, 20 }, { 30, 40, 50 } };

		// 3D array
		int[][][] z = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 15, 25, 35 }, { 45, 55, 65 } } };
		System.out.println(z[0][0][0]);

		// Note: always create memory representation of any idea to get better
		// insight on indexed values. Refer: ArrayMemoryRepresentation.PNG

		// if we're trying to divide into multiple lines then we'll get compile
		// time error.

		// Example

		// int[] j;
		// j={10,20,30}; CE: Illegal start of expression.

	}
}
