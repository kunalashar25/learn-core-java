package com.java.codeSnippets.variables;

public class Snippet10 {

	public static void main(String[] args) {
		int b, c;
		int a = b = c = 10;

		System.out.println(a); // Output: 10
		System.out.println(b); // Output: 10
		System.out.println(c); // Output: 10

	}

}
/**
 * Reasoning
 **/
// We can declare and initialize multiple variables of same type on a single line.
