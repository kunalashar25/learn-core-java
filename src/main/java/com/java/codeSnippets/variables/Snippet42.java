package com.java.codeSnippets.variables;

public class Snippet42 {
	static char val;

	public static void main(String[] args) {
		System.out.println(val == 0); // Output: true
	}

}
/**
 * Reasoning
 **/
// Output is displayed as true because default value for val is non printable blank value in unicode which is same as 0
// or \u0000.
