package com.java.arrays;

public class OneDArrayCreation {
	public static void main(String[] args) {
		// every array in java is an Object. Hence, we can create arrays by
		// using new operator.
		int[] a = new int[3];

		// for every array type corresponding classes are available and these
		// classes are part of java language and not available to the programmer
		// level

		System.out.println(a.getClass().getName());
		// output: [I
		// square bracket as it is an array and I for integer type.

		float[] b = new float[3];
		System.out.println(b.getClass().getName());
		// output: [F
		// square bracket as it is an array and F for float type.

		byte[] c = new byte[3];
		System.out.println(c.getClass().getName());
		// output: [B

		boolean[] d = new boolean[3];
		System.out.println(d.getClass().getName());
		// output: [Z

		short[] e = new short[3];
		System.out.println(e.getClass().getName());
		// output: [S

		int[][] f = new int[3][3];
		System.out.println(f.getClass().getName());
		// output: [[I

		/** loop holes in array creation **/
		// at time of array creation it is mandatory to provide size of array
		// otherwise we'll get compile time error.
		// int[] g = new int[]; Example

		// it is legal to have an array with size 0 in java
		int[] g = new int[0]; // Example

		// if we're specifying array size with negative int value then we'll get
		// run time exception saying: java.lang.NegativeArraySizeException
		// int[] h = new int[-6];

		// to specify array size allowed data types are byte\short\char\int. If
		// we're trying to specify any other type then we'll get compile time
		// error.
		char ch = 'a';
		int[] i = new int[ch];
		System.out.println(i.length); // output: 97

		byte by = 20;
		int[] i1 = new int[by];
		System.out.println(i1.length); // output: 20

		short s = 30;
		int[] i2 = new int[s];
		System.out.println(i2.length); // output: 30

		// max size of array is equal to max size on int data type i.e.
		// 2147483647

		int[] j = new int[2147483647]; // valid. We may get runtime exception
		// for java.lang.OutOfMemoryError:
		// Requested array size exceeds VM limit
		// if sufficient heap memory is not
		// available

		// int[] j1 = new int[2147483648]; CE: integer number too large
	}
}
