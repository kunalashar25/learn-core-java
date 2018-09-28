package com.java.main;

public class MainMethodFunctionality
{
	// Case 1: Overloading of the main() is possible but JVM will always call main(String[] args) only. Other overloaded
	// method we have to call explicitly like a normal method call.
	public static void main(String[] args)
	{
		System.out.println("String[]");
	}

	public static void main(int[] args) // Overloaded method
	{
		System.out.println("int[]");
	}
	// Case 1 Output: String[]
}

// Case 2: Inheritance concept applicable for main() hence, while executing child class, if a child doesn't contain
// main() then parent class main() will be executed.

// In one file only one class can be public
class child extends MainMethodFunctionality
{
	// 2 class files will be created. One for MainFunctionality.class and other for child.class
	// when we run child class, main() of parent class will be called
}

// Case 3: It seems overriding concept applicable for main() but it is not overriding but it is method hiding.
class secondChild extends MainMethodFunctionality
{
	public static void main(String[] args)
	{
		System.out.println("Second child"); // Output: Second child
	}
}

// Note: For main() inheritance and overloading concepts are applicable but overriding concept in not applicable.
// instead of overriding, method hiding is applicable.