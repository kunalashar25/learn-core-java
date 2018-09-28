package com.java.codeSnippets.variables;

public class Snippet24
{

	public static void main(String[] args)
	{
		final String str = "HI";
		str = "Hi Java";
		System.out.println(str);

	}

}
/** Reasoning **/
// CE: The final local variable str cannot be assigned. as we're assigning new value to final variable str.
