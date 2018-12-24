package com.java.oops.constructor.overloadedConstructor;

public class OverloadedConstructorIntroduction
{
	// 1. Within a class we can declare multiple constructors and all these constructors having same name but different
	// argument types. Hence, all these constructors are considered as overloaded constructors.

	// 2. Overloading concept applicable for constructors.

	// 3. For constructor, inheritance and overriding concepts are not applicable but overloading concept is applicable.

	// 4. Every class in java including abstract class can contain constructor but interface cannot contain constructor.

	// NOTE: Constructor is required to perform initialization i.e. initialization of the instance variable. Hence, it
	// is required in every class but all variable present inside interface are static variables. Hence there is no need
	// of constructor in interface.

	public OverloadedConstructorIntroduction()
	{
		this(10);
		System.out.println("no-arg");
	}

	public OverloadedConstructorIntroduction(int i)
	{
		this(10.5);
		System.out.println("int-arg");
	}

	public OverloadedConstructorIntroduction(double d)
	{
		System.out.println("double-arg");
	}

	public static void main(String[] args)
	{
		OverloadedConstructorIntroduction o1 = new OverloadedConstructorIntroduction();
		// Output:
		// double-arg
		// int-arg
		// no-arg

		OverloadedConstructorIntroduction o2 = new OverloadedConstructorIntroduction(10);
		// Output:
		// double-arg
		// int-arg

		OverloadedConstructorIntroduction o3 = new OverloadedConstructorIntroduction(10.5);
		// Output:
		// double-arg

		OverloadedConstructorIntroduction o4 = new OverloadedConstructorIntroduction(10l);
		// Refer Literals.PNG for this example:

		// Output:
		// double-arg
	}
}
