package com.java.arrays;

public class ArrayVariableAssignments {

	public static void main(String[] args) {
		// Case 1: Element level promotions are not applicable at array level.
		// Example, char element can be promoted to int type whereas char[]
		// cannot be promoted to int[].

		// Example
		int[] a = {10, 20, 30, 40};
		char[] ch = {'a', 'b', 'c'};

		int[] b = a;

		// int[] c = ch; CE: Incompatible types. Cannot convert from char[] to
		// int[]

		// Which of the following operation will be performed automatically.

		// Valid
		// char to int
		// int to double
		// String to Object
		// String[] to Object[]

		// Invalid
		// char[] to int[]
		// int[] to double[]
		// float to int
		// float[] to int[]

		// Note: In-case of Object[] child class type array can be promoted to
		// parent class type array

		// Example
		String[] s = {"a", "b", "c"};
		Object[] obj = s;
		System.out.println(obj[0]);

		// Case 2: Whenever we're assigning one array to another array, internal
		// elements won't be copied, just reference variable will be reassigned.
		// Refer: ArrayReferenceVariableAssignment.PNG

		// Example:
		int[] c = {10, 20, 30, 40};
		int[] d = {50, 60};

		d = c;
		System.out.println(d.length); // Output: 4

		// Case 3: Whenever we're assigning one array to another array the
		// dimensions must be matched. Example, in the place of 1D int[] we
		// should provide 1D array only. if we're trying to provide any other
		// dimension then we'll get compile time error.

		int[][] e = new int[3][];

		// e[0] = new int[4][3]; CE: Incompatible Types. Found int[][] Required
		// int[]

		// e[0] = 10; CE: Incompatible Types. Found int Required int[]

		e[0] = new int[3]; // Valid

		// Note: Whenever we're assigning one array to another array both
		// dimension and type must be matched but sizes are not required to
		// match.

	}

}
