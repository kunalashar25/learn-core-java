package com.java.accessModifiers.staticPack;

public class StaticMethod1
{
	// Case 1: Overloading concept applicable for static methods including main method but JVM can always call String[]
	// argument main method only. Other overloaded method we have to call just like a normal method call.

	public static void main(String[] args)
	{
		System.out.println("String[]");
	}

	public static void main(int[] args)
	{
		System.out.println("int[]");
	}

	// Output: String[]

}
