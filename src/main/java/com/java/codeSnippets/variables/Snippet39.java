package com.java.codeSnippets.variables;

public class Snippet39 {
	String email;

	public static void main(String[] args) {
		System.out.println(email);
	}
}
/**
 * Reasoning
 **/
// CE: Cannot make a static reference to the non-static field email as email is non-static variable and we're using it
// inside static method.
