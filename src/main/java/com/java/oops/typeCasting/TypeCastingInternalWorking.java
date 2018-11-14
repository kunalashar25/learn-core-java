package com.java.oops.typeCasting;

public class TypeCastingInternalWorking
{
	// Through type casting we're not creating any new object. For the existing object we're providing another type of
	// reference variable i.e. we're performing type casting but not object casting.

	// Refer TypeCastingInternalWorking.PNG

	// Note: see below class hierarchy
	// A <--B <-- C

	// C c = new C();
	// B b = new C(); >> Equivalent to (B)c;
	// A a = new C(); >> Equivalent to (A)((B)c);

	public static void main(String[] args)
	{

		/** Example 1: Consider below Parent child class **/
		Child c = new Child();
		c.m1();
		c.m2();
		((Parent) c).m1(); // Equivalent to Parent p = new Child();
		((Parent) c).m2();

		// Conclusion: Parent reference can be used to hold child object but by using that reference we can't call child
		// specific methods and we can call only the methods available in parent class.

		/** Example 2: Consider A,B and C classes for method m1() **/
		C c1 = new C();
		c1.m1(); // Output: C
		((B) c1).m1(); // Output: C
		((A) ((B) c1)).m1(); // Output: C

		// Conclusion: It is overriding and method resolution is always based on runtime object. In this case, runtime
		// object is C. Hence, all m1() methods will be called from class C

		/** Example 3: Consider A,B and C classes for static method m2() **/
		C c2 = new C();
		c2.m2(); // Output: C
		((B) c2).m2(); // Output: B
		((A) ((B) c2)).m2(); // Output: A

		// Conclusion: It is method hiding and method resolution is always based on reference type.

		/** Example 4: Consider A,B and C classes for variable x **/
		C c3 = new C();
		System.out.println(c3.x); // Output: 999
		System.out.println(((B) c3).x); // Output: 888
		System.out.println(((A) ((B) c3)).x); // Output: 777

		// Conclusion: Variable resolution is always based on reference type but not based on runtime object.

	}
}

class Parent
{
	public void m1()
	{

	}
}

class Child extends Parent
{
	public void m2()
	{

	}
}

class A
{
	int x = 777;

	public void m1()
	{
		System.out.println("A");
	}

	public static void m2()
	{
		System.out.println("A");
	}
}

class B extends A
{
	int x = 888;

	public void m1()
	{
		System.out.println("B");
	}

	public static void m2()
	{
		System.out.println("B");
	}
}

class C extends B
{
	int x = 999;

	public void m1()
	{
		System.out.println("C");
	}

	public static void m2()
	{
		System.out.println("C");
	}
}