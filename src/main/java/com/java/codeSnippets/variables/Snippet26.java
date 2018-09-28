package com.java.codeSnippets.variables;

public class Snippet26
{

	public static void main(String[] args)
	{
		byte b = 128;
		System.out.println(b);

	}

}
/** Reasoning **/
// CE: Type mismatch: cannot convert from int to byte as byte range is -128 to 127. we cannot assign 128 to byte.
