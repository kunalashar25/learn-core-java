package com.java.codeSnippets.variables;

public class Snippet03 {
	int a;

	public static void main(String[] args) {
		System.out.println(a);
	}
}

/**
 * Reasoning
 **/
// CE: Cannot make a static reference to the non-static field a
// a is an instance variable and we canno't use instance variable inside a static method main(). To use a inside main()
// method, we must declare it as static.
