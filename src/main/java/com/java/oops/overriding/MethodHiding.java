package com.java.oops.overriding;

public class MethodHiding
{
	// 1. All rules of method hiding are exactly same as overriding except the few differences.
	// Refer: MethodHiding_vs_MehtodOverriding.PNG

	// 2. If both parent and child class methods are non-static then it'll become overriding. In this case, output will
	// be:
	// parent
	// child
	// child

	public static void main(String[] args)
	{
		P4 p = new P4();
		p.m1(); // Output: Parent

		C4 c = new C4();
		c.m1(); // Output: Child

		P4 p1 = new C4();
		p1.m1(); // Output: Parent
	}
}

class P4
{
	public static void m1()
	{
		System.out.println("Parent");
	}
}

class C4 extends P4
{
	public static void m1()
	{
		System.out.println("Child");
	}
}