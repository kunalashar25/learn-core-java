package com.java.oops.encapsulation;

public class TightlyEncapsulatedClass
{
	// 1. A class is said to be tightly encapsulated if and only if each and every variable declared as private, whether
	// class contains corresponding getter and setter methods or not and whether these methods are declared as public or
	// not, these things we're not required to check.

	// Example
	private double balance;

	public double getBalance()
	{
		return balance;
	}

	// Q. Which of the following classes are tightly encapsulated?

	class A // TightlyEncapsulatedClass
	{
		private int a = 10;
	}

	class B extends A // Not TightlyEncapsulatedClass
	{
		int b = 20;
	}

	class C extends A // TightlyEncapsulatedClass
	{
		private int c = 30;
	}

	// Example 2:

	class D // Not TightlyEncapsulatedClass
	{
		int x = 10;
	}

	class E extends D // Not TightlyEncapsulatedClass
	{
		private int y = 20;
	}

	class F extends E // Not TightlyEncapsulatedClass
	{
		private int z = 30;
	}

	// Note: If the parent class is not tightly encapsulated then no child class is tightly encapsulated.
}
