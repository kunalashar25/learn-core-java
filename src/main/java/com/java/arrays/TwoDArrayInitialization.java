package com.java.arrays;

public class TwoDArrayInitialization
{

	public static void main(String[] args)
	{
		int[][] x = new int[2][3];

		System.out.println(x); // reference variable to 2D array.
								// Output: [[I@15db9742

		System.out.println(x[0]); // reference variable to 1D array.
									// Output: [I@6d06d69c

		System.out.println(x[0][0]); // Output: 0

		// Only base size is provided.
		int[][] y = new int[2][];

		System.out.println(y); // reference variable to 2D array.
								// Output: [[I@15db9742

		System.out.println(y[0]); // Output: null as col size is not provided.

		System.out.println(y[0][0]); // RE: NullPointerException as we're trying
										// to print a cell value which is not
										// yet created.

		// if we're trying to perform any operation on null then we'll get
		// runtime exception saying NullPointerException
	}

}
