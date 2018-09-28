package com.java.varargs;

public class Equivalence_VarArg_Vs_1D_Array
{

	public static void main(String... args)
	{
		/** Equivalence between var-arg parameter and 1D array **/

		// Case 1: Where ever 1D array present, we can replace it with var-arg parameter. Refer parameter of main
		// method.

		// Example
		// main(String[] args) can be replaced with main(String... args)

		// Case 2: where ever var-arg parameter present, we can't replace with 1D array as we pass int values or no
		// value to var-arg whereas int[] requires input in array format.

		// Example
		// m1(int... x) replace with m1(int[] x)

		/* Note: */
		// m1(int... x) we can call this method by passing a group of int values and x will become 1D array.
		// m1(int[]... x) we can call this method by passing a group of 1D int arrays and x will become 2D array.

		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60 };

		m1(a, b); // we're calling m1 with group of 1D array. We called with 2 arrays, hence base size of x is 2
	}

	public static void m1(int[]... x) // x is now a 2D array having 2 1D arrays
	{
		for (int[] x1 : x)
		{
			System.out.println(x1[0]); // printing first element of both 1D array.
		}
	}

}
