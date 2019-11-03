package com.java.flowControl.selectionStatements;

public class If_Else {
	static boolean b;

	public static void main(String[] args) {
		// Syntax
		if (b) {
			System.out.println(b);
		} else {
			System.out.println(b);
		}

		// argument to the if statement should be boolean type. For any other type, we'll get compile time error.

		// else part and curly braces are optional. Without curly braces, only one statement is allowed under if. Which
		// should not be declarative statement.

		// Valid Examples

		// Example 1
		if (true)
			System.out.println("Hello");

		// Example 2
		if (true)
			;

		// Example 3
		if (true) {
			int a = 10;
		}

		// InValid Example
		// if(true)
		// int x = 10;

		// Scope of local variable is limited to { } of any block. In this case, only one line is permitted to if. So x
		// will never be used anywhere in the code. Hence compiler throws error.

		// semicolon is a valid java statement which is also known as empty statement.

		// There is no dangling else problem in java. Every else is mapped to the nearest if statement.

		if (true)
			if (false)
				System.out.println("false");
			else
				System.out.println("else false");

		// Output: else false
	}

}
