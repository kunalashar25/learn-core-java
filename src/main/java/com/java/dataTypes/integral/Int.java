package com.java.dataTypes.integral;

public class Int {
	// Size: 4 Bytes
	// Range: -2 power 31 to 2 power 31 -1

	public static void main(String[] args) {
		int a = 2147483647; // max range
		// int b = 2147483648; compiletime error: out of range

		// int c = 2147483648L; compiletime error:Type mismatch: cannot convert
		// from long to int

		System.out.println(a); // Output: 2147483647

	}

}
