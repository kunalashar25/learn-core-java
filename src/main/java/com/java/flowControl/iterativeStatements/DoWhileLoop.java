package com.java.flowControl.iterativeStatements;

public class DoWhileLoop
{

	public static void main(String[] args)
	{
		// If we want to execute loop body at-least once then we should go for do-while

		// Syntax
		do
		{
			System.out.println("In do");
		} while (false);

		// Curly braces are optional in do-while loop and without curly braces we can take only one statement between do
		// and while which should not be declarative statement.

		/** Valid Examples **/

		// Example 1
		do
			System.out.println("hello");
		while (false);

		// Example 2
		do
			; while (false);

		// Example 3
		do
		{
			int x = 10;
		} while (false);

		// Example 4
		// Only 1 statement is present between do and while i.e. while (true). SYSO is present under while (true) hence
		// there is no compile time error.
		// do
		// while (true)
		// System.out.println("Hi"); // Output: hi infinite times.
		// while (false);

		// Example 5
		do
		{
			System.out.println("Hello");
		} while (false);
		System.out.println("Hi"); // Output: hello hi

		// Example 6
		int a = 10, b = 20;
		do
		{
			System.out.println("hello");
		} while (a < b);
		System.out.println("hi"); // Output: hello hello .......

		// Example 7
		do
		{
			System.out.println("hello");
		} while (a > b);
		System.out.println("hi"); // Output: hello Hi

		// Example 8
		final int p = 10, q = 10;
		do
		{
			System.out.println("Hello");
		} while (p > q);
		System.out.println("Hi"); // Output: Hello hi

		/** Invalid Examples **/

		// Example 1
		// do
		// int x=10; CE: as declarative statement post do statement
		// while(false);

		// Example 2
		// do // as there is no body between do and while, semicolon is expected after do
		// while(false);

		// Example 3
		// do
		// {
		// System.out.println("Hello");
		// }while(true);
		// System.out.println("Hi"); CE: unreachable statement

		// Example 4
		do
		{
			System.out.println("Hello");
		} while (p < q);
		System.out.println("Hi"); // CE: unreachable statement

	}

}
