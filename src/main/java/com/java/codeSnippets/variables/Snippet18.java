package com.java.codeSnippets.variables;

public class Snippet18
{

	public static void main(String[] args)
	{
		final int a;
		System.out.println(a);
	}

}
/** Reasoning **/
// CE: The local variable a may not have been initialized as we're using local variable without initializing.
