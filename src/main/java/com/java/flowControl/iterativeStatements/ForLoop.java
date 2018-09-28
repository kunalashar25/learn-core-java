package com.java.flowControl.iterativeStatements;

public class ForLoop
{

	public static void main(String[] args)
	{
		// 1. For loop is the most commonly used loop in java

		// 2. If we know number of iterations in advance, then for loop is the best choice.

		// Syntax
		for (int i = 0; i < 10; i++) // for(initialization section, conditional check, increment/decrement section)
		{
			System.out.println("Hello");
			// loop body
		}

		// Execution flow will be:
		// 1. initialization section
		// 2. conditional check
		// 3. loop body
		// 4. increment/decrement section
		// 5. conditional check
		// 6. loop body
		// 7. increment/decrement section and so on.

		// 3. Curly braces are optional and without curly braces we can take only one statement under for loop, which
		// should not be declarative statement.

		// Valid Example
		for (int i = 0; i < 10; i++)
			;

		// for (int i = 0; true; i++)
		// System.out.println("Hi");

		// Invalid Example
		// for (int i = 0; i < 10; i++)
		// int a = 20; declarative statement not allowed without curly braces.

		/** Initialization Section **/

		// 1. This part will be executed only once in loop life cycle.

		// 2. Here, we can declare and initialize local variables of for loop.

		// 3. Here, we can declare any number of variables but should be of the same type. Mistakenly if we're trying to
		// declare different data type variables then we'll get compile time error.

		// Examples
		// for (int i = 0, j = 0; true; i++); // valid

		// for (int i = 0, String j = "abc"; true; i++) // invalid

		// for (int i = 0, int j = 0; true; i++) // invalid

		// 4. In the Initialization Section, we can take any valid java statement including System.out.println

		// Example
		int i = 0;
		for (System.out.println("Initialization"); i < 3; i++)
		{
			System.out.println("body");
		}

		// Output:
		// Initialization
		// body
		// body
		// body

		/** Conditional Check **/

		// 1. Here, we can take any valid java expression but should be of type boolean.

		// 2. This part is optional and if we're not taking anything then compiler will always place true

		// Example
		// for(int j = 0;;j++) {}

		/** Increment/Decrement Section **/

		// 1. In this section, we can take any valid java statement including System.out.println

		// Example
		int k = 0;
		for (System.out.println("Initialization"); k < 3; System.out.println("increment"))
		{
			k++;
		}
		// Output:
		// Initialization
		// increment
		// increment
		// increment

		/** Infinite loop **/

		// All three parts of for loop are independent of each other and optional

		// Valid Examples
		// for (;;)
		// {
		// System.out.println("infinite");
		// }

		// for (;;);

		/** Unreachable Code Examples **/

		/* Valid Examples */

		// 1.
		// int a1 = 10, b1 = 20;
		// for (int p = 0; a1 < b1; p++)
		// {
		// System.out.println("hi");
		// }
		// System.out.println("hello");
		// Ouput: hi hi hi hi hi hi .......

		// 2.
		// int a1 = 10, b1 = 20;
		// for (int p = 0; a1 > b1; p++)
		// {
		// System.out.println("hi");
		// }
		// System.out.println("hello");
		// Ouput: hello

		/* Invalid Examples */

		// 1.
		// for (int p = 0; true; p++)
		// {
		// System.out.println("hi");
		// }
		// System.out.println("hello"); CE: unreachable statement

		// 2.
		// for (int p = 0; false; p++)
		// { CE: unreachable statement
		// System.out.println("hi");
		// }
		// System.out.println("hello");

		// 3.
		// for (int p = 0; ; p++)
		// {
		// System.out.println("hi");
		// }
		// System.out.println("hello"); CE: unreachable statement

		// 4.
		// final int a1 = 10, b1 = 20;
		// for (int p = 0; a1 < b1; p++)
		// {
		// System.out.println("hi");
		// }
		// System.out.println("hello"); CE: unreachable statement

		// 5.
		// final int a1 = 10, b1 = 20;
		// for (int p = 0; a1 > b1; p++)
		// { CE: unreachable statement
		// System.out.println("hi");
		// }
		// System.out.println("hello");
	}

}
