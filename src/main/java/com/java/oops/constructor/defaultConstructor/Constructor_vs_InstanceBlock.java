package com.java.oops.constructor.defaultConstructor;

public class Constructor_vs_InstanceBlock
{
	// 1. The main purpose of constructor is to perform initialization of an object but other than initialization if we
	// want to perform any activity for every object creation then we should go for instance block (like updating entry
	// in database for every object creation or incrementing counter for every object creation, etc).

	// 2. Both constructor and instance block have their own different purposes and replacing one concept with another
	// concept may not work always.

	// 3. Both constructor and instance block will be executed for every object creation but execution will start from
	// instance block first and followed by constructor.

	// Demo program to print number of objects created for a class:

	static int count = 0;

	{
		count++;
	}

	public Constructor_vs_InstanceBlock()
	{
		System.out.println("Default Constructor");
	}

	public Constructor_vs_InstanceBlock(int i)
	{
		System.out.println("Integer Constructor");
	}

	public Constructor_vs_InstanceBlock(double d)
	{
		System.out.println("Double Constructor");
	}

	public static void main(String[] args)
	{
		Constructor_vs_InstanceBlock c1 = new Constructor_vs_InstanceBlock();
		Constructor_vs_InstanceBlock c2 = new Constructor_vs_InstanceBlock(10);
		Constructor_vs_InstanceBlock c3 = new Constructor_vs_InstanceBlock(10.5);

		System.out.println("Number of objects created: " + count);
	}
}

// Output:
// Default Constructor
// Integer Constructor
// Double Constructor
// Number of objects created: 3
