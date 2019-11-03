package com.java.codeSnippets.variables;

public class Snippet19 {

	public static void main(String[] args) {
		final int a;
		a = 10;
		System.out.println(a); // Output: 10
	}
}

/**
 * Reasoning
 **/
// Code runs fine as we're initializing final variable only once and we're using it post initialization.
