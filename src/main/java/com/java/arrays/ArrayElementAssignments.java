package com.java.arrays;

public class ArrayElementAssignments
{

	public static void main(String[] args)
	{
		// Case 1: In case of primitive type arrays, as array elements we can
		// provide any type which can be implicitly promoted to declared type.

		int[] x = new int[5];
		x[0] = 10;
		x[1] = 'a';

		byte b = 20;
		x[2] = b;

		short s = 30;
		x[3] = s;

		// x[4] = 10L; CE: Possible loss of precision. Required int Found long.

		// In-case of float type arrays, the allowed data types are:
		// byte, short, char, int, long, float

		// Case 2: In case of object type arrays, as array elements we can
		// provide either declared type objects or its child class objects

		// Example 1
		Object[] obj = new Object[10];
		obj[0] = new Object();
		obj[1] = new String("test");
		obj[2] = new Integer(10);

		// Example 2: Abstract class type arrays
		Number[] num = new Number[10];
		num[0] = new Integer(10);
		num[1] = new Double(10.5);
		// num[2] = new String("test"); CE: Incompatible Types.APP_TIME Found
		// String Required Number

		// Case 3: For interface type arrays as array elements its impl class
		// objects are allowed.

		// Example
		Runnable[] run = new Runnable[10];
		run[0] = new Thread();

		// run[1] = new String("test"); CE: Incompatible Types. Found
		// java.lang.String Required java.lang.Runnable
	}
}