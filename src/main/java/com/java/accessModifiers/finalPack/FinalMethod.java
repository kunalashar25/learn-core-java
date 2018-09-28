package com.java.accessModifiers.finalPack;

class FinalMethod
{
	// final is a modifier applicable for classes, methods and variables

	/** final method **/

	// Parent class methods are by default available to the child through inheritance. If the child not satisfied with
	// parent method implementation then child is allowed to redefine that method based on its requirement. This process
	// is called overriding.

	// If parent class method is declared as final then we can't override that method in child class because its
	// implementation is final.

	public void method1()
	{
		System.out.println("This is method1 from accessModifiers.finalPack");
	}

	public final void method2()
	{
		System.out.println("This is method2 from accessModifiers.finalPack");
	}

}
