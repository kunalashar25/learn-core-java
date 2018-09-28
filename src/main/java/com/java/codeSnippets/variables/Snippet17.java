package com.java.codeSnippets.variables;

public class Snippet17
{
	public static void main(String[] args)
	{
		final int a;
		System.out.println("Hi"); // Output: HI
	}
}

/** Reasoning **/
// Code runs properly as final local variable is declared but not used anywhere. We'll get compile time error if we use
// local variable without initializing.
