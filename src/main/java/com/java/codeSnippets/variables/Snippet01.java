package com.java.codeSnippets.variables;

public class Snippet01
{

	public static void main(String[] args)
	{
		int a;
		System.out.println(a);
	}

}

/** Reasoning **/
// CE: The local variable a may not have been initialized
// We'll get compile time error as a is a local variable of main method and we must initialize it before using it.
