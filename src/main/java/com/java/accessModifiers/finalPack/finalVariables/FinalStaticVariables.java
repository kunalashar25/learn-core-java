package com.java.accessModifiers.finalPack.finalVariables;

public class FinalStaticVariables
{
	// 1. If the value of a variable is not varied from object to object then such types of variables are not
	// recommended to declare as instance variables. We have to declare those variables at class level by using static
	// modifier.

	// 2. In the case of instance variables, for every object a separate copy will be created but in the case of static
	// variables, a single copy will be created at class level and shared by every object of that class.

	// 3. For static variables, it is not required to perform initialization explicitly. JVM will always provide default
	// values.

	static int x;

	public static void main(String[] args)
	{
		System.out.println(x); // Output: 0
	}

	// 4. if the static variable is declared as final then compulsory we have to perform initialization explicitly
	// otherwise we'll get compile time error and JVM won't provide default values.

	// final static int y; CE: variable y might not have been initialized

	/** Rule for initializing final static variable **/
	// For final static variables, compulsory we should perform initialization before class loading completion i.e. the
	// following are various places for initialization:

	// 1. At the time of declaration
	final static int	a	= 10;

	// 2. Inside static block
	final static int	b;

	static
	{
		b = 20;
	}

	// These are the only possible places to perform initialization for final static variables. if we're trying to
	// perform initialization anywhere else then we'll get compile time error.

	/*
	 * final static int c;
	 * 
	 * public static void c() { c=30; CE: cannot assign a value to final variable c. }
	 */

}
