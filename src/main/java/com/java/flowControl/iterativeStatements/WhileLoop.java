package com.java.flowControl.iterativeStatements;

public class WhileLoop {

	public static void main(String[] args) {

		// 1. If we don't know number of iterations in advance then we should go for while loop.

		// Example
		/*
		 * while (rs.next()) {
		 *
		 * }
		 *
		 * while (e.hasMoreElements()) {
		 *
		 * }
		 *
		 * while (itr.hasNext()) {
		 *
		 * }
		 */

		// Syntax
		boolean b = true;
		while (b) {
			System.out.println("In while");
			b = false;
		}

		// 2. The argument should be boolean type. If we're providing any other type then we'll get compile time error.

		// Example
		// while (1) // CE: Incompatible types. Found int Required boolean
		// {
		// }

		// 3. Curly braces are optional for while loop. Without curly braces we can take only one statement under while
		// which should not be declarative statement.

		/** Valid Examples **/

		// Example 1

		while (b) {
			System.out.println("Hello");
		}

		// Example 2

		while (b)
			;

		// Example 3

		while (b) {
			int x = 10;
		}

		// Example 4

		int a = 10, c = 20;
		while (a < c) // valid example as value of a and c can be changes inside while loop
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");

		// Example 5

		while (a > c)// valid example as value of a and c can be changes inside while loop
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");

		/** Invalid Example **/

		// Example 1

		// while(true)
		// int x = 10;

		// Example 2

		// while (true)
		// {
		// System.out.println("Hello");
		// }
		// System.out.println("Hi"); This line is unreachable as while is always true

		// Example 3

		// while (false)
		// { This line is unreachable as while is always flase
		// System.out.println("Hello");
		// }
		// System.out.println("Hi");

		// Example 4

		// final int p = 10, q = 20;
		// while (p < q)
		// {
		// System.out.println("Hello");
		// }
		// System.out.println("Hi"); This line is nonreachable as value of p and q will never change

		// Example 5

		// while (p > q)
		// { // This line is nonreachable as value of p and q will never change
		// System.out.println("Hello");
		// }
		// System.out.println("Hi");

		// Note:
		// 1. Every final variable will be replaced by the value at compile time only.
		final int x = 10;
		int y = 20;
		System.out.println(a); // After Compilation: System.out.println(10);
		System.out.println(b); // After Compilation: System.out.println(b);

		// 2. If every argument is a final variable(compile time constant) then that operation should be performed at
		// compile time only.

		final int p = 10, q = 20;
		int r = 20;

		System.out.println(p + q); // After Compilation: System.out.println(30);
		System.out.println(p + r); // After Compilation: System.out.println(10+r);
		System.out.println(p < q); // After Compilation: System.out.println(true);
		System.out.println(p < r); // After Compilation: System.out.println(10<r);
	}

}
