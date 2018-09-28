package com.java.codeSnippets.variables;

public class Snippet09
{

	public static void main(String[] args)
	{
		int a = b = c = 10;
	}

}

/** Reasoning **/
// CE: b cannot be resolved to a variable, c cannot be resolved to a variable
// We'll get compile time error as we have not declared b and c variable.
