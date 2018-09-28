package com.java.codeSnippets.variables;

public class Snippet40
{

	public static void main(String[] args)
	{
		int a = 10;
		int b = a;

		System.out.println(a); // Output: 10
		System.out.println(b); // Output: 10

		b = 30;
		System.out.println(a); // Output: 10
		System.out.println(b); // Output: 20
	}

}
