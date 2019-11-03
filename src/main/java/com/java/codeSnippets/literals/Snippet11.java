package com.java.codeSnippets.literals;

public class Snippet11 {

	public static void main(String[] args) {
		char ch = '\';
		System.out.println(ch);
	}

}
/**
 * Reasoning
 **/
// CE: Invalid character constant as \ is used as an escape sequence followed by symbol or char. For example: \\, \n, \t
