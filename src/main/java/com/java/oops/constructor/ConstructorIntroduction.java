package com.java.oops.constructor;

public class ConstructorIntroduction
{
	// 1. Once we create an object, compulsory we should perform initialization then only the object is in a position to
	// respond properly.

	// 2. Whenever we're creating an object some piece of code will be executed automatically to perform initialization
	// of the object. This piece of code is nothing but constructor. Hence, the main purpose of constructor is to
	// perform initialization of an object.

	String	name;
	int		rollNo;

	public ConstructorIntroduction(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args)
	{
		ConstructorIntroduction c1 = new ConstructorIntroduction("Name1", 1);
		ConstructorIntroduction c2 = new ConstructorIntroduction("Name2", 2);

		System.out.println(c1.name + " " + c1.rollNo);
		System.out.println(c2.name + " " + c2.rollNo);
	}
}

// Output:
// Name1 1
// Name2 2

// Note: The main purpose of constructor is to perform initialization of an object but not to create object.
