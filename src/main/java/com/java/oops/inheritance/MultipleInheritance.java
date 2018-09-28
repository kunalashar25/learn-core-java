package com.java.oops.inheritance;

public class MultipleInheritance
{
	// 1. A java class can't extend more than once class at a time. Hence, java won't provide support for multiple
	// inheritance in classes.

	// Example
	/*
	 * class A extends B,C {
	 * 
	 * }
	 */

	class B
	{

	}

	class C
	{

	}

	// 2. If our class doesn't extend any other class then only our class is direct child class of Object class.
	// Example
	class D
	{

	}

	// 3. If our class extends any other class then our class is indirect child class of Object class. This is called
	// Multi-level Inheritance.
	// Example
	class E extends D
	{

	}

	// NOTE: Either directly or indirectly, Java won't provide support for multiple inheritance w.r.t classes.
}

/** Why Java won't provide support for Multiple Inheritance? **/
// There may be a chance of ambiguity problem. Hence, Java won't provide support for Multiple inheritance but interface
// can extend any number of interfaces simultaneously. Hence, java provides support for multiple inheritance w.r.t
// Interfaces.

// Example 1
/*
 * class Parent1 { void m1() { } }
 * 
 * class Parent2 { void m1() { } }
 * 
 * class Child extends Parent1,Parent2 { public static void main(String[] args) { Child c = new Child(); c.m1(); } }
 */

// Example 2
interface A
{
	void m1();
}

interface B
{
	void m1();
}

interface C extends A, B
{

}

/** Why ambiguity problem won't be there in interfaces? **/
// Even though multiple method declarations are available but implementation is unique and hence, there is no chance of
// ambiguity problem in interfaces.

// Example
class Child2 implements C
{
	public void m1()
	{

	}
}

// last time: 1:10:06