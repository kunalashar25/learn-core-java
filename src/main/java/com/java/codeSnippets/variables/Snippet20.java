package com.java.codeSnippets.variables;

public class Snippet20 {

	public static void main(String[] args) {
		final int a;
		a = 10;
		System.out.println(a);

		a = 20;
		System.out.println(a);
	}

}
/**
 * Reasoning
 **/
// CE: The final local variable a may already have been assigned as a is a final variable and we cannot initialize it
// twice.
