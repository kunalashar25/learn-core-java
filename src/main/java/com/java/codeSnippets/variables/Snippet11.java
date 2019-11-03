package com.java.codeSnippets.variables;

public class Snippet11 {

	public static void main(String[] args) {
		int a, b;
		int c = 10, a = 20, b = 30;
	}
}
/**
 * Reasoning
 **/
// CE: Duplicate local variable a. Duplicate local variable b
// As we have already declared a and b on first line, we canno't initialize variable on same line where a new variable
// is being declared.
