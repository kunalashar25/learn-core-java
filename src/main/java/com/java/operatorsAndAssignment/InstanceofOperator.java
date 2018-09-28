package com.java.operatorsAndAssignment;

import java.util.ArrayList;
import java.util.List;

public class InstanceofOperator
{

	public static void main(String[] args)
	{
		/** We can use instanceof operator to check whether the given object is of particular type or not **/

		// Example
		List<Object> l = new ArrayList<Object>();
		ArithmeticOperators a = new ArithmeticOperators();
		EqualityOperators e = new EqualityOperators();

		// adding objects to list
		l.add(e);
		l.add(a);

		Object o = l.get(0);

		if (o instanceof ArithmeticOperators)
		{
			ArithmeticOperators ao = (ArithmeticOperators) o;
			// to perform ArithmeticOperators functionality
		}
		else if (o instanceof EqualityOperators)
		{
			EqualityOperators eo = (EqualityOperators) o;
			// to perform EqualityOperators functionality
		}

		/** r instanceof x, in this syntax, r is object reference and x can be either class or interface name **/

		// Example
		Thread t = new Thread();
		System.out.println(t instanceof Thread); // Output: true
		System.out.println(t instanceof Object); // Output: true
		System.out.println(t instanceof Runnable); // Output: true

		/**
		 * To use, instanceof operator compulsory there should be some relation between argument types(either
		 * child-parent or parent-child or same type) otherwise we'll get compile time error saying, Inconvertible
		 * types.
		 **/

		// Example
		// System.out.println(t instanceof String); CE: Inconvertible types. Found: java.lang.Thread Required:
		// java.lang.String

		/** For class/interface x, null instanceof x is always false **/

		// Example
		System.out.println(null instanceof Thread); // Output: false
		System.out.println(null instanceof Runnable); // Output: false
	}

}
