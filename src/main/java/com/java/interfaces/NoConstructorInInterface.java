package com.java.interfaces;

public interface NoConstructorInInterface
{

	// Q. We can't create object for Abstract class and Interface but abstract class can contain constructor but
	// interface doesn't, WHY?

	// Ans. The main purpose of constructor is to perform initialization of an object i.e. to perform initialization for
	// instance variables. Abstract class can contain, instance variables which are required for child class object. To
	// perform initialization for these instance variables, constructor concept is required in abstract class.

	// Every variable present in interface is always public static final whether we're declaring or not. Hence, there is
	// no way to declare instance variables in interface. Because of this constructor concept is not required for
	// interfaces.
}
