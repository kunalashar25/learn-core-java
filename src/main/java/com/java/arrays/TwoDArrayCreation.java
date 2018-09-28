package com.java.arrays;

public class TwoDArrayCreation
{

	public static void main(String[] args)
	{
		// In java 2D array not implemented by using matrix representation. Some
		// people followed array or arrays approach for multi-dimensional array
		// creation. The main advantage of this approach is memory utilization
		// will be improved.

		/** 2 dimensional array with variable sizes **/
		// 2 is base size of this array
		int[][] x = new int[2][];
		x[0] = new int[2];
		x[1] = new int[3];
	}

}
