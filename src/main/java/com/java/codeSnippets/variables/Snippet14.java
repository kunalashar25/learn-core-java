package com.java.codeSnippets.variables;

public class Snippet14
{

	public static void main(String[] args)
	{
		int a = b, b = 10;

		System.out.println(a);
		System.out.println(b);
	}
}

/** Reasoning **/
// CE: b cannot be resolved to a variable as b is assigned to a before it is declared.
