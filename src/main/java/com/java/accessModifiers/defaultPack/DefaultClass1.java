package com.java.accessModifiers.defaultPack;

class DefaultClass1
{
	// If a class is declared as default then, we can access that class only wiht-in the current package i.e. from
	// outside package we can't access this class.

	// Hence, default access is also known as package level access.

	public void method1()
	{
		System.out.println("This is method1 from accessModifiers.defaultPack.DefaultClass1.java");
	}

}
