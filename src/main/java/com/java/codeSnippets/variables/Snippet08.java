package com.java.codeSnippets.variables;

public class Snippet08
{

	public static void main(String[] args)
	{
		String a = "Hello", b = "Java";
		System.out.println(a); // Output: Hello
		System.out.println(b); // Output: Java

		int p = 10, q = 20;
		System.out.println(p); // Output: 10
		System.out.println(q); // Output: 20

		String a1, b1;
		String c = a1 = b1 = "Hi";
		System.out.println(a1); // Output: Hi
		System.out.println(b1); // Output: Hi
		System.out.println(c); // Output: Hi

	}

}
/** Reasoning **/
// We can declare and initialize multiple variables of same type on a single line.