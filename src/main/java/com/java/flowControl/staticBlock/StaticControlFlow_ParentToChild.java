package com.java.flowControl.staticBlock;

public class StaticControlFlow_ParentToChild
{
	// Whenever we're executing child class the following sequence of events will be executed automatically as a part of
	// static control flow.

	// 1. Identification of static members from parent to child.
	// 2. Execution of static variable assignments and static blocks from parent to child.
	// 3. Execution of only child class main method.

	// Refer StaticClassExecutionSequence_ParentToChild.PNG (steps as per Derived class main() method execution).

	// Steps 1 to 11 from image falls under Step 1 from above sequence.
	// Steps 12 to 22 from image falls under Step 2 from above sequence.
	// Steps 23 to 25 from image falls under Step 3 from above sequence.

	static int i = 10;

	static
	{
		m1();
		System.out.println("Base Static Block");
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

	static int j = 20;
}

class Derived extends StaticControlFlow_ParentToChild
{
	static int x = 100;

	static
	{
		m2();
		System.out.println("Derived First Static Block");
	}

	public static void main(String[] args)
	{
		m2();
		System.out.println("Derived Main");
	}

	public static void m2()
	{
		System.out.println(y);
	}

	static
	{
		System.out.println("Derived Second Static Block");
	}

	static int y = 200;

	/** Output when executed Derived class main(): **/
	// 0
	// Base Static Block
	// 0
	// Derived First Static Block
	// Derived Second Static Block
	// 200
	// Derived Main

	/** Output when executed StaticControlFlow_ParentToChild class main(): **/
	// 0
	// Base Static Block
	// 20
	// Main Method

	// NOTE: Whenever we're loading child class automatically parent class will be loaded but whenever we're loading
	// parent class, child class won't be loaded (because parent class members by default available to the child class
	// whereas child class members by default won't be available to the parent).
}
