package com.java.codeSnippets.variables;

public class Snippet22 {

	public static void main(String[] args) {
		final int a = 10;
		System.out.println(a); // Output: 10
		System.out.println(a + 30); // Output: 40
	}
}
/**
 * Reasoning
 **/
// Code runs fine as we're not reinitializing variable a, we're just adding new number with variable a and priting it on
// console.
