package com.java.codeSnippets.variables;

public class Snippet38
{
	static String str;

	public static void main(String[] args)
	{
		System.out.println(str); // Output: null
	}
}
/** Reasoning **/
// JVM assigns default value to instance and static variable. Default value for String is null, Hence null is printed.
