package com.java.dataTypes.integral;

public class Long
{
	// Size: 8 Bytes
	// Range: -2 power 63 to 2 power 63 -1

	public static void main(String[] args)
	{
		long a = 2147483649L;

		System.out.println(a);

		// Note: no. of char present in a big file may exceed int range hence
		// return type of length method is long but not int.
		// long l = f.length();
	}

}
