package com.java.flowControl.selectionStatements;

public class SwitchCase
{

	public static void main(String[] args)
	{
		// If several options are available then it is not recommended to use nested if-else because it reduces
		// readability of code. To handle this requirement we should go for switch statements.

		int x = 2;

		// Syntax:
		switch (x)
		{
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("default");
		}

		/** Conclusions **/

		// 1. The allowed arguments types for the switch statement are:
		// byte, short, char, int until v1.4 but from v1.5 corresponding wrapper classes and enum type also allowed.
		// from v1.7 onwards, String type also allowed.

		// 2. Curly braces are mandatory for switch. Except switch, every where curly braces are optional.

		// 3. Both case and default are optional i.e. empty switch statement is a valid java syntax.
		// Example
		switch (x)
		{

		}

		// 4. Inside switch, every statement should be under some case or default i.e. independent statements are not
		// allowed inside switch otherwise we'll get compile time error.

		// Example
		switch (x)
		{
			// System.out.println("default"); CE: case, default or } expected
		}

		// 5. Every case label should be compile time constant i.e. constant expression.
		final int y = 20;
		switch (x)
		{
			case 10:
				// case y; CE: constant expression required will be displayed if y is not declared as final.

			case y: // No error as y is declared as final, and final variables are always constant.
		}

		// 6. Both switch argument and case label can be expressions but case label should be constant expression.
		switch (x + 1)
		{
			case 10:
				System.out.println("10");

			case 10 + 20 + 30:
				System.out.println("10+20+30");
		}

		// 7. Every case label should be in the range of switch argument type otherwise we'll get compile time error
		byte b = 10;
		switch (b)
		{
			case 10:
			case 100:
				// case 1000: CE: possible loss of precision. Found int Required byte
		}

		switch (b + 1)
		{
			case 10:
			case 100:
			case 1000:
		}

		// 8. Duplicate case labels are not allowed in switch otherwise we'll get compile time error.
		switch (x)
		{
			case 97:
			case 98:
			case 99:
				// case 'a': CE: duplicate case label 'a' as value of 'a' is 97
		}

		// Case label summary:
		// should be a constant expression
		// value should be in the range of switch argument type.
		// duplicate case label are not allowed.

		// 9. Fall-through inside switch: Within the switch if any case is matched, from that case onwards all
		// statements will be executed until break or end of switch
		switch (x)
		{
			case 0:
				System.out.println(0);
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
			default:
				System.out.println("def");
		}
		// Output when x = 0 is 0 and 1
		// Output when x = 1 is 1
		// Output when x = 2 is 2 and def
		// Output when x = 3 is def

		// The main advantage of Fall-through inside switch is we can define common action for multiple cases (Code
		// reusability).
		switch (x)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("Q1");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Q2");
				break;
		}

		// 10. default case conclusions:
		// Within switch we can take default case at-most once.
		// default case will be executed if and only if no case is matched.
		// Within switch we can write default case anywhere but it is recommended to write as last case.
		switch (x)
		{
			default:
				System.out.println("def");
			case 0:
				System.out.println(0);
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
		}
		// Output when x = 0 is 0
		// Output when x = 1 is 1 and 2
		// Output when x = 2 is 2
		// Output when x = 3 is def and 0

	}

}
