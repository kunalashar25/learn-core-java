package com.java.codeSnippets.variables;

public class Snippet12 {

	public static void main(String[] args) {
		int a = a = 10;
		System.out.println(a); // Output: 10
	}
}
/**
 * Reasoning
 **/
// In this case, a = a = 10 expression will be evaluated from Right to Left. So 10 value will be assign to second a
// variable and then value of second a will be assigned to the first a. Hence, no error.
