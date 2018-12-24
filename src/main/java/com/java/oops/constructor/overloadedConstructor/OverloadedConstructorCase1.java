package com.java.oops.constructor.overloadedConstructor;

public class OverloadedConstructorCase1
{
	// 1. Recursive method call is a runtime exception saying StackOverflowError.

	// 2. In our program, if there is a chance of recursive constructor invocation then the code won't compile and we'll
	// get compile time error.

	public OverloadedConstructorCase1()
	{
		this(10);
	}

	public OverloadedConstructorCase1(int i)
	{
		this();
	}

	public static void main(String[] args)
	{
		System.out.println("hello");
	}
	// Output:
	// CE: Recursive Constructor Invocation
}

// Example for recursive method invocation:
class Test
{
	public static void m1()
	{
		m2();
	}

	public static void m2()
	{
		m1();
	}

	public static void main(String[] args)
	{
		m1();
		System.out.println("hello");
	}
	// Output:
	// RE: Exception in thread "main" java.lang.StackOverflowError
}
