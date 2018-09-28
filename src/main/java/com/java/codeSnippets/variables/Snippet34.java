package com.java.codeSnippets.variables;

public class Snippet34
{

	public static void main(String[] args)
	{
		char ch;
		System.out.println(ch == 0);
	}
}
/** Reasoning **/
// CE: The local variable ch may not have been initialized. If ch would be declared as instance or static variable then
// output will be true as default value for ch is non printable blank value in unicode which is same as 0 or \u0000.
