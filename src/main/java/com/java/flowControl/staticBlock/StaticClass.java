package com.java.flowControl.staticBlock;

// Whenever we're executing a java class the following sequence of steps will be executed as a part of static control flow
// 1. Identification of static members from top to bottom.
// 2. Execution of static variable assignments and static blocks from top to bottom.
// 3. Execution of main method.

// Refer StaticClassExecutionSequence.PNG

// Steps 1 to 6 from image falls under Step 1 from above sequence.
// Steps 7 to 12 from image falls under Step 2 from above sequence.
// Steps 13 to 15 from image falls under Step 3 from above sequence.

public class StaticClass
{
	static int i = 10;

	static
	{
		m1();
		System.out.println("First Static Block");
	}

	public static void main(String[] args)
	{
		m1();
		System.out.println("Main Method");
	}

	public static void m1()
	{
		System.out.println(j);
	}

	static
	{
		System.out.println("Second Static Block");
	}

	static int j = 20;

}

// Output:
// 0
// First Static Block
// Second Static Block
// 20
// Main Method
