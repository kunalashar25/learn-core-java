package com.java.oops.overloading;

public class Overloading
{
	// 1. Two methods are said to be overloaded if and only if both methods have same name but different argument types.

	// 2. In C, method overloading concept is not available. Hence, we can't declare multiple methods with same name but
	// different args types. If there is change in argument type compulsory we should go for new method name which
	// increases complexity of programming.

	// 3. In Java, we can declare multiple methods with same name but different arguments types, such types of methods
	// are called overloaded methods.

	// 4. Having overloading concept in java reduces complexity of programming.

	public void m1()
	{
		System.out.println("no-args");
	}

	public void m1(int a)
	{
		System.out.println("int-args");
	}

	public void m1(float a)
	{
		System.out.println("float-args");
	}

	public static void main(String[] args)
	{
		Overloading o = new Overloading();
		o.m1(); // Output: no-args
		o.m1(1); // Output: int-args
		o.m1(1f); // Output: float-args
	}

	// 5. In Overloading, method resolution (which method to be called) is always taken cared by compiler based on
	// reference type. Hence, overloading is also considered as compile time polymorphism or static polymorphism or
	// early binding.

}
