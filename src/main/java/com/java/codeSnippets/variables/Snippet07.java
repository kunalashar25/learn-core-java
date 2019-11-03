package com.java.codeSnippets.variables;

public class Snippet07 {

	public static void main(String[] args) {
		int a, b, c;

		a = b = c = 10;

		String p, q, r;

		p = q = r = "String";

		System.out.println(a); // Output: 10
		System.out.println(b); // Output: 10
		System.out.println(c); // Output: 10

		System.out.println(p); // Output: String
		System.out.println(q); // Output: String
		System.out.println(r); // Output: String
	}

}
/**
 * Reasoning
 **/
// We can declare multiple variables of same type on a single line.