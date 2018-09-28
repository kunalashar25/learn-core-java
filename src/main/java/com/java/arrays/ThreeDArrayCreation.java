package com.java.arrays;

public class ThreeDArrayCreation
{

	public static void main(String[] args)
	{
		/** 3 dimensional array with variable sizes **/
		// 2 is base size of this array
		int[][][] y = new int[2][][];
		y[0] = new int[3][];
		y[0][0] = new int[1];
		y[0][1] = new int[2];
		y[0][2] = new int[3];

		y[1] = new int[2][];
		y[0][0] = new int[2];
		y[0][1] = new int[2];
	}

}
