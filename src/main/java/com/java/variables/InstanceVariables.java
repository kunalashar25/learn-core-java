package com.java.variables;

public class InstanceVariables
{
	int		x	= 10;
	int		i;
	double	d;
	boolean	b;
	String	s;

	public static void main(String[] args)
	{
		// If the value of a variable is varied from object to object, such type of
		// variables are called instance variables.

		// For every object a separate copy of instance variables will be created.

		// Instance variable should be declared, within the class directly but outside
		// of any method/block/constructor

		// Instance variable will be created at time of object creation and destroyed at
		// time of object destruction. Hence, the scope of instance variable is same as
		// the scope of object.

		// Instance variable will be stored in the heap memory as part of object.

		// we can't access instance variable directly from static area but we can access
		// by using object reference.

		// main is a static method and static method is not related to the object and
		// instance variable is related to a object. Hence we cannot access instance
		// variable without object reference.

		// System.out.println(x); CE: Cannot make a static reference to the non-static
		// field x

		InstanceVariables inst = new InstanceVariables();
		System.out.println("From main: " + inst.x);

		// We can access instance variable directly from instance area i.e. class
		// non-static methods.
		inst.instanceAreaMethod();

		// For instance variables, JVM will always provide default values and we're not
		// required to perform initialization explicitly.
		System.out.println(inst.i); // Output: 0
		System.out.println(inst.d); // Output: 0.0
		System.out.println(inst.b); // Output: false
		System.out.println(inst.s); // Output: null

		// Instance variables also known as object level variables or attributes.

	}

	public void instanceAreaMethod()
	{
		System.out.println("From Instance Area: " + x);
	}

}
