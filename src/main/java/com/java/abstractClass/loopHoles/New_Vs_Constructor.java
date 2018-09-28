package com.java.abstractClass.loopHoles;

public class New_Vs_Constructor
{

	String	name;
	int		rollNo;

	public New_Vs_Constructor(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args)
	{
		New_Vs_Constructor a = new New_Vs_Constructor("Java", 10);

	}

}

// The main objective of new operator is to create an object. Blank Object will be created will all default values
// provided by JVM.

// The main purpose of constructor is to initialize that object. Post object creation, values will be assigned to the
// object by constructor.

// First object will be created by using new operator and then initialization will be performed by constructor.
