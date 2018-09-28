package com.java.operatorsAndAssignment;

public class ConditionalOperator
{
	// Symbol ? :
	public static void main(String[] args)
	{
		// The only possible ternary operator in java is Conditional Operator.

		// Example:
		int a = (10 > 20) ? 30 : 40;
		System.out.println(a); // Output: 40

		// We can perform nesting of Conditional Operator also.
		int x = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
		System.out.println(x); // Output: 70
	}

}
