package com.java.flowControl.staticAndInstanceControlFlow;

public class StaticAndInstanceControlFlow
{
	{
		System.out.println("First Instance Block");
	}

	static
	{
		System.out.println("First Static Block");
	}

	public StaticAndInstanceControlFlow()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args)
	{
		StaticAndInstanceControlFlow s1 = new StaticAndInstanceControlFlow();
		System.out.println("Main");

		StaticAndInstanceControlFlow s2 = new StaticAndInstanceControlFlow();
	}

	static
	{
		System.out.println("Second Static Block");
	}

	{
		System.out.println("Second Instance Block");
	}

}

// Output:
// First Static Block
// Second Static Block
// First Instance Block
// Second Instance Block
// Constructor
// Main
// First Instance Block
// Second Instance Block
// Constructor

// Note: Static control flow is one time activity. Instance control flow will be executed for every object creation.
