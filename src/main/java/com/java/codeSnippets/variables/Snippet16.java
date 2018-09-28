package com.java.codeSnippets.variables;

public class Snippet16
{

	public static void main(String[] args)
	{
		final int a = 10;
		System.out.println(a);

		a = 20;
		System.out.println(a);

	}

}
/** Reasoning **/
// CE: The final local variable a cannot be assigned as final variable cannot be re-initialized.