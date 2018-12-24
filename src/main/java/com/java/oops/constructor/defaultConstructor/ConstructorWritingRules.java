package com.java.oops.constructor.defaultConstructor;

public class ConstructorWritingRules
{
	// 1. Name of the class and name of constructor must be same.

	// 2. Return type concept not applicable for constructor, even void is not allowed.

	// 3. If we're trying to declare return type for a constructor then we won't get any compile time error because
	// compiler treats it as a method. Hence, it is valid to have a method name same as class name but it is not
	// a correct java practice. See below Example:

	public void ConstructorWritingRules() // method and not a constructor
	{
		System.out.println(10);
	}

	public static void main(String[] args)
	{
		ConstructorWritingRules c = new ConstructorWritingRules();
		c.ConstructorWritingRules();
	}

	// 4. The only applicable modifiers for constructors are public, private, protected and default. If we're trying to
	// use any other modifier then we'll get compile time error.
}
