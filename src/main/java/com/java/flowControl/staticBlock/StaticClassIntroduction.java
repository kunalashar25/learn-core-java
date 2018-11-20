package com.java.flowControl.staticBlock;

// Whenever we're executing a java class the following sequence of steps will be executed as a part of static control flow
// 1. Identification of static members from top to bottom.
// 2. Execution of static variable assignments and static blocks from top to bottom.
// 3. Execution of main method.

// Refer StaticClassExecutionSequence.PNG

// Steps 1 to 6 from image falls under Step 1 from above sequence.
// Steps 7 to 12 from image falls under Step 2 from above sequence.
// Steps 13 to 15 from image falls under Step 3 from above sequence.

public class StaticClassIntroduction
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

/** Direct Read and Indirect Read **/
// 1. Inside a static block if we're trying to read a variable that read operation is called, Direct Read. If we're
// calling a method and within that method if we're trying to read a variable that read operation is called Indirect
// Read.

// 2. If a variable is just is just identified by JVM and original value is not yet assigned then the variable is said
// to be in [RIWO] Read Indirectly Write Only state.

// 3. If a variable is in [RIWO] state then we can't perform direct read but we can perform indirect read.

// 4. If we're trying to read directly then we'll get compile time error saying, illegal forward reference.