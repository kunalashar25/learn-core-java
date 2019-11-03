package com.java.accessModifiers.finalPack.finalVariables;

public class FinalInstanceVariables {
	// 1. If value of a variable is varied from object to object then such type of variables are called instance
	// variables.

	// 2. For every object, a separate copy of instance variables will be created.

	// 3. For instance variables, we're not required to perform initialization explicitly. JVM will always provide
	// default values.

	int x;

	public static void main(String[] args) {
		FinalInstanceVariables fiv = new FinalInstanceVariables();
		System.out.println(fiv.x); // Output: 0
	}

	// 4. if the instance variable is declared as final then compulsory we have to perform initialization explicitly
	// Whether we're using it or not and JVM won't provide default values.

	// final int y; CE: variable y might not have been initialized

	/**
	 * Rule for initializing final instance variable
	 **/

	// For final instance variables, compulsory we should perform initialization before constructor completion i.e. the
	// following are various places for initialization:

	// 1. At the time of declaration
	final int a = 10;

	// 2. Inside instance block
	final int b;

	{
		b = 20;
	}

	// 3. Inside constructor
	final int c;

	public FinalInstanceVariables() {
		c = 30;
	}

	// These are the only possible places to perform initialization for final instance variables. if we're trying to
	// perform initialization anywhere else then we'll get compile time error.

	/*
	 * final int d;
	 *
	 * public void d() { d=40; CE: cannot assign a value to final variable d. }
	 */

}
