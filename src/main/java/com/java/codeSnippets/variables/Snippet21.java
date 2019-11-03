package com.java.codeSnippets.variables;

public class Snippet21 {
	public static void main(String[] args) {
		const int a = 10;
		System.out.println(a);
	}
}
/**
 * Reasoning
 **/
// CE: Syntax error on token "const", delete this token as const is a java reserved keyword. It is no longer in use in
// Java, it is supported in C and C++. const is replaced by final in java.