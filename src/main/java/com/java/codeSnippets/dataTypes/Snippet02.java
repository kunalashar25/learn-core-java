package com.java.codeSnippets.dataTypes;

public class Snippet02
{
	public static void main(String[] args)
	{
		Char c = new Char();
		c.show();
	}
}

class Char
{
	char ch;

	void show()
	{
		System.out.println(ch); // Output:
		System.out.println(ch == 0); // Output: true
		System.out.println(ch == ' '); // Output: false
		System.out.println(ch == '\u0000'); // Output: true
	}
}

/** Reasoning **/
// to be checked
