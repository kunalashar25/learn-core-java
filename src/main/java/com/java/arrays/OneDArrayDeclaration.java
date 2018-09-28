package com.java.arrays;

public class OneDArrayDeclaration
{

	public static void main(String[] args)
	{
		// An array is an indexed collection of fixed number of homogeneous data
		// elements.

		// Main Advantage of arrays is, we can represent huge number of values
		// by using single variable so that readability will be improved but
		// main disadvantage of arrays is it's fixed in sized i.e. once we crate
		// an array there is no chance of increasing\decreasing size based on
		// our requirement. Hence, to use arrays concept compulsory we should
		// know the size in advance, which may not be possible always.

		/** 1D - Array Declaration **/
		int[] a; // valid - best practice as name is separated from type.
		int[] b; // valid
		int c[]; // valid

		// int[5] a; we can't specify size at time of declaration otherwise,
		// we'll get compile time error
	}

}
