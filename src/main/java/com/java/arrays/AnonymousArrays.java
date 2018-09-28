package com.java.arrays;

public class AnonymousArrays
{

	public static void main(String[] args)
	{
		// Array without name is known as anonymous array. Created just for one
		// time use.

		// We can create anonymous array as follows:

		// Array Declaration
		sum(new int[] { 10, 20, 30 });

		// While creating anonymous array we can't specify the size other wise
		// we'll get compile time error. See below:

		// sum(new int[3] { 10, 20, 30 }); CE: Cannot define dimension
		// expressions when an array initializer is provided
	}

	public static void sum(int[] x)
	{
		int total = 0;
		for (int i : x)
		{
			total = total + i;
		}
		System.out.println("Total: " + total);
	}

	// we can also create multi-dimensional anonymous arrays.
	// new int[][] {{10,20},{30,40,50}};

	// Based on our requirement we can give the name for anonymous array then it
	// is no longer anonymous.
	int[] x = new int[] { 10, 20, 30 };

	// In the above example just to call some method we required an array but
	// after completing some method call we're not using that array anymore
	// hence for this one time requirement anonymous array is the best choice.
}
