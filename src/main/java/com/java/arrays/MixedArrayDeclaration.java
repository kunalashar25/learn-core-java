package com.java.arrays;

public class MixedArrayDeclaration
{

	public static void main(String[] args)
	{
		int[] a, b; // a=1, b=1
		int[] c[], d; // c=2, d=1
		int[] e[], f[]; // e=2, f=2
		int[][] g, h; // g=2, h=2
		int[][] i, j[]; // i=2, j=3

		// if we want to specify dimension before the variable that facility is applicable only for first variable in
		// declaration.
		// if we're trying to apply for remaining variables, we'll get compile time error.
		// int[] []k, []l;
	}

}
