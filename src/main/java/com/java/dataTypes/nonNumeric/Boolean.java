package com.java.dataTypes.nonNumeric;

public class Boolean {
	// Size: N\A
	// Range: N\A
	public static void main(String[] args) {
		// boolean b = 0; compile tile error: Type mismatch: cannot convert from
		// int to boolean

		// boolean b = True; compile tile error: True cannot be resolved to a
		// variable

		// boolean b = "True"; compile tile error: Type mismatch: cannot convert
		// from String to boolean

		boolean b = true;
		boolean c = false;

		System.out.println(b);
		System.out.println(c);

		// compile time error. Type mismatch: Found int Required boolean
		/*
		 * while(1) { System.out.println("1"); }
		 *
		 * if(1) { System.out.println("1"); }
		 */
	}

}
