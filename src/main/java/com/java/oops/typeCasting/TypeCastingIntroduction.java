package com.java.oops.typeCasting;

public class TypeCastingIntroduction
{
	// 1. We can use parent reference to hold child objects.

	// Example
	Object			o	= new String("typeCase");

	// 2. We can use interface reference to hold implemented class object.

	// Example
	Runnable		r	= new Thread();

	/** Syntax of Type Casting **/
	// A b = (C) d;

	// A > class or interface name.
	// b > name of reference variable.
	// C > class or interface name.
	// d > reference variable name.

	/** Compile time checking on above statement **/
	// 1. The type of 'd' and 'C' must have some relation. Either child to parent or parent to child or same type
	// otherwise we'll get compile time error saying: Inconvertible types Found: d type Required: C

	// Example 1
	StringBuffer	sb	= (StringBuffer) o;

	// Example 2
	String			s	= new String("typeCase");
	StringBuffer	sb1	= (StringBuffer) s;
	// CE: Inconvertible types Found: java.lang.String type Required:java.lang.StringBuffer

	// 2. 'C' must be either same or derived type of 'A' otherwise we'll get compile time error saying:
	// CE: Incompatible types Found: C Required: A

	// Example 1
	StringBuffer	sb2	= (StringBuffer) o;

	// Example 2
	StringBuffer	sb3	= (String) o;
	// CE: Incompatible types Found: java.lang.String type Required:java.lang.StringBuffer

	/** Run-time checking on above statement **/
	// 3. Runtime object type of 'd' must be either same or derived type of 'C' otherwise we'll get runtime exception
	// saying ClassCastException

	// Example 1
	Object			o1	= new String("Hello");
	StringBuffer	sb4	= (StringBuffer) o1;

	// RE: Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to
	// java.lang.StringBuffer

	// Example 2 (Valid Example)
	Object			o2	= new String("Hello");
	Object			o3	= (String) o2;

	// Compiler checks:
	// 1. o2 and (String) has a relation
	// 2. (String) is a child class of Object

	// Runtime checks:
	// 3. Runtime object type of o2 is String and is same as its derived type or has to be a child.
	
	// Refer TypeCastingExamples.PNG for more examples

}
