package com.java.interfaces;

public interface InterfaceVariables
{
	// 1. An interface can contain variables. The main purpose of interface variables is to define requirement level
	// constants.

	// 2. Every interface variable is always public static final whether we're declaring or not.

	int x = 10;

	// public: To make this variable available to every implementation class.

	// static: without existing object, implementation class can access this variable.

	// final: if one implementation class changes value then remaining implementation class will be effected. To
	// restrict this, every interface variable is always final.

	// Hence, within the interface the following variable declarations are equal:
	// int x = 10;
	// public int x = 10;
	// static int x = 10;
	// final int x = 10;
	// public static int x = 10;
	// public final int x = 10;
	// static final int x = 10;
	// public static final int x = 10;

	// 3. As every interface variable is always public static final, we can't declare with the following modifiers:
	// private
	// protected
	// transient
	// volatile

	// 4. For interface variables, compulsory we should perform initialization at the time of declaration otherwise
	// we'll get compile time error saying, '= expected'.

	/** Which of the following variable declarations are valid? **/

	// 1. int a; >> Invalid
	// 2. private int a = 10; >> Invalid
	// 3. protected int a = 10; >> Invalid
	// 4. volatile int a = 10; >> Invalid
	// 5. transient int a = 10; >> Invalid
	// 6. public static int a = 10; >> Valid

	// 5. Inside implementation class, we can access interface variables but we can't modify values.
	// see below example
}

class child1 implements InterfaceVariables
{
	public static void main(String[] args)
	{
		// x = 333; CE: cannot assign a value to final variable x
		System.out.println(x); // Output: 10
	}
}

class child2 implements InterfaceVariables
{
	public static void main(String[] args)
	{
		int x = 333;
		System.out.println(x); // Output: 333 as x is local variable of main method.
	}
}
