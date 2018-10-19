package com.java.oops.overloading;

public class MethodSignature
{

	// 1. In Java, method signature consist of method name followed by argument types.

	// Example
	public static int method1(int i, float f)
	{
		// Method Signature: method1(int i, float f)
		return 0;
	}

	// 2. Return type is not part of method signature in Java.

	// 3. Compiler will use method signature to resolve method calls. If incorrect method is called then compiler will
	// throw compile time error.

	// 4. Within a class, two methods with same signature are not allowed.

	public void m1(int i)
	{

	}

	/*
	 * public int m1(int x) { return 0; }
	 */

	// CE: method m1(int) is already defined in MethodSignature
}
